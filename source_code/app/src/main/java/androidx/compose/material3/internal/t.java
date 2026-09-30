package androidx.compose.material3.internal;

import F.EnumC0107f2;
import android.content.Context;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.n0;
import androidx.compose.runtime.t0;
import androidx.recyclerview.widget.RecyclerView;
import b.M;
import bz.f0;
import com.app.feature.location.api.UserInfoProvider;
import g3.InterfaceC1740a;
import h5.C1809a;
import java.util.Collection;
import java.util.Iterator;
import k3.InterfaceC2002a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p3.C2275g;
import p3.C2277i;
import s6.J4;
import u3.InterfaceC3142e;

/* loaded from: classes3.dex */
public final class t {
    public final Object alpha;
    public final Object bravo;
    public final Object charlie;
    public final Object delta;
    public final Object echo;
    public final Object foxtrot;
    public final Object golf;
    public final Object hotel;
    public final Object india;
    public final Object juliet;
    public final Object kilo;
    public final Object lima;
    public final Object mike;
    public final Object november;

    public t(Context context, InterfaceC3142e interfaceC3142e, InterfaceC1740a interfaceC1740a, InterfaceC2002a interfaceC2002a, UserInfoProvider userInfoProvider, B9.ab abVar, C2275g c2275g, C2277i c2277i, C2275g c2275g2, C1809a c1809a, kd.l lVar, kd.l lVar2, C2275g c2275g3, C2275g c2275g4, p3.ab thisController) {
        Intrinsics.echo(thisController, "thisController");
        this.alpha = context;
        this.bravo = interfaceC3142e;
        this.charlie = interfaceC1740a;
        this.delta = interfaceC2002a;
        this.echo = userInfoProvider;
        this.foxtrot = abVar;
        this.golf = c2275g;
        this.hotel = c2277i;
        this.india = c2275g2;
        this.juliet = lVar;
        this.kilo = lVar2;
        this.lima = c2275g3;
        this.mike = c2275g4;
        this.november = thisController;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object alpha(M m4, F2.m mVar, Pd.c cVar) {
        j jVar;
        int i4;
        Throwable th;
        t tVar;
        Object alpha;
        Object alpha2;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i5 = jVar.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                jVar.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = jVar.purple;
                Od.a aVar = Od.a.alpha;
                i4 = jVar.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        tVar = jVar.alpha;
                        try {
                            ResultKt.alpha(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            alpha = tVar.delta().alpha(tVar.echo());
                            if (alpha != null) {
                            }
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    try {
                        ac acVar = (ac) this.echo;
                        try {
                            m mVar2 = new m(mVar, null, this);
                            jVar.alpha = this;
                            jVar.silver = 1;
                            try {
                                acVar.getClass();
                                if (vf.ad.mike(new ab(m4, acVar, mVar2, null), jVar) == aVar) {
                                    return aVar;
                                }
                                tVar = this;
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                tVar = this;
                                alpha = tVar.delta().alpha(tVar.echo());
                                if (alpha != null && Math.abs(tVar.echo() - tVar.delta().charlie(alpha)) <= 0.5f && ((Boolean) ((Function1) tVar.delta).invoke(alpha)).booleanValue()) {
                                    tVar.hotel(alpha);
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            tVar = this;
                            alpha = tVar.delta().alpha(tVar.echo());
                            if (alpha != null) {
                                tVar.hotel(alpha);
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                alpha2 = tVar.delta().alpha(tVar.echo());
                if (alpha2 != null && Math.abs(tVar.echo() - tVar.delta().charlie(alpha2)) <= 0.5f && ((Boolean) ((Function1) tVar.delta).invoke(alpha2)).booleanValue()) {
                    tVar.hotel(alpha2);
                }
                return Unit.INSTANCE;
            }
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = jVar.silver;
        if (i4 == 0) {
        }
        alpha2 = tVar.delta().alpha(tVar.echo());
        if (alpha2 != null) {
            tVar.hotel(alpha2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object bravo(Object obj, M m4, c cVar, Pd.c cVar2) {
        n nVar;
        int i4;
        Throwable th;
        t tVar;
        ac acVar;
        p pVar;
        Object alpha;
        Object alpha2;
        if (cVar2 instanceof n) {
            nVar = (n) cVar2;
            int i5 = nVar.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                nVar.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = nVar.purple;
                Od.a aVar = Od.a.alpha;
                i4 = nVar.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        tVar = nVar.alpha;
                        try {
                            ResultKt.alpha(obj2);
                        } catch (Throwable th2) {
                            th = th2;
                            tVar.india(null);
                            alpha = tVar.delta().alpha(tVar.echo());
                            if (alpha != null) {
                                tVar.hotel(alpha);
                            }
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    if (delta().alpha.containsKey(obj)) {
                        try {
                            acVar = (ac) this.echo;
                            try {
                                pVar = new p(this, obj, cVar, null);
                                nVar.alpha = this;
                                nVar.silver = 1;
                            } catch (Throwable th3) {
                                th = th3;
                                tVar = this;
                                tVar.india(null);
                                alpha = tVar.delta().alpha(tVar.echo());
                                if (alpha != null && Math.abs(tVar.echo() - tVar.delta().charlie(alpha)) <= 0.5f && ((Boolean) ((Function1) tVar.delta).invoke(alpha)).booleanValue()) {
                                    tVar.hotel(alpha);
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        try {
                            acVar.getClass();
                            if (vf.ad.mike(new ab(m4, acVar, pVar, null), nVar) == aVar) {
                                return aVar;
                            }
                            tVar = this;
                        } catch (Throwable th5) {
                            th = th5;
                            th = th;
                            tVar = this;
                            tVar.india(null);
                            alpha = tVar.delta().alpha(tVar.echo());
                            if (alpha != null) {
                            }
                            throw th;
                        }
                    } else {
                        hotel(obj);
                        return Unit.INSTANCE;
                    }
                }
                tVar.india(null);
                alpha2 = tVar.delta().alpha(tVar.echo());
                if (alpha2 != null && Math.abs(tVar.echo() - tVar.delta().charlie(alpha2)) <= 0.5f && ((Boolean) ((Function1) tVar.delta).invoke(alpha2)).booleanValue()) {
                    tVar.hotel(alpha2);
                }
                return Unit.INSTANCE;
            }
        }
        nVar = new n(this, cVar2);
        Object obj22 = nVar.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = nVar.silver;
        if (i4 == 0) {
        }
        tVar.india(null);
        alpha2 = tVar.delta().alpha(tVar.echo());
        if (alpha2 != null) {
            tVar.hotel(alpha2);
        }
        return Unit.INSTANCE;
    }

    public Object charlie(float f5, float f10, Object obj) {
        ad delta = delta();
        float charlie = delta.charlie(obj);
        float floatValue = ((Number) ((Aa.g) this.bravo).invoke()).floatValue();
        if (charlie != f5 && !Float.isNaN(charlie)) {
            A0.p pVar = (A0.p) this.alpha;
            if (charlie < f5) {
                if (f10 >= floatValue) {
                    Object bravo = delta.bravo(f5, true);
                    Intrinsics.checkNotNull(bravo);
                    return bravo;
                }
                Object bravo2 = delta.bravo(f5, true);
                Intrinsics.checkNotNull(bravo2);
                if (f5 >= Math.abs(Math.abs(((Number) pVar.invoke(Float.valueOf(Math.abs(delta.charlie(bravo2) - charlie)))).floatValue()) + charlie)) {
                    return bravo2;
                }
            } else {
                if (f10 <= (-floatValue)) {
                    Object bravo3 = delta.bravo(f5, false);
                    Intrinsics.checkNotNull(bravo3);
                    return bravo3;
                }
                Object bravo4 = delta.bravo(f5, false);
                Intrinsics.checkNotNull(bravo4);
                float abs = Math.abs(charlie - Math.abs(((Number) pVar.invoke(Float.valueOf(Math.abs(charlie - delta.charlie(bravo4))))).floatValue()));
                if (f5 >= 0.0f ? f5 <= abs : Math.abs(f5) >= abs) {
                    return bravo4;
                }
            }
        }
        return obj;
    }

    public ad delta() {
        return (ad) ((t0) ((ax) this.india)).getValue();
    }

    public float echo() {
        return ((n0) ((androidx.compose.runtime.aw) this.lima)).juliet();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map, java.lang.Object] */
    public float foxtrot(float f5) {
        float echo;
        float f10;
        Float valueOf;
        if (Float.isNaN(echo())) {
            echo = 0.0f;
        } else {
            echo = echo();
        }
        float f11 = echo + f5;
        Float silver = CollectionsKt.silver(delta().alpha.values());
        float f12 = Float.NaN;
        if (silver != null) {
            f10 = silver.floatValue();
        } else {
            f10 = Float.NaN;
        }
        Collection values = delta().alpha.values();
        Intrinsics.echo(values, "<this>");
        Iterator it = values.iterator();
        if (!it.hasNext()) {
            valueOf = null;
        } else {
            float floatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
            }
            valueOf = Float.valueOf(floatValue);
        }
        if (valueOf != null) {
            f12 = valueOf.floatValue();
        }
        return J4.charlie(f11, f10, f12);
    }

    public float golf() {
        if (!Float.isNaN(echo())) {
            return echo();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
    }

    public void hotel(Object obj) {
        ((t0) ((ax) this.golf)).setValue(obj);
    }

    public void india(Object obj) {
        ((t0) ((ax) this.hotel)).setValue(obj);
    }

    public t(EnumC0107f2 enumC0107f2, A0.p pVar, Aa.g gVar, f0 f0Var, Function1 function1) {
        this.alpha = pVar;
        this.bravo = gVar;
        this.charlie = f0Var;
        this.delta = function1;
        this.echo = new ac();
        this.foxtrot = new s(this);
        this.golf = C0564b.zulu(enumC0107f2);
        this.juliet = C0564b.quebec(new k(this, 4));
        this.kilo = C0564b.quebec(new k(this, 2));
        this.lima = C0564b.victor(Float.NaN);
        C0564b.papa(androidx.compose.runtime.as.white, new k(this, 3));
        this.mike = C0564b.victor(0.0f);
        this.hotel = C0564b.zulu(null);
        this.india = C0564b.zulu(new ad(kotlin.collections.t.alpha));
        this.november = new q(this);
    }
}
