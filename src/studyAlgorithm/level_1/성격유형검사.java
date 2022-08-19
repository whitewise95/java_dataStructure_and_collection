package studyAlgorithm.level_1;

import java.util.*;

/*
*   https://school.programmers.co.kr/learn/courses/30/lessons/118666
*
* */
public class 성격유형검사 {
    private static Map<String, Integer> characterMap = new HashMap<>();

    public static void main(String[] args) {

        System.out.println(solution(new String[] { "AN", "CF", "MJ", "RT", "NA" }, new int[] { 5, 3, 2, 7, 5 }));
    }

    public static String solution(String[] survey, int[] choices) {
        return characterSurvey(survey, choices);
    }

    public static String characterSurvey(String[] survey, int[] choices) {
        setting();
        for (int i = 0; i < survey.length; i++) {
            characterChoice(survey[i], choices[i]);
        }
        return characterSum();
    }

    private static String characterSum() {
        StringBuilder stringBuilder = new StringBuilder();

        if (characterMap.get("R") >= characterMap.get("T"))
            stringBuilder.append("R");
        else
            stringBuilder.append("T");

        if (characterMap.get("C") >= characterMap.get("F"))
            stringBuilder.append("C");
        else
            stringBuilder.append("F");

        if (characterMap.get("J") >= characterMap.get("M"))
            stringBuilder.append("J");
        else
            stringBuilder.append("M");

        if (characterMap.get("A") >= characterMap.get("N"))
            stringBuilder.append("A");
        else
            stringBuilder.append("N");
        return stringBuilder.toString();
    }

    private static void characterChoice(String survey, int choice) {
        String[] character = survey.split("");
        int firstCharacterCount = characterMap.get(character[0]);
        int secondCharacterCount = characterMap.get(character[1]);

        switch (choice) {
        case 1:
            characterMap.put(character[0], firstCharacterCount + 3);
            break;
        case 2:
            characterMap.put(character[0], firstCharacterCount + 2);
            break;
        case 3:
            characterMap.put(character[0], firstCharacterCount + 1);
            break;
        case 5:
            characterMap.put(character[1], secondCharacterCount + 1);
            break;
        case 6:
            characterMap.put(character[1], secondCharacterCount + 2);
            break;
        case 7:
            characterMap.put(character[1], secondCharacterCount + 3);
            break;
        }
    }

    public static void setting() {
        characterMap.put("A", 0);
        characterMap.put("C", 0);
        characterMap.put("F", 0);
        characterMap.put("J", 0);
        characterMap.put("N", 0);
        characterMap.put("R", 0);
        characterMap.put("M", 0);
        characterMap.put("T", 0);
    }
}
