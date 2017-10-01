package com.example.somto.mvcdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText uid,uname;
    Button signIn;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signIn=(Button)findViewById(R.id.signin);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uid=(EditText)findViewById(R.id.userID);
                int userId = Integer.parseInt(uid.getText().toString().trim());
                uname=(EditText)findViewById(R.id.userName);
                String userName=uname.getText().toString();


                StudentModel sml =new StudentModel(12345,"phokchanrithisak");


                if(userId==sml.getUserId() && userName.equals(sml.getUserName()))
                {
                    Intent i =new Intent(MainActivity.this,SuccessActivity.class);
                    i.putExtra("userId",userId);
                    i.putExtra("userName",userName);
                    startActivity(i);
                }
                else
                {
                    Intent i = new Intent(MainActivity.this,FailActivity.class);
                    startActivity(i);
                }


            }
        });


    }
}

