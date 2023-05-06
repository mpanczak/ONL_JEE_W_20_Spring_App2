package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.Ship;

public class Main03 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Ship ship = ctx.getBean("blackPearl", Ship.class);
        ship.getCaptain().startSailing();
        ctx.close();

    }
}
