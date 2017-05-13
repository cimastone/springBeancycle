package xubin;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * bean
 *
 * @author shiyanchao
 * @create 2017-05-09 21:46
 */
@Component
public class BeanContainerLifeCyclePost implements InstantiationAwareBeanPostProcessor {

    public BeanContainerLifeCyclePost() {
        super();
        System.out.println("这是BeanPostProcessor实现类构造器！！");
    }

    @Override
    public Object postProcessAfterInitialization(Object arg1, String arg)
            throws BeansException {
        System.out.println("BeanPostProcessor接口方法postProcessAfterInitialization对属性进行更改！后处理器该bean :" + arg);
        return arg1;
    }

    @Override
    public Object postProcessBeforeInitialization(Object arg1, String arg)
            throws BeansException {
        System.out.println("BeanPostProcessor接口方法postProcessBeforeInitialization对属性进行更改！后处理器该bean :" + arg);
        return arg1;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object arg1, String arg)
            throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor接口方法postProcessAfterInstantiation对属性进行更改！后处理器该bean :" + arg);
        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues propertyValues, PropertyDescriptor[] propertyDescriptors, Object o, String s) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor接口方法postProcessPropertyValues对属性进行更改！后处理器该bean :" + s +";class:" + o.getClass());
        return propertyValues;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> var1, String arg)
            throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor接口方法postProcessBeforeInstantiation对属性进行更改！后处理器该bean :" + arg);
        return null;
    }
}