package id.sch.smktelkom_mlg.xiirpl5038.pelamarankerja;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    EditText etKTP, etPhone;
    Button butOK;
    RadioButton rbM, rbF;
    CheckBox cbID, cbEN, cbMA, cbOT;
    Spinner spRe;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = (EditText) findViewById(R.id.editTextNama);
        etKTP = (EditText) findViewById(R.id.editTextKTP);
        etPhone = (EditText) findViewById(R.id.editTextPhone);
        rbM = (RadioButton) findViewById(R.id.radioButtonM);
        rbF = (RadioButton) findViewById(R.id.radioButtonF);
        cbID = (CheckBox) findViewById(R.id.checkBoxID);
        cbEN = (CheckBox) findViewById(R.id.checkBoxEN);
        cbMA = (CheckBox) findViewById(R.id.checkBoxMA);
        cbOT = (CheckBox) findViewById(R.id.checkBoxOT);
        spRe = (Spinner) findViewById(R.id.spinnerRe);
        butOK = (Button) findViewById(R.id.buttonOK);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        butOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clik();
            }
        });
    }

    private void Clik() {
        if (isValid()) {

        }
    }

    private boolean isValid() {
        boolean valid = true;

        String name = etNama.getText().toString();
        String KTP = etKTP.getText().toString();
        String no = etPhone.getText().toString();

        if (name.isEmpty() || KTP.isEmpty() || no.isEmpty()) {
            etNama.setError("Anda belum mengisi Name");
            etKTP.setError("Anda belum mengisi KTP");
            etPhone.setError("Anda belum mengisi Phone Number");
            valid = false;
        } else {
            etNama.setError(null);
            etKTP.setError(null);
            etPhone.setError(null);
        }
        return valid;

    }
}
