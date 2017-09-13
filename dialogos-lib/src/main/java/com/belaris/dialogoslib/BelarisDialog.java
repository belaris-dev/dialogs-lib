package com.belaris.dialogoslib;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;

public class BelarisDialog extends AlertDialog.Builder {

    BelarisDialog(Context context) {
        super(context);
    }

    public BelarisDialog(Context context, String titulo, String mensaje) {
        super(context);
        setTitle(titulo);
        setMessage(mensaje);
    }

    public BelarisDialog(Context context, int titulo, int mensaje) {
        super(context);
        setTitle(titulo);
        setMessage(mensaje);
    }

    public void showDialog() {
        create().show();
    }
}
