package edu.upc.eseiaat.pma.motogo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NameActivity extends AppCompatActivity {

    EditText euser;
    Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        euser = (EditText) findViewById(R.id.EditUser);
        btnsave = (Button) findViewById(R.id.BtnSave);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NameActivity.this, DayActivity.class);

                Bundle b = new Bundle();
                b.putString("NOMBRE", euser.getText().toString());

                intent.putExtras(b);

                startActivity(intent);

            }

        });

    }
    }




