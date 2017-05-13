package xubin;

/**
 * bean
 *
 * @author shiyanchao
 * @create 2017-05-09 21:46
 */
public class BeanSelfLifeCycle{

    private String name;
    private String address;
    private long phone;

    public BeanSelfLifeCycle() {
        System.out.println("【构造器】调用BeanSelfLifeCycle的构造器实例化");
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        System.out.println("【注入属性】注入属性name");
        this.name = name;
    }

    public void setAddress(String address) {
        System.out.println("【注入属性】注入属性address");
        this.address = address;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person [address=" + address + ", name=" + name + ", phone="
                + phone + "]";
    }

    // 通过<bean>的init-method属性指定的初始化方法
    public void myInit() {
        System.out.println("【init-method】调用<bean>的init-method属性指定的初始化方法");
    }

    // 通过<bean>的destroy-method属性指定的初始化方法
    public void myDestory() {
        System.out.println("【destroy-method】调用<bean>的destroy-method属性指定的初始化方法");
    }
}
