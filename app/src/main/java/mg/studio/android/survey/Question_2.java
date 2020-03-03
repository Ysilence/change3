package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Question_2 extends AppCompatActivity {
    private String selection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_2);
        RadioGroup radioGroup=findViewById(R.id.rg_question_2);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton rb=findViewById(radioGroup.getCheckedRadioButtonId());
                selection=rb.getText().toString();
            }
        });
        Button btn1=(Button)findViewById(R.id.btn_question_2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Question_2.this,Question_3.class);
                startActivity(i);
                SharedPreferences sPreferences = getSharedPreferences("config", MODE_PRIVATE);
                String info=sPreferences.getString("info","");
                selection=info+";"+selection;
                Save.saveInformation(Question_2.this,selection);
            }
        });
    }
}
