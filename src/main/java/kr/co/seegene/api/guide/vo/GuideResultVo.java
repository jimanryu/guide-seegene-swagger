package kr.co.seegene.api.guide.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GuideResultVo {
    @Schema(description = "출력 값")
    String result;

    @Builder
    public GuideResultVo(String result) {
        this.result = result;
    }
}
