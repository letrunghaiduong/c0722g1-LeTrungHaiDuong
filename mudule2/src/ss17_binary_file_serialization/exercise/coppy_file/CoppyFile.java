package ss17_binary_file_serialization.exercise.coppy_file;

import java.io.*;



public class CoppyFile implements Serializable{
    public static void main(String[] args) throws IOException {
        try {
            File filesource = new File("src\\ss17_binary_file_serialization\\exercise\\coppy_file\\sourceFile.csv");
            if (!filesource.exists()){
                System.out.println("File không tồn tại");
            }
            FileOutputStream fileOutputStream = new FileOutputStream(filesource);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject("Lê Trung Hải Dương");
            objectOutputStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        try {

            FileOutputStream fileOutputStream = new FileOutputStream("src\\ss17_binary_file_serialization\\exercise\\coppy_file\\tagetFile.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            FileInputStream fileInputStream = new FileInputStream("src\\ss17_binary_file_serialization\\exercise\\coppy_file\\sourceFile.csv");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            String string = (String) objectInputStream.readObject();
            objectOutputStream.writeObject(string);
            long size = fileOutputStream.getChannel().size();
            
            System.out.println("Số byte trong file là: " + size);

            objectInputStream.close();
            objectOutputStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
