package com.google.android.gms.location;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class l {
    public static final DecimalFormat alpha;
    public static final DecimalFormat bravo;

    static {
        Locale locale = Locale.ROOT;
        alpha = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        bravo = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
    }
}
