package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.i implements Function1 {
    public static final l alpha = new kotlin.jvm.internal.i(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MatchResult p02 = (MatchResult) obj;
        Intrinsics.echo(p02, "p0");
        return p02.next();
    }
}
