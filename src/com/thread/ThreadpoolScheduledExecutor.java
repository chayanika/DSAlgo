package com.thread;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadpoolScheduledExecutor {
        public static void main(String args[])
        {
            ScheduledThreadPoolExecutor scheduleExecutor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(2);

            TaskScheduledExcutor task = new TaskScheduledExcutor("Repeat task");
            System.out.println("Created In CreateThreadpool class: " + task.getName());
            scheduleExecutor.scheduleWithFixedDelay(task, 2,2, TimeUnit.SECONDS);
        }

    }
