package studyAlgorithm.level_1;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/133502
 */
public class 햄버거만들기 {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
		System.out.println(solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}));
	}


	public static Integer solution(int[] ingredient) {
		return isHamburger(ingredient, 0, ingredient.length, 0);
	}


	public static Integer isHamburger(int[] ingredient, Integer start, Integer end, Integer answer) {
		Integer newStart = 0;
		Integer newEnd;

		for (Integer i = start; i < end;) {
			Boolean isHamburger = isCheck(setupCheckList(ingredient, start, Math.min(ingredient.length, start + 4)));
			int[] newIngredient;
			if (isHamburger) {
				answer++;
				newIngredient = createIngredient(ingredient, i, i + 4);
				newEnd = newIngredient.length;
			} else {
				newStart = ++i;
				newIngredient = ingredient;
				newEnd = end;
			}

			return isHamburger(newIngredient, newStart, newEnd, answer);
		}

		return answer;
	}

	public static Boolean isCheck(int[] checkList) {
		if (checkList != null) {
			return checkList[0] == 1 && checkList[1] == 2 && checkList[2] == 3 && checkList[3] == 1;
		}
		return false;
	}

	public static int[] createIngredient(int[] ingredient, Integer start, Integer end) {
		int[] newIngredient = new int[ingredient.length - (end - start)];

		Integer index = 0;
		for (Integer i = 0; i < start; i++) {
			newIngredient[index++] = ingredient[i];
		}

		for (Integer i = end; i < ingredient.length; i++) {
			newIngredient[index++] = ingredient[i];
		}

		return newIngredient;
	}

	public static int[] setupCheckList(int[] ingredient, Integer start, Integer end) {
		if (ingredient[start] != 1 || ingredient.length < 4) {
			return null;
		}
		int[] checkList = new int[4];

		Integer index = 0;
		for (Integer i = start; i < end; i++) {
			int i1 = ingredient[i];
			checkList[index++] = i1;
		}

		return checkList;
	}
}
