package com.checkout.components.insight.data.remote;

import Nd.c;
import com.checkout.components.insight.data.dto.Events;
import kotlin.Metadata;
import kotlin.Unit;
import vg.aq;
import yg.a;
import yg.i;
import yg.o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JH\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/insight/data/remote/InsightApi;", "", "", "contentType", "publicKey", "ckoServiceName", "ckoServiceVersion", "Lcom/checkout/components/insight/data/dto/Events;", "body", "Lvg/aq;", "", "sendLogBatch", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/insight/data/dto/Events;LNd/c;)Ljava/lang/Object;", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InsightApi {
    @o("/v1/insights")
    Object sendLogBatch(@i("Content-Type") String str, @i("Authorization") String str2, @i("Cko-Service-Name") String str3, @i("Cko-Service-Version") String str4, @a Events events, c<? super aq<Unit>> cVar);
}
