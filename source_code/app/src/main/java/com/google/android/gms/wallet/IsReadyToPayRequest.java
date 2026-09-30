package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import t6.AbstractC3043q;
import z6.k;

/* loaded from: classes2.dex */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new k(11);
    public ArrayList alpha;
    public String purple;
    public String red;
    public ArrayList silver;
    public boolean teal;
    public String white;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.hotel(parcel, 2, this.alpha);
        AbstractC3043q.lima(parcel, 4, this.purple);
        AbstractC3043q.lima(parcel, 5, this.red);
        AbstractC3043q.hotel(parcel, 6, this.silver);
        AbstractC3043q.sierra(parcel, 7, 4);
        parcel.writeInt(this.teal ? 1 : 0);
        AbstractC3043q.lima(parcel, 8, this.white);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
