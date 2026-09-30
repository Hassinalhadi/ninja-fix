package com.google.android.material.search;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class a implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int alpha;

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.alpha) {
            case 0:
                return new SearchBar$SavedState(parcel, classLoader);
            default:
                return new SearchView$SavedState(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.alpha) {
            case 0:
                return new SearchBar$SavedState[i4];
            default:
                return new SearchView$SavedState[i4];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.alpha) {
            case 0:
                return new SearchBar$SavedState(parcel, null);
            default:
                return new SearchView$SavedState(parcel, null);
        }
    }
}
