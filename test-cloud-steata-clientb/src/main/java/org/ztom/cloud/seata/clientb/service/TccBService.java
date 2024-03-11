package org.ztom.cloud.seata.clientb.service;

import io.seata.rm.tcc.api.BusinessActionContext;
import io.seata.rm.tcc.api.BusinessActionContextParameter;
import io.seata.rm.tcc.api.TwoPhaseBusinessAction;

/**
 * @Description TODO
 * @Author 翟涛
 * @Version 1.0
 * @Date 2024/3/11 14:17
 */
public interface TccBService {
    @TwoPhaseBusinessAction(name = "TccBService", commitMethod = "commit", rollbackMethod = "rollback")
    public boolean preare(BusinessActionContext actionContext,
                          @BusinessActionContextParameter(paramName = "xid") String xid,
                          @BusinessActionContextParameter(paramName = "a") String a);

    public boolean commit(BusinessActionContext actionContext);

    public boolean rollback(BusinessActionContext actionContext);
}
