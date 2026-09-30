package androidx.compose.ui.layout;

import T.s;
import bv.aa;
import okhttp3.internal.ws.WebSocketProtocol;
import q0.AbstractC2375K;
import q0.C2399r;
import q0.RunnableC2400s;
import q0.T;
import q0.U;
import q0.V;
import s0.aq;

/* loaded from: classes3.dex */
public abstract class b {
    public static final aa alpha;
    public static final U[] bravo;
    public static final aa charlie;

    static {
        aa aaVar = new aa(8);
        U.alpha.getClass();
        V v4 = T.golf;
        aaVar.hotel(1, v4);
        V v6 = T.foxtrot;
        aaVar.hotel(2, v6);
        V v10 = T.bravo;
        aaVar.hotel(4, v10);
        V v11 = T.delta;
        aaVar.hotel(8, v11);
        V v12 = T.hotel;
        aaVar.hotel(16, v12);
        V v13 = T.echo;
        aaVar.hotel(32, v13);
        V v14 = T.india;
        aaVar.hotel(64, v14);
        alpha = aaVar;
        bravo = new U[]{v4, v6, v10, v14, v12, v13, v11, T.juliet, T.charlie};
        aa aaVar2 = new aa(7);
        aaVar2.hotel(1, v4);
        aaVar2.hotel(2, v6);
        aaVar2.hotel(4, v10);
        aaVar2.hotel(16, v12);
        aaVar2.hotel(64, v14);
        aaVar2.hotel(32, v13);
        aaVar2.hotel(8, v11);
        charlie = aaVar2;
    }

    public static final void alpha(aq aqVar, C2399r c2399r, long j5, int i4, int i5) {
        if (!AbstractC2375K.golf(j5, -1L)) {
            float f5 = (int) ((j5 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
            float f10 = (int) ((j5 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
            float f11 = i4 - ((int) ((j5 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
            float f12 = i5 - ((int) (j5 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
            aqVar.charlie(c2399r.bravo, f5);
            aqVar.charlie(c2399r.charlie, f10);
            aqVar.charlie(c2399r.delta, f11);
            aqVar.charlie(c2399r.echo, f12);
        }
    }

    public static final s bravo(RunnableC2400s runnableC2400s) {
        return new RulerProviderModifierElement(runnableC2400s);
    }
}
