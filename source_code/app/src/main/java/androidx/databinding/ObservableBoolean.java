package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import w6.b;
import z1.AbstractC3461a;

/* loaded from: classes3.dex */
public class ObservableBoolean extends AbstractC3461a implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new b(3);
    public boolean alpha;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.alpha ? 1 : 0);
    }
}
