package Pf;

/* loaded from: classes2.dex */
public final class c implements CharSequence {
    public final char[] alpha;
    public int purple;

    public c(char[] cArr) {
        this.alpha = cArr;
        this.purple = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i4) {
        return this.alpha[i4];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.purple;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i4, int i5) {
        return kotlin.text.r.echo(this.alpha, i4, Math.min(i5, this.purple));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i4 = this.purple;
        return kotlin.text.r.echo(this.alpha, 0, Math.min(i4, i4));
    }
}
