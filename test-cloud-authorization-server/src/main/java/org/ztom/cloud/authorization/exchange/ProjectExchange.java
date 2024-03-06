package org.ztom.cloud.authorization.exchange;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.ztom.cloud.authorization.model.Result;
import org.ztom.cloud.authorization.model.response.CaptchaResult;

/**
 * 为back4app部署准备的接口，调用当前服务
 *
 * @author vains
 */
@HttpExchange
public interface ProjectExchange {

    /**
     * 调用当前项目的获取验证码方法
     *
     * @return 统一响应类
     */
    @GetExchange("/getCaptcha")
    Result<CaptchaResult> getCaptcha();

}
