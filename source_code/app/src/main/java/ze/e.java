package ze;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.u;
import kotlin.collections.y;
import me.m;
import qe.n;
import qe.o;
import ve.v;

/* loaded from: classes2.dex */
public abstract class e {
    public static final Object alpha = y.sierra(new Pair("PACKAGE", EnumSet.noneOf(o.class)), new Pair("TYPE", EnumSet.of(o.CLASS, o.FILE)), new Pair("ANNOTATION_TYPE", EnumSet.of(o.ANNOTATION_CLASS)), new Pair("TYPE_PARAMETER", EnumSet.of(o.TYPE_PARAMETER)), new Pair("FIELD", EnumSet.of(o.FIELD)), new Pair("LOCAL_VARIABLE", EnumSet.of(o.LOCAL_VARIABLE)), new Pair("PARAMETER", EnumSet.of(o.VALUE_PARAMETER)), new Pair("CONSTRUCTOR", EnumSet.of(o.CONSTRUCTOR)), new Pair("METHOD", EnumSet.of(o.FUNCTION, o.PROPERTY_GETTER, o.PROPERTY_SETTER)), new Pair("TYPE_USE", EnumSet.of(o.TYPE)));
    public static final Object bravo = y.sierra(new Pair("RUNTIME", n.alpha), new Pair("CLASS", n.purple), new Pair("SOURCE", n.red));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, java.lang.Object] */
    public static Se.b alpha(List list) {
        int collectionSizeOrDefault;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof v) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) alpha.get(Ne.f.echo(((v) it.next()).bravo.name()).bravo());
            if (iterable == null) {
                iterable = u.alpha;
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, iterable);
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new Se.i(Ne.b.juliet(m.uniform), Ne.f.echo(((o) it2.next()).name())));
        }
        return new Se.b(arrayList3, d.alpha);
    }
}
