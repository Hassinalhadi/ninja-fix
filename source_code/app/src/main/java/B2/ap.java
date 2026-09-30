package B2;

import B9.K;
import F.AbstractC0122j1;
import F.AbstractC0171w1;
import F.AbstractC0174x1;
import F.C0090b1;
import F.C0103e2;
import F.C0158s2;
import F.I1;
import a0.C0361o;
import a0.C0366t;
import a0.InterfaceC0342ab;
import a0.as;
import a0.at;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import androidx.compose.foundation.layout.C0535a;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.a0;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.n0;
import androidx.compose.runtime.t0;
import androidx.work.impl.WorkerStoppedException;
import bz.C0778c;
import cf.C0848d;
import cf.C0851g;
import cf.C0853i;
import ef.C1653a;
import ef.C1661i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kb.C2028d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.AbstractC2120h;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import q0.AbstractC2366B;
import q0.AbstractC2367C;
import q0.C2371G;
import q0.C2399r;
import q0.RunnableC2400s;
import q0.U;
import q0.V;
import q0.W;
import qe.C2474j;
import qe.InterfaceC2466b;
import s1.C2576i;
import s6.A0;
import s6.AbstractC2609a7;
import se.C2867q;
import t0.C2909d0;
import t0.au;
import t6.AbstractC3080x2;
import t6.AbstractC3090z2;
import ue.C3158b;
import ve.AbstractC3192d;
import vf.Y;
import ye.C3426d;

/* loaded from: classes3.dex */
public final class ap extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ap(int i4, Object obj, Object obj2) {
        super(1);
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x02f5, code lost:
    
