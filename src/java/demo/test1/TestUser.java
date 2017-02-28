package java.demo.test1;

/**
 * Created by lxf11736 on 2017/2/28.
 */
public class TestUser {
    private static TestUser ourInstance = new TestUser ();

    public static TestUser getInstance () {
        return ourInstance;
    }

    private TestUser () {
    }
}
