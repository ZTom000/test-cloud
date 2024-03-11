package org.ztom.cloud.seata.clienta.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.ztom.cloud.seata.clienta.entity.Order;

/**
 * @Description 订单 Mapper
 * @Author 翟涛
 * @Version 1.0
 * @Date 2024/3/11 16:12
 */
@Mapper
public interface OrderDao extends BaseMapper<Order> {
}
