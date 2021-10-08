package mvc.train;

public class SingletonTest {
    private static SingletonTest singletonTest;
    private SingletonTest(){}
    public static synchronized SingletonTest getInstance()
    {
        if(singletonTest == null)
            singletonTest = new SingletonTest();
        return singletonTest;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
