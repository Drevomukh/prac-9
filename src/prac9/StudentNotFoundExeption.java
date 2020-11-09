package prac9;

public class StudentNotFoundExeption extends RuntimeException {
    public StudentNotFoundExeption(String errorMessage, Throwable err) {
        super(errorMessage,err);
    }
}