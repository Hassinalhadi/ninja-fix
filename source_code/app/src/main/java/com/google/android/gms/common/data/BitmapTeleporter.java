package com.google.android.gms.common.data;

import V5.x;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import z6.k;

/* loaded from: classes2.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new k(22);
    public final int alpha;
    public ParcelFileDescriptor purple;
    public final int red;

    public BitmapTeleporter(int i4, ParcelFileDescriptor parcelFileDescriptor, int i5) {
        this.alpha = i4;
        this.purple = parcelFileDescriptor;
        this.red = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        if (this.purple != null) {
            int quebec = AbstractC3043q.quebec(parcel, 20293);
            AbstractC3043q.sierra(parcel, 1, 4);
            parcel.writeInt(this.alpha);
            AbstractC3043q.kilo(parcel, 2, this.purple, i4 | 1);
            AbstractC3043q.sierra(parcel, 3, 4);
            parcel.writeInt(this.red);
            AbstractC3043q.romeo(parcel, quebec);
            this.purple = null;
            return;
        }
        x.hotel(null);
        throw null;
    }
}
