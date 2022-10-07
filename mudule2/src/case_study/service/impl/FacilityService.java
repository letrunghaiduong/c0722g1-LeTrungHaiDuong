package case_study.service.impl;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.service.IFacilityService;
import case_study.ultil.Check;
import case_study.ultil.WrongInPutException;
import com.sun.javafx.collections.MappingChange;

import java.io.*;
import java.util.*;

public class FacilityService implements IFacilityService {
    Scanner scanner = new Scanner(System.in);
    Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
    List<Villa> villaList = new ArrayList<>();
    List<House> houseList = new ArrayList<>();
    List<Room> roomList = new ArrayList<>();

    @Override
    public void displayFacility() throws IOException {
        villaList = readVilaFile();
        System.out.println("Danh sách Villa");
        for (Facility key: facilityMap.keySet()){
            System.out.println(key);
        }

        houseList = readHouseFile();
        System.out.println("Danh sách House");
        for (Facility key: facilityMap.keySet()){
            System.out.println(key);
        }

        roomList = readRoomFile();
        System.out.println("Danh sách Room");
        for (Facility key: facilityMap.keySet()){
            System.out.println(key);
        }

    }

    @Override
    public void addNewVilla() throws WrongInPutException, IOException {
        villaList = readVilaFile();
        Villa villa = this.infoVilla();
        villaList.add(villa);
        System.out.println("Thêm mới thành công");
        writeVillaFile(villaList);
    }

    @Override
    public void addNewHouse() throws WrongInPutException, IOException {
        houseList = readHouseFile();
        House house = this.infoHouse();
        houseList.add(house);
        System.out.println("Thêm mới thành công");
        writeHouseFile(houseList);
    }

    @Override
    public void addNewRoom() throws IOException, WrongInPutException {
        roomList = readRoomFile();
        Room room = this.infoRoom();
        roomList.add(room);
        System.out.println("Thêm mới thành công");
        writeRoomFile(roomList);
    }

    public static List<Villa> readVilaFile() throws IOException {
        File file = new File("src\\case_study\\data\\villa.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<Villa> villaList = new ArrayList<>();
        Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
        Villa villa;
        String line;
        String[] info;
        while ((line = reader.readLine()) != null) {
            info = line.split(",");
            villa = new Villa(info[0],info[1], Double.parseDouble(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]), info[5], info[6], Double.parseDouble(info[7]), Integer.parseInt(info[8]));
            facilityMap.put(villa,0);
            villaList.add(villa);
        }
        reader.close();
        return villaList;
    }

    private void writeVillaFile(List<Villa> villaList) throws IOException {
        File file = new File("src\\case_study\\data\\villa.csv");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (Villa villa : villaList) {
            writer.write(villa.getInfo());
            writer.newLine();
        }
        writer.close();
    }

    public static List<House> readHouseFile() throws IOException {
        File file = new File("src\\case_study\\data\\house.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<House> houseList = new ArrayList<>();
        Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
        House house;
        String line;
        String[] info;
        while ((line = reader.readLine()) != null) {
            info = line.split(",");
            house = new House(info[0],info[1], Double.parseDouble(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]), info[5], info[6], Integer.parseInt(info[7]));
            houseList.add(house);
            facilityMap.put(house,0);
        }
        reader.close();
        return houseList;
    }

    private void writeHouseFile(List<House> houseList) throws IOException {
        File file = new File("src\\case_study\\data\\house.csv");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (House house : houseList) {
            writer.write(house.getInfo());
            writer.newLine();
        }
        writer.close();
    }

    public static List<Room> readRoomFile() throws IOException {
        File file = new File("src\\case_study\\data\\room.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<Room> roomList = new ArrayList<>();
        Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
        Room room;
        String line;
        String[] info;
        while ((line = reader.readLine()) != null) {
            info = line.split(",");
            room = new Room(info[0],info[1], Double.parseDouble(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]), info[5], info[6]);
            roomList.add(room);
            facilityMap.put(room,0);
        }
        reader.close();
        return roomList;
    }

    private void writeRoomFile(List<Room> roomList) throws IOException {
        File file = new File("src\\case_study\\data\\room.csv");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (Room room : roomList) {
            writer.write(room.getInfo());
            writer.newLine();
        }
        writer.close();
    }

    private Villa infoVilla()  throws WrongInPutException{
        String nameService;
        String serviceCode;
        double usableArea;
        double rentCost;
        int numberOfPeople;
        String rentType;
        String roomStandard;
        double poolArea;
        int numberOfFloors;
        while (true) {
            try {
                System.out.println("Mời bạn nhập dịch vụ muốn thuê: ");
                nameService = scanner.nextLine();
                Check.checkNameService(nameService);
                break;
            } catch (WrongInPutException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true){
            try {
                System.out.println("Mời bạn nhập mã dịch vụ: ");
                serviceCode = scanner.nextLine();
                Check.checkServiceCodeVilla(serviceCode);
                break;
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập diện tích sử dụng: ");
                usableArea = Double.parseDouble(scanner.nextLine());
                Check.checkArea(usableArea);
                break;
            } catch (WrongInPutException e) {
                System.out.println(e.getMessage());
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập chi phí thuê: ");
                rentCost = Double.parseDouble(scanner.nextLine());
                Check.checkCost(rentCost);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập số người tối đa : ");
                numberOfPeople = Integer.parseInt(scanner.nextLine());
                Check.checkNumberPeople(numberOfPeople);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập kiểu thuê(Ngày / Tháng / Năm) : ");
                rentType = scanner.nextLine();
                Check.checkRentType(rentType);
                break;
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập tiêu chuển phòng(Vip/Normal) : ");
                roomStandard = scanner.nextLine();
                Check.checkRoomStandard(roomStandard);
                break;
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập diện tích hồ bơi: ");
                poolArea = Double.parseDouble(scanner.nextLine());
                Check.checkArea(poolArea);
                break;
            } catch (WrongInPutException e) {
                System.out.println("Diện tích không đúng, nhập lại: ");
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập số tầng : ");
                numberOfFloors = Integer.parseInt(scanner.nextLine());
                Check.checkNumberOfFloors(numberOfFloors);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Số tầng không đúng, nhập lại: ");
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        Villa villa = new Villa(nameService, serviceCode, usableArea, rentCost, numberOfPeople, rentType, roomStandard, poolArea, numberOfFloors);
        return villa;

    }
    private House infoHouse()throws WrongInPutException{
        String nameService;
        String serviceCode;
        double usableArea;
        double rentCost;
        int numberOfPeople;
        String rentType;
        String roomStandard;
        int numberOfFloors;
        while (true) {
            try {
                System.out.println("Mời bạn nhập dịch vụ muốn thuê: ");
                nameService = scanner.nextLine();
                Check.checkNameService(nameService);
                break;
            } catch (WrongInPutException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true){
            try {
                System.out.println("Mời bạn nhập mã dịch vụ: ");
                serviceCode = scanner.nextLine();
                Check.checkServiceCodeVilla(serviceCode);
                break;
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập diện tích sử dụng: ");
                usableArea = Double.parseDouble(scanner.nextLine());
                Check.checkArea(usableArea);
                break;
            } catch (WrongInPutException e) {
                System.out.println(e.getMessage());
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập chi phí thuê: ");
                rentCost = Double.parseDouble(scanner.nextLine());
                Check.checkCost(rentCost);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập số người tối đa : ");
                numberOfPeople = Integer.parseInt(scanner.nextLine());
                Check.checkNumberPeople(numberOfPeople);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập kiểu thuê(Ngày / Tháng / Năm) : ");
                rentType = scanner.nextLine();
                Check.checkRentType(rentType);
                break;
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập tiêu chuển phòng(Vip/Normal) : ");
                roomStandard = scanner.nextLine();
                Check.checkRoomStandard(roomStandard);
                break;
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập số tầng : ");
                numberOfFloors = Integer.parseInt(scanner.nextLine());
                Check.checkNumberOfFloors(numberOfFloors);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Số tầng không đúng, nhập lại: ");
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        House house = new House(nameService,serviceCode, usableArea, rentCost, numberOfPeople, rentType,roomStandard,numberOfFloors);
        return house;
    }
    private Room infoRoom() throws WrongInPutException{
        String nameService;
        String serviceCode;
        double usableArea;
        double rentCost;
        int numberOfPeople;
        String rentType;
        String freeService;
        while (true) {
            try {
                System.out.println("Mời bạn nhập dịch vụ muốn thuê: ");
                nameService = scanner.nextLine();
                Check.checkNameService(nameService);
                break;
            } catch (WrongInPutException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true){
            try {
                System.out.println("Mời bạn nhập mã dịch vụ: ");
                serviceCode = scanner.nextLine();
                Check.checkServiceCodeVilla(serviceCode);
                break;
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập diện tích sử dụng: ");
                usableArea = Double.parseDouble(scanner.nextLine());
                Check.checkArea(usableArea);
                break;
            } catch (WrongInPutException e) {
                System.out.println(e.getMessage());
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập chi phí thuê: ");
                rentCost = Double.parseDouble(scanner.nextLine());
                Check.checkCost(rentCost);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập số người tối đa : ");
                numberOfPeople = Integer.parseInt(scanner.nextLine());
                Check.checkNumberPeople(numberOfPeople);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Mời bạn nhập kiểu thuê(Ngày / Tháng / Năm) : ");
                rentType = scanner.nextLine();
                Check.checkRentType(rentType);
                break;
            }catch (WrongInPutException e){
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            System.out.println("Mời bạn nhập dịch vụ đi kèm : ");
            freeService = scanner.nextLine();
            break;
        }
        Room room = new Room(nameService, serviceCode, usableArea, rentCost, numberOfPeople, rentType,freeService);
        return room;
    }
}
