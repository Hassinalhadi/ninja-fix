package Pf;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class aa extends a {
    public final O7.l echo;
    public int foxtrot = 128;
    public final c golf;

    public aa(O7.l lVar, char[] cArr) {
        this.echo = lVar;
        this.golf = new c(cArr);
        black(0);
    }

    @Override // Pf.a
    public final String amber(int i4, int i5) {
        c cVar = this.golf;
        return kotlin.text.r.echo(cVar.alpha, i4, Math.min(i5, cVar.purple));
    }

    public final void black(int i4) {
        c cVar = this.golf;
        char[] cArr = cVar.alpha;
        if (i4 != 0) {
            int i5 = this.alpha;
            ArraysKt.amber(cArr, cArr, 0, i5, i5 + i4);
        }
        int i10 = cVar.purple;
        while (true) {
            if (i4 == i10) {
                break;
            }
            O7.l lVar = this.echo;
            lVar.getClass();
            int alpha = ((i) lVar.purple).alpha(cArr, i4, i10 - i4);
            if (alpha == -1) {
                cVar.purple = Math.min(cVar.alpha.length, i4);
                this.foxtrot = -1;
                break;
            }
            i4 += alpha;
        }
        this.alpha = 0;
    }

    @Override // Pf.a
    public final void bravo(int i4, int i5) {
        this.delta.append(this.golf.alpha, i4, i5 - i4);
    }

    @Override // Pf.a
    public boolean charlie() {
        oscar();
        int i4 = this.alpha;
        while (true) {
            int yankee = yankee(i4);
            if (yankee != -1) {
                char c3 = this.golf.alpha[yankee];
                if (c3 != ' ' && c3 != '\n' && c3 != '\r' && c3 != '\t') {
                    this.alpha = yankee;
                    return a.uniform(c3);
                }
                i4 = yankee + 1;
            } else {
                this.alpha = yankee;
                return false;
            }
        }
    }

    @Override // Pf.a
    public final String echo() {
        char[] cArr;
        String str;
        hotel('\"');
        int i4 = this.alpha;
        c cVar = this.golf;
        int i5 = cVar.purple;
        int i10 = i4;
        while (true) {
            cArr = cVar.alpha;
            if (i10 < i5) {
                if (cArr[i10] == '\"') {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            int yankee = yankee(i4);
            if (yankee == -1) {
                int i11 = this.alpha;
                int i12 = i11 - 1;
                if (i11 != cVar.purple && i12 >= 0) {
                    str = String.valueOf(cVar.alpha[i12]);
                } else {
                    str = "EOF";
                }
                a.romeo(this, ao.ad.gray("Expected quotation mark '\"', but had '", str, "' instead"), i12, null, 4);
                throw null;
            }
            return kilo(cVar, this.alpha, yankee);
        }
        for (int i13 = i4; i13 < i10; i13++) {
            if (cArr[i13] == '\\') {
                return kilo(cVar, this.alpha, i13);
            }
        }
        this.alpha = i10 + 1;
        return kotlin.text.r.echo(cArr, i4, Math.min(i10, cVar.purple));
    }

    @Override // Pf.a
    public byte foxtrot() {
        oscar();
        int i4 = this.alpha;
        while (true) {
            int yankee = yankee(i4);
            if (yankee != -1) {
                int i5 = yankee + 1;
                byte golf = r.golf(this.golf.alpha[yankee]);
                if (golf != 3) {
                    this.alpha = i5;
                    return golf;
                }
                i4 = i5;
            } else {
                this.alpha = yankee;
                return (byte) 10;
            }
        }
    }

    @Override // Pf.a
    public void hotel(char c3) {
        oscar();
        int i4 = this.alpha;
        while (true) {
            int yankee = yankee(i4);
            if (yankee != -1) {
                int i5 = yankee + 1;
                char c4 = this.golf.alpha[yankee];
                if (c4 != ' ' && c4 != '\n' && c4 != '\r' && c4 != '\t') {
                    this.alpha = i5;
                    if (c4 == c3) {
                        return;
                    }
                    beige(c3);
                    throw null;
                }
                i4 = i5;
            } else {
                this.alpha = yankee;
                beige(c3);
                throw null;
            }
        }
    }

    @Override // Pf.a
    public final void oscar() {
        int i4 = this.golf.purple - this.alpha;
        if (i4 > this.foxtrot) {
            return;
        }
        black(i4);
    }

    @Override // Pf.a
    public final CharSequence tango() {
        return this.golf;
    }

    @Override // Pf.a
    public final String victor(String keyToMatch, boolean z2) {
        Intrinsics.echo(keyToMatch, "keyToMatch");
        return null;
    }

    @Override // Pf.a
    public final int yankee(int i4) {
        c cVar = this.golf;
        if (i4 < cVar.purple) {
            return i4;
        }
        this.alpha = i4;
        oscar();
        if (this.alpha == 0 && cVar.length() != 0) {
            return 0;
        }
        return -1;
    }

    @Override // Pf.a
    public int zulu() {
        int yankee;
        char c3;
        int i4 = this.alpha;
        while (true) {
            yankee = yankee(i4);
            if (yankee == -1 || !((c3 = this.golf.alpha[yankee]) == ' ' || c3 == '\n' || c3 == '\r' || c3 == '\t')) {
                break;
            }
            i4 = yankee + 1;
        }
        this.alpha = yankee;
        return yankee;
    }
}
