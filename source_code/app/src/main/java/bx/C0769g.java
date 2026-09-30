package bx;

import F.C0130l1;
import a0.C0354h;
import a0.C0366t;
import a0.InterfaceC0364r;
import android.content.res.Resources;
import android.os.CancellationSignal;
import androidx.compose.runtime.t0;
import b0.AbstractC0713c;
import bz.C0792q;
import bz.a0;
import cf.C0848d;
import cf.C0850f;
import cf.C0851g;
import cf.InterfaceC0849e;
import com.google.android.gms.internal.measurement.C1298c;
import d0.C1564b;
import ef.C1661i;
import f0.AbstractC1680b;
import g0.C1723c;
import gf.C1791f;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.AbstractC2120h;
import oe.C2233d;
import oe.C2243n;
import oe.C2244o;
import pe.AbstractC2347w;
import pe.InterfaceC2321ad;
import pe.InterfaceC2325ah;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import pe.InterfaceC2349y;
import re.InterfaceC2519c;
import s0.k0;
import s6.A6;
import s6.AbstractC2635d6;
import s6.AbstractC2661g5;
import s6.O5;
import se.C2873w;
import t0.AbstractC2905b0;
import t0.C2907c0;
import t0.C2909d0;
import t0.V;
import vf.C3207k;

