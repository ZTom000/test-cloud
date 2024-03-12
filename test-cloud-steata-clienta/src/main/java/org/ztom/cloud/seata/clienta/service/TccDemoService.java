package org.ztom.cloud.seata.clienta.service;

import java.util.Map;

/**
 * @Description TCC 业务 demo 类
 * @Author 翟涛
 * @Version 1.0
 * @Date 2024/3/11 15:52
 */
public interface TccDemoService {

    Map<String, Object> doTccCommit();
}
