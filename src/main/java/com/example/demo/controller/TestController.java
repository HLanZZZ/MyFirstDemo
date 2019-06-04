package com.example.demo.controller;


import com.example.demo.service.BookingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
    // 4
//    class SampleThread extends Thread {
//
//        public void run() {
//
//            for(int i=0;i<5;i++){
//                try {
//                    Thread.sleep(1000);
//                }catch (InterruptedException e){}
//
//                System.out.println(Thread.currentThread().getName()
//                        + "运行，i = " + i) ;    // 取得当前线程的名字
//            }
//
//        }
//    }

    //thread Interrupt
//    class SampleThread extends Thread {
//
//        public void run() {
//
//            System.out.println("线程开始");
//
//            try {
//                Thread.sleep(5000);
//                System.out.println("休眠完成");
//            } catch (InterruptedException e) {
//                System.out.println("休眠被终止");
//            }
//
//            System.out.println("run方法正常结束");
//        }
//    }

    //在Java中，只要一个线程没有执行完（一个线程在运行），则整个Java的进程不会消失，所以此时可以设置一个后台线程，这样即使java线程结束了，则后台线程
    // 依旧会继续执行。要想实现这个操作，要使用setDaemon()方法完成。

    class SampleThread extends Thread {
        //test daemon
        public void run() {
            int i = 0;
            while (true){
                System.out.println(i+"????"+Thread.currentThread().getName());
            }
        }
    }



    @RequestMapping("/testThread")
    public String testThread(){
        Thread thread1 = new SampleThread();
        Thread thread2 = new SampleThread();

        thread1.start();
        thread2.start();
        thread1.setName("huazai");

        String s = thread1.getName()+thread2.getName();

       return s;

    }
    @RequestMapping("/testAliveThread")
    public void testAliveThread(){
        Thread thread1 = new SampleThread();
        thread1.setName("huazai");

        System.out.println("线程开始执行之前 --> " + thread1.isAlive()) ;     // 判断是否启动
        thread1.start();

        System.out.println("线程开始执行之后 --> " + thread1.isAlive()) ;     // 判断是否启动

        for(int i=0;i<3;i++){
            System.out.println(" 运行 --> " + i) ;
        }
        // 以下的输出结果不确定
        System.out.println("代码执行之后 --> " + thread1.isAlive()) ;     // 判断是否启动

//        线程开始执行之前 --> false
//        线程开始执行之后 --> true
//        运行 --> 0
//        运行 --> 1
//        运行 --> 2
//        代码执行之后 --> true
//        huazai运行，i = 0
//        huazai运行，i = 1
//        huazai运行，i = 2
    }

    @RequestMapping("/testJoin")
    public void testJoin() {
        Thread thread1 = new SampleThread();
        thread1.setName("huazai");
        thread1.start();

        for (int i = 0; i < 20; i++) {
            if (i>10){
                try {
                    thread1.join();
                }catch (InterruptedException e){}
            }

            System.out.println(" 运行 --> " + i);
        }
//        运行 --> 0
//        运行 --> 1
//        运行 --> 2
//        运行 --> 3
//        运行 --> 4
//        运行 --> 5
//        运行 --> 6
//        运行 --> 7
//        运行 --> 8
//        运行 --> 9
//        运行 --> 10
//        huazai运行，i = 0
//        huazai运行，i = 1
//        huazai运行，i = 2
//        huazai运行，i = 3
//        huazai运行，i = 4
//        huazai运行，i = 5
//        huazai运行，i = 6
//        huazai运行，i = 7
//        huazai运行，i = 8
//        huazai运行，i = 9
//        huazai运行，i = 10
//        huazai运行，i = 11
//        huazai运行，i = 12
//        huazai运行，i = 13
//        huazai运行，i = 14
//        huazai运行，i = 15
//        huazai运行，i = 16
//        huazai运行，i = 17
//        huazai运行，i = 18
//        huazai运行，i = 19
//        运行 --> 11
//        运行 --> 12
//        运行 --> 13
//        运行 --> 14
//        运行 --> 15
//        运行 --> 16
//        运行 --> 17
//        运行 --> 18
//        运行 --> 19
    }

    @RequestMapping("/testThreadSleep")
    public void testThreadSleep() {
        Thread thread1 = new SampleThread();
        thread1.setName("huazai");
        thread1.start();

//        在run方法内
//        try {
//            Thread.sleep(1000);
//        }catch (InterruptedException e){}

//        huazai运行，i = 0  // sleep 1s
//        huazai运行，i = 1   ......
//        huazai运行，i = 2   ......
//        huazai运行，i = 3   ......
//        huazai运行，i = 4   ......
    }

    // thread interrupt

    //这个过程就是执行run方法的同时 执行
    @RequestMapping("/testThreadInterrupt")
    public void testThreadInterrupt() {
        Thread thread1 = new SampleThread();
        thread1.setName("huazai");
        thread1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("中断休眠");

        }
        //执行中断
        thread1.interrupt();
    }

    //线程开始
    //休眠被终止
    //run方法正常结束

    @RequestMapping("/testThreadDaemon")
    public void testThreadDaemon() {
        Thread thread1 = new SampleThread();
        thread1.setName("huazai");
        thread1.setDaemon(true); //设置后台运行
        thread1.start();

        String str = "123456";
        str.replace("123456","110");

    }


}


