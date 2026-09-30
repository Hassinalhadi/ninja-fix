package V5;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
public final class ac extends r {
    public final /* synthetic */ e golf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(e eVar, int i4, Bundle bundle) {
        super(eVar, i4, bundle);
        this.golf = eVar;
    }

    @Override // V5.r
    public final void alpha(ConnectionResult connectionResult) {
        e eVar = this.golf;
        eVar.getClass();
        eVar.juliet.alpha(connectionResult);
        System.currentTimeMillis();
    }

    @Override // V5.r
    public final boolean bravo() {
        this.golf.juliet.alpha(ConnectionResult.teal);
        return true;
    }
}
