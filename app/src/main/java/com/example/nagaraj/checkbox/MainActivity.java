package com.example.nagaraj.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button btn;

    CheckBox c1,c2,c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button);
        c1=(CheckBox) findViewById(R.id.checkBox);
        c2=(CheckBox) findViewById(R.id.checkBox2);
        c3=(CheckBox) findViewById(R.id.checkBox3);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(c1.isChecked()==false && c2.isChecked()==false && c3.isChecked()==false){
                    Toast.makeText(getBaseContext(),"three check box is null",Toast.LENGTH_SHORT).show();
                }else{
                    String str=null;
                    if(c1.isChecked()==true){
                        str="checked 1";
                    }
                    if(c2.isChecked()==true){
                        str="checked 2";
                    }
                    if(c3.isChecked()==true){

                        str="checked 3";
                    }
                    Toast.makeText(getBaseContext(),str,Toast.LENGTH_SHORT).show();
                }

        }
        });
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                c1.setChecked(false);
                c2.setChecked(false);
                c3.setChecked(false);
                Toast.makeText(getApplicationContext(),"Everything false by long pressing",Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}
