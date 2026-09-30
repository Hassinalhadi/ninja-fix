package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class ar extends AbstractC1394y implements as {
    public ar(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 0);
    }

    @Override // com.google.android.gms.internal.measurement.as
    public final int alpha() {
        Parcel jade = jade(ivory(), 2);
        int readInt = jade.readInt();
        jade.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.measurement.as
    public final void mike(long j5, Bundle bundle, String str, String str2) {
        Parcel ivory = ivory();
        ivory.writeString(str);
        ivory.writeString(str2);
        aa.charlie(ivory, bundle);
        ivory.writeLong(j5);
        lavender(ivory, 1);
    }
}
