package E0;

import java.text.CharacterIterator;

/* loaded from: classes3.dex */
public final class g implements CharacterIterator {
    public final CharSequence alpha;
    public final int purple;
    public int red = 0;

    public g(CharSequence charSequence, int i4) {
        this.alpha = charSequence;
        this.purple = i4;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i4 = this.red;
        if (i4 == this.purple) {
            return (char) 65535;
        }
        return this.alpha.charAt(i4);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.red = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.purple;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.red;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i4 = this.purple;
        if (i4 == 0) {
            this.red = i4;
            return (char) 65535;
        }
        int i5 = i4 - 1;
        this.red = i5;
        return this.alpha.charAt(i5);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i4 = this.red + 1;
        this.red = i4;
        int i5 = this.purple;
        if (i4 >= i5) {
            this.red = i5;
            return (char) 65535;
        }
        return this.alpha.charAt(i4);
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i4 = this.red;
        if (i4 <= 0) {
            return (char) 65535;
        }
        int i5 = i4 - 1;
        this.red = i5;
        return this.alpha.charAt(i5);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i4) {
        if (i4 <= this.purple && i4 >= 0) {
            this.red = i4;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}
