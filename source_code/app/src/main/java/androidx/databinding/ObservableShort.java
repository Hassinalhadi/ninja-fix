package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import w6.c;
import z1.AbstractC3461a;

/* loaded from: classes3.dex */
public class ObservableShort extends AbstractC3461a implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableShort> CREATOR = new c(6);
    public short alpha;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.alpha);
    }
}
