package ye;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public abstract class ac {
    public static final Ne.c alpha;
    public static final Ne.c bravo;
    public static final Ne.c charlie;
    public static final Ne.c delta;
    public static final Ne.c echo;
    public static final Ne.c foxtrot;
    public static final List golf;
    public static final Ne.c hotel;
    public static final Ne.c india;
    public static final List juliet;
    public static final Ne.c kilo;
    public static final Ne.c lima;
    public static final Ne.c mike;
    public static final Ne.c november;
    public static final Set oscar;
    public static final Set papa;

    static {
        Ne.c cVar = new Ne.c("org.jspecify.nullness.Nullable");
        alpha = cVar;
        bravo = new Ne.c("org.jspecify.nullness.NullnessUnspecified");
        Ne.c cVar2 = new Ne.c("org.jspecify.nullness.NullMarked");
        charlie = cVar2;
        Ne.c cVar3 = new Ne.c("org.jspecify.annotations.Nullable");
        delta = cVar3;
        echo = new Ne.c("org.jspecify.annotations.NullnessUnspecified");
        Ne.c cVar4 = new Ne.c("org.jspecify.annotations.NullMarked");
        foxtrot = cVar4;
        List listOf = CollectionsKt.listOf(ab.india, new Ne.c("androidx.annotation.Nullable"), new Ne.c("androidx.annotation.Nullable"), new Ne.c("android.annotation.Nullable"), new Ne.c("com.android.annotations.Nullable"), new Ne.c("org.eclipse.jdt.annotation.Nullable"), new Ne.c("org.checkerframework.checker.nullness.qual.Nullable"), new Ne.c("javax.annotation.Nullable"), new Ne.c("javax.annotation.CheckForNull"), new Ne.c("edu.umd.cs.findbugs.annotations.CheckForNull"), new Ne.c("edu.umd.cs.findbugs.annotations.Nullable"), new Ne.c("edu.umd.cs.findbugs.annotations.PossiblyNull"), new Ne.c("io.reactivex.annotations.Nullable"), new Ne.c("io.reactivex.rxjava3.annotations.Nullable"));
        golf = listOf;
        Ne.c cVar5 = new Ne.c("javax.annotation.Nonnull");
        hotel = cVar5;
        india = new Ne.c("javax.annotation.CheckForNull");
        List listOf2 = CollectionsKt.listOf(ab.hotel, new Ne.c("edu.umd.cs.findbugs.annotations.NonNull"), new Ne.c("androidx.annotation.NonNull"), new Ne.c("androidx.annotation.NonNull"), new Ne.c("android.annotation.NonNull"), new Ne.c("com.android.annotations.NonNull"), new Ne.c("org.eclipse.jdt.annotation.NonNull"), new Ne.c("org.checkerframework.checker.nullness.qual.NonNull"), new Ne.c("lombok.NonNull"), new Ne.c("io.reactivex.annotations.NonNull"), new Ne.c("io.reactivex.rxjava3.annotations.NonNull"));
        juliet = listOf2;
        Ne.c cVar6 = new Ne.c("org.checkerframework.checker.nullness.compatqual.NullableDecl");
        kilo = cVar6;
        Ne.c cVar7 = new Ne.c("org.checkerframework.checker.nullness.compatqual.NonNullDecl");
        lima = cVar7;
        Ne.c cVar8 = new Ne.c("androidx.annotation.RecentlyNullable");
        mike = cVar8;
        Ne.c cVar9 = new Ne.c("androidx.annotation.RecentlyNonNull");
        november = cVar9;
        kotlin.collections.ab.november(kotlin.collections.ab.november(kotlin.collections.ab.november(kotlin.collections.ab.november(kotlin.collections.ab.november(kotlin.collections.ab.november(kotlin.collections.ab.november(kotlin.collections.ab.november(kotlin.collections.ab.mike(kotlin.collections.ab.november(kotlin.collections.ab.mike(new LinkedHashSet(), listOf), cVar5), listOf2), cVar6), cVar7), cVar8), cVar9), cVar), cVar2), cVar3), cVar4);
        oscar = ArraysKt.g(new Ne.c[]{ab.kilo, ab.lima});
        papa = ArraysKt.g(new Ne.c[]{ab.juliet, ab.mike});
        kotlin.collections.y.sierra(new Pair(ab.charlie, me.m.tango), new Pair(ab.delta, me.m.whiskey), new Pair(ab.echo, me.m.mike), new Pair(ab.foxtrot, me.m.xray));
    }
}
