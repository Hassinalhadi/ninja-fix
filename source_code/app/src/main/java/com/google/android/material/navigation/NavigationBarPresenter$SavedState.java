package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;

/* loaded from: classes2.dex */
class NavigationBarPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator<NavigationBarPresenter$SavedState> CREATOR = new Object();
    public int alpha;
    public ParcelableSparseArray purple;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.alpha);
        parcel.writeParcelable(this.purple, 0);
    }
}
