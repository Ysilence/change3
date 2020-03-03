package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Question_1 extends AppCompatActivity {
    private String selection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_1);
        RadioGroup radioGroup=findViewById(R.id.rg_question_1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton rb=findViewById(radioGroup.getCheckedRadioButtonId());
                selection=rb.getText().toString();
            }
        });
        Button btn1=findViewById(R.id.btn_question_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Question_1.this,Question_2.class);
                startActivity(i);
                Save.saveInformation(Question_1.this,selection);
            }
        });
    }


}
