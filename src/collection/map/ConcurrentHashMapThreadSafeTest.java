package collection.map;

import java.util.concurrent.ConcurrentHashMap;

/*
 * Hashtable 클래스의 단점을 보완하면서 Multi-Thread 환경에서 사용할 수 있도록 나온 클래스가
 * 바로 ConcurrentHashMap 입니다.(JDK 1.5에 검색과 업데이트시 동시성 성능을 높이기 위해서 나온 클래스 입니다.)
 * HashMap, Hashtable, ConcurrentHashMap 클래스 모두 Map의 기능적으로만 보면 큰 차이는 없습니다.
 * */
public class ConcurrentHashMapThreadSafeTest {
    static ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap();

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Thread() {
            @Override
            public void run() {
                concurrentHashMap.put("seoul", "02");
                concurrentHashMap.put("kyeongkido", "031");
                concurrentHashMap.put("busan", "051");
                concurrentHashMap.put("daejeon", "042");
                concurrentHashMap.forEach((key, value) -> {
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
        concurrentHashMap.put("jeju", "064");
    }

}
