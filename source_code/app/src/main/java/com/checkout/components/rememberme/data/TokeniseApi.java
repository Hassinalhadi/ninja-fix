package com.checkout.components.rememberme.data;

import Nd.c;
import androidx.annotation.Keep;
import com.checkout.components.rememberme.model.CvvTokenPayload;
import com.checkout.components.rememberme.model.CvvTokenResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vg.aq;
import yg.a;
import yg.i;
import yg.o;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J>\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/rememberme/data/TokeniseApi;", "", "", "authorization", "ckoServiceName", "ckoServiceVersion", "Lcom/checkout/components/rememberme/model/CvvTokenPayload;", "body", "Lvg/aq;", "Lcom/checkout/components/rememberme/model/CvvTokenResponse;", "createCvvToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/rememberme/model/CvvTokenPayload;LNd/c;)Ljava/lang/Object;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TokeniseApi {
    @o("/tokens")
    @Nullable
    Object createCvvToken(@NotNull @i("Authorization") String str, @NotNull @i("Cko-Service-Name") String str2, @NotNull @i("Cko-Service-Version") String str3, @NotNull @a CvvTokenPayload cvvTokenPayload, @NotNull c<? super aq<CvvTokenResponse>> cVar);
}
