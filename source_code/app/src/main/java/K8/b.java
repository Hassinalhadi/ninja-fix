package K8;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b extends Pd.c {
    public Map alpha;
    public Iterator purple;
    public d red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f1675s;
    public Ef.a silver;

    /* renamed from: t, reason: collision with root package name */
    public int f1676t;
    public Map teal;
    public Object white;
    public /* synthetic */ Object yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Pd.c cVar2) {
        super(cVar2);
        this.f1675s = cVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.yellow = obj;
        this.f1676t |= RecyclerView.UNDEFINED_DURATION;
        return this.f1675s.bravo(this);
    }
}
