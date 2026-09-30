package p3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p3.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2277i implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ab purple;

    public /* synthetic */ C2277i(ab abVar, int i4) {
        this.alpha = i4;
        this.purple = abVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                this.purple.golf = ((Long) obj).longValue();
                return Unit.INSTANCE;
            default:
                Throwable e = (Throwable) obj;
                Intrinsics.echo(e, "e");
                this.purple.alpha.charlie.alpha("LocationFlow", "[COLD_START] Send failed: " + e.getMessage());
                return Unit.INSTANCE;
        }
    }
}
