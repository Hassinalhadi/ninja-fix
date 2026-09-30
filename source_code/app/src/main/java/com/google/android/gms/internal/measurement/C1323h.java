package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import pe.AbstractC2327c;

/* renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1323h implements InterfaceC1355o {
    public final Double alpha;

    public C1323h(Double d4) {
        if (d4 == null) {
            this.alpha = Double.valueOf(Double.NaN);
        } else {
            this.alpha = d4;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Double alpha() {
        return this.alpha;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final String bravo() {
        BigDecimal stripTrailingZeros;
        int scale;
        Double d4 = this.alpha;
        if (Double.isNaN(d4.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d4.doubleValue())) {
            if (d4.doubleValue() > 0.0d) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(d4.doubleValue());
        if (valueOf.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else if (valueOf.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = valueOf.stripTrailingZeros();
        }
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            scale = stripTrailingZeros.precision();
        } else {
            scale = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
                return stripTrailingZeros.toPlainString();
            }
            return format.replace("E-", "e-").replace("E", "e+");
        }
        return format;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1323h)) {
            return false;
        }
        return this.alpha.equals(((C1323h) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final InterfaceC1355o hotel(String str, J2.i iVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new r(bravo());
        }
        throw new IllegalArgumentException(AbstractC2327c.xray(bravo(), ".", str, " is not a function."));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Boolean kilo() {
        Double d4 = this.alpha;
        boolean z2 = false;
        if (!Double.isNaN(d4.doubleValue()) && d4.doubleValue() != 0.0d) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Iterator lima() {
        return null;
    }

    public final String toString() {
        return bravo();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final InterfaceC1355o zzd() {
        return new C1323h(this.alpha);
    }
}
