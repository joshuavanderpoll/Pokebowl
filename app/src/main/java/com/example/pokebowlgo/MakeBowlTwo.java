package com.example.pokebowlgo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MakeBowlTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make_bowl_two);

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.seaweed:
                if (checked)
                    // Seaweed
                    break;
            case R.id.avocado:
                if (checked)
                    // Avocado
                    break;
            case R.id.crab:
                if (checked)
                    // Crab
                    break;
            case R.id.edamame:
                if (checked)
                    // Edamame
                    break;
        }
    }
}
