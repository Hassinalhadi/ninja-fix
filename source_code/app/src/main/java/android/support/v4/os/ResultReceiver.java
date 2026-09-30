package android.support.v4.os;

import Y5.b;
import ad.c;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new b(3);
    public ad.b alpha;

    public void charlie(int i4, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        synchronized (this) {
            try {
                if (this.alpha == null) {
                    this.alpha = new c(this);
                }
                parcel.writeStrongBinder(this.alpha.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
