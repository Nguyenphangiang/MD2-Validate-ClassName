import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    public static final String CLASSNAME_REGEX = "^[A-Z&&ACP]\\d{4}[A-Z&&GHIKLM]$";

    public ClassName() {
    }
    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
