package org.ztom.cloud.seata.clientb.service.action;

import io.seata.rm.tcc.api.BusinessActionContext;
import io.seata.rm.tcc.api.BusinessActionContextParameter;
import io.seata.rm.tcc.api.TwoPhaseBusinessAction;

/**
 * @Description TODO
 * @Author 翟涛
 * @Version 1.0
 * @Date 2024/3/12 13:38
 */
public interface StorageAction {
    @TwoPhaseBusinessAction(name = "StorageAction", commitMethod = "commit", rollbackMethod = "rollback")
    public boolean preare(BusinessActionContext actionContext,
                          @BusinessActionContextParameter(paramName = "xid") String xid,
                          @BusinessActionContextParameter(paramName = "storage") String storage);

    public boolean commit(BusinessActionContext actionContext);

    public boolean rollback(BusinessActionContext actionContext);
}
