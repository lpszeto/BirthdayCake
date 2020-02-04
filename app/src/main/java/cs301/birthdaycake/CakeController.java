package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController {
    private CakeView cv;
    private CakeModel cm;
    public CakeController(CakeView tempcv){
        cv = tempcv;
        cm = tempcv.getCakeModel();
    }
    public void onClick(View v){
        Log.d("button","Click");
        Log.d("button2","Click2");
    }

}
