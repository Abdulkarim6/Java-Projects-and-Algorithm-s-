public class EvenNumberException extends RuntimeException {
    EvenNumberException(String message) {
        super(message);
        System.out.println("I'm at EvenNumber Exception!!");
    }
}