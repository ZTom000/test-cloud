package org.ztom.cloud.authorization.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.ztom.cloud.authorization.entity.SysRoleAuthority;
import org.ztom.cloud.authorization.mapper.SysRoleAuthorityMapper;
import org.ztom.cloud.authorization.service.ISysRoleAuthorityService;

/**
 * <p>
 * 角色菜单多对多关联表 服务实现类
 * </p>
 *
 * @author vains
 * @since 2023-07-04
 */
@Service
public class SysRoleAuthorityServiceImpl extends ServiceImpl<SysRoleAuthorityMapper, SysRoleAuthority> implements ISysRoleAuthorityService {

}
