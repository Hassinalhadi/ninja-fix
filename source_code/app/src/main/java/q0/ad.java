package q0;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import p0.AbstractC2264a;

/* loaded from: classes3.dex */
public final class ad implements InterfaceC2380P, ar {
    public final /* synthetic */ ag alpha;
    public final /* synthetic */ al purple;

    public ad(al alVar) {
        this.purple = alVar;
        this.alpha = alVar.f13150a;
    }

    @Override // Q0.d
    public final float alpha() {
        return this.alpha.purple;
    }

    @Override // Q0.d
    public final long beige(float f5) {
        return this.alpha.beige(f5);
    }

    @Override // Q0.d
    public final float crimson(int i4) {
        return this.alpha.crimson(i4);
    }

    @Override // q0.InterfaceC2402u
    public final Q0.n getLayoutDirection() {
        return this.alpha.alpha;
    }

    @Override // Q0.d
    public final float gold(float f5) {
        return f5 / this.alpha.alpha();
    }

    @Override // Q0.d
    public final float indigo() {
        return this.alpha.red;
    }

    @Override // q0.InterfaceC2402u
    public final boolean ivory() {
        return this.alpha.ivory();
    }

    @Override // Q0.d
    public final float lavender(float f5) {
        return this.alpha.alpha() * f5;
    }

    @Override // Q0.d
    public final long mike(long j5) {
        ag agVar = this.alpha;
        agVar.getClass();
        return Q0.c.echo(j5, agVar);
    }

    @Override // Q0.d
    public final int ochre(float f5) {
        ag agVar = this.alpha;
        agVar.getClass();
        return Q0.c.bravo(agVar, f5);
    }

    @Override // q0.ar
    public final aq papa(int i4, int i5, Map map, Function1 function1) {
        return this.alpha.purple(i4, i5, map, null, function1);
    }

    @Override // q0.InterfaceC2380P
    public final List pink(Object obj, Xd.l lVar) {
        ae aeVar;
        Object akVar;
        al alVar = this.purple;
        s0.al alVar2 = (s0.al) alVar.yellow.golf(obj);
        s0.al alVar3 = alVar.alpha;
        if (alVar2 != null && ((J.e) ((J.b) alVar3.papa()).purple).kilo(alVar2) < alVar.silver) {
            return alVar2.mike();
        }
        J.e eVar = alVar.f13154f;
        if (eVar.red < alVar.teal) {
            AbstractC2264a.alpha("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i4 = eVar.red;
        int i5 = alVar.teal;
        if (i4 == i5) {
            eVar.bravo(obj);
        } else {
            Object[] objArr = eVar.alpha;
            Object obj2 = objArr[i5];
            objArr[i5] = obj;
        }
        alVar.teal++;
        bv.al alVar4 = alVar.f13152c;
        if (!alVar4.bravo(obj)) {
            boolean cyan = alVar3.cyan();
            bv.al alVar5 = alVar.e;
            if (cyan) {
                alVar.echo();
                if (!alVar.yellow.charlie(obj)) {
                    alVar5.kilo(obj);
                    Object golf = alVar4.golf(obj);
                    if (golf == null) {
                        golf = alVar.india(obj);
                        if (golf != null) {
                            int kilo = ((J.e) ((J.b) alVar3.papa()).purple).kilo(golf);
                            int i10 = ((J.e) ((J.b) alVar3.papa()).purple).red;
                            alVar3.f13290i = true;
                            alVar3.gray(kilo, i10, 1);
                            alVar3.f13290i = false;
                            alVar.f13156h++;
                        } else {
                            int i11 = ((J.e) ((J.b) alVar3.papa()).purple).red;
                            s0.al alVar6 = new s0.al(2);
                            alVar3.f13290i = true;
                            alVar3.azure(i11, alVar6);
                            alVar3.f13290i = false;
                            alVar.f13156h++;
                            golf = alVar6;
                        }
                        alVar4.mike(obj, golf);
                    }
                    alVar.hotel((s0.al) golf, obj, false, lVar);
                }
            }
            if (!alVar3.cyan()) {
                akVar = new Object();
            } else {
                akVar = new ak(alVar, obj);
            }
            alVar5.mike(obj, akVar);
            if (alVar3.f13306y.delta == s0.ag.red) {
                alVar3.maroon(true);
            } else {
                s0.al.navy(alVar3, true, 6);
            }
        } else {
            s0.al alVar7 = (s0.al) alVar4.golf(obj);
            if (alVar7 != null) {
                aeVar = (ae) alVar.white.golf(alVar7);
            } else {
                aeVar = null;
            }
            if (aeVar != null && aeVar.delta) {
                alVar.hotel(alVar7, obj, false, lVar);
            }
        }
        s0.al alVar8 = (s0.al) alVar4.golf(obj);
        if (alVar8 != null) {
            List b2 = alVar8.f13306y.papa.b();
            J.b bVar = (J.b) b2;
            int i12 = ((J.e) bVar.purple).red;
            for (int i13 = 0; i13 < i12; i13++) {
                ((s0.C) bVar.get(i13)).white.bravo = true;
            }
            return b2;
        }
        return CollectionsKt.emptyList();
    }

    @Override // q0.ar
    public final aq purple(int i4, int i5, Map map, B2.ap apVar, Function1 function1) {
        return this.alpha.purple(i4, i5, map, apVar, function1);
    }

    @Override // Q0.d
    public final float quebec(long j5) {
        ag agVar = this.alpha;
        agVar.getClass();
        return Q0.c.delta(j5, agVar);
    }

    @Override // Q0.d
    public final long red(long j5) {
        ag agVar = this.alpha;
        agVar.getClass();
        return Q0.c.golf(j5, agVar);
    }

    @Override // Q0.d
    public final float teal(long j5) {
        ag agVar = this.alpha;
        agVar.getClass();
        return Q0.c.foxtrot(j5, agVar);
    }
}
