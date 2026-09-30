package h9;

import com.incognia.internal.d7p;
import com.incognia.internal.xIr;
import kotlin.jvm.functions.Function1;

/* renamed from: h9.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1821B implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function1 bravo;
    public final /* synthetic */ xIr charlie;

    public /* synthetic */ C1821B(Function1 function1, xIr xir, int i4) {
        this.alpha = i4;
        this.bravo = function1;
        this.charlie = xir;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                xIr.b(this.bravo, this.charlie);
                return;
            case 1:
                xIr.W(this.bravo, this.charlie);
                return;
            default:
                xIr.f9(this.bravo, this.charlie);
                return;
        }
    }
}
