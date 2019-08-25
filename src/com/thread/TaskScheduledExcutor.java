package com.thread;

import java.util.Date;

public class TaskScheduledExcutor implements Runnable {
    public String name;

    public TaskScheduledExcutor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Executing : " + name + ", Current Seconds : " + new Date().getSeconds());
    }
}

