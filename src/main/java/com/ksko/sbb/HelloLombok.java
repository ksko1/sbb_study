package com.ksko.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

@Getter
//@Setter
@RequiredArgsConstructor
public class HelloLombok {
    //1.롬복으로 getter, setter 만들기
    /*
    private String hello;
    private int lombok;
    */

    private final String hello;
    private final int lombok;

    public static void main(String[] args) {
        //한글 인코딩 깨짐 현상 확인 및 수정
        System.out.println("Default Charset: " + java.nio.charset.Charset.defaultCharset());
        System.out.println("file.encoding: " + System.getProperty("file.encoding"));
        System.out.println("Default Locale: " + java.util.Locale.getDefault());
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        //1.롬복으로 getter, setter 만들기
        /*
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setHello("헬로");
        helloLombok.setLombok(5);

        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
        */
        HelloLombok helloLombok = new HelloLombok("헬로", 5);
        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}
