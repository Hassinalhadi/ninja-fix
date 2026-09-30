package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: androidx.camera.core.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0502i {
    public final Rect alpha;
    public final int bravo;
    public final int charlie;
    public final boolean delta;
    public final Matrix echo;
    public final boolean foxtrot;

    public C0502i(Rect rect, int i4, int i5, boolean z2, Matrix matrix, boolean z10) {
        if (rect != null) {
            this.alpha = rect;
            this.bravo = i4;
            this.charlie = i5;
            this.delta = z2;
            if (matrix != null) {
                this.echo = matrix;
                this.foxtrot = z10;
                return;
            }
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        throw new NullPointerException("Null getCropRect");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0502i) {
            C0502i c0502i = (C0502i) obj;
            if (this.alpha.equals(c0502i.alpha) && this.bravo == c0502i.bravo && this.charlie == c0502i.charlie && this.delta == c0502i.delta && this.echo.equals(c0502i.echo) && this.foxtrot == c0502i.foxtrot) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = (((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo) * 1000003) ^ this.charlie) * 1000003;
        int i5 = 1237;
        if (this.delta) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int hashCode2 = (((hashCode ^ i4) * 1000003) ^ this.echo.hashCode()) * 1000003;
        if (this.foxtrot) {
            i5 = 1231;
        }
        return hashCode2 ^ i5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransformationInfo{getCropRect=");
        sb2.append(this.alpha);
        sb2.append(", getRotationDegrees=");
        sb2.append(this.bravo);
        sb2.append(", getTargetRotation=");
        sb2.append(this.charlie);
        sb2.append(", hasCameraTransform=");
        sb2.append(this.delta);
        sb2.append(", getSensorToBufferTransform=");
        sb2.append(this.echo);
        sb2.append(", isMirroring=");
        return Q0.c.romeo(sb2, this.foxtrot, "}");
    }
}
