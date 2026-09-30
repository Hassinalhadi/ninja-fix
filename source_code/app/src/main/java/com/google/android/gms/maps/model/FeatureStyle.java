package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import w6.c;

/* loaded from: classes2.dex */
public final class FeatureStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FeatureStyle> CREATOR = new c(12);
    public final Integer alpha;
    public final Integer purple;
    public final Float red;
    public final Float silver;

    public FeatureStyle(Integer num, Integer num2, Float f5, Float f10) {
        this.alpha = num;
        this.purple = num2;
        this.red = f5;
        this.silver = f10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.india(parcel, 1, this.alpha);
        AbstractC3043q.india(parcel, 2, this.purple);
        AbstractC3043q.echo(parcel, 3, this.red);
        AbstractC3043q.echo(parcel, 4, this.silver);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
