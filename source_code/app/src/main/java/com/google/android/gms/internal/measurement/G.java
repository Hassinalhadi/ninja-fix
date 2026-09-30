package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class G extends AbstractBinderC1398z implements as {
    public final G7.b golf;

    public G(G7.b bVar) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.golf = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.as
    public final int alpha() {
        return System.identityHashCode(this.golf);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1398z
    public final boolean bravo(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            if (i4 != 2) {
                return false;
            }
            int identityHashCode = System.identityHashCode(this.golf);
            parcel2.writeNoException();
            parcel2.writeInt(identityHashCode);
            return true;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Bundle bundle = (Bundle) aa.alpha(parcel, Bundle.CREATOR);
        long readLong = parcel.readLong();
        aa.bravo(parcel);
        mike(readLong, bundle, readString, readString2);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.as
    public final void mike(long j5, Bundle bundle, String str, String str2) {
        this.golf.alpha(j5, bundle, str, str2);
    }
}
