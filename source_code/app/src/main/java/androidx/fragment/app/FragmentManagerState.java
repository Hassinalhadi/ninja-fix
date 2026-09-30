package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0607b(3);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3112a;
    public ArrayList alpha;
    public ArrayList purple;
    public BackStackRecordState[] red;
    public int silver;
    public String teal;
    public ArrayList white;
    public ArrayList yellow;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStringList(this.alpha);
        parcel.writeStringList(this.purple);
        parcel.writeTypedArray(this.red, i4);
        parcel.writeInt(this.silver);
        parcel.writeString(this.teal);
        parcel.writeStringList(this.white);
        parcel.writeTypedList(this.yellow);
        parcel.writeTypedList(this.f3112a);
    }
}
