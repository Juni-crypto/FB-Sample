package com.example.firebasesample;

import android.app.Activity;
import android.app.Notification;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Hilal Ahmad
 * Date: 05-August-2020
 * Time: 11:41 PM
 */
public class ListAdapter extends ArrayAdapter {

    private Activity mContext;
    List<Students> studentsList;

    public ListAdapter(Activity mContext, List<Students> studentsList){
        super(mContext,R.layout.list_item,studentsList);
        this.mContext = mContext;
        this.studentsList = studentsList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = mContext.getLayoutInflater();
        View listItemView = inflater.inflate(R.layout.list_item,null,true);

        TextView tvName = listItemView.findViewById(R.id.tvName);
        TextView tvRollno = listItemView.findViewById(R.id.tvRollno);
        TextView tvCourse = listItemView.findViewById(R.id.tvCourse);

        Students students = studentsList.get(position);

        tvName.setText(students.getName());
        tvRollno.setText(students.getRollno());
        tvCourse.setText(students.getCourse());

        return listItemView;
    }
}
