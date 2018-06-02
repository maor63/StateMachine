package Model;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        // write your code here
        Manager manager = new Manager();
        Scanner reader = new Scanner(System.in);
        while (true) {
            String input = reader.nextLine();
            if (input.equals("done")) break;
            String[] argArr = input.split(" ");
            if(argArr.length > 1)
                manager.excuteCommand(argArr[0], argArr[1]);
            else
                manager.excuteCommand(argArr[0],"");
        }
    }

}
