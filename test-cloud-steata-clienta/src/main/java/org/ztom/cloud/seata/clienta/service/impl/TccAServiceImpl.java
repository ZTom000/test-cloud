package org.ztom.cloud.seata.clienta.service.impl;

import io.seata.rm.tcc.api.BusinessActionContext;
import org.springframework.stereotype.Service;
import org.ztom.cloud.seata.clienta.service.TccAService;

/**
 * @Description TODO
 * @Author 翟涛
 * @Version 1.0
 * @Date 2024/3/11 14:26
 */
@Service
public class TccAServiceImpl implements TccAService {
    @Override
    public boolean preare(BusinessActionContext actionContext, String xid, String a) {
        return false;
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
