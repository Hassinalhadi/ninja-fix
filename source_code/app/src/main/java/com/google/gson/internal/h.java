package com.google.gson.internal;

/* loaded from: classes2.dex */
public final class h extends Number {
    public final String alpha;

    public h(String str) {
        this.alpha = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.alpha);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.alpha.equals(((h) obj).alpha);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.alpha;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return f.juliet(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.alpha;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return f.juliet(str).longValue();
        }
    }

    public final String toString() {
        return this.alpha;
    }
}
