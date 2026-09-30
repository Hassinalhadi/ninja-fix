package ye;

import kotlin.Pair;

/* loaded from: classes2.dex */
public abstract class u {
    public static final Ne.c alpha;
    public static final Ne.c[] bravo;
    public static final com.google.android.material.internal.ab charlie;
    public static final v delta;

    static {
        Ne.c cVar = new Ne.c("org.jspecify.nullness");
        Ne.c cVar2 = new Ne.c("org.jspecify.annotations");
        alpha = cVar2;
        Ne.c cVar3 = new Ne.c("io.reactivex.rxjava3.annotations");
        Ne.c cVar4 = new Ne.c("org.checkerframework.checker.nullness.compatqual");
        String bravo2 = cVar3.bravo();
        bravo = new Ne.c[]{new Ne.c(bravo2.concat(".Nullable")), new Ne.c(bravo2.concat(".NonNull"))};
        Ne.c cVar5 = new Ne.c("org.jetbrains.annotations");
        v vVar = v.delta;
        Pair pair = new Pair(cVar5, vVar);
        Pair pair2 = new Pair(new Ne.c("androidx.annotation"), vVar);
        Pair pair3 = new Pair(new Ne.c("android.support.annotation"), vVar);
        Pair pair4 = new Pair(new Ne.c("android.annotation"), vVar);
        Pair pair5 = new Pair(new Ne.c("com.android.annotations"), vVar);
        Pair pair6 = new Pair(new Ne.c("org.eclipse.jdt.annotation"), vVar);
        Pair pair7 = new Pair(new Ne.c("org.checkerframework.checker.nullness.qual"), vVar);
        Pair pair8 = new Pair(cVar4, vVar);
        Pair pair9 = new Pair(new Ne.c("javax.annotation"), vVar);
        Pair pair10 = new Pair(new Ne.c("edu.umd.cs.findbugs.annotations"), vVar);
        Pair pair11 = new Pair(new Ne.c("io.reactivex.annotations"), vVar);
        Ne.c cVar6 = new Ne.c("androidx.annotation.RecentlyNullable");
        af afVar = af.WARN;
        Pair pair12 = new Pair(cVar6, new v(afVar, 4));
        Pair pair13 = new Pair(new Ne.c("androidx.annotation.RecentlyNonNull"), new v(afVar, 4));
        Pair pair14 = new Pair(new Ne.c("lombok"), vVar);
        kotlin.g gVar = new kotlin.g(1, 9, 0);
        af afVar2 = af.STRICT;
        charlie = new com.google.android.material.internal.ab(kotlin.collections.y.sierra(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, new Pair(cVar, new v(afVar, gVar, afVar2)), new Pair(cVar2, new v(afVar, new kotlin.g(1, 9, 0), afVar2)), new Pair(cVar3, new v(afVar, new kotlin.g(1, 8, 0), afVar2))));
        delta = new v(afVar, 4);
    }
}
