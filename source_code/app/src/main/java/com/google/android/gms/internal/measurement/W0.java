package com.google.android.gms.internal.measurement;

import android.content.Context;
import r7.InterfaceC2502d;

/* loaded from: classes2.dex */
public final class W0 {
    public final Context alpha;
    public final InterfaceC2502d bravo;

    public W0(Context context, InterfaceC2502d interfaceC2502d) {
        this.alpha = context;
        this.bravo = interfaceC2502d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof W0) {
            W0 w02 = (W0) obj;
            if (this.alpha.equals(w02.alpha)) {
                InterfaceC2502d interfaceC2502d = w02.bravo;
                InterfaceC2502d interfaceC2502d2 = this.bravo;
                if (interfaceC2502d2 != null ? interfaceC2502d2.equals(interfaceC2502d) : interfaceC2502d == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.alpha.hashCode() ^ 1000003;
        InterfaceC2502d interfaceC2502d = this.bravo;
        if (interfaceC2502d == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC2502d.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        return av.q.golf("FlagsContext{context=", this.alpha.toString(), ", hermeticFileOverrides=", String.valueOf(this.bravo), "}");
    }
}
