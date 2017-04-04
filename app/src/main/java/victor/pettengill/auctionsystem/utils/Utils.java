package victor.pettengill.auctionsystem.utils;

import android.text.TextUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by victorfernandes on 03/04/17.
 */

public class Utils {

    public static boolean isEmail(String email) {
        Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$");
        Matcher m = p.matcher(email);
        if (m.find()){
            return true;
        }
        else{
            return false;
        }
    }

}