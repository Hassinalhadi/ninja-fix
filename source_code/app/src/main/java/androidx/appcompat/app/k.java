package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import bv.C0762a;
import f1.AbstractC1686f;
import j2.AbstractC1936c;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Context purple;

    public /* synthetic */ k(Context context, int i4) {
        this.alpha = i4;
        this.purple = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        o1.e eVar;
        Object obj;
        Context context;
        switch (this.alpha) {
            case 0:
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 33) {
                    Context context2 = this.purple;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i4 >= 33) {
                            bv.f fVar = o.yellow;
                            fVar.getClass();
                            C0762a c0762a = new C0762a(fVar);
                            while (true) {
                                if (c0762a.hasNext()) {
                                    o oVar = (o) ((WeakReference) c0762a.next()).get();
                                    if (oVar != null && (context = ((ab) oVar).f2728d) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                eVar = new o1.e(new o1.h(m.alpha(obj)));
                                if (eVar.alpha.isEmpty()) {
                                    String echo = AbstractC1686f.echo(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        m.bravo(systemService, l.alpha(echo));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            eVar = o1.e.bravo;
                            if (eVar.alpha.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        } else {
                            eVar = o.red;
                            break;
                        }
                    }
                }
                o.white = true;
                return;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new k(this.purple, 2));
                return;
            default:
                AbstractC1936c.tango(this.purple, new ap.a(1), AbstractC1936c.alpha, false);
                return;
        }
    }
}
