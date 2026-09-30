package b;

import android.view.KeyEvent;
import d.O0;
import f.C1676m;
import f.InterfaceC1673j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC2555o;
import s0.AbstractC2557q;
import t0.AbstractC2901T;
import t0.C0;

/* loaded from: classes3.dex */
public class ac extends AbstractC0701p {

    /* renamed from: p, reason: collision with root package name */
    public m0.r f3294p;

    @Override // b.AbstractC0701p
    public final m0.ah f() {
        return null;
    }

    @Override // b.AbstractC0701p, s0.b0
    public final void fuchsia(m0.k kVar, m0.l lVar, long j5) {
        InterfaceC1673j interfaceC1673j;
        super.fuchsia(kVar, lVar, j5);
        int i4 = 0;
        if (lVar == m0.l.purple) {
            m0.r rVar = this.f3294p;
            if (rVar == null) {
                if (O0.echo(kVar, true)) {
                    m0.r rVar2 = (m0.r) kVar.alpha.get(0);
                    rVar2.alpha();
                    this.f3294p = rVar2;
                    if (this.f3307a && (interfaceC1673j = this.red) != null) {
                        C1676m c1676m = new C1676m(rVar2.charlie);
                        if (g()) {
                            this.f3318m = vf.ad.zulu(getCoroutineScope(), null, null, new C0694i(interfaceC1673j, c1676m, this, null), 3);
                            return;
                        } else {
                            this.f3312g = c1676m;
                            vf.ad.zulu(getCoroutineScope(), null, null, new C0695j(null, interfaceC1673j, c1676m), 3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            List list = kVar.alpha;
            int size = list.size();
            int i5 = 0;
            while (true) {
                List list2 = kVar.alpha;
                if (i5 < size) {
                    if (!m0.q.bravo((m0.r) list.get(i5))) {
                        long red = AbstractC2555o.golf(this).f13298q.red(((C0) AbstractC2557q.echo(this, AbstractC2901T.sierra)).delta());
                        long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (red >> 32)) - ((int) (j5 >> 32))) / 2.0f) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (red & 4294967295L)) - ((int) (j5 & 4294967295L))) / 2.0f) & 4294967295L);
                        int size2 = list2.size();
                        while (i4 < size2) {
                            m0.r rVar3 = (m0.r) list2.get(i4);
                            if (!rVar3.bravo() && !m0.q.echo(rVar3, j5, floatToRawIntBits)) {
                                i4++;
                            } else {
                                this.f3294p = null;
                                i();
                                return;
                            }
                        }
                        return;
                    }
                    i5++;
                } else {
                    ((m0.r) list2.get(0)).alpha();
                    if (this.f3307a) {
                        InterfaceC1673j interfaceC1673j2 = this.red;
                        if (interfaceC1673j2 != null) {
                            vf.Y y10 = this.f3318m;
                            if (y10 != null && y10.echo()) {
                                vf.ad.zulu(getCoroutineScope(), null, null, new C0692g(this, rVar.charlie, interfaceC1673j2, null), 3);
                            } else {
                                C1676m c1676m2 = this.f3312g;
                                if (c1676m2 != null) {
                                    vf.ad.zulu(getCoroutineScope(), null, null, new C0693h(null, interfaceC1673j2, c1676m2), 3);
                                }
                            }
                            this.f3312g = null;
                        }
                        this.f3308b.invoke();
                    }
                    this.f3294p = null;
                    return;
                }
            }
        } else if (lVar == m0.l.red && this.f3294p != null) {
            List list3 = kVar.alpha;
            int size3 = list3.size();
            while (i4 < size3) {
                m0.r rVar4 = (m0.r) list3.get(i4);
                if (rVar4.bravo() && !Intrinsics.areEqual(rVar4, this.f3294p)) {
                    this.f3294p = null;
                    i();
                    return;
                }
                i4++;
            }
        }
    }

    @Override // b.AbstractC0701p
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // b.AbstractC0701p
    public final void m(KeyEvent keyEvent) {
        this.f3308b.invoke();
    }

    @Override // b.AbstractC0701p, s0.b0
    public final void xray() {
        super.xray();
        if (this.f3294p != null) {
            this.f3294p = null;
            i();
        }
    }
}
