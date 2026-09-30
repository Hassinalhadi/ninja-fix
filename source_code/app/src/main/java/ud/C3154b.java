package ud;

import ao.ad;

/* renamed from: ud.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3154b implements CharSequence {
    public final int alpha;
    public final int purple;
    public String red;
    public final /* synthetic */ C3155c silver;

    public C3154b(C3155c c3155c, int i4, int i5) {
        this.silver = c3155c;
        this.alpha = i4;
        this.purple = i5;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i4) {
        int i5 = this.alpha + i4;
        if (i4 >= 0) {
            if (i5 < this.purple) {
                return this.silver.charlie(i5);
            }
            StringBuilder sierra = Q0.c.sierra(i4, "index (", ") should be less than length (");
            sierra.append(length());
            sierra.append(')');
            throw new IllegalArgumentException(sierra.toString().toString());
        }
        throw new IllegalArgumentException(ad.zulu(i4, "index is negative: ").toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence.length() == length()) {
                int length = length();
                C3155c c3155c = this.silver;
                for (int i4 = 0; i4 < length; i4++) {
                    if (c3155c.charlie(this.alpha + i4) != charSequence.charAt(i4)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.red;
        if (str != null) {
            return str.hashCode();
        }
        C3155c c3155c = this.silver;
        int i4 = 0;
        for (int i5 = this.alpha; i5 < this.purple; i5++) {
            i4 = (i4 * 31) + c3155c.charlie(i5);
        }
        return i4;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.purple - this.alpha;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i4, int i5) {
        if (i4 >= 0) {
            if (i4 <= i5) {
                int i10 = this.purple;
                int i11 = this.alpha;
                if (i5 <= i10 - i11) {
                    if (i4 == i5) {
                        return "";
                    }
                    return new C3154b(this.silver, i4 + i11, i11 + i5);
                }
                throw new IllegalArgumentException(("end should be less than length (" + length() + ')').toString());
            }
            throw new IllegalArgumentException(("start (" + i4 + ") should be less or equal to end (" + i5 + ')').toString());
        }
        throw new IllegalArgumentException(ad.zulu(i4, "start is negative: ").toString());
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.red;
        if (str == null) {
            String obj = this.silver.bravo(this.alpha, this.purple).toString();
            this.red = obj;
            return obj;
        }
        return str;
    }
}
