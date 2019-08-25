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
        System.out.println("Executing : " + name + ", Current Seconds : " + new Date().getSeconds());

    }
}
