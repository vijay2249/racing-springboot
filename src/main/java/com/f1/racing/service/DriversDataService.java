package com.f1.racing.service;

import com.f1.racing.data.DriverInfo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class DriversDataService {
    private static List<DriverInfo> driversInfoList = new ArrayList<>();

    static {
        driversInfoList.add(new DriverInfo(4, "Lando Norris", "McLaren F1 Racing", LocalDate.now().plusYears(2), false));
        driversInfoList.add(new DriverInfo(81, "Oscar Piastri", "McLaren F1 Racing", LocalDate.now().plusYears(3), false));
        driversInfoList.add(new DriverInfo(1, "Max Verstappen", "Redbull Honda F1 Racing team", LocalDate.now().plusYears(5), false));
    }

    public List<DriverInfo> getDriversInfoList(){ return driversInfoList; }

    public void addDriverInfo(DriverInfo driverInfo){
        driversInfoList.add(driverInfo);
    }
    
    public void deleteDriver(String uuid){
        //stings are objects in java - for comparisions you need to use methods
        driversInfoList.removeIf(driverInfo -> driverInfo.getUuid().equals(uuid));
    }
}
