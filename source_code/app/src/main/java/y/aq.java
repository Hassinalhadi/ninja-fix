package y;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.e0;

/* loaded from: classes3.dex */
public final class aq {
    public final D0.g alpha;
    public final long bravo;
    public final D0.ak charlie;
    public final I0.t delta;
    public final C3353M echo;
    public long foxtrot;
    public final D0.g golf;
    public final I0.aa hotel;
    public final e0 india;

    public aq(I0.aa aaVar, I0.t tVar, e0 e0Var, C3353M c3353m) {
        D0.ak akVar;
        D0.g gVar = aaVar.alpha;
        if (e0Var != null) {
            akVar = e0Var.alpha;
        } else {
            akVar = null;
        }
        long j5 = aaVar.bravo;
        this.alpha = gVar;
        this.bravo = j5;
        this.charlie = akVar;
        this.delta = tVar;
        this.echo = c3353m;
        this.foxtrot = j5;
        this.golf = gVar;
        this.hotel = aaVar;
        this.india = e0Var;
    }

    public final List alpha(Function1 function1) {
        if (D0.am.charlie(this.foxtrot)) {
            I0.g gVar = (I0.g) function1.invoke(this);
            if (gVar != null) {
                return kotlin.collections.ab.juliet(gVar);
            }
            return null;
        }
        return CollectionsKt.listOf(new I0.a("", 0), new I0.z(D0.am.foxtrot(this.foxtrot), D0.am.foxtrot(this.foxtrot)));
    }

    public final Integer bravo() {
        D0.ak akVar = this.charlie;
        if (akVar != null) {
            int echo = D0.am.echo(this.foxtrot);
            I0.t tVar = this.delta;
            int originalToTransformed = tVar.originalToTransformed(echo);
            D0.o oVar = akVar.bravo;
            return Integer.valueOf(tVar.transformedToOriginal(oVar.charlie(oVar.delta(originalToTransformed), true)));
        }
        return null;
    }

    public final Integer charlie() {
        D0.ak akVar = this.charlie;
        if (akVar != null) {
            int foxtrot = D0.am.foxtrot(this.foxtrot);
            I0.t tVar = this.delta;
            return Integer.valueOf(tVar.transformedToOriginal(akVar.foxtrot(akVar.bravo.delta(tVar.originalToTransformed(foxtrot)))));
        }
        return null;
    }

    public final Integer delta() {
        int length;
        D0.ak akVar = this.charlie;
        if (akVar != null) {
            int romeo = romeo();
            while (true) {
                D0.g gVar = this.alpha;
                if (romeo >= gVar.purple.length()) {
                    length = gVar.purple.length();
                    break;
                }
                int length2 = this.golf.purple.length() - 1;
                if (romeo <= length2) {
                    length2 = romeo;
                }
                long india = akVar.india(length2);
                int i4 = D0.am.charlie;
                int i5 = (int) (india & 4294967295L);
                if (i5 <= romeo) {
                    romeo++;
                } else {
                    length = this.delta.transformedToOriginal(i5);
                    break;
                }
            }
            return Integer.valueOf(length);
        }
        return null;
    }

    public final Integer echo() {
        int i4;
        D0.ak akVar = this.charlie;
        if (akVar != null) {
            int romeo = romeo();
            while (true) {
                if (romeo <= 0) {
                    i4 = 0;
                    break;
                }
                int length = this.golf.purple.length() - 1;
                if (romeo <= length) {
                    length = romeo;
                }
                long india = akVar.india(length);
                int i5 = D0.am.charlie;
                int i10 = (int) (india >> 32);
                if (i10 >= romeo) {
                    romeo--;
                } else {
                    i4 = this.delta.transformedToOriginal(i10);
                    break;
                }
            }
            return Integer.valueOf(i4);
        }
        return null;
    }

    public final boolean foxtrot() {
        O0.j jVar;
        D0.ak akVar = this.charlie;
        if (akVar != null) {
            jVar = akVar.golf(romeo());
        } else {
            jVar = null;
        }
        if (jVar != O0.j.purple) {
            return true;
        }
        return false;
    }

