package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Question_5 extends AppCompatActivity {
    private String selection;
    private CheckBox cb_mf;
    private CheckBox cb_pf;
    private CheckBox cb_gf;
    private CheckBox cb_bf;
    private CheckBox cb_GPS;
    private CheckBox cb_df;
    private CheckBox cb_others;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_5);
        cb_mf=findViewById(R.id.cb_mf);
        cb_pf=findViewById(R.id.cb_pf);
        cb_gf=findViewById(R.id.cb_gf);
        cb_bf=findViewById(R.id.cb_bf);
        cb_GPS=findViewById(R.id.cb_GPS);
        cb_df=findViewById(R.id.cb_df);
        cb_others=findViewById(R.id.cb_others);
        if(cb_mf.isChecked())
            selection=cb_mf.getText().toString();
        else if(cb_pf.isChecked())
            selection=cb_pf.getText().toString();
        else if(cb_gf.isChecked())
            selection=cb_gf.getText().toString();
        else if(cb_bf.isChecked())
            selection=cb_bf.getText().toString();
        else if(cb_GPS.isChecked())
            selection=cb_GPS.getText().toString();
        else if(cb_df.isChecked())
            selection=cb_df.getText().toString();
        else
            selection=cb_others.getText().toString();
        Button btn1=(Button)findViewById(R.id.btn_question_5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Question_5.this,Question_6.class);
                startActivity(i);
                SharedPreferences sPreferences = getSharedPreferences("config", MODE_PRIVATE);
                String info=sPreferences.getString("info","");
                selection = info+";"+selection;
                Save.saveInformation(Question_5.this,selection);
            }
        });
    }
}
