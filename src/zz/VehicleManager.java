package zz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class VehicleManager {
	List<ICar> vehicles = new ArrayList<>();

	// Function to add a new car
	void addCar() {
		Scanner sc = new Scanner(System.in);

		String ID;

		String brand;

		int publishYear = 0;

		double price;

		String color;

		int slots = 0;
		String engineType;
		System.out.println("Nhập id xe: ");
		ID = sc.nextLine();
		System.out.println("Nhạp thương hiệu xe: ");
		brand = sc.nextLine();
		System.out.println("Nhập năm Xuất: ");
		publishYear = sc.nextInt();
		System.out.println("Nhập giá bán: ");
		price = sc.nextDouble();
		System.out.println("Nhập màu xe: ");
		color = sc.nextLine();
		System.out.println("Nhập số chỗ ngồi:");
		slots = sc.nextInt();
		System.out.println("Nhập vào động cơ:");
		engineType = sc.next();
		vehicles.add(new Car(ID, brand, publishYear, price, color, slots, engineType));
	}

	// Function to add a new motorcycle
	void addMotorcycle() {
		Scanner sc = new Scanner(System.in);
		String ID;
		String brand;
		int publishYear;
		double price;
		String color;
		int capacity;
		System.out.println("Nhập id xe: ");
		ID = sc.nextLine();
		System.out.println("Nhạp thương hiệu xe: ");
		brand = sc.nextLine();
		System.out.println("Nhập năm Xuất: ");
		publishYear = sc.nextInt();
		System.out.println("Nhập giá bán");
		price = sc.nextDouble();
		System.out.println("Nhập màu xe");
		color = sc.nextLine();
		System.out.println("Nhập vào");
		capacity = sc.nextInt();
		vehicles.add(new Xemay(ID, brand, publishYear, price, color, capacity));
	}

	// Function to add a new truck
	void addTruck() {
    	Scanner sc = new Scanner(System.in);
    	String ID;
    	String brand;
    	int publishYear;
    	double price;
    	String color;
    	double loadWeight;
    	System.out.println("Nhập id xe: ");
    	ID = sc.nextLine();
    	System.out.println("Nhạp thương hiệu xe: ");
    	brand=sc.nextLine();
    	System.out.println("Nhập năm Xuất: ");
    	publishYear = sc.nextInt();
    	System.out.println("Nhập giá bán");
    	price =sc.nextDouble();
    	System.out.println("Nhập màu xe");
    	color=sc.nextLine();
    	System.out.println("Nhập vào trọng tải xe:");
    	loadWeight=sc.nextDouble();
        vehicles.add(new Xetai(ID, brand, publishYear, price, color, loadWeight));
    }

	// Function to show all vehicles
	void showAllVehicles() {
        for (ICar vehicle : vehicles) {
            vehicle.showInfor();
        }