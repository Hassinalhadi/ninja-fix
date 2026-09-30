package N9;

import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import xf.EnumC3340a;
import yf.InterfaceC3439i;
import yf.ae;

/* loaded from: classes2.dex */
public final class l implements q3.e {
    public final j alpha;
    public final p bravo;
    public final Set charlie;

    public l(j jVar, p pVar, Set firebaseKeys) {
        Intrinsics.echo(firebaseKeys, "firebaseKeys");
        this.alpha = jVar;
        this.bravo = pVar;
        this.charlie = firebaseKeys;
    }

    @Override // q3.e
    public final void alpha(String userId, Ld.g gVar) {
        Intrinsics.echo(userId, "userId");
        this.bravo.alpha(userId, gVar);
    }

    @Override // q3.e
    public final void bravo() {
        this.bravo.bravo();
    }

    @Override // q3.e
    public final Boolean charlie(String str) {
        return golf(str).charlie(str);
    }

    @Override // q3.e
    public final Long delta(String str) {
        return golf(str).delta(str);
    }

    @Override // q3.e
    public final String echo(String str) {
        return golf(str).echo(str);
    }

    @Override // q3.e
    public final InterfaceC3439i foxtrot() {
        InterfaceC3439i[] interfaceC3439iArr = {this.alpha.foxtrot(), this.bravo.foxtrot()};
        int i4 = ae.alpha;
        return new zf.p(ArraysKt.romeo(interfaceC3439iArr), Nd.i.alpha, -2, EnumC3340a.alpha);
    }

    public final q3.e golf(String str) {
        if (this.charlie.contains(str)) {
            return this.alpha;
        }
        return this.bravo;
    }
}
