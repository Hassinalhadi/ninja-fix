package L0;

import a0.AbstractC0362p;
import a0.C0366t;
import a0.ak;
import a0.ao;
import a0.aq;
import a0.ar;
import a0.au;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ad;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import s6.C6;

/* loaded from: classes3.dex */
public final class f extends TextPaint {
    public Be.e alpha;
    public O0.l bravo;
    public int charlie;
    public ar delta;
    public C0366t echo;
    public AbstractC0362p foxtrot;
    public ad golf;
    public Z.e hotel;
    public c0.e india;

    public final ak alpha() {
        Be.e eVar = this.alpha;
        if (eVar != null) {
            return eVar;
        }
        Be.e eVar2 = new Be.e(this);
        this.alpha = eVar2;
        return eVar2;
    }

    public final void bravo(int i4) {
        if (i4 == this.charlie) {
            return;
        }
        ((Be.e) alpha()).november(i4);
        this.charlie = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r1 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void charlie(AbstractC0362p abstractC0362p, long j5, float f5) {
        Shader shader;
        boolean alpha;
        if (abstractC0362p == null) {
            this.golf = null;
            this.foxtrot = null;
            this.hotel = null;
            setShader(null);
            return;
        }
        if (abstractC0362p instanceof au) {
            delta(C6.bravo(f5, ((au) abstractC0362p).alpha));
            return;
        }
        if (abstractC0362p instanceof aq) {
            boolean z2 = false;
            if (Intrinsics.areEqual(this.foxtrot, abstractC0362p)) {
                Z.e eVar = this.hotel;
                if (eVar == null) {
                    alpha = false;
                } else {
                    alpha = Z.e.alpha(eVar.alpha, j5);
                }
            }
            if (j5 != 9205357640488583168L) {
                z2 = true;
            }
            if (z2) {
                this.foxtrot = abstractC0362p;
                this.hotel = new Z.e(j5);
                this.golf = C0564b.quebec(new e(j5, 0, abstractC0362p));
            }
            ak alpha2 = alpha();
            ad adVar = this.golf;
            if (adVar != null) {
                shader = (Shader) adVar.getValue();
            } else {
                shader = null;
            }
            ((Be.e) alpha2).sierra(shader);
            this.echo = null;
            k.bravo(this, f5);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void delta(long j5) {
        boolean charlie;
        C0366t c0366t = this.echo;
        boolean z2 = false;
        if (c0366t == null) {
            charlie = false;
        } else {
            charlie = C0366t.charlie(c0366t.alpha, j5);
        }
        if (!charlie) {
            if (j5 != 16) {
                z2 = true;
            }
            if (z2) {
                this.echo = new C0366t(j5);
                setColor(ao.beige(j5));
                this.golf = null;
                this.foxtrot = null;
                this.hotel = null;
                setShader(null);
            }
        }
    }

    public final void echo(c0.e eVar) {
        if (eVar != null && !Intrinsics.areEqual(this.india, eVar)) {
            this.india = eVar;
            if (Intrinsics.areEqual(eVar, c0.g.alpha)) {
                setStyle(Paint.Style.FILL);
                return;
            }
            if (eVar instanceof c0.h) {
                ((Be.e) alpha()).yankee(1);
                c0.h hVar = (c0.h) eVar;
                ((Be.e) alpha()).xray(hVar.alpha);
                ((Paint) ((Be.e) alpha()).bravo).setStrokeMiter(hVar.bravo);
                ((Be.e) alpha()).whiskey(hVar.delta);
                ((Be.e) alpha()).victor(hVar.charlie);
                ((Be.e) alpha()).romeo(hVar.echo);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void foxtrot(ar arVar) {
        if (arVar != null && !Intrinsics.areEqual(this.delta, arVar)) {
            this.delta = arVar;
            if (Intrinsics.areEqual(arVar, ar.delta)) {
                clearShadowLayer();
                return;
            }
            ar arVar2 = this.delta;
            float f5 = arVar2.charlie;
            if (f5 == 0.0f) {
                f5 = Float.MIN_VALUE;
            }
            setShadowLayer(f5, Float.intBitsToFloat((int) (arVar2.bravo >> 32)), Float.intBitsToFloat((int) (this.delta.bravo & 4294967295L)), ao.beige(this.delta.alpha));
        }
    }

    public final void golf(O0.l lVar) {
        boolean z2;
        if (lVar != null && !Intrinsics.areEqual(this.bravo, lVar)) {
            this.bravo = lVar;
            int i4 = lVar.alpha;
            boolean z10 = false;
            if ((i4 | 1) == i4) {
                z2 = true;
            } else {
                z2 = false;
            }
            setUnderlineText(z2);
            O0.l lVar2 = this.bravo;
            lVar2.getClass();
            int i5 = lVar2.alpha;
            if ((i5 | 2) == i5) {
                z10 = true;
            }
            setStrikeThruText(z10);
        }
    }
}
