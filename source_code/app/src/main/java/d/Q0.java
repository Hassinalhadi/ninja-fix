package d;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class Q0 extends Pd.c {
    public kotlin.e alpha;
    public Function0 purple;
    public float red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ R0 teal;
    public int white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(R0 r02, Pd.c cVar) {
        super(cVar);
        this.teal = r02;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.silver = obj;
        this.white |= RecyclerView.UNDEFINED_DURATION;
        return this.teal.alpha(null, null, this);
    }
}
