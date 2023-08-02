package studyAlgorithm.level_1;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/159994
 */
public class 카드뭉치 {

	public static void main(String[] args) {
		System.out.println(solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
		System.out.println(solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
	}

	public static String solution(String[] cards1s, String[] cards2s, String[] goals) {
		String answer = "";
		List<String> answers = new ArrayList<>();

		int index = 0;
		boolean isCards1s = true;

		int maxIndex = Math.max(cards1s.length, cards2s.length);

		for (String goal : goals) {
			if (isCards1s && cards1s.length -1 > index && cards1s[index++].equals(goal)) {
			}


			if (maxIndex == index) {
				break;
			}
		}

		return answer;
	}
}
