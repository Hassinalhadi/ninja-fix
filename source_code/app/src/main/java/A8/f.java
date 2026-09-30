package A8;

import android.content.Context;
import android.content.pm.PackageManager;
import i8.InterfaceC1904b;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import r8.C2508c;
import s8.C2837a;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ h purple;

    public /* synthetic */ f(h hVar, int i4) {
        this.alpha = i4;
        this.purple = hVar;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [s8.f, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        s8.f fVar;
        String str;
        switch (this.alpha) {
            case 0:
                h hVar = this.purple;
                e eVar = hVar.e;
                boolean z2 = hVar.f27j;
                eVar.delta.alpha(z2);
                eVar.echo.alpha(z2);
                return;
            default:
                h hVar2 = this.purple;
                B7.g gVar = hVar2.silver;
                gVar.alpha();
                Context context = gVar.alpha;
                hVar2.f21c = context;
                hVar2.f25h = context.getPackageName();
                hVar2.f22d = C2837a.echo();
                hVar2.e = new e(hVar2.f21c, new B8.h(100L, 1L, TimeUnit.MINUTES));
                hVar2.f23f = C2508c.alpha();
                InterfaceC1904b interfaceC1904b = hVar2.yellow;
                C2837a c2837a = hVar2.f22d;
                c2837a.getClass();
                s8.f fVar2 = s8.f.alpha;
                synchronized (s8.f.class) {
                    try {
                        if (s8.f.alpha == null) {
                            s8.f.alpha = new Object();
                        }
                        fVar = s8.f.alpha;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                fVar.getClass();
                Long l10 = (Long) c2837a.alpha.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
                l10.getClass();
                Map map = s8.f.bravo;
                if (map.containsKey(l10) && (str = (String) map.get(l10)) != null) {
                    c2837a.charlie.foxtrot("com.google.firebase.perf.LogSourceName", str);
                } else {
                    B8.e delta = c2837a.delta(fVar);
                    if (delta.bravo()) {
                        str = (String) delta.alpha();
                    } else {
                        str = "FIREPERF";
                    }
                }
                hVar2.f19a = new b(interfaceC1904b, str);
                hVar2.f23f.delta(new WeakReference(h.f18l));
                C8.e black = C8.g.black();
                hVar2.f24g = black;
                B7.g gVar2 = hVar2.silver;
                gVar2.alpha();
                String str2 = gVar2.charlie.bravo;
                black.india();
                C8.g.sierra((C8.g) black.purple, str2);
                C8.a yankee = C8.b.yankee();
                String str3 = hVar2.f25h;
                yankee.india();
                C8.b.sierra((C8.b) yankee.purple, str3);
                yankee.india();
                C8.b.tango((C8.b) yankee.purple);
                Context context2 = hVar2.f21c;
                String str4 = "";
                try {
                    String str5 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str5 != null) {
                        str4 = str5;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                yankee.india();
                C8.b.uniform((C8.b) yankee.purple, str4);
                black.india();
                C8.g.whiskey((C8.g) black.purple, (C8.b) yankee.golf());
                hVar2.red.set(true);
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = hVar2.purple;
                    if (!concurrentLinkedQueue.isEmpty()) {
                        c cVar = (c) concurrentLinkedQueue.poll();
                        if (cVar != null) {
                            hVar2.f20b.execute(new g(0, hVar2, cVar));
                        }
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
