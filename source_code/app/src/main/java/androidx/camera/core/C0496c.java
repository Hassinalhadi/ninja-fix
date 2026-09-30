package androidx.camera.core;

import com.google.maps.android.BuildConfig;

/* renamed from: androidx.camera.core.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0496c {
    public final int alpha;
    public final C0497d bravo;

    public C0496c(int i4, C0497d c0497d) {
        if (i4 != 0) {
            this.alpha = i4;
            this.bravo = c0497d;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0496c) {
                C0496c c0496c = (C0496c) obj;
                if (av.q.bravo(this.alpha, c0496c.alpha)) {
                    C0497d c0497d = c0496c.bravo;
                    C0497d c0497d2 = this.bravo;
                    if (c0497d2 == null) {
                        if (c0497d == null) {
                            return true;
                        }
                        return false;
                    }
                    if (c0497d2.equals(c0497d)) {
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
        int mike = (av.q.mike(this.alpha) ^ 1000003) * 1000003;
        C0497d c0497d = this.bravo;
        if (c0497d == null) {
            hashCode = 0;
        } else {
            hashCode = c0497d.hashCode();
        }
        return mike ^ hashCode;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("CameraState{type=");
        int i4 = this.alpha;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 != 5) {
                            str = BuildConfig.TRAVIS;
                        } else {
                            str = "CLOSED";
                        }
                    } else {
                        str = "CLOSING";
                    }
                } else {
                    str = "OPEN";
                }
            } else {
                str = "OPENING";
            }
        } else {
            str = "PENDING_OPEN";
        }
        sb2.append(str);
        sb2.append(", error=");
        sb2.append(this.bravo);
        sb2.append("}");
        return sb2.toString();
    }
}
