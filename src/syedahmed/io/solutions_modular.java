package syedahmed.io;

public class solutions_modular {

    public static void main(String[] args) {

        System.out.print(SleepIn(true, false));

    }

    private static boolean SleepIn(boolean weekday, boolean vacation){
        if(!weekday || vacation){
            return true;
        }else{
            return false;
        }

    }
}
