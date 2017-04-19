package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void onRockButtonClicked(View view){
        String userChoice = "Rock";
        Game game = new Game(userChoice);
        String compHand = game.getHandTwo();
        String result = game.getResult();
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", result);
        intent.putExtra("comp_hand", compHand);
        startActivity(intent);
    }

    public void onPaperButtonClicked(View view){
        String userChoice = "Paper";
        Game game = new Game(userChoice);
        String compHand = game.getHandTwo();
        String result = game.getResult();
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", result);
        intent.putExtra("comp_hand", compHand);
        startActivity(intent);
    }

    public void onScissorsButtonClicked(View view){
        String userChoice = "Scissors";
        Game game = new Game(userChoice);
        String compHand = game.getHandTwo();
        String result = game.getResult();
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", result);
        intent.putExtra("comp_hand", compHand);
        startActivity(intent);
    }
}
