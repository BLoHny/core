package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {

    public static void main(String[] args) {
        /* appConfig = new AppConfig();

           MemberService memberService = appConfig.memberService();
           OrderService orderService = appConfig.orderService();
         */

        //스프링 컨테이너 생성
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class  );
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        OrderService orderService = ac.getBean("orderService", OrderService.class);

        memberService.join(new Member(1L, "TestA", Grade.VIP));
        Order order = orderService.createOrder(1L, "aa", 10000);

        System.out.println("order = " + order);
        System.out.println(order.calculatePrice());
    }
}
