package C1;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class j extends Pd.c {
    public Object alpha;
    public Object purple;
    public Object red;

    /* renamed from: s, reason: collision with root package name */
    public int f774s;
    public Ref.ObjectRef silver;
    public ap teal;
    public /* synthetic */ Object white;
    public final /* synthetic */ k yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Pd.c cVar) {
        super(cVar);
        this.yellow = kVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.white = obj;
        this.f774s |= RecyclerView.UNDEFINED_DURATION;
        return this.yellow.alpha(null, this);
    }
}
