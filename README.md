## Dubbo + Zookeeper

cd dubbo-admin-distribution/target

java -jar dubbo-admin-0.3.0.jar





两个web项目不同端口号 8001 8002

```java
public interface UserService {

    // 想拿到provider的票
    可以通过http 或者 RPC

}

    
```

```java
@Component // 使用dubbo后尽量不要使用@Service
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTicket() {
        return "王治方 Chris";
    }


    
}
```

------

倒入依赖

```xml
<dependency>
    <groupId>org.apache.dubbo</groupId>
    <artifactId>dubbo-spring-boot-starter</artifactId>
    <version>2.7.3</version>
</dependency>

<!-- https://mvnrepository.com/artifact/com.github.sgroschupf/zkclient -->
<dependency>
    <groupId>com.github.sgroschupf</groupId>
    <artifactId>zkclient</artifactId>
    <version>0.1</version>
</dependency>
```

```xml
<!--        日志可能会冲突-->
        <!-- 引入zookeeper -->
        <dependency>
            <groupId>org.apache.curator</groupId>
            <artifactId>curator-framework</artifactId>
            <version>2.12.0</version>
        </dependency>
        <dependency>
            <groupId>org.apache.curator</groupId>
            <artifactId>curator-recipes</artifactId>
            <version>2.12.0</version>
        </dependency>
        <dependency>
            <groupId>org.apache.zookeeper</groupId>
            <artifactId>zookeeper</artifactId>
            <version>3.4.14</version>
            <!--排除这个slf4j-log4j12-->
            <exclusions>
                <exclusion>
                    <groupId>org.slf4j</groupId>
                    <artifactId>slf4j-log4j12</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
```