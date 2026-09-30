package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class S0 {
    public static final Uri alpha = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Pattern bravo;
    public static final Pattern charlie;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        bravo = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        charlie = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}