        if (((ye.EnumC3424b) r15.echo) != ye.EnumC3424b.TYPE_PARAMETER_BOUNDS) goto L90;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object extractNullability) {
        ve.q qVar;
        D8.c charlie;
        C3158b c3158b;
        Ne.b bVar;
        Ne.c cVar;
        InterfaceC2330f alpha;
        C3158b alpha2;
        float f5;
        Fe.f fVar;
        m0.v vVar;
        int i4 = 7;
        int i5 = 2;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        int i10 = 1;
        Object obj = this.purple;
        Object obj2 = this.red;
        switch (this.alpha) {
            case 0:
                Throwable th = (Throwable) extractNullability;
                if (th instanceof WorkerStoppedException) {
                    ((A2.y) obj).stop(((WorkerStoppedException) th).getReason());
                }
                ((com.google.common.util.concurrent.e) obj2).cancel(false);
                return Unit.INSTANCE;
            case 1:
                Ne.f accessorName = (Ne.f) extractNullability;
                Intrinsics.echo(accessorName, "accessorName");
                se.ak akVar = (se.ak) obj;
                if (Intrinsics.areEqual(akVar.getName(), accessorName)) {
                    return kotlin.collections.ab.juliet(akVar);
                }
                Ce.p pVar = (Ce.p) obj2;
                return CollectionsKt.a(Ce.p.victor(pVar, accessorName), Ce.p.whiskey(pVar, accessorName));
            case 2:
                Ne.f name = (Ne.f) extractNullability;
                Intrinsics.echo(name, "name");
                Ce.p pVar2 = (Ce.p) obj;
                boolean contains = ((Set) pVar2.romeo.invoke()).contains(name);
                B9.ab abVar = (B9.ab) obj2;
                InterfaceC2330f interfaceC2330f = pVar2.november;
                if (contains) {
                    Be.a aVar = (Be.a) abVar.purple;
                    Ne.b foxtrot = Ue.e.foxtrot(interfaceC2330f);
                    Intrinsics.checkNotNull(foxtrot);
                    Ne.b delta = foxtrot.delta(name);
                    tg.b bVar2 = aVar.bravo;
                    bVar2.getClass();
                    Ne.c golf = delta.golf();
                    Intrinsics.delta(golf, "classId.packageFqName");
                    String november = kotlin.text.r.november(delta.hotel().bravo(), '.', '$');
                    if (!golf.delta()) {
                        november = golf.bravo() + '.' + november;
                    }
                    Class bravo = AbstractC3080x2.bravo((ClassLoader) bVar2.purple, november);
                    if (bravo != null) {
                        qVar = new ve.q(bravo);
                    } else {
                        qVar = null;
                    }
                    if (qVar == null) {
                        return null;
                    }
                    Ce.j jVar = new Ce.j(abVar, interfaceC2330f, qVar, null);
                    ((Be.a) abVar.purple).sierra.getClass();
                    return jVar;
                }
                if (((Set) pVar2.sierra.invoke()).contains(name)) {
                    Ld.c hotel = kotlin.collections.ab.hotel();
                    ((Ve.a) ((Be.a) abVar.purple).xray).charlie(abVar, interfaceC2330f, name, hotel);
                    Ld.c alpha3 = kotlin.collections.ab.alpha(hotel);
                    int alpha4 = alpha3.alpha();
                    if (alpha4 == 0) {
                        return null;
                    }
                    if (alpha4 == 1) {
                        return (InterfaceC2330f) CollectionsKt.k(alpha3);
                    }
                    throw new IllegalStateException(("Multiple classes with same name are generated: " + alpha3).toString());
                }
                ve.w wVar = (ve.w) ((Map) pVar2.tango.invoke()).get(name);
                if (wVar == null) {
                    return null;
                }
                ff.i bravo2 = ((Be.a) abVar.purple).alpha.bravo(new Ce.o(pVar2, i5));
                Be.a aVar2 = (Be.a) abVar.purple;
                return C2867q.cyan(aVar2.alpha, pVar2.november, name, bravo2, A0.bravo(abVar, wVar), aVar2.juliet.alpha(wVar));
            case 3:
                Ce.s request = (Ce.s) extractNullability;
                Intrinsics.echo(request, "request");
                Ce.w wVar2 = (Ce.w) obj;
                Ne.b bVar3 = new Ne.b(wVar2.oscar.teal, request.alpha);
                B9.ab abVar2 = (B9.ab) obj2;
                B9.ab abVar3 = wVar2.bravo;
                Be.a aVar3 = (Be.a) abVar2.purple;
                ve.q qVar2 = request.bravo;
                if (qVar2 != null) {
                    Intrinsics.echo((C0853i) ((Be.a) abVar3.purple).delta.charlie().charlie, "<this>");
                    Me.f jvmMetadataVersion = Me.f.golf;
                    C2576i c2576i = aVar3.charlie;
                    c2576i.getClass();
                    Intrinsics.echo(jvmMetadataVersion, "jvmMetadataVersion");
                    Class bravo3 = AbstractC3080x2.bravo((ClassLoader) c2576i.alpha, qVar2.charlie().bravo());
                    if (bravo3 != null && (alpha2 = AbstractC3090z2.alpha(bravo3)) != null) {
                        charlie = new D8.c(12, alpha2);
                    } else {
                        charlie = null;
                    }
                } else {
                    Intrinsics.echo((C0853i) ((Be.a) abVar3.purple).delta.charlie().charlie, "<this>");
                    charlie = aVar3.charlie.charlie(bVar3, Me.f.golf);
                }
                if (charlie != null) {
                    c3158b = (C3158b) charlie.purple;
                } else {
                    c3158b = null;
                }
                if (c3158b != null) {
                    bVar = AbstractC3192d.alpha(c3158b.alpha);
                } else {
                    bVar = null;
                }
                if (bVar != null && (!bVar.bravo.echo().delta() || bVar.charlie)) {
                    return null;
                }
                Object obj3 = Ce.u.alpha;
                if (c3158b != null) {
                    if (((He.a) c3158b.bravo.delta) == He.a.CLASS) {
                        Ge.e eVar = ((Be.a) abVar3.purple).delta;
                        eVar.getClass();
                        C0848d foxtrot2 = eVar.foxtrot(c3158b);
                        if (foxtrot2 == null) {
                            alpha = null;
                        } else {
                            alpha = ((C0851g) eVar.charlie().tango).alpha(AbstractC3192d.alpha(c3158b.alpha), foxtrot2);
                        }
                        if (alpha != null) {
                            obj3 = new Ce.t(alpha);
                        }
                    } else {
                        obj3 = Ce.v.alpha;
                    }
                }
                if (obj3 instanceof Ce.t) {
                    return ((Ce.t) obj3).alpha;
                }
                if (obj3 instanceof Ce.v) {
                    return null;
                }
                if (obj3 instanceof Ce.u) {
                    if (qVar2 == null) {
                        tg.b bVar4 = aVar3.bravo;
                        bVar4.getClass();
                        Ne.c golf2 = bVar3.golf();
                        Intrinsics.delta(golf2, "classId.packageFqName");
                        String november2 = kotlin.text.r.november(bVar3.hotel().bravo(), '.', '$');
                        if (!golf2.delta()) {
                            november2 = golf2.bravo() + '.' + november2;
                        }
                        Class bravo4 = AbstractC3080x2.bravo((ClassLoader) bVar4.purple, november2);
                        if (bravo4 != null) {
                            qVar2 = new ve.q(bravo4);
                        } else {
                            qVar2 = null;
                        }
                    }
                    if (qVar2 != null) {
                        cVar = qVar2.charlie();
                    } else {
                        cVar = null;
                    }
                    if (cVar == null || cVar.delta()) {
                        return null;
                    }
                    Ne.c echo = cVar.echo();
                    Ce.r rVar = wVar2.oscar;
                    if (!Intrinsics.areEqual(echo, rVar.teal)) {
                        return null;
                    }
                    Ce.j jVar2 = new Ce.j(abVar2, rVar, qVar2, null);
                    aVar3.sierra.getClass();
                    return jVar2;
                }
                throw new NoWhenBranchMatchedException();
            case 4:
                InterfaceC0342ab interfaceC0342ab = (InterfaceC0342ab) extractNullability;
                float echo2 = ((C0103e2) obj).bravo.echo();
                a0.ap apVar = (a0.ap) interfaceC0342ab;
                float bravo5 = Z.e.bravo(apVar.f2581h);
                if (!Float.isNaN(echo2) && !Float.isNaN(bravo5) && bravo5 != 0.0f) {
                    float floatValue = ((Number) ((C0778c) obj2).delta()).floatValue();
                    apVar.hotel(AbstractC0122j1.delta(interfaceC0342ab, floatValue));
                    apVar.india(AbstractC0122j1.echo(interfaceC0342ab, floatValue));
                    apVar.november(a0.ao.hotel(0.5f, (echo2 + bravo5) / bravo5));
                }
                return Unit.INSTANCE;
            case 5:
                A0.ad adVar = (A0.ad) extractNullability;
                ge.v[] vVarArr = A0.aa.alpha;
                A0.ac acVar = A0.x.sierra;
                ge.v vVar2 = A0.aa.alpha[10];
                acVar.alpha(adVar, Float.valueOf(1.0f));
                A0.aa.bravo(adVar, (String) obj);
                ((A0.k) adVar).hotel(A0.j.bravo, new A0.a(null, new C0090b1((Function0) obj2, i10)));
                return Unit.INSTANCE;
            case 6:
                s0.an anVar = (s0.an) extractNullability;
                long j5 = ((Z.e) ((androidx.compose.material3.internal.ak) obj).get()).alpha;
                float delta2 = Z.e.delta(j5);
                if (delta2 > 0.0f) {
                    float lavender = anVar.lavender(AbstractC0174x1.alpha);
                    float lavender2 = anVar.lavender(((M) obj2).bravo(anVar.getLayoutDirection())) - lavender;
                    float f10 = 2;
                    float f11 = (lavender * f10) + delta2 + lavender2;
                    Q0.n layoutDirection = anVar.getLayoutDirection();
                    int[] iArr = AbstractC0171w1.$EnumSwitchMapping$0;
                    int i11 = iArr[layoutDirection.ordinal()];
                    c0.b bVar5 = anVar.alpha;
                    if (i11 == 1) {
                        f5 = Z.e.delta(bVar5.purple.oscar()) - f11;
                    } else if (lavender2 < 0.0f) {
                        f5 = 0.0f;
                    } else {
                        f5 = lavender2;
                    }
                    float f12 = f5;
                    if (iArr[anVar.getLayoutDirection().ordinal()] == 1) {
                        float delta3 = Z.e.delta(bVar5.purple.oscar());
                        if (lavender2 < 0.0f) {
                            lavender2 = 0.0f;
                        }
                        f11 = delta3 - lavender2;
                    }
                    float f13 = f11;
                    float bravo6 = Z.e.bravo(j5);
                    float f14 = (-bravo6) / f10;
                    float f15 = bravo6 / f10;
                    J2.t tVar = bVar5.purple;
                    long oscar = tVar.oscar();
                    tVar.mike().golf();
                    try {
                        ((J2.t) ((av.ah) tVar.alpha).purple).mike().lima(f12, f14, f13, f15, 0);
                        anVar.charlie();
                    } finally {
                        ao.ad.coral(tVar, oscar);
                    }
                } else {
                    anVar.charlie();
                }
                return Unit.INSTANCE;
            case 7:
                c0.d dVar = (c0.d) extractNullability;
                float lavender3 = dVar.lavender(I1.charlie);
                D0 d02 = (D0) obj;
                long j6 = ((C0366t) d02.getValue()).alpha;
                float f16 = 2;
                float lavender4 = dVar.lavender(H.q.alpha / f16);
                float f17 = lavender3 / f16;
                ao.ad.golf(dVar, j6, lavender4 - f17, 0L, new c0.h(lavender3, 0.0f, 0, 0, null, 30), 108);
                D0 d03 = (D0) obj2;
                if (Float.compare(((Q0.g) d03.getValue()).alpha, 0) > 0) {
                    ao.ad.golf(dVar, ((C0366t) d02.getValue()).alpha, dVar.lavender(((Q0.g) d03.getValue()).alpha) - f17, 0L, c0.g.alpha, 108);
                }
                return Unit.INSTANCE;
            case 8:
                ((t0) ((androidx.compose.material3.internal.ag) obj).alpha).setValue(new androidx.compose.foundation.layout.ab((C0535a) obj2, (a0) extractNullability));
                return Unit.INSTANCE;
            case 9:
                F2.c it = (F2.c) extractNullability;
                Intrinsics.echo(it, "it");
                ((Y) obj).foxtrot(null);
                ((xf.q) ((xf.r) obj2)).mike(it);
                return Unit.INSTANCE;
            case 10:
                int intValue = ((Number) extractNullability).intValue();
                Fe.v vVar3 = (Fe.v) obj;
                if (vVar3 == null || (fVar = (Fe.f) vVar3.alpha.get(Integer.valueOf(intValue))) == null) {
                    if (intValue >= 0) {
                        Fe.f[] fVarArr = (Fe.f[]) obj2;
                        if (intValue <= fVarArr.length - 1) {
                            return fVarArr[intValue];
                        }
                    }
                    return Fe.f.echo;
                }
                return fVar;
            case 11:
                Intrinsics.echo(extractNullability, "$this$extractNullability");
                Fe.a aVar4 = (Fe.a) obj2;
                Fe.u uVar = (Fe.u) obj;
                InterfaceC2466b interfaceC2466b = (InterfaceC2466b) extractNullability;
                if (interfaceC2466b instanceof Ae.h) {
                }
                boolean z10 = interfaceC2466b instanceof Ce.f;
                B9.ab abVar4 = (B9.ab) uVar.delta;
                if (z10) {
                    ((Be.a) abVar4.purple).tango.getClass();
                    if (!((Ce.f) interfaceC2466b).golf) {
                        break;
                    }
                    z2 = true;
                    return Boolean.valueOf(z2);
                }
                p000if.c cVar2 = aVar4.alpha;
                if (cVar2 != null) {
                    Ne.f fVar2 = AbstractC2120h.echo;
                    InterfaceC2332h kilo = ((kotlin.reflect.jvm.internal.impl.types.y) cVar2).green().kilo();
                    if (kilo != null && AbstractC2120h.quebec(kilo) != null) {
                        ((Be.a) abVar4.purple).quebec.getClass();
                        Object delta4 = C3426d.delta(interfaceC2466b, me.m.tango);
                        if (delta4 != null) {
                            ArrayList alpha5 = C3426d.alpha(delta4, false);
                            if (!alpha5.isEmpty()) {
                                Iterator it2 = alpha5.iterator();
                                while (it2.hasNext()) {
                                    String str = (String) it2.next();
                                    HashMap hashMap = qe.o.purple;
                                    if (Intrinsics.areEqual(str, "TYPE")) {
                                        ((Be.a) abVar4.purple).tango.getClass();
                                        z2 = true;
                                    }
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 12:
                ((s0.al) obj).teal(((T.s) extractNullability).then((T.s) obj2));
                return Unit.INSTANCE;
            case 13:
                U0.z zVar = (U0.z) obj;
                zVar.setPositionProvider((U0.ac) obj2);
                zVar.november();
                return new Object();
            case 14:
                return ((X9.i) obj).invoke(((ArrayList) obj2).get(((Number) extractNullability).intValue()));
            case 15:
                ((ArrayList) obj2).get(((Number) extractNullability).intValue());
                ((Za.d) obj).getClass();
                return null;
            case 16:
                AbstractC2366B.lima((AbstractC2366B) extractNullability, (AbstractC2367C) obj, 0, 0, ((C0361o) obj2).alpha, 4);
                return Unit.INSTANCE;
            case 17:
                AbstractC2366B.lima((AbstractC2366B) extractNullability, (AbstractC2367C) obj, 0, 0, ((at) obj2).f2591g, 4);
                return Unit.INSTANCE;
            case 18:
                a0.ao.mike((c0.d) extractNullability, (a0.ao) obj, ((C0158s2) obj2).alpha());
                return Unit.INSTANCE;
            case 19:
                X.c cVar3 = (X.c) extractNullability;
                return cVar3.charlie(new A0.p(21, new ap(18, ((as) obj).alpha(cVar3.alpha.bravo(), cVar3.alpha.getLayoutDirection(), cVar3), (C0158s2) obj2)));
            case 20:
                AbstractC2366B abstractC2366B = (AbstractC2366B) extractNullability;
                float juliet = ((n0) ((bx.ae) obj2).charlie).juliet();
                AbstractC2367C abstractC2367C = (AbstractC2367C) obj;
                abstractC2366B.getClass();
                long j7 = 0;
                AbstractC2366B.charlie(abstractC2366B, abstractC2367C);
                abstractC2367C.silver(Q0.k.charlie((j7 & 4294967295L) | (j7 << 32), abstractC2367C.teal), juliet, null);
                return Unit.INSTANCE;
            case 21:
                Ne.f name2 = (Ne.f) extractNullability;
                Intrinsics.echo(name2, "name");
                J2.i iVar = (J2.i) obj;
                Ie.t tVar2 = (Ie.t) ((LinkedHashMap) iVar.alpha).get(name2);
                if (tVar2 == null) {
                    return null;
                }
                C1661i c1661i = (C1661i) obj2;
                return C2867q.cyan((ff.l) ((K) c1661i.e.alpha).alpha, c1661i, name2, (ff.i) iVar.red, new C1653a((ff.l) ((K) c1661i.e.alpha).alpha, new Xa.f(i4, c1661i, tVar2)), pe.an.magenta);
            case 22:
                Throwable th2 = (Throwable) extractNullability;
                V0.h hVar = (V0.h) obj;
                if (th2 != null) {
                    if (th2 instanceof CancellationException) {
                        hVar.charlie();
                    } else {
                        hVar.delta(th2);
                    }
                } else {
                    hVar.bravo(((vf.ah) obj2).cyan());
                }
                return Unit.INSTANCE;
            case 23:
                ((List) obj2).get(((Number) extractNullability).intValue());
                ((C2028d) obj).getClass();
                return null;
            case 24:
                ((List) obj2).get(((Number) extractNullability).intValue());
                ((C2028d) obj).getClass();
                return null;
            case 25:
                MotionEvent motionEvent = (MotionEvent) extractNullability;
                m0.x xVar = (m0.x) obj2;
                if (motionEvent.getActionMasked() == 0) {
                    T0.d dVar2 = xVar.alpha;
                    if (dVar2 != null) {
                        if (((Boolean) dVar2.invoke(motionEvent)).booleanValue()) {
                            vVar = m0.v.purple;
                        } else {
                            vVar = m0.v.red;
                        }
                        ((J2.n) obj).purple = vVar;
                    } else {
                        Intrinsics.lima("onTouchEvent");
                        throw null;
                    }
                } else {
                    T0.d dVar3 = xVar.alpha;
                    if (dVar3 != null) {
                        dVar3.invoke(motionEvent);
                    } else {
                        Intrinsics.lima("onTouchEvent");
                        throw null;
                    }
                }
                return Unit.INSTANCE;
            case 26:
                s0.aq aqVar = (s0.aq) extractNullability;
                C2371G c2371g = (C2371G) obj;
                if (c2371g.alpha.yellow.juliet() > 0) {
                    aqVar.alpha = true;
                    s0.at atVar = aqVar.silver;
                    q0.z g2 = atVar.g();
                    if (Q0.k.alpha(aqVar.purple, 9223372034707292159L)) {
                        aqVar.purple = AbstractC2609a7.charlie(g2.tango(0L));
                        aqVar.red = g2.kilo();
                    }
                    atVar.plum().f13306y.bravo();
                    long kilo2 = g2.kilo();
                    RunnableC2400s runnableC2400s = (RunnableC2400s) obj2;
                    int i12 = (int) (kilo2 >> 32);
                    int i13 = (int) (kilo2 & 4294967295L);
                    for (U u4 : androidx.compose.ui.layout.b.bravo) {
                        Object golf3 = runnableC2400s.white.golf(u4);
                        Intrinsics.checkNotNull(golf3);
                        W w4 = (W) golf3;
                        V v4 = (V) u4;
                        androidx.compose.ui.layout.b.alpha(aqVar, v4.charlie, w4.hotel, i12, i13);
                        if (((Boolean) ((t0) w4.bravo).getValue()).booleanValue()) {
                            androidx.compose.ui.layout.b.alpha(aqVar, w4.foxtrot, w4.juliet, i12, i13);
                            androidx.compose.ui.layout.b.alpha(aqVar, w4.golf, w4.kilo, i12, i13);
                        }
                        androidx.compose.ui.layout.b.alpha(aqVar, v4.delta, w4.india, i12, i13);
                    }
                    if (c2371g.alpha.f13158a.echo()) {
                        bv.ah ahVar = c2371g.alpha.f13158a;
                        Object[] objArr = ahVar.alpha;
                        int i14 = ahVar.bravo;
                        for (int i15 = 0; i15 < i14; i15++) {
                            ax axVar = (ax) objArr[i15];
                            C2399r c2399r = (C2399r) c2371g.alpha.f13159b.get(i15);
                            Rect rect = (Rect) axVar.getValue();
                            aqVar.charlie(c2399r.bravo(), rect.left);
                            aqVar.charlie(c2399r.delta(), rect.top);
                            aqVar.charlie(c2399r.charlie(), rect.right);
                            aqVar.charlie(c2399r.alpha(), rect.bottom);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 27:
                Context context = (Context) obj;
                t0.ap apVar2 = (t0.ap) obj2;
                context.getApplicationContext().registerComponentCallbacks(apVar2);
                return new Cb.af(15, context, apVar2);
            case 28:
                Context context2 = (Context) obj;
                t0.aq aqVar2 = (t0.aq) obj2;
                context2.getApplicationContext().registerComponentCallbacks(aqVar2);
                return new Cb.af(16, context2, aqVar2);
            default:
                return new C2909d0((w.u) obj, new C2474j(i4, (au) obj2));
        }
    }
}
