package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import z1.AbstractC3461a;
import z1.e;

/* loaded from: classes3.dex */
public class ObservableParcelable<T extends Parcelable> extends AbstractC3461a implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableParcelable> CREATOR = new e(0);
    public Parcelable alpha;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.alpha, 0);
    }
}
