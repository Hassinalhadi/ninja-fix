package android.support.v4.media;

import Y5.b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new b(6);
    public final int alpha;
    public final float purple;

    public RatingCompat(int i4, float f5) {
        this.alpha = i4;
        this.purple = f5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.alpha;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.alpha);
        sb2.append(" rating=");
        float f5 = this.purple;
        if (f5 < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f5);
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.alpha);
        parcel.writeFloat(this.purple);
    }
}
