package com.example.demo.controller;

import com.example.demo.common.CommonWebServiceException;
import com.example.demo.constant.HttpSourceEnum;
import com.example.demo.constant.HttpStatusEnum;
import com.example.demo.entity.*;
import com.example.demo.model.*;
import com.example.demo.service.*;
import org.apache.http.conn.ConnectTimeoutException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;



@Transactional(rollbackFor = Exception.class)
@RestController
public class AncillaryBookingController {

    @Resource
    BookingService bookingService;

    @Resource
    PassengerService passengerService;

    @Resource
    SegmentService segmentService;

    @Resource
    ServiceLineService serviceLineService;

    @Resource
    TicketService ticketService;


//    @RequestMapping(value = "/getAllBookings", method = RequestMethod.GET)
//    public List<Booking> getAllBookings() {
//        List<Booking> list = bookingService.getAllBookings();
//        return list;
//    }


    //if fails to connect to the DB or time-out
    // By bookingRef find All difference bookingId to get (AncillaryBookingVo) passengerList and segmentList and AncillaryProducts
    @Transactional(timeout = 6)
    @RequestMapping(value = "/getAllBookings", method = RequestMethod.GET)
    public AncillaryBookingVo getAncillaryBookingVo(@RequestParam("bookingRef") String bookingRef) throws ConnectTimeoutException, CommonWebServiceException {

        // check if bookingRef missing  return AESSS_ERR_E003

        if (bookingRef == null){
            throw new CommonWebServiceException(HttpStatusEnum.RLOC_MISSING, HttpSourceEnum.SOURCE.toString());
        }

        // check if productType = seat or lounge  return AESSS_ERR_E003


        //get bookingIdList
        List<Booking> bookingList = bookingService.findBookingByBookingRef(bookingRef);

        //check if this rloc exists in the db  bookingRef 是否存在
        if (bookingList == null){

                throw new CommonWebServiceException(HttpStatusEnum.RLOC_NOT_EXIST, HttpSourceEnum.SOURCE.toString());
        }

        // get the bookingId from booking table use rloc as key ,if more than 1 records returned

        if (bookingList.size() > 1){

                throw new CommonWebServiceException(HttpStatusEnum.MORE_THAN_1_RECORDS,HttpSourceEnum.SOURCE.toString());

        }

        // init AncillaryProductsList
        List<AncillaryProducts> ancillaryProductsList =new ArrayList<>();

            //get passengerRefList by bookingIdList
            List<ServiceLine> serviceLineList = serviceLineService.findServiceByBookingId(bookingList.get(0).getBookingId());

//            List<Integer> passengerRefList = new ArrayList<>();
            for (ServiceLine serviceLine : serviceLineList) {
                //Find all  passengerRef from serviceLine by difference bookingId

                // get PassengerInfo to show
                Passenger passengerInfo = passengerService.findPassengerInfoByPassengerRef(serviceLine.getBookingId(), serviceLine.getPassengerRef());
                PassengerInfo passengerInfol = new PassengerInfo();
                passengerInfol.setFamilyName(passengerInfo.getFamilyName());
                passengerInfol.setGivenName(passengerInfo.getGivenName());

                // get SegmentInfo to show
                Segment segmentInfo = segmentService.findSegmentByBookingIdAndSegmentRef(serviceLine.getBookingId(),serviceLine.getSegmentRef());
                // first Date format to String
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String formattime = dateFormat.format(segmentInfo.getDepartureDate());

                SegmentInfo segmentInfo1 = new SegmentInfo();
                segmentInfo1.setOrigin(segmentInfo.getOrigin());
                segmentInfo1.setDestination(segmentInfo.getDestination());
                segmentInfo1.setDepartureDate(formattime);
                segmentInfo1.setFlightNumber(segmentInfo.getFlight());

                // get List<EmdInfoVo> to show
                List<Ticket> emdInfoVoList = ticketService.findAirlineCodeAndDocumentNumberBySsrRefAndTicketStatus(serviceLine.getSsrRef(), "T",serviceLine.getBookingId());
                List<EmdInfoVo>  emdInfoVos = new ArrayList<>();
                //foreach emdInfoVoList
                for(Ticket ticket :emdInfoVoList){
                    EmdInfoVo emdInfoVo = new EmdInfoVo();
                    emdInfoVo.setEmdAirlineCode(ticket.getAirlineCode());
                    emdInfoVo.setEmdNumber(ticket.getDocumentNumber());
                    emdInfoVos.add(emdInfoVo);
                }
                // init AncillaryProducts and add all ancillaryInfo into AncillaryProducts;
                AncillaryProducts ancillaryProducts =new AncillaryProducts();
                ancillaryProducts.setPassengerInfo(passengerInfol);
                ancillaryProducts.setSegmentInfo(segmentInfo1);
                ancillaryProducts.setEmdInfo(emdInfoVos);
                ancillaryProductsList.add(ancillaryProducts);
            }
//        }

        // get PassengerVos  to show
        List<Passenger> passengerList = passengerService.findPassengerByBookingId( bookingList.get(0).getBookingId()); // the list is bookingIdList
        List<PassengerVo> passengerVos =new ArrayList<>();
        for (Passenger passenger :passengerList){
            PassengerVo passengerVo = new PassengerVo();
            passengerVo.setFamilyName(passenger.getFamilyName());
            passengerVo.setGivenName(passenger.getGivenName());
            passengerVos.add(passengerVo);
        }
        // get SegmentVos  to show
        List<Segment> segmentList = segmentService.findByBookingId(bookingList.get(0).getBookingId()); // the list is bookingIdList
        List<SegmentVo> segmentVos =new ArrayList<>();

        for (Segment segment :segmentList){
            // first Date format to String ,then String format to Date
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String segmenttime = dateFormat.format(segment.getDepartureDate());

            SegmentVo segmentVo = new SegmentVo();
            segmentVo.setOrigin(segment.getOrigin());
            segmentVo.setDestination(segment.getDestination());
            segmentVo.setDepartureDate(segmenttime);
            segmentVo.setFlightNumber(segment.getFlight());
            segmentVos.add(segmentVo);
        }

        // get All AncillaryBookingVo info
        AncillaryBookingVo ancillaryBookingVo = new AncillaryBookingVo();
        ancillaryBookingVo.setRloc(bookingRef);
        ancillaryBookingVo.setPassenger(passengerVos);
        ancillaryBookingVo.setSegment(segmentVos);
        ancillaryBookingVo.setAncillaryProducts(ancillaryProductsList);

        System.out.println(ancillaryBookingVo);

        return ancillaryBookingVo;
    }