    public final int golf(D0.ak akVar, int i4) {
        int romeo = romeo();
        C3353M c3353m = this.echo;
        if (c3353m.alpha == null) {
            c3353m.alpha = Float.valueOf(akVar.charlie(romeo).alpha);
        }
        int delta = akVar.bravo.delta(romeo) + i4;
        if (delta < 0) {
            return 0;
        }
        D0.o oVar = akVar.bravo;
        if (delta >= oVar.foxtrot) {
            return this.golf.purple.length();
        }
        float bravo = oVar.bravo(delta) - 1;
        Float f5 = c3353m.alpha;
        Intrinsics.checkNotNull(f5);
        float floatValue = f5.floatValue();
        if ((foxtrot() && floatValue >= akVar.echo(delta)) || (!foxtrot() && floatValue <= akVar.delta(delta))) {
            return oVar.charlie(delta, true);
        }
        return this.delta.transformedToOriginal(oVar.golf((Float.floatToRawIntBits(f5.floatValue()) << 32) | (Float.floatToRawIntBits(bravo) & 4294967295L)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int hotel(e0 e0Var, int i4) {
        Z.c cVar;
        q0.z zVar = e0Var.bravo;
        if (zVar != null) {
            q0.z zVar2 = e0Var.charlie;
            if (zVar2 != null) {
                cVar = zVar2.sierra(zVar, true);
            } else {
                cVar = null;
            }
        }
        cVar = Z.c.echo;
        long j5 = this.hotel.bravo;
        int i5 = D0.am.charlie;
        I0.t tVar = this.delta;
        int originalToTransformed = tVar.originalToTransformed((int) (j5 & 4294967295L));
        D0.ak akVar = e0Var.alpha;
        Z.c charlie = akVar.charlie(originalToTransformed);
        float intBitsToFloat = (Float.intBitsToFloat((int) (cVar.bravo() & 4294967295L)) * i4) + charlie.bravo;
        return tVar.transformedToOriginal(akVar.bravo.golf((Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(charlie.alpha) << 32)));
    }

    public final void india() {
        D0.g gVar = this.golf;
        C3353M c3353m = this.echo;
        c3353m.alpha = null;
        if (gVar.purple.length() > 0) {
            if (foxtrot()) {
                kilo();
                return;
            }
            c3353m.alpha = null;
            if (gVar.purple.length() > 0) {
                String str = gVar.purple;
                long j5 = this.foxtrot;
                int i4 = D0.am.charlie;
                int quebec = n.at.quebec((int) (j5 & 4294967295L), str);
                if (quebec != -1) {
                    quebec(quebec, quebec);
                }
            }
        }
    }

    public final void juliet() {
        this.echo.alpha = null;
        D0.g gVar = this.golf;
        if (gVar.purple.length() > 0) {
            int echo = D0.am.echo(this.foxtrot);
            String str = gVar.purple;
            int romeo = n.at.romeo(str, echo);
            if (romeo == D0.am.echo(this.foxtrot) && romeo != str.length()) {
                romeo = n.at.romeo(str, romeo + 1);
            }
            quebec(romeo, romeo);
        }
    }

    public final void kilo() {
        this.echo.alpha = null;
        D0.g gVar = this.golf;
        if (gVar.purple.length() > 0) {
            long j5 = this.foxtrot;
            int i4 = D0.am.charlie;
            int tango = n.at.tango((int) (j5 & 4294967295L), gVar.purple);
            if (tango != -1) {
                quebec(tango, tango);
            }
        }
    }

    public final void lima() {
        this.echo.alpha = null;
        D0.g gVar = this.golf;
        if (gVar.purple.length() > 0) {
            int foxtrot = D0.am.foxtrot(this.foxtrot);
            String str = gVar.purple;
            int sierra = n.at.sierra(str, foxtrot);
            if (sierra == D0.am.foxtrot(this.foxtrot) && sierra != 0) {
                sierra = n.at.sierra(str, sierra - 1);
            }
            quebec(sierra, sierra);
        }
    }

    public final void mike() {
        D0.g gVar = this.golf;
        C3353M c3353m = this.echo;
        c3353m.alpha = null;
        if (gVar.purple.length() > 0) {
            if (foxtrot()) {
                c3353m.alpha = null;
                if (gVar.purple.length() > 0) {
                    String str = gVar.purple;
                    long j5 = this.foxtrot;
                    int i4 = D0.am.charlie;
                    int quebec = n.at.quebec((int) (j5 & 4294967295L), str);
                    if (quebec != -1) {
                        quebec(quebec, quebec);
                        return;
                    }
                    return;
                }
                return;
            }
            kilo();
        }
    }

    public final void november() {
        Integer bravo;
        this.echo.alpha = null;
        if (this.golf.purple.length() > 0 && (bravo = bravo()) != null) {
            int intValue = bravo.intValue();
            quebec(intValue, intValue);
        }
    }

    public final void oscar() {
        Integer charlie;
        this.echo.alpha = null;
        if (this.golf.purple.length() > 0 && (charlie = charlie()) != null) {
            int intValue = charlie.intValue();
            quebec(intValue, intValue);
        }
    }

    public final void papa() {
        if (this.golf.purple.length() > 0) {
            int i4 = D0.am.charlie;
            this.foxtrot = D0.ae.bravo((int) (this.bravo >> 32), (int) (this.foxtrot & 4294967295L));
        }
    }

    public final void quebec(int i4, int i5) {
        this.foxtrot = D0.ae.bravo(i4, i5);
    }

    public final int romeo() {
        long j5 = this.foxtrot;
        int i4 = D0.am.charlie;
        return this.delta.originalToTransformed((int) (j5 & 4294967295L));
    }
}
