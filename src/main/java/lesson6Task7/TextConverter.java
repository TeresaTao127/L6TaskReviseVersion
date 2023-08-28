package lesson6Task7;

public class TextConverter {
    public static void main(String[] args) {
        convertTextToUppercase("src\\main\\resources\\UppercaseConverter.txt");
    }

    public static void convertTextToUppercase(String filePath) {
        String content = FileUtils.readFromFile(filePath);
        String contentUppercase = content.toUpperCase();
        System.out.println("Content of a file: \n" + contentUppercase);
        lesson6Task7.FileUtils.writeToFile("src\\main\\resources\\UppercaseConversionFinal.txt", contentUppercase);
    }
}
