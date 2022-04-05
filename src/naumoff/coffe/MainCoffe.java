package naumoff.coffe;

public class MainCoffe {
    public enum MainCoffeEnum {
        SMALL(100),
        MEDIUM(150),
        BIG(200);

        int millileteres;
        MainCoffeEnum(int millileteres){
        this.millileteres = millileteres;


        }
    }
}
