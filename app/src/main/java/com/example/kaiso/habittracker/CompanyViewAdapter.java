package com.example.kaiso.habittracker;

import android.content.ClipData.Item;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class CompanyViewAdapter extends ArrayAdapter<Item> {
	private final Context context;
	List<String> companyList;
	int companyIconList;
	String qoute;



	public CompanyViewAdapter(Context context, List companyList, int icons, String qoute) {
		super(context, R.layout.row_layout, companyList);
		this.context = context;
		this.companyList = companyList;
		this.companyIconList = icons;
		this.qoute = qoute;
		//System.out.println("y000000000000000000000000000000000000000");

	}


	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		//System.out.println("y000000000000000000000000000000000000000");
		View v;
		//System.out.println("y000000000000000000000000000000000000000");
//		if (v == null) {
//			LayoutInflater vi;
//			vi = LayoutInflater.from(getContext());
//			v = vi.inflate(R.layout.itemlistrow, null);
//		}
		//companyIconList = 0;
		if (convertView == null) {
			LayoutInflater vi;
			vi = LayoutInflater.from(getContext());
			v = vi.inflate(R.layout.itemlistrow, null);
			//v = inflater.inflate(R.layout.itemlistrow, parent, false);
			//grid = inflater.inflate(R.layout.company_gridview_layout, parent, false);

		}else {
			v = convertView;
		}
		//int p = getItem(position);
		ImageView tt1 = (ImageView) v.findViewById(R.id.imageView);
		tt1.setImageResource(companyIconList);
		TextView tt2 = (TextView) v.findViewById(R.id.companyname);
		tt2.setText("hey");
		TextView tt3 = (TextView) v.findViewById(R.id.qoute);
//		if(qoute.size() > position) {
//			tt3.setText((CharSequence) qoute.get(position));
//		}
		return v;
	}



}