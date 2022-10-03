package case_study.service.impl;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.service.IFacilityService;

import java.io.*;
import java.util.*;

public class FacilityService implements IFacilityService {
    Scanner scanner = new Scanner(System.in);
    Map<String, Integer> map = new LinkedHashMap<>();
    List<Villa> villaList = new ArrayList<>();
    List<House> houseList = new ArrayList<>();
    List<Room> roomList = new ArrayList<>();
    List<Facility> facilityList = new ArrayList<>();

    @Override
    public void displayFacility() throws IOException {
        villaList = readFileVila();
        System.out.println("Danh sách villa");
        for (Villa villa: villaList){
            System.out.println(villa.toString());
        }
        houseList = readHouseFile();
        System.out.println("Danh sách house");
        for (House house: houseList){
            System.out.println(house.toString());
        }
        roomList = readRoomFile();
        System.out.println("Danh sách room");
        for (Room room: roomList){
            System.out.println(room.toString());
        }
    }



    private List<Villa> readFileVila() throws IOException {
        File file = new File("src\\case_study\\data\\villa.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<Villa> villaList = new ArrayList<>();
        Villa villa;
        String line;
        String[] info;
        while ((line = reader.readLine()) != null) {
            info = line.split(",");
            villa = new Villa(info[0],Double.parseDouble(info[1]),Double.parseDouble(info[2]),Integer.parseInt(info[3]),info[4],info[5],Double.parseDouble(info[6]),Integer.parseInt(info[7]));
            villaList.add(villa);
        }
        reader.close();
        return villaList;
    }
    private List<House> readHouseFile() throws IOException {
        File file = new File("src\\case_study\\data\\house.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<House> houseList = new ArrayList<>();
        House house;
        String line;
        String[] info;
        while ((line = reader.readLine()) != null) {
            info = line.split(",");
            house = new House(info[0],Double.parseDouble(info[1]),Double.parseDouble(info[2]),Integer.parseInt(info[3]),info[4],info[5],Integer.parseInt(info[6]));
            houseList.add(house);
        }
        reader.close();
        return houseList;
    }
    private List<Room> readRoomFile() throws IOException {
        File file = new File("src\\case_study\\data\\room.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<Room> roomList = new ArrayList<>();
        Room room;
        String line;
        String[] info;
        while ((line = reader.readLine()) != null) {
            info = line.split(",");
            room = new Room(info[0],Double.parseDouble(info[1]),Double.parseDouble(info[2]),Integer.parseInt(info[3]),info[4],info[5]);
            roomList.add(room);
        }
        reader.close();
        return roomList;
    }
    private void writeFacilityFile() throws IOException {
        File file = new File("src\\case_study\\data\\facility.csv");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (Facility facility: facilityList){
            writer.write(facility.toString());
            writer.newLine();
        }
        writer.close();
    }
}
