package je;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: je.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1964c {
    public static final gd.a alpha = AbstractC1962a.alpha(C1963b.teal);
    public static final gd.a bravo = AbstractC1962a.alpha(C1963b.white);
    public static final gd.a charlie = AbstractC1962a.alpha(C1963b.purple);
    public static final gd.a delta = AbstractC1962a.alpha(C1963b.silver);
    public static final gd.a echo = AbstractC1962a.alpha(C1963b.red);

    public static final C1986z alpha(Class jClass) {
        Intrinsics.echo(jClass, "jClass");
        Object charlie2 = alpha.charlie(jClass);
        Intrinsics.charlie(charlie2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (C1986z) charlie2;
    }
}
