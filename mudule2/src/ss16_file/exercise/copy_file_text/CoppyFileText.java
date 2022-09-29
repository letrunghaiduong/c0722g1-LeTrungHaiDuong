package ss16_file.exercise.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CoppyFileText {
    public static void main(String[] args) throws IOException {
        List<Character> list = new ArrayList<>();
        File source = new File("src\\ss16_file\\exercise\\copy_file_text\\source.txt");
        File target = new File("src\\ss16_file\\exercise\\copy_file_text\\target.txt");
        BufferedReader reader = new BufferedReader(new  FileReader(source));
        BufferedWriter writer = new BufferedWriter(new FileWriter(target));
        String line;
        try {
            if (!source.exists()) {
                throw new FileNotFoundException();
            }

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
                for (int i = 0; i < line.length(); i++){
                    if (line.charAt(i) != ' '){
                        list.add(line.charAt(i));
                    }
                }
            }
            
            writer.write("Số ký tự: "+list.size());

            reader.close();
            writer.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}
