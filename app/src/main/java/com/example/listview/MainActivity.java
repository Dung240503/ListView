package com.example.listview;  //

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);  // Liên kết với XML

        // 1. ListView Settings (Phần Common, Buttons... như ảnh)
        ListView settingsList = findViewById(R.id.settings_list);
        List<String> settingsItems = Arrays.asList("Common", "Buttons", "Layouts", "Helpers", "Legacy");
        ArrayAdapter<String> settingsAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                settingsItems
        );
        settingsList.setAdapter(settingsAdapter);

        // 2. ListView2 (Tùy chỉnh theo nhu cầu)
        ListView listView2 = findViewById(R.id.list_view_2);
        List<String> dataItems = Arrays.asList("Item 1", "Item 2", "Item 3");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dataItems
        );
        listView2.setAdapter(dataAdapter);
    }
}
