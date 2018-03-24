/*************************************************************************
	> File Name: AccessTest.java
	> Author: 
	> Mail: 
	> Created Time: 2018年03月24日 星期六 14时03分24秒
 ************************************************************************/

public class AccessTest {
    public static void main(String[] arg) {
        AccessPrivate access = AccessPrivate.CreateAccess();
        access.AccessLog();
    }
}


class AccessPrivate {
    private AccessPrivate() {}

    static AccessPrivate CreateAccess() {
        return new AccessPrivate();
    }
    void AccessLog() {
        System.out.print("log :xxxx\n");
    }
}
