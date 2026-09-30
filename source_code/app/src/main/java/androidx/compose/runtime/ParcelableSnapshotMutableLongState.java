package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;", "Landroidx/compose/runtime/r0;", "Landroid/os/Parcelable;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public final class ParcelableSnapshotMutableLongState extends r0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableLongState> CREATOR = new A(3);

    public ParcelableSnapshotMutableLongState(long j5) {
        S.g kilo = S.n.kilo();
        q0 q0Var = new q0(kilo.golf(), j5);
        if (!(kilo instanceof S.b)) {
            q0Var.bravo = new q0(1, j5);
        }
        this.purple = q0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(juliet());
    }
}
