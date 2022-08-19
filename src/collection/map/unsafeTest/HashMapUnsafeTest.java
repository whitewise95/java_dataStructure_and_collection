package collection.map.unsafeTest;

import singletonPatton.UnsafeSingleton;

import java.util.*;

public class HashMapUnsafeTest {
    static Map<String, String> hashmap = new HashMap();

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Thread() {
            @Override
            public void run() {
                hashmap.put("seoul", "02");
                hashmap.put("kyeongkido", "031");
                hashmap.put("busan", "051");
                hashmap.put("daejeon", "042");
                hashmap.forEach((key, value) -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("{" + key + "," + value + "}");
                });
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(1000);
//        hashmap.put("jeju", "064");
        hashmap.forEach((key, value) -> {
            System.out.println("{" + key + "," + value + "}");
        });
    }

}
