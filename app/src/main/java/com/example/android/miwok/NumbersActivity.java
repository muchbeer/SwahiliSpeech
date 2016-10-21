package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    int loopnumber = 0;
    int endoflist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        LinearLayout addNumberToLinear = (LinearLayout) findViewById(R.id.linear_number);
        TextView getNumbersFromList = new TextView(this);

     //   getNumbersFromList.setText();

        String[] numbers = new String[10];
        numbers[0] = "one";
        numbers[1] = "two";
        numbers[2] = "three";
        numbers[3] = "four";
        numbers[4] = "five";
        numbers[5] = "six";
        numbers[6] = "seven";
        numbers[7] = "eight";
        numbers[8] = "nine";
        numbers[9] = "ten";

        ArrayList<Word> listNumbers = new ArrayList<Word>();

        Word listword = new Word("One", "Moja", R.drawable.number_one);


        listNumbers.add(listword);
        listNumbers.add(new Word("Zero", "sufuri", R.drawable.number_two));
        listNumbers.add(new Word("Two", "Mbili", R.drawable.number_two));
        listNumbers.add(new Word("One", "Moja", R.drawable.number_one));
        listNumbers.add(new Word("Three", "Tatu", R.drawable.number_three));
        listNumbers.add(new Word("Four", "Nne", R.drawable.number_four));
        listNumbers.add(new Word("Five", "Tano", R.drawable.number_five));
        listNumbers.add(new Word("Six", "Sita", R.drawable.number_six));
        listNumbers.add(new Word("Seven", "Saba", R.drawable.number_seven));
        listNumbers.add(new Word("Eight", "Nane", R.drawable.number_eight));
        listNumbers.add(new Word("Nine", "Tisa", R.drawable.number_nine));
        listNumbers.add(new Word("Ten", "Kumi", R.drawable.number_ten));
        /*
        listNumbers.add("one");
        listNumbers.add("two");
        listNumbers.add("three");
        listNumbers.add("four");
        listNumbers.add("five");
        listNumbers.add("six");
        listNumbers.add("seven");
        listNumbers.add("eight");
        listNumbers.add("nine");
        listNumbers.add("ten");

        */

        endoflist = listNumbers.size();

        WordAdapter listadapter = new WordAdapter(this, listNumbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(listadapter);


        /*

        TextView getNumbersFromList = new TextView(this);
        getNumbersFromList.setText(listNumbers.get(0));
        addNumberToLinear.addView(getNumbersFromList);

        TextView getNumbersFromList2 = new TextView(this);
        getNumbersFromList2.setText(listNumbers.get(1));
        addNumberToLinear.addView(getNumbersFromList2);

        TextView getNumbersFromList3 = new TextView(this);
        getNumbersFromList3.setText(listNumbers.get(2));
        addNumberToLinear.addView(getNumbersFromList3);

        TextView getNumbersFromList4 = new TextView(this);
        getNumbersFromList4.setText(listNumbers.get(3));
        addNumberToLinear.addView(getNumbersFromList4);

        TextView getNumbersFromList5 = new TextView(this);
        getNumbersFromList5.setText(listNumbers.get(4));
        addNumberToLinear.addView(getNumbersFromList5);

        TextView getNumbersFromList6 = new TextView(this);
        getNumbersFromList6.setText(listNumbers.get(5));
        addNumberToLinear.addView(getNumbersFromList6);

        TextView getNumbersFromList7 = new TextView(this);
        getNumbersFromList7.setText(listNumbers.get(6));
        addNumberToLinear.addView(getNumbersFromList7);

        TextView getNumbersFromList8 = new TextView(this);
        getNumbersFromList8.setText(listNumbers.get(7));
        addNumberToLinear.addView(getNumbersFromList8);

        */

        //while loop



    }
}
