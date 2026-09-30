package yd;

import Pf.aa;
import Pf.p;
import Pf.q;
import Pf.u;
import Xd.l;
import androidx.datastore.preferences.protobuf.E;
import io.ktor.utils.io.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import okhttp3.internal.http2.Http2;
import pf.AbstractC2360j;
import t6.AbstractC3012j3;
import vf.ab;

/* renamed from: yd.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3418b extends Pd.i implements l {
    public final /* synthetic */ t alpha;
    public final /* synthetic */ Ed.a purple;
    public final /* synthetic */ Of.d red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3418b(t tVar, Ed.a aVar, Of.d dVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = tVar;
        this.purple = aVar;
        this.red = dVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3418b(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3418b) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Of.b bVar;
        Object qVar;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        t tVar = this.alpha;
        Intrinsics.echo(tVar, "<this>");
        Hd.b bVar2 = new Hd.b(0, tVar);
        Ed.a alpha = E.alpha(this.purple);
        Of.d dVar = this.red;
        KSerializer delta = AbstractC3012j3.delta(dVar.bravo, alpha);
        Of.b bVar3 = Of.b.alpha;
        aa aaVar = new aa(new O7.l(bVar2), new char[Http2.INITIAL_MAX_FRAME_SIZE]);
        if (aaVar.whiskey() == 8) {
            aaVar.golf((byte) 8);
            bVar = Of.b.purple;
        } else {
            bVar = Of.b.alpha;
        }
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.");
            }
            qVar = new p(dVar, aaVar, delta);
        } else {
            qVar = new q(dVar, aaVar, delta);
        }
        return AbstractC2360j.delta(new u(0, qVar));
    }
}
