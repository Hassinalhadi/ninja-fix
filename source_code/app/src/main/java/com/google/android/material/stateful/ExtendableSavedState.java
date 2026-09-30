package com.google.android.material.stateful;

import S.q;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import bv.aw;

/* loaded from: classes2.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new q(4);
    public final aw red;

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.red = new aw(0);
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.red + "}";
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        aw awVar = this.red;
        int i5 = awVar.red;
        parcel.writeInt(i5);
        String[] strArr = new String[i5];
        Bundle[] bundleArr = new Bundle[i5];
        for (int i10 = 0; i10 < i5; i10++) {
            strArr[i10] = (String) awVar.foxtrot(i10);
            bundleArr[i10] = (Bundle) awVar.juliet(i10);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.red = new aw(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            this.red.put(strArr[i4], bundleArr[i4]);
        }
    }
}
