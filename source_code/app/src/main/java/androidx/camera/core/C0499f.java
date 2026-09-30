package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC0525x;

/* renamed from: androidx.camera.core.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0499f {
    public final Size alpha;
    public final Rect bravo;
    public final InterfaceC0525x charlie;
    public final int delta;
    public final boolean echo;

    public C0499f(Size size, Rect rect, InterfaceC0525x interfaceC0525x, int i4, boolean z2) {
        if (size != null) {
            this.alpha = size;
            if (rect != null) {
                this.bravo = rect;
                this.charlie = interfaceC0525x;
                this.delta = i4;
                this.echo = z2;
                return;
            }
            throw new NullPointerException("Null inputCropRect");
        }
        throw new NullPointerException("Null inputSize");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0499f) {
            C0499f c0499f = (C0499f) obj;
            if (this.alpha.equals(c0499f.alpha) && this.bravo.equals(c0499f.bravo)) {
                InterfaceC0525x interfaceC0525x = c0499f.charlie;
                InterfaceC0525x interfaceC0525x2 = this.charlie;
                if (interfaceC0525x2 != null ? interfaceC0525x2.equals(interfaceC0525x) : interfaceC0525x == null) {
                    if (this.delta == c0499f.delta && this.echo == c0499f.echo) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i4;
        int hashCode2 = (((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003;
        InterfaceC0525x interfaceC0525x = this.charlie;
        if (interfaceC0525x == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC0525x.hashCode();
        }
        int i5 = (((hashCode2 ^ hashCode) * 1000003) ^ this.delta) * 1000003;
        if (this.echo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return i5 ^ i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CameraInputInfo{inputSize=");
        sb2.append(this.alpha);
        sb2.append(", inputCropRect=");
        sb2.append(this.bravo);
        sb2.append(", cameraInternal=");
        sb2.append(this.charlie);
        sb2.append(", rotationDegrees=");
        sb2.append(this.delta);
        sb2.append(", mirroring=");
        return Q0.c.romeo(sb2, this.echo, "}");
    }
}
