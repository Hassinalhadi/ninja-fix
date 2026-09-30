package I0;

import D0.am;
import I.al;
import android.view.View;
import j1.C1929c;
import s1.InterfaceC2587u;
import s1.a0;
import s6.AbstractC2804w5;

/* loaded from: classes3.dex */
public final class i implements InterfaceC2587u {
    public final /* synthetic */ int alpha = 0;
    public int purple;
    public int red;
    public int silver;
    public int teal;
    public final Object white;

    public i(D0.g gVar, long j5) {
        String str = gVar.purple;
        F0.e eVar = new F0.e();
        eVar.delta = str;
        eVar.bravo = -1;
        eVar.charlie = -1;
        this.white = eVar;
        this.purple = am.foxtrot(j5);
        this.red = am.echo(j5);
        this.silver = -1;
        this.teal = -1;
        int foxtrot = am.foxtrot(j5);
        int echo = am.echo(j5);
        String str2 = gVar.purple;
        if (foxtrot >= 0 && foxtrot <= str2.length()) {
            if (echo < 0 || echo > str2.length()) {
                StringBuilder sierra = Q0.c.sierra(echo, "end (", ") offset is outside of text region ");
                sierra.append(str2.length());
                throw new IndexOutOfBoundsException(sierra.toString());
            }
            if (foxtrot > echo) {
                throw new IllegalArgumentException(A0.z.juliet("Do not set reversed range: ", foxtrot, echo, " > "));
            }
            return;
        }
        StringBuilder sierra2 = Q0.c.sierra(foxtrot, "start (", ") offset is outside of text region ");
        sierra2.append(str2.length());
        throw new IndexOutOfBoundsException(sierra2.toString());
    }

    public void alpha(int i4, int i5) {
        long bravo = D0.ae.bravo(i4, i5);
        ((F0.e) this.white).victor(i4, i5, "");
        long alpha = AbstractC2804w5.alpha(D0.ae.bravo(this.purple, this.red), bravo);
        hotel(am.foxtrot(alpha));
        golf(am.echo(alpha));
        int i10 = this.silver;
        if (i10 != -1) {
            long alpha2 = AbstractC2804w5.alpha(D0.ae.bravo(i10, this.teal), bravo);
            if (am.charlie(alpha2)) {
                this.silver = -1;
                this.teal = -1;
            } else {
                this.silver = am.foxtrot(alpha2);
                this.teal = am.echo(alpha2);
            }
        }
    }

    public char bravo(int i4) {
        F0.e eVar = (F0.e) this.white;
        al alVar = (al) eVar.echo;
        if (alVar == null) {
            return ((String) eVar.delta).charAt(i4);
        }
        if (i4 < eVar.bravo) {
            return ((String) eVar.delta).charAt(i4);
        }
        int charlie = alVar.bravo - alVar.charlie();
        int i5 = eVar.bravo;
        if (i4 < charlie + i5) {
            int i10 = i4 - i5;
            int i11 = alVar.charlie;
            if (i10 < i11) {
                return ((char[]) alVar.echo)[i10];
            }
            return ((char[]) alVar.echo)[(i10 - i11) + alVar.delta];
        }
        return ((String) eVar.delta).charAt(i4 - ((charlie - eVar.charlie) + i5));
    }

    public am charlie() {
        int i4 = this.silver;
        if (i4 != -1) {
            return new am(D0.ae.bravo(i4, this.teal));
        }
        return null;
    }

    public void delta(int i4, int i5, String str) {
        F0.e eVar = (F0.e) this.white;
        if (i4 >= 0 && i4 <= eVar.kilo()) {
            if (i5 >= 0 && i5 <= eVar.kilo()) {
                if (i4 <= i5) {
                    eVar.victor(i4, i5, str);
                    hotel(str.length() + i4);
                    golf(str.length() + i4);
                    this.silver = -1;
                    this.teal = -1;
                    return;
                }
                throw new IllegalArgumentException(A0.z.juliet("Do not set reversed range: ", i4, i5, " > "));
            }
            StringBuilder sierra = Q0.c.sierra(i5, "end (", ") offset is outside of text region ");
            sierra.append(eVar.kilo());
            throw new IndexOutOfBoundsException(sierra.toString());
        }
        StringBuilder sierra2 = Q0.c.sierra(i4, "start (", ") offset is outside of text region ");
        sierra2.append(eVar.kilo());
        throw new IndexOutOfBoundsException(sierra2.toString());
    }

    public void echo(int i4, int i5) {
        F0.e eVar = (F0.e) this.white;
        if (i4 >= 0 && i4 <= eVar.kilo()) {
            if (i5 >= 0 && i5 <= eVar.kilo()) {
                if (i4 < i5) {
                    this.silver = i4;
                    this.teal = i5;
                    return;
                }
                throw new IllegalArgumentException(A0.z.juliet("Do not set reversed or empty range: ", i4, i5, " > "));
            }
            StringBuilder sierra = Q0.c.sierra(i5, "end (", ") offset is outside of text region ");
            sierra.append(eVar.kilo());
            throw new IndexOutOfBoundsException(sierra.toString());
        }
        StringBuilder sierra2 = Q0.c.sierra(i4, "start (", ") offset is outside of text region ");
        sierra2.append(eVar.kilo());
        throw new IndexOutOfBoundsException(sierra2.toString());
    }

    public void foxtrot(int i4, int i5) {
        F0.e eVar = (F0.e) this.white;
        if (i4 >= 0 && i4 <= eVar.kilo()) {
            if (i5 >= 0 && i5 <= eVar.kilo()) {
                if (i4 <= i5) {
                    hotel(i4);
                    golf(i5);
                    return;
                }
                throw new IllegalArgumentException(A0.z.juliet("Do not set reversed range: ", i4, i5, " > "));
            }
            StringBuilder sierra = Q0.c.sierra(i5, "end (", ") offset is outside of text region ");
            sierra.append(eVar.kilo());
            throw new IndexOutOfBoundsException(sierra.toString());
        }
        StringBuilder sierra2 = Q0.c.sierra(i4, "start (", ") offset is outside of text region ");
        sierra2.append(eVar.kilo());
        throw new IndexOutOfBoundsException(sierra2.toString());
    }

    @Override // s1.InterfaceC2587u
    public a0 gold(View view, a0 a0Var) {
        C1929c golf = a0Var.alpha.golf(519);
        View view2 = (View) this.white;
        int i4 = this.purple;
        if (i4 >= 0) {
            view2.getLayoutParams().height = i4 + golf.bravo;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.red + golf.alpha, this.silver + golf.bravo, this.teal + golf.charlie, view2.getPaddingBottom());
        return a0Var;
    }

    public void golf(int i4) {
        boolean z2;
        if (i4 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            J0.a.alpha("Cannot set selectionEnd to a negative value: " + i4);
        }
        this.red = i4;
    }

    public void hotel(int i4) {
        boolean z2;
        if (i4 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            J0.a.alpha("Cannot set selectionStart to a negative value: " + i4);
        }
        this.purple = i4;
    }

    public String toString() {
        switch (this.alpha) {
            case 0:
                return ((F0.e) this.white).toString();
            default:
                return super.toString();
        }
    }

    public i(View view, int i4, int i5, int i10, int i11) {
        this.purple = i4;
        this.white = view;
        this.red = i5;
        this.silver = i10;
        this.teal = i11;
    }
}
