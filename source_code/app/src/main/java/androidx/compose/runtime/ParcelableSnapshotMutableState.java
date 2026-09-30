package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Landroidx/compose/runtime/t0;", "Landroid/os/Parcelable;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public final class ParcelableSnapshotMutableState<T> extends t0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new Object();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int i5;
        parcel.writeValue(getValue());
        as asVar = as.red;
        u0 u0Var = this.purple;
        if (Intrinsics.areEqual(u0Var, asVar)) {
            i5 = 0;
        } else if (Intrinsics.areEqual(u0Var, as.white)) {
            i5 = 1;
        } else if (Intrinsics.areEqual(u0Var, as.silver)) {
            i5 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i5);
    }
}
