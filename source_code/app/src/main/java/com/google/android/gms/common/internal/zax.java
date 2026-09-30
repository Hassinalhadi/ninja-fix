package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import z6.k;

/* loaded from: classes2.dex */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new k(26);
    public final int alpha;
    public final int purple;
    public final int red;
    public final Scope[] silver;

    public zax(int i4, int i5, int i10, Scope[] scopeArr) {
        this.alpha = i4;
        this.purple = i5;
        this.red = i10;
        this.silver = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red);
        AbstractC3043q.oscar(parcel, 4, this.silver, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
