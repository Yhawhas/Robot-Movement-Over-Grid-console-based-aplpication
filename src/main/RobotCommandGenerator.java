package main;

public class RobotCommandGenerator {
	public void robotCommandGenerator(int x1, int y1, int x2, int y2) {
		if (y1 > y2) {
			System.out.println("\"y1 cannot be greater than y2 \nsince robot does not move in backward direction\"\n");
		} else {
			int x = Math.abs(x1 - x2);
			int y = Math.abs(y1 - y2);
			System.out.print("Robot commands: [");
			if (x1 > x2) {
				for (int i = 0; i < x; i++) {
					System.out.print("L,");
				}
				for (int j = 0; j < y; j++) {
					if (j == y - 1) {
						System.out.print("F");
						break;
					}
					System.out.print("F,");
				}

			} else if (x1 < x2) {
				for (int i = 0; i < x; i++) {
					System.out.print("R,");
				}
				for (int j = 0; j < y; j++) {
					if (j == y - 1) {
						System.out.print("F");
						break;
					}
					System.out.print("F,");
				}

			}
			System.out.print("]\n\n");
		}

	}

}
