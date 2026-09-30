package p7;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public final class p implements r, IInterface {
    public final IBinder golf;

    public p(IBinder iBinder) {
        this.golf = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.golf;
    }
}
