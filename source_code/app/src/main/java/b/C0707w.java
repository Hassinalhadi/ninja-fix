package b;

import a0.AbstractC0362p;
import a0.C0354h;
import a0.C0366t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC2557q;
import s0.InterfaceC2558s;

/* renamed from: b.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0707w extends T.r implements InterfaceC2558s, s0.P, s0.e0 {

    /* renamed from: a, reason: collision with root package name */
    public a0.as f3320a;
    public long alpha;

    /* renamed from: b, reason: collision with root package name */
    public a0.ao f3321b;
    public AbstractC0362p purple;
    public float red;
    public a0.as silver;
    public long teal;
    public Q0.n white;
    public a0.ao yellow;

    @Override // s0.InterfaceC2558s
    public final /* synthetic */ void blue() {
    }

    @Override // s0.e0
    public final boolean charlie() {
        return false;
    }

    @Override // T.r
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // s0.e0
    public final void india(A0.ad adVar) {
    }

    @Override // s0.InterfaceC2558s
    public final void jade(s0.an anVar) {
        a0.ao aoVar;
        AbstractC0362p abstractC0362p;
        C0354h c0354h;
        if (this.silver == a0.ao.alpha) {
            if (!C0366t.charlie(this.alpha, C0366t.kilo)) {
                ao.ad.november(anVar, this.alpha, 0L, 0L, 0.0f, null, 126);
            }
            AbstractC0362p abstractC0362p2 = this.purple;
            if (abstractC0362p2 != null) {
                ao.ad.mike(anVar, abstractC0362p2, 0L, 0L, this.red, null, 118);
            }
        } else {
            c0.b bVar = anVar.alpha;
            if (Z.e.alpha(bVar.purple.oscar(), this.teal) && anVar.getLayoutDirection() == this.white && Intrinsics.areEqual(this.f3320a, this.silver)) {
                aoVar = this.yellow;
                Intrinsics.checkNotNull(aoVar);
            } else {
                AbstractC2557q.november(this, new Yb.F(8, this, anVar));
                aoVar = this.f3321b;
                this.f3321b = null;
            }
            this.yellow = aoVar;
            this.teal = bVar.purple.oscar();
            this.white = anVar.getLayoutDirection();
            this.f3320a = this.silver;
            Intrinsics.checkNotNull(aoVar);
            if (!C0366t.charlie(this.alpha, C0366t.kilo)) {
                a0.ao.mike(anVar, aoVar, this.alpha);
            }
            AbstractC0362p abstractC0362p3 = this.purple;
            if (abstractC0362p3 != null) {
                float f5 = this.red;
                c0.g gVar = c0.g.alpha;
                if (aoVar instanceof a0.ai) {
                    Z.c cVar = ((a0.ai) aoVar).echo;
                    anVar.foxtrot(abstractC0362p3, (4294967295L & Float.floatToRawIntBits(cVar.bravo)) | (Float.floatToRawIntBits(cVar.alpha) << 32), a0.ao.whiskey(cVar), f5, gVar);
                } else {
                    if (aoVar instanceof a0.aj) {
                        a0.aj ajVar = (a0.aj) aoVar;
                        abstractC0362p = abstractC0362p3;
                        c0354h = ajVar.foxtrot;
                        if (c0354h == null) {
                            Z.d dVar = ajVar.echo;
                            float intBitsToFloat = Float.intBitsToFloat((int) (dVar.hotel >> 32));
                            long floatToRawIntBits = (Float.floatToRawIntBits(dVar.alpha) << 32) | (Float.floatToRawIntBits(dVar.bravo) & 4294967295L);
                            float bravo = dVar.bravo();
                            float alpha = dVar.alpha();
                            anVar.golf(abstractC0362p, floatToRawIntBits, (Float.floatToRawIntBits(bravo) << 32) | (Float.floatToRawIntBits(alpha) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), f5, gVar);
                        }
                    } else if (aoVar instanceof a0.ah) {
                        C0354h c0354h2 = ((a0.ah) aoVar).echo;
                        abstractC0362p = abstractC0362p3;
                        c0354h = c0354h2;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    anVar.olive(c0354h, abstractC0362p, f5, gVar, 3);
                }
            }
        }
        anVar.charlie();
    }

    @Override // s0.P
    public final void magenta() {
        this.teal = 9205357640488583168L;
        this.white = null;
        this.yellow = null;
        this.f3320a = null;
        AbstractC2557q.india(this);
    }

    @Override // s0.e0
    public final /* synthetic */ boolean yankee() {
        return false;
    }

    @Override // s0.e0
    public final /* synthetic */ boolean yellow() {
        return false;
    }
}
