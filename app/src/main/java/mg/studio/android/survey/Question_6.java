package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Question_6 extends AppCompatActivity {
    private String selection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_6);
        selection="";
        Button btn1=(Button)findViewById(R.id.btn_question_6);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Question_6.this,Question_7.class);
                startActivity(i);
                EditText editText=findViewById(R.id.ed_info);
                selection=editText.getText().toString();
                SharedPreferences sPreferences = getSharedPreferences("config", MODE_PRIVATE);
                String info=sPreferences.getString("info","");
                selection = info+";"+selection;
                Save.saveInformation(Question_6.this,selection);
            }
        });
    }
}
