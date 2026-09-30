package C1;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class ae extends Pd.c {
    public Object alpha;
    public Object purple;
    public Serializable red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ap f772s;
    public Ref.ObjectRef silver;

    /* renamed from: t, reason: collision with root package name */
    public int f773t;
    public boolean teal;
    public int white;
    public /* synthetic */ Object yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(ap apVar, Pd.c cVar) {
        super(cVar);
        this.f772s = apVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.yellow = obj;
        this.f773t |= RecyclerView.UNDEFINED_DURATION;
        return ap.golf(this.f772s, false, this);
    }
}
