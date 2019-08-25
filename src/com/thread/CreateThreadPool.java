package com.thread;

import java.util.concurrent.*;

public class CreateThreadPool {

    public static void main(String args[])
    {  //  ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newFixedThreadPool(5);
        ScheduledThreadPoolExecutor scheduleExecutor = (ScheduledThreadPoolExecutor)Executors.newScheduledThreadPool(2);
//
//     for (int i = 1; i <= 5; i++)
//     {
//         Task task = new Task("Task " + i);
        Task task = new Task("Repeat task");
        System.out.println("Created In CreateThreadpool class: " + task.getName());
       //  executor.execute(task);
         scheduleExecutor.scheduleWithFixedDelay(task, 2,2,TimeUnit.SECONDS);
     }//executor.shutdown();

    }


