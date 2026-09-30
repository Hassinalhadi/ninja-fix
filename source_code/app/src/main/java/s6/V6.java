package s6;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public abstract class V6 {
    public static boolean alpha(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return E2.d.hotel(context);
        }
        return true;
    }

    public static final androidx.compose.runtime.ax bravo(androidx.lifecycle.az azVar, Object obj, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        androidx.lifecycle.al alVar = (androidx.lifecycle.al) c0585q.kilo(R1.e.alpha);
        Object jade = c0585q.jade();
        androidx.compose.runtime.as asVar = C0580l.alpha;
        if (jade == asVar) {
            if (azVar.isInitialized()) {
                obj = azVar.getValue();
            }
            jade = C0564b.zulu(obj);
            c0585q.f(jade);
        }
        androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade;
        boolean india = c0585q.india(azVar) | c0585q.india(alVar);
        Object jade2 = c0585q.jade();
        if (india || jade2 == asVar) {
            jade2 = new Cb.ac(azVar, alVar, axVar, 6);
            c0585q.f(jade2);
        }
        C0564b.charlie(azVar, alVar, (Function1) jade2, c0585q);
        return axVar;
    }
}
