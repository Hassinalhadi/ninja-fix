package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;

/* renamed from: androidx.camera.core.impl.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0509g {
    public static final Range foxtrot = new Range(0, 0);
    public final Size alpha;
    public final androidx.camera.core.t bravo;
    public final Range charlie;
    public final au.a delta;
    public final boolean echo;

    public C0509g(Size size, androidx.camera.core.t tVar, Range range, au.a aVar, boolean z2) {
        this.alpha = size;
        this.bravo = tVar;
        this.charlie = range;
        this.delta = aVar;
        this.echo = z2;
    }

    public final B9.ab alpha() {
        B9.ab abVar = new B9.ab(22);
        abVar.purple = this.alpha;
        abVar.white = this.bravo;
        abVar.red = this.charlie;
        abVar.silver = this.delta;
        abVar.teal = Boolean.valueOf(this.echo);
        return abVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0509g) {
                C0509g c0509g = (C0509g) obj;
                if (this.alpha.equals(c0509g.alpha) && this.bravo.equals(c0509g.bravo) && this.charlie.equals(c0509g.charlie)) {
                    au.a aVar = c0509g.delta;
                    au.a aVar2 = this.delta;
                    if (aVar2 == null) {
                        if (aVar != null) {
                            return false;
                        }
                    } else if (!aVar2.equals(aVar)) {
                        return false;
                    }
                    if (this.echo == c0509g.echo) {
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
        int i4;
        int hashCode2 = (((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003) ^ this.charlie.hashCode()) * 1000003;
        au.a aVar = this.delta;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        int i5 = (hashCode2 ^ hashCode) * 1000003;
        if (this.echo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return i5 ^ i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StreamSpec{resolution=");
        sb2.append(this.alpha);
        sb2.append(", dynamicRange=");
        sb2.append(this.bravo);
        sb2.append(", expectedFrameRateRange=");
        sb2.append(this.charlie);
        sb2.append(", implementationOptions=");
        sb2.append(this.delta);
        sb2.append(", zslDisabled=");
        return Q0.c.romeo(sb2, this.echo, "}");
    }
}
