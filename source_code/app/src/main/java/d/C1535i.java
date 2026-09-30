package d;

import g.AbstractC1719b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC2555o;
import s0.AbstractC2557q;
import s0.InterfaceC2553m;
import s6.AbstractC2627c7;

/* renamed from: d.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1535i extends T.r implements InterfaceC2553m, s0.aa {
    public K alpha;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12002b;
    public final C1548o0 purple;
    public boolean red;
    public q0.z teal;
    public boolean white;
    public boolean yellow;
    public final androidx.compose.foundation.lazy.layout.i silver = new androidx.compose.foundation.lazy.layout.i(1);

    /* renamed from: a, reason: collision with root package name */
    public long f12001a = 0;

    public C1535i(K k6, C1548o0 c1548o0, boolean z2) {
        this.alpha = k6;
        this.purple = c1548o0;
        this.red = z2;
    }

    public static final float b(C1535i c1535i, InterfaceC1523c interfaceC1523c) {
        long j5;
        Z.c cVar;
        int compare;
        if (!Q0.m.alpha(c1535i.f12001a, 0L)) {
            J.e eVar = c1535i.silver.alpha;
            int i4 = eVar.red - 1;
            Object[] objArr = eVar.alpha;
            Z.c cVar2 = null;
            if (i4 < objArr.length) {
                cVar = null;
                while (true) {
                    if (i4 >= 0) {
                        Z.c cVar3 = (Z.c) ((C1527e) objArr[i4]).alpha.invoke();
                        if (cVar3 != null) {
                            long bravo = cVar3.bravo();
                            long bravo2 = AbstractC2627c7.bravo(c1535i.f12001a);
                            int i5 = AbstractC1529f.$EnumSwitchMapping$0[c1535i.alpha.ordinal()];
                            if (i5 != 1) {
                                j5 = 4294967295L;
                                if (i5 == 2) {
                                    compare = Float.compare(Float.intBitsToFloat((int) (bravo >> 32)), Float.intBitsToFloat((int) (bravo2 >> 32)));
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                j5 = 4294967295L;
                                compare = Float.compare(Float.intBitsToFloat((int) (bravo & 4294967295L)), Float.intBitsToFloat((int) (bravo2 & 4294967295L)));
                            }
                            if (compare <= 0) {
                                cVar = cVar3;
                            } else if (cVar == null) {
                                cVar = cVar3;
                            }
                        }
                        i4--;
                    } else {
                        j5 = 4294967295L;
                        break;
                    }
                }
            } else {
                j5 = 4294967295L;
                cVar = null;
            }
            if (cVar == null) {
                if (c1535i.white) {
                    cVar2 = c1535i.c();
                }
                if (cVar2 == null) {
                    return 0.0f;
                }
                cVar = cVar2;
            }
            long bravo3 = AbstractC2627c7.bravo(c1535i.f12001a);
            int ordinal = c1535i.alpha.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    float f5 = cVar.charlie;
                    float f10 = cVar.alpha;
                    return interfaceC1523c.alpha(f10, f5 - f10, Float.intBitsToFloat((int) (bravo3 >> 32)));
                }
                throw new NoWhenBranchMatchedException();
            }
            float f11 = cVar.delta;
            float f12 = cVar.bravo;
            return interfaceC1523c.alpha(f12, f11 - f12, Float.intBitsToFloat((int) (bravo3 & j5)));
        }
        return 0.0f;
    }

    public final Z.c c() {
        if (isAttached()) {
            s0.L foxtrot = AbstractC2555o.foxtrot(this);
            q0.z zVar = this.teal;
            if (zVar != null) {
                if (!zVar.india()) {
                    zVar = null;
                }
                if (zVar != null) {
                    return foxtrot.sierra(zVar, false);
                }
            }
        }
        return null;
    }

    public final boolean d(Z.c cVar, long j5) {
        long f5 = f(cVar, j5);
        if (Math.abs(Float.intBitsToFloat((int) (f5 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (f5 & 4294967295L))) <= 0.5f) {
            return true;
        }
        return false;
    }

    public final void e() {
        androidx.compose.runtime.aa aaVar = AbstractC1525d.alpha;
        InterfaceC1523c interfaceC1523c = (InterfaceC1523c) AbstractC2557q.echo(this, aaVar);
        if (this.f12002b) {
            AbstractC1719b.charlie("launchAnimation called when previous animation was running");
        }
        vf.ad.zulu(getCoroutineScope(), null, vf.ac.silver, new C1533h(this, new R0(((InterfaceC1523c) AbstractC2557q.echo(this, aaVar)).bravo()), interfaceC1523c, null), 1);
    }

    public final long f(Z.c cVar, long j5) {
        long floatToRawIntBits;
        long j6;
        long bravo = AbstractC2627c7.bravo(j5);
        int ordinal = this.alpha.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                InterfaceC1523c interfaceC1523c = (InterfaceC1523c) AbstractC2557q.echo(this, AbstractC1525d.alpha);
                float f5 = cVar.charlie;
                float f10 = cVar.alpha;
                long floatToRawIntBits2 = Float.floatToRawIntBits(interfaceC1523c.alpha(f10, f5 - f10, Float.intBitsToFloat((int) (bravo >> 32))));
                floatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j6 = floatToRawIntBits2 << 32;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            InterfaceC1523c interfaceC1523c2 = (InterfaceC1523c) AbstractC2557q.echo(this, AbstractC1525d.alpha);
            float f11 = cVar.delta;
            float f12 = cVar.bravo;
            float alpha = interfaceC1523c2.alpha(f12, f11 - f12, Float.intBitsToFloat((int) (bravo & 4294967295L)));
            long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(alpha);
            j6 = floatToRawIntBits3 << 32;
        }
        return j6 | (floatToRawIntBits & 4294967295L);
    }

    @Override // s0.aa
    public final /* synthetic */ void foxtrot(q0.z zVar) {
    }

    @Override // T.r
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // s0.aa
    public final void kilo(long j5) {
        int golf;
        Z.c c3;
        long j6 = this.f12001a;
        this.f12001a = j5;
        int i4 = AbstractC1529f.$EnumSwitchMapping$0[this.alpha.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                golf = Intrinsics.golf((int) (j5 >> 32), (int) (j6 >> 32));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            golf = Intrinsics.golf((int) (j5 & 4294967295L), (int) (4294967295L & j6));
        }
        if (golf < 0 && !this.f12002b && !this.white && (c3 = c()) != null && d(c3, j6)) {
            this.yellow = true;
        }
    }
}
