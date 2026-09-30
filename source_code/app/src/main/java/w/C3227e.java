package w;

import Cb.ac;
import D0.ak;
import D0.am;
import I0.aa;
import Lb.W;
import android.graphics.Rect;
import android.view.View;
import g.AbstractC1719b;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import n.C2146v;
import s0.AbstractC2557q;
import t0.AbstractC2901T;
import t0.InterfaceC2937r0;
import t0.U;
import t6.N2;
import v.AbstractC3164c;
import vf.Y;
import vf.ad;
import xf.EnumC3340a;
import yf.AbstractC3428A;
import yf.as;
import yf.az;

/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3227e implements I0.v {
    public q alpha;
    public Y bravo;
    public u charlie;
    public az delta;

    @Override // I0.v
    public final void alpha(Z.c cVar) {
        Rect rect;
        u uVar = this.charlie;
        if (uVar != null) {
            uVar.lima = new Rect(Zd.a.delta(cVar.alpha), Zd.a.delta(cVar.bravo), Zd.a.delta(cVar.charlie), Zd.a.delta(cVar.delta));
            if (uVar.juliet.isEmpty() && (rect = uVar.lima) != null) {
                uVar.alpha.requestRectangleOnScreen(new Rect(rect));
            }
        }
    }

    @Override // I0.v
    public final void bravo() {
        juliet(null);
    }

    @Override // I0.v
    public final void charlie(aa aaVar, I0.t tVar, ak akVar, W w4, Z.c cVar, Z.c cVar2) {
        u uVar = this.charlie;
        if (uVar != null) {
            r rVar = uVar.mike;
            synchronized (rVar.charlie) {
                try {
                    rVar.juliet = aaVar;
                    rVar.lima = tVar;
                    rVar.kilo = akVar;
                    rVar.mike = cVar;
                    rVar.november = cVar2;
                    if (!rVar.echo) {
                        if (rVar.delta) {
                        }
                    }
                    rVar.alpha();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // I0.v
    public final void delta() {
        InterfaceC2937r0 interfaceC2937r0;
        q qVar = this.alpha;
        if (qVar != null && (interfaceC2937r0 = (InterfaceC2937r0) AbstractC2557q.echo(qVar, AbstractC2901T.papa)) != null) {
            ((U) interfaceC2937r0).bravo();
        }
    }

    @Override // I0.v
    public final void echo() {
        Y y10 = this.bravo;
        if (y10 != null) {
            y10.foxtrot(null);
        }
        this.bravo = null;
        as india = india();
        if (india != null) {
            az azVar = (az) india;
            synchronized (azVar) {
                azVar.sierra(azVar.november() + azVar.f14164d, azVar.f14163c, azVar.november() + azVar.f14164d, azVar.november() + azVar.f14164d + azVar.e);
            }
        }
    }

    @Override // I0.v
    public final void foxtrot(aa aaVar, aa aaVar2) {
        boolean z2;
        int i4;
        int i5;
        int i10;
        u uVar = this.charlie;
        if (uVar != null) {
            if (am.bravo(uVar.hotel.bravo, aaVar2.bravo) && Intrinsics.areEqual(uVar.hotel.charlie, aaVar2.charlie)) {
                z2 = false;
            } else {
                z2 = true;
            }
            uVar.hotel = aaVar2;
            int size = uVar.juliet.size();
            for (int i11 = 0; i11 < size; i11++) {
                v vVar = (v) ((WeakReference) uVar.juliet.get(i11)).get();
                if (vVar != null) {
                    vVar.golf = aaVar2;
                }
            }
            r rVar = uVar.mike;
            synchronized (rVar.charlie) {
                rVar.juliet = null;
                rVar.lima = null;
                rVar.kilo = null;
                rVar.mike = null;
                rVar.november = null;
            }
            int i12 = -1;
            if (Intrinsics.areEqual(aaVar, aaVar2)) {
                if (z2) {
                    o oVar = uVar.bravo;
                    int foxtrot = am.foxtrot(aaVar2.bravo);
                    int echo = am.echo(aaVar2.bravo);
                    am amVar = uVar.hotel.charlie;
                    if (amVar != null) {
                        i10 = am.foxtrot(amVar.alpha);
                    } else {
                        i10 = -1;
                    }
                    am amVar2 = uVar.hotel.charlie;
                    if (amVar2 != null) {
                        i12 = am.echo(amVar2.alpha);
                    }
                    oVar.uniform().updateSelection((View) oVar.purple, foxtrot, echo, i10, i12);
                    return;
                }
                return;
            }
            if (aaVar != null && (!Intrinsics.areEqual(aaVar.alpha.purple, aaVar2.alpha.purple) || (am.bravo(aaVar.bravo, aaVar2.bravo) && !Intrinsics.areEqual(aaVar.charlie, aaVar2.charlie)))) {
                o oVar2 = uVar.bravo;
                oVar2.uniform().restartInput((View) oVar2.purple);
                return;
            }
            int size2 = uVar.juliet.size();
            for (int i13 = 0; i13 < size2; i13++) {
                v vVar2 = (v) ((WeakReference) uVar.juliet.get(i13)).get();
                if (vVar2 != null) {
                    aa aaVar3 = uVar.hotel;
                    o oVar3 = uVar.bravo;
                    if (vVar2.kilo) {
                        vVar2.golf = aaVar3;
                        if (vVar2.india) {
                            oVar3.uniform().updateExtractedText((View) oVar3.purple, vVar2.hotel, N2.alpha(aaVar3));
                        }
                        am amVar3 = aaVar3.charlie;
                        if (amVar3 != null) {
                            i4 = am.foxtrot(amVar3.alpha);
                        } else {
                            i4 = -1;
                        }
                        am amVar4 = aaVar3.charlie;
                        if (amVar4 != null) {
                            i5 = am.echo(amVar4.alpha);
                        } else {
                            i5 = -1;
                        }
                        long j5 = aaVar3.bravo;
                        oVar3.uniform().updateSelection((View) oVar3.purple, am.foxtrot(j5), am.echo(j5), i4, i5);
                    }
                }
            }
        }
    }

    @Override // I0.v
    public final void golf() {
        InterfaceC2937r0 interfaceC2937r0;
        q qVar = this.alpha;
        if (qVar != null && (interfaceC2937r0 = (InterfaceC2937r0) AbstractC2557q.echo(qVar, AbstractC2901T.papa)) != null) {
            ((U) interfaceC2937r0).alpha();
        }
    }

    @Override // I0.v
    public final void hotel(aa aaVar, I0.l lVar, ac acVar, C2146v c2146v) {
        juliet(new Ec.d(aaVar, this, lVar, acVar, c2146v, 5));
    }

    public final as india() {
        az azVar = this.delta;
        if (azVar != null) {
            return azVar;
        }
        if (!AbstractC3164c.alpha) {
            return null;
        }
        az bravo = AbstractC3428A.bravo(1, 0, EnumC3340a.red, 2);
        this.delta = bravo;
        return bravo;
    }

    public final void juliet(Ec.d dVar) {
        q qVar = this.alpha;
        if (qVar == null) {
            return;
        }
        Y y10 = null;
        C3226d c3226d = new C3226d(dVar, this, qVar, null);
        if (qVar.isAttached()) {
            y10 = ad.zulu(qVar.getCoroutineScope(), null, vf.ac.silver, new p(qVar, c3226d, null), 1);
        }
        this.bravo = y10;
    }

    public final void kilo(q qVar) {
        if (this.alpha != qVar) {
            AbstractC1719b.charlie("Expected textInputModifierNode to be " + qVar + " but was " + this.alpha);
        }
        this.alpha = null;
    }
}
