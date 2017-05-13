package xubin;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.stereotype.Component;

/**
 * bean
 *
 * @author shiyanchao
 * @create 2017-05-09 21:46
 */
@Component
public class BeanLevelLifeCycle implements BeanFactoryAware, BeanNameAware,
        InitializingBean, DisposableBean {


    private BeanFactory beanFactory;
    private String beanName;

    public BeanLevelLifeCycle() {
        System.out.println("【构造器】调用BeanLevelLifeCycle的构造器实例化");
    }

    // 这是BeanFactoryAware接口方法
    @Override
    public void setBeanFactory(BeanFactory arg) throws BeansException {
        System.out
                .println("【BeanFactoryAware接口】调用BeanFactoryAware.setBeanFactory()");
        this.beanFactory = arg;
    }

    // 这是BeanNameAware接口方法
    @Override
    public void setBeanName(String arg) {
        System.out.println("【BeanNameAware接口】调用BeanNameAware.setBeanName()");
        this.beanName = arg;
    }

    // 这是InitializingBean接口方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out
                .println("【InitializingBean接口】调用InitializingBean.afterPropertiesSet()");
    }

    // 这是DiposibleBean接口方法
    @Override
    public void destroy() throws Exception {
        System.out.println("【DiposibleBean接口】调用DiposibleBean.destory()");
    }
}
