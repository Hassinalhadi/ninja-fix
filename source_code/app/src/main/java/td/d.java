package td;

import kotlin.jvm.internal.Intrinsics;
import pf.C2359i;
import s6.AbstractC2770s7;
import ud.C3154b;
import ud.C3155c;

/* loaded from: classes2.dex */
public final class d {
    public final C3155c alpha;
    public int bravo;
    public int charlie;
    public c delta;

    public d(C3155c builder) {
        Intrinsics.echo(builder, "builder");
        this.alpha = builder;
        this.delta = (c) e.bravo.yankee();
    }

    public final C3154b alpha(String str) {
        if (this.bravo != 0) {
            int i4 = ud.g.alpha;
            int abs = Math.abs(ud.g.alpha(str, 0, str.length()));
            int i5 = this.charlie;
            while (true) {
                int i10 = abs % i5;
                int i11 = i10 * 6;
                if (this.delta.alpha(i11) != -1) {
                    if (bravo(str, i11)) {
                        return (C3154b) this.alpha.subSequence(this.delta.alpha(i11 + 3), this.delta.alpha(i11 + 4));
                    }
                    abs = i10 + 1;
                    i5 = this.charlie;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    public final boolean bravo(CharSequence charSequence, int i4) {
        int alpha = this.delta.alpha(i4 + 1);
        int alpha2 = this.delta.alpha(i4 + 2);
        int i5 = ud.g.alpha;
        C3155c c3155c = this.alpha;
        Intrinsics.echo(c3155c, "<this>");
        if (alpha2 - alpha == charSequence.length()) {
            for (int i10 = alpha; i10 < alpha2; i10++) {
                int charAt = c3155c.charAt(i10);
                if (65 <= charAt && charAt < 91) {
                    charAt += 32;
                }
                int charAt2 = charSequence.charAt(i10 - alpha);
                if (65 <= charAt2 && charAt2 < 91) {
                    charAt2 += 32;
                }
                if (charAt != charAt2) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final void charlie(int i4, int i5, int i10, int i11) {
        int i12;
        int i13 = this.bravo;
        double d4 = i13;
        int i14 = this.charlie;
        if (d4 >= i14 * 0.75d) {
            c cVar = this.delta;
            this.bravo = 0;
            this.charlie = (i14 * 2) | 128;
            c cVar2 = (c) e.bravo.yankee();
            int size = (cVar.alpha.size() * 2) | 1;
            for (int i15 = 0; i15 < size; i15++) {
                cVar2.alpha.add(e.alpha.yankee());
            }
            cVar2.getClass();
            this.delta = cVar2;
            C2359i bravo = AbstractC2770s7.bravo(new b(cVar, null));
            while (bravo.hasNext()) {
                int intValue = ((Number) bravo.next()).intValue();
                charlie(cVar.alpha(intValue + 1), cVar.alpha(intValue + 2), cVar.alpha(intValue + 3), cVar.alpha(intValue + 4));
            }
            e.bravo.s(cVar);
            if (i13 != this.bravo) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C3155c c3155c = this.alpha;
        int abs = Math.abs(ud.g.alpha(c3155c, i4, i5));
        CharSequence subSequence = c3155c.subSequence(i4, i5);
        int i16 = abs % this.charlie;
        int i17 = -1;
        while (true) {
            i12 = i16 * 6;
            if (this.delta.alpha(i12) == -1) {
                break;
            }
            if (bravo(subSequence, i12)) {
                i17 = i16;
            }
            i16 = (i16 + 1) % this.charlie;
        }
        this.delta.bravo(i12, abs);
        this.delta.bravo(i12 + 1, i4);
        this.delta.bravo(i12 + 2, i5);
        this.delta.bravo(i12 + 3, i10);
        this.delta.bravo(i12 + 4, i11);
        this.delta.bravo(i12 + 5, -1);
        if (i17 != -1) {
            this.delta.bravo((i17 * 6) + 5, i16);
        }
        this.bravo++;
    }

    public final void delta() {
        this.bravo = 0;
        this.charlie = 0;
        Id.a aVar = e.bravo;
        aVar.s(this.delta);
        this.delta = (c) aVar.yankee();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Id.a aVar = e.alpha;
        c cVar = this.delta;
        cVar.getClass();
        C2359i bravo = AbstractC2770s7.bravo(new b(cVar, null));
        while (bravo.hasNext()) {
            int intValue = ((Number) bravo.next()).intValue();
            sb2.append((CharSequence) "");
            int alpha = this.delta.alpha(intValue + 1);
            int alpha2 = this.delta.alpha(intValue + 2);
            sb2.append(this.alpha.subSequence(alpha, alpha2));
            sb2.append((CharSequence) " => ");
            sb2.append(r5.subSequence(this.delta.alpha(intValue + 3), this.delta.alpha(intValue + 4)));
            sb2.append((CharSequence) "\n");
        }
        return sb2.toString();
    }
}
