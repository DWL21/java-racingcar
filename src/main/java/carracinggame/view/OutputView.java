package carracinggame.view;

import carracinggame.domain.CarNames;

import java.util.ArrayList;

public class OutputView {

    public static final String ENTER_CAR_NAMES = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    public static final String WHAT_TIMES = "시도할 횟수는 몇회인가요?";
    public static final String TIMES_ERROR = "[ERROR] 시도 횟수는 양수인 정수여야 합니다. 다시 입력해주세요.";
    public static final String RESULT = "실행결과";
    public static final String NAME_AND_POSITION_DELIMITER = " : ";
    public static final String DISTANCE_OUTPUT = "-";
    public static final String WINNER_SEPARATOR = ", ";
    public static final String FINAL_WINNER_MESSAGE = "가 최종 우승했습니다.";

    public static void printEnterCarNames() {
        System.out.println(ENTER_CAR_NAMES);
    }

    public static void printWhatTimes() {
        System.out.println(WHAT_TIMES);
    }

    public static void println(String message) {
        System.out.println(message);
    }

    public static void printTimesError() {
        System.out.println(TIMES_ERROR);
    }

    public static void printResultMessage() {
        System.out.println(RESULT);
    }

    public static void println() {
        System.out.println();
    }

    public static void printResult(String name, int position) {
        System.out.print(name + NAME_AND_POSITION_DELIMITER);
        while (position-- > 0) {
            System.out.print(DISTANCE_OUTPUT);
        }
        System.out.println();
    }

    public static void printWinners(ArrayList<String> winners) {
        for (int i = 0; i < winners.size() - 1; i++) {
            System.out.print(winners.get(i) + WINNER_SEPARATOR);
        }
        System.out.println(winners.get(winners.size() - 1) + FINAL_WINNER_MESSAGE);
    }
}
