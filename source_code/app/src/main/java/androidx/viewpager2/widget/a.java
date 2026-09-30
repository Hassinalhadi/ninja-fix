package androidx.viewpager2.widget;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes3.dex */
public final class a implements Parcelable.ClassLoaderCreator {
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$BaseSavedState, androidx.viewpager2.widget.ViewPager2$SavedState, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new ViewPager2$SavedState(parcel, null);
        }
        ?? baseSavedState = new View.BaseSavedState(parcel);
        baseSavedState.alpha = parcel.readInt();
        baseSavedState.purple = parcel.readInt();
        baseSavedState.red = parcel.readParcelable(null);
        return baseSavedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new ViewPager2$SavedState[i4];
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View$BaseSavedState, androidx.viewpager2.widget.ViewPager2$SavedState, java.lang.Object] */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new ViewPager2$SavedState(parcel, classLoader);
        }
        ?? baseSavedState = new View.BaseSavedState(parcel);
        baseSavedState.alpha = parcel.readInt();
        baseSavedState.purple = parcel.readInt();
        baseSavedState.red = parcel.readParcelable(null);
        return baseSavedState;
    }
}
