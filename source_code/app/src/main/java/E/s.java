package E;

import a0.C0366t;
import ao.ad;
import av.ah;
import bv.u;
import bz.AbstractC0779d;
import bz.AbstractC0800z;
import bz.C0778c;
import bz.f0;
import com.google.android.gms.internal.measurement.C1290a1;
import f.C1664a;
import f.C1665b;
import f.C1666c;
import f.C1667d;
import f.C1668e;
import f.C1670g;
import f.C1671h;
import f.InterfaceC1672i;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s0.C2561v;
import s0.af;
import s0.al;
import s0.an;
import t0.C2946x;
import vf.ab;

/* loaded from: classes3.dex */
public final class s {
    public boolean alpha;
    public Object bravo;
    public Object charlie = AbstractC0779d.alpha(0.0f);
    public Object delta = new ArrayList();
    public Object echo;

    public s(Function0 function0, boolean z2) {
        this.alpha = z2;
        this.bravo = function0;
    }

    public void alpha(an anVar, float f5, long j5) {
        float floatValue = ((Number) ((C0778c) this.charlie).delta()).floatValue();
        if (floatValue > 0.0f) {
            long bravo = C0366t.bravo(floatValue, j5);
            if (this.alpha) {
                float delta = Z.e.delta(anVar.bravo());
                float bravo2 = Z.e.bravo(anVar.bravo());
                J2.t tVar = anVar.alpha.purple;
                long oscar = tVar.oscar();
                tVar.mike().golf();
                try {
                    ((J2.t) ((ah) tVar.alpha).purple).mike().lima(0.0f, 0.0f, delta, bravo2, 1);
                    ad.golf(anVar, bravo, f5, 0L, null, 124);
                    return;
                } finally {
                    ad.coral(tVar, oscar);
                }
            }
            ad.golf(anVar, bravo, f5, 0L, null, 124);
        }
    }

    public void bravo(InterfaceC1672i interfaceC1672i, ab abVar) {
        float f5;
        boolean z2 = interfaceC1672i instanceof C1670g;
        ArrayList arrayList = (ArrayList) this.delta;
        if (z2) {
            arrayList.add(interfaceC1672i);
        } else if (interfaceC1672i instanceof C1671h) {
            arrayList.remove(((C1671h) interfaceC1672i).alpha);
        } else if (interfaceC1672i instanceof C1667d) {
            arrayList.add(interfaceC1672i);
        } else if (interfaceC1672i instanceof C1668e) {
            arrayList.remove(((C1668e) interfaceC1672i).alpha);
        } else if (interfaceC1672i instanceof C1665b) {
            arrayList.add(interfaceC1672i);
        } else if (interfaceC1672i instanceof C1666c) {
            arrayList.remove(((C1666c) interfaceC1672i).alpha);
        } else if (interfaceC1672i instanceof C1664a) {
            arrayList.remove(((C1664a) interfaceC1672i).alpha);
        } else {
            return;
        }
        InterfaceC1672i interfaceC1672i2 = (InterfaceC1672i) CollectionsKt.olive(arrayList);
        if (!Intrinsics.areEqual((InterfaceC1672i) this.echo, interfaceC1672i2)) {
            if (interfaceC1672i2 != null) {
                g gVar = (g) ((Function0) this.bravo).invoke();
                boolean z10 = interfaceC1672i2 instanceof C1670g;
                if (z10) {
                    f5 = gVar.charlie;
                } else if (interfaceC1672i2 instanceof C1667d) {
                    f5 = gVar.bravo;
                } else if (interfaceC1672i2 instanceof C1665b) {
                    f5 = gVar.alpha;
                } else {
                    f5 = 0.0f;
                }
                f0 f0Var = l.alpha;
                if (!z10) {
                    if (interfaceC1672i2 instanceof C1667d) {
                        f0Var = new f0(45, AbstractC0800z.delta, 2);
                    } else if (interfaceC1672i2 instanceof C1665b) {
                        f0Var = new f0(45, AbstractC0800z.delta, 2);
                    }
                }
                vf.ad.zulu(abVar, null, null, new q(this, f5, f0Var, null), 3);
            } else {
                InterfaceC1672i interfaceC1672i3 = (InterfaceC1672i) this.echo;
                f0 f0Var2 = l.alpha;
                boolean z11 = interfaceC1672i3 instanceof C1670g;
                f0 f0Var3 = l.alpha;
                if (!z11 && !(interfaceC1672i3 instanceof C1667d) && (interfaceC1672i3 instanceof C1665b)) {
                    f0Var3 = new f0(150, AbstractC0800z.delta, 2);
                }
                vf.ad.zulu(abVar, null, null, new r(this, f0Var3, null), 3);
            }
            this.echo = interfaceC1672i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int charlie(com.google.android.play.core.integrity.c cVar, C2946x c2946x, boolean z2) {
        Object[] objArr;
        m0.c cVar2;
        int i4;
        int i5;
        C2561v c2561v = (C2561v) this.echo;
        if (this.alpha) {
            return 0;
        }
        try {
            this.alpha = true;
            C1290a1 lime = ((com.google.android.material.internal.s) this.delta).lime(cVar, c2946x);
            u uVar = (u) lime.bravo;
            int juliet = uVar.juliet();
            for (int i10 = 0; i10 < juliet; i10++) {
                m0.r rVar = (m0.r) uVar.kilo(i10);
                if (!rVar.delta && !rVar.hotel) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int juliet2 = uVar.juliet();
            int i11 = 0;
            while (true) {
                cVar2 = (m0.c) this.charlie;
                if (i11 >= juliet2) {
                    break;
                }
                m0.r rVar2 = (m0.r) uVar.kilo(i11);
                if (objArr != false || m0.q.alpha(rVar2)) {
                    al alVar = (al) this.bravo;
                    long j5 = rVar2.charlie;
                    C2561v c2561v2 = (C2561v) this.echo;
                    int i12 = rVar2.india;
                    af afVar = al.f13273J;
                    alVar.amber(j5, c2561v2, i12, true);
                    if (!c2561v.alpha.delta()) {
                        cVar2.alpha(rVar2.alpha, c2561v, m0.q.alpha(rVar2));
                        c2561v.clear();
                    }
                }
                i11++;
            }
            boolean bravo = cVar2.bravo(lime, z2);
            if (!lime.alpha) {
                int juliet3 = uVar.juliet();
                for (int i13 = 0; i13 < juliet3; i13++) {
                    m0.r rVar3 = (m0.r) uVar.kilo(i13);
                    if (!Z.b.bravo(m0.q.golf(rVar3, true), 0L) && rVar3.bravo()) {
                        i4 = 1;
                        break;
                    }
                }
            }
            i4 = 0;
            int juliet4 = uVar.juliet();
            int i14 = 0;
            while (true) {
                if (i14 < juliet4) {
                    if (((m0.r) uVar.kilo(i14)).bravo()) {
                        i5 = 1;
                        break;
                    }
                    i14++;
                } else {
                    i5 = 0;
                    break;
                }
            }
            int i15 = (i4 << 1) | (bravo ? 1 : 0) | (i5 << 2);
            this.alpha = false;
            return i15;
        } catch (Throwable th) {
            this.alpha = false;
            throw th;
        }
    }
}
