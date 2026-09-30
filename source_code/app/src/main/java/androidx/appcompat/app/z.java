package androidx.appcompat.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class z implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return AppCompatDelegateImpl$PanelFeatureState$SavedState.charlie(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new AppCompatDelegateImpl$PanelFeatureState$SavedState[i4];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return AppCompatDelegateImpl$PanelFeatureState$SavedState.charlie(parcel, null);
    }
}
