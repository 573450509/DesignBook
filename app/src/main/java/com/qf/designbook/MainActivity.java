package com.qf.designbook;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import fragment.MapDepotFragment;

public class MainActivity extends FragmentActivity implements RadioGroup.OnCheckedChangeListener{
    private RadioGroup radioGroup;
    String msg = "sssss";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }

    private void initview() {
        radioGroup = (RadioGroup) findViewById(R.id.rg_tab);
        radioGroup.setOnCheckedChangeListener(this);
        radioGroup.getChildAt(0).performClick();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.rb_anli_main:

                break;
            case R.id.rb_tuku_main:
                MapDepotFragment mapDepotFragment = new MapDepotFragment();
                fragmentManager(mapDepotFragment);
                break;
        }
    }
    private void fragmentManager(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_fragment, fragment)
                .commit();
    }
}
