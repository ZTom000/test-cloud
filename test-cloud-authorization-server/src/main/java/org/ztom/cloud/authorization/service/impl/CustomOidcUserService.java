package org.ztom.cloud.authorization.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserRequest;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.ztom.cloud.authorization.model.security.BasicOAuth2User;
import org.ztom.cloud.authorization.model.security.BasicOidcUser;
import org.ztom.cloud.authorization.strategy.context.Oauth2UserConverterContext;

/**
 * 自定义三方oidc登录用户信息服务
 *
 * @author vains
 */
@Service
@RequiredArgsConstructor
public class CustomOidcUserService extends OidcUserService {

    private final Oauth2UserConverterContext userConverterContext;

    @Override
    public OidcUser loadUser(OidcUserRequest userRequest) throws OAuth2AuthenticationException {
        // 获取三方用户信息
        OidcUser oidcUser = super.loadUser(userRequest);
        // 转为项目中的三方用户信息
        BasicOAuth2User basicOauth2User = userConverterContext.convert(userRequest, oidcUser);

        // 重新生成oidcUser
        if (StringUtils.hasText(basicOauth2User.getNameAttributeKey())) {
            return new BasicOidcUser(oidcUser, oidcUser.getIdToken(), oidcUser.getUserInfo(), basicOauth2User.getNameAttributeKey());
        }
        return new BasicOidcUser(oidcUser, oidcUser.getIdToken(), oidcUser.getUserInfo());
    }
}
