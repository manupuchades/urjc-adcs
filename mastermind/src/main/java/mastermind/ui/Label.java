package mastermind.ui;

import java.util.Locale;
import java.util.ResourceBundle;

public class Label {
    private static final ResourceBundle bundle = ResourceBundle.getBundle("labels/message", new Locale("df","DEFAULT"));

    public static String getLabel(String msg) {
        return bundle.getString(msg);
    }
}
