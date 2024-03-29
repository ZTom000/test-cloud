package org.ztom.cloud.authorization.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ztom.cloud.authorization.constant.SecurityConstants;
import org.ztom.cloud.authorization.exchange.GiteeExchange;
import org.ztom.cloud.authorization.model.Result;
import org.ztom.cloud.authorization.model.response.Oauth2UserinfoResult;
import org.ztom.cloud.authorization.model.response.gitee.GetEmailResult;
import org.ztom.cloud.authorization.service.IOauth2BasicUserService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * 用户接口
 *
 * @author vains
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final GiteeExchange giteeExchange;

    private final IOauth2BasicUserService basicUserService;

    @GetMapping("/user")
    public Oauth2UserinfoResult user() {

        return basicUserService.getLoginUserInfo();
    }

    @GetMapping("/gitee/emails")
    public Result<List<GetEmailResult>> getGiteeEmails() {
        // 获取当前登录用户信息
        Oauth2UserinfoResult loginUserInfo = basicUserService.getLoginUserInfo();

        // 获取用户来源
        String sourceFrom = loginUserInfo.getSourceFrom();

        if (!Objects.equals(sourceFrom, SecurityConstants.THIRD_LOGIN_GITEE)) {
            return Result.error("请使用Gitee登录后使用.");
        }

        if (loginUserInfo.getCredentialsExpiresAt().isBefore(LocalDateTime.now())) {
            return Result.error("Gitee的token已经过期，请重新获取.");
        }

        return Result.success(giteeExchange.emails(loginUserInfo.getCredentials()));
    }

}
