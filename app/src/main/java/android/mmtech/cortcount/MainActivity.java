package android.mmtech.cortcount;

import androidx.appcompat.app.AppCompatActivity;

import android.mmtech.cortcount.R;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A
     */
    void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointsA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointsA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrowA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B
     */
    void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointsB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointsB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset score teamA & teamB
     */
    public void resetCount(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
