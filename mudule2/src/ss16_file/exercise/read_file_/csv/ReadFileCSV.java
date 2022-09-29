package ss16_file.exercise.read_file_.csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\ss16_file\\exercise\\read_file_\\csv\\country.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        List<Country> list = new ArrayList<>();
        String line;
        String[] info;
        Country country;
        while ((line = reader.readLine()) != null){
            info = line.split(",");
            country = new Country(Integer.parseInt(info[0]), info[1], info[2]);
            list.add(country);
        }

        for (Country n : list){
            System.out.println(n);
        }
        reader.close();
    }
}
