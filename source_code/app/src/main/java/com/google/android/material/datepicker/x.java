package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class x implements Parcelable.Creator {
    public final /* synthetic */ int alpha;

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.material.datepicker.SingleDateSelector, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.alpha) {
            case 0:
                return Month.delta(parcel.readInt(), parcel.readInt());
            case 1:
                return new DateValidatorPointBackward(parcel.readLong());
            case 2:
                return new DateValidatorPointForward(parcel.readLong());
            case 3:
                RangeDateSelector rangeDateSelector = new RangeDateSelector();
                rangeDateSelector.purple = (Long) parcel.readValue(Long.class.getClassLoader());
                rangeDateSelector.red = (Long) parcel.readValue(Long.class.getClassLoader());
                return rangeDateSelector;
            default:
                ?? obj = new Object();
                obj.alpha = (Long) parcel.readValue(Long.class.getClassLoader());
                return obj;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.alpha) {
            case 0:
                return new Month[i4];
            case 1:
                return new DateValidatorPointBackward[i4];
            case 2:
                return new DateValidatorPointForward[i4];
            case 3:
                return new RangeDateSelector[i4];
            default:
                return new SingleDateSelector[i4];
        }
    }
}
