package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import g6.C1754b;

/* loaded from: classes2.dex */
public final class ay {
    public final /* synthetic */ int alpha = 1;
    public final G bravo;

    public ay(G g2) {
        this.bravo = g2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean alpha() {
        switch (this.alpha) {
            case 0:
                G g2 = this.bravo;
                boolean z2 = false;
                try {
                    H0.a alpha = C1754b.alpha(g2.alpha);
                    if (alpha == null) {
                        ar arVar = g2.f7507b;
                        G.foxtrot(arVar);
                        arVar.f7636g.alpha("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        g2 = g2;
                    } else {
                        int i4 = alpha.charlie(128, "com.android.vending").versionCode;
                        g2 = i4;
                        if (i4 >= 80837300) {
                            z2 = true;
                            g2 = i4;
                        }
                    }
                } catch (Exception e) {
                    ar arVar2 = g2.f7507b;
                    G.foxtrot(arVar2);
                    arVar2.f7636g.bravo(e, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z2;
            default:
                G g5 = this.bravo;
                if (TextUtils.isEmpty(g5.purple)) {
                    ar arVar3 = g5.f7507b;
                    G.foxtrot(arVar3);
                    if (Log.isLoggable(arVar3.h0(), 3)) {
                        return true;
                    }
                }
                return false;
        }
    }

    public ay(Z0 z02) {
        this.bravo = z02.e;
    }
}
