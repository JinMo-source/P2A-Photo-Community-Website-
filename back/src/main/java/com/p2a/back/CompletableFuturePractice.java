package com.p2a.back;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFuturePractice {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> test = new CompletableFuture<>();
        test.complete("TESTEST");
        System.out.println(test.get());

        System.out.println(CompletableFuture.completedFuture("TESTSETETST").get());

        /**
         * 리턴이 없는 경우 runAsync
          */
        CompletableFuture.runAsync(()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("Hello ");
        }).get();

        /**
         * 리턴이 있는 경우 supplyAsync
         */
        System.out.println(CompletableFuture.supplyAsync(()->{
            System.out.println(Thread.currentThread().getName());
            System.out.print("Hello " );
            return "Good";
        }).get());

        /**
         * 결과의 콜백을 수행하는 법 thenApply / thenAccept / thenRun
         */
        System.out.println(CompletableFuture.supplyAsync(()->{
            return "good";
        }).thenApply(s -> {
            System.out.print(s + " WOW ");
            return 100;
        }).get());

        System.out.println();

        CompletableFuture.supplyAsync(()->{
            return "TEST";
        }).thenAccept(s->{
            System.out.println(s + " OH Beautiful");
        }).get();

        System.out.println(CompletableFuture.supplyAsync(()->{
            System.out.println(Thread.currentThread().getName().toUpperCase());
            return Thread.currentThread().getName();
        }).thenRun(()->{
            System.out.println(Thread.currentThread().getName() + " OH GOOD");
        }).get());
        /**
         * 스레드 풀을 만들지 않고도 별도의 스레드에서 동작이 가능한 이유 ->
         * DQueue 사용하기 때문
         * 스레드가 할 일이 없으면 DQueue 에서 가져와서 처리를 하는 방식
         * 만약 subtask 가 있다면 분산시켜서 처리시키고 join 하여 모으는 방식
         */
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        // 로 공통 풀이 아닌 개별 풀로도 적용시킬 수 있다
        CompletableFuture.supplyAsync(()->{
            System.out.println("Hello " + Thread.currentThread().getName());
            return " dvdsvsd ";
        }, executorService).thenRunAsync(()->{
            System.out.println(Thread.currentThread().getName());
        }, executorService).get();

        /**
         *  future 을 묶는 작업
         *  A를 먼저 가져오고 그다음 B를 가져오는 경우
         */
        CompletableFuture.runAsync(()->{
            System.out.println("hello " + Thread.currentThread().getName());
        }).thenCompose(s->getWorld());

        /*CompletableFuture world = CompletableFuture.runAsync(()->{
            System.out.println("world " + Thread.currentThread().getName());
        });*/
        /**
         * 연관은 없지만 따로 실행하는 방법
         */
        CompletableFuture.runAsync(()->{
            System.out.println("helloTEST " + Thread.currentThread().getName());
        }).thenCombine(getWorld(), (h, w) -> h + " TEST " + w);
        /**
         * 여러개가 전부 끝났을 때 추가적 콜백을 실행할 수도 있다
         */
        CompletableFuture.allOf(CompletableFuture.runAsync(()->{
            System.out.println("hello TEST " + Thread.currentThread().getName());
        }), getWorld()).thenAccept(System.out::println);

        /**
         * 복잡하게도 가능!!
         */
        List<CompletableFuture> lists = Arrays.asList(CompletableFuture.runAsync(()->{
            System.out.println("hello TEST " + Thread.currentThread().getName());
        }), getWorld());

        CompletableFuture<List> result = CompletableFuture.allOf(lists.get(0), lists.get(1))
                .thenApply(v ->
                    lists.stream().map(CompletableFuture::join)
                            .collect(Collectors.toList()));

        /**
         * fork join API and flow API 공부해보기!!!
         */
    }

    private static CompletableFuture<Void> getWorld(){
        return CompletableFuture.runAsync(()->{
            System.out.println("world " + Thread.currentThread().getName());
        });
    }
}
