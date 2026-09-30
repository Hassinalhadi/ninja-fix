package androidx.customview.view;

import S.q;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public abstract class AbsSavedState implements Parcelable {
    public final Parcelable alpha;
    public static final AbsSavedState purple = new AbsSavedState();
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new q(2);

    /* renamed from: androidx.customview.view.AbsSavedState$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends AbsSavedState {
    }

    public AbsSavedState() {
        this.alpha = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.alpha, i4);
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.alpha = parcelable == purple ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.alpha = readParcelable == null ? purple : readParcelable;
    }
}
