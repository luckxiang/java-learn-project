/*************************************************************************
	> File Name: Fruits.java
	> Author: 
	> Mail: 
	> Created Time: 2018年03月26日 星期一 13时02分12秒
 ************************************************************************/

import java.util.*;


class Fruit {
    private String name = new String("Fruit");

    void getName() {
        System.out.print(name);
    }
}

class Apple extends Fruit {
    private String name = new String("Apple\n");

    void getName() {
        System.out.print(name);
    }
}

class Pear extends Fruit {
    private String name = new String("Pear\n");

    void getName() {
        System.out.print(name);
    }
}

public class Fruits {
    
   public static void main(String[] args) {
        Fruit[] f = new Fruit[3];
        f[0] = new Apple();
        f[1] = new Pear();
        f[0].getName();
        f[1].getName();
    

    }
}

