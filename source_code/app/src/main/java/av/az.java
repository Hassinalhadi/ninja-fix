package av;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import androidx.camera.core.CameraControl$OperationCanceledException;
import s6.AbstractC2647f0;

/* loaded from: classes3.dex */
public final /* synthetic */ class az implements Runnable {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ az(Context context, boolean z2, G6.h hVar) {
        this.red = context;
        this.purple = z2;
        this.silver = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        String notificationDelegate;
        switch (this.alpha) {
            case 0:
                A a6 = (A) this.red;
                V0.h hVar = (V0.h) this.silver;
                boolean z10 = this.purple;
                if (!a6.charlie) {
                    if (hVar != null) {
                        hVar.delta(new IllegalStateException("No flash unit"));
                        return;
                    }
                    return;
                }
                boolean z11 = a6.echo;
                androidx.lifecycle.az azVar = a6.bravo;
                if (!z11) {
                    A.alpha(azVar, 0);
                    if (hVar != null) {
                        hVar.delta(new CameraControl$OperationCanceledException("Camera is not active."));
                        return;
                    }
                    return;
                }
                a6.golf = z10;
                a6.alpha.charlie(z10);
                A.alpha(azVar, Integer.valueOf(z10 ? 1 : 0));
                V0.h hVar2 = a6.foxtrot;
                if (hVar2 != null) {
                    hVar2.delta(new CameraControl$OperationCanceledException("There is a new enableTorch being set"));
                }
                a6.foxtrot = hVar;
                return;
            default:
                Context context = (Context) this.red;
                G6.h hVar3 = (G6.h) this.silver;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    } else {
                        SharedPreferences.Editor edit = AbstractC2647f0.alpha(context).edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (this.purple) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else {
                            notificationDelegate = notificationManager.getNotificationDelegate();
                            if ("com.google.android.gms".equals(notificationDelegate)) {
                                notificationManager.setNotificationDelegate(null);
                            }
                        }
                    }
                    return;
                } finally {
                    hVar3.delta(null);
                }
        }
    }

    public /* synthetic */ az(A a6, V0.h hVar, boolean z2) {
        this.red = a6;
        this.silver = hVar;
        this.purple = z2;
    }
}
