package com.google.android.gms.common.server.response;

import Y5.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new a(11);
    public final int alpha;
    public final String purple;
    public final FastJsonResponse$Field red;

    public zam(int i4, String str, FastJsonResponse$Field fastJsonResponse$Field) {
        this.alpha = i4;
        this.purple = str;
        this.red = fastJsonResponse$Field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.lima(parcel, 2, this.purple);
        AbstractC3043q.kilo(parcel, 3, this.red, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }

    public zam(String str, FastJsonResponse$Field fastJsonResponse$Field) {
        this.alpha = 1;
        this.purple = str;
        this.red = fastJsonResponse$Field;
    }
}
