package androidx.camera.core.impl;

import android.hardware.camera2.CaptureRequest;

/* renamed from: androidx.camera.core.impl.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0505c {
    public final String alpha;
    public final Class bravo;
    public final CaptureRequest.Key charlie;

    public C0505c(String str, Class cls, CaptureRequest.Key key) {
        if (str != null) {
            this.alpha = str;
            if (cls != null) {
                this.bravo = cls;
                this.charlie = key;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0505c) {
                C0505c c0505c = (C0505c) obj;
                if (this.alpha.equals(c0505c.alpha) && this.bravo.equals(c0505c.bravo)) {
                    CaptureRequest.Key key = c0505c.charlie;
                    CaptureRequest.Key key2 = this.charlie;
                    if (key2 == null) {
                        if (key == null) {
                            return true;
                        }
                        return false;
                    }
                    if (key2.equals(key)) {
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
        int hashCode2 = (((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003;
        CaptureRequest.Key key = this.charlie;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        return "Option{id=" + this.alpha + ", valueClass=" + this.bravo + ", token=" + this.charlie + "}";
    }
}
