package s0;

import com.airbnb.lottie.compose.LottieConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2366B;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class B extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(C c3, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = c3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC2366B placementScope;
        switch (this.alpha) {
            case 0:
                C c3 = this.purple;
                ap apVar = c3.white;
                apVar.india = 0;
                J.e zulu = apVar.alpha.zulu();
                Object[] objArr = zulu.alpha;
                int i4 = zulu.red;
                for (int i5 = 0; i5 < i4; i5++) {
                    C c4 = ((al) objArr[i5]).f13306y.papa;
                    c4.f13216a = c4.f13217b;
                    c4.f13217b = LottieConstants.IterateForever;
                    c4.f13227m = false;
                    if (c4.e == ai.purple) {
                        c4.e = ai.red;
                    }
                }
                c3.fuchsia(C2546f.f13337c);
                c3.golf().i().delta();
                al alVar = c3.white.alpha;
                J.e zulu2 = alVar.zulu();
                Object[] objArr2 = zulu2.alpha;
                int i10 = zulu2.red;
                for (int i11 = 0; i11 < i10; i11++) {
                    al alVar2 = (al) objArr2[i11];
                    if (alVar2.f13306y.papa.f13216a != alVar2.whiskey()) {
                        alVar.indigo();
                        alVar.beige();
                        if (alVar2.whiskey() == Integer.MAX_VALUE) {
                            ap apVar2 = alVar2.f13306y;
                            if (apVar2.charlie) {
                                ay ayVar = apVar2.quebec;
                                Intrinsics.checkNotNull(ayVar);
                                ayVar.b(false);
                            }
                            apVar2.papa.d();
                        }
                    }
                }
                c3.fuchsia(C2546f.f13338d);
                return Unit.INSTANCE;
            case 1:
                C c10 = this.purple;
                c10.white.alpha().victor(c10.f13235u);
                return Unit.INSTANCE;
            default:
                C c11 = this.purple;
                L l10 = c11.white.alpha().f13253k;
                ap apVar3 = c11.white;
                if (l10 == null || (placementScope = l10.e) == null) {
                    placementScope = ((C2946x) ao.alpha(apVar3.alpha)).getPlacementScope();
                }
                Function1 function1 = c11.f13240z;
                if (function1 == null) {
                    L alpha = apVar3.alpha();
                    long j5 = c11.A;
                    float f5 = c11.B;
                    placementScope.getClass();
                    AbstractC2366B.charlie(placementScope, alpha);
                    alpha.silver(Q0.k.charlie(j5, alpha.teal), f5, null);
                } else {
                    L alpha2 = apVar3.alpha();
                    long j6 = c11.A;
                    float f10 = c11.B;
                    placementScope.getClass();
                    AbstractC2366B.charlie(placementScope, alpha2);
                    alpha2.silver(Q0.k.charlie(j6, alpha2.teal), f10, function1);
                }
                return Unit.INSTANCE;
        }
    }
}
