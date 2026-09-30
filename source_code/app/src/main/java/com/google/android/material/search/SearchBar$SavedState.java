package com.google.android.material.search;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes2.dex */
class SearchBar$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SearchBar$SavedState> CREATOR = new a(0);
    public final String red;

    public SearchBar$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.red = parcel.readString();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeString(this.red);
    }
}
