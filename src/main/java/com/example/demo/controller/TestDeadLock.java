package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestDeadLock {


    class deathLock implements Runnable{

        private boolean args;

        public deathLock(boolean args) {
            this.args = args;
        }

        @Override
        public void run() {
            if (args) {
                synchronized (Mylock.mylock1) {
                    System.out.println(Thread.currentThread().getName() + "...if...str1");

                    synchronized (Mylock.mylock2) {
                        System.out.println(Thread.currentThread().getName() + "...if...str2");

                    }
                }
            }else {
                synchronized(Mylock.mylock1){
                    System.out.println(Thread.currentThread().getName()+"...else...str2");

                    synchronized(Mylock.mylock2){
                        System.out.println(Thread.currentThread().getName()+"...else...str1");
                    }
                }
            }
        }
        }

    static class Mylock {
       static  Mylock mylock1 = new Mylock();
       static  Mylock mylock2 = new Mylock();

    }
    @RequestMapping("/testDeadLock")
    public void testDeadLock () {

        deathLock deathLock1 = new deathLock(true);
        deathLock deathLock2 = new deathLock(false);
        Thread thread1 = new Thread(deathLock1);
        Thread thread2 = new Thread(deathLock2);

        thread1.start();
        thread2.start();

    }

    }
