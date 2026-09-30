package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import w6.c;
import z1.AbstractC3461a;

/* loaded from: classes3.dex */
public class ObservableDouble extends AbstractC3461a implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new c(4);
    public double alpha;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeDouble(this.alpha);
    }
}
