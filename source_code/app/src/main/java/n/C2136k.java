package n;

import androidx.compose.runtime.t0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2136k implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ h0 purple;

    public /* synthetic */ C2136k(h0 h0Var, int i4) {
        this.alpha = i4;
        this.purple = h0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z2;
        boolean z10;
        D0.g gVar;
        D0.aj ajVar;
        switch (this.alpha) {
            case 0:
                h0 h0Var = this.purple;
                if (h0Var != null) {
                    z2 = ((Boolean) new C2136k(h0Var, 2).invoke()).booleanValue();
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 1:
                h0 h0Var2 = this.purple;
                if (h0Var2 != null) {
                    z10 = ((Boolean) new C2136k(h0Var2, 2).invoke()).booleanValue();
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                h0 h0Var3 = this.purple;
                D0.g gVar2 = h0Var3.bravo;
                D0.ak akVar = (D0.ak) ((t0) h0Var3.alpha).getValue();
                if (akVar != null && (ajVar = akVar.alpha) != null) {
                    gVar = ajVar.alpha;
                } else {
                    gVar = null;
                }
                return Boolean.valueOf(Intrinsics.areEqual(gVar2, gVar));
        }
    }
}
