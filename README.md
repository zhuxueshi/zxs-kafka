<<<<<<< HEAD
# spring-data-kafka2
springboot kafka集成


1.主要依赖（注意客户端版本与服务器版本一致）
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.kafka</groupId>
            <artifactId>spring-kafka</artifactId>
            <version>1.0.0.RC1</version>
        </dependency>
        
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        
2.kafka发送消息对象
    @Autowired
    private KafkaTemplate kafkaTemplate;
    
    
    
3.测试类

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class TestProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Test
    public void sendMess() {
        kafkaTemplate.send("test", "11111111111");
    }
}
=======
# zxs-kafka
测试kafka生产者发送消费和消费者消费消息，并且监听消费被消费
>>>>>>> branch 'master' of https://github.com/zhuxueshi/zxs-kafka.git
