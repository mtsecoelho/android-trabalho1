package com.example.posgrad.trabalho1;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.ToggleButton;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton button = (ImageButton) findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Email email = new Email();
                Set<String> configs = new HashSet<String>();

                EditText edtNome = (EditText) findViewById(R.id.editText);
                email.setNome(edtNome.getText().toString());

                EditText edtId = (EditText) findViewById(R.id.editText3);
                email.setId(edtId.getText().toString());

                EditText edtEmail = (EditText) findViewById(R.id.editText4);
                email.setEmail(edtEmail.getText().toString());

                EditText edtData = (EditText) findViewById(R.id.editText5);
                email.setDate(edtData.getText().toString());

                EditText edtHora = (EditText) findViewById(R.id.editText6);
                email.setTime(edtHora.getText().toString());

                RadioGroup rg1 = (RadioGroup) findViewById(R.id.radioGroup);
                if(rg1.getCheckedRadioButtonId()!=-1){
                    int id= rg1.getCheckedRadioButtonId();
                    View radioButton = rg1.findViewById(id);
                    int radioId = rg1.indexOfChild(radioButton);
                    RadioButton btn = (RadioButton) rg1.getChildAt(radioId);
                    String selection = (String) btn.getText();
                    email.setUsaDatashow(selection);
                }

                Spinner spinner = (Spinner) findViewById(R.id.spinner);
                email.setLaboratorio(spinner.getSelectedItem().toString());

                ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
                email.setPrioritario(toggleButton.isChecked() ? true : false );

                EditText edtObs = (EditText) findViewById(R.id.editText7);
                email.setObs(edtObs.getText().toString());

                CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox3);
                CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox4);
                CheckBox cb3 = (CheckBox) findViewById(R.id.checkBox5);
                CheckBox cb4 = (CheckBox) findViewById(R.id.checkBox6);

                if (cb1.isChecked()) {
                    configs.add(cb1.getText().toString());
                }

                if (cb2.isChecked()) {
                    configs.add(cb2.getText().toString());
                }

                if (cb3.isChecked()) {
                    configs.add(cb3.getText().toString());
                }

                if (cb4.isChecked()) {
                    configs.add(cb4.getText().toString());
                }

                email.setConfigs(configs);

                Log.v("teste", email.toString());

                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL, new String[] {"emmanoelcoelholima@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, "Reserva de Sala");
                i.putExtra(Intent.EXTRA_TEXT, email.toString());

                startActivity(Intent.createChooser(i, "Enviar Email"));

            }
        });
    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void showTimePickerDialog(View v) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }

}
