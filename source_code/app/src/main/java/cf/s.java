package cf;

import A2.aj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s extends aj {
    public final Ne.c echo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Ne.c fqName, Ke.e nameResolver, G6.j jVar, Ge.g gVar) {
        super(nameResolver, jVar, gVar);
        Intrinsics.echo(fqName, "fqName");
        Intrinsics.echo(nameResolver, "nameResolver");
        this.echo = fqName;
    }

    @Override // A2.aj
    public final Ne.c foxtrot() {
        return this.echo;
    }
}
