package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
class AppCompatDelegateImpl$PanelFeatureState$SavedState implements Parcelable {
    public static final Parcelable.Creator<AppCompatDelegateImpl$PanelFeatureState$SavedState> CREATOR = new Object();
    public int alpha;
    public boolean purple;
    public Bundle red;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState] */
    public static AppCompatDelegateImpl$PanelFeatureState$SavedState charlie(Parcel parcel, ClassLoader classLoader) {
        ?? obj = new Object();
        obj.alpha = parcel.readInt();
        boolean z2 = true;
        if (parcel.readInt() != 1) {
            z2 = false;
        }
        obj.purple = z2;
        if (z2) {
            obj.red = parcel.readBundle(classLoader);
        }
        return obj;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.alpha);
        parcel.writeInt(this.purple ? 1 : 0);
        if (this.purple) {
            parcel.writeBundle(this.red);
        }
    }
}
