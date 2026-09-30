package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import z1.e;

/* loaded from: classes2.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new e(27);
    public final int alpha;
    public final boolean purple;
    public final boolean red;
    public final int silver;
    public final int teal;

    public RootTelemetryConfiguration(int i4, boolean z2, boolean z10, int i5, int i10) {
        this.alpha = i4;
        this.purple = z2;
        this.red = z10;
        this.silver = i5;
        this.teal = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple ? 1 : 0);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red ? 1 : 0);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.silver);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.teal);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
