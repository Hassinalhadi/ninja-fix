package q0;

import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC2264a;
import s6.AbstractC2609a7;

/* loaded from: classes3.dex */
public final class an implements z {
    public final s0.au alpha;

    public an(s0.au auVar) {
        this.alpha = auVar;
    }

    public final long alpha() {
        s0.au auVar = this.alpha;
        s0.au india = AbstractC2375K.india(auVar);
        return Z.b.foxtrot(bravo(india.f13318l, 0L), auVar.f13315i.J(india.f13315i, 0L));
    }

    @Override // q0.z
    public final z amber() {
        s0.au y10;
        if (!india()) {
            AbstractC2264a.bravo("LayoutCoordinate operations are only valid when isAttached is true");
        }
        s0.L l10 = ((s0.L) this.alpha.f13315i.f13251i.f13305x.foxtrot).f13253k;
        if (l10 != null && (y10 = l10.y()) != null) {
            return y10.f13318l;
        }
        return null;
    }

    @Override // q0.z
    public final void blue(z zVar, float[] fArr) {
        this.alpha.f13315i.blue(zVar, fArr);
    }

    public final long bravo(z zVar, long j5) {
        boolean z2 = zVar instanceof an;
        s0.au auVar = this.alpha;
        if (z2) {
            s0.au auVar2 = ((an) zVar).alpha;
            auVar2.f13315i.K();
            s0.au y10 = auVar.f13315i.w(auVar2.f13315i).y();
            if (y10 != null) {
                long bravo = Q0.k.bravo(Q0.k.charlie(auVar2.s(y10, false), AbstractC2609a7.charlie(j5)), auVar.s(y10, false));
                return (Float.floatToRawIntBits((int) (bravo >> 32)) << 32) | (Float.floatToRawIntBits((int) (bravo & 4294967295L)) & 4294967295L);
            }
            s0.au india = AbstractC2375K.india(auVar2);
            long charlie = Q0.k.charlie(Q0.k.charlie(auVar2.s(india, false), india.f13316j), AbstractC2609a7.charlie(j5));
            s0.au india2 = AbstractC2375K.india(auVar);
            long bravo2 = Q0.k.bravo(charlie, Q0.k.charlie(auVar.s(india2, false), india2.f13316j));
            long floatToRawIntBits = Float.floatToRawIntBits((int) (bravo2 >> 32));
            long floatToRawIntBits2 = Float.floatToRawIntBits((int) (bravo2 & 4294967295L)) & 4294967295L;
            s0.L l10 = india2.f13315i.f13253k;
            Intrinsics.checkNotNull(l10);
            s0.L l11 = india.f13315i.f13253k;
            Intrinsics.checkNotNull(l11);
            return l10.J(l11, floatToRawIntBits2 | (floatToRawIntBits << 32));
        }
        s0.au india3 = AbstractC2375K.india(auVar);
        long bravo3 = bravo(india3.f13318l, j5);
        long j6 = india3.f13316j;
        long foxtrot = Z.b.foxtrot(bravo3, (4294967295L & Float.floatToRawIntBits((int) (j6 & 4294967295L))) | (Float.floatToRawIntBits((int) (j6 >> 32)) << 32));
        s0.L l12 = india3.f13315i;
        if (!l12.india()) {
            AbstractC2264a.bravo("LayoutCoordinate operations are only valid when isAttached is true");
        }
        l12.K();
        s0.L l13 = l12.f13253k;
        if (l13 != null) {
            l12 = l13;
        }
        return Z.b.golf(foxtrot, l12.J(zVar, 0L));
    }

    @Override // q0.z
    public final long cyan(long j5) {
        return Z.b.golf(this.alpha.f13315i.cyan(j5), alpha());
    }

    @Override // q0.z
    public final long foxtrot(long j5) {
        return this.alpha.f13315i.foxtrot(Z.b.golf(j5, alpha()));
    }

    @Override // q0.z
    public final long gray(long j5) {
        return this.alpha.f13315i.gray(Z.b.golf(j5, alpha()));
    }

    @Override // q0.z
    public final boolean india() {
        return this.alpha.f13315i.india();
    }

    @Override // q0.z
    public final void juliet(float[] fArr) {
        this.alpha.f13315i.juliet(fArr);
    }

    @Override // q0.z
    public final long kilo() {
        s0.au auVar = this.alpha;
        return (auVar.alpha << 32) | (auVar.purple & 4294967295L);
    }

    @Override // q0.z
    public final long oscar(z zVar, long j5) {
        return bravo(zVar, j5);
    }

    @Override // q0.z
    public final Z.c sierra(z zVar, boolean z2) {
        return this.alpha.f13315i.sierra(zVar, z2);
    }

    @Override // q0.z
    public final long tango(long j5) {
        return this.alpha.f13315i.tango(Z.b.golf(0L, alpha()));
    }

    @Override // q0.z
    public final long xray(long j5) {
        return Z.b.golf(this.alpha.f13315i.xray(j5), alpha());
    }
}
