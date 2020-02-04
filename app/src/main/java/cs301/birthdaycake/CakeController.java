package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.*;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, View.OnClickListener {
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
    public void onProgressChanged(SeekBar seek,int num, boolean click){
        if(click == true){
            cm.candles = num;
            cv.invalidate();
        }
    }
    public void onStartTrackingTouch(SeekBar seek){}
    public void onStopTrackingTouch( SeekBar seek){}
}
