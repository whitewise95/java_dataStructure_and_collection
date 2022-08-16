package singletonPatton;

public class SafeSingleton_synchronized {
    private static SafeSingleton_synchronized safeSingleton_synchronized;

    private SafeSingleton_synchronized() {
    }


    /*
    *  synchronized 키워드를 사용해 동기화를 보장하면 무조건 동일한 인스턴스가 생성된다.
    * */
    public static synchronized SafeSingleton_synchronized getInstance() {
        if (safeSingleton_synchronized == null) {
            return new SafeSingleton_synchronized();
        }

        return safeSingleton_synchronized;
    }

}
