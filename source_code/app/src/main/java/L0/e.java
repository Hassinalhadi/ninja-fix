package L0;

import Jb.W;
import a0.AbstractC0362p;
import a0.aq;
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.RealWebSocket;
import z3.C3462a;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ e(long j5, int i4, Object obj) {
        this.alpha = i4;
        this.red = obj;
        this.purple = j5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long _init_$lambda$2;
        long initReaderAndWriter$lambda$3$lambda$2;
        switch (this.alpha) {
            case 0:
                return ((aq) ((AbstractC0362p) this.red)).bravo(this.purple);
            case 1:
                d3.k kVar = (d3.k) this.red;
                kVar.yellow.remove(Long.valueOf(this.purple));
                if (!kVar.yellow.isEmpty()) {
                    new Handler(Looper.getMainLooper()).postDelayed(new W(kVar, 1), 150L);
                } else {
                    C3462a.alpha("REPOSITION_QUEUE", 12, "[DONE] Queue empty", null);
                }
                return Unit.INSTANCE;
            case 2:
                _init_$lambda$2 = Http2Connection._init_$lambda$2((Http2Connection) this.red, this.purple);
                return Long.valueOf(_init_$lambda$2);
            default:
                initReaderAndWriter$lambda$3$lambda$2 = RealWebSocket.initReaderAndWriter$lambda$3$lambda$2((RealWebSocket) this.red, this.purple);
                return Long.valueOf(initReaderAndWriter$lambda$3$lambda$2);
        }
    }
}
