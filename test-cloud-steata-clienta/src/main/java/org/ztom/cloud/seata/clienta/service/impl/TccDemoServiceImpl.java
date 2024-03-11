package org.ztom.cloud.seata.clienta.service.impl;

import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;
import org.ztom.cloud.seata.clienta.service.TccDemoService;

import java.util.Map;

/**
 * @Description TODO
 * @Author 翟涛
 * @Version 1.0
 * @Date 2024/3/11 15:53
 */
@Service
public class TccDemoServiceImpl implements TccDemoService {

    @Override
    @GlobalTransactional
    public Map<String, Object> doTccCommit() {
        return null;
    }
}
