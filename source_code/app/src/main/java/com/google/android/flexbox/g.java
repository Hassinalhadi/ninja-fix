package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.flexbox.FlexboxLayoutManager;

/* loaded from: classes3.dex */
public final class g implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.flexbox.FlexboxLayoutManager$SavedState, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ?? obj = new Object();
        obj.alpha = parcel.readInt();
        obj.purple = parcel.readInt();
        return obj;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new FlexboxLayoutManager.SavedState[i4];
    }
}
