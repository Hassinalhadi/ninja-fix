package com.clevertap.android.sdk.displayunits;

import android.text.TextUtils;
import android.util.Log;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes3.dex */
public enum CTDisplayUnitType {
    SIMPLE("simple"),
    SIMPLE_WITH_IMAGE("simple-image"),
    CAROUSEL("carousel"),
    CAROUSEL_WITH_IMAGE("carousel-image"),
    MESSAGE_WITH_ICON("message-icon"),
    CUSTOM_KEY_VALUE("custom-key-value");

    public final String type;

    CTDisplayUnitType(String str) {
        this.type = str;
    }

    public static CTDisplayUnitType type(String str) {
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            char c3 = 65535;
            switch (str.hashCode()) {
                case -1799711058:
                    if (str.equals("carousel-image")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -1332589953:
                    if (str.equals("message-icon")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case -902286926:
                    if (str.equals("simple")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case -876980953:
                    if (str.equals("custom-key-value")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case 2908512:
                    if (str.equals("carousel")) {
                        c3 = 4;
                        break;
                    }
                    break;
                case 1818845568:
                    if (str.equals("simple-image")) {
                        c3 = 5;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    return CAROUSEL_WITH_IMAGE;
                case 1:
                    return MESSAGE_WITH_ICON;
                case 2:
                    return SIMPLE;
                case 3:
                    return CUSTOM_KEY_VALUE;
                case 4:
                    return CAROUSEL;
                case 5:
                    return SIMPLE_WITH_IMAGE;
            }
        }
        Log.d(Constants.FEATURE_DISPLAY_UNIT, "Unsupported Display Unit Type");
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }
}
