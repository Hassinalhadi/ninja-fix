package aw;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class j {
    public final OutputConfiguration alpha;
    public String bravo;
    public boolean charlie;
    public long delta = 1;

    public j(OutputConfiguration outputConfiguration) {
        this.alpha = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (Objects.equals(this.alpha, jVar.alpha) && this.charlie == jVar.charlie && this.delta == jVar.delta && Objects.equals(this.bravo, jVar.bravo)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.alpha.hashCode() ^ 31;
        int i4 = (this.charlie ? 1 : 0) ^ ((hashCode2 << 5) - hashCode2);
        int i5 = (i4 << 5) - i4;
        String str = this.bravo;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode ^ i5;
        int i11 = (i10 << 5) - i10;
        long j5 = this.delta;
        return ((int) (j5 ^ (j5 >>> 32))) ^ i11;
    }
}
