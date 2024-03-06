package org.ztom.cloud.authorization.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.ztom.cloud.authorization.entity.SysRoleAuthority;

/**
 * <p>
 * 角色菜单多对多关联表 Mapper 接口
 * </p>
 *
 * @author vains
 * @since 2023-07-04
 */
public interface SysRoleAuthorityMapper extends BaseMapper<SysRoleAuthority> {

}
