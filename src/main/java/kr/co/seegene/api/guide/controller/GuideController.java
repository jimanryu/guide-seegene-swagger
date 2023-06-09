package kr.co.seegene.api.guide.controller;

import kr.co.seegene.api.guide.vo.GuideParmVo;
import kr.co.seegene.api.guide.vo.GuideResultVo;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuideController {

    @Operation(summary = "이름을 출력하는 Controller", description = "입력 파라미터 이름 출력")
    @PostMapping("/test")
    public GuideResultVo test(@RequestBody GuideParmVo testParmVo){
        return GuideResultVo.builder()
                .result(testParmVo.getName())
                .build();
    }

    @Operation(summary = "메세지를 출력하는 Controller", description = "입력 파라미터 메세지 출력")
    @PostMapping("/test2")
    public GuideResultVo test2(@RequestBody GuideParmVo testParmVo){
        return GuideResultVo.builder()
                .result(testParmVo.getMessage())
                .build();
    }
}
