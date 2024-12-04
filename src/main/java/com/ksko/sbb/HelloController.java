package com.ksko.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//HelloController 클래스가 컨트롤러의 기능을 수행 한다는 의미
public class HelloController {
    /*
      용어 설명
     1. 애너테이션(annotation) : 자바의 클래스, 메서드, 변수 등에 정보를 부여하여 부가 동작을 할 수 있게 하는 목적으로 사용
     2. 매핑(mapping)하다 : 특정 URL 경로를 서버의 특정 메서드와 연결하는 것을 의미
     3. Get 방식, Post 방식 차이
      - Get과 Post는 HTTP 프로토콜을 사용하여 데이터를 서버로 전송하는 방식
      1) Get 방식 :  데이터를 URL에 노출시켜 요청하며, 주로 서버에서 데이터를 조회하거나 읽기 위한 목적으로 사용
      2) Post 방식 :  데이터를 숨겨서 요청하므로 로그인 정보와 같은 민감한 데이터를 서버에 제출하거나 저장하는 목적으로 사용
      @GetMapping : Get 방식으로 URL 요청
      @PostMapping : Post 방식으로 URL 요청
     */
    @GetMapping("/hello") // http://localhost:8080/hello URL 요청이 발생하면 hello 메서드가 실행됨을 의미. 즉 /hello URL과 hello 메서드를 매핑하는 역할. 이때 URL명과 메서드명이 동일할 필요는 없다. 즉, /hello URL 일때 메서드명을 hello가 아닌 hello2 와 같이 써도 상관 없음
    @ResponseBody // hello 메서드의 출력 결과가 문자열 그 자체임을 나타냄.(출력결과는 이런 String 문자열 보다, html 파일과 같은 템플릿이 주로 사용)
    public String hello() {
        System.out.println("한글 출력 테스트");
        return "Hello Spring Boot Board";
    }
}
