/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srs_aicop;

/**
 *
 * @author Shefali Anand
 */
public class CarOwner {
    String ownerName;
    String ownerAddress;
    String registrationNo;
    String phoneNumber;
    String carModel;
    String licenceNumber;
    String plateNumber;
    String carType;

    public CarOwner(String ownerName, String ownerAddress, String registrationNo, String phoneNumber, String carModel, String licenceNumber, String plateNumber, String carType) {
        this.ownerName = ownerName;
        this.ownerAddress = ownerAddress;
        this.registrationNo = registrationNo;
        this.phoneNumber = phoneNumber;
        this.carModel = carModel;
        this.licenceNumber = licenceNumber;
        this.plateNumber = plateNumber;
        this.carType = carType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getCarType(){
        return carType;
    }

    public String display() {
        String ans = "Car Owner Name : " + ownerName +
                "\nCar Owner Address : " + ownerAddress +
                "\nRegistration Number : " + registrationNo +
                "\nPhone Number : " + phoneNumber +
                "\nCar Model : " + carModel +
                "\nLicence Number : " + licenceNumber +
                "\nPlate Number : " + plateNumber +
                "\nCar Type: " + carType;
                
        return ans;
    }
}
