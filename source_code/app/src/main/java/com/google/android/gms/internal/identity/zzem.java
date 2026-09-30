package com.google.android.gms.internal.identity;

import Y5.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p6.t;
import p6.v;
import p6.w;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzem> CREATOR = new a(25);
    public final v alpha;
    public final PendingIntent purple;
    public final String red;

    public zzem(List list, PendingIntent pendingIntent, String str) {
        v lima;
        if (list == null) {
            t tVar = v.purple;
            lima = w.teal;
        } else {
            lima = v.lima(list);
        }
        this.alpha = lima;
        this.purple = pendingIntent;
        this.red = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.november(parcel, 1, this.alpha);
        AbstractC3043q.kilo(parcel, 2, this.purple, i4);
        AbstractC3043q.lima(parcel, 3, this.red);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
