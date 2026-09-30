package androidx.viewpager2.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes3.dex */
class ViewPager2$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<ViewPager2$SavedState> CREATOR = new Object();
    public int alpha;
    public int purple;
    public Parcelable red;

    public ViewPager2$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.alpha = parcel.readInt();
        this.purple = parcel.readInt();
        this.red = parcel.readParcelable(classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.alpha);
        parcel.writeInt(this.purple);
        parcel.writeParcelable(this.red, i4);
    }
}
