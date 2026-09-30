package b5;

import Nd.c;
import com.checkout.components.rememberme.data.ConsumerApi;
import com.checkout.components.rememberme.model.CreateMerchantTokenRequest;

/* renamed from: b5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0717a {
    public static /* synthetic */ Object alpha(ConsumerApi consumerApi, String str, String str2, String str3, CreateMerchantTokenRequest createMerchantTokenRequest, String str4, String str5, c cVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                str2 = "CheckoutAndroidComponents";
            }
            String str6 = str2;
            if ((i4 & 4) != 0) {
                str3 = "2.1.0";
            }
            return consumerApi.createMerchantToken(str, str6, str3, createMerchantTokenRequest, str4, str5, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createMerchantToken");
    }

    public static /* synthetic */ Object bravo(ConsumerApi consumerApi, String str, String str2, String str3, String str4, c cVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 4) != 0) {
                str3 = "CheckoutAndroidComponents";
            }
            String str5 = str3;
            if ((i4 & 8) != 0) {
                str4 = "2.1.0";
            }
            return consumerApi.getWallet(str, str2, str5, str4, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWallet");
    }
}
