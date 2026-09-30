package X9;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ d3.k purple;

    public /* synthetic */ l(d3.k kVar, int i4) {
        this.alpha = i4;
        this.purple = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                this.purple.finishAffinity();
                return Unit.INSTANCE;
            case 1:
                d3.k kVar = this.purple;
                kVar.white.clear();
                kVar.yankee();
                return Unit.INSTANCE;
            case 2:
                d3.k kVar2 = this.purple;
                kVar2.f12054t = false;
                kVar2.finishAffinity();
                return Unit.INSTANCE;
            case 3:
                d3.k kVar3 = this.purple;
                kVar3.f12054t = false;
                kVar3.finishAffinity();
                return Unit.INSTANCE;
            case 4:
                d3.k kVar4 = this.purple;
                kVar4.f12054t = false;
                kVar4.finishAffinity();
                return Unit.INSTANCE;
            case 5:
                this.purple.f12053s = false;
                return Unit.INSTANCE;
            default:
                this.purple.f12052r = false;
                return Unit.INSTANCE;
        }
    }
}
