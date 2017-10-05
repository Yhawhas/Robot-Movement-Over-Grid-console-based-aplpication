package main;

import java.util.Scanner;

public class RobotMainClass {
	public static void main(String[] args) {
		RobotMovementController robotControl = new RobotMovementController();
		RobotCommandGenerator generateRobotCommand = new RobotCommandGenerator();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter your choice: ");
			System.out.println("1: to give commands for the robot movement");
			System.out.println("2: to generate commands for the robot");
			System.out.println("3: to exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				// Robot Movement based on commands
				System.out.println("Please enter x-axis of robot: ");
				int x = scanner.nextInt();
				System.out.println("Please enter y-axis of robot: ");
				int y = scanner.nextInt();
				System.out.println("Initial location of the robot: (" + x + ", " + y + ")\n");
				System.out.println("Please enter direction of the robot: ");
				char direction = scanner.next(".").charAt(0);
				scanner.nextLine();
				System.out.println("Please enter command list: ");
				String commands = scanner.nextLine();
				robotControl.robotMover(x, y, direction, commands);
				break;

			case 2:
				// Robot Command Generator
				System.out.println("Enter starting point axis");
				System.out.println("Please enter x1-axis of robot: ");
				int x1 = scanner.nextInt();
				System.out.println("Please enter y1-axis of robot: ");
				int y1 = scanner.nextInt();
				System.out.println("Start point of the robot: (" + x1 + ", " + y1 + ")\n");
				System.out.println("Enter ending point axis");
				System.out.println("Please enter x2-axis of robot: ");
				int x2 = scanner.nextInt();
				System.out.println("Please enter y2-axis of robot: ");
				int y2 = scanner.nextInt();
				System.out.println("End point of the robot: (" + x2 + ", " + y2 + ")\n");
				generateRobotCommand.robotCommandGenerator(x1, y1, x2, y2);
				break;

			case 3:
				return;

			default:
				System.out.println("Invalid, Input");
			}
		}
	}
}
