package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
class FragmentTabHost$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<FragmentTabHost$SavedState> CREATOR = new C0607b(5);
    public String alpha;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentTabHost.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" curTab=");
        return P0.gold(sb2, this.alpha, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeString(this.alpha);
    }
}
