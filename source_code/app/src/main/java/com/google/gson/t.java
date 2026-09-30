package com.google.gson;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class t extends q {
    public final Serializable alpha;

    public t(Boolean bool) {
        Objects.requireNonNull(bool);
        this.alpha = bool;
    }

    public static boolean mike(t tVar) {
        Serializable serializable = tVar.alpha;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.gson.q
    public final int alpha() {
        if (this.alpha instanceof Number) {
            return lima().intValue();
        }
        return Integer.parseInt(delta());
    }

    @Override // com.google.gson.q
    public final String delta() {
        Serializable serializable = this.alpha;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return lima().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        BigDecimal juliet;
        BigDecimal juliet2;
        if (this != obj) {
            if (obj != null && t.class == obj.getClass()) {
                t tVar = (t) obj;
                Serializable serializable = this.alpha;
                Serializable serializable2 = tVar.alpha;
                if (serializable == null) {
                    if (serializable2 == null) {
                        return true;
                    }
                    return false;
                }
                if (mike(this) && mike(tVar)) {
                    if (!(serializable instanceof BigInteger) && !(serializable2 instanceof BigInteger)) {
                        if (lima().longValue() == tVar.lima().longValue()) {
                            return true;
                        }
                        return false;
                    }
                    return hotel().equals(tVar.hotel());
                }
                if ((serializable instanceof Number) && (serializable2 instanceof Number)) {
                    if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
                        if (serializable instanceof BigDecimal) {
                            juliet = (BigDecimal) serializable;
                        } else {
                            juliet = com.google.gson.internal.f.juliet(delta());
                        }
                        if (serializable2 instanceof BigDecimal) {
                            juliet2 = (BigDecimal) serializable2;
                        } else {
                            juliet2 = com.google.gson.internal.f.juliet(tVar.delta());
                        }
                        if (juliet.compareTo(juliet2) == 0) {
                            return true;
                        }
                        return false;
                    }
                    double kilo = kilo();
                    double kilo2 = tVar.kilo();
                    if (kilo != kilo2) {
                        if (Double.isNaN(kilo) && Double.isNaN(kilo2)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return serializable.equals(serializable2);
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.alpha;
        if (serializable == null) {
            return 31;
        }
        if (mike(this)) {
            doubleToLongBits = lima().longValue();
        } else if (serializable instanceof Number) {
            doubleToLongBits = Double.doubleToLongBits(lima().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final BigInteger hotel() {
        Serializable serializable = this.alpha;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (mike(this)) {
            return BigInteger.valueOf(lima().longValue());
        }
        String delta = delta();
        com.google.gson.internal.f.delta(delta);
        return new BigInteger(delta);
    }

    public final boolean india() {
        Serializable serializable = this.alpha;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(delta());
    }

    public final double kilo() {
        if (this.alpha instanceof Number) {
            return lima().doubleValue();
        }
        return Double.parseDouble(delta());
    }

    public final Number lima() {
        Serializable serializable = this.alpha;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new com.google.gson.internal.h((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public t(Number number) {
        Objects.requireNonNull(number);
        this.alpha = number;
    }

    public t(String str) {
        Objects.requireNonNull(str);
        this.alpha = str;
    }
}
