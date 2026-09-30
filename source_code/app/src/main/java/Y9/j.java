package Y9;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ k purple;
    public final /* synthetic */ R9.g red;

    public /* synthetic */ j(k kVar, R9.g gVar, int i4) {
        this.alpha = i4;
        this.purple = kVar;
        this.red = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        R9.g gVar = this.red;
        k kVar = this.purple;
        k3.f result = (k3.f) obj;
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(result, "result");
                kVar.getClass();
                k.charlie(result, gVar);
                return Unit.INSTANCE;
            default:
                Intrinsics.echo(result, "result");
                AtomicBoolean atomicBoolean = k.kilo;
                kVar.getClass();
                k.charlie(result, gVar);
                return Unit.INSTANCE;
        }
    }
}
