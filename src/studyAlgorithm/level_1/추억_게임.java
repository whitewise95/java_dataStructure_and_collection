package studyAlgorithm.level_1;

import java.util.HashMap;
import java.util.Map;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/176963
 */
public class 추억_게임 {

	public static void main(String[] args) {

		pint(solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}}));
		pint(solution(new String[]{"kali", "mari", "don"}, new int[]{11, 1, 55}, new String[][]{{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}}));
		pint(solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}}));

	}

	private static void pint(int[] solution) {
		for (int i : solution) {
			System.out.println(i);
		}
		System.out.println("======================================");
	}

	public static int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer  = new int[photo.length];
		Map<String,Integer> map = new HashMap<>();

		int index = 0;
		while (index < name.length){
			map.put(name[index], yearning[index]);
			index++;
		}

		index = 0;
		for (String[] photo1 : photo) {
			for (String photo2 : photo1) {
				Integer score = map.get(photo2);
				if (score != null){
					answer[index] = answer[index] + score;
				}
			}
			index++;
		}
		return answer;
	}
}
