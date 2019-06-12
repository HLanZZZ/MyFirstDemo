package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSynchronization {

//    class SampleThread extends Thread {
//        private int a =5;
//        Object object =new Object();
//        // synchronized()
//        public void run() {
//            while (true){
//                synchronized (object){
//                    if (a>0){
//                        try {
//                            Thread.sleep(1000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(Thread.currentThread().getName() +"+++++++"+a);
//                    }
//                }
//            }
//
//
//    Thread-5+++++++5
//    huazai+++++++5
//    Thread-5+++++++5
//    huazai+++++++5
//    Thread-5+++++++5
//    huazai+++++++5
//        }
//    }

    class SampleThread extends Thread {
        private int a =5;
        Object object =new Object();
        // synchronized()
        public void run() {
            while (true){
                show();
            }

        }

        //上下两种代码的结果一样  一种代码块的
        public synchronized void show(){
                if (a>0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() +"+++++++"+a);
                }
        }

    }

    @RequestMapping("/testSynchronization")
    public void testSynchronization(){
        Thread thread1 = new SampleThread();
        Thread thread2 = new SampleThread();
        thread1.setName("huazai");

        thread1.start();
        thread2.start();
    }




}


