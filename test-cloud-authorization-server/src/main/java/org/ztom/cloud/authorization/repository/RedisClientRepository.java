package org.ztom.cloud.authorization.repository;import org.springframework.data.repository.CrudRepository;import org.ztom.cloud.authorization.entity.security.RedisRegisteredClient;import java.util.Optional;/** * 基于Spring Data Redis的客户端repository * * @author vains */public interface RedisClientRepository extends CrudRepository<RedisRegisteredClient, String> {    /**     * 根据客户端Id查询客户端信息     *     * @param clientId 客户端id     * @return 客户端信息     */    Optional<RedisRegisteredClient> findByClientId(String clientId);}