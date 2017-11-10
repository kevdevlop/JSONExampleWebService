package info.androidhive.jsonparsing;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by KevDev on 09/11/17.
 */

class Datos extends AppCompatActivity{
    private TextView txtV;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datos);
        setTitle("Datos del Cliente");
        String datos = getIntent().getStringExtra("data");
        txtV = (TextView) findViewById(R.id.txtView);

        txtV.setText(datos);
    }
}
