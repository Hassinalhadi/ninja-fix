package ud;

import ao.ad;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ud.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3155c implements CharSequence, Appendable {
    public final Id.d alpha;
    public ArrayList purple;
    public char[] red;
    public String silver;
    public boolean teal;
    public int white;
    public int yellow;

    public C3155c() {
        Id.d pool = e.alpha;
        Intrinsics.echo(pool, "pool");
        this.alpha = pool;
    }

    public final char[] alpha(int i4) {
        ArrayList arrayList = this.purple;
        if (arrayList == null) {
            if (i4 < 2048) {
                char[] cArr = this.red;
                if (cArr != null) {
                    return cArr;
                }
                echo(i4);
                throw null;
            }
            echo(i4);
            throw null;
        }
        char[] cArr2 = this.red;
        Intrinsics.checkNotNull(cArr2);
        return (char[]) arrayList.get(i4 / cArr2.length);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c3) {
        char[] delta = delta();
        char[] cArr = this.red;
        Intrinsics.checkNotNull(cArr);
        int length = cArr.length;
        int i4 = this.white;
        delta[length - i4] = c3;
        this.silver = null;
        this.white = i4 - 1;
        this.yellow++;
        return this;
    }

    public final CharSequence bravo(int i4, int i5) {
        if (i4 == i5) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i5 - i4);
        for (int i10 = i4 - (i4 % 2048); i10 < i5; i10 += 2048) {
            char[] alpha = alpha(i10);
            int min = Math.min(i5 - i10, 2048);
            for (int max = Math.max(0, i4 - i10); max < min; max++) {
                sb2.append(alpha[max]);
            }
        }
        return sb2;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i4) {
        if (i4 >= 0) {
            if (i4 < this.yellow) {
                return charlie(i4);
            }
            throw new IllegalArgumentException(Q0.c.quebec(Q0.c.sierra(i4, "index ", " is not in range [0, "), this.yellow, ')').toString());
        }
        throw new IllegalArgumentException(ad.zulu(i4, "index is negative: ").toString());
    }

    public final char charlie(int i4) {
        char[] alpha = alpha(i4);
        char[] cArr = this.red;
        Intrinsics.checkNotNull(cArr);
        return alpha[i4 % cArr.length];
    }

    public final char[] delta() {
        if (this.white == 0) {
            char[] cArr = (char[]) this.alpha.yankee();
            char[] cArr2 = this.red;
            this.red = cArr;
            this.white = cArr.length;
            this.teal = false;
            if (cArr2 != null) {
                ArrayList arrayList = this.purple;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.purple = arrayList;
                    arrayList.add(cArr2);
                }
                arrayList.add(cArr);
            }
            return cArr;
        }
        char[] cArr3 = this.red;
        Intrinsics.checkNotNull(cArr3);
        return cArr3;
    }

    public final void echo(int i4) {
        if (this.teal) {
            throw new IllegalStateException("Buffer is already released");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i4);
        sb2.append(" is not in range [0; ");
        char[] cArr = this.red;
        Intrinsics.checkNotNull(cArr);
        sb2.append(cArr.length - this.white);
        sb2.append(')');
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (this.yellow == charSequence.length()) {
                int i4 = this.yellow;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (charlie(i5) != charSequence.charAt(i5)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.silver;
        if (str != null) {
            return str.hashCode();
        }
        int i4 = this.yellow;
        int i5 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            i5 = (i5 * 31) + charlie(i10);
        }
        return i5;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.yellow;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i4, int i5) {
        if (i4 <= i5) {
            if (i4 >= 0) {
                if (i5 <= this.yellow) {
                    return new C3154b(this, i4, i5);
                }
                throw new IllegalArgumentException(Q0.c.quebec(Q0.c.sierra(i5, "endIndex (", ") is greater than length ("), this.yellow, ')').toString());
            }
            throw new IllegalArgumentException(ad.zulu(i4, "startIndex is negative: ").toString());
        }
        throw new IllegalArgumentException(("startIndex (" + i4 + ") should be less or equal to endIndex (" + i5 + ')').toString());
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.silver;
        if (str == null) {
            String obj = bravo(0, this.yellow).toString();
            this.silver = obj;
            return obj;
        }
        return str;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i4, int i5) {
        if (charSequence == null) {
            return this;
        }
        int i10 = i4;
        while (i10 < i5) {
            char[] delta = delta();
            int length = delta.length;
            int i11 = this.white;
            int i12 = length - i11;
            int min = Math.min(i5 - i10, i11);
            for (int i13 = 0; i13 < min; i13++) {
                delta[i12 + i13] = charSequence.charAt(i10 + i13);
            }
            i10 += min;
            this.white -= min;
        }
        this.silver = null;
        this.yellow = (i5 - i4) + this.yellow;
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            return this;
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }
}
