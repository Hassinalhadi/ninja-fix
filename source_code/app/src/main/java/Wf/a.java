package Wf;

import android.content.Context;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.test.platform.app.InstrumentationRegistry;
import org.jetbrains.compose.resources.AndroidContextProvider;
import t0.AbstractC2913f0;

/* loaded from: classes2.dex */
public abstract class a {
    public static final void alpha(InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1587247798);
        if (i4 == 0 && c0585q.bronze()) {
            c0585q.ochre();
        } else if (((Boolean) c0585q.kilo(AbstractC2913f0.alpha)).booleanValue()) {
            Context context = AndroidContextProvider.alpha;
            AndroidContextProvider.alpha = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new S4.b(i4, 9);
        }
    }

    public static final Context bravo() {
        return InstrumentationRegistry.getInstrumentation().getContext();
    }
}
