package com.neona.numbiosis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Menu extends AppCompatActivity implements  View.OnClickListener {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().hide();

        Button bt_raiz = (Button) findViewById(R.id.RaizButton);
        bt_raiz.setOnClickListener((View.OnClickListener ) this);

        Button bt_sobre = (Button) findViewById(R.id.SobreButton);
        bt_sobre.setOnClickListener((View.OnClickListener ) this);

    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.RaizButton:
                Intent it = new Intent(this, TelaInicial.class);
                startActivity(it);
                break;
            case R.id.SobreButton:
                Intent it2 = new Intent(this, sobreActivity.class);
                startActivity(it2);
                break;
        }
    }



}
