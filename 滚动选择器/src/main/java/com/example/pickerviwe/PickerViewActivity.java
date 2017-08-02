package com.example.pickerviwe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PickerViewActivity extends AppCompatActivity {

    PickerView minute_pv;
    PickerView second_pv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker_view);
        minute_pv = (PickerView) findViewById(R.id.minute_pv);
        second_pv = (PickerView) findViewById(R.id.second_pv);
        List<String> data = new ArrayList<String>();
        List<String> seconds = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            data.add("0" + i);
        }
        for (int i = 0; i < 60; i++)
        {
            seconds.add(i < 10 ? "0" + i : "" + i);
        }
        minute_pv.setData(data);
        minute_pv.setOnSelectListener(new PickerView.onSelectListener()
        {

            @Override
            public void onSelect(String text)
            {
                Toast.makeText(PickerViewActivity.this, "选择了 " + text + " 分",
                        Toast.LENGTH_SHORT).show();
            }
        });
        second_pv.setData(seconds);
        second_pv.setOnSelectListener(new PickerView.onSelectListener()
        {

            @Override
            public void onSelect(String text)
            {
                Toast.makeText(PickerViewActivity.this, "选择了 " + text + " 秒",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
