package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        textView = (TextView) findViewById(R.id.show_welcome);
        textView2 = (TextView) findViewById(R.id.rules);

    }



    public void onStartButtonClicked(View view){
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
}
