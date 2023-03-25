package baseball.utils;

public enum ExceptionMessage {

    INPUT_INVALID("1혹은2중에 입력하시오"),
    INPUT_ERROR_SIZE("숫자의 크기가 맞지않습니다.(3자리입력) 다시입력하시오"),
    INPUT_ERROR_AGAIN("숫자가 중복되었습니다. 다시입력하시오"),
    INPUT_ERROR_RANGE("숫자의 범위가 맞지 않습니다.(숫자의 범위는 1~9) 다시 입력하시오");

    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
