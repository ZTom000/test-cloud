package org.ztom.cloud.authorization.authorization.handler;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.ztom.cloud.authorization.model.Result;
import org.ztom.cloud.authorization.util.JsonUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 校验设备码成功响应类
 *
 * @author vains
 */
@RequiredArgsConstructor
public class DeviceAuthorizationResponseHandler implements AuthenticationSuccessHandler {

    /**
     * 设备码验证成功后跳转地址
     */
    private final String deviceActivatedUri;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {
        // 写回json数据
        Result<Object> result = Result.success(deviceActivatedUri);
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.getWriter().write(JsonUtils.objectCovertToJson(result));
        response.getWriter().flush();
    }
}
