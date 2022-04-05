package naumoff.bot;

import naumoff.message.MessageConstants;
import  naumoff.message.MessageMethods;
import naumoff.coffe.MainCoffe.MainCoffeEnum;

import java.util.Scanner;

public class BotMthods extends MessageConstants {

MainCoffeEnum mainCoffeEnumBig = MainCoffeEnum.BIG;
MainCoffeEnum mainCoffeEnumMedium = MainCoffeEnum.MEDIUM;
MainCoffeEnum mainCoffeEnumSmall = MainCoffeEnum.SMALL;


MessageMethods messageMethods  = new MessageMethods();

    public void startBot(){
  String messageUser  =  messageMethods.printMessage();
    System.out.println(messageUser);
      if(messageUser.equals(GENERAL_MESSGAE)){
         System.out.println("PLUS PRINT MODEL COFE");

       Scanner scanner = new Scanner(System.in);
       String cofeModel = scanner.nextLine();

        if(cofeModel.equals(mainCoffeEnumBig.toString())


                || cofeModel.equals(mainCoffeEnumMedium.toString())

                || cofeModel.equals(mainCoffeEnumSmall.toString())
        ){
          String result  = cofeModel + "COFE IN PROGRESS PLIS WAIT.....";


          try{ System.out.println(result);
            Thread.sleep(1000);
            System.out.println("This is Cofe");
          }
          catch (Exception e){
            System.out.println(e);
          }
        }else{
          System.out.println("this model Coffe not a ");
        }
      }
      else{
        System.out.println("this command is not");
      }
    }

}
