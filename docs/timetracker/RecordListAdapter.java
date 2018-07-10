package com.example.laxman.timetracker;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class RecordListAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<Model> recordList;

    public RecordListAdapter(Context context, int layout, ArrayList<Model> recordList) {
        this.context = context;
        this.layout = layout;
        this.recordList = recordList;
    }

    @Override
    public int getCount() {
        return recordList.size();
    }

    @Override
    public Object getItem(int i) {
        return recordList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    private class ViewHolder{
        TextView txtName, txtCategory,  txtDate,  txtStime,  txtEtime;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View row = view;
        ViewHolder holder = new ViewHolder();

        if(row ==null){
            LayoutInflater inflater= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layout, null);
            holder.txtName = row.findViewById(R.id.txtName);
            holder.txtCategory = row.findViewById(R.id.txtCategory);
            holder.txtDate = row.findViewById(R.id.txtDate);
            holder.txtStime = row.findViewById(R.id.txtStime);
            holder.txtEtime = row.findViewById(R.id.txtEtime);
            row.setTag(holder);

        }
        else{
            holder = (ViewHolder)row.getTag();
        }
        Model model = recordList.get(i);

        holder.txtName.setText(model.getName());
        holder.txtCategory.setText(model.getCategory());
        holder.txtDate.setText(model.getDate());
        holder.txtStime.setText(model.getStime());
        holder.txtEtime.setText(model.getEtime());

        return row ;
    }
}
