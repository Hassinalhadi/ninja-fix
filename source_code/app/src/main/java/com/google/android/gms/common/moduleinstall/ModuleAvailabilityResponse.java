package com.google.android.gms.common.moduleinstall;

import Y5.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new a(0);
    public final boolean alpha;
    public final int purple;

    public ModuleAvailabilityResponse(int i4, boolean z2) {
        this.alpha = z2;
        this.purple = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha ? 1 : 0);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
