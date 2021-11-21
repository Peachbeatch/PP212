import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        ApplicationContext applicationContext1 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat kittybean =
                (Cat) applicationContext1.getBean("cat");
        Cat kittybean2 =
                (Cat) applicationContext1.getBean("cat");
        String a = bean.getMessage();
        String a1 = bean.getMessage();
        String b = kittybean.getMessage();
        String b1 = kittybean.getMessage();
        System.out.println(bean == bean2);
        System.out.println(kittybean == kittybean2);


    }
}