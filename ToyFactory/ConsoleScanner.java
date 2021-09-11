package ToyFactory;

import java.util.Scanner;

public class ConsoleScanner {

    protected String getStringInput(){
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    protected int getIntegerInput(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

}
