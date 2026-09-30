package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes3.dex */
public final class o0 implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z2;
        boolean z10;
        ?? obj = new Object();
        obj.alpha = parcel.readInt();
        obj.purple = parcel.readInt();
        int readInt = parcel.readInt();
        obj.red = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            obj.silver = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        obj.teal = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            obj.white = iArr2;
            parcel.readIntArray(iArr2);
        }
        boolean z11 = false;
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        obj.f3130a = z2;
        if (parcel.readInt() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        obj.f3131b = z10;
        if (parcel.readInt() == 1) {
            z11 = true;
        }
        obj.f3132c = z11;
        obj.yellow = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        return obj;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new StaggeredGridLayoutManager.SavedState[i4];
    }
}
