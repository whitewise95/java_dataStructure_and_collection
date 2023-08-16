package studyAlgorithm.level_1;

import java.util.HashMap;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/133499 다시풀기
 */
public class 옹알이2 {

	private static HashMap<String, String> babblingMap = new HashMap<>();

	public static void generateCombinations(String[] words, String currentWord, int remainingCombine, String word) {
		if (remainingCombine == 0) {
			return;
		}

		for (int i = 0; i < words.length; i++) {
			if (!word.equals(words[i])) {
				String newWord = currentWord + words[i];
				babblingMap.put(newWord, newWord);
				generateCombinations(words, newWord, remainingCombine - 1, words[i]);
			}

		}
	}

	public static void main(String[] args) {
		System.out.println(solution(new String[]{"aya", "yee", "u", "maa"}));
		System.out.println(solution(new String[]{"ayayeayayeaya"}));
		System.out.println(solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
	}

	public static int solution2(String[] babbling) {
		String[] words = {"aya", "ye", "woo", "ma"};
		generateCombinations(words, "", words.length, "");

		int answer = 0;

		for (String s : babbling) {
			if (babblingMap.get(s) != null) {
				answer++;
			}
		}

		return answer;
	}

	/**
	 * 굳이... 조합하는 단어를 만들지 않고 헤당단어들로만 replace를 해줌으로써 해당단어가 있을 경우 빈문자열로 만드는 방법이다... 이런 방법 생각할 수 있는 사고력을 길러야한다...
	 * */
	public static int solution(String[] babblings) {
		int answer = 0;
		for(int i = 0; i < babblings.length; i++) {
			if(babblings[i].contains("ayaaya") || babblings[i].contains("yeye") || babblings[i].contains("woowoo") || babblings[i].contains("mama")) {
				continue;
			}

			babblings[i] = babblings[i].replace("aya", " ");
			babblings[i] = babblings[i].replace("ye", " ");
			babblings[i] = babblings[i].replace("woo", " ");
			babblings[i] = babblings[i].replace("ma", " ");
			babblings[i] = babblings[i].replace(" ", "");

			if(babblings[i].length()  == 0) answer++;

		}
		return answer;
	}
}
