package ca;

import A0.z;
import android.util.Log;
import androidx.appcompat.widget.P0;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import g3.w;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.WebSocket;
import p3.ah;
import yf.N;
import z3.C3462a;

/* loaded from: classes2.dex */
public final class o implements w {
    public final AtomicInteger alpha = new AtomicInteger(0);

    public o(Q4.a aVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        r0 = r9.getValue();
        r1 = A0.z.lima("evt=SEND_ON_COMPLETE sendId=", " topic=", r17, " payloadLength=", r7);
        r1.append(r8);
        r1.append(" stompState=");
        r1.append(r0);
        r0 = r1.toString();
        android.util.Log.i("LocationFlow", r0);
        z3.C3462a.alpha("LocationFlow", 12, r0, null);
        r19.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bd, code lost:
    
        return;
     */
    @Override // g3.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha(String str, String payload, Function0 function0, Function1 function1) {
        n foxtrot;
        WebSocket webSocket;
        Intrinsics.echo(payload, "payload");
        if (str != null && !StringsKt.gray(str)) {
            foxtrot = Q9.c.foxtrot();
            if (foxtrot == null) {
                Log.e("LocationFlow", "evt=SEND_ERROR reason=coordinator_null");
                function1.invoke(new IllegalStateException("V2 coordinator not available"));
                return;
            }
            int incrementAndGet = this.alpha.incrementAndGet();
            int length = payload.length();
            N n5 = CaptainLocationMonitoringService.f12067E;
            ah ahVar = (ah) n5.getValue();
            StringBuilder lima = z.lima("evt=SEND_SUBSCRIBE sendId=", " topic=", str, " payloadLength=", incrementAndGet);
            lima.append(length);
            lima.append(" stompState=");
            lima.append(ahVar);
            String sb2 = lima.toString();
            Log.i("LocationFlow", sb2);
            C3462a.alpha("LocationFlow", 12, sb2, null);
            byte[] bytes = payload.getBytes(kotlin.text.a.alpha);
            Intrinsics.delta(bytes, "getBytes(...)");
            String frame = P0.gold(P0.green("SEND\ndestination:", str, "\ncontent-type:application/json\ncontent-length:", "\n\n", bytes.length), payload, "\u0000\n");
            try {
                Intrinsics.echo(frame, "frame");
                boolean z2 = false;
                if (foxtrot.quebec.get() && (webSocket = foxtrot.papa) != null) {
                    z2 = webSocket.send(frame);
                }
                Object value = n5.getValue();
                StringBuilder lima2 = z.lima("evt=SEND_ON_ERROR sendId=", " topic=", str, " payloadLength=", incrementAndGet);
                lima2.append(length);
                lima2.append(" stompState=");
                lima2.append(value);
                lima2.append(" errorClass=SendFailed errorMessage=WebSocket send returned false or null");
                String sb3 = lima2.toString();
                Log.e("LocationFlow", sb3);
                C3462a.alpha("LocationFlow", 12, sb3, null);
                function1.invoke(new IllegalStateException("WebSocket send failed"));
                return;
            } catch (Exception e) {
                Object value2 = CaptainLocationMonitoringService.f12067E.getValue();
                String simpleName = e.getClass().getSimpleName();
                String message = e.getMessage();
                StringBuilder lima3 = z.lima("evt=SEND_ON_ERROR sendId=", " topic=", str, " payloadLength=", incrementAndGet);
                lima3.append(length);
                lima3.append(" stompState=");
                lima3.append(value2);
                lima3.append(" errorClass=");
                lima3.append(simpleName);
                lima3.append(" errorMessage=");
                lima3.append(message);
                String sb4 = lima3.toString();
                Log.e("LocationFlow", sb4);
                C3462a.alpha("LocationFlow", 12, sb4, null);
                function1.invoke(e);
                return;
            }
        }
        Log.e("LocationFlow", "evt=SEND_ERROR reason=topic_null_or_blank");
        function1.invoke(new IllegalArgumentException("Topic is null or blank"));
    }
}
