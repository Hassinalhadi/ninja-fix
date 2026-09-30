package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes3.dex */
class AppCompatSpinner$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<AppCompatSpinner$SavedState> CREATOR = new C0467m(1);
    public boolean alpha;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeByte(this.alpha ? (byte) 1 : (byte) 0);
    }
}
