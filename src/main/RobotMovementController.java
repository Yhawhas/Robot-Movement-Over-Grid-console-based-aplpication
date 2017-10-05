package main;

public class RobotMovementController {
	public void robotMover(int x, int y, char direction, String commands) {
		String[] commandsList = commands.split(",");
		for (String command : commandsList) {
			// Initial direction is F followed by other commands for robot movement
			if (direction == 'F') {
				if (command.equals("F")) {
					if (y >= 10) {
						y = 10;
						continue;
					}
					y++;
				} else if (command.equals("L")) {
					if (x <= 0) {
						x = 0;
						continue;
					}
					x--;
				} else if (command.equals("R")) {
					if (x >= 10) {
						x = 10;
						continue;
					}
					x++;
				}
			} // Initial direction is L followed by other commands for robot movement
			else if (direction == 'L') {
				if (command.equals("F")) {
					if (x <= 0) {
						x = 0;
						continue;
					}
					x--;
				} else if (command.equals("L")) {
					if (y <= 0) {
						y = 0;
						continue;
					}
					y--;
				} else if (command.equals("R")) {
					if (y >= 10) {
						y = 10;
						continue;
					}
					y++;
				}
			} // Initial direction is R followed by other commands for robot movement
			else if (direction == 'R') {
				if (command.equals("F")) {
					if (x >= 10) {
						x = 10;
						continue;
					}
					x++;
				} else if (command.equals("L")) {
					if (y >= 10) 
						y = 10;
						continue;
					}
					y++;
				} else if (command.equals("R")) {
					if (y <= 0) {
						y = 0;
						continue;
					}
					y--;
				}
			}
		System.out.println("New position of the robot is (" + x + "," + y + ")\n");
		}
	}

