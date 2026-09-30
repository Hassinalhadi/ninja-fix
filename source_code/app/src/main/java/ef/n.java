package ef;

import B9.K;
import Ie.ag;
import Ie.as;
import Ie.y;
import cf.C0853i;
import ge.v;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n {
    public static final /* synthetic */ v[] juliet;
    public final LinkedHashMap alpha;
    public final LinkedHashMap bravo;
    public final LinkedHashMap charlie;
    public final ff.e delta;
    public final ff.e echo;
    public final ff.j foxtrot;
    public final ff.i golf;
    public final ff.i hotel;
    public final /* synthetic */ o india;

    static {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        juliet = new v[]{vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(n.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(n.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
    }

    public n(o oVar, List functionList, List propertyList, List typeAliasList) {
        Intrinsics.echo(functionList, "functionList");
        Intrinsics.echo(propertyList, "propertyList");
        Intrinsics.echo(typeAliasList, "typeAliasList");
        this.india = oVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : functionList) {
            Ne.f bravo = Zd.a.bravo((Ke.e) oVar.bravo.bravo, ((y) ((Oe.v) obj)).white);
            Object obj2 = linkedHashMap.get(bravo);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(bravo, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.alpha = alpha(linkedHashMap);
        o oVar2 = this.india;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : propertyList) {
            Ne.f bravo2 = Zd.a.bravo((Ke.e) oVar2.bravo.bravo, ((ag) ((Oe.v) obj3)).white);
            Object obj4 = linkedHashMap2.get(bravo2);
            if (obj4 == null) {
                obj4 = new ArrayList();
                linkedHashMap2.put(bravo2, obj4);
            }
            ((List) obj4).add(obj3);
        }
        this.bravo = alpha(linkedHashMap2);
        ((C0853i) ((K) this.india.bravo.alpha).charlie).getClass();
        o oVar3 = this.india;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj5 : typeAliasList) {
            Ne.f bravo3 = Zd.a.bravo((Ke.e) oVar3.bravo.bravo, ((as) ((Oe.v) obj5)).teal);
            Object obj6 = linkedHashMap3.get(bravo3);
            if (obj6 == null) {
                obj6 = new ArrayList();
                linkedHashMap3.put(bravo3, obj6);
            }
            ((List) obj6).add(obj5);
        }
        this.charlie = alpha(linkedHashMap3);
        this.delta = ((ff.l) ((K) this.india.bravo.alpha).alpha).charlie(new m(this, 0));
        this.echo = ((ff.l) ((K) this.india.bravo.alpha).alpha).charlie(new m(this, 1));
        this.foxtrot = ((ff.l) ((K) this.india.bravo.alpha).alpha).delta(new m(this, 2));
        o oVar4 = this.india;
        this.golf = ((ff.l) ((K) oVar4.bravo.alpha).alpha).bravo(new l(this, oVar4, 0));
        o oVar5 = this.india;
        this.hotel = ((ff.l) ((K) oVar5.bravo.alpha).alpha).bravo(new l(this, oVar5, 1));
    }

    public static LinkedHashMap alpha(LinkedHashMap linkedHashMap) {
        int collectionSizeOrDefault;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.y.quebec(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<Oe.b> iterable = (Iterable) entry.getValue();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Oe.b bVar : iterable) {
                int delta = bVar.delta();
                int golf = F0.e.golf(delta) + delta;
                if (golf > 4096) {
                    golf = 4096;
                }
                F0.e romeo = F0.e.romeo(byteArrayOutputStream, golf);
                romeo.coral(delta);
                bVar.echo(romeo);
                romeo.juliet();
                arrayList.add(Unit.INSTANCE);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }
}
