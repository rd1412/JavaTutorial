package FirstProject;

public class MultiplicationTable {
	
	void printMultiplicationTable() {
		printMultiplicationTable(5, 1, 10);
	}
	
	void printMultiplicationTable(int a, int b, int c) {
		for(int i=b; i<=c; i++) {
			System.out.printf("%d * %d = %d", a, i, a * i).println();
		}
	}
}