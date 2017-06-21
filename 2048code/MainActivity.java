

package edu.purdue.anjalimalik;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //The context of the app. Context is used to refer to certain resources of the app outside of
    //the MainActivity class
    private static Context mContext;

    /**
     * Get the context of the app
     *
     * @return the context of the app
     */
    public static Context getAppContext() {
        return mContext;
    }

    //An object of our TwentyFortyEight class
    private TwentyFortyEight twentyFortyEight;

    //An object of CustomGrid class
    private CustomGrid customGrid;

    //The score box text in the app
    private TextView scoreBox;

    /**
     * @param savedInstanceState If the activity is being re-initialized after
     *                           previously being shut down then this Bundle contains the data it most
     *                           recently supplied in {@link #onSaveInstanceState}.
     * @see #onSaveInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = getApplicationContext();
        twentyFortyEight = new TwentyFortyEight(4);
        customGrid = new CustomGrid();

        GridView grid = (GridView) findViewById(R.id.mainGrid);
        scoreBox = (TextView) findViewById(R.id.scoreBox);

        grid.setAdapter(customGrid);

        //Calling the reset() method of TwentyFortyClass to reset the board when the app
        //first starts

        twentyFortyEight.reset();
    }

    /**
     * Method invoked when the Up button is pressed
     *
     * @param view - the UI of the app
     */
    public void upAction(View view) {
        //Using the moveUp method of TwentyFortyEight to implement the logic to be performed
        //Calling the updateGrid method of CustomGrid and pass TwentyFortyEight's board
        //as parameter

        //Using the scoreBox.setText() method to update the value of the score box based on
        //the score from TwentyFortyEight
        //twentyFortyEight.update_score();

        twentyFortyEight.moveUp();
        customGrid.updateGrid(twentyFortyEight.getBoard());
        scoreBox.setText(String.valueOf(twentyFortyEight.getScore()));
        twentyFortyEight.placeRandom();

    }

    /**
     * Method invoked when the Down button is pressed
     *
     * @param view - the UI of the app
     */
    public void downAction(View view) {
        //Using the moveUp method of TwentyFortyEight to implement the logic to be performed
        //Calling the updateGrid method of CustomGrid and pass TwentyFortyEight's board
        //as parameter
        //Using the scoreBox.setText() method to update the value of the score box based on
        //the score from TwentyFortyEight

        twentyFortyEight.moveDown();
        customGrid.updateGrid(twentyFortyEight.getBoard());
        scoreBox.setText(String.valueOf(twentyFortyEight.getScore()));
        twentyFortyEight.placeRandom();

    }

    /**
     * Method invoked when the Left button is pressed
     *
     * @param view - the UI of the app
     */
    public void leftAction(View view) {
        //Using the moveUp method of TwentyFortyEight to implement the logic to be performed
        //Calling the updateGrid method of CustomGrid and pass TwentyFortyEight's board
        //as parameter
        //Using the scoreBox.setText() method to update the value of the score box based on
        //the score from TwentyFortyEight

        twentyFortyEight.moveLeft();
        customGrid.updateGrid(twentyFortyEight.getBoard());
        scoreBox.setText(String.valueOf(twentyFortyEight.getScore()));
        twentyFortyEight.placeRandom();

    }

    /**
     * Method invoked when the Right button is pressed
     *
     * @param view - the UI of the app
     */
    public void rightAction(View view) {
        //Using moveUp method of TwentyFortyEight to implement the logic to be performed
        //Calling the updateGrid method of CustomGrid and pass TwentyFortyEight's board
        //as parameter
        //Using the scoreBox.setText() method to update the value of the score box based on
        //the score from TwentyFortyEight

        twentyFortyEight.moveRight();
        customGrid.updateGrid(twentyFortyEight.getBoard());
        scoreBox.setText(String.valueOf(twentyFortyEight.getScore()));
        twentyFortyEight.placeRandom();

    }
}
