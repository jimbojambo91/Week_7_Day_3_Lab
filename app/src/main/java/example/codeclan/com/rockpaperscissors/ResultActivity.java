package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String result = extras.getString("result");
        String compHand = extras.getString("comp_hand");

        textView2 = (TextView) findViewById(R.id.show_comp_hand);
        textView2.setText("The Computer Played " + compHand);

        textView = (TextView) findViewById(R.id.show_result);
        textView.setText("Result: " + result);
    }


}
