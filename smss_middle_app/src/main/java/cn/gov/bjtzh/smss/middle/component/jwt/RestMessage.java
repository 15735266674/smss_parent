package cn.gov.bjtzh.smss.middle.component.jwt;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * All rights Reserved, Designed By YangJingRui
 *
 * @Package cn.gov.bjtzh.smss.middle.component.jwt
 * @Description: smss_parent
 * @Author: YangJingRui
 * @Email: arui83428@126.com
 * @Date: 2020-05-08 13:59
 * @Version V1.0
 * @Copyright: 2020@www.guodatou.com All rights reserved.
 */
@Data
@Component
@ApiModel(description = "Token返回接口类")
public class RestMessage implements Serializable {

    @ApiModelProperty(value = "是否成功")
    private boolean success = true;

    @ApiModelProperty(value = "返回对象")
    private Object data;

    @ApiModelProperty(value = "错误编号")
    private Integer errCode;

    @ApiModelProperty(value = "返回信息")
    private String message;

    public RestMessage() {
        super();
    }

    public RestMessage(Object data) {
        super();
        this.data = data;
    }

    public RestMessage(boolean success, Object data) {
        super();
        this.success = success;
        this.data = data;
    }
}
