package S5;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.clevertap.android.sdk.db.Column;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ i purple;

    public /* synthetic */ h(i iVar, int i4) {
        this.alpha = i4;
        this.purple = iVar;
    }

    private final void alpha() {
        i iVar = this.purple;
        synchronized (iVar) {
            if (iVar.alpha == 1) {
                iVar.alpha(1, "Timed out while binding");
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                break;
            case 1:
                alpha();
                return;
            default:
                this.purple.alpha(2, "Service disconnected");
                return;
        }
        while (true) {
            i iVar = this.purple;
            synchronized (iVar) {
                try {
                    if (iVar.alpha == 2) {
                        if (iVar.delta.isEmpty()) {
                            iVar.charlie();
                            return;
                        }
                        j jVar = (j) iVar.delta.poll();
                        iVar.echo.put(jVar.alpha, jVar);
                        ((ScheduledExecutorService) iVar.foxtrot.red).schedule(new be.g(6, iVar, jVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(jVar)));
                        }
                        k kVar = iVar.foxtrot;
                        Messenger messenger = iVar.bravo;
                        int i4 = jVar.charlie;
                        Context context = (Context) kVar.purple;
                        Message obtain = Message.obtain();
                        obtain.what = i4;
                        obtain.arg1 = jVar.alpha;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", jVar.alpha());
                        bundle.putString("pkg", context.getPackageName());
                        bundle.putBundle(Column.DATA, jVar.delta);
                        obtain.setData(bundle);
                        try {
                            J2.c cVar = iVar.charlie;
                            Messenger messenger2 = (Messenger) cVar.purple;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                zzd zzdVar = (zzd) cVar.red;
                                if (zzdVar != null) {
                                    Messenger messenger3 = zzdVar.alpha;
                                    messenger3.getClass();
                                    messenger3.send(obtain);
                                } else {
                                    throw new IllegalStateException("Both messengers are null");
                                }
                            }
                        } catch (RemoteException e) {
                            iVar.alpha(2, e.getMessage());
                        }
                    } else {
                        return;
                    }
                } finally {
                }
            }
        }
    }
}
