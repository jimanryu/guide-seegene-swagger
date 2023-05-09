package kr.co.seegene.api.guide.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GuideParmVo {
    @Schema(description = "이름", example = "seegene")
    String name;

    @Schema(description = "인사말", example = "안녕하세요")
    String message;
}
