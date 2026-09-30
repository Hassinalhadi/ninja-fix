package a3;

import J2.t;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import g1.AbstractC1735d;
import java.lang.ref.WeakReference;
import kotlin.Lazy;

/* loaded from: classes3.dex */
public final class n implements ComponentCallbacks2 {
    public final WeakReference alpha;
    public Context purple;
    public W2.f red;
    public boolean silver;
    public boolean teal = true;

    public n(M2.k kVar) {
        this.alpha = new WeakReference(kVar);
    }

    public final synchronized void alpha() {
        W2.f fVar;
        try {
            M2.k kVar = (M2.k) this.alpha.get();
            if (kVar != null) {
                if (this.red == null) {
                    if (kVar.foxtrot.bravo) {
                        Context context = kVar.alpha;
                        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                        if (connectivityManager != null && AbstractC1735d.alpha(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                            try {
                                fVar = new t(connectivityManager, this);
                            } catch (Exception unused) {
                                fVar = new g7.f(11);
                            }
                        } else {
                            fVar = new g7.f(11);
                        }
                    } else {
                        fVar = new g7.f(11);
                    }
                    this.red = fVar;
                    this.teal = fVar.bravo();
                }
            } else {
                bravo();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void bravo() {
        try {
            if (this.silver) {
                return;
            }
            this.silver = true;
            Context context = this.purple;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            W2.f fVar = this.red;
            if (fVar != null) {
                fVar.shutdown();
            }
            this.alpha.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((M2.k) this.alpha.get()) == null) {
            bravo();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i4) {
        V2.b bVar;
        M2.k kVar = (M2.k) this.alpha.get();
        if (kVar != null) {
            Lazy lazy = kVar.charlie;
            if (lazy != null && (bVar = (V2.b) lazy.getValue()) != null) {
                bVar.alpha.alpha(i4);
                bVar.bravo.oscar(i4);
            }
        } else {
            bravo();
        }
    }
}
