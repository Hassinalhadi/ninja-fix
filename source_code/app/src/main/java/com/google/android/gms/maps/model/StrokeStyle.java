package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import w6.c;

/* loaded from: classes2.dex */
public final class StrokeStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StrokeStyle> CREATOR = new c(8);
    public final float alpha;
    public final int purple;
    public final int red;
    public final boolean silver;
    public final StampStyle teal;

    public StrokeStyle(float f5, int i4, int i5, boolean z2, StampStyle stampStyle) {
        this.alpha = f5;
        this.purple = i4;
        this.red = i5;
        this.silver = z2;
        this.teal = stampStyle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeFloat(this.alpha);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.red);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.silver ? 1 : 0);
        AbstractC3043q.kilo(parcel, 6, this.teal, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
