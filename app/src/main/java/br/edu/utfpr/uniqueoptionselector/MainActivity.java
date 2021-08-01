package br.edu.utfpr.uniqueoptionselector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroupLanguages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupLanguages = findViewById(R.id.radioGroupLanguages);
    }

    public void showSelected(View view) {
        String message = "";
        switch (radioGroupLanguages.getCheckedRadioButtonId()) {
            case R.id.radioButtonJava:
                message = getString(R.string.java) + getString(R.string.selected_language);

                break;

            case R.id.radioButtonPascal:
                message = getString(R.string.pascal) + getString(R.string.selected_language);
                break;

            case R.id.radioButtonCobol:
                message = getString(R.string.cobol) + getString(R.string.selected_language);
                break;

            default:
                message = getString(R.string.no_language_was_selected);
        }

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    public void uncheckAll(View view) {
        radioGroupLanguages.clearCheck();
    }
}