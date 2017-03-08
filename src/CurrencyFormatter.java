import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by gerardo on 8/03/17.
 */
public class CurrencyFormatter {
    Map<String, String> l;

    public CurrencyFormatter() {
        l = new HashMap<String, String>();
        l.put("US", "en");
        l.put("FR", "fr");
        l.put("IN", "en");
        l.put("CN", "zh");

    }
    public String changeFormatter(double num, String code) {
        if (l.containsKey(code)) {
            Locale locale = new Locale(l.get(code), code);
            NumberFormat f = NumberFormat.getCurrencyInstance(locale);
            return f.format(num);
        }
        return null;
    }
}
