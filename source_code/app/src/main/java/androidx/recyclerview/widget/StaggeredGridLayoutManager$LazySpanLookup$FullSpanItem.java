package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> CREATOR = new Object();
    public int alpha;
    public int purple;
    public int[] red;
    public boolean silver;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.alpha + ", mGapDir=" + this.purple + ", mHasUnwantedGapAfter=" + this.silver + ", mGapPerSpan=" + Arrays.toString(this.red) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.alpha);
        parcel.writeInt(this.purple);
        parcel.writeInt(this.silver ? 1 : 0);
        int[] iArr = this.red;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.red);
        } else {
            parcel.writeInt(0);
        }
    }
}
