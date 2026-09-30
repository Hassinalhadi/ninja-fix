package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import t6.AbstractC3043q;
import z1.e;

/* loaded from: classes2.dex */
public final class zag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zag> CREATOR = new e(2);
    public final ArrayList alpha;
    public final String purple;

    public zag(String str, ArrayList arrayList) {
        this.alpha = arrayList;
        this.purple = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.november(parcel, 1, this.alpha);
        AbstractC3043q.lima(parcel, 2, this.purple);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
