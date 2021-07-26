/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HouseIn3d;



/**
 *
 * @author ragonba3
 */
    public class HouseIn3d {
    
    
    private String nameOfStreet;
    private int numberOFStreet;
    private String descriptionOfProperty;
    private int numberOfLivingRooms;
    private int numberOfBedrooms;
    private double squareFootage;
    private int numberOfBathrooms;
    private walls walls;

    public String getNameOfStreet() {
        return nameOfStreet;
    }

    public void setNameOfStreet(String nameOfStreet) {
        this.nameOfStreet = nameOfStreet;
    }

    public String getDescriptionOfProperty() {
        return descriptionOfProperty;
    }

    public void setDescriptionOfProperty(String descriptionOfProperty) {
        this.descriptionOfProperty = descriptionOfProperty;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }

    public void setNumberOfLivingRooms(int numberOfLivingRooms) {
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public walls getWalls() {
        return walls;
    }

    public void setWalls(walls walls) {
        this.walls = walls;
    }
    
}

