package day04;

public class LoopNesting {
    public static void main(String[] args) {

        for (int level = 2; level <= 9; level++) {
            for (int line = 1; line <= 9; line++) {
                System.out.printf("%d x %d = %d\n", level, line, level*line);
            }
            System.out.println("===================================");
        }
    }
}
