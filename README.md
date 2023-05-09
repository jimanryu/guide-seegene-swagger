# Swagger 사용법 그리고 커스터마이징

https://springdoc.org/


> **Swagger** 는 REST API를 설계, 구축, 문서화 및 사용하는 데 도움이 될 수 있는 OpenAPI 사양을 기반으로 구축된 오픈 소스 도구 세트입니다.

## Swagger 사용 방법

---

 Swagger의 사용방법은 Java Spring Boot + Gradle을 기준으로 설명하겠다.

1. Gradle 설정
    
    ```groovy

    implementation 'org.springframework.boot:spring-boot-starter'
    implementation 'org.springframework.boot:spring-boot-starter-web:2.7.0'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    
    /* SWAGGER */
    implementation group: 'org.springdoc', name: 'springdoc-openapi-ui', version: '1.6.9'
    ```
    
    > Swagger-ui 버전정보는 확인을 통해 설정 할 것
    
    
2. API 설명 작성
- 애노테이션 방법
    
    ```java
    
    
    ```
    
- Java Config 파일 방법
    
    ```java
  
  
    ```

1. Controller, Vo 에 설명 작성
    
    ```java
   
   
    ```
    
    ```java
   
    ```
    

1. 로컬 서버 기동 후 [localhost:8080](http://localhost:8080)/swagger-ui.html 접속
    
2. 확인

## Swagger 커스터마이징

---

 OpenAPI이므로 Swagger에 로고도 바꾸고 색상도 바꾸고 사용자의 입맛에 바꿀수가 있는데 그중 로고와 헤더 색상 바꾸는 것만 설명을 하고자 한다.

- GIt Issue에 있는 css path를 통한 커스터마이징

- Swagger UI Resource를 통한 직접 커스터마이징

1. swagger-ui resource 다운
    
    [https://github.com/swagger-api/swagger-ui](https://github.com/swagger-api/swagger-ui) 에서 dist 폴더 다운  

1. 인터넷 탭 아이콘 , 이름 변경
    
    ```html
    <!-- index.html -->
   
    ```

1. Swagger-ui 왼쪽 상단 로고 변경
    1. 적당한 이미지 로고(배경이 없는 png 파일 추천) 준비해서 Resource폴더 안에 넣어놓기
        
    2. swagger-ui-standalone-preset.js 수정 (배너 이미지 변경)
        
        ```jsx
        // 기존
        
        ```
        
        ```jsx
        // 변경
        
        ```
        
    
    4. 상단 배너 Back-ground 색상 변경
    
    Index.css 파일 수정
    
    ```css
    /** index.css **/
    
    .swagger-ui .topbar {
        background-color: lightgray;
    }
    ```
