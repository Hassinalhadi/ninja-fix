package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import w6.b;
import z1.AbstractC3461a;

/* loaded from: classes3.dex */
public class ObservableLong extends AbstractC3461a implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableLong> CREATOR = new b(6);
    public long alpha;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.alpha);
    }
}
