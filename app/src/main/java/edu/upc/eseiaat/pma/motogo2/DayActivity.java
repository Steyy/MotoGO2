package edu.upc.eseiaat.pma.motogo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DayActivity extends AppCompatActivity {

    private TextView vuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2);


        vuser = (TextView) findViewById(R.id.viewuser);

        Bundle bundle = this.getIntent().getExtras();

        vuser.setText("Hola" + bundle.getString("NOMBRE"));
    }
}
