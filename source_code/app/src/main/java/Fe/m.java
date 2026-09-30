package Fe;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public abstract class m {
    public static final f alpha = new f(i.purple, false);
    public static final f bravo;
    public static final f charlie;
    public static final LinkedHashMap delta;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    static {
        i iVar = i.red;
        bravo = new f(iVar, false);
        charlie = new f(iVar, true);
        String concat = "java/lang/".concat("Object");
        String concat2 = "java/util/function/".concat("Predicate");
        String concat3 = "java/util/function/".concat("Function");
        String concat4 = "java/util/function/".concat("Consumer");
        String concat5 = "java/util/function/".concat("BiFunction");
        String concat6 = "java/util/function/".concat("BiConsumer");
        String concat7 = "java/util/function/".concat("UnaryOperator");
        String concat8 = "java/util/".concat("stream/Stream");
        String concat9 = "java/util/".concat("Optional");
        t tVar = new t(0);
        new J2.c(tVar, "java/util/".concat("Iterator")).oscar("forEachRemaining", new A0.q(concat4, 5));
        new J2.c(tVar, "java/lang/".concat("Iterable")).oscar("spliterator", new Lambda(1));
        J2.c cVar = new J2.c(tVar, "java/util/".concat("Collection"));
        cVar.oscar("removeIf", new A0.q(concat2, 11));
        cVar.oscar("stream", new A0.q(concat8, 12));
        cVar.oscar("parallelStream", new A0.q(concat8, 13));
        new J2.c(tVar, "java/util/".concat("List")).oscar("replaceAll", new A0.q(concat7, 14));
        J2.c cVar2 = new J2.c(tVar, "java/util/".concat("Map"));
        cVar2.oscar("forEach", new A0.q(concat6, 15));
        cVar2.oscar("putIfAbsent", new A0.q(concat, 16));
        cVar2.oscar("replace", new A0.q(concat, 17));
        cVar2.oscar("replace", new A0.q(concat, 18));
        cVar2.oscar("replaceAll", new A0.q(concat5, 19));
        cVar2.oscar("compute", new l(concat, concat5, 0));
        cVar2.oscar("computeIfAbsent", new l(concat, concat3, 1));
        cVar2.oscar("computeIfPresent", new l(concat, concat5, 2));
        cVar2.oscar("merge", new l(concat, concat5, 3));
        J2.c cVar3 = new J2.c(tVar, concat9);
        cVar3.oscar("empty", new A0.q(concat9, 20));
        cVar3.oscar("of", new l(concat, concat9, 4));
        cVar3.oscar("ofNullable", new l(concat, concat9, 5));
        cVar3.oscar("get", new A0.q(concat, 21));
        cVar3.oscar("ifPresent", new A0.q(concat4, 22));
        new J2.c(tVar, "java/lang/".concat("ref/Reference")).oscar("get", new A0.q(concat, 23));
        new J2.c(tVar, concat2).oscar("test", new A0.q(concat, 24));
        new J2.c(tVar, "java/util/function/".concat("BiPredicate")).oscar("test", new A0.q(concat, 25));
        new J2.c(tVar, concat4).oscar("accept", new A0.q(concat, 6));
        new J2.c(tVar, concat6).oscar("accept", new A0.q(concat, 7));
        new J2.c(tVar, concat3).oscar("apply", new A0.q(concat, 8));
        new J2.c(tVar, concat5).oscar("apply", new A0.q(concat, 9));
        new J2.c(tVar, "java/util/function/".concat("Supplier")).oscar("get", new A0.q(concat, 10));
        delta = tVar.alpha;
    }
}
