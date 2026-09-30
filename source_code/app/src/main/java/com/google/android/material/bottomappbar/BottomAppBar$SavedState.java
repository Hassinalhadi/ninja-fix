package com.google.android.material.bottomappbar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes2.dex */
class BottomAppBar$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<BottomAppBar$SavedState> CREATOR = new Object();
    public final int red;
    public final boolean silver;

    public BottomAppBar$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z2;
        this.red = parcel.readInt();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.silver = z2;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.red);
        parcel.writeInt(this.silver ? 1 : 0);
    }
}
