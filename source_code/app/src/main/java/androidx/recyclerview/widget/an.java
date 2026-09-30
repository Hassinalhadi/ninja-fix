package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes3.dex */
public final class an implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.LinearLayoutManager$SavedState, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ?? obj = new Object();
        obj.alpha = parcel.readInt();
        obj.purple = parcel.readInt();
        boolean z2 = true;
        if (parcel.readInt() != 1) {
            z2 = false;
        }
        obj.red = z2;
        return obj;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new LinearLayoutManager.SavedState[i4];
    }
}
