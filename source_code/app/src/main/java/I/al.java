package I;

import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import t6.AbstractC3051r3;
import y.C3382v;

/* loaded from: classes3.dex */
public final class al {
    public final /* synthetic */ int alpha;
    public int bravo;
    public int charlie;
    public int delta;
    public Object echo;

    public /* synthetic */ al(int i4) {
        this.alpha = i4;
    }

    public void alpha(com.squareup.moshi.ae aeVar) {
        aeVar.red = null;
        aeVar.alpha = null;
        aeVar.purple = null;
        aeVar.f11959b = 1;
        int i4 = this.bravo;
        if (i4 > 0) {
            int i5 = this.delta;
            if ((i5 & 1) == 0) {
                this.delta = i5 + 1;
                this.bravo = i4 - 1;
                this.charlie++;
            }
        }
        aeVar.alpha = (com.squareup.moshi.ae) this.echo;
        this.echo = aeVar;
        int i10 = this.delta;
        int i11 = i10 + 1;
        this.delta = i11;
        int i12 = this.bravo;
        if (i12 > 0 && (i11 & 1) == 0) {
            this.delta = i10 + 2;
            this.bravo = i12 - 1;
            this.charlie++;
        }
        int i13 = 4;
        while (true) {
            int i14 = i13 - 1;
            if ((this.delta & i14) == i14) {
                int i15 = this.charlie;
                if (i15 == 0) {
                    com.squareup.moshi.ae aeVar2 = (com.squareup.moshi.ae) this.echo;
                    com.squareup.moshi.ae aeVar3 = aeVar2.alpha;
                    com.squareup.moshi.ae aeVar4 = aeVar3.alpha;
                    aeVar3.alpha = aeVar4.alpha;
                    this.echo = aeVar3;
                    aeVar3.purple = aeVar4;
                    aeVar3.red = aeVar2;
                    aeVar3.f11959b = aeVar2.f11959b + 1;
                    aeVar4.alpha = aeVar3;
                    aeVar2.alpha = aeVar3;
                } else if (i15 == 1) {
                    com.squareup.moshi.ae aeVar5 = (com.squareup.moshi.ae) this.echo;
                    com.squareup.moshi.ae aeVar6 = aeVar5.alpha;
                    this.echo = aeVar6;
                    aeVar6.red = aeVar5;
                    aeVar6.f11959b = aeVar5.f11959b + 1;
                    aeVar5.alpha = aeVar6;
                    this.charlie = 0;
                } else if (i15 == 2) {
                    this.charlie = 0;
                }
                i13 *= 2;
            } else {
                return;
            }
        }
    }

    public C3382v bravo(int i4) {
        return new C3382v(AbstractC3051r3.alpha((D0.ak) this.echo, i4), i4, 1L);
    }

    public int charlie() {
        return this.delta - this.charlie;
    }

    public int delta(int i4) {
        return ((am) this.echo).charlie[this.charlie + i4];
    }

    public Object echo(int i4) {
        return ((am) this.echo).echo[this.delta + i4];
    }

    public String toString() {
        switch (this.alpha) {
            case 1:
                return "";
            case 2:
            default:
                return super.toString();
            case 3:
                StringBuilder sb2 = new StringBuilder("SelectionInfo(id=1, range=(");
                int i4 = this.bravo;
                sb2.append(i4);
                sb2.append(NumberOnlyZipVisualTransformation.HYPHEN);
                D0.ak akVar = (D0.ak) this.echo;
                sb2.append(AbstractC3051r3.alpha(akVar, i4));
                sb2.append(',');
                int i5 = this.charlie;
                sb2.append(i5);
                sb2.append(NumberOnlyZipVisualTransformation.HYPHEN);
                sb2.append(AbstractC3051r3.alpha(akVar, i5));
                sb2.append("), prevOffset=");
                return Q0.c.quebec(sb2, this.delta, ')');
        }
    }

    public al(am amVar) {
        this.alpha = 0;
        this.echo = amVar;
    }

    public al(int i4, int i5, int i10, D0.ak akVar) {
        this.alpha = 3;
        this.bravo = i4;
        this.charlie = i5;
        this.delta = i10;
        this.echo = akVar;
    }
}
