package com.google.android.gms.internal.identity;

import Y5.a;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzee extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzee> CREATOR = new a(23);
    public final int alpha;
    public final IBinder purple;
    public final IBinder red;
    public final PendingIntent silver;
    public final String teal;

    public zzee(int i4, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.alpha = i4;
        this.purple = iBinder;
        this.red = iBinder2;
        this.silver = pendingIntent;
        this.teal = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.foxtrot(parcel, 2, this.purple);
        AbstractC3043q.foxtrot(parcel, 3, this.red);
        AbstractC3043q.kilo(parcel, 4, this.silver, i4);
        AbstractC3043q.lima(parcel, 6, this.teal);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
