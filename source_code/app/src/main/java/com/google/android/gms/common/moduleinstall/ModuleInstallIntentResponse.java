package com.google.android.gms.common.moduleinstall;

import Y5.b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new b(0);
    public final PendingIntent alpha;

    public ModuleInstallIntentResponse(PendingIntent pendingIntent) {
        this.alpha = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.kilo(parcel, 1, this.alpha, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
