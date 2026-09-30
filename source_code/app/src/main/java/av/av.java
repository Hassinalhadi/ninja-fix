package av;

import android.hardware.camera2.CameraDevice;
import be.InterfaceC0755a;
import com.clevertap.android.sdk.Constants;
import com.incognia.internal.Czx;
import com.incognia.internal.gzW;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import s6.T7;
import t6.AbstractC3003i;

/* loaded from: classes3.dex */
public final /* synthetic */ class av implements V0.i, InterfaceC0755a, Czx {
    public final /* synthetic */ Object alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ List red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ av(aw awVar, List list, O7.j jVar, aw.v vVar) {
        this.alpha = awVar;
        this.red = list;
        this.silver = jVar;
        this.purple = vVar;
    }

    @Override // be.InterfaceC0755a
    public com.google.common.util.concurrent.e apply(Object obj) {
        aw awVar = (aw) this.alpha;
        CameraDevice cameraDevice = (CameraDevice) this.silver;
        aw.v vVar = (aw.v) this.purple;
        List list = this.red;
        if (awVar.victor.alpha) {
            Iterator it = awVar.bravo.uniform().iterator();
            while (it.hasNext()) {
                ((aw) it.next()).juliet();
            }
        }
        awVar.lima("start openCaptureSession");
        synchronized (awVar.alpha) {
            try {
                if (awVar.mike) {
                    return new be.j(1, new CancellationException("Opener is disabled"));
                }
                awVar.bravo.bronze(awVar);
                V0.k alpha = AbstractC3003i.alpha(new av(awVar, list, new O7.j(cameraDevice, awVar.charlie), vVar));
                awVar.hotel = alpha;
                androidx.core.widget.f fVar = new androidx.core.widget.f(4, awVar);
                alpha.foxtrot(new be.g(0, alpha, fVar), tg.k.bravo());
                return be.h.delta(awVar.hotel);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.incognia.internal.Czx
    public void b(boolean z2, List list) {
        gzW.b((gzW) this.alpha, (Function1) this.silver, (ArrayList) this.purple, this.red, z2, list);
    }

    @Override // V0.i
    public Object black(V0.h hVar) {
        boolean z2;
        String str;
        aw awVar = (aw) this.alpha;
        List list = this.red;
        O7.j jVar = (O7.j) this.silver;
        aw.v vVar = (aw.v) this.purple;
        synchronized (awVar.alpha) {
            awVar.mike(list);
            if (awVar.india == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            T7.golf("The openCaptureSessionCompleter can only set once!", z2);
            awVar.india = hVar;
            ((w.o) jVar.purple).romeo(vVar);
            str = "openCaptureSession[session=" + awVar + Constants.AES_SUFFIX;
        }
        return str;
    }

    public /* synthetic */ av(Object obj, Object obj2, Object obj3, List list) {
        this.alpha = obj;
        this.silver = obj2;
        this.purple = obj3;
        this.red = list;
    }
}
