package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import t6.AbstractC3043q;
import z6.k;

/* loaded from: classes2.dex */
public final class CardRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardRequirements> CREATOR = new k(8);
    public ArrayList alpha;
    public boolean purple;
    public boolean red;
    public int silver;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.hotel(parcel, 1, this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple ? 1 : 0);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red ? 1 : 0);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.silver);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
