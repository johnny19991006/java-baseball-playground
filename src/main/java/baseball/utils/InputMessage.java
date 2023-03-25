package baseball.utils;

public enum InputMessage {
    INPUT_MESSAGE("숫자를 입력하시오"),
    RESTART_MESSAGE("축하합니다! 경기를 다시 시작하겠습니까? 다시 시작 : 1, 종료 : 2");

    private final String message;

    InputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
