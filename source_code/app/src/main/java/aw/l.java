package aw;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class l {
    public final OutputConfiguration alpha;
    public String bravo;
    public long charlie = 1;

    public l(OutputConfiguration outputConfiguration) {
        this.alpha = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!Objects.equals(this.alpha, lVar.alpha) || this.charlie != lVar.charlie || !Objects.equals(this.bravo, lVar.bravo)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.alpha.hashCode() ^ 31;
        int i4 = (hashCode2 << 5) - hashCode2;
        String str = this.bravo;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode ^ i4;
        int i10 = (i5 << 5) - i5;
        long j5 = this.charlie;
        return ((int) (j5 ^ (j5 >>> 32))) ^ i10;
    }
}
