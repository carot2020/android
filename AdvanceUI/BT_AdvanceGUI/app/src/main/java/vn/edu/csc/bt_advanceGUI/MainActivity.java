package vn.edu.csc.bt_advanceGUI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vn.edu.csc.bt_advanceGUI.bottom.Main2Activity;
import vn.edu.csc.bt_advanceGUI.nav.Main1Activity;
import vn.edu.csc.bt_advanceGUI.tablayout.Main3Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowActivity(View view){
        switch (view.getId()){
            case R.id.button:
                startActivity(new Intent(this, Main1Activity.class));
                break;
            case R.id.button2:
                startActivity(new Intent(this, Main2Activity.class));
                break;
            case R.id.button3:
                startActivity(new Intent(this, Main3Activity.class));
                break;
        }
    }
}
