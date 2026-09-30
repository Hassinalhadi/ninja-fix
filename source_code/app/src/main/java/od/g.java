package od;

import gd.k;
import kotlin.jvm.internal.Intrinsics;
import sd.u;
import sd.v;

/* loaded from: classes2.dex */
public final class g {
    public final v alpha;
    public final Bd.e bravo;
    public final k charlie;
    public final u delta;
    public final Object echo;
    public final Nd.h foxtrot;
    public final Bd.e golf;

    public g(v vVar, Bd.e requestTime, k kVar, u version, Object body, Nd.h callContext) {
        Intrinsics.echo(requestTime, "requestTime");
        Intrinsics.echo(version, "version");
        Intrinsics.echo(body, "body");
        Intrinsics.echo(callContext, "callContext");
        this.alpha = vVar;
        this.bravo = requestTime;
        this.charlie = kVar;
        this.delta = version;
        this.echo = body;
        this.foxtrot = callContext;
        this.golf = Bd.a.alpha(null);
    }

    public final String toString() {
        return "HttpResponseData=(statusCode=" + this.alpha + ')';
    }
}
