package F;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2366B;
import q0.AbstractC2367C;

/* loaded from: classes3.dex */
public final class G extends Lambda implements Function1 {
    public final /* synthetic */ AbstractC2367C alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ AbstractC2367C silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ AbstractC2367C white;
    public final /* synthetic */ int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(AbstractC2367C abstractC2367C, int i4, int i5, AbstractC2367C abstractC2367C2, int i10, AbstractC2367C abstractC2367C3, int i11) {
        super(1);
        this.alpha = abstractC2367C;
        this.purple = i4;
        this.red = i5;
        this.silver = abstractC2367C2;
        this.teal = i10;
        this.white = abstractC2367C3;
        this.yellow = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
        int i4 = this.red;
        AbstractC2367C abstractC2367C = this.alpha;
        if (abstractC2367C != null) {
            AbstractC2366B.juliet(abstractC2366B, abstractC2367C, 0, Math.round((1 + 0.0f) * ((i4 - this.purple) / 2.0f)));
        }
        AbstractC2367C abstractC2367C2 = this.silver;
        int i5 = this.teal;
        AbstractC2366B.juliet(abstractC2366B, abstractC2367C2, i5, 0);
        AbstractC2367C abstractC2367C3 = this.white;
        if (abstractC2367C3 != null) {
            AbstractC2366B.juliet(abstractC2366B, abstractC2367C3, i5 + abstractC2367C2.alpha, Math.round((1 + 0.0f) * ((i4 - this.yellow) / 2.0f)));
        }
        return Unit.INSTANCE;
    }
}
