package studyAlgorithm.level_1;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/159994
 * 실패
 * 느낌점 - 모든 파라미터에게 반복문 사용하는 것보다 if - else if -  else 문과 index를 이용해서 자연스럽게 반복할 수 있다는 것을 느낄 수 있었다.
 */
public class 카드뭉치 {

	public static void main(String[] args) {
		System.out.println(solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
		System.out.println(solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
		System.out.println(solution(new String[]{"you", "smarter"}, new String[]{"think", "more", "will", "be"}, new String[]{"think", "more", "you", "will", "be", "smarter"}));
	}

	public static String solution(String[] cards1s, String[] cards2s, String[] goals) {
		int index1 = 0;
		int index2 = 0;

		for (String goal : goals) {
			if (index1 < cards1s.length && goal.equals(cards1s[index1])) {
				index1++;
			} else if (index2 < cards2s.length && goal.equals(cards2s[index2])) {
				index2++;
			} else {
				return "No";
			}
		}
		return "Yes";
	}
}
