
package edu.purdue.anjalimalik;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import java.util.Stack;

/**
 * MainActivity class that serves the same purpose to an Android app as the heart does to humans
 * Basically, the most important class of the app
 *
 */
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
    //public Bundle savedInstanceState;

    /**
     * Called when the activity is starting.  This is where most initialization
     * should go.
     *
     * /* @param savedInstanceState If the activity is being re-initialized after
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



        twentyFortyEight.reset();
        //resetAction();
    }

    /**
     * Method invoked when the Up button is pressed
     *
     * @param view - the UI of the app
     */
    public void upAction(View view) {


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


        twentyFortyEight.moveRight();
        customGrid.updateGrid(twentyFortyEight.getBoard());
        scoreBox.setText(String.valueOf(twentyFortyEight.getScore()));
        twentyFortyEight.placeRandom();

    }

    /* reset() */

  //  public void resetAction(View view) {
        //Button reset = (Button)findViewById(R.id.resetBox);
        //ActionListener;
    //    final Button resetbutton = (Button) findViewById(R.id.resetBox);
      //  resetbutton.setOnClickListener(new View.OnClickListener()

        //{
          //  public void onClick (View v){
           // }
        //});

    //}

    public void resetAction(View view) {
        twentyFortyEight.reset();
        customGrid.reset();
        scoreBox.setText('0');
    }

    public void undoAction(View view){
        Stack stack = new Stack();


        //stack.push(savedInstanceState);

        //stack.pop(savedInstanceState);
    }

    public void redoAction(View view){


    }

}
