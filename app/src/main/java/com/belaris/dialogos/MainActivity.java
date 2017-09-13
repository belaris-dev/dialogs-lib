package com.belaris.dialogos;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.belaris.dialogoslib.BelarisCustomDialog;
import com.belaris.dialogoslib.BelarisDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.default_dialog_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDefaultDialog();
            }
        });

        findViewById(R.id.custom_dialog_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogWithCustomLayout();
            }
        });

        findViewById(R.id.buttons_dialog_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogWithButtons();
            }
        });
    }

    public void showDefaultDialog() {
        BelarisDialog dialog = new BelarisDialog(this, "Hello", "World!");
        dialog.showDialog();
    }

    public void showDialogWithCustomLayout() {
        BelarisDialog dialog = new BelarisCustomDialog(this, R.layout.dialog_custom) {
            @Override
            protected void configCustomViews(View rootView) {
                final TextView textView = rootView.findViewById(R.id.text);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textView.setText("World, hello!");
                    }
                });
            }
        };
        dialog.showDialog();
    }

    public void showDialogWithButtons() {
        BelarisDialog dialog = new BelarisDialog(this, "Hello", "World!");
        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Ok clicked", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Cancel clicked", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.showDialog();
    }
}
