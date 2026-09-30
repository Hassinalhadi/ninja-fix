package S2;

import R2.m;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class b extends Pd.c {
    public i alpha;
    public m purple;
    public M2.b red;

    /* renamed from: s, reason: collision with root package name */
    public int f2023s;
    public X2.h silver;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f2024t;
    public Object teal;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f2025u;

    /* renamed from: v, reason: collision with root package name */
    public int f2026v;
    public X2.k white;
    public M2.c yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, Pd.c cVar) {
        super(cVar);
        this.f2025u = iVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f2024t = obj;
        this.f2026v |= RecyclerView.UNDEFINED_DURATION;
        return i.alpha(this.f2025u, null, null, null, null, null, null, this);
    }
}
