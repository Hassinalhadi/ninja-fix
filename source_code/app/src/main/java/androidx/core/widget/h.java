package androidx.core.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes3.dex */
public final class h implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, androidx.core.widget.NestedScrollView$SavedState, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ?? baseSavedState = new View.BaseSavedState(parcel);
        baseSavedState.alpha = parcel.readInt();
        return baseSavedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new NestedScrollView.SavedState[i4];
    }
}
