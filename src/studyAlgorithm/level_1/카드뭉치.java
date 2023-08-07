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
		List<String> answers = new ArrayList<>();
		int index1 = 0;
		int index2 = 0;
		int index3 = 0;
		Boolean isCards1 = true;

		int maxIndex = Math.max(cards1s.length, cards2s.length);

		for (int i = 0; i < goals.length; ) {

			if (isCards1) {
				int addIndex = setup(cards1s, goals[i], answers, index1);
				if (addIndex - index1 > 0) {
					index1 = addIndex;
					i++;
				} else {
					isCards1 = false;
				}

			} else {
				int addIndex = setup(cards2s, goals[i], answers, index2);
				if (addIndex - index2 > 0) {
					index2 = addIndex;
					i++;
				} else {
					isCards1 = true;
				}

			}

			if (maxIndex <= index1 && maxIndex <= index2 || index3 > cards1s.length + cards2s.length) {
				break;
			}
			index3++;
		}

		return answers.size() == goals.length ? "YES" : "NO";
	}

	public static Integer setup(String[] cards, String goal, List<String> answers, int index) {
		if (index > cards.length) {
			return index;
		}

		for (int i = index; i < cards.length; i++) {
			if (goal.equals(cards[index])) {
				answers.add(cards[index]);
				index++;
			} else {
				break;
			}
		}
		return index;
	}
}
