package com.google.android.gms.common;

import V5.x;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w;

/* loaded from: classes2.dex */
public class g extends DialogInterfaceOnCancelListenerC0627w {

    /* renamed from: j, reason: collision with root package name */
    public Dialog f6639j;

    /* renamed from: k, reason: collision with root package name */
    public DialogInterface.OnCancelListener f6640k;

    /* renamed from: l, reason: collision with root package name */
    public AlertDialog f6641l;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w
    public final Dialog mike(Bundle bundle) {
        Dialog dialog = this.f6639j;
        if (dialog == null) {
            this.f3120a = false;
            if (this.f6641l == null) {
                Context context = getContext();
                x.hotel(context);
                this.f6641l = new AlertDialog.Builder(context).create();
            }
            return this.f6641l;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f6640k;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
