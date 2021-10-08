import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void copyFile(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            FileWriter fileWriter = new FileWriter("Copyfile.txt");
            BufferedReader load = new BufferedReader(fileReader);
            int charr;
            while ((charr = load.read()) != -1) {
                fileWriter.write(charr);
            }
            load.close();
            fileWriter.close();
        }catch (Exception e) {
            System.err.println("File không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        copyFile(path);
    }
}
