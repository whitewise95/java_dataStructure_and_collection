package java.collection.priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {

		/**
		 * 우선 순위가 오름차순인 최소 힙 우선순위 큐
		 * import java.util.PriorityQueue
		 * */
		PriorityQueue<Integer> minPriorityQueue = new PriorityQueue<>();

		/**
		 * add(), offer() 메소드를 사용해 추가할 수 있습니다.
		 * */
		minPriorityQueue.add(1);
		minPriorityQueue.add(10);
		minPriorityQueue.add(3);
		minPriorityQueue.offer(20);

		/**
		 * peek(), poll(), remove(), clear() 메소드를 사용해 삭제할 수 있습니다..
		 * */
		minPriorityQueue.peek();       // 첫번째 값을 반환만 하고 제거 하지는 않는다. 큐가 비어있다면 null을 반환
		minPriorityQueue.poll();       // priorityQueue에 첫번째 값을 반환하고 제거 비어있다면 null
		minPriorityQueue.remove();     // priorityQueue에 첫번째 값 제거
		minPriorityQueue.clear();      // priorityQueue에 초기화

		/**
		 * 우선 순위가 내림차순인 최대 힙우선순위 큐
		 * import java.util.Collections
		 * */
		PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());
	}
}
