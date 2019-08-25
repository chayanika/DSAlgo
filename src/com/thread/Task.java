package com.thread;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Task implements Runnable {
    public String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
 //       try{
//            Long duration = (long)(Math.random()*10);
//            System.out.println("Executing name in task class: " +name);
//            TimeUnit.SECONDS.sleep(duration);
            System.out.println("Executing : " + name + ", Current Seconds : " + new Date().getSeconds());
//        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
    }
}
