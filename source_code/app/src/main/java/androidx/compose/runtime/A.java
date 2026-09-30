package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class A implements Parcelable.Creator {
    public final /* synthetic */ int alpha;

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.runtime.l0, S.ad, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.alpha) {
            case 0:
                double readDouble = parcel.readDouble();
                ?? adVar = new S.ad();
                S.g kilo = S.n.kilo();
                k0 k0Var = new k0(kilo.golf(), readDouble);
                if (!(kilo instanceof S.b)) {
                    k0Var.bravo = new k0(1, readDouble);
                }
                adVar.purple = k0Var;
                return adVar;
            case 1:
                return new ParcelableSnapshotMutableFloatState(parcel.readFloat());
            case 2:
                return new ParcelableSnapshotMutableIntState(parcel.readInt());
            default:
                return new ParcelableSnapshotMutableLongState(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.alpha) {
            case 0:
                return new ParcelableSnapshotMutableDoubleState[i4];
            case 1:
                return new ParcelableSnapshotMutableFloatState[i4];
            case 2:
                return new ParcelableSnapshotMutableIntState[i4];
            default:
                return new ParcelableSnapshotMutableLongState[i4];
        }
    }
}
