package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class StyleSpan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StyleSpan> CREATOR = new w6.b(9);
    public final StrokeStyle alpha;
    public final double purple;

    public StyleSpan(StrokeStyle strokeStyle, double d4) {
        if (d4 > 0.0d) {
            this.alpha = strokeStyle;
            this.purple = d4;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.kilo(parcel, 2, this.alpha, i4);
        AbstractC3043q.sierra(parcel, 3, 8);
        parcel.writeDouble(this.purple);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
