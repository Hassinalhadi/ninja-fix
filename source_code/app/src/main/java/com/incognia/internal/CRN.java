package com.incognia.internal;

import android.util.Log;
import com.incognia.RequestTokenStatus;
import com.incognia.RequestTokenWithStatus;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class CRN extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lambda f8454b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CRN(Function1 function1) {
        super(1);
        this.f8454b = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r8v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = ((Result) obj).alpha;
        try {
            ?? r4 = this.f8454b;
            Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj2);
            if (m207exceptionOrNullimpl == null) {
                r4.invoke(EP.b((syj) obj2));
            } else if (m207exceptionOrNullimpl instanceof bJ) {
                String str = (String) wGk.DP.getValue();
                if (str == null) {
                    str = "An unexpected error occurred during the request token generation.";
                }
                if (eSs.f10363b.get()) {
                    Log.e("Incognia", "Error while generating request token. Reason: ".concat(str));
                }
                r4.invoke(new RequestTokenWithStatus("AQHnZ636qfrePztaGRcI1NN2iOV_ZVP14hfQw48SscEezr98pOHgjRO_CxMn__WM3PqIjWL-f-LN-97HAKMQIRdiVbFXJIPCI-Xsw1txl-63d1UNDuv-LzjKrKbgd8qjxejZ3u9-5PFcFS8Zjti4kzHhJtoB5Hz-TcNRgeFljZbJyFnGqKdI1Gq_iq0809WVhRXC4SnPR9n9h51gSqXd9sQhIgL7D5Fkk-qdCYXkPPdALFIYegmMXdUfqSz7-R6ZSNY_6IzeAPydltexdur4GLAI8u5-UJK0BxSBCsKSPlcL0yNjIPQiBfdiY3D4tNMqpMK9YwIkkwnvPFDIYyKn-aIhzMVrCoAzMXSriGJ7Fu5DDQuS37vNImm1IWlSDCpaC639ruETpUl6pC01a4FoRSdPBBc8ou3atFDeSr_KpnqZr1Lb9C6anksNxdRUL9u897fHxse7IpzdjUUWm24lQ8I", RequestTokenStatus.DATA_COLLECTION_DISABLED));
            } else {
                if (eSs.f10363b.get()) {
                    Log.e("Incognia", "Error while generating request token. Reason: ".concat("An unexpected error occurred during the request token generation."));
                }
                r4.invoke(new RequestTokenWithStatus("AcD6PmlVdDAQr3cBMrWbEw8oQPYHX3RZrLLGheI9I7LMwL_Xav24TCOH9NLmh7YzfufrrrSLB-k2JE4aXGodTH_YofIai1wyuJzIsHB4U5LrEb8G4nvkilmktCg8QR-_4sB3cnIe4c3pVQXamwwhwyTsvA27KH2pvqtC3QQaqu6Tti3KGJbKebvVw9RQRwOoMsfH_xyKE6Ukoewt0RKQkhzkxooi3esUukMF9-CwsIEbv3p_2CJrsov7pD1ZClWRPMIba3Wg8pBKisa3mziukjfi7vRdDE24d10NLkcIve6X3NUqqaf4lJc_3leDSamRxU_JMquzIone4E-zvFTjDayk_WqW3ldspVbd1_rLQzHjCalUp94wt_qMy9Kb-4L8OF7wczhMcprY6qQxExm2Ra7KFh3NSH7WLoE_mOHUrGxEcvQDBHqzFpIRQqO7xmK09g", RequestTokenStatus.INTERNAL_ERROR));
            }
        } catch (Throwable unused) {
            if (eSs.f10363b.get()) {
                Log.e("Incognia", "Error while generating request token. Reason: ".concat("An unexpected error occurred during the request token generation."));
            }
            this.f8454b.invoke(new RequestTokenWithStatus("AcD6PmlVdDAQr3cBMrWbEw8oQPYHX3RZrLLGheI9I7LMwL_Xav24TCOH9NLmh7YzfufrrrSLB-k2JE4aXGodTH_YofIai1wyuJzIsHB4U5LrEb8G4nvkilmktCg8QR-_4sB3cnIe4c3pVQXamwwhwyTsvA27KH2pvqtC3QQaqu6Tti3KGJbKebvVw9RQRwOoMsfH_xyKE6Ukoewt0RKQkhzkxooi3esUukMF9-CwsIEbv3p_2CJrsov7pD1ZClWRPMIba3Wg8pBKisa3mziukjfi7vRdDE24d10NLkcIve6X3NUqqaf4lJc_3leDSamRxU_JMquzIone4E-zvFTjDayk_WqW3ldspVbd1_rLQzHjCalUp94wt_qMy9Kb-4L8OF7wczhMcprY6qQxExm2Ra7KFh3NSH7WLoE_mOHUrGxEcvQDBHqzFpIRQqO7xmK09g", RequestTokenStatus.INTERNAL_ERROR));
        }
        return Unit.INSTANCE;
    }
}
