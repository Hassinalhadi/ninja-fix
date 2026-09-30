package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class m0 implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ?? obj = new Object();
        obj.alpha = parcel.readInt();
        obj.purple = parcel.readInt();
        boolean z2 = true;
        if (parcel.readInt() != 1) {
            z2 = false;
        }
        obj.silver = z2;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            obj.red = iArr;
            parcel.readIntArray(iArr);
        }
        return obj;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i4];
    }
}
