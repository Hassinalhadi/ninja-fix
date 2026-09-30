package h9;

import com.incognia.internal.EP;
import com.incognia.internal.thS;
import kotlin.jvm.functions.Function1;

/* renamed from: h9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1826d implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function1 purple;

    public /* synthetic */ RunnableC1826d(int i4, Function1 function1) {
        this.alpha = i4;
        this.purple = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                EP.b(this.purple);
                return;
            default:
                thS.W(this.purple);
                return;
        }
    }
}
