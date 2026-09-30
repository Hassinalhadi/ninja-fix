package Y9;

import delivery.samurai.android.services.CaptainLocationMonitoringService;
import k3.C2003b;
import kotlin.jvm.functions.Function1;
import p3.ah;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ k purple;

    public /* synthetic */ i(k kVar, int i4) {
        this.alpha = i4;
        this.purple = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                k kVar = this.purple;
                Function1 function1 = kVar.foxtrot;
                kVar.alpha();
                if (function1 != null) {
                    function1.invoke(Boolean.FALSE);
                    return;
                }
                return;
            default:
                C2003b c2003b = new C2003b("bind_timeout", ((ah) CaptainLocationMonitoringService.f12067E.getValue()).name(), null, 16);
                k kVar2 = this.purple;
                R9.g gVar = kVar2.hotel;
                kVar2.bravo();
                if (gVar != null) {
                    k.charlie(c2003b, gVar);
                    return;
                }
                return;
        }
    }
}
