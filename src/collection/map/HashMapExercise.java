package collection.map;

import java.util.*;

public class HashMapExercise {

     public static void main(String[] args) {
         /*
         * 1) Map<"key의 데이터타입", value의 데이터입> 변수명 = new HashMap(); 으로 생성
         * 2) put()  =  put(키,값) 으로 MapCollection에 저장된다.
         * 3) get()  =   get(키) 메소드로 키를 입력하면 값이 나온다.
         * 4) containsKey()   =  containsKey(키) 메소드는 해당 키에 철수가 있는지 확인하는 메소드다
         * */

         //1
         Map<String, Integer> map = new HashMap();

         //2
         map.put("짱구", 200);
         map.put("철수", 400);

         //3  {철수=400, 짱구=200},  200,  400
         System.out.println(map);
         System.out.println(map.get("짱구"));
         System.out.println(map.get("철수"));

         //4  true
         System.out.println(map.containsKey("철수"));


        /*
        * 1) putAll()   = putAll(new HashMap())  ->  putAll() 은 같은 데이터타입을 가진 다른 Map을 전부 포함하게 된다.
        * 2) Foreach()  = Map은 Foreach() 메소드를 이용하여 순환하면서 키-값 을 꺼낼 수 있다.
        * 3) keySet()   = Map은 index가 없지만 ketSet()를 이용하면 key를 set으로 넘겨주어 Map에 존재하는 키를 모두 순회할 수 있다.
        * */
         Map<String, Integer> newMap = new HashMap();

         //1 {철수=400, 짱구=200}
         newMap.putAll(map);
         System.out.println(newMap);

         //2  key = 철수 value = 400,   key = 짱구 value = 200
         newMap.forEach((key,value) -> System.out.println("key = " + key + " value = " + value));


         //3  철수  짱구
         for (String key : newMap.keySet()){
             System.out.println(key);
         }





    }
}
