package com.example.unitcoverter;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.unitcoverter.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UnitOutput unitOutput = new UnitOutput("");
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setLifecycleOwner(this);
        binding.setUnit(unitOutput);

        EditText convert_input = findViewById(R.id.convertInput);
        TextView convert_output = findViewById(R.id.convertOutput);
        Spinner convertSpinner = findViewById(R.id.convert_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.converter_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        convertSpinner.setAdapter(adapter);

        Button convertbtn = findViewById(R.id.convert_btn);

        convertbtn.setOnClickListener(v -> {
            if (convert_input.getText().length() == 0)
                return;
            String convertString = (String) convertSpinner.getSelectedItem();
            if (convertString.equals("ºF to ºC")) {
                double celcius = Converter.toCelcius(Float.parseFloat(convert_input.getText().toString()));
                convert_output.setText(String.format("%.2f ºC", celcius));
            }
            if (convertString.equals("lbs to kg")) {
                double kilogram = Converter.toKilograms(Float.parseFloat(convert_input.getText().toString()));
                convert_output.setText(String.format("%.2fkg", kilogram));
            }
            if (convertString.equals("oz to cl")) {
                double centiliter = Converter.toCentiLiters(Float.parseFloat(convert_input.getText().toString()));
                convert_output.setText(String.format("%.2fcl", centiliter));
            }
            if (convertString.equals("mi to km")) {
                double kilometer = Converter.toKilometers(Float.parseFloat(convert_input.getText().toString()));
                convert_output.setText(String.format("%.2fkm", kilometer));
            }
        });
    }
}