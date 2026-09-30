package je;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import qe.C2471g;

/* loaded from: classes2.dex */
public final class I extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ J purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(J j5, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = j5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return V.alpha(this.purple, false);
            default:
                J j5 = this.purple;
                se.aj charlie = j5.xray().tango().charlie();
                if (charlie == null) {
                    return Qe.l.golf(j5.xray().tango(), C2471g.alpha);
                }
                return charlie;
        }
    }
}
