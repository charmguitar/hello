package hello.wings.msn.to.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivityNewVersion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.btnCurrent);
        btn.setOnClickListener(
            new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    TextView txt = (TextView)findViewById(R.id.txtResult);
                    txt.setText(new Date().toString());
                }
            }
        );
        

    }



}
