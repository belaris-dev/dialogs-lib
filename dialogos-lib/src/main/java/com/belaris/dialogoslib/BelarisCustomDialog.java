package com.belaris.dialogoslib;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

public abstract class BelarisCustomDialog extends BelarisDialog {

    public BelarisCustomDialog(Context context, String titulo, String mensaje, int layoutId) {
        super(context);
        setTitle(titulo);
        setMessage(mensaje);
        setCustomLayoutResource(layoutId);
    }

    public BelarisCustomDialog(Context context, int titulo, int mensaje, int layoutId) {
        super(context);
        setTitle(titulo);
        setMessage(mensaje);
        setCustomLayoutResource(layoutId);
    }

    protected BelarisCustomDialog(Context context, int layoutId) {
        super(context);
        setCustomLayoutResource(layoutId);
    }

    private void setCustomLayoutResource(int layoutId) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(layoutId, null);
        setView(view);
        configCustomViews(view);
    }

    protected abstract void configCustomViews(View rootView);
}
