package U;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class a extends Lambda implements Xd.n {
    public final /* synthetic */ c alpha;
    public final /* synthetic */ int purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i4) {
        super(4);
        this.alpha = cVar;
        this.purple = i4;
    }

    @Override // Xd.n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        c cVar = this.alpha;
        O7.j jVar = cVar.alpha;
        ((AutofillManager) jVar.purple).notifyViewEntered(cVar.charlie, this.purple, new Rect(intValue, intValue2, intValue3, intValue4));
        return Unit.INSTANCE;
    }
}
