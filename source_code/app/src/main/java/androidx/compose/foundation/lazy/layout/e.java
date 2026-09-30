package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new DefaultLazyKey(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new DefaultLazyKey[i4];
    }
}
