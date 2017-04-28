package com.devix.www.viewpagerinjava;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int placeholderId = R.id.uno;

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear);

        ViewPager viewPager = new ViewPager(this);
        viewPager.setBackgroundColor(Color.GREEN);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.height = 150;
        params.width = 150;
        viewPager.setId(R.id.viewPagerNew);
        viewPager.setLayoutParams(params);
//        addContentView(viewPager, params);
        linearLayout.addView(viewPager);
//TODO: Referencia http://stackoverflow.com/questions/3204852/android-add-a-textview-to-linear-layout-programmatically ---Add ViewPager with Java
        //Todo: http://stackoverflow.com/questions/8460680/how-can-i-assign-an-id-to-a-view-programmatically ---Add ID
    }


}

