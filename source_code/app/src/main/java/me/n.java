package me;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public abstract class n {
    public static final Ne.f alpha;
    public static final Ne.f bravo;
    public static final Ne.f charlie;
    public static final Ne.f delta;
    public static final Ne.c echo;
    public static final Ne.c foxtrot;
    public static final Ne.c golf;
    public static final Ne.c hotel;
    public static final Ne.f india;
    public static final Ne.c juliet;
    public static final Ne.c kilo;
    public static final Ne.c lima;
    public static final Ne.c mike;
    public static final Ne.c november;
    public static final Set oscar;

    static {
        Ne.f.echo("field");
        Ne.f.echo("value");
        alpha = Ne.f.echo("values");
        bravo = Ne.f.echo("entries");
        charlie = Ne.f.echo("valueOf");
        Ne.f.echo(Constants.COPY_TYPE);
        Ne.f.echo("hashCode");
        Ne.f.echo("code");
        Ne.f.echo("nextChar");
        delta = Ne.f.echo(Column.COUNT);
        new Ne.c("<dynamic>");
        Ne.c cVar = new Ne.c("kotlin.coroutines");
        echo = cVar;
        new Ne.c("kotlin.coroutines.jvm.internal");
        new Ne.c("kotlin.coroutines.intrinsics");
        foxtrot = cVar.charlie(Ne.f.echo("Continuation"));
        golf = new Ne.c("kotlin.Result");
        Ne.c cVar2 = new Ne.c("kotlin.reflect");
        hotel = cVar2;
        CollectionsKt.listOf("KProperty", "KMutableProperty", "KFunction", "KSuspendFunction");
        Ne.f echo2 = Ne.f.echo("kotlin");
        india = echo2;
        Ne.c juliet2 = Ne.c.juliet(echo2);
        juliet = juliet2;
        Ne.c charlie2 = juliet2.charlie(Ne.f.echo("annotation"));
        kilo = charlie2;
        Ne.c charlie3 = juliet2.charlie(Ne.f.echo("collections"));
        lima = charlie3;
        Ne.c charlie4 = juliet2.charlie(Ne.f.echo("ranges"));
        mike = charlie4;
        juliet2.charlie(Ne.f.echo(Constants.KEY_TEXT));
        Ne.c charlie5 = juliet2.charlie(Ne.f.echo("internal"));
        november = charlie5;
        new Ne.c("error.NonExistentClass");
        oscar = ArraysKt.g(new Ne.c[]{juliet2, charlie3, charlie4, charlie2, cVar2, charlie5, cVar});
    }
}
