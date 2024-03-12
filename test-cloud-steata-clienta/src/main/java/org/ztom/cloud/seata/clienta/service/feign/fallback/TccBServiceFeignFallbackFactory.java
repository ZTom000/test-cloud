package org.ztom.cloud.seata.clienta.service.feign.fallback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;
import org.ztom.cloud.seata.clienta.service.feign.TccBServiceFeign;

/**
 * @Description TODO TccBServiceFeign回调类
 * @Author 翟涛
 * @Version 1.0
 * @Date 2024/3/12 8:19
 */
@Component
@Slf4j
public class TccBServiceFeignFallbackFactory implements FallbackFactory<TccBServiceFeign> {

    /**
     * @Description TODO 回调方法
     * @Params [throwable]
     * @Return org.ztom.cloud.seata.clienta.service.feign.TccBServiceFeign
     * @Author 翟涛
     * @Date 2024/3/12 8:24
     */
    @Override
    public TccBServiceFeign create(Throwable throwable){
        log.error("TccBServiceFeignFallbackFactory exception is {}",throwable.getMessage());
        return new TccBServiceFeign() {
        };
    }
}
