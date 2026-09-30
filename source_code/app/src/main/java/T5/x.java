package T5;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class x extends aj {
    public G6.h white;

    @Override // T5.aj
    public final void delta() {
        this.white.charlie(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    @Override // T5.aj
    public final void hotel(ConnectionResult connectionResult, int i4) {
        String str = connectionResult.silver;
        if (str == null) {
            str = "Error connecting to Google Play services";
        }
        this.white.alpha(new ApiException(new Status(connectionResult.purple, str, connectionResult.red, connectionResult)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, T5.h] */
    @Override // T5.aj
    public final void india() {
        Activity bravo = this.alpha.bravo();
        if (bravo == null) {
            this.white.charlie(new ApiException(new Status(8, null, null, null)));
            return;
        }
        int isGooglePlayServicesAvailable = this.teal.isGooglePlayServicesAvailable(bravo);
        if (isGooglePlayServicesAvailable == 0) {
            this.white.delta(null);
        } else if (!this.white.alpha.india()) {
            juliet(new ConnectionResult(isGooglePlayServicesAvailable, null), 0);
        }
    }
}
