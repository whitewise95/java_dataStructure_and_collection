package singletonPatton;

import java.util.*;

public class UnsafeSingleton {
    private Map<String, String> map = new HashMap();

    private static UnsafeSingleton unsafeSingleton;

    private UnsafeSingleton() {
    }

    public static UnsafeSingleton getInstance() {
        if (unsafeSingleton == null) {
            return new UnsafeSingleton();
        }
        return unsafeSingleton;
    }

    public void put(String key, String value) {
        map.put(key, value);
    }

    public void forEach() {
        map.forEach((key, value) ->
                {
                    System.out.println("===========start==================");
                    System.out.println("{" + key + "," + value + "}");

                }
        );
    }
}
