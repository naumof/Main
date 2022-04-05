package naumoff.message;

import java.util.Scanner;

public class MessageMethods extends MessageConstants{

    public String getStartMessage(){

        return START_MESSAGE;

    }

    public String printMessage(){
       Scanner scanner = new Scanner(System.in);
       String messageUser = scanner.nextLine();
        return messageUser;
    }



}
