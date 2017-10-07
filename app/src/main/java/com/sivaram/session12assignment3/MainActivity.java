package com.sivaram.session12assignment3;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Declare Button Object and typecast from xml to Java
    Button alertDialogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Typecast Button from XML
        alertDialogButton = (Button) findViewById(R.id.showDialogButton);


        // Setup Click Event Listener
        alertDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create Alert Dialog Object
                ShowAlertDialog();
            }
        });
    }

    public void ShowAlertDialog(){

        // Create An AlertDialog Builder Object and assign to current context.
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        // Set Alert Dialog Title. Retrieve from String Constants.
        alertDialogBuilder.setTitle(R.string.alert_title);

        // Set Alert Dialog Icon. Retrieve From Icon Constants
        alertDialogBuilder.setIcon(R.drawable.cancel_icon);

        // Set Alert Dialog Message. Retrieve From string constants
        alertDialogBuilder.setMessage(R.string.alert_message);

        // Set Positive Response Button
        alertDialogBuilder.setPositiveButton(R.string.alert_yes, new DialogInterface.OnClickListener() {
            // Create Positive Button Click Listener
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Show Toast On Positive Response Button Click
                Toast.makeText(MainActivity.this, R.string.yes_clicked, Toast.LENGTH_SHORT).show();
            }
        });

        // Create Negative Response Button
        alertDialogBuilder.setNegativeButton(R.string.alert_no, new DialogInterface.OnClickListener() {
            // Create Negative Button Click Listener
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Show Toast On Negative Response Button Click
                Toast.makeText(MainActivity.this, R.string.no_clicked, Toast.LENGTH_SHORT).show();
            }
        });

        // Create Alert Dialog Object and assign AlertDialog Builder Object to Create Alert Dialog.
        AlertDialog alertDialog = alertDialogBuilder.create();

        // Finally Show the Alert Dialog.
        alertDialog.show();
    }
}
