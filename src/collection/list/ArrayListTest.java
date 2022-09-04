package collection.list;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {

        /*
        * ArrayList 생성
        * ArrayLIst는 List의 구현 클래스이기 때문에 List 인터페이스로 생성할 수 있습니다.
        * */
        ArrayList<Integer> integers = new ArrayList<>();
        List<Integer> integers2 = new ArrayList<>();


        /*
            데이터 타입을 정해주지 않고 생성
            위처럼 데이터타입을 정해주지 않아도 아래와 같이 생성할 수 있습니다. 하지만  데이터를 삽입할 때 Object로 캐스팅하기 때문에 성능적으로 불리할 수도 있습니다.
         */
        ArrayList integers3 = new ArrayList<>();
        List integers4 = new ArrayList<>();



        /*데이터 추가
         데이터는 add() 메소드를 사용하여 저장할 수 있습니다. 아래와 같이 add() 로 1를 넣으면 0번재 인덱스에 1이 저장됩니다.
         */
        integers.add(1);




        /*
        데이터 조회
        위에서 0번째 인덱스에 1를 넣었으니 get() 메소드에 인자로 인덱스를 주면 해당 인덱스의 값을 볼 수 있습니다.

        아래와 같이 인덱스 1 은 없는데 인덱스 1의 값을 보려할 때 java.lang.IndexOutOfBoundsException: Index: 1, Size: 1 라는 에러가 발생합니다.
         */
        integers.get(0);  // 1
//        integers.get(1);  // java.lang.IndexOutOfBoundsException: Index: 1, Size: 1


        /*
        remove() 메소드를 이용하여 인자로 인덱스를 주면 해당 인덱스의 값을 삭제합니다.
         */
        integers.remove(0);



        /*
        ArrayList 길이 보기
        현재 ArrayList의 크기를 알고 싶다면 size() 라는 메소드를 이용해 확인할 수 있습니다.
         */
        integers.size();




        /*
        데이터 합치기
        integers와 integers2 에 각 1, 2 를 추가하고  addAll() 메소드를 사용하여 인자로 다른 ArrayList를 주면 데이터를 합칠 수 잇습니다.
         */
        integers = new ArrayList<>();
        integers2 = new ArrayList<>();

        integers.add(1);
        integers2.add(2);

        integers.addAll(integers2);  // 1, 2




        /*
        반복 : forEach() 메소드를 사용하면 람다식으로 데이터를 하나씩 꺼낼 수 있습니다.
         */
        integers.forEach(integer -> System.out.println(integer));




        /*
        모두 삭제 : clear() 메소드는 ArrayList 안에 있는 모든 데이터를 삭제합니다.
         */
        integers.clear();




        /*
        정렬
        sort() 메소드를 이용하여 람다식으로

        o1 클 경우 1
        반대일 경우 -1
        같을 경우 0 을 리턴해주면 오름차순으로 정렬할 수 있습니다.

        내림차순일 경우 반대로 해주면 됩니다.
         */
        //오름차순
        integers.add(5);
        integers.add(4);
        integers.add(1);
        integers.add(3);

        System.out.println(integers);  // [5, 4, 1, 3]

        integers.sort((o1, o2) -> {
            if(o1 > o2 ) return 1;
            else if(o1 < o2 ) return -1;
            else return 0;
        });

        System.out.println(integers); // [1, 3, 4, 5]


        //내림차순
        integers.sort((o1, o2) -> {
            if(o1 > o2 ) return -1;
            else if(o1 < o2 ) return 1;
            else return 0;
        });

        System.out.println(integers); // [5, 4, 3, 1]



        
        /*
        존재여부 확인 :  contains() 메소드를 사용하여 인자로 ArrayList안에 존재하는지 알고싶은 데이터를 주면 boolean값으로 확인이 가능합니다.
         */
        integers.contains(4);




        /*
        배열로 변경 : toArray() 를 사용하면 현재 ArrayList를 Array로 변경할 수 있습니다. 하지막 Object로만 가능합니다.
         */
        Object[] arr = integers.toArray();
        System.out.println(arr[0]); // 5



        /*
        stream()과 Iterator() 메소드를 사용하면 각 형태로 변화해서 다양하게 활용이 가능합니다.
         */
        integers.iterator();
        integers.stream();
    }
}
