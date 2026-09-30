package k0;

import T.r;
import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class e extends r implements InterfaceC1997d {
    public Function1 alpha;
    public Function1 purple;

    @Override // k0.InterfaceC1997d
    public final boolean delta(KeyEvent keyEvent) {
        Function1 function1 = this.purple;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new C1995b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // k0.InterfaceC1997d
    public final boolean victor(KeyEvent keyEvent) {
        Function1 function1 = this.alpha;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new C1995b(keyEvent))).booleanValue();
        }
        return false;
    }
}
