package bf;

import androidx.camera.core.impl.C0506d;

/* renamed from: bf.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0761a {
    public final String alpha;
    public final C0506d bravo;

    public C0761a(String str, C0506d c0506d) {
        if (str != null) {
            this.alpha = str;
            if (c0506d != null) {
                this.bravo = c0506d;
                return;
            }
            throw new NullPointerException("Null cameraConfigId");
        }
        throw new NullPointerException("Null cameraIdString");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0761a) {
            C0761a c0761a = (C0761a) obj;
            if (this.alpha.equals(c0761a.alpha) && this.bravo.equals(c0761a.bravo)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode();
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.alpha + ", cameraConfigId=" + this.bravo + "}";
    }
}
