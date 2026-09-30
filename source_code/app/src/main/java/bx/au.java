package bx;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class au extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ aw purple;
    public final /* synthetic */ long red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au(aw awVar, long j5, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = awVar;
        this.red = j5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        Function1 function12;
        long j5;
        int ordinal;
        switch (this.alpha) {
            case 0:
                aw awVar = this.purple;
                awVar.getClass();
                int i4 = as.$EnumSwitchMapping$0[((ai) obj).ordinal()];
                long j6 = this.red;
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            ac acVar = ((A) awVar.white).charlie.bravo;
                            if (acVar != null && (function12 = acVar.bravo) != null) {
                                j6 = ((Q0.m) function12.invoke(new Q0.m(j6))).alpha;
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        ac acVar2 = ((ay) awVar.teal).bravo.bravo;
                        if (acVar2 != null && (function1 = acVar2.bravo) != null) {
                            j6 = ((Q0.m) function1.invoke(new Q0.m(j6))).alpha;
                        }
                    }
                }
                return new Q0.m(j6);
            default:
                ai aiVar = (ai) obj;
                aw awVar2 = this.purple;
                if (awVar2.f3425c != null && awVar2.d() != null && !Intrinsics.areEqual(awVar2.f3425c, awVar2.d()) && (ordinal = aiVar.ordinal()) != 0 && ordinal != 1) {
                    if (ordinal == 2) {
                        ac acVar3 = ((A) awVar2.white).charlie.bravo;
                        if (acVar3 != null) {
                            long j7 = this.red;
                            long j10 = ((Q0.m) acVar3.bravo.invoke(new Q0.m(j7))).alpha;
                            T.f d4 = awVar2.d();
                            Intrinsics.checkNotNull(d4);
                            Q0.n nVar = Q0.n.alpha;
                            long alpha = d4.alpha(j7, j10, nVar);
                            T.f fVar = awVar2.f3425c;
                            Intrinsics.checkNotNull(fVar);
                            j5 = Q0.k.bravo(alpha, fVar.alpha(j7, j10, nVar));
                            return new Q0.k(j5);
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                j5 = 0;
                return new Q0.k(j5);
        }
    }
}
