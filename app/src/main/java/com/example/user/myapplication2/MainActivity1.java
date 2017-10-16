package com.example.user.myapplication2;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity1  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.hywoman.ac.kr"));
                startActivity(intent);
            }


        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), SubActivity1.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), Sub2Activity1.class);
                startActivity(intent);
            }
        });
    }




    public void ondialogbtnClicked(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity1.this);
        builder.setTitle("학사 일정");
        builder.setMessage("중간고사: 10.23(월) ~ 10,27(금)\n" +
                "기말고사: 12.4(월) ~ 12.8(금)\n" +
                "보강주간: 12.11(월) ~ 12.15(금)\n" +
                "동계방학: 12.18(월)");
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getApplicationContext(), "확인!",
                        Toast.LENGTH_LONG).show();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }



}
