package l8;

import av.q;
import com.google.maps.android.BuildConfig;

/* renamed from: l8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2060a {
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final b delta;
    public final int echo;

    public C2060a(String str, String str2, String str3, b bVar, int i4) {
        this.alpha = str;
        this.bravo = str2;
        this.charlie = str3;
        this.delta = bVar;
        this.echo = i4;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C2060a) {
                C2060a c2060a = (C2060a) obj;
                String str = this.alpha;
                if (str == null) {
                    if (c2060a.alpha != null) {
                        return false;
                    }
                } else if (!str.equals(c2060a.alpha)) {
                    return false;
                }
                String str2 = this.bravo;
                if (str2 == null) {
                    if (c2060a.bravo != null) {
                        return false;
                    }
                } else if (!str2.equals(c2060a.bravo)) {
                    return false;
                }
                String str3 = this.charlie;
                if (str3 == null) {
                    if (c2060a.charlie != null) {
                        return false;
                    }
                } else if (!str3.equals(c2060a.charlie)) {
                    return false;
                }
                b bVar = this.delta;
                if (bVar == null) {
                    if (c2060a.delta != null) {
                        return false;
                    }
                } else if (!bVar.equals(c2060a.delta)) {
                    return false;
                }
                int i4 = this.echo;
                if (i4 == 0) {
                    if (c2060a.echo == 0) {
                        return true;
                    }
                    return false;
                }
                if (q.bravo(i4, c2060a.echo)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i4 = 0;
        String str = this.alpha;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.bravo;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 ^ hashCode2) * 1000003;
        String str3 = this.charlie;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 ^ hashCode3) * 1000003;
        b bVar = this.delta;
        if (bVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bVar.hashCode();
        }
        int i12 = (i11 ^ hashCode4) * 1000003;
        int i13 = this.echo;
        if (i13 != 0) {
            i4 = q.mike(i13);
        }
        return i4 ^ i12;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.alpha);
        sb2.append(", fid=");
        sb2.append(this.bravo);
        sb2.append(", refreshToken=");
        sb2.append(this.charlie);
        sb2.append(", authToken=");
        sb2.append(this.delta);
        sb2.append(", responseCode=");
        int i4 = this.echo;
        if (i4 != 1) {
            if (i4 != 2) {
                str = BuildConfig.TRAVIS;
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
