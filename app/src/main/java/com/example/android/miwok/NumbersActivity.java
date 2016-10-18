package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
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

        ArrayList<String> listNumbers = new ArrayList<>();

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

        endoflist = listNumbers.size();

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

        while(loopnumber<endoflist) {

            getNumbersFromList.setText(listNumbers.get(loopnumber));
            addNumberToLinear.addView(getNumbersFromList);
            loopnumber = loopnumber+1;
            //loopnumber++;
        }
    }
}
