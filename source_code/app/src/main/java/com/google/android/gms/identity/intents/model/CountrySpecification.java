package com.google.android.gms.identity.intents.model;

import Y5.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class CountrySpecification extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CountrySpecification> CREATOR = new a(22);
    public String alpha;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 2, this.alpha);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
