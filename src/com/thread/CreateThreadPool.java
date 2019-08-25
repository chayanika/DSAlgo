package com.thread;

import java.util.concurrent.*;

public class CreateThreadPool {

    public static void main(String args[]) {
        ScheduledThreadPoolExecutor scheduleExecutor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(2);
        Task task = new Task("Repeat task");
        System.out.println("Created In CreateThreadpool class: " + task.getName());
        scheduleExecutor.scheduleWithFixedDelay(task, 2, 2, TimeUnit.SECONDS);
    }

}


