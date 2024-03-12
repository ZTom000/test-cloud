package org.ztom.cloud.seata.clientb.service.impl;

import io.seata.rm.tcc.api.BusinessActionContext;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.ztom.cloud.seata.clientb.dao.StorageMapper;
import org.ztom.cloud.seata.clientb.service.TccBService;

/**
 * @Description TODO
 * @Author 翟涛
 * @Version 1.0
 * @Date 2024/3/11 14:26
 */
@Service
public class TccBServiceImpl implements TccBService {

    @Resource
    private StorageMapper storageMapper;

    /**
     * @Description TODO try 处理业务
     * @Params [actionContext, xid, a]
     * @Return boolean
     * @Author 翟涛
     * @Date 2024/3/12 8:33
     */
    @Override
    public boolean preare(BusinessActionContext actionContext, String xid, String a) {
        boolean flag = false;
        return flag;
    }

    @Override
    public boolean commit(BusinessActionContext actionContext) {
        return false;
    }

    @Override
    public boolean rollback(BusinessActionContext actionContext) {
        return false;
    }
}
