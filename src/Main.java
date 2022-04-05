import naumoff.bot.BotMthods;
import naumoff.message.MessageMethods;

public class Main {





    public static void main(String[] args) {
        MessageMethods messageMethods = new MessageMethods();

        BotMthods botMthods = new BotMthods();

        System.out.println( messageMethods.getStartMessage());
         botMthods.startBot();


    }



}
