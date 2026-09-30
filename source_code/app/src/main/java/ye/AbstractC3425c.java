package ye;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* renamed from: ye.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3425c {
    public static final Ne.c alpha = new Ne.c("javax.annotation.meta.TypeQualifierNickname");
    public static final Ne.c bravo = new Ne.c("javax.annotation.meta.TypeQualifier");
    public static final Ne.c charlie = new Ne.c("javax.annotation.meta.TypeQualifierDefault");
    public static final Ne.c delta = new Ne.c("kotlin.annotations.jvm.UnderMigration");
    public static final Object echo;
    public static final LinkedHashMap foxtrot;
    public static final Set golf;

    static {
        EnumC3424b enumC3424b = EnumC3424b.VALUE_PARAMETER;
        List listOf = CollectionsKt.listOf(EnumC3424b.FIELD, EnumC3424b.METHOD_RETURN_TYPE, enumC3424b, EnumC3424b.TYPE_PARAMETER_BOUNDS, EnumC3424b.TYPE_USE);
        Ne.c cVar = ac.charlie;
        Fe.i iVar = Fe.i.red;
        Map sierra = kotlin.collections.y.sierra(new Pair(cVar, new r(new Fe.j(iVar), listOf, false)), new Pair(ac.foxtrot, new r(new Fe.j(iVar), listOf, false)));
        echo = sierra;
        foxtrot = kotlin.collections.y.uniform(kotlin.collections.y.sierra(new Pair(new Ne.c("javax.annotation.ParametersAreNullableByDefault"), new r(new Fe.j(Fe.i.purple), kotlin.collections.ab.juliet(enumC3424b))), new Pair(new Ne.c("javax.annotation.ParametersAreNonnullByDefault"), new r(new Fe.j(iVar), kotlin.collections.ab.juliet(enumC3424b)))), sierra);
        golf = ArraysKt.g(new Ne.c[]{ac.hotel, ac.india});
    }
}
