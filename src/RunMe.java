import a.b.c.B1;
import a.b.c.B2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/14/2016.
 * Project: SPEL_test02
 * *******************************
 */
public class RunMe {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        B1 _b1_ = ctx.getBean(B1.class);
        for (B2 _next_ : _b1_.getB2s()) {
            System.out.println(_next_.getStringProp());
        }
    }
}
