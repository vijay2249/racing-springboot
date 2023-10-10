package com.f1.racing.data;


import java.time.LocalDate;
import java.util.UUID;

/*
driverId, driverName, teamName, contract end date, retired
 */
public class DriverInfo {
    private long driverId;
    private String driverName;
    private String teamName;
    private LocalDate contractEndDate;
    private boolean isRetired;
    private String uuid;

    public DriverInfo(long driverId, String driverName, String teamName, LocalDate contractEndDate, boolean isRetired) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.teamName = teamName;
        this.contractEndDate = contractEndDate;
        this.isRetired = isRetired;
        this.uuid = UUID.randomUUID().toString();
    }

    public DriverInfo(){
        this.driverId = 00;
        this.driverName = "Dummy Driver";
        this.teamName = "Dummy Team";
        this.contractEndDate = LocalDate.now();
        this.isRetired = true;
        this.uuid = UUID.randomUUID().toString();
    }

    public DriverInfo(DriverInfo driverInfo){
        this.driverId = driverInfo.getDriverId();
        this.driverName = driverInfo.getDriverName();
        this.teamName = driverInfo.getTeamName();
        this.contractEndDate = driverInfo.getContractEndDate();
        this.isRetired = driverInfo.getIsRetired();
        this.uuid = driverInfo.getUuid();
    }

    public String getUuid() {return uuid;}

    public void setUuid(String uuid) {this.uuid = uuid;}

    public long getDriverId() {return driverId;}

    public void setDriverId(long driverId) {this.driverId = driverId;}

    public String getDriverName() {return driverName;}

    public void setDriverName(String driverName) {this.driverName = driverName;}

    public String getTeamName() {return teamName;}

    public void setTeamName(String teamName) {this.teamName = teamName;}

    public LocalDate getContractEndDate() {return contractEndDate;}

    public void setContractEndDate(LocalDate contractEndDate) {this.contractEndDate = contractEndDate;}

    public boolean getIsRetired() {return isRetired;}

    public void setIsRetired(boolean retired) { isRetired = retired;}

    @Override
    public String toString() {
        return "DriversInfo{" +
                "driverId=" + driverId +
                ", driverName='" + driverName + '\'' +
                ", teamName='" + teamName + '\'' +
                ", contractEndDate=" + contractEndDate +
                ", isRetired=" + isRetired +
                '}';
    }
}
