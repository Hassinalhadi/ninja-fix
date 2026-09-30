package N4;

import Nd.c;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.insight.ProductEventName;
import com.checkout.components.interfaces.insight.ProductEventProperties;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void alpha(Logger logger, CheckoutError checkoutError, String str, boolean z2, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                str = null;
            }
            if ((i4 & 4) != 0) {
                z2 = false;
            }
            logger.logError(checkoutError, str, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logError");
    }

    public static /* synthetic */ void bravo(Logger logger, String str, String str2, String str3, String str4, boolean z2, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 8) != 0) {
                str4 = null;
            }
            String str5 = str4;
            if ((i4 & 16) != 0) {
                z2 = false;
            }
            logger.logError(str, str2, str3, str5, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logError");
    }

    public static /* synthetic */ Object charlie(Logger logger, CheckoutError checkoutError, String str, c cVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                str = null;
            }
            return logger.logErrorAndAwait(checkoutError, str, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logErrorAndAwait");
    }

    public static /* synthetic */ void delta(Logger logger, String str, String str2, String str3, String str4, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 8) != 0) {
                str4 = null;
            }
            logger.logWarning(str, str2, str3, str4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logWarning");
    }

    public static /* synthetic */ void echo(Logger logger, ProductEventName productEventName, ProductEventProperties productEventProperties, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                productEventProperties = new ProductEventProperties(null, null, null, null, null, null, null, 127, null);
            }
            logger.sendProductEvent(productEventName, productEventProperties);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendProductEvent");
    }
}
