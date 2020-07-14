package vn.edu.csc.bt_advanceGUI.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import vn.edu.csc.bt_advanceGUI.AnotherFragment;
import vn.edu.csc.bt_advanceGUI.HomeFragment;
import vn.edu.csc.bt_advanceGUI.R;

public class Main3Activity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("Home").setIcon(R.drawable.ic_home_black_24dp));
        tabLayout.addTab(tabLayout.newTab().setText("Another").setIcon(R.drawable.ic_supervisor_account_black_24dp));



        displayFragment(0);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                displayFragment(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void displayFragment(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new HomeFragment();
                break;
            case 1:
                fragment = new AnotherFragment();
                break;
        }

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container,fragment);
        ft.commit();
    }
}
