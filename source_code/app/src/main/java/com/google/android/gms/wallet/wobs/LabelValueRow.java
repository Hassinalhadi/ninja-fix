package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import t6.AbstractC3043q;
import z1.e;

/* loaded from: classes2.dex */
public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new e(17);
    public final String alpha;
    public final String purple;
    public final ArrayList red;

    public LabelValueRow(ArrayList arrayList, String str, String str2) {
        this.alpha = str;
        this.purple = str2;
        this.red = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 2, this.alpha);
        AbstractC3043q.lima(parcel, 3, this.purple);
        AbstractC3043q.papa(parcel, 4, this.red);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
