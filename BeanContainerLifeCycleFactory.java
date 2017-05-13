package xubin;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;


/**
 * bean
 *
 * @author shiyanchao
 * @create 2017-05-09 21:46
 */
@Component
public class BeanContainerLifeCycleFactory implements BeanFactoryPostProcessor {

    public BeanContainerLifeCycleFactory() {
        super();
        System.out.println("这是BeanFactoryPostProcessor实现类构造器！！");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor接口执行postProcessBeanFactory方法进行修改");
    }
}