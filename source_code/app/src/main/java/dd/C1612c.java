package dd;

import io.ktor.utils.io.t;
import kotlin.jvm.functions.Function1;
import pd.AbstractC2304b;
import sd.m;
import sd.u;
import sd.v;

/* renamed from: dd.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1612c extends AbstractC2304b {
    public final C1610a alpha;
    public final AbstractC2304b purple;
    public final Function1 red;
    public final m silver;
    public final Nd.h teal;

    public C1612c(C1610a c1610a, AbstractC2304b abstractC2304b, Function1 function1, m mVar) {
        this.alpha = c1610a;
        this.purple = abstractC2304b;
        this.red = function1;
        this.silver = mVar;
        this.teal = abstractC2304b.charlie();
    }

    @Override // sd.r
    public final m alpha() {
        return this.silver;
    }

    @Override // pd.AbstractC2304b
    public final C1614e bravo() {
        return this.alpha;
    }

    @Override // vf.ab
    public final Nd.h charlie() {
        return this.teal;
    }

    @Override // pd.AbstractC2304b
    public final t delta() {
        return (t) this.red.invoke(this.purple);
    }

    @Override // pd.AbstractC2304b
    public final Bd.e echo() {
        return this.purple.echo();
    }

    @Override // pd.AbstractC2304b
    public final Bd.e foxtrot() {
        return this.purple.foxtrot();
    }

    @Override // pd.AbstractC2304b
    public final v golf() {
        return this.purple.golf();
    }

    @Override // pd.AbstractC2304b
    public final u hotel() {
        return this.purple.hotel();
    }
}
