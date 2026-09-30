package b;

import a0.C0348b;
import a0.C0352f;
import a0.C0354h;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0708x {
    public C0352f alpha = null;
    public C0348b bravo = null;
    public c0.b charlie = null;
    public C0354h delta = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0708x) {
                C0708x c0708x = (C0708x) obj;
                if (!Intrinsics.areEqual(this.alpha, c0708x.alpha) || !Intrinsics.areEqual(this.bravo, c0708x.bravo) || !Intrinsics.areEqual(this.charlie, c0708x.charlie) || !Intrinsics.areEqual(this.delta, c0708x.delta)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        C0352f c0352f = this.alpha;
        int i4 = 0;
        if (c0352f == null) {
            hashCode = 0;
        } else {
            hashCode = c0352f.hashCode();
        }
        int i5 = hashCode * 31;
        C0348b c0348b = this.bravo;
        if (c0348b == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c0348b.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        c0.b bVar = this.charlie;
        if (bVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bVar.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        C0354h c0354h = this.delta;
        if (c0354h != null) {
            i4 = c0354h.hashCode();
        }
        return i11 + i4;
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.alpha + ", canvas=" + this.bravo + ", canvasDrawScope=" + this.charlie + ", borderPath=" + this.delta + ')';
    }
}
