package J1;

import Q0.n;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.InterfaceC0539e;
import androidx.compose.foundation.layout.InterfaceC0541g;

/* loaded from: classes3.dex */
public final class e implements InterfaceC0539e, InterfaceC0541g {
    public final /* synthetic */ int alpha;
    public float bravo;

    public e(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 1:
                this.bravo = 0;
                return;
            case 2:
                this.bravo = 0;
                return;
            case 3:
                this.bravo = 0;
                return;
            case 4:
                this.bravo = 0;
                return;
            default:
                return;
        }
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0539e, androidx.compose.foundation.layout.InterfaceC0541g
    public float alpha() {
        switch (this.alpha) {
            case 1:
                return this.bravo;
            case 2:
                return this.bravo;
            case 3:
                return this.bravo;
            default:
                return this.bravo;
        }
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0541g
    public void bravo(Q0.d dVar, int i4, int[] iArr, int[] iArr2) {
        switch (this.alpha) {
            case 1:
                AbstractC0542h.alpha(i4, iArr, iArr2, false);
                return;
            case 2:
                AbstractC0542h.delta(i4, iArr, iArr2, false);
                return;
            case 3:
                AbstractC0542h.echo(i4, iArr, iArr2, false);
                return;
            default:
                AbstractC0542h.foxtrot(i4, iArr, iArr2, false);
                return;
        }
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0539e
    public void charlie(Q0.d dVar, int i4, int[] iArr, n nVar, int[] iArr2) {
        switch (this.alpha) {
            case 1:
                if (nVar == n.alpha) {
                    AbstractC0542h.alpha(i4, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC0542h.alpha(i4, iArr, iArr2, true);
                    return;
                }
            case 2:
                if (nVar == n.alpha) {
                    AbstractC0542h.delta(i4, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC0542h.delta(i4, iArr, iArr2, true);
                    return;
                }
            case 3:
                if (nVar == n.alpha) {
                    AbstractC0542h.echo(i4, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC0542h.echo(i4, iArr, iArr2, true);
                    return;
                }
            default:
                if (nVar == n.alpha) {
                    AbstractC0542h.foxtrot(i4, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC0542h.foxtrot(i4, iArr, iArr2, true);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.alpha) {
            case 1:
                return "Arrangement#Center";
            case 2:
                return "Arrangement#SpaceAround";
            case 3:
                return "Arrangement#SpaceBetween";
            case 4:
                return "Arrangement#SpaceEvenly";
            default:
                return super.toString();
        }
    }
}
