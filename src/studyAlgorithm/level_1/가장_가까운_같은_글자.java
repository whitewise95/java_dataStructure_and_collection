package studyAlgorithm.level_1;

import java.util.HashMap;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/142086
 * */
public class 가장_가까운_같은_글자 {

	public static void main(String[] args) {
		print(solution("banana"));
		print(solution("foobar"));
	}
	
	public static void print(int[] s){
		for (int i : s) {
			System.out.println(i);
		}
		System.out.println("==========================");
	}

	public static int[] solution(String 단어) {
		int[] answer = new int[단어.length()];
		int index = 0;
		HashMap<String, Integer> map = new HashMap<>();
		
		String[] 스펠링모음 = 단어.split("");
		for (String 스펠링 : 스펠링모음) {
			if (map.get(스펠링) == null) {
				map.put(스펠링, index);
				answer[index++] = -1;
			} else {
				Integer value = map.get(스펠링);
				map.put(스펠링, index);
				answer[index] = index - value;
				index++;
			}
		}

		return answer;
	}

	/**
	 * 다른사람풀이
	 * charAt이라는 함수와 map의 getOrDefault 메소드를 알수 있눈 계기가 되었다. 내가 작성한 코드도 getOrDefault를 활용했다면 if else가 필요없는 코드가 되었을 텐데 아쉽다.
	 * */
	public static int[] solution2(String s) {
		int[] answer = new int[s.length()];
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0; i<s.length();i++){
			char ch = s.charAt(i);
			answer[i] = i-map.getOrDefault(ch,i+1);
			map.put(ch,i);
		}
		return answer;
	}
}
