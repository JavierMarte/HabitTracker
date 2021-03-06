package com.example.kaiso.habittracker;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaiso on 12/18/2016.
 */
public class HabitFragment extends Fragment {
    ListView listview;
    static CompanyViewAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View mCustomView = inflater.inflate(R.layout.custom_actionbar, null);
        TextView title = (TextView) mCustomView.findViewById(R.id.title_text);
        mCustomView.findViewById(R.id.back_text).setVisibility(View.INVISIBLE);

        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        actionBar.setCustomView(mCustomView);
        actionBar.setDisplayShowCustomEnabled(true);
        title.setText("Habit Tracker");


        mCustomView.findViewById(R.id.imageButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm = getActivity().getFragmentManager();

                AddCompany addCompanyForm = new AddCompany();

                addCompanyForm.show(fm, "Add Company");

                adapter.notifyDataSetChanged();

            }
        });
        View view = inflater.inflate(R.layout.listlayout, container, false);

        listview =(ListView) view.findViewById(R.id.itemlister);
        int icons = 0;
        String lat = "hey";
        Habit yo = new Habit();
        yo.setIcon(0);
        yo.setName("bro");
        HabitList hey = new HabitList();
        ArrayList<Habit> companies = hey.getList();


        this.adapter = new CompanyViewAdapter(getActivity(),companies, icons, lat);

        listview.setAdapter(adapter);


        return view;
    }
}
