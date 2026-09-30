package com.google.android.gms.measurement.internal;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1456m extends P {
    public long red;
    public String silver;

    @Override // com.google.android.gms.measurement.internal.P
    public final boolean X() {
        Calendar calendar = Calendar.getInstance();
        this.red = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.silver = ao.ad.amber(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long a0() {
        Y();
        return this.red;
    }

    public final String b0() {
        Y();
        return this.silver;
    }
}
