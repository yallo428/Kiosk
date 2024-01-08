package exception;

public class InvalidChoiceException extends RuntimeException{
    public InvalidChoiceException() {
        super("잘못된 선택입니다.");
    }
}
