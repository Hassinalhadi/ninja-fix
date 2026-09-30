package n4;

import Nd.c;
import com.checkout.components.card.operations.network.NetworkApiClient;
import com.checkout.components.card.operations.tokenisation.network.model.TokenRequest;
import okhttp3.Headers;

/* renamed from: n4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC2160a {
    public static /* synthetic */ Object alpha(NetworkApiClient networkApiClient, TokenRequest tokenRequest, Headers headers, c cVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                headers = null;
            }
            return networkApiClient.sendCardTokenRequest(tokenRequest, headers, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendCardTokenRequest");
    }
}
