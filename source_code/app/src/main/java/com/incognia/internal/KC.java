package com.incognia.internal;

import com.incognia.CardInfo;
import kotlin.Lazy;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public abstract class KC {

    /* renamed from: W, reason: collision with root package name */
    public static final String f8994W;

    /* renamed from: b, reason: collision with root package name */
    public static final String f8995b;

    /* renamed from: f9, reason: collision with root package name */
    public static final String f8996f9;
    public static final String sVU;

    static {
        Lazy lazy = wGk.UDv;
        f8995b = (String) lazy.getValue();
        f8994W = (String) lazy.getValue();
        f8996f9 = (String) lazy.getValue();
        sVU = (String) wGk.YED.getValue();
    }

    public static boolean b(CardInfo cardInfo) {
        if (cardInfo != null) {
            String bin = cardInfo.getBin();
            if (bin.length() <= 6 && new Regex(f8995b).echo(bin)) {
                String lastFourDigits = cardInfo.getLastFourDigits();
                if (lastFourDigits.length() == 4 && new Regex(f8994W).echo(lastFourDigits)) {
                    String expiryYear = cardInfo.getExpiryYear();
                    if (expiryYear == null || (expiryYear.length() == 4 && new Regex(f8996f9).echo(expiryYear))) {
                        String expiryMonth = cardInfo.getExpiryMonth();
                        if (expiryMonth != null) {
                            if (expiryMonth.length() != 2 || !new Regex(sVU).echo(expiryMonth)) {
                                return false;
                            }
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