    //get segmentRefList by bookingIdList
//        List<Integer> segmentRefList = new ArrayList<>();
//        for (ServiceLine serviceLine : serviceLineList) {
//            //Find all  passengerRef from serviceLine by difference bookingId
//            System.out.println(serviceLine);
//            segmentRefList.add(serviceLine.getSegmentRef());
//        }
//
//        //get ssrRefList by bookingIdList
//        List<Integer> ssrRefList = new ArrayList<>();
//        for (ServiceLine serviceLine : serviceLineList) {
//            //Find all  passengerRef from serviceLine by difference bookingId
//            System.out.println(serviceLine);
//            ssrRefList.add(serviceLine.getSsrRef());
//        }

    // need more update

//    public List<AncillaryProducts> getAncillaryProducts(@PathVariable("bookingRef") String bookingRef) {
//
//        //get bookingIdList
//        List<Booking> bookingList = bookingService.findBookingByBookingRef(bookingRef);
//        List<Integer> list = new ArrayList<>();
//        for (Booking booking : bookingList) {
//            //Find all the books by bookingRef and traverse
//            System.out.println(booking);
//            list.add(booking.getBookingId());
//        }
//
//        //get passengerRefList by bookingIdList
//        List<ServiceLine> serviceLineList = serviceLineService.findServiceByBookingId(list);
//        List<Integer> passengerRefList = new ArrayList<>();
//        for (ServiceLine serviceLine : serviceLineList) {
//            //Find all  passengerRef from serviceLine by difference bookingId
//            System.out.println(serviceLine);
//            passengerRefList.add(serviceLine.getPassengerRef());
//        }
//
//        //get segmentRefList by bookingIdList
//        List<Integer> segmentRefList = new ArrayList<>();
//        for (ServiceLine serviceLine : serviceLineList) {
//            //Find all  passengerRef from serviceLine by difference bookingId
//            System.out.println(serviceLine);
//            segmentRefList.add(serviceLine.getSegmentRef());
//        }
//
//        //get segmentRefList by bookingIdList
//        List<Integer> ssrRefList = new ArrayList<>();
//        for (ServiceLine serviceLine : serviceLineList) {
//            //Find all  passengerRef from serviceLine by difference bookingId
//            System.out.println(serviceLine);
//            ssrRefList.add(serviceLine.getSsrRef());
//        }
//
//        PassengerInfo passengerInfo = passengerService.findPassengerInfoByPassengerRef(list,passengerRefList);
//
//        SegmentInfo segmentInfo = segmentService.findSegmentInfoByBookingIdAndSegmentRef(list,segmentRefList);
//
//        List<EmdInfoVo> emdInfoVoList = ticketService.findAirlineCodeandDocumentNumberBySsrRefAndTicketStatus(ssrRefList, "T");
//
//        List<AncillaryProducts> ancillaryProductsList = new ArrayList<>();
//
//        ancillaryProductsList.add(passengerInfo);
//        ancillaryProductsList.add(segmentInfo);
//        ancillaryProductsList.addAll(emdInfoVoList);
//
//
//        return ancillaryProductsList;
//    }
}

//    @RequestMapping(value = "/getAllBookings/{bookingRef}",method = RequestMethod.GET)
//    public List<SegmentVo> getAllSegment(@PathVariable("bookingRef") String bookingRef){
//
//        List<Booking> bookingList = bookingService.findBookingByBookingRef(bookingRef);
//        List<Integer> list = new ArrayList<>();
//        for(Booking booking : bookingList) {
//            //Find all the books by bookingRef and traverse
//            System.out.println(booking);
//            list.add(booking.getBookingId());
//        }
//        List<PassengerVo>  passengerList = passengerService.findPassengerByBookingId(list);
//        return passengerList;
//    }


//    @RequestMapping(value = "/getAllBookings/{bookingRef}",method = RequestMethod.GET)
//    public List<SegmentVo> getAllSegment(@PathVariable("bookingRef") String bookingRef){
//        Booking booking = bookingService.findBookingByBookingRef(bookingRef);
//        List<SegmentVo> segmentList = segmentService.findPassengerByBookingId(booking.getBookingId());
//        return segmentList;
//    }


            //list into array
//    String[] array=list.toArray(new String[list.size()]);

