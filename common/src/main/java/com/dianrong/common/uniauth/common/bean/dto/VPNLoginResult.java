package com.dianrong.common.uniauth.common.bean.dto;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * VPN login接口的返回值
 * 
 * @author wanglin
 */
@Getter 
@Setter 
@NoArgsConstructor
@ToString
@ApiModel("VPNLogin接口的返回值")
public class VPNLoginResult extends TenancyBaseDto {

    private static final long serialVersionUID = -1373906423303067202L;

    @ApiModelProperty("登陆用户的电话号码")
    private String mobile_num;
    
    @ApiModelProperty("登陆用户备注说明")
    private String user_note;
    
    @ApiModelProperty("登陆用户所在组的层级结构:top-group1-group2")
    private List<String> group_name;
    
    @ApiModelProperty("登陆用户的姓名或邮箱或登陆账户")
    private String user_name;
}
