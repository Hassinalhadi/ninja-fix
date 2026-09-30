package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
class FragmentManager$LaunchedFragmentInfo implements Parcelable {
    public static final Parcelable.Creator<FragmentManager$LaunchedFragmentInfo> CREATOR = new C0607b(2);
    public String alpha;
    public int purple;

    public FragmentManager$LaunchedFragmentInfo(String str, int i4) {
        this.alpha = str;
        this.purple = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.alpha);
        parcel.writeInt(this.purple);
    }
}
