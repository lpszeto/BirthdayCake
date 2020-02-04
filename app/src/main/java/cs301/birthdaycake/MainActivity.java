package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView cv = findViewById(R.id.cakeview);
        CakeController cc = new CakeController(cv);
        //Button button = findViewById(R.id.blow_out);
        //button.setOnClickListener(cc);
        Switch witch = findViewById(R.id.candles);
        witch.setOnCheckedChangeListener(cc);
    }
    public void goodbye(View button) {
        Log.i("cakeview","CakeView");
    }

}
