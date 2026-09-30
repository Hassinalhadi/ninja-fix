package V5;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
public final class y extends com.google.android.gms.internal.measurement.ai {
    public final /* synthetic */ e alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(e eVar, Looper looper) {
        super(looper, 3);
        this.alpha = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r0 == 5) goto L18;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.alpha.whiskey.get() != message.arg1) {
            int i4 = message.what;
            if (i4 != 2 && i4 != 1 && i4 != 7) {
                return;
            }
            r rVar = (r) message.obj;
            rVar.getClass();
            rVar.delta();
            return;
        }
        int i5 = message.what;
        if (i5 != 1 && i5 != 7) {
            if (i5 == 4) {
                this.alpha.getClass();
            }
        }
        if (!this.alpha.charlie()) {
            r rVar2 = (r) message.obj;
            rVar2.getClass();
            rVar2.delta();
            return;
        }
        int i10 = message.what;
        PendingIntent pendingIntent = null;
        if (i10 == 4) {
            e eVar = this.alpha;
            eVar.tango = new ConnectionResult(message.arg2);
            if (!eVar.uniform && !TextUtils.isEmpty(eVar.uniform()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(eVar.uniform());
                    e eVar2 = this.alpha;
                    if (!eVar2.uniform) {
                        eVar2.azure(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            e eVar3 = this.alpha;
            ConnectionResult connectionResult = eVar3.tango;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8);
            }
            eVar3.juliet.alpha(connectionResult);
            this.alpha.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i10 == 5) {
            e eVar4 = this.alpha;
            ConnectionResult connectionResult2 = eVar4.tango;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8);
            }
            eVar4.juliet.alpha(connectionResult2);
            this.alpha.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i10 == 3) {
            Object obj = message.obj;
            if (obj instanceof PendingIntent) {
                pendingIntent = (PendingIntent) obj;
            }
            this.alpha.juliet.alpha(new ConnectionResult(message.arg2, pendingIntent));
            this.alpha.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i10 == 6) {
            this.alpha.azure(5, null);
            b bVar = this.alpha.oscar;
            if (bVar != null) {
                bVar.bravo(message.arg2);
            }
            this.alpha.xray();
            e.amber(this.alpha, 5, 1, null);
            return;
        }
        if (i10 == 2 && !this.alpha.golf()) {
            r rVar3 = (r) message.obj;
            rVar3.getClass();
            rVar3.delta();
            return;
        }
        int i11 = message.what;
        if (i11 != 2 && i11 != 1 && i11 != 7) {
            Log.wtf("GmsClient", ao.ad.zulu(i11, "Don't know how to handle message: "), new Exception());
            return;
        }
        r rVar4 = (r) message.obj;
        synchronized (rVar4) {
            try {
                bool = rVar4.alpha;
                if (rVar4.bravo) {
                    Log.w("GmsClient", "Callback proxy " + rVar4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            e eVar5 = rVar4.foxtrot;
            int i12 = rVar4.delta;
            if (i12 == 0) {
                if (!rVar4.bravo()) {
                    eVar5.azure(1, null);
                    rVar4.alpha(new ConnectionResult(8, null));
                }
            } else {
                eVar5.azure(1, null);
                Bundle bundle = rVar4.echo;
                if (bundle != null) {
                    pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                }
                rVar4.alpha(new ConnectionResult(i12, pendingIntent));
            }
        }
        synchronized (rVar4) {
            rVar4.bravo = true;
        }
        rVar4.delta();
    }
}
