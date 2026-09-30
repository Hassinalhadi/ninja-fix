package com.google.android.material.checkbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.P0;

/* loaded from: classes2.dex */
class MaterialCheckBox$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<MaterialCheckBox$SavedState> CREATOR = new Object();
    public int alpha;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" CheckedState=");
        int i4 = this.alpha;
        if (i4 != 1) {
            if (i4 != 2) {
                str = "unchecked";
            } else {
                str = "indeterminate";
            }
        } else {
            str = "checked";
        }
        return P0.gold(sb2, str, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeValue(Integer.valueOf(this.alpha));
    }
}
