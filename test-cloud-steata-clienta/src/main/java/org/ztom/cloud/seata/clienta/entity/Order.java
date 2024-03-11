package org.ztom.cloud.seata.clienta.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description Order 实体类
 * @Author 翟涛
 * @Version 1.0
 * @Date 2024/3/11 16:09
 */
@Data
@NoArgsConstructor
@TableName("order_tbl")
public class Order {

    @TableId
    private Long id;
    private String userId;
    private String commodityCode;
    private Integer count;
    private Integer money;
}
