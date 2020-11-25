package com.example.task6application;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bgButton;
    public ConstraintLayout constraintlayout;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bgButton = (Button)findViewById(R.id.button);
        constraintlayout = (ConstraintLayout) findViewById(R.id.constraintlayout);
        context = MainActivity.this;
    }

    @Override
    public void onClick(View v) {
        final CharSequence[] items = {getText(R.string.nred), getText(R.string.ngrn), getText(R.string.nyel)};
        bgButton.setOnClickListener(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.mes);

        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                switch (item){
                    case 0:
                        constraintlayout.setBackgroundResource(R.color.red);
                        Toast.makeText(context, R.string.nred, Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        constraintlayout.setBackgroundResource(R.color.grn);
                        Toast.makeText(context, R.string.ngrn, Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        constraintlayout.setBackgroundResource(R.color.yel);
                        Toast.makeText(context, R.string.nyel, Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}