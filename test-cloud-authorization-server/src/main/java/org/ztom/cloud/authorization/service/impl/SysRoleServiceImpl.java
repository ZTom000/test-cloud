package org.ztom.cloud.authorization.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;
import org.ztom.cloud.authorization.entity.SysRole;
import org.ztom.cloud.authorization.mapper.SysRoleMapper;
import org.ztom.cloud.authorization.service.ISysRoleService;

/**
 * <p>
 * 系统角色表 服务实现类
 * </p>
 *
 * @author vains
 * @since 2023-07-04
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {

}
