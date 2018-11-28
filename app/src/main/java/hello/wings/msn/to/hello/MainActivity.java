package hello.wings.msn.to.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnCurrent_onClick(View view){
        TextView txt = (TextView)findViewById(R.id.txtResult);
        txt.setText(new Date().toString());

    }

}
