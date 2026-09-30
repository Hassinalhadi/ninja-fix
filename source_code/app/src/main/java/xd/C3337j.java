package xd;

import Pf.ab;
import Pf.ae;
import Pf.ag;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.internal.C1473v;
import io.ktor.serialization.JsonConvertException;
import io.ktor.utils.io.ak;
import io.ktor.utils.io.t;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import s6.Z4;
import t6.AbstractC2981d2;
import t6.AbstractC3012j3;
import yd.C3420d;
import yf.AbstractC3428A;

/* renamed from: xd.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3337j {
    public final Of.d alpha;
    public final ArrayList bravo;

    public C3337j(Of.d dVar) {
        this.alpha = dVar;
        List list = AbstractC3328a.alpha;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C3420d) it.next()).getClass();
            arrayList.add(new yd.j(dVar));
        }
        this.bravo = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(Charset charset, Ed.a aVar, t tVar, Pd.c cVar) {
        C3330c c3330c;
        C3330c c3330c2;
        Od.a aVar2;
        int i4;
        ArrayList arrayList;
        Of.d dVar;
        Charset charset2;
        Ed.a aVar3;
        t tVar2;
        Object mike;
        KSerializer kSerializer;
        Charset charset3;
        if (cVar instanceof C3330c) {
            c3330c = (C3330c) cVar;
            int i5 = c3330c.white;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3330c.white = i5 - RecyclerView.UNDEFINED_DURATION;
                c3330c2 = c3330c;
                Object obj = c3330c2.silver;
                aVar2 = Od.a.alpha;
                i4 = c3330c2.white;
                arrayList = this.bravo;
                dVar = this.alpha;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            kSerializer = (KSerializer) c3330c2.purple;
                            charset3 = c3330c2.alpha;
                            ResultKt.alpha(obj);
                            try {
                                KSerializer deserializer = kSerializer;
                                String string = Z4.bravo((Gf.i) obj, charset3, 2);
                                Intrinsics.echo(deserializer, "deserializer");
                                Intrinsics.echo(string, "string");
                                ae aeVar = new ae(string);
                                Object tango = new ab(dVar, ag.red, aeVar, deserializer.getDescriptor(), null).tango(deserializer);
                                aeVar.papa();
                                return tango;
                            } catch (Throwable th) {
                                throw new JsonConvertException("Illegal input: " + th.getMessage(), th);
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tVar2 = c3330c2.red;
                    Ed.a aVar4 = (Ed.a) c3330c2.purple;
                    Charset charset4 = c3330c2.alpha;
                    ResultKt.alpha(obj);
                    aVar3 = aVar4;
                    charset2 = charset4;
                } else {
                    ResultKt.alpha(obj);
                    charset2 = charset;
                    aVar3 = aVar;
                    wd.c cVar2 = new wd.c(new C1.t(4, arrayList), charset2, aVar3, tVar, 1);
                    C3331d c3331d = new C3331d(tVar, null);
                    c3330c2.alpha = charset2;
                    c3330c2.purple = aVar3;
                    c3330c2.red = tVar;
                    c3330c2.white = 1;
                    obj = AbstractC3428A.papa(cVar2, c3331d, c3330c2);
                    if (obj != aVar2) {
                        tVar2 = tVar;
                    }
                    return aVar2;
                }
                if (arrayList.isEmpty() && (obj != null || tVar2.hotel())) {
                    return obj;
                }
                KSerializer delta = AbstractC3012j3.delta(dVar.bravo, aVar3);
                c3330c2.alpha = charset2;
                c3330c2.purple = delta;
                c3330c2.red = null;
                c3330c2.white = 2;
                mike = ak.mike(tVar2, c3330c2);
                if (mike != aVar2) {
                    kSerializer = delta;
                    obj = mike;
                    charset3 = charset2;
                    KSerializer deserializer2 = kSerializer;
                    String string2 = Z4.bravo((Gf.i) obj, charset3, 2);
                    Intrinsics.echo(deserializer2, "deserializer");
                    Intrinsics.echo(string2, "string");
                    ae aeVar2 = new ae(string2);
                    Object tango2 = new ab(dVar, ag.red, aeVar2, deserializer2.getDescriptor(), null).tango(deserializer2);
                    aeVar2.papa();
                    return tango2;
                }
                return aVar2;
            }
        }
        c3330c = new C3330c(this, cVar);
        c3330c2 = c3330c;
        Object obj2 = c3330c2.silver;
        aVar2 = Od.a.alpha;
        i4 = c3330c2.white;
        arrayList = this.bravo;
        dVar = this.alpha;
        if (i4 == 0) {
        }
        if (arrayList.isEmpty()) {
        }
        KSerializer delta2 = AbstractC3012j3.delta(dVar.bravo, aVar3);
        c3330c2.alpha = charset2;
        c3330c2.purple = delta2;
        c3330c2.red = null;
        c3330c2.white = 2;
        mike = ak.mike(tVar2, c3330c2);
        if (mike != aVar2) {
        }
        return aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r0v3, types: [Xd.l, Pd.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bravo(sd.e eVar, Charset charset, Ed.a aVar, Object obj, Pd.c cVar) {
        C3335h c3335h;
        int i4;
        Ed.a aVar2;
        Object obj2;
        vd.e eVar2;
        KSerializer bravo;
        Of.d dVar = this.alpha;
        C1473v c1473v = dVar.bravo;
        if (cVar instanceof C3335h) {
            c3335h = (C3335h) cVar;
            int i5 = c3335h.yellow;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3335h.yellow = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj3 = c3335h.teal;
                Od.a aVar3 = Od.a.alpha;
                i4 = c3335h.yellow;
                if (i4 == 0) {
                    if (i4 == 1) {
                        Object obj4 = c3335h.silver;
                        Ed.a aVar4 = c3335h.red;
                        Charset charset2 = c3335h.purple;
                        sd.e eVar3 = c3335h.alpha;
                        ResultKt.alpha(obj3);
                        obj2 = obj4;
                        aVar2 = aVar4;
                        eVar = eVar3;
                        charset = charset2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj3);
                    C3334g c3334g = new C3334g(new C1.t(4, this.bravo), eVar, charset, aVar, obj);
                    ?? iVar = new Pd.i(2, null);
                    c3335h.alpha = eVar;
                    c3335h.purple = charset;
                    aVar2 = aVar;
                    c3335h.red = aVar2;
                    obj2 = obj;
                    c3335h.silver = obj2;
                    c3335h.yellow = 1;
                    obj3 = AbstractC3428A.papa(c3334g, iVar, c3335h);
                    if (obj3 == aVar3) {
                        return aVar3;
                    }
                }
                eVar2 = (vd.e) obj3;
                if (eVar2 == null) {
                    return eVar2;
                }
                try {
                    bravo = AbstractC3012j3.delta(c1473v, aVar2);
                } catch (SerializationException unused) {
                    bravo = AbstractC3012j3.bravo(obj2, c1473v);
                }
                return new vd.f(dVar.alpha(bravo, obj2), AbstractC2981d2.charlie(eVar, charset));
            }
        }
        c3335h = new C3335h(this, cVar);
        Object obj32 = c3335h.teal;
        Od.a aVar32 = Od.a.alpha;
        i4 = c3335h.yellow;
        if (i4 == 0) {
        }
        eVar2 = (vd.e) obj32;
        if (eVar2 == null) {
        }
    }
}
