import com.caiyi.financial.data.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zph  Date：2017/8/9.
 */
@RunWith(SpringRunner.class)
@SuppressWarnings({"rawtypes","unchecked"})
@SpringBootTest(classes=Application.class)
public class TestProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Test
    public void sendMess() {
        kafkaTemplate.send("test", "zxshhy20180808");
    }
}
