package q0;

import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import p0.AbstractC2264a;

/* loaded from: classes3.dex */
public final class ag implements InterfaceC2380P {
    public Q0.n alpha = Q0.n.purple;
    public float purple;
    public float red;
    public final /* synthetic */ al silver;

    public ag(al alVar) {
        this.silver = alVar;
    }

    @Override // Q0.d
    public final float alpha() {
        return this.purple;
    }

    @Override // Q0.d
    public final long beige(float f5) {
        return Q0.c.hotel(this, gold(f5));
    }

    @Override // Q0.d
    public final float crimson(int i4) {
        return i4 / alpha();
    }

    @Override // q0.InterfaceC2402u
    public final Q0.n getLayoutDirection() {
        return this.alpha;
    }

    @Override // Q0.d
    public final float gold(float f5) {
        return f5 / alpha();
    }

    @Override // Q0.d
    public final float indigo() {
        return this.red;
    }

    @Override // q0.InterfaceC2402u
    public final boolean ivory() {
        s0.ag agVar = this.silver.alpha.f13306y.delta;
        if (agVar != s0.ag.silver && agVar != s0.ag.purple) {
            return false;
        }
        return true;
    }

    @Override // Q0.d
    public final float lavender(float f5) {
        return alpha() * f5;
    }

    @Override // Q0.d
    public final /* synthetic */ long mike(long j5) {
        return Q0.c.echo(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ int ochre(float f5) {
        return Q0.c.bravo(this, f5);
    }

    @Override // q0.ar
    public final aq papa(int i4, int i5, Map map, Function1 function1) {
        return purple(i4, i5, map, null, function1);
    }

    @Override // q0.InterfaceC2380P
    public final List pink(Object obj, Xd.l lVar) {
        al alVar = this.silver;
        alVar.echo();
        s0.al alVar2 = alVar.alpha;
        s0.ag agVar = alVar2.f13306y.delta;
        s0.ag agVar2 = s0.ag.alpha;
        if (agVar != agVar2 && agVar != s0.ag.red && agVar != s0.ag.purple && agVar != s0.ag.silver) {
            AbstractC2264a.bravo("subcompose can only be used inside the measure or layout blocks");
        }
        bv.al alVar3 = alVar.yellow;
        Object golf = alVar3.golf(obj);
        if (golf == null) {
            golf = (s0.al) alVar.f13152c.kilo(obj);
            if (golf != null) {
                if (alVar.f13156h <= 0) {
                    AbstractC2264a.bravo("Check failed.");
                }
                alVar.f13156h--;
            } else {
                golf = alVar.india(obj);
                if (golf == null) {
                    int i4 = alVar.silver;
                    s0.al alVar4 = new s0.al(2);
                    alVar2.f13290i = true;
                    alVar2.azure(i4, alVar4);
                    alVar2.f13290i = false;
                    golf = alVar4;
                }
            }
            alVar3.mike(obj, golf);
        }
        s0.al alVar5 = (s0.al) golf;
        if (CollectionsKt.jade(alVar.silver, alVar2.papa()) != alVar5) {
            int kilo = ((J.e) ((J.b) alVar2.papa()).purple).kilo(alVar5);
            if (kilo < alVar.silver) {
                AbstractC2264a.alpha("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i5 = alVar.silver;
            if (i5 != kilo) {
                alVar2.f13290i = true;
                alVar2.gray(kilo, i5, 1);
                alVar2.f13290i = false;
            }
        }
        alVar.silver++;
        alVar.hotel(alVar5, obj, false, lVar);
        if (agVar != agVar2 && agVar != s0.ag.red) {
            return alVar5.lima();
        }
        return alVar5.mike();
    }

    @Override // q0.ar
    public final aq purple(int i4, int i5, Map map, B2.ap apVar, Function1 function1) {
        if ((i4 & ShapeBuilder.DEFAULT_SHAPE_COLOR) != 0 || ((-16777216) & i5) != 0) {
            AbstractC2264a.bravo("Size(" + i4 + " x " + i5 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new af(i4, i5, map, apVar, this, this.silver, function1);
    }

    @Override // Q0.d
    public final /* synthetic */ float quebec(long j5) {
        return Q0.c.delta(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ long red(long j5) {
        return Q0.c.golf(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ float teal(long j5) {
        return Q0.c.foxtrot(j5, this);
    }
}
