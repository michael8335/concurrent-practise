package com.felix.concurrent;

import java.util.concurrent.CompletableFuture;

/**
 * 使用Future获得异步执行结果时，要么调用阻塞方法get()，要么轮询看isDone()是否为true，这两种方法都不是很好，因为主线程也会被迫等待。
 *
 * 从Java 8开始引入了CompletableFuture，它针对Future做了改进，可以传入回调对象，当异步任务完成或者发生异常时，自动调用回调对象的回调方法。
 */
public class CompletableFuturePrattice {
    public static void main(String args[]){
        CompletableFuture<String> future= CompletableFuture.supplyAsync(()->{

        }).
    }
}
