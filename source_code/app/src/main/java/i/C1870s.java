package i;

import androidx.compose.foundation.lazy.layout.ac;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.p0;
import g.AbstractC1719b;

/* renamed from: i.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1870s {
    public final /* synthetic */ int alpha;
    public final p0 bravo;
    public final p0 charlie;
    public boolean delta;
    public Object echo;
    public final ac foxtrot;

    public C1870s(int i4, int i5, int i10) {
        this.alpha = i10;
        switch (i10) {
            case 1:
                this.bravo = C0564b.whiskey(i4);
                this.charlie = C0564b.whiskey(i5);
                this.foxtrot = new ac(i4, 90, 200);
                return;
            default:
                this.bravo = C0564b.whiskey(i4);
                this.charlie = C0564b.whiskey(i5);
                this.foxtrot = new ac(i4, 30, 100);
                return;
        }
    }

    public final int alpha() {
        switch (this.alpha) {
            case 0:
                return this.bravo.juliet();
            default:
                return this.bravo.juliet();
        }
    }

    public final int bravo() {
        switch (this.alpha) {
            case 0:
                return this.charlie.juliet();
            default:
                return this.charlie.juliet();
        }
    }

    public final void charlie(int i4, int i5) {
        switch (this.alpha) {
            case 0:
                if (i4 < 0.0f) {
                    AbstractC1719b.alpha("Index should be non-negative (" + i4 + ')');
                }
                this.bravo.kilo(i4);
                this.foxtrot.alpha(i4);
                this.charlie.kilo(i5);
                return;
            default:
                if (i4 < 0.0f) {
                    AbstractC1719b.alpha("Index should be non-negative");
                }
                this.bravo.kilo(i4);
                this.foxtrot.alpha(i4);
                this.charlie.kilo(i5);
                return;
        }
    }
}