/* renamed from: bx.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0769g extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0769g(int i4, Object obj) {
        super(1);
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0132, code lost:
    
        if (r15 != false) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r15v103, types: [java.util.Map, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        D5.s alpha;
        C1661i c1661i;
        InterfaceC2330f charlie;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Set oscar;
        kotlin.reflect.jvm.internal.impl.types.as echo;
        boolean equals;
        Object next;
        Ne.c echo2;
        Object[] objArr = null;
        r2 = false;
        boolean z2 = false;
        int i4 = 0;
        r2 = false;
        boolean z10 = false;
        kotlin.reflect.jvm.internal.impl.types.y yVar = null;
        int i5 = 1;
        Object obj3 = this.purple;
        switch (this.alpha) {
            case 0:
                return Boolean.valueOf(Intrinsics.areEqual(obj, obj3));
            case 1:
                C0792q c0792q = (C0792q) obj;
                float f5 = c0792q.bravo;
                float f10 = 0.0f;
                if (f5 < 0.0f) {
                    f5 = 0.0f;
                }
                float f11 = 1.0f;
                if (f5 > 1.0f) {
                    f5 = 1.0f;
                }
                float f12 = c0792q.charlie;
                float f13 = -0.5f;
                if (f12 < -0.5f) {
                    f12 = -0.5f;
                }
                float f14 = 0.5f;
                if (f12 > 0.5f) {
                    f12 = 0.5f;
                }
                float f15 = c0792q.delta;
                if (f15 >= -0.5f) {
                    f13 = f15;
                }
                if (f13 <= 0.5f) {
                    f14 = f13;
                }
                float f16 = c0792q.alpha;
                if (f16 >= 0.0f) {
                    f10 = f16;
                }
                if (f10 <= 1.0f) {
                    f11 = f10;
                }
                return new C0366t(C0366t.alpha(a0.ao.bravo(f5, f12, f14, f11, b0.d.xray), (AbstractC0713c) obj3));
            case 2:
                return Boolean.valueOf(!Intrinsics.areEqual(obj, ((t0) ((a0) obj3).delta).getValue()));
            case 3:
                Ne.c fqName = (Ne.c) obj;
                Intrinsics.echo(fqName, "fqName");
                C2244o c2244o = (C2244o) obj3;
                df.c charlie2 = c2244o.charlie(fqName);
                if (charlie2 == null) {
                    return null;
                }
                B9.K k6 = c2244o.charlie;
                if (k6 != null) {
                    charlie2.a0(k6);
                    return charlie2;
                }
                Intrinsics.lima("components");
                throw null;
            case 4:
                C0850f key = (C0850f) obj;
                Intrinsics.echo(key, "key");
                C0851g c0851g = (C0851g) obj3;
                c0851g.getClass();
                B9.K k10 = c0851g.alpha;
                Iterator it = ((Iterable) k10.kilo).iterator();
                do {
                    boolean hasNext = it.hasNext();
                    Ne.b bVar = key.alpha;
                    if (hasNext) {
                        charlie = ((InterfaceC2519c) it.next()).charlie(bVar);
                    } else {
                        if (C0851g.charlie.contains(bVar)) {
                            return null;
                        }
                        C0848d c0848d = key.bravo;
                        if (c0848d == null && (c0848d = ((InterfaceC0849e) k10.delta).india(bVar)) == null) {
                            return null;
                        }
                        Ne.b foxtrot = bVar.foxtrot();
                        Ke.a aVar = c0848d.charlie;
                        Ke.e eVar = c0848d.alpha;
                        Ie.j jVar = c0848d.bravo;
                        if (foxtrot != null) {
                            InterfaceC2330f alpha2 = c0851g.alpha(foxtrot, null);
                            if (alpha2 instanceof C1661i) {
                                c1661i = (C1661i) alpha2;
                            } else {
                                c1661i = null;
                            }
                            if (c1661i == null) {
                                return null;
                            }
                            Ne.f india = bVar.india();
                            Intrinsics.delta(india, "classId.shortClassName");
                            if (!c1661i.cyan().mike().contains(india)) {
                                return null;
                            }
                            alpha = c1661i.e;
                        } else {
                            Ne.c golf = bVar.golf();
                            Intrinsics.delta(golf, "classId.packageFqName");
                            Iterator it2 = AbstractC2347w.india((InterfaceC2325ah) k10.foxtrot, golf).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    InterfaceC2321ad interfaceC2321ad = (InterfaceC2321ad) obj2;
                                    if (interfaceC2321ad instanceof df.c) {
                                        df.c cVar = (df.c) interfaceC2321ad;
                                        Ne.f india2 = bVar.india();
                                        Intrinsics.delta(india2, "classId.shortClassName");
                                        cVar.getClass();
                                        if (((ef.o) cVar.olive()).mike().contains(india2)) {
                                        }
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            InterfaceC2321ad interfaceC2321ad2 = (InterfaceC2321ad) obj2;
                            if (interfaceC2321ad2 == null) {
                                return null;
                            }
                            Ie.aw awVar = jVar.f1583x;
                            Intrinsics.delta(awVar, "classProto.typeTable");
                            G6.j jVar2 = new G6.j(awVar);
                            Ke.f fVar = Ke.f.alpha;
                            Ie.D d4 = jVar.f1585z;
                            Intrinsics.delta(d4, "classProto.versionRequirementTable");
                            alpha = c0851g.alpha.alpha(interfaceC2321ad2, eVar, jVar2, AbstractC2635d6.alpha(d4), aVar, null);
                            aVar = aVar;
                        }
                        return new C1661i(alpha, jVar, eVar, aVar, c0848d.delta);
                    }
                } while (charlie == null);
                return charlie;
            case 5:
                Ne.b it3 = (Ne.b) obj;
                Intrinsics.echo(it3, "it");
                ((df.c) obj3).getClass();
                return pe.an.magenta;
            case 6:
                c0.d dVar = (c0.d) obj;
                C1564b c1564b = (C1564b) obj3;
                C0354h c0354h = c1564b.lima;
                if (c1564b.november && c1564b.whiskey && c0354h != null) {
                    J2.t lime = dVar.lime();
                    long oscar2 = lime.oscar();
                    lime.mike().golf();
                    try {
                        ((J2.t) ((av.ah) lime.alpha).purple).mike().kilo(c0354h);
                        c1564b.charlie(dVar);
                    } finally {
                        ao.ad.coral(lime, oscar2);
                    }
                } else {
                    c1564b.charlie(dVar);
                }
                return Unit.INSTANCE;
            case 7:
                ((List) obj3).get(((Number) obj).intValue());
                return null;
            case 8:
                ((AbstractC1680b) obj3).onDraw((c0.d) obj);
                return Unit.INSTANCE;
            case 9:
                g0.ad adVar = (g0.ad) obj;
                C1723c c1723c = (C1723c) obj3;
                c1723c.golf(adVar);
                ?? r02 = c1723c.india;
                if (r02 != 0) {
                    r02.invoke(adVar);
                }
                return Unit.INSTANCE;
            case 10:
                C1791f kotlinTypeRefiner = (C1791f) obj;
                Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
                kotlin.reflect.jvm.internal.impl.types.x xVar = (kotlin.reflect.jvm.internal.impl.types.x) obj3;
                xVar.getClass();
                LinkedHashSet linkedHashSet = xVar.bravo;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    arrayList.add(((kotlin.reflect.jvm.internal.impl.types.y) it4.next()).ivory(kotlinTypeRefiner));
                    objArr = 1;
                }
                if (objArr != null) {
                    kotlin.reflect.jvm.internal.impl.types.y yVar2 = xVar.alpha;
                    if (yVar2 != null) {
                        yVar = yVar2.ivory(kotlinTypeRefiner);
                    }
                    arrayList.isEmpty();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                    linkedHashSet2.hashCode();
                    kotlin.reflect.jvm.internal.impl.types.x xVar2 = new kotlin.reflect.jvm.internal.impl.types.x(linkedHashSet2);
                    xVar2.alpha = yVar;
                    yVar = xVar2;
                }
                if (yVar != null) {
                    xVar = yVar;
                }
                return xVar.bravo();
            case 11:
                kotlin.reflect.jvm.internal.impl.types.ar arVar = (kotlin.reflect.jvm.internal.impl.types.ar) obj;
                pe.aq aqVar = arVar.alpha;
                gd.a aVar2 = (gd.a) obj3;
                aVar2.getClass();
                De.a aVar3 = arVar.bravo;
                Set set = aVar3.echo;
                if (set != null && set.contains(aqVar.alpha())) {
                    return aVar2.delta(aVar3);
                }
                kotlin.reflect.jvm.internal.impl.types.ae oscar3 = aqVar.oscar();
                Intrinsics.delta(oscar3, "typeParameter.defaultType");
                LinkedHashSet<pe.aq> linkedHashSet3 = new LinkedHashSet();
                O5.delta(oscar3, oscar3, linkedHashSet3, set);
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet3, 10);
                int quebec = kotlin.collections.y.quebec(collectionSizeOrDefault2);
                if (quebec < 16) {
                    quebec = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
                for (pe.aq aqVar2 : linkedHashSet3) {
                    if (set != null && set.contains(aqVar2)) {
                        echo = kotlin.reflect.jvm.internal.impl.types.az.lima(aqVar2, aVar3);
                    } else {
                        Set set2 = aVar3.echo;
                        if (set2 != null) {
                            oscar = kotlin.collections.ab.november(set2, aqVar);
                        } else {
                            oscar = kotlin.collections.ab.oscar(aqVar);
                        }
                        echo = U8.a.echo(aqVar2, aVar3, aVar2, aVar2.echo(aqVar2, De.a.alpha(aVar3, 0, false, oscar, null, 47)));
                    }
                    Pair pair = new Pair(aqVar2.tango(), echo);
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                kotlin.reflect.jvm.internal.impl.types.ax axVar = new kotlin.reflect.jvm.internal.impl.types.ax(new kotlin.reflect.jvm.internal.impl.types.ak(i5, linkedHashMap));
                List upperBounds = aqVar.getUpperBounds();
                Intrinsics.delta(upperBounds, "typeParameter.upperBounds");
                Ld.j hotel = aVar2.hotel(axVar, upperBounds, aVar3);
                if (!hotel.alpha.isEmpty()) {
                    if (hotel.alpha.f1833b == 1) {
                        return (kotlin.reflect.jvm.internal.impl.types.y) CollectionsKt.j(hotel);
                    }
                    throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
                }
                return aVar2.delta(aVar3);
            case 12:
                String it5 = (String) obj;
                Intrinsics.echo(it5, "it");
                return Integer.valueOf(((AtomicInteger) ((com.google.android.play.core.integrity.k) obj3).red).getAndIncrement());
            case 13:
                Throwable th = (Throwable) obj;
                m0.af afVar = (m0.af) obj3;
                C3207k c3207k = afVar.red;
                if (c3207k != null) {
                    c3207k.delta(th);
                }
                afVar.red = null;
                return Unit.INSTANCE;
            case 14:
                InterfaceC2328d interfaceC2328d = (InterfaceC2328d) obj;
                if (interfaceC2328d.november() == 1) {
                    ((C2243n) obj3).getClass();
                    InterfaceC2335k lima = interfaceC2328d.lima();
                    Intrinsics.charlie(lima, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    String str = C2233d.alpha;
                    if (C2233d.juliet.containsKey(Qe.e.golf((InterfaceC2330f) lima))) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            case 15:
                InterfaceC2349y module = (InterfaceC2349y) obj;
                Intrinsics.echo(module, "module");
                return module.juliet().hotel(((AbstractC2120h) obj3).tango());
            case 16:
                ((J.e) obj3).bravo((T.q) obj);
                return Boolean.TRUE;
            case 17:
                Ne.c fqName2 = (Ne.c) obj;
                Intrinsics.echo(fqName2, "fqName");
                se.z zVar = (se.z) obj3;
                ((se.ad) zVar.white).getClass();
                ff.l storageManager = zVar.red;
                Intrinsics.echo(storageManager, "storageManager");
                return new C2873w(zVar, fqName2, storageManager);
            case 18:
                return Boolean.valueOf(((bv.aa) obj3).alpha(((A0.s) obj).golf));
            case 19:
                return Boolean.valueOf(t0.ae.bravo((A0.s) obj, (Resources) obj3));
            case 20:
                return new C0130l1(11, (V) obj3);
            case 21:
                if (AbstractC2905b0.bravo.compareAndSet(false, true)) {
                    ((xf.e) obj3).mike(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 22:
                c0.d dVar2 = (c0.d) obj;
                InterfaceC0364r mike = dVar2.lime().mike();
                Xd.l lVar = ((C2907c0) obj3).silver;
                if (lVar != null) {
                    lVar.invoke(mike, (C1564b) dVar2.lime().purple);
                }
                return Unit.INSTANCE;
            case 23:
                I0.o oVar = (I0.o) obj;
                w.v vVar = oVar.bravo;
                if (vVar != null) {
                    oVar.alpha(vVar);
                    oVar.bravo = null;
                }
                C2909d0 c2909d0 = (C2909d0) obj3;
                J.e eVar2 = c2909d0.delta;
                Object[] objArr2 = eVar2.alpha;
                int i10 = eVar2.red;
                while (true) {
                    if (i4 < i10) {
                        if (!Intrinsics.areEqual((k0) objArr2[i4], oVar)) {
                            i4++;
                        }
                    } else {
                        i4 = -1;
                    }
                }
                J.e eVar3 = c2909d0.delta;
                if (i4 >= 0) {
                    eVar3.mike(i4);
                }
                if (eVar3.red == 0) {
                    c2909d0.bravo.invoke();
                }
                return Unit.INSTANCE;
            case 24:
                ((Number) obj).intValue();
                ((C1298c) ((C3.d) obj3).silver).getClass();
                return Unit.INSTANCE;
            case 25:
                Method method = (Method) obj;
                if (!method.isSynthetic()) {
                    if (((ve.q) obj3).alpha.isEnum()) {
                        String name = method.getName();
                        if (Intrinsics.areEqual(name, "values")) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            Intrinsics.delta(parameterTypes, "method.parameterTypes");
                            if (parameterTypes.length == 0) {
                                equals = true;
                                break;
                            }
                            equals = false;
                            break;
                        } else {
                            if (Intrinsics.areEqual(name, "valueOf")) {
                                equals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                                break;
                            }
                            equals = false;
                        }
                    }
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 26:
                InterfaceC2328d it6 = (InterfaceC2328d) obj;
                Intrinsics.echo(it6, "it");
                return Boolean.valueOf(ye.am.india.containsKey(AbstractC2661g5.echo((se.ak) obj3)));
            case 27:
                Ne.c it7 = (Ne.c) obj;
                Intrinsics.delta(it7, "it");
                ?? r15 = ((com.google.android.material.internal.ab) obj3).purple;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : r15.entrySet()) {
                    Ne.c packageName = (Ne.c) entry.getKey();
                    if (!Intrinsics.areEqual(it7, packageName)) {
                        Intrinsics.echo(packageName, "packageName");
                        if (it7.delta()) {
                            echo2 = null;
                        } else {
                            echo2 = it7.echo();
                        }
                        if (Intrinsics.areEqual(echo2, packageName)) {
                        }
                    }
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
                if (linkedHashMap2.isEmpty()) {
                    linkedHashMap2 = null;
                }
                if (linkedHashMap2 == null) {
                    return null;
                }
                Iterator it8 = linkedHashMap2.entrySet().iterator();
                if (!it8.hasNext()) {
                    next = null;
                } else {
                    next = it8.next();
                    if (it8.hasNext()) {
                        int length = A6.alpha((Ne.c) ((Map.Entry) next).getKey(), it7).bravo().length();
                        do {
                            Object next2 = it8.next();
                            int length2 = A6.alpha((Ne.c) ((Map.Entry) next2).getKey(), it7).bravo().length();
                            if (length > length2) {
                                next = next2;
                                length = length2;
                            }
                        } while (it8.hasNext());
                    }
                }
                Map.Entry entry2 = (Map.Entry) next;
                if (entry2 == null) {
                    return null;
                }
                return entry2.getValue();
            default:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj3).cancel();
                }
                return Unit.INSTANCE;
        }
    }
}
