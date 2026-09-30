package je;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import se.C2871u;

/* loaded from: classes2.dex */
public final class au extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ av purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au(av avVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = avVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return a0.delta(this.purple.golf());
            default:
                av avVar = this.purple;
                pe.aj golf = avVar.golf();
                boolean z2 = golf instanceof C2871u;
                r rVar = avVar.alpha;
                if (z2 && Intrinsics.areEqual(a0.golf(rVar.tango()), golf) && rVar.tango().november() == 2) {
                    InterfaceC2335k lima = rVar.tango().lima();
                    Intrinsics.charlie(lima, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class juliet = a0.juliet((InterfaceC2330f) lima);
                    if (juliet == null) {
                        throw new Q("Cannot determine receiver Java type of inherited declaration: " + golf);
                    }
                    return juliet;
                }
                return (Type) rVar.quebec().alpha().get(avVar.purple);
        }
    }
}
