package work.idler.apache.dubbo.provider.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import work.idler.apache.dubbo.provider.api.EchoService;

/**
 * This is description
 *
 * @author isColt
 * @date 2019/8/30
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Value("${dubbo.protocol.port}")
    private String port;

    @Override
    public String echo(String string) {
        return "Echo Hello Apache Dubbo " + string + ":" + port;
    }
}
