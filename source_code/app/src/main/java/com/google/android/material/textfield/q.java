package com.google.android.material.textfield;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.C0466l0;

/* loaded from: classes2.dex */
public final class q implements AdapterView.OnItemClickListener {
    public final /* synthetic */ s alpha;

    public q(s sVar) {
        this.alpha = sVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j5) {
        Object item;
        CharSequence convertSelectionToString;
        int selectedItemPosition;
        View view2 = null;
        s sVar = this.alpha;
        if (i4 < 0) {
            C0466l0 c0466l0 = sVar.teal;
            if (!c0466l0.f2900s.isShowing()) {
                item = null;
            } else {
                item = c0466l0.red.getSelectedItem();
            }
        } else {
            item = sVar.getAdapter().getItem(i4);
        }
        convertSelectionToString = sVar.convertSelectionToString(item);
        sVar.setText(convertSelectionToString, false);
        AdapterView.OnItemClickListener onItemClickListener = sVar.getOnItemClickListener();
        C0466l0 c0466l02 = sVar.teal;
        if (onItemClickListener != null) {
            if (view == null || i4 < 0) {
                if (c0466l02.f2900s.isShowing()) {
                    view2 = c0466l02.red.getSelectedView();
                }
                view = view2;
                if (!c0466l02.f2900s.isShowing()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = c0466l02.red.getSelectedItemPosition();
                }
                i4 = selectedItemPosition;
                if (!c0466l02.f2900s.isShowing()) {
                    j5 = Long.MIN_VALUE;
                } else {
                    j5 = c0466l02.red.getSelectedItemId();
                }
            }
            onItemClickListener.onItemClick(c0466l02.red, view, i4, j5);
        }
        c0466l02.dismiss();
    }
}
