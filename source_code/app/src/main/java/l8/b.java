package l8;

import av.q;
import com.google.maps.android.BuildConfig;

/* loaded from: classes2.dex */
public final class b {
    public final String alpha;
    public final long bravo;
    public final int charlie;

    public b(int i4, long j5, String str) {
        this.alpha = str;
        this.bravo = j5;
        this.charlie = i4;
    }

    public static B0.a alpha() {
        B0.a aVar = new B0.a((char) 0, 8);
        aVar.delta = 0L;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                String str = this.alpha;
                if (str == null) {
                    if (bVar.alpha != null) {
                        return false;
                    }
                } else if (!str.equals(bVar.alpha)) {
                    return false;
                }
                if (this.bravo == bVar.bravo) {
                    int i4 = bVar.charlie;
                    int i5 = this.charlie;
                    if (i5 == 0) {
                        if (i4 == 0) {
                            return true;
                        }
                        return false;
                    }
                    if (q.bravo(i5, i4)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        String str = this.alpha;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j5 = this.bravo;
        int i5 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        int i10 = this.charlie;
        if (i10 != 0) {
            i4 = q.mike(i10);
        }
        return i4 ^ i5;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.alpha);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.bravo);
        sb2.append(", responseCode=");
        int i4 = this.charlie;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    str = BuildConfig.TRAVIS;
                } else {
                    str = "AUTH_ERROR";
                }
            } else {
                str = "BAD_CONFIG";
            }
        } else {
            str = "OK";
        }
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
