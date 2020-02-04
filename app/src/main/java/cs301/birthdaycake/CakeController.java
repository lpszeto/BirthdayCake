package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.*;
import android.widget.CompoundButton;

public class CakeController implements CompoundButton.OnCheckedChangeListener{
    private CakeView cv;
    private CakeModel cm;
    public CakeController(CakeView tempcv){
        cv = tempcv;
        cm = tempcv.getCakeModel();
    }
    /*public void onClick(View v){
        cm.lit = false;
        cv.invalidate();
        Log.d("goodbye","Bye");
        Log.d("blow_out","Blow Out");
    }*/
    public void onCheckedChanged (CompoundButton buttonView, boolean isChecked){
        if(isChecked == false){
            cm.hasCandles = false;
            cv.invalidate();
        }
        else{
            cm.hasCandles = true;
            cv.invalidate();
        }
    }
}
