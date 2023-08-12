package studyAlgorithm.level_1;

import java.util.HashMap;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/178871
 * players와 callings의 길이가 1,000,000까지 갈 수 있기 때문에 현재는 Map을 사용해 풀었지만 List와 LinkedList를 사용했을 땐 시간초과가 발생했다.
 * 만약 로직구현중 시간이 오래걸리는 로직이 있다면 이렇게도 활요해볼 수 있을 것 같다.
 */
public class 달리기경주 {

	public static void main(String[] args) {
		String[] solution = solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"});

		for (String s : solution) {
			System.out.println(s);
		}
	}

	public static String[] solution(String[] players, String[] callings) {
		String[] an = new String[players.length];
		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < players.length; i++) {
			an[i] = players[i];
			map.put(players[i], i);
		}

		for (String calling : callings) {
			if (map.get(calling) != 0) {
				int j = map.get(calling);

				String s1 = an[j - 1];
				String s = an[j];
				an[j] = s1;
				an[j - 1] = s;

				map.put(s1, j);
				map.put(s, j -1);
			}
		}

		return an;
	}
}
