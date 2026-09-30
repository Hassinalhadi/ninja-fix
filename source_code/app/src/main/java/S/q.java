package S;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.stateful.ExtendableSavedState;

/* loaded from: classes3.dex */
public final class q implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int alpha;

    public /* synthetic */ q(int i4) {
        this.alpha = i4;
    }

    public static SnapshotStateList alpha(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = q.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new SnapshotStateList();
        }
        L.g india = L.j.purple.india();
        for (int i4 = 0; i4 < readInt; i4++) {
            india.add(parcel.readValue(classLoader));
        }
        return new SnapshotStateList(india.delta());
    }

    public static SnapshotStateSet bravo(Parcel parcel, ClassLoader classLoader) {
        SnapshotStateSet snapshotStateSet = new SnapshotStateSet();
        if (classLoader == null) {
            classLoader = SnapshotStateSet.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            snapshotStateSet.add(parcel.readValue(classLoader));
        }
        return snapshotStateSet;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.alpha) {
            case 0:
                return alpha(parcel, classLoader);
            case 1:
                return bravo(parcel, classLoader);
            case 2:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbsSavedState.purple;
                }
                throw new IllegalStateException("superState must be null");
            case 3:
                return new ParcelableSparseArray(parcel, classLoader);
            default:
                return new ExtendableSavedState(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.alpha) {
            case 0:
                return new SnapshotStateList[i4];
            case 1:
                return new SnapshotStateSet[i4];
            case 2:
                return new AbsSavedState[i4];
            case 3:
                return new ParcelableSparseArray[i4];
            default:
                return new ExtendableSavedState[i4];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.alpha) {
            case 0:
                return alpha(parcel, null);
            case 1:
                return bravo(parcel, null);
            case 2:
                if (parcel.readParcelable(null) == null) {
                    return AbsSavedState.purple;
                }
                throw new IllegalStateException("superState must be null");
            case 3:
                return new ParcelableSparseArray(parcel, null);
            default:
                return new ExtendableSavedState(parcel, null);
        }
    }
}
