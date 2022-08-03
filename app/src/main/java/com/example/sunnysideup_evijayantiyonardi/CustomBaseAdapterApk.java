package com.example.sunnysideup_evijayantiyonardi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapterApk extends BaseAdapter {

    Context context;
    String listFood [];
    int listImages [];
    LayoutInflater inflater;

    CustomBaseAdapterApk(Context ctx, String [] foodList, int[] images) {
        this.context = ctx;
        this.listFood = foodList;
        this.listImages = images;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return listFood.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        convertView = inflater.inflate(R.layout.activity_custom_list_view2, null);
        TextView txtView = (TextView) convertView.findViewById(R.id.textView);
        ImageView foodImg = (ImageView) convertView.findViewById(R.id.imageIcom);
        txtView.setText(listFood[position]);
        foodImg.setImageResource(listImages[position]);
        return convertView;
    }
}
