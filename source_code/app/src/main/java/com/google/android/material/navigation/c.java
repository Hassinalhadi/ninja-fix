package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;

/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.material.navigation.NavigationBarPresenter$SavedState] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ?? obj = new Object();
        obj.alpha = parcel.readInt();
        obj.purple = (ParcelableSparseArray) parcel.readParcelable(NavigationBarPresenter$SavedState.class.getClassLoader());
        return obj;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new NavigationBarPresenter$SavedState[i4];
    }
}
