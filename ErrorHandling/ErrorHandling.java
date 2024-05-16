package ErrorHandling;
import java.util.Optional;
import java.io.*;
    
class ErrorHandling {
    void handleErrorByThrowingIllegalArgumentException() {
        throw new IllegalArgumentException();
    }
    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
    }
    void handleErrorByThrowingAnyCheckedException() throws IOException {
        throw new IOException();
    }
    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws FileNotFoundException {
        throw new FileNotFoundException(message);
    }
    void handleErrorByThrowingAnyUncheckedException() {
        throw new ArrayIndexOutOfBoundsException();
    }
    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        throw new NullPointerException(message);
    }
    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException {
         throw new CustomCheckedException();
    }
    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
        throw new CustomCheckedException(message);
    }
    void handleErrorByThrowingCustomUncheckedException() {
        throw new CustomUncheckedException();
    }
    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        throw new CustomUncheckedException(message);
    }
    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        try {
            return Optional.of(Integer.valueOf(integer));
        }
        catch(NumberFormatException e) {
            return Optional.empty();
        }
    }
}