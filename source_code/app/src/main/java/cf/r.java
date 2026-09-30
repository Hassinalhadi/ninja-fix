package cf;

import A2.aj;
import kotlin.jvm.internal.Intrinsics;
import pe.an;

/* loaded from: classes2.dex */
public final class r extends aj {
    public final Ie.j echo;
    public final r foxtrot;
    public final Ne.b golf;
    public final Ie.i hotel;
    public final boolean india;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Ie.j classProto, Ke.e nameResolver, G6.j jVar, an anVar, r rVar) {
        super(nameResolver, jVar, anVar);
        Intrinsics.echo(classProto, "classProto");
        Intrinsics.echo(nameResolver, "nameResolver");
        this.echo = classProto;
        this.foxtrot = rVar;
        this.golf = Zd.a.alpha(nameResolver, classProto.teal);
        Ie.i iVar = (Ie.i) Ke.d.foxtrot.echo(classProto.silver);
        this.hotel = iVar == null ? Ie.i.CLASS : iVar;
        this.india = Ke.d.golf.echo(classProto.silver).booleanValue();
    }

    @Override // A2.aj
    public final Ne.c foxtrot() {
        return this.golf.bravo();
    }
}
