package singletonPatton;

public class SafeSingleton_lazyInstance {

    private SafeSingleton_lazyInstance() {
    }

    private static class Lazy {
        private static final SafeSingleton_lazyInstance INSTANCE = new SafeSingleton_lazyInstance();
    }


    /*
    *  어플리케이션이 실행될 때 인스턴스가 생성되는게 아니라 getInstance 메소드가 시작되었을 때
    *  SafeSingleton_LazyInstance 인스턴스가 생성된다.
    * */
    public static SafeSingleton_lazyInstance getInstance() {
        return Lazy.INSTANCE;
    }

}
