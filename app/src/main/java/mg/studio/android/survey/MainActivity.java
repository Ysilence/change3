package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        Button btn1=(Button)findViewById(R.id.btn_start);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox checkBox=findViewById(R.id.cb_accept);
                if(checkBox.isChecked()) {
                    Intent i = new Intent(MainActivity.this, Question_1.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(MainActivity.this,"Please agree the statements",Toast.LENGTH_LONG).show();

                }
            }
        });
    }

}
