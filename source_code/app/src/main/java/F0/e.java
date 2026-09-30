package F0;

import E0.g;
import I.al;
import K1.k;
import Oe.v;
import android.content.res.TypedArray;
import android.util.SparseArray;
import av.q;
import com.google.android.material.textfield.l;
import id.C1915c;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import s6.J4;

/* loaded from: classes3.dex */
public final class e {
    public final /* synthetic */ int alpha;
    public int bravo;
    public int charlie;
    public Object delta;
    public Object echo;

    public /* synthetic */ e() {
        this.alpha = 1;
    }

    public static int bravo(int i4, int i5) {
        return delta(i5) + india(i4);
    }

    public static int charlie(int i4, int i5) {
        return delta(i5) + india(i4);
    }

    public static int delta(int i4) {
        if (i4 >= 0) {
            return golf(i4);
        }
        return 10;
    }

    public static int echo(int i4, v vVar) {
        return foxtrot(vVar) + india(i4);
    }

    public static int foxtrot(v vVar) {
        int delta = vVar.delta();
        return golf(delta) + delta;
    }

    public static int golf(int i4) {
        if ((i4 & (-128)) == 0) {
            return 1;
        }
        if ((i4 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i4) == 0) {
            return 3;
        }
        if ((i4 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int hotel(long j5) {
        if (((-128) & j5) == 0) {
            return 1;
        }
        if (((-16384) & j5) == 0) {
            return 2;
        }
        if (((-2097152) & j5) == 0) {
            return 3;
        }
        if (((-268435456) & j5) == 0) {
            return 4;
        }
        if (((-34359738368L) & j5) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j5) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j5) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j5) == 0) {
            return 8;
        }
        if ((j5 & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public static int india(int i4) {
        return golf(i4 << 3);
    }

    public static e romeo(OutputStream outputStream, int i4) {
        return new e(outputStream, new byte[i4]);
    }

    public void alpha(int i4) {
        boolean z2 = false;
        int i5 = this.bravo;
        int i10 = this.charlie;
        if (i4 <= i10 && i5 <= i4) {
            z2 = true;
        }
        if (!z2) {
            StringBuilder hotel = q.hotel(i4, i5, "Invalid offset: ", ". Valid range is [", " , ");
            hotel.append(i10);
            hotel.append(']');
            J0.a.alpha(hotel.toString());
        }
    }

    public void amber(v vVar) {
        coral(vVar.delta());
        vVar.echo(this);
    }

    public void azure(int i4) {
        byte b2 = (byte) i4;
        if (this.charlie == this.bravo) {
            uniform();
        }
        int i5 = this.charlie;
        this.charlie = i5 + 1;
        ((byte[]) this.delta)[i5] = b2;
    }

    public void beige(Oe.e eVar) {
        int size = eVar.size();
        int i4 = this.charlie;
        int i5 = this.bravo;
        int i10 = i5 - i4;
        byte[] bArr = (byte[]) this.delta;
        if (i10 >= size) {
            eVar.delta(0, i4, size, bArr);
            this.charlie += size;
            return;
        }
        eVar.delta(0, i4, i10, bArr);
        int i11 = size - i10;
        this.charlie = i5;
        uniform();
        if (i11 <= i5) {
            eVar.delta(i10, 0, i11, bArr);
            this.charlie = i11;
            return;
        }
        if (i10 >= 0) {
            if (i11 >= 0) {
                int i12 = i10 + i11;
                if (i12 <= eVar.size()) {
                    if (i11 > 0) {
                        eVar.tango((OutputStream) this.echo, i10, i11);
                        return;
                    }
                    return;
                } else {
                    StringBuilder sb2 = new StringBuilder(39);
                    sb2.append("Source end offset exceeded: ");
                    sb2.append(i12);
                    throw new IndexOutOfBoundsException(sb2.toString());
                }
            }
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(30);
        sb4.append("Source offset < 0: ");
        sb4.append(i10);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public void black(byte[] bArr) {
        int length = bArr.length;
        int i4 = this.charlie;
        int i5 = this.bravo;
        int i10 = i5 - i4;
        byte[] bArr2 = (byte[]) this.delta;
        if (i10 >= length) {
            System.arraycopy(bArr, 0, bArr2, i4, length);
            this.charlie += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i4, i10);
        int i11 = length - i10;
        this.charlie = i5;
        uniform();
        if (i11 <= i5) {
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            this.charlie = i11;
        } else {
            ((OutputStream) this.echo).write(bArr, i10, i11);
        }
    }

    public void blue(int i4) {
        azure(i4 & 255);
        azure((i4 >> 8) & 255);
        azure((i4 >> 16) & 255);
        azure((i4 >> 24) & 255);
    }

    public void bronze(long j5) {
        azure(((int) j5) & 255);
        azure(((int) (j5 >> 8)) & 255);
        azure(((int) (j5 >> 16)) & 255);
        azure(((int) (j5 >> 24)) & 255);
        azure(((int) (j5 >> 32)) & 255);
        azure(((int) (j5 >> 40)) & 255);
        azure(((int) (j5 >> 48)) & 255);
        azure(((int) (j5 >> 56)) & 255);
    }

    public void coral(int i4) {
        while ((i4 & (-128)) != 0) {
            azure((i4 & 127) | 128);
            i4 >>>= 7;
        }
        azure(i4);
    }

    public void crimson(long j5) {
        while (((-128) & j5) != 0) {
            azure((((int) j5) & 127) | 128);
            j5 >>>= 7;
        }
        azure((int) j5);
    }

    public void cyan(int i4, int i5) {
        coral((i4 << 3) | i5);
    }

    public void juliet() {
        if (((OutputStream) this.echo) != null) {
            uniform();
        }
    }

    public int kilo() {
        al alVar = (al) this.echo;
        if (alVar == null) {
            return ((String) this.delta).length();
        }
        return (alVar.bravo - alVar.charlie()) + (((String) this.delta).length() - (this.charlie - this.bravo));
    }

    public boolean lima(int i4) {
        int i5 = this.bravo + 1;
        if (i4 <= this.charlie && i5 <= i4) {
            CharSequence charSequence = (CharSequence) this.delta;
            if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i4))) {
                int i10 = i4 - 1;
                if (!Character.isSurrogate(charSequence.charAt(i10))) {
                    if (k.delta()) {
                        k alpha = k.alpha();
                        if (alpha.charlie() != 1 || alpha.bravo(charSequence, i10) == -1) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean mike(int i4) {
        int i5 = this.bravo + 1;
        if (i4 <= this.charlie && i5 <= i4) {
            return J4.foxtrot(Character.codePointBefore((CharSequence) this.delta, i4));
        }
        return false;
    }

    public boolean november(int i4) {
        alpha(i4);
        if (((BreakIterator) this.echo).isBoundary(i4)) {
            if (!papa(i4) || !papa(i4 - 1) || !papa(i4 + 1)) {
                if (i4 <= 0 || i4 >= ((CharSequence) this.delta).length() - 1 || (!oscar(i4) && !oscar(i4 + 1))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean oscar(int i4) {
        int i5 = i4 - 1;
        CharSequence charSequence = (CharSequence) this.delta;
        Character.UnicodeBlock of2 = Character.UnicodeBlock.of(charSequence.charAt(i5));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (!Intrinsics.areEqual(of2, unicodeBlock) || !Intrinsics.areEqual(Character.UnicodeBlock.of(charSequence.charAt(i4)), Character.UnicodeBlock.KATAKANA)) {
            if (Intrinsics.areEqual(Character.UnicodeBlock.of(charSequence.charAt(i4)), unicodeBlock) && Intrinsics.areEqual(Character.UnicodeBlock.of(charSequence.charAt(i5)), Character.UnicodeBlock.KATAKANA)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean papa(int i4) {
        if (i4 < this.charlie && this.bravo <= i4) {
            CharSequence charSequence = (CharSequence) this.delta;
            if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i4)) && !Character.isSurrogate(charSequence.charAt(i4))) {
                if (k.delta()) {
                    k alpha = k.alpha();
                    if (alpha.charlie() != 1 || alpha.bravo(charSequence, i4) == -1) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean quebec(int i4) {
        if (i4 < this.charlie && this.bravo <= i4) {
            return J4.foxtrot(Character.codePointAt((CharSequence) this.delta, i4));
        }
        return false;
    }

    public int sierra(int i4) {
        alpha(i4);
        int following = ((BreakIterator) this.echo).following(i4);
        if (papa(following - 1) && papa(following) && !oscar(following)) {
            return sierra(following);
        }
        return following;
    }

    public int tango(int i4) {
        alpha(i4);
        int preceding = ((BreakIterator) this.echo).preceding(i4);
        if (papa(preceding) && lima(preceding) && !oscar(preceding)) {
            return tango(preceding);
        }
        return preceding;
    }

    public String toString() {
        switch (this.alpha) {
            case 1:
                al alVar = (al) this.echo;
                if (alVar == null) {
                    return (String) this.delta;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) this.delta, 0, this.bravo);
                sb2.append((char[]) alVar.echo, 0, alVar.charlie);
                char[] cArr = (char[]) alVar.echo;
                int i4 = alVar.delta;
                sb2.append(cArr, i4, alVar.bravo - i4);
                String str = (String) this.delta;
                sb2.append((CharSequence) str, this.charlie, str.length());
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void uniform() {
        OutputStream outputStream = (OutputStream) this.echo;
        if (outputStream != null) {
            outputStream.write((byte[]) this.delta, 0, this.charlie);
            this.charlie = 0;
            return;
        }
        throw new IOException() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream$OutOfSpaceException
        };
    }

    public void victor(int i4, int i5, String str) {
        if (i4 > i5) {
            J0.a.alpha("start index must be less than or equal to end index: " + i4 + " > " + i5);
        }
        if (i4 < 0) {
            J0.a.alpha("start must be non-negative, but was " + i4);
        }
        al alVar = (al) this.echo;
        if (alVar == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i4, 64);
            int min2 = Math.min(((String) this.delta).length() - i5, 64);
            String str2 = (String) this.delta;
            int i10 = i4 - min;
            Intrinsics.charlie(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i10, i4, cArr, 0);
            String str3 = (String) this.delta;
            int i11 = max - min2;
            int i12 = min2 + i5;
            Intrinsics.charlie(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i5, i12, cArr, i11);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            al alVar2 = new al(1);
            alVar2.bravo = max;
            alVar2.echo = cArr;
            alVar2.charlie = length;
            alVar2.delta = i11;
            this.echo = alVar2;
            this.bravo = i10;
            this.charlie = i12;
            return;
        }
        int i13 = this.bravo;
        int i14 = i4 - i13;
        int i15 = i5 - i13;
        if (i14 >= 0 && i15 <= alVar.bravo - alVar.charlie()) {
            int length2 = str.length() - (i15 - i14);
            if (length2 > alVar.charlie()) {
                int charlie = length2 - alVar.charlie();
                int i16 = alVar.bravo;
                do {
                    i16 *= 2;
                } while (i16 - alVar.bravo < charlie);
                char[] cArr2 = new char[i16];
                ArraysKt.amber((char[]) alVar.echo, cArr2, 0, 0, alVar.charlie);
                int i17 = alVar.bravo;
                int i18 = alVar.delta;
                int i19 = i17 - i18;
                int i20 = i16 - i19;
                ArraysKt.amber((char[]) alVar.echo, cArr2, i20, i18, i19 + i18);
                alVar.echo = cArr2;
                alVar.bravo = i16;
                alVar.delta = i20;
            }
            int i21 = alVar.charlie;
            if (i14 < i21 && i15 <= i21) {
                int i22 = i21 - i15;
                char[] cArr3 = (char[]) alVar.echo;
                ArraysKt.amber(cArr3, cArr3, alVar.delta - i22, i15, i21);
                alVar.charlie = i14;
                alVar.delta -= i22;
            } else if (i14 < i21 && i15 >= i21) {
                alVar.delta = alVar.charlie() + i15;
                alVar.charlie = i14;
            } else {
                int charlie2 = alVar.charlie() + i14;
                int charlie3 = alVar.charlie() + i15;
                int i23 = alVar.delta;
                char[] cArr4 = (char[]) alVar.echo;
                ArraysKt.amber(cArr4, cArr4, alVar.charlie, i23, charlie2);
                alVar.charlie += charlie2 - i23;
                alVar.delta = charlie3;
            }
            str.getChars(0, str.length(), (char[]) alVar.echo, alVar.charlie);
            alVar.charlie = str.length() + alVar.charlie;
            return;
        }
        this.delta = toString();
        this.echo = null;
        this.bravo = -1;
        this.charlie = -1;
        victor(i4, i5, str);
    }

    public void whiskey(int i4, int i5) {
        cyan(i4, 0);
        yankee(i5);
    }

    public void xray(int i4, int i5) {
        cyan(i4, 0);
        yankee(i5);
    }

    public void yankee(int i4) {
        if (i4 >= 0) {
            coral(i4);
        } else {
            crimson(i4);
        }
    }

    public void zulu(int i4, v vVar) {
        cyan(i4, 2);
        amber(vVar);
    }

    public e(CharSequence charSequence, int i4, Locale locale) {
        this.alpha = 0;
        this.delta = charSequence;
        if (charSequence.length() < 0) {
            J0.a.alpha("input start index is outside the CharSequence");
        }
        if (i4 < 0 || i4 > charSequence.length()) {
            J0.a.alpha("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.echo = wordInstance;
        this.bravo = Math.max(0, -50);
        this.charlie = Math.min(charSequence.length(), i4 + 50);
        wordInstance.setText(new g(charSequence, i4));
    }

    public e(OutputStream outputStream, byte[] bArr) {
        this.alpha = 2;
        this.echo = outputStream;
        this.delta = bArr;
        this.charlie = 0;
        this.bravo = bArr.length;
    }

    public e(l lVar, C1915c c1915c) {
        this.alpha = 3;
        this.delta = new SparseArray();
        this.echo = lVar;
        TypedArray typedArray = (TypedArray) c1915c.red;
        this.bravo = typedArray.getResourceId(28, 0);
        this.charlie = typedArray.getResourceId(53, 0);
    }
}
