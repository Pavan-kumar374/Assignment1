import java.util.*;
class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
    }

    public static void main(String[] args) {
        try {
            int num = -5;
            validateNumber(num);
            System.out.println("Number is valid: " + num);
        } catch (CustomValidationException e) {
            System.out.println("Custom Validation Exception: " + e.getMessage());
        }
    }
}