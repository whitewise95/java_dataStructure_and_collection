package collection.map;

import java.util.*;

public class HashMapExercise {

     public static void main(String[] args) {
         Map<String, Integer> map = new HashMap();  //Map<"key의 데이터타입", value의 데이터입> 변수명 으로 선언

         map.put("짱구", 200);   // map.put(키,값) 으로 저장하게 된다.
         map.put("철수", 400);

         System.out.println(map);  //map의 키의 데이터타입은 String, Integer은 기본적으로 toString이 구현되어 있어 값이 출력된다.
         System.out.println(map.get("짱구"));      // get 메소드로 키를 입력하면 값이 나온다.
         System.out.println(map.get("철수"));

         System.out.println(map.containsKey("철수"));  // containsKey 메소드는 키값에 철수가 있는지 확인하는 메소드다

         //========================================================

         Map<String, Integer> newMap = new HashMap();

         newMap.putAll(map);  // putAll() 은 같은 데이터타입을 가진 다른 Map을 전부 포함하게 된다.

         System.out.println(newMap);
    }
}
