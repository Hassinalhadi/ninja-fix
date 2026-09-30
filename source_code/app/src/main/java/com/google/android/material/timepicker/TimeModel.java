package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new Object();
    public final int alpha;
    public final int purple;
    public final int red;
    public final int silver;

    public TimeModel(Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        this.purple = readInt;
        this.red = readInt2;
        this.silver = readInt3;
        this.alpha = readInt4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        if (this.purple == timeModel.purple && this.red == timeModel.red && this.alpha == timeModel.alpha && this.silver == timeModel.silver) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.alpha), Integer.valueOf(this.purple), Integer.valueOf(this.red), Integer.valueOf(this.silver)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.purple);
        parcel.writeInt(this.red);
        parcel.writeInt(this.silver);
        parcel.writeInt(this.alpha);
    }
}
