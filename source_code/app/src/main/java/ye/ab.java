package ye;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes2.dex */
public abstract class ab {
    public static final Ne.c alpha;
    public static final Ne.f bravo;
    public static final Ne.c charlie;
    public static final Ne.c delta;
    public static final Ne.c echo;
    public static final Ne.c foxtrot;
    public static final Ne.c golf;
    public static final Ne.c hotel;
    public static final Ne.c india;
    public static final Ne.c juliet;
    public static final Ne.c kilo;
    public static final Ne.c lima;
    public static final Ne.c mike;
    public static final Ne.c november;
    public static final Ne.c oscar;
    public static final Ne.c papa;
    public static final Ne.c quebec;

    static {
        Ne.c cVar = new Ne.c("kotlin.Metadata");
        alpha = cVar;
        Ve.b.charlie(cVar).echo();
        bravo = Ne.f.echo("value");
        charlie = new Ne.c(Target.class.getName());
        new Ne.c(ElementType.class.getName());
        delta = new Ne.c(Retention.class.getName());
        new Ne.c(RetentionPolicy.class.getName());
        echo = new Ne.c(Deprecated.class.getName());
        foxtrot = new Ne.c(Documented.class.getName());
        golf = new Ne.c("java.lang.annotation.Repeatable");
        hotel = new Ne.c("org.jetbrains.annotations.NotNull");
        india = new Ne.c("org.jetbrains.annotations.Nullable");
        juliet = new Ne.c("org.jetbrains.annotations.Mutable");
        kilo = new Ne.c("org.jetbrains.annotations.ReadOnly");
        lima = new Ne.c("kotlin.annotations.jvm.ReadOnly");
        mike = new Ne.c("kotlin.annotations.jvm.Mutable");
        november = new Ne.c("kotlin.jvm.PurelyImplements");
        new Ne.c("kotlin.jvm.internal");
        Ne.c cVar2 = new Ne.c("kotlin.jvm.internal.SerializedIr");
        oscar = cVar2;
        Ve.b.charlie(cVar2).echo();
        papa = new Ne.c("kotlin.jvm.internal.EnhancedNullability");
        quebec = new Ne.c("kotlin.jvm.internal.EnhancedMutability");
    }
}
