package com.google.gson.internal;

/* loaded from: classes2.dex */
public final class r implements CharSequence {
    public char[] alpha;
    public String purple;

    @Override // java.lang.CharSequence
    public final char charAt(int i4) {
        return this.alpha[i4];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.alpha.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i4, int i5) {
        return new String(this.alpha, i4, i5 - i4);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.purple == null) {
            this.purple = new String(this.alpha);
        }
        return this.purple;
    }
}
