package com.google.android.material.search;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes2.dex */
class SearchView$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SearchView$SavedState> CREATOR = new a(1);
    public final String red;
    public final int silver;

    public SearchView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.red = parcel.readString();
        this.silver = parcel.readInt();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeString(this.red);
        parcel.writeInt(this.silver);
    }
}
