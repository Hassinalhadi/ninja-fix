package androidx.slidingpanelayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes3.dex */
class SlidingPaneLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SlidingPaneLayout$SavedState> CREATOR = new Object();
    public final boolean red;
    public final int silver;

    public SlidingPaneLayout$SavedState(Parcel parcel) {
        super(parcel, null);
        boolean z2;
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.red = z2;
        this.silver = parcel.readInt();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.red ? 1 : 0);
        parcel.writeInt(this.silver);
    }
}
