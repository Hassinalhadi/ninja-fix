package D0;

import kotlin.jvm.internal.Intrinsics;
import s6.J4;

/* loaded from: classes3.dex */
public final class q {
    public final a alpha;
    public final int bravo;
    public final int charlie;
    public final int delta;
    public final int echo;
    public final float foxtrot;
    public final float golf;

    public q(a aVar, int i4, int i5, int i10, int i11, float f5, float f10) {
        this.alpha = aVar;
        this.bravo = i4;
        this.charlie = i5;
        this.delta = i10;
        this.echo = i11;
        this.foxtrot = f5;
        this.golf = f10;
    }

    public final Z.c alpha(Z.c cVar) {
        return cVar.hotel((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.foxtrot) & 4294967295L));
    }

    public final long bravo(long j5, boolean z2) {
        if (z2) {
            long j6 = am.bravo;
            if (am.bravo(j5, j6)) {
                return j6;
            }
        }
        int i4 = am.charlie;
        int i5 = (int) (j5 >> 32);
        int i10 = this.bravo;
        return ae.bravo(i5 + i10, ((int) (j5 & 4294967295L)) + i10);
    }

    public final Z.c charlie(Z.c cVar) {
        float f5 = -this.foxtrot;
        return cVar.hotel((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
    }

    public final int delta(int i4) {
        int i5 = this.charlie;
        int i10 = this.bravo;
        return J4.delta(i4, i10, i5) - i10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                if (!Intrinsics.areEqual(this.alpha, qVar.alpha) || this.bravo != qVar.bravo || this.charlie != qVar.charlie || this.delta != qVar.delta || this.echo != qVar.echo || Float.compare(this.foxtrot, qVar.foxtrot) != 0 || Float.compare(this.golf, qVar.golf) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.golf) + ao.ad.sierra(this.foxtrot, ((((((((this.alpha.hashCode() * 31) + this.bravo) * 31) + this.charlie) * 31) + this.delta) * 31) + this.echo) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.alpha);
        sb2.append(", startIndex=");
        sb2.append(this.bravo);
        sb2.append(", endIndex=");
        sb2.append(this.charlie);
        sb2.append(", startLineIndex=");
        sb2.append(this.delta);
        sb2.append(", endLineIndex=");
        sb2.append(this.echo);
        sb2.append(", top=");
        sb2.append(this.foxtrot);
        sb2.append(", bottom=");
        return ao.ad.azure(sb2, this.golf, ')');
    }
}
