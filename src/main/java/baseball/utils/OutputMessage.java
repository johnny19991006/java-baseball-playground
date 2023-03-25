package baseball.utils;

public enum OutputMessage {
    STRIKE("스트라이크"),
    BALL("볼"),
    NOTHING("낫씽");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
