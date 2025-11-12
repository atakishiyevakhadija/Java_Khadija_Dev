package ExceptionHandling;

public class ThrowsMain {
    static void checkFile() throws Exception {
        throw new Exception("Файл не найден");
    }

    public static void main(String[] args) {
        try {
            checkFile();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}