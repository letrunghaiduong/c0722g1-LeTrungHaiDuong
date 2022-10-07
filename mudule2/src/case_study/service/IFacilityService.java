package case_study.service;

import case_study.ultil.WrongInPutException;

import java.io.IOException;

public interface IFacilityService {
    void displayFacility() throws IOException, WrongInPutException;


    void addNewVilla() throws WrongInPutException, IOException;

    void addNewHouse() throws WrongInPutException, IOException;

    void addNewRoom() throws IOException, WrongInPutException;
}
