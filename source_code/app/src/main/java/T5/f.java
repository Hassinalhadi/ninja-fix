package T5;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import m6.AbstractBinderC2100a;
import m6.AbstractC2101b;

/* loaded from: classes2.dex */
public abstract class f extends AbstractBinderC2100a implements g {
    public f() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 0);
    }

    @Override // m6.AbstractBinderC2100a
    public final boolean ivory(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            Status status = (Status) AbstractC2101b.alpha(parcel, Status.CREATOR);
            AbstractC2101b.bravo(parcel);
            kilo(status);
            return true;
        }
        return false;
    }
}
