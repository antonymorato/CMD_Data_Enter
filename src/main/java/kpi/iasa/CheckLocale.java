package kpi.iasa;

import java.util.Locale;
import java.util.ResourceBundle;
public class CheckLocale {
    private Locale locale;


    public CheckLocale(String language,String country)
    {
        locale=new Locale(language,country);

    }
    public String getString(String key) {

        ResourceBundle words
                = ResourceBundle.getBundle("resources/words", locale);

        String value = words.getString(key);

        return value;

    }

}
