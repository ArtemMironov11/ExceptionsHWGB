package HW3;

public class DataFormatException extends Exception {
    public void dataException(String massage) {
        System.out.printf("Не корректный формат ", massage);
    }
}