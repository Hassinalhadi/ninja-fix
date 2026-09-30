package D0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t implements b {
    public final int alpha;
    public final int bravo;
    public final long charlie;
    public final O0.q delta;
    public final v echo;
    public final O0.i foxtrot;
    public final int golf;
    public final int hotel;
    public final O0.s india;

    public t(int i4, int i5, long j5, O0.q qVar, v vVar, O0.i iVar, int i10, int i11, O0.s sVar) {
        this.alpha = i4;
        this.bravo = i5;
        this.charlie = j5;
        this.delta = qVar;
        this.echo = vVar;
        this.foxtrot = iVar;
        this.golf = i10;
        this.hotel = i11;
        this.india = sVar;
        if (Q0.p.alpha(j5, Q0.p.charlie) || Q0.p.charlie(j5) >= 0.0f) {
            return;
        }
        J0.a.bravo("lineHeight can't be negative (" + Q0.p.charlie(j5) + ')');
    }

    public final t alpha(t tVar) {
        if (tVar == null) {
            return this;
        }
        return u.alpha(this, tVar.alpha, tVar.bravo, tVar.charlie, tVar.delta, tVar.echo, tVar.foxtrot, tVar.golf, tVar.hotel, tVar.india);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (this.alpha == tVar.alpha && this.bravo == tVar.bravo && Q0.p.alpha(this.charlie, tVar.charlie) && Intrinsics.areEqual(this.delta, tVar.delta) && Intrinsics.areEqual(this.echo, tVar.echo) && Intrinsics.areEqual(this.foxtrot, tVar.foxtrot) && this.golf == tVar.golf && this.hotel == tVar.hotel && Intrinsics.areEqual(this.india, tVar.india)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int i10;
        int delta = (Q0.p.delta(this.charlie) + (((this.alpha * 31) + this.bravo) * 31)) * 31;
        int i11 = 0;
        O0.q qVar = this.delta;
        if (qVar != null) {
            i4 = qVar.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (delta + i4) * 31;
        v vVar = this.echo;
        if (vVar != null) {
            i5 = vVar.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        O0.i iVar = this.foxtrot;
        if (iVar != null) {
            i10 = iVar.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (((((i13 + i10) * 31) + this.golf) * 31) + this.hotel) * 31;
        O0.s sVar = this.india;
        if (sVar != null) {
            i11 = sVar.hashCode();
        }
        return i14 + i11;
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) O0.k.alpha(this.alpha)) + ", textDirection=" + ((Object) O0.m.alpha(this.bravo)) + ", lineHeight=" + ((Object) Q0.p.echo(this.charlie)) + ", textIndent=" + this.delta + ", platformStyle=" + this.echo + ", lineHeightStyle=" + this.foxtrot + ", lineBreak=" + ((Object) O0.e.alpha(this.golf)) + ", hyphens=" + ((Object) O0.d.alpha(this.hotel)) + ", textMotion=" + this.india + ')';
    }

    public t(int i4) {
        this(i4, 1, Q0.p.charlie, null, null, null, 0, RecyclerView.UNDEFINED_DURATION, null);
    }
}
