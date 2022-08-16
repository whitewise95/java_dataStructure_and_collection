package singletonPatton;

public class SafeSingleton_constructor {
    private static final SafeSingleton_constructor SAFE_SINGLETON_CONSTRUCTOR = new SafeSingleton_constructor();

    private SafeSingleton_constructor() {
    }

    /*
     * 컴파일 때 부터 생성한 인스터스를 넘겨주는 방법이다.
     * */
    public static SafeSingleton_constructor getInstance() {
        return SAFE_SINGLETON_CONSTRUCTOR;
    }
}
