package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import java.util.List;

/* loaded from: classes2.dex */
public final class af extends AbstractC1394y implements ag {
    @Override // com.google.android.gms.measurement.internal.ag
    public final void cyan(List list) {
        Parcel ivory = ivory();
        ivory.writeTypedList(list);
        lime(ivory);
    }
}
