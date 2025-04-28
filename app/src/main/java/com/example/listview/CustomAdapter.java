package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;

public class CustomAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final List<String> titles;
    private final List<String> subtitles;

    public CustomAdapter(Context context, List<String> titles, List<String> subtitles) {
        super(context, R.layout.list_item, titles);
        this.context = context;
        this.titles = titles;
        this.subtitles = subtitles;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 1. Tạo/inflate view cho item nếu chưa tồn tại
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.list_item, parent, false);
        }

        // 2. Bind data vào view
        TextView tvTitle = convertView.findViewById(R.id.tv_title);
        TextView tvSubtitle = convertView.findViewById(R.id.tv_subtitle);

        tvTitle.setText(titles.get(position));
        tvSubtitle.setText(subtitles.get(position));

        // 3. Trả về view đã được điền dữ liệu
        return convertView;
    }
}
