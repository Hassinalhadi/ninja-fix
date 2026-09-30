package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import w6.b;
import y2.C3393b;
import y2.InterfaceC3394c;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b(2);
    public final InterfaceC3394c alpha;

    public ParcelImpl(Parcel parcel) {
        this.alpha = new C3393b(parcel).hotel();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        new C3393b(parcel).kilo(this.alpha);
    }
}
