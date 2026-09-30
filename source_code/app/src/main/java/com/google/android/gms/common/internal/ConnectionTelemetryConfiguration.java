package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import z1.e;

/* loaded from: classes2.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new e(29);
    public final RootTelemetryConfiguration alpha;
    public final boolean purple;
    public final boolean red;
    public final int[] silver;
    public final int teal;
    public final int[] white;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z2, boolean z10, int[] iArr, int i4, int[] iArr2) {
        this.alpha = rootTelemetryConfiguration;
        this.purple = z2;
        this.red = z10;
        this.silver = iArr;
        this.teal = i4;
        this.white = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.kilo(parcel, 1, this.alpha, i4);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple ? 1 : 0);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red ? 1 : 0);
        AbstractC3043q.golf(parcel, 4, this.silver);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.teal);
        AbstractC3043q.golf(parcel, 6, this.white);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
