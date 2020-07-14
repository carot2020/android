package vn.edu.csc.bt_advanceGUI.bottom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import vn.edu.csc.bt_advanceGUI.AnotherFragment;
import vn.edu.csc.bt_advanceGUI.HomeFragment;
import vn.edu.csc.bt_advanceGUI.R;
import vn.edu.csc.bt_advanceGUI.nav.Main1Activity;

public class Main2Activity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(Main2Activity.this);

        displayFragment(new HomeFragment());
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.mnuHome:
                displayFragment(new HomeFragment());
                break;
            case R.id.mnuAnother:
                displayFragment(new AnotherFragment());
                break;
        }
        return false;
    }

    public void displayFragment(Fragment fragment){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container, fragment);
        ft.commit();
    }
}
