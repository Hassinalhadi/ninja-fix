package com.google.android.material.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes2.dex */
class NavigationBarView$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<NavigationBarView$SavedState> CREATOR = new Object();
    public final Bundle red;

    public NavigationBarView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.red = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeBundle(this.red);
    }
}
