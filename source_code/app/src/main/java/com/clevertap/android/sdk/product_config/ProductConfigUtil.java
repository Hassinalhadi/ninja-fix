package com.clevertap.android.sdk.product_config;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.CleverTapInstanceConfig;

@Deprecated
/* loaded from: classes3.dex */
class ProductConfigUtil {
    @Deprecated
    public static String getLogTag(CleverTapInstanceConfig cleverTapInstanceConfig) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (cleverTapInstanceConfig != null) {
            str = cleverTapInstanceConfig.getAccountId();
        } else {
            str = "";
        }
        return P0.gold(sb2, str, CTProductConfigConstants.TAG_PRODUCT_CONFIG);
    }

    @Deprecated
    public static boolean isSupportedDataType(Object obj) {
        if (!(obj instanceof String) && !(obj instanceof Number) && !(obj instanceof Boolean)) {
            return false;
        }
        return true;
    }
}
