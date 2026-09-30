package J8;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ay extends Handler {
    public final /* synthetic */ int alpha = 2;
    public Object bravo;

    public /* synthetic */ ay() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        String str;
        int size;
        J2.e[] eVarArr;
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(msg, "msg");
                if (msg.what == 3) {
                    Bundle data = msg.getData();
                    if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                        str = "";
                    }
                    Log.d("SessionLifecycleClient", "Session update received.");
                    vf.ad.zulu(vf.ad.charlie((Nd.h) this.bravo), null, null, new ax(str, null), 3);
                    return;
                }
                Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + msg);
                super.handleMessage(msg);
                return;
            case 1:
                if (msg.what != 1) {
                    super.handleMessage(msg);
                    return;
                }
                W1.b bVar = (W1.b) this.bravo;
                while (true) {
                    synchronized (bVar.bravo) {
                        try {
                            size = bVar.delta.size();
                            if (size <= 0) {
                                return;
                            }
                            eVarArr = new J2.e[size];
                            bVar.delta.toArray(eVarArr);
                            bVar.delta.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i4 = 0; i4 < size; i4++) {
                        J2.e eVar = eVarArr[i4];
                        int size2 = ((ArrayList) eVar.red).size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            W1.a aVar = (W1.a) ((ArrayList) eVar.red).get(i5);
                            if (!aVar.delta) {
                                aVar.bravo.onReceive(bVar.alpha, (Intent) eVar.purple);
                            }
                        }
                    }
                }
            default:
                int i10 = msg.what;
                if (i10 != -3 && i10 != -2 && i10 != -1) {
                    if (i10 == 1) {
                        ((DialogInterface) msg.obj).dismiss();
                        return;
                    }
                    return;
                }
                ((DialogInterface.OnClickListener) msg.obj).onClick((DialogInterface) ((WeakReference) this.bravo).get(), msg.what);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(Nd.h backgroundDispatcher) {
        super(Looper.getMainLooper());
        Intrinsics.echo(backgroundDispatcher, "backgroundDispatcher");
        this.bravo = backgroundDispatcher;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(W1.b bVar, Looper looper) {
        super(looper);
        this.bravo = bVar;
    }
}
