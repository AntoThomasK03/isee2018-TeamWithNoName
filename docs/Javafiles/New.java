package com.example.laxman.timetracker;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.DialogFragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

import yuku.ambilwarna.AmbilWarnaDialog;

public class New extends AppCompatActivity {
    //DatabaseHelper myDb;
    EditText editName,editCategory;
    TextView textDate,textStime,textEtime;
    Button btncolor, btnaccept;
    ConstraintLayout mlayout;
    int mDefaultColor;
    Button mButton;

    private static final String TAG = "new";

    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    public static SQLiteHelper mSQLiteHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        //myDb = new DatabaseHelper(this);

        mlayout = (ConstraintLayout) findViewById(R.id.newlayout);
        mDefaultColor = ContextCompat.getColor(New.this,R.color.colorPrimary);
        mButton = (Button) findViewById(R.id.buttoncolor);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openColorPicker();
            }
        });

        editName = (EditText)findViewById(R.id.edittextname);
        editCategory = (EditText)findViewById(R.id.edittextcategory);
        textDate = (TextView)findViewById(R.id.textviewdate);
        textStime = (TextView)findViewById(R.id.textviewstime);
        textEtime = (TextView)findViewById(R.id.textviewetime);
        btncolor = (Button)findViewById(R.id.buttoncolor);
        btnaccept = (Button)findViewById(R.id.buttonaccept);

        mSQLiteHelper = new SQLiteHelper(this, "RECORDDB.sqlite", null, 1);

        mSQLiteHelper.queryData("CREATE TABLE IF NOT EXISTS RECORD(id INTEGER PRIMARY KEY AUTOINCREMENT," +
               " name VARCHAR, category VARCHAR, date VARCHAR, stime VARCHAR, etime VARCHAR)");
        //btnaccept();


        textStime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(New.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        textStime.setText(selectedHour + ":" + selectedMinute);
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });
        textEtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(New.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        textEtime.setText(selectedHour + ":" + selectedMinute);
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });

        mDisplayDate = (TextView) findViewById(R.id.textviewdate);

        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year= cal.get(Calendar.YEAR);
                int month= cal.get(Calendar.MONTH);
                int day= cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(New.this,
                        android.R.style.Theme_DeviceDefault,
                        mDateSetListener,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.BLUE));
                dialog.show();

            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG, "onDateSet ; mm/dd/yyy: " + month + "/" + day + "/" + year);

                String date = month + "/" + day + "/" + year;
                mDisplayDate.setText(date);
            }
        };

        btnaccept.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    try {
                        mSQLiteHelper.insertData(
                                editName.getText().toString().trim(),
                                editCategory.getText().toString().trim(),
                                textDate.getText().toString().trim(),
                                textStime.getText().toString().trim(),
                                textEtime.getText().toString().trim()
                        );
                        Toast.makeText(New.this, "Added Succesfully", Toast.LENGTH_SHORT).show();
                        editName.setText("");
                        editCategory.setText("");
                        textDate.setText("");
                        textStime.setText("");
                        textEtime.setText("");
                    }
                    catch (Exception e ){
                        e.printStackTrace();
                    }


        }

        });
    }
    public void openColorPicker() {
        AmbilWarnaDialog colorPicker = new AmbilWarnaDialog(this, mDefaultColor, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                mDefaultColor = color;
                mlayout.setBackgroundColor(mDefaultColor);
                            }
        });
        colorPicker.show();
    }

    /*public void btnaccept(){
        btnaccept.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        boolean isInsetred = myDb.insertData(editName.getText().toString(),
                                editCategory.getText().toString(),
                                textDate.getText().toString(),
                                textStime.getText().toString(),
                                textEtime.getText().toString(),
                                btncolor.getText().toString());
                        if(isInsetred = true)
                            Toast.makeText(New.this,"Activity Saved",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(New.this,"Retry",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }*/

}
