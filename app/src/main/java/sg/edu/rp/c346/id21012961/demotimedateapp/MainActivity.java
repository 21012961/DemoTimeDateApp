package sg.edu.rp.c346.id21012961.demotimedateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset = findViewById(R.id.buttonReset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hours = tp.getCurrentHour();
                int minute = tp.getCurrentMinute();
                String output = String.format("Time is %s:%s", hours, minute);
                tvDisplay.setText(output);
            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = String.format("Date is %s/%s/%s", dp.getDayOfMonth(), dp.getMonth(), dp.getYear());
                tvDisplay.setText(output);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setCurrentHour(-1);
                tp.setCurrentMinute(00);

                dp.updateDate(2020,0, 01);

                tvDisplay.setText("");
            }
        });






    }
}