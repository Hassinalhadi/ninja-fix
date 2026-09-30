package B4;

import Nd.c;
import com.checkout.components.core.D;
import com.checkout.components.core.common.Constants;
import com.checkout.components.core.data.remote.PaymentSessionApi;
import com.checkout.components.core.network.model.request.PayPaymentSessionRequest;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    static {
        D d4 = PaymentSessionApi.Companion;
    }

    public static /* synthetic */ Object alpha(PaymentSessionApi paymentSessionApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, c cVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                str = "application/json";
            }
            if ((i4 & 8) != 0) {
                str4 = Constants.CKO_SCHEMA_VERSION;
            }
            if ((i4 & 16) != 0) {
                str5 = "CheckoutAndroidComponents";
            }
            if ((i4 & 32) != 0) {
                str6 = "2.1.0";
            }
            return paymentSessionApi.getPaymentSession(str, str2, str3, str4, str5, str6, str7, str8, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPaymentSession");
    }

    public static /* synthetic */ Object bravo(PaymentSessionApi paymentSessionApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, PayPaymentSessionRequest.Apm apm, c cVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                str = "application/json";
            }
            if ((i4 & 2) != 0) {
                str2 = "CheckoutAndroidComponents";
            }
            if ((i4 & 4) != 0) {
                str3 = "2.1.0";
            }
            if ((i4 & 32) != 0) {
                str6 = Constants.CKO_SCHEMA_VERSION;
            }
            String str8 = str3;
            return paymentSessionApi.submitPaymentSessionByApm(str, str2, str8, str4, str5, str6, str7, apm, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitPaymentSessionByApm");
    }

    public static /* synthetic */ Object charlie(PaymentSessionApi paymentSessionApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, PayPaymentSessionRequest.Card card, c cVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                str = "application/json";
            }
            if ((i4 & 2) != 0) {
                str2 = "CheckoutAndroidComponents";
            }
            if ((i4 & 4) != 0) {
                str3 = "2.1.0";
            }
            if ((i4 & 32) != 0) {
                str6 = Constants.CKO_SCHEMA_VERSION;
            }
            String str8 = str3;
            return paymentSessionApi.submitPaymentSessionByCard(str, str2, str8, str4, str5, str6, str7, card, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitPaymentSessionByCard");
    }

    public static /* synthetic */ Object delta(PaymentSessionApi paymentSessionApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, PayPaymentSessionRequest.GooglePay googlePay, c cVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                str = "application/json";
            }
            if ((i4 & 2) != 0) {
                str2 = "CheckoutAndroidComponents";
            }
            if ((i4 & 4) != 0) {
                str3 = "2.1.0";
            }
            if ((i4 & 32) != 0) {
                str6 = Constants.CKO_SCHEMA_VERSION;
            }
            String str8 = str3;
            return paymentSessionApi.submitPaymentSessionByGooglePay(str, str2, str8, str4, str5, str6, str7, googlePay, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitPaymentSessionByGooglePay");
    }

    public static /* synthetic */ Object echo(PaymentSessionApi paymentSessionApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, PayPaymentSessionRequest.RememberMe rememberMe, c cVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                str = "application/json";
            }
            if ((i4 & 2) != 0) {
                str2 = "CheckoutAndroidComponents";
            }
            if ((i4 & 4) != 0) {
                str3 = "2.1.0";
            }
            if ((i4 & 32) != 0) {
                str6 = Constants.CKO_SCHEMA_VERSION;
            }
            String str8 = str3;
            return paymentSessionApi.submitPaymentSessionByRememberMe(str, str2, str8, str4, str5, str6, str7, rememberMe, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitPaymentSessionByRememberMe");
    }
}
