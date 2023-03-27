package hello.core.singleton;

public class StatefulService {

    //private int price; //상태 유지 필드

    public int order(String string, int price) {
        System.out.println("name = " + string + " price = " + price);
        //this.price = price; // -> 문제

        return price;
    }
}
