package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzbf extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbf> CREATOR = new Y5.b(15);
    public final Bundle alpha;

    public zzbf(Bundle bundle) {
        this.alpha = bundle;
    }

    public final Double E() {
        return Double.valueOf(this.alpha.getDouble("value"));
    }

    public final Object F(String str) {
        return this.alpha.get(str);
    }

    public final String G() {
        return this.alpha.getString("currency");
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new Oe.aj(this);
    }

    public final Bundle o() {
        return new Bundle(this.alpha);
    }

    public final String toString() {
        return this.alpha.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.bravo(parcel, 2, o());
        AbstractC3043q.romeo(parcel, quebec);
    }
}
