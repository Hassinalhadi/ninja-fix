package com.google.android.gms.common;

import V5.x;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class b extends DialogFragment {
    public Dialog alpha;
    public DialogInterface.OnCancelListener purple;
    public AlertDialog red;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.purple;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.alpha;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.red == null) {
                Activity activity = getActivity();
                x.hotel(activity);
                this.red = new AlertDialog.Builder(activity).create();
            }
            return this.red;
        }
        return dialog;
    }
}
