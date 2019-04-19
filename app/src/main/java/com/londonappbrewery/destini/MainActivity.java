package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
     private TextView mainTextView;
     private Button  firstDisplayButton;
     private  Button  secondDisplayButton;
     private int mstoryindex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
         mainTextView = (TextView) findViewById(R.id.storyTextView);
         firstDisplayButton = (Button) findViewById(R.id.buttonTop);
         secondDisplayButton=  (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:






          firstDisplayButton.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  if (mstoryindex==1 || mstoryindex ==2){
               mainTextView.setText(R.string.T3_Story);
               firstDisplayButton.setText(R.string.T3_Ans1);
               secondDisplayButton.setText(R.string.T3_Ans2);
                      mstoryindex = 3;
              }else if (mstoryindex==3) {
                      mainTextView.setText(R.string.T6_End);
                      firstDisplayButton.setVisibility(View.GONE);
                      secondDisplayButton.setVisibility(View.GONE);
                  }
              }
          });

          secondDisplayButton.setOnClickListener(new View.OnClickListener(){
              @Override
              public void onClick(View v) {

                  if (mstoryindex == 1){
                  mainTextView.setText(R.string.T2_Story);
                  secondDisplayButton.setText(R.string.T2_Ans1);
                  secondDisplayButton.setText(R.string.T2_Ans2);
                  mstoryindex = 2;
              } else  if (mstoryindex==2){
                      mainTextView.setText(R.string.T4_End);

                      firstDisplayButton.setVisibility(View.GONE);
                      secondDisplayButton.setVisibility(View.GONE);
                  }else if (mstoryindex==3){
                      mainTextView.setText(R.string.T5_End);
                      firstDisplayButton.setVisibility(View.GONE);
                      secondDisplayButton.setVisibility(View.GONE);
                  }
              }
          });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
