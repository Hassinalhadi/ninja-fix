package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0467m implements Parcelable.Creator {
    public final /* synthetic */ int alpha;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, androidx.appcompat.widget.ActionMenuPresenter$SavedState] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View$BaseSavedState, androidx.appcompat.widget.AppCompatSpinner$SavedState, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                ?? obj = new Object();
                obj.alpha = parcel.readInt();
                return obj;
            default:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                if (parcel.readByte() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                baseSavedState.alpha = z2;
                return baseSavedState;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.alpha) {
            case 0:
                return new ActionMenuPresenter$SavedState[i4];
            default:
                return new AppCompatSpinner$SavedState[i4];
        }
    }
}
