import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                applicationContext.getBean("helloworld",HelloWorld.class);
        bean.setMessage("Hello World!");
        System.out.println(bean.getMessage());

        Cat bean1 = applicationContext.getBean("cat", Cat.class);
        System.out.println(bean1.getMessage());
        Cat bean2 = applicationContext.getBean("cat",Cat.class);
        System.out.println(bean1 == bean2);
        System.out.println(bean1.equals(bean2));


    }
}