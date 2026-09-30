package b5;

import Nd.c;
import com.checkout.components.rememberme.data.TokeniseApi;
import com.checkout.components.rememberme.model.CvvTokenPayload;

/* renamed from: b5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0718b {
    public static /* synthetic */ Object alpha(TokeniseApi tokeniseApi, String str, String str2, String str3, CvvTokenPayload cvvTokenPayload, c cVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                str2 = "CheckoutAndroidComponents";
            }
            String str4 = str2;
            if ((i4 & 4) != 0) {
                str3 = "2.1.0";
            }
            return tokeniseApi.createCvvToken(str, str4, str3, cvvTokenPayload, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createCvvToken");
    }
}
