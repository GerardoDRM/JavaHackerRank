/**
 * Created by gerardo on 8/03/17.
 */
public class Main {

    public static void main(String args[]) {

        CurrencyFormatter c = new CurrencyFormatter();
        String d = c.changeFormatter(1000, "IN");
        System.out.println(d);
    }
}
