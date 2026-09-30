package q0;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ah implements aq {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ aq bravo;
    public final /* synthetic */ al charlie;
    public final /* synthetic */ int delta;
    public final /* synthetic */ aq echo;

    public /* synthetic */ ah(aq aqVar, al alVar, int i4, aq aqVar2, int i5) {
        this.alpha = i5;
        this.charlie = alVar;
        this.delta = i4;
        this.echo = aqVar2;
        this.bravo = aqVar;
    }

    @Override // q0.aq
    public final int alpha() {
        switch (this.alpha) {
            case 0:
                return this.bravo.alpha();
            default:
                return this.bravo.alpha();
        }
    }

    @Override // q0.aq
    public final int bravo() {
        switch (this.alpha) {
            case 0:
                return this.bravo.bravo();
            default:
                return this.bravo.bravo();
        }
    }

    @Override // q0.aq
    public final Map charlie() {
        switch (this.alpha) {
            case 0:
                return this.bravo.charlie();
            default:
                return this.bravo.charlie();
        }
    }

    @Override // q0.aq
    public final void delta() {
        switch (this.alpha) {
            case 0:
                al alVar = this.charlie;
                alVar.teal = this.delta;
                this.echo.delta();
                bv.al alVar2 = alVar.e;
                long[] jArr = alVar2.alpha;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j5 = jArr[i4];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i10 = 0; i10 < i5; i10++) {
                                if ((255 & j5) < 128) {
                                    int i11 = (i4 << 3) + i10;
                                    Object obj = alVar2.bravo[i11];
                                    InterfaceC2377M interfaceC2377M = (InterfaceC2377M) alVar2.charlie[i11];
                                    int kilo = alVar.f13154f.kilo(obj);
                                    if (kilo < 0 || kilo >= alVar.teal) {
                                        interfaceC2377M.dispose();
                                        alVar2.lima(i11);
                                    }
                                }
                                j5 >>= 8;
                            }
                            if (i5 != 8) {
                                return;
                            }
                        }
                        if (i4 != length) {
                            i4++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            default:
                al alVar3 = this.charlie;
                alVar3.silver = this.delta;
                this.echo.delta();
                alVar3.delta(alVar3.silver);
                return;
        }
    }

    @Override // q0.aq
    public final Function1 echo() {
        switch (this.alpha) {
            case 0:
                return this.bravo.echo();
            default:
                return this.bravo.echo();
        }
    }
}
