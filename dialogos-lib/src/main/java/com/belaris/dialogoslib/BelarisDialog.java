package com.belaris.dialogoslib;

/**
 * Created by garispe on 11/9/17.
 */

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;

public abstract class BelarisDialog extends AlertDialog.Builder {

    public BelarisDialog(Context context) {
        super(context);
    }
}
