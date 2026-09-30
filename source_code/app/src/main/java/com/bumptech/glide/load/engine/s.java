package com.bumptech.glide.load.engine;

/* loaded from: classes3.dex */
public final class s implements Appendable {
    public final Appendable alpha;
    public boolean purple = true;

    public s(Appendable appendable) {
        this.alpha = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c3) {
        boolean z2 = this.purple;
        Appendable appendable = this.alpha;
        if (z2) {
            this.purple = false;
            appendable.append("  ");
        }
        this.purple = c3 == '\n';
        appendable.append(c3);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i4, int i5) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z2 = this.purple;
        Appendable appendable = this.alpha;
        boolean z10 = false;
        if (z2) {
            this.purple = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i5 - 1) == '\n') {
            z10 = true;
        }
        this.purple = z10;
        appendable.append(charSequence, i4, i5);
        return this;
    }
}
