package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class w<S> extends ac {
    public int purple;
    public DateSelector red;
    public CalendarConstraints silver;

    @Override // androidx.fragment.app.ai
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.purple = bundle.getInt("THEME_RES_ID_KEY");
        this.red = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.silver = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.red.w(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.purple)), viewGroup, this.silver, new t(this, 1));
    }

    @Override // androidx.fragment.app.ai
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.purple);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.red);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.silver);
    }
}
