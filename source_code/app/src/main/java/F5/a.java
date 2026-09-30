package F5;

import av.q;
import com.google.maps.android.BuildConfig;

/* loaded from: classes3.dex */
public final class a {
    public final int alpha;
    public final long bravo;

    public a(int i4, long j5) {
        if (i4 != 0) {
            this.alpha = i4;
            this.bravo = j5;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (q.bravo(this.alpha, aVar.alpha) && this.bravo == aVar.bravo) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int mike = (q.mike(this.alpha) ^ 1000003) * 1000003;
        long j5 = this.bravo;
        return mike ^ ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i4 = this.alpha;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        str = BuildConfig.TRAVIS;
                    } else {
                        str = "INVALID_PAYLOAD";
                    }
                } else {
                    str = "FATAL_ERROR";
                }
            } else {
                str = "TRANSIENT_ERROR";
            }
        } else {
            str = "OK";
        }
        sb2.append(str);
        sb2.append(", nextRequestWaitMillis=");
        return Q0.c.mike(this.bravo, "}", sb2);
    }
}
