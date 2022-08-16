package singletonPatton;

public class UnsafeSingleton {

    private static UnsafeSingleton unsafeSingleton;

    private UnsafeSingleton() {
    }

    public static UnsafeSingleton getInstance() {
        if (unsafeSingleton == null) {
            return new UnsafeSingleton();
        }

        return unsafeSingleton;
    }
}
