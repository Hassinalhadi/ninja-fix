package bz;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class O extends Pd.c {
    public C0788m alpha;
    public InterfaceC0783h purple;
    public Function1 red;
    public Ref.ObjectRef silver;
    public /* synthetic */ Object teal;
    public int white;

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.teal = obj;
        this.white |= RecyclerView.UNDEFINED_DURATION;
        return P.bravo(null, null, 0L, null, this);
    }
}
