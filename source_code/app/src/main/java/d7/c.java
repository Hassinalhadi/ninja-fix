package d7;

import android.graphics.Typeface;
import i1.AbstractC1881b;
import s6.AbstractC2728o0;

/* loaded from: classes2.dex */
public final class c extends AbstractC1881b {
    public final /* synthetic */ AbstractC2728o0 hotel;
    public final /* synthetic */ e india;

    public c(e eVar, AbstractC2728o0 abstractC2728o0) {
        this.india = eVar;
        this.hotel = abstractC2728o0;
    }

    @Override // i1.AbstractC1881b
    public final void india(int i4) {
        this.india.november = true;
        this.hotel.bravo(i4);
    }

    @Override // i1.AbstractC1881b
    public final void juliet(Typeface typeface) {
        e eVar = this.india;
        eVar.papa = Typeface.create(typeface, eVar.delta);
        eVar.november = true;
        this.hotel.charlie(eVar.papa, false);
    }
}
