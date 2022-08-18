package singletonPatton.unsafeTest;

import singletonPatton.UnsafeSingleton;

public class UnsafeTest {

    public static void main(String[] args) {
        UnsafeSingleton singleton = UnsafeSingleton.getInstance();

        Runnable runnable = new Thread() {
            @Override
            public void run() {
                singleton.put("seoul", "02");
                singleton.put("kyeongkido", "031");
                singleton.put("busan", "051");
                singleton.put("daejeon", "042");
                singleton.forEach();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        try {
            System.out.println("=========================try===========================");
            Thread.sleep(1000);
            singleton.put("jeju", "064");
            System.out.println("=========================try end===========================");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
