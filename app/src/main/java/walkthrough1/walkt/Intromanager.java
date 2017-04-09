package walkthrough1.walkt;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by TheDarkKnight on 13/03/17.
 */

public class Intromanager {

    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context context;

    public Intromanager(Context context)
    {
        this.context=context;
        pref=context.getSharedPreferences("first",0);
        editor= pref.edit();
    }

    public void setFirst(boolean inFirst)
    {
        editor.putBoolean("check",inFirst);
        editor.commit();
    }
    public boolean check()
    {
        return pref.getBoolean("check",true);
    }
}
