package com.google.android.material.checkbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, com.google.android.material.checkbox.MaterialCheckBox$SavedState, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ?? baseSavedState = new View.BaseSavedState(parcel);
        baseSavedState.alpha = ((Integer) parcel.readValue(MaterialCheckBox$SavedState.class.getClassLoader())).intValue();
        return baseSavedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new MaterialCheckBox$SavedState[i4];
    }
}
