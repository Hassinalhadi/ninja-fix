package jd;

import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.network.api.CtApi;
import ge.InterfaceC1772d;
import ge.w;
import ge.z;
import hd.l;
import id.C1914b;
import id.C1915c;
import io.ktor.client.plugins.contentnegotiation.ContentConverterException;
import io.ktor.utils.io.t;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v;
import od.C2226c;
import qd.C2464b;
import s6.AbstractC2742p5;
import s6.W4;
import sd.aa;
import sd.af;
import sd.n;
import sd.q;
import t6.AbstractC2976c2;
import t6.AbstractC2981d2;
import t6.AbstractC2991f2;
import t6.W2;
import xd.C3337j;
import zd.C3509a;

/* loaded from: classes2.dex */
public abstract class h {
    public static final rg.b alpha = rg.d.bravo().bravo().alpha("io.ktor.client.plugins.contentnegotiation.ContentNegotiation");
    public static final Set bravo;
    public static final C3509a charlie;
    public static final C1915c delta;

    static {
        w wVar;
        v vVar = u.alpha;
        bravo = ArraysKt.g(new InterfaceC1772d[]{vVar.bravo(byte[].class), vVar.bravo(String.class), vVar.bravo(sd.v.class), vVar.bravo(t.class), vVar.bravo(vd.e.class)});
        InterfaceC1772d bravo2 = vVar.bravo(List.class);
        try {
            z zVar = z.charlie;
            wVar = u.bravo(List.class, W4.bravo(u.alpha(sd.e.class)));
        } catch (Throwable unused) {
            wVar = null;
        }
        charlie = new C3509a("ExcludedContentTypesAttr", new Ed.a(bravo2, wVar));
        delta = AbstractC2742p5.alpha("ContentNegotiation", c.alpha, new l(23));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x027c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x024c -> B:10:0x0250). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(ArrayList arrayList, LinkedHashSet linkedHashSet, C1914b c1914b, C2226c c2226c, Object obj, Pd.c cVar) {
        f fVar;
        int i4;
        ArrayList arrayList2;
        aa aaVar;
        vd.e eVar;
        Iterator it;
        sd.e eVar2;
        List list;
        f fVar2;
        C1914b c1914b2;
        vd.e eVar3;
        Object obj2;
        C2226c c2226c2 = c2226c;
        Object obj3 = obj;
        if (cVar instanceof f) {
            f fVar3 = (f) cVar;
            int i5 = fVar3.f12882s;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                fVar3.f12882s = i5 - RecyclerView.UNDEFINED_DURATION;
                fVar = fVar3;
                Object obj4 = fVar.yellow;
                Od.a aVar = Od.a.alpha;
                i4 = fVar.f12882s;
                rg.b bVar = alpha;
                if (i4 == 0) {
                    if (i4 == 1) {
                        C1959a c1959a = fVar.white;
                        Iterator it2 = fVar.teal;
                        list = fVar.silver;
                        sd.e eVar4 = fVar.red;
                        Object obj5 = fVar.purple;
                        C2226c c2226c3 = fVar.alpha;
                        ResultKt.alpha(obj4);
                        fVar2 = fVar;
                        eVar = null;
                        Iterator it3 = it2;
                        obj3 = obj5;
                        eVar2 = eVar4;
                        vd.e eVar5 = (vd.e) obj4;
                        if (eVar5 != null) {
                            bVar.hotel("Converted request body using " + c1959a.alpha + " for " + c2226c3.alpha);
                        }
                        if (eVar5 == null) {
                            eVar3 = eVar5;
                            if (eVar3 == null) {
                                return eVar3;
                            }
                            throw new ContentConverterException("Can't convert " + obj3 + " with contentType " + eVar2 + " using converters " + CollectionsKt.maroon(list, null, null, null, new l(24), 31));
                        }
                        it = it3;
                        c2226c2 = c2226c3;
                        if (!it.hasNext()) {
                            C1959a c1959a2 = (C1959a) it.next();
                            C3337j c3337j = c1959a2.alpha;
                            Charset alpha2 = AbstractC2981d2.alpha(eVar2);
                            if (alpha2 == null) {
                                alpha2 = kotlin.text.a.alpha;
                            }
                            Charset charset = alpha2;
                            c2226c2.getClass();
                            Ed.a aVar2 = (Ed.a) c2226c2.foxtrot.echo(od.h.alpha);
                            Intrinsics.checkNotNull(aVar2);
                            if (!Intrinsics.areEqual(obj3, vd.b.alpha)) {
                                obj2 = obj3;
                            } else {
                                obj2 = eVar;
                            }
                            fVar2.alpha = c2226c2;
                            fVar2.purple = obj3;
                            fVar2.red = eVar2;
                            fVar2.silver = list;
                            fVar2.teal = it;
                            fVar2.white = c1959a2;
                            fVar2.f12882s = 1;
                            Object bravo2 = c3337j.bravo(eVar2, charset, aVar2, obj2, fVar2);
                            if (bravo2 == aVar) {
                                return aVar;
                            }
                            c2226c3 = c2226c2;
                            c1959a = c1959a2;
                            it3 = it;
                            obj4 = bravo2;
                            vd.e eVar52 = (vd.e) obj4;
                            if (eVar52 != null) {
                            }
                            if (eVar52 == null) {
                            }
                        } else {
                            eVar3 = eVar;
                            if (eVar3 == null) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj4);
                    zd.i iVar = c2226c2.foxtrot;
                    C3509a c3509a = charlie;
                    boolean bravo3 = iVar.bravo(c3509a);
                    zd.i iVar2 = c2226c2.foxtrot;
                    if (bravo3) {
                        List list2 = (List) iVar2.charlie(c3509a);
                        arrayList2 = new ArrayList();
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            C1959a c1959a3 = (C1959a) next;
                            if (!list2.isEmpty()) {
                                Iterator it5 = list2.iterator();
                                while (it5.hasNext()) {
                                    if (c1959a3.bravo.zulu((sd.e) it5.next())) {
                                        break;
                                    }
                                }
                            }
                            arrayList2.add(next);
                        }
                    } else {
                        arrayList2 = arrayList;
                    }
                    List list3 = q.alpha;
                    n nVar = c2226c2.charlie;
                    List<String> p4 = nVar.p("Accept");
                    if (p4 == null) {
                        p4 = CollectionsKt.emptyList();
                    }
                    Iterator it6 = arrayList2.iterator();
                    while (true) {
                        boolean hasNext = it6.hasNext();
                        aaVar = c2226c2.alpha;
                        if (!hasNext) {
                            break;
                        }
                        C1959a c1959a4 = (C1959a) it6.next();
                        if (p4 != null && p4.isEmpty()) {
                            c1914b2 = c1914b;
                        } else {
                            for (String str : p4) {
                                sd.e eVar6 = sd.e.white;
                                if (AbstractC2976c2.bravo(str).zulu(c1959a4.bravo)) {
                                    break;
                                }
                            }
                            c1914b2 = c1914b;
                        }
                        ((b) c1914b2.bravo).getClass();
                        sd.e contentType = c1959a4.bravo;
                        bVar.hotel("Adding Accept=" + contentType + " header for " + aaVar);
                        Intrinsics.echo(contentType, "contentType");
                        List list4 = q.alpha;
                        nVar.F("Accept", contentType.toString());
                    }
                    eVar = null;
                    if (!(obj3 instanceof vd.e)) {
                        if (!av.q.kilo(linkedHashSet) || !linkedHashSet.isEmpty()) {
                            Iterator it7 = linkedHashSet.iterator();
                            while (it7.hasNext()) {
                                if (((InterfaceC1772d) it7.next()).november(obj3)) {
                                }
                            }
                        }
                        sd.e bravo4 = AbstractC2991f2.bravo(c2226c2);
                        if (bravo4 == null) {
                            bVar.hotel("Request doesn't have Content-Type header. Skipping ContentNegotiation for " + aaVar + '.');
                            return null;
                        }
                        boolean z2 = obj3 instanceof Unit;
                        Map map = (Map) nVar.alpha;
                        if (z2) {
                            bVar.hotel("Sending empty body for " + aaVar);
                            List list5 = q.alpha;
                            map.remove(CtApi.HEADER_CONTENT_TYPE);
                            return C2464b.alpha;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            Object next2 = it8.next();
                            if (((C1959a) next2).charlie.tango(bravo4)) {
                                arrayList3.add(next2);
                            }
                        }
                        if (arrayList3.isEmpty()) {
                            arrayList3 = null;
                        }
                        if (arrayList3 == null) {
                            bVar.hotel("None of the registered converters match request Content-Type=" + bravo4 + ". Skipping ContentNegotiation for " + aaVar + '.');
                            return null;
                        }
                        if (((Ed.a) iVar2.echo(od.h.alpha)) == null) {
                            bVar.hotel("Request has unknown body type. Skipping ContentNegotiation for " + aaVar + '.');
                            return null;
                        }
                        List list6 = q.alpha;
                        map.remove(CtApi.HEADER_CONTENT_TYPE);
                        it = arrayList3.iterator();
                        ArrayList arrayList4 = arrayList3;
                        eVar2 = bravo4;
                        list = arrayList4;
                        fVar2 = fVar;
                        if (!it.hasNext()) {
                        }
                    }
                    bVar.hotel("Body type " + u.alpha.bravo(obj3.getClass()) + " is in ignored types. Skipping ContentNegotiation for " + aaVar + '.');
                    return null;
                }
            }
        }
        fVar = new Pd.c(cVar);
        Object obj42 = fVar.yellow;
        Od.a aVar3 = Od.a.alpha;
        i4 = fVar.f12882s;
        rg.b bVar2 = alpha;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bravo(LinkedHashSet linkedHashSet, ArrayList arrayList, af afVar, Ed.a aVar, Object obj, sd.e eVar, Charset charset, Pd.c cVar) {
        g gVar;
        Object obj2;
        int i4;
        int collectionSizeOrDefault;
        if (cVar instanceof g) {
            g gVar2 = (g) cVar;
            int i5 = gVar2.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                gVar2.red = i5 - RecyclerView.UNDEFINED_DURATION;
                gVar = gVar2;
                obj2 = gVar.purple;
                Od.a aVar2 = Od.a.alpha;
                i4 = gVar.red;
                rg.b bVar = alpha;
                if (i4 == 0) {
                    if (i4 == 1) {
                        afVar = gVar.alpha;
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    if (!(obj instanceof t)) {
                        bVar.hotel("Response body is already transformed. Skipping ContentNegotiation for " + afVar + '.');
                        return null;
                    }
                    if (linkedHashSet.contains(aVar.alpha)) {
                        bVar.hotel("Response body type " + aVar.alpha + " is in ignored types. Skipping ContentNegotiation for " + afVar + '.');
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (((C1959a) next).charlie.tango(eVar)) {
                            arrayList2.add(next);
                        }
                    }
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
                    ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((C1959a) it2.next()).alpha);
                    }
                    if (arrayList3.isEmpty()) {
                        arrayList3 = null;
                    }
                    if (arrayList3 == null) {
                        bVar.hotel("None of the registered converters match response with Content-Type=" + eVar + ". Skipping ContentNegotiation for " + afVar + '.');
                        return null;
                    }
                    gVar.alpha = afVar;
                    gVar.red = 1;
                    obj2 = W2.alpha(arrayList3, (t) obj, aVar, charset, gVar);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                }
                if (!(obj2 instanceof t)) {
                    bVar.hotel("Response body was converted to " + u.alpha.bravo(obj2.getClass()) + " for " + afVar + '.');
                }
                return obj2;
            }
        }
        gVar = new Pd.c(cVar);
        obj2 = gVar.purple;
        Od.a aVar22 = Od.a.alpha;
        i4 = gVar.red;
        rg.b bVar2 = alpha;
        if (i4 == 0) {
        }
        if (!(obj2 instanceof t)) {
        }
        return obj2;
    }
}
