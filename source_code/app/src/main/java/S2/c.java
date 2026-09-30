package S2;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class c extends Pd.c {
    public i alpha;
    public X2.h purple;
    public Object red;

    /* renamed from: s, reason: collision with root package name */
    public Ref.ObjectRef f2027s;
    public Object silver;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f2028t;
    public Ref.ObjectRef teal;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f2029u;

    /* renamed from: v, reason: collision with root package name */
    public int f2030v;
    public Ref.ObjectRef white;
    public Ref.ObjectRef yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, Pd.c cVar) {
        super(cVar);
        this.f2029u = iVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f2028t = obj;
        this.f2030v |= RecyclerView.UNDEFINED_DURATION;
        return i.bravo(this.f2029u, null, null, null, null, this);
    }
}
