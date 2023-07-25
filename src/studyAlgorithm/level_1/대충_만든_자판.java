package studyAlgorithm.level_1;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/160586
 * */
public class 대충_만든_자판 {

	public static void main(String[] args) {
		print(solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD","AABB"}));
		print(solution(new String[]{"AA"}, new String[]{"B"}));
		print(solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA","BGZ"}));
	}

	public static void print(int[] answer){
		for (int i : answer) {
			System.out.println(i);
		}
	}

	public static int[] solution(String[] keymap, String[] targets) {
		int[] answer = {};

		for (String target : targets) {
			String[] split = target.split("");
			

			for (String key : keymap) {

			}
		}




		return answer;
	}
}
