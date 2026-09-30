package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
public final class ab {
    public final B alpha;
    public final int bravo;

    public ab(B b2, int i4) {
        this.alpha = b2;
        this.bravo = i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ab) {
            ab abVar = (ab) obj;
            if (this.alpha == abVar.alpha && this.bravo == abVar.bravo) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.alpha) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.bravo;
    }
}
