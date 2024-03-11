package org.ztom.cloud.seata.clientb.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 库存实体类
 * @Author 翟涛
 * @Version 1.0
 * @Date 2024/3/11 16:13
 */
@Data
@NoArgsConstructor
@TableName("storage_tbl")
public class Storage {

    @TableId("id")
    private Long id;
    private String commodityCode;
    private Integer count;
}
