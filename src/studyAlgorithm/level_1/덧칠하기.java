package studyAlgorithm.level_1;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/161989
 */
public class 덧칠하기 {

	public static void main(String[] args) {
		System.out.println(solution(8, 4, new int[]{2, 3, 6}));
		System.out.println(solution(5, 4, new int[]{1, 3}));
		System.out.println(solution(4, 1, new int[]{1, 2, 3, 4}));
	}

	public static int solution(int n, int m, int[] section) {
		int answer = 0;

		for (int i = 0; i < section.length - 1; ) {
			for (int j = i + 1; j < section.length; j++) {
				if (section[j] - section[i] > m - 1) {
					answer++;
					i = j;
					break;
				}

				if (j == section.length-1) {
					return ++answer;
				}
			}
		}

		return ++answer;
	}

	/**
	 * 2중 for문을 피할 수 있다는 거에 뒤통수를 맞은것 같다. 좀 만 더 깊게 생각하고 조금만 더 느리게 해보자
	 * */
	public static int solution2(int n, int m, int[] section) {
		int answer = 1;
		int start = section[0];
		for(int i=1; i<section.length;i++){
			if(section[i]>start+m-1){
				answer++;
				start = section[i];
			}
		}
		return answer;
	}
}
