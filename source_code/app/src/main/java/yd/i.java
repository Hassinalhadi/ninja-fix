package yd;

import androidx.recyclerview.widget.RecyclerView;
import io.ktor.utils.io.ag;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class i extends Pd.c {
    public Object alpha;
    public Object purple;
    public Charset red;

    /* renamed from: s, reason: collision with root package name */
    public int f14159s;
    public ag silver;
    public C3417a teal;
    public /* synthetic */ Object white;
    public final /* synthetic */ j yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Pd.c cVar) {
        super(cVar);
        this.yellow = jVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.white = obj;
        this.f14159s |= RecyclerView.UNDEFINED_DURATION;
        return j.alpha(this.yellow, null, null, null, null, this);
    }
}
