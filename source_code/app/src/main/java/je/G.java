package je;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import qe.C2471g;

/* loaded from: classes2.dex */
public final class G extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ H purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(H h4, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = h4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return V.alpha(this.purple, true);
            default:
                H h4 = this.purple;
                se.ai bravo = h4.xray().tango().bravo();
                if (bravo == null) {
                    return Qe.l.foxtrot(h4.xray().tango(), C2471g.alpha);
                }
                return bravo;
        }
    }
}
