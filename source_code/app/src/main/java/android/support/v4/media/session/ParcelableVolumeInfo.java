package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Y5.b(8);
    public int alpha;
    public int purple;
    public int red;
    public int silver;
    public int teal;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.alpha);
        parcel.writeInt(this.red);
        parcel.writeInt(this.silver);
        parcel.writeInt(this.teal);
        parcel.writeInt(this.purple);
    }
}
