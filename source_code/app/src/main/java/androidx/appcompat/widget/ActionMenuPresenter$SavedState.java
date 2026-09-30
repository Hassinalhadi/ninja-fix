package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
class ActionMenuPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator<ActionMenuPresenter$SavedState> CREATOR = new C0467m(0);
    public int alpha;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.alpha);
    }
}
