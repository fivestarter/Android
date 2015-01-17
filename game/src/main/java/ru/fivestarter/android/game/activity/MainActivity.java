package ru.fivestarter.android.game.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import ru.fivestarter.android.game.R;

/**
 * @author yuriy on 17.01.15.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

    }

    public void showDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Title");
        builder.setMessage("It is dialog");
        builder.setIcon(R.drawable.ic_launcher);
        builder.setCancelable(true);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast toast = Toast.makeText(MainActivity.this, "No", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast toast = Toast.makeText(MainActivity.this, "Yes", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                Toast toast = Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
