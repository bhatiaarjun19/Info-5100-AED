/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author maverick1997
 */
public class CarDetails {
    private String brand;
    private String model;
    private String Color;
    private String date;
    private String engineNo;
    private int seats;
    private String plates;
    private String Name;
    private String PhoneNumber;
    private String Email;
    private String ownerID;
    private String SSN;
    private String address;
    private String ServiceRecords;
    private String WarrantyYears;
    private Image photo;

    public CarDetails() {
    }

    public CarDetails(String brand, String model, String Color, String date, String engineNo, int seats, String plates, String Name, String PhoneNumber, String Email, String ownerID, String SSN, String address, String ServiceRecords, String WarrantyYears, Image photo) {
        this.brand = brand;
        this.model = model;
        this.Color = Color;
        this.date = date;
        this.engineNo = engineNo;
        this.seats = seats;
        this.plates = plates;
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.ownerID = ownerID;
        this.SSN = SSN;
        this.address = address;
        this.ServiceRecords = ServiceRecords;
        this.WarrantyYears = WarrantyYears;
        this.photo = photo;
    }
    
    

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }

   


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getPlates() {
        return plates;
    }

    public void setPlates(String plates) {
        this.plates = plates;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getServiceRecords() {
        return ServiceRecords;
    }

    public void setServiceRecords(String ServiceRecords) {
        this.ServiceRecords = ServiceRecords;
    }

    public String getWarrantyYears() {
        return WarrantyYears;
    }

    public void setWarrantyYears(String WarrantyYears) {
        this.WarrantyYears = WarrantyYears;
    }
       
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public String toString(){
        return plates;
    }

    
}
