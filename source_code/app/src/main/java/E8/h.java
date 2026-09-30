package E8;

import I7.l;
import android.os.Build;
import android.os.StrictMode;
import av.ah;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.session.gauges.GaugeManager;
import i8.InterfaceC1904b;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import z8.C3481b;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements InterfaceC1904b {
    public final /* synthetic */ int alpha;

    public /* synthetic */ h(int i4) {
        this.alpha = i4;
    }

    @Override // i8.InterfaceC1904b
    public final Object get() {
        C3481b lambda$new$0;
        z8.f lambda$new$1;
        switch (this.alpha) {
            case 0:
                Random random = j.juliet;
                return null;
            case 1:
                return Collections.EMPTY_SET;
            case 2:
                return null;
            case 3:
                l lVar = ExecutorsRegistrar.alpha;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i4 = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i4 >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new J7.f(Executors.newFixedThreadPool(4, new J7.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.delta.get());
            case 4:
                l lVar2 = ExecutorsRegistrar.alpha;
                return new J7.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new J7.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.delta.get());
            case 5:
                l lVar3 = ExecutorsRegistrar.alpha;
                return new J7.f(Executors.newCachedThreadPool(new J7.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.delta.get());
            case 6:
                l lVar4 = ExecutorsRegistrar.alpha;
                return Executors.newSingleThreadScheduledExecutor(new J7.a("Firebase Scheduler", 0, null));
            case 7:
                ah ahVar = FirebaseMessaging.kilo;
                return null;
            case 8:
                return Executors.newSingleThreadScheduledExecutor();
            case 9:
                lambda$new$0 = GaugeManager.lambda$new$0();
                return lambda$new$0;
            default:
                lambda$new$1 = GaugeManager.lambda$new$1();
                return lambda$new$1;
        }
    }
}
