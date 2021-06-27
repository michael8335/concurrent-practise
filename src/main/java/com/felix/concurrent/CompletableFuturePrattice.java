package com.felix.concurrent;

import java.util.concurrent.CompletableFuture;

/**
 * 使用Future获得异步执行结果时，要么调用阻塞方法get()，要么轮询看isDone()是否为true，这两种方法都不是很好，因为主线程也会被迫等待。
 * <p>
 * 从Java 8开始引入了CompletableFuture，它针对Future做了改进，可以传入回调对象，当异步任务完成或者发生异常时，自动调用回调对象的回调方法。
 */
public class CompletableFuturePrattice {
    public static void main(String args[]) {
        /**
         * 以打车为例，发布订单后，先进行订单分配，找到合适的司机再通知乘客
         */
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("订单分配中.....");
            return "car_100";

        });

        future.thenAcceptAsync((car) -> {
            System.out.println("订单分配成功，车辆为：" + car);
        });
    }

}
