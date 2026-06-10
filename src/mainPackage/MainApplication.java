package mainPackage;

import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {

		Laptop laptop = new Laptop();
		laptop.camera.takePhoto();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the laptop zoomLevel:");
		laptop.camera.setZoomLevel(scanner.nextDouble());
		System.out.println("Current zoom level: " + laptop.camera.getZoomLevel());

		scanner.close();

	}

}
