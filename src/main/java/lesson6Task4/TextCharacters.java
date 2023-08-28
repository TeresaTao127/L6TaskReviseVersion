package lesson6Task4;

public class TextCharacters {
    public static void main(String[] args) {
        calculateTextLength("src\\main\\resources\\TextCharacters.txt");
    }

    public static void calculateTextLength(String filePath) {
        String content = FileUtils.readFromFile(filePath);
        System.out.println(content.length());
    }
}
