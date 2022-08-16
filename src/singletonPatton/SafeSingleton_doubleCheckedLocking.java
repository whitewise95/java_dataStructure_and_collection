package singletonPatton;

public class SafeSingleton_doubleCheckedLocking {
    private static volatile SafeSingleton_doubleCheckedLocking safeSingleton_doubleCheckedLocking;

    private SafeSingleton_doubleCheckedLocking() {
    }

    /*
    *  double-checked locking
    *
    *  Thread1 과 Thread2 가 15번 블럭의 if문 로직이 들어가더라도
    *  동기화가 되어 있는 로직에서 하나의 Thread만 다름 로직을 수행하게 된다.
    *  즉, 두번제 Thread가 다음 로직을 수행하더라도 null이 아니므로 이미 생성된
    *  instance를 반환하게 된다.
    * */
    public static SafeSingleton_doubleCheckedLocking getInstance() {
        if (safeSingleton_doubleCheckedLocking == null) {
            synchronized (SafeSingleton_doubleCheckedLocking.class) {
                if (safeSingleton_doubleCheckedLocking == null) {
                   return new SafeSingleton_doubleCheckedLocking();
                }
            }
        }
        return safeSingleton_doubleCheckedLocking;
    }
}
