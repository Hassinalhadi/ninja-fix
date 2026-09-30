package S2;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class e extends Pd.c {
    public i alpha;
    public M2.b purple;
    public X2.h red;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f2032s;
    public Object silver;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f2033t;
    public X2.k teal;

    /* renamed from: u, reason: collision with root package name */
    public int f2034u;
    public M2.c white;
    public int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, Pd.c cVar) {
        super(cVar);
        this.f2033t = iVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f2032s = obj;
        this.f2034u |= RecyclerView.UNDEFINED_DURATION;
        return this.f2033t.charlie(null, null, null, null, null, this);
    }
}
