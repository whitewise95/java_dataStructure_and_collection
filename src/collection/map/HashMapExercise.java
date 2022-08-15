package collection.map;

import java.util.*;

public class HashMapExercise {

     public static void main(String[] args) {
         Map<String, Integer> map = new HashMap();  //Map<"key의 데이터타입", value의 데이터입> 변수명 으로 선언

         map.put("짱구", 200);   // map.put(키,값) 으로 저장하게 된다.
         map.put("철수", 400);
         map.put("유리", 300);
         map.put("맹구", 100);
         map.put("훈이", 100);

         System.out.println(map);  //map의 키의 데이터타입은 String, Integer은 기본적으로 toString이 구현되어 있어 값이 출력된다.
         System.out.println(map.get("짱구"));      // get 메소드로 키를 입력하면 값이 나온다.
         System.out.println(map.get("철수"));
         System.out.println(map.get("유리"));
         System.out.println(map.get("맹구"));
         System.out.println(map.get("훈이"));
    }
}
