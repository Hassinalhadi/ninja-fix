package d7;

import android.graphics.Typeface;
import s6.AbstractC2728o0;

/* loaded from: classes2.dex */
public final class b extends AbstractC2728o0 {
    public final Typeface alpha;
    public final InterfaceC1591a bravo;
    public boolean charlie;

    public b(InterfaceC1591a interfaceC1591a, Typeface typeface) {
        this.alpha = typeface;
        this.bravo = interfaceC1591a;
    }

    @Override // s6.AbstractC2728o0
    public final void bravo(int i4) {
        if (!this.charlie) {
            this.bravo.whiskey(this.alpha);
        }
    }

    @Override // s6.AbstractC2728o0
    public final void charlie(Typeface typeface, boolean z2) {
        if (!this.charlie) {
            this.bravo.whiskey(typeface);
        }
    }
}
