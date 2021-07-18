package demo;

import java.util.HashMap;
import java.util.Map;

public class Demo {
//    public void tricky(Point arg1, Point arg2) {
//        arg1.x = 100;
//        arg1.y = 100;
//        Point temp = arg1;
//        arg1 = arg2;
//        arg2 = temp;
//
//        System.out.println("Inside func arg1 x: " + arg1.x + ", y: " + arg1.y);
//        System.out.println("Inside func arg2 x: " + arg2.x + ", y: " + arg2.y);
//    }

    public static void main(String[] args) {
        Map<Point, String> map = new HashMap<>();
        Point point1 = new Point(10, 30);
        map.put(point1, "Point");
        point1.setX(20);
        System.out.println(map.get(new Point(10,30)));
        System.out.println(map.get(new Point(20,30)));

        point1.setX(10);
        System.out.println(map.get(new Point(10,30)));
        System.out.println(map.get(new Point(20,30)));

//        Demo demo = new Demo();
//        Point p1 = new Point(2, 3);
//        Point p2 = new Point(2, 3);
//        System.out.println("p1 x: " + p1.x + ", y: " + p1.y);
//        System.out.println("p2 x: " + p2.x + ", y: " + p2.y);
//
//        demo.tricky(p1, p2);
//
//        System.out.println("p1 x: " + p1.x + ", y: " + p1.y);
//        System.out.println("p2 x: " + p2.x + ", y: " + p2.y);


//        for (long i = 0L; i < Integer.MAX_VALUE; i++) {
//            sum += i;
//        }

//        System.out.println(sum);
//        sum += 1;
//        sum++;
//        System.out.println(sum); // 2305843005992468481

    }
}
