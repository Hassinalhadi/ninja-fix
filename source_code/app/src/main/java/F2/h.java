package F2;

import android.net.ConnectivityManager;
import kotlin.jvm.internal.Intrinsics;
import yf.AbstractC3428A;
import yf.C3433c;

/* loaded from: classes3.dex */
public final class h implements G2.e {
    public final ConnectivityManager alpha;

    public h(ConnectivityManager connectivityManager) {
        this.alpha = connectivityManager;
    }

    @Override // G2.e
    public final boolean alpha(J2.p pVar) {
        if (!charlie(pVar)) {
            return false;
        }
        throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
    }

    @Override // G2.e
    public final C3433c bravo(A2.d constraints) {
        Intrinsics.echo(constraints, "constraints");
        return AbstractC3428A.india(new g(constraints, this, null));
    }

    @Override // G2.e
    public final boolean charlie(J2.p workSpec) {
        Intrinsics.echo(workSpec, "workSpec");
        if (workSpec.juliet.bravo.alpha != null) {
            return true;
        }
        return false;
    }
}
