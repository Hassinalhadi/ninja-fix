package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C0607b(1);
    public final ArrayList alpha;
    public final ArrayList purple;

    public BackStackState(ArrayList arrayList, ArrayList arrayList2) {
        this.alpha = arrayList;
        this.purple = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStringList(this.alpha);
        parcel.writeTypedList(this.purple);
    }

    public BackStackState(Parcel parcel) {
        this.alpha = parcel.createStringArrayList();
        this.purple = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
