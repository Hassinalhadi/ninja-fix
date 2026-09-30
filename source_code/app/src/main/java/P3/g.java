package P3;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.clevertap.android.sdk.db.Column;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.firebase.messaging.o;
import i7.C1902h;

/* loaded from: classes3.dex */
public final class g implements Handler.Callback {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ g(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    private final boolean alpha(Message message) {
        int i4 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Received response to request: " + i4);
        }
        S5.i iVar = (S5.i) this.bravo;
        synchronized (iVar) {
            try {
                S5.j jVar = (S5.j) iVar.echo.get(i4);
                if (jVar == null) {
                    Log.w("MessengerIpcClient", "Received response for unknown request: " + i4);
                    return true;
                }
                iVar.echo.remove(i4);
                iVar.charlie();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    jVar.bravo(new zzt(4, "Not supported by GmsCore", null));
                    return true;
                }
                switch (jVar.echo) {
                    case 0:
                        if (data.getBoolean("ack", false)) {
                            jVar.charlie(null);
                            return true;
                        }
                        jVar.bravo(new zzt(4, "Invalid response to one way request", null));
                        return true;
                    default:
                        Bundle bundle = data.getBundle(Column.DATA);
                        if (bundle == null) {
                            bundle = Bundle.EMPTY;
                        }
                        jVar.charlie(bundle);
                        return true;
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.alpha) {
            case 0:
                int i4 = message.what;
                h hVar = (h) this.bravo;
                if (i4 == 1) {
                    hVar.bravo((e) message.obj);
                    return true;
                }
                if (i4 == 2) {
                    hVar.delta.india((e) message.obj);
                }
                return false;
            case 1:
                return alpha(message);
            default:
                if (message.what != 0) {
                    return false;
                }
                o oVar = (o) this.bravo;
                C1902h c1902h = (C1902h) message.obj;
                synchronized (oVar.alpha) {
                    if (((C1902h) oVar.charlie) == c1902h || ((C1902h) oVar.delta) == c1902h) {
                        oVar.hotel(c1902h, 2);
                    }
                }
                return true;
        }
    }
}
