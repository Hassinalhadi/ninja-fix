package Oe;

import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
public final class g {
    public final v alpha;
    public final int bravo;

    public g(int i4, v vVar) {
        this.alpha = vVar;
        this.bravo = i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.alpha == gVar.alpha && this.bravo == gVar.bravo) {
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
