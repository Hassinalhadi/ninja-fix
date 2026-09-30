package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class B implements Parcelable.ClassLoaderCreator {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.ParcelableSnapshotMutableState, androidx.compose.runtime.t0] */
    public static ParcelableSnapshotMutableState alpha(Parcel parcel, ClassLoader classLoader) {
        as asVar;
        if (classLoader == null) {
            classLoader = B.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt != 1) {
                if (readInt == 2) {
                    asVar = as.silver;
                } else {
                    throw new IllegalStateException(av.q.delta(readInt, "Unsupported MutableState policy ", " was restored"));
                }
            } else {
                asVar = as.white;
            }
        } else {
            asVar = as.red;
        }
        return new t0(readValue, asVar);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return alpha(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new ParcelableSnapshotMutableState[i4];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return alpha(parcel, null);
    }
}
