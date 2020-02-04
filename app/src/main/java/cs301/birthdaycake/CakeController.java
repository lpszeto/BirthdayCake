package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.*;

public class CakeController implements View.OnClickListener{
    private CakeView cv;
    private CakeModel cm;
    public CakeController(CakeView tempcv){
        cv = tempcv;
        cm = tempcv.getCakeModel();
    }
    public void onClick(View v){
        cm.lit = false;
        cv.invalidate();
        Log.d("goodbye","Bye");
        Log.d("blow_out","Blow Out");
    }

}
