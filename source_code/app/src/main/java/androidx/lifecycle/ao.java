package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class ao extends Service implements al {
    public final J2.t alpha;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, J2.t] */
    public ao() {
        ?? obj = new Object();
        obj.alpha = new an(this);
        obj.purple = new Handler();
        this.alpha = obj;
    }

    @Override // androidx.lifecycle.al
    public final ac getLifecycle() {
        return (an) this.alpha.alpha;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.echo(intent, "intent");
        J2.t tVar = this.alpha;
        tVar.getClass();
        tVar.tango(aa.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        J2.t tVar = this.alpha;
        tVar.getClass();
        tVar.tango(aa.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        J2.t tVar = this.alpha;
        tVar.getClass();
        tVar.tango(aa.ON_STOP);
        tVar.tango(aa.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i4) {
        J2.t tVar = this.alpha;
        tVar.getClass();
        tVar.tango(aa.ON_START);
        super.onStart(intent, i4);
    }
}
