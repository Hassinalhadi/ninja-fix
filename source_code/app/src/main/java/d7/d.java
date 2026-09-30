package d7;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import s6.AbstractC2728o0;

/* loaded from: classes2.dex */
public final class d extends AbstractC2728o0 {
    public final /* synthetic */ Context alpha;
    public final /* synthetic */ TextPaint bravo;
    public final /* synthetic */ AbstractC2728o0 charlie;
    public final /* synthetic */ e delta;

    public d(e eVar, Context context, TextPaint textPaint, AbstractC2728o0 abstractC2728o0) {
        this.delta = eVar;
        this.alpha = context;
        this.bravo = textPaint;
        this.charlie = abstractC2728o0;
    }

    @Override // s6.AbstractC2728o0
    public final void bravo(int i4) {
        this.charlie.bravo(i4);
    }

    @Override // s6.AbstractC2728o0
    public final void charlie(Typeface typeface, boolean z2) {
        this.delta.foxtrot(this.alpha, this.bravo, typeface);
        this.charlie.charlie(typeface, z2);
    }
}
