import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);

        int i = 1, j = 60;

        while(j >= 0) {
            System.out.println("I="+i+" J="+j);
            i += 3;
            j -= 5;
        }

        scan.close();
    }
}