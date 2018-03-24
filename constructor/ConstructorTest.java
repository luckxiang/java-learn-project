/*************************************************************************
	> File Name: ConstructorTest.java
	> Author: 
	> Mail: 
	> Created Time: 2018年03月24日 星期六 10时33分34秒
 ************************************************************************/
import java.util.*;

public class ConstructorTest {
    public static void main(String[] arg) {
        Rock rock1 = new Rock();
        Rock rock2 = new Rock(new String("im rock2\n"));
        
        rock1.GetInfo();
        rock2.GetInfo();
    }
}

class Rock {
    String who;
    Rock() {
        who = new String("im rock\n");
        System.out.print("Rock no agrs\n");
    }
    Rock(String s) {
        this();
        who = s;
        System.out.print("Rock agrs:" + s);
    }
    
    void GetInfo() {
        System.out.print(who);
    }
}
