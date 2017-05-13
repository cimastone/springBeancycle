package xubin;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * spring bean生命周期单元测试
 *
 * @author shiyanchao
 * @create 2017-05-09 20:57
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/config/spring/applicationContext-servlet.xml"})
public class BeanSelfLifeCycleTest {
    @Resource
    private BeanSelfLifeCycle beanSelfLifeCycle;

    @Resource
    private BeanLevelLifeCycle beanLevelLifeCycle;

    @Resource
    private BeanContainerLifeCyclePost beanContainerLifeCycle;

    @Resource
    private BeanContainerLifeCycleFactory beanContainerLifeCycleFactory;

    @org.junit.Test
    public void Test(){
        System.out.println("===============");
    }
}
