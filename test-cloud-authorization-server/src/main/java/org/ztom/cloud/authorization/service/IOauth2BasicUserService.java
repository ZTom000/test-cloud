package org.ztom.cloud.authorization.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.ztom.cloud.authorization.entity.Oauth2BasicUser;
import org.ztom.cloud.authorization.entity.Oauth2ThirdAccount;
import org.ztom.cloud.authorization.model.response.Oauth2UserinfoResult;

/**
 * <p>
 * 基础用户信息表 服务类
 * </p>
 *
 * @author vains
 * @since 2023-07-04
 */
public interface IOauth2BasicUserService extends IService<Oauth2BasicUser> {

    /**
     * 生成用户信息
     *
     * @param thirdAccount 三方用户信息
     * @return 用户id
     */
    Integer saveByThirdAccount(Oauth2ThirdAccount thirdAccount);

    /**
     * 获取当前登录用户的信息
     *
     * @return 用户信息
     */
    Oauth2UserinfoResult getLoginUserInfo();

}
