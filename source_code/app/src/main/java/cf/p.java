package cf;

import A2.aj;
import B9.K;
import Ie.ay;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class p extends Lambda implements Function0 {
    public final /* synthetic */ q alpha;
    public final /* synthetic */ aj purple;
    public final /* synthetic */ Oe.l red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ ay white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, aj ajVar, Oe.l lVar, int i4, int i5, ay ayVar) {
        super(0);
        this.alpha = qVar;
        this.purple = ajVar;
        this.red = lVar;
        this.silver = i4;
        this.teal = i5;
        this.white = ayVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CollectionsKt.z(((InterfaceC0845a) ((K) this.alpha.alpha.alpha).echo).alpha(this.purple, this.red, this.silver, this.teal, this.white));
    }
}
