package mg.studio.android.survey;

import android.content.Context;
import android.content.SharedPreferences;

public class Save {
    public static  void saveInformation(Context context,String info){

        SharedPreferences sPreferences = context.getSharedPreferences("config", context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sPreferences.edit();
        editor.putString("info", info);
        editor.commit();

    }
}
