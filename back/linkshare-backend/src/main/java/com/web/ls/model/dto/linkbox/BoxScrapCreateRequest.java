package com.web.ls.model.dto.linkbox;

import com.web.ls.model.entity.BoxScrap;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class BoxScrapCreateRequest {

    @ApiModelProperty(value = "user id", required = true)
    @NotNull
    private Integer uid;
    @ApiModelProperty(value = "link box id", required = true)
    @NotNull
    private Integer boxid;

    public BoxScrap toEntity() {
        return BoxScrap.builder()
                .uid(this.uid)
                .boxid(this.boxid)
                .build();
    }
}
