package aw;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class n {
    public final OutputConfiguration alpha;
    public long bravo = 1;

    public n(OutputConfiguration outputConfiguration) {
        this.alpha = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!Objects.equals(this.alpha, nVar.alpha) || this.bravo != nVar.bravo) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.alpha.hashCode() ^ 31;
        int i4 = (hashCode << 5) - hashCode;
        long j5 = this.bravo;
        return ((int) (j5 ^ (j5 >>> 32))) ^ i4;
    }
}
