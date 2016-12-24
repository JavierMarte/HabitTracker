package com.example.kaiso.habittracker;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;


/**
 * Created by kaiso on 8/29/2016.
 */
public class AddCompany extends android.app.DialogFragment{
    private EditText C, E, T;
    String company_name, exchange, ticker_symbol;
   // CompanyFragment CF;
    //MySqlHelper db;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        LayoutInflater i = getActivity().getLayoutInflater();
        View v = i.inflate(R.layout.add_company, null);
        C = (EditText) v.findViewById(R.id.add_form_enter_company);
        E = (EditText) v.findViewById(R.id.add_form_enter_exchange);
        E.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
        T = (EditText) v.findViewById(R.id.add_form_enter_stock_symbol);
        T.setFilters(new InputFilter[] {new InputFilter.AllCaps()});

        AlertDialog.Builder b;
        b = new AlertDialog.Builder(getActivity());
        b.setView(v)

                .setTitle("Company")
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                company_name = C.getText().toString();
                                exchange = E.getText().toString();
                                exchange = exchange.toUpperCase();
                                ticker_symbol = T.getText().toString();
                                ticker_symbol = ticker_symbol.toUpperCase();
//                                db = new MySqlHelper(getActivity());
//                                db.addBook(new Storage(company_name, R.drawable.samsung_logo));
                                Habit hey = new Habit();
                                ArrayList<String> hey2= hey.getCompanies();
                                hey2.add(company_name);
                                hey.setCompanies(hey2);
                                //HabitFragment.companies.add(company_name);
//                                CompanyFragment.icons.add(R.drawable.samsung_logo);
//                               // DatabaseAccess.getInstance().addCompany(company_name, exchange + ":" + ticker_symbol);
//                               // DataPlease.getInstance().financeQuery();
//                               // DataPlease.getInstance().adapter.notifyDataSetChanged();
//
                                HabitFragment.adapter.notifyDataSetChanged();

                            }
                        }
                )
                .setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                dialog.dismiss();
                            }
                        }
                );


        return b.create();

    }
}
