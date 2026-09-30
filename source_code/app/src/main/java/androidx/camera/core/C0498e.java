package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.V;

/* renamed from: androidx.camera.core.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0498e implements ap {
    public final V alpha;
    public final long bravo;
    public final int charlie;
    public final Matrix delta;

    public C0498e(V v4, long j5, int i4, Matrix matrix) {
        if (v4 != null) {
            this.alpha = v4;
            this.bravo = j5;
            this.charlie = i4;
            this.delta = matrix;
            return;
        }
        throw new NullPointerException("Null tagBundle");
    }

    @Override // androidx.camera.core.ap
    public final V alpha() {
        return this.alpha;
    }

    @Override // androidx.camera.core.ap
    public final int bravo() {
        return this.charlie;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0498e) {
            C0498e c0498e = (C0498e) obj;
            if (this.alpha.equals(c0498e.alpha) && this.bravo == c0498e.bravo && this.charlie == c0498e.charlie && this.delta.equals(c0498e.delta)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.ap
    public final long getTimestamp() {
        return this.bravo;
    }

    public final int hashCode() {
        int hashCode = (this.alpha.hashCode() ^ 1000003) * 1000003;
        long j5 = this.bravo;
        return ((((hashCode ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ this.charlie) * 1000003) ^ this.delta.hashCode();
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.alpha + ", timestamp=" + this.bravo + ", rotationDegrees=" + this.charlie + ", sensorToBufferTransformMatrix=" + this.delta + "}";
    }
}
