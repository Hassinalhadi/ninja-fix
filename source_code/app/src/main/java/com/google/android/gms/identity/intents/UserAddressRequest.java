package com.google.android.gms.identity.intents;

import Y5.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class UserAddressRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddressRequest> CREATOR = new b(21);
    public ArrayList alpha;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.papa(parcel, 2, this.alpha);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
