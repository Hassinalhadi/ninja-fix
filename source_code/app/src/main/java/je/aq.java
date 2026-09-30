package je;

import cf.C0853i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import oe.C2240k;
import pe.InterfaceC2349y;
import s1.C2576i;
import s6.AbstractC2625c5;
import t6.W1;
import ue.C3158b;
import ue.C3161e;
import ve.AbstractC3192d;

/* loaded from: classes2.dex */
public final class aq extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ar purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aq(ar arVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = arVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Iterable] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String[] strArr;
        ?? juliet;
        String[] strArr2;
        switch (this.alpha) {
            case 0:
                ar arVar = this.purple;
                arVar.getClass();
                ge.v vVar = ar.golf[0];
                C3158b c3158b = (C3158b) arVar.charlie.invoke();
                if (c3158b != null) {
                    He.b bVar = c3158b.bravo;
                    String[] strArr3 = (String[]) bVar.foxtrot;
                    if (strArr3 != null && (strArr = (String[]) bVar.hotel) != null) {
                        Pair hotel = Me.h.hotel(strArr3, strArr);
                        return new Triple((Me.g) hotel.first, (Ie.ac) hotel.second, (Me.f) bVar.echo);
                    }
                }
                return null;
            default:
                ar arVar2 = this.purple;
                arVar2.getClass();
                ge.v vVar2 = ar.golf[0];
                C3158b c3158b2 = (C3158b) arVar2.charlie.invoke();
                if (c3158b2 != null) {
                    ge.v vVar3 = ac.bravo[0];
                    Object invoke = arVar2.alpha.invoke();
                    Intrinsics.delta(invoke, "<get-moduleData>(...)");
                    com.bumptech.glide.load.engine.h hVar = ((C3161e) invoke).bravo;
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) hVar.silver;
                    Class cls = c3158b2.alpha;
                    Ne.b alpha = AbstractC3192d.alpha(cls);
                    Object obj = concurrentHashMap.get(alpha);
                    if (obj == null) {
                        Ne.c golf = AbstractC3192d.alpha(cls).golf();
                        Intrinsics.delta(golf, "fileClass.classId.packageFqName");
                        He.b bVar2 = c3158b2.bravo;
                        He.a aVar = He.a.MULTIFILE_CLASS;
                        Ge.e eVar = (Ge.e) hVar.purple;
                        He.a aVar2 = (He.a) bVar2.delta;
                        if (aVar2 == aVar) {
                            List list = null;
                            if (aVar2 == aVar) {
                                strArr2 = (String[]) bVar2.foxtrot;
                            } else {
                                strArr2 = null;
                            }
                            if (strArr2 != null) {
                                list = ArraysKt.sierra(strArr2);
                            }
                            if (list == null) {
                                list = CollectionsKt.emptyList();
                            }
                            juliet = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                Ne.b juliet2 = Ne.b.juliet(new Ne.c(Ve.b.delta((String) it.next()).alpha.replace('/', '.')));
                                Intrinsics.echo((C0853i) eVar.charlie().charlie, "<this>");
                                C3158b bravo = AbstractC2625c5.bravo((C2576i) hVar.red, juliet2, Me.f.golf);
                                if (bravo != null) {
                                    juliet.add(bravo);
                                }
                            }
                        } else {
                            juliet = kotlin.collections.ab.juliet(c3158b2);
                        }
                        C2240k c2240k = new C2240k((InterfaceC2349y) eVar.charlie().bravo, golf, 1);
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = juliet.iterator();
                        while (it2.hasNext()) {
                            ef.p alpha2 = eVar.alpha(c2240k, (C3158b) it2.next());
                            if (alpha2 != null) {
                                arrayList.add(alpha2);
                            }
                        }
                        Xe.n alpha3 = W1.alpha("package " + golf + " (" + c3158b2 + ')', CollectionsKt.z(arrayList));
                        Object putIfAbsent = concurrentHashMap.putIfAbsent(alpha, alpha3);
                        if (putIfAbsent == null) {
                            obj = alpha3;
                        } else {
                            obj = putIfAbsent;
                        }
                    }
                    Intrinsics.delta(obj, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
                    return (Xe.n) obj;
                }
                return Xe.m.bravo;
        }
    }
}
