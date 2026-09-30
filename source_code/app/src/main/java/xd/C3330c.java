package xd;

import androidx.recyclerview.widget.RecyclerView;
import io.ktor.utils.io.t;
import java.nio.charset.Charset;

/* renamed from: xd.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3330c extends Pd.c {
    public Charset alpha;
    public Object purple;
    public t red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ C3337j teal;
    public int white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3330c(C3337j c3337j, Pd.c cVar) {
        super(cVar);
        this.teal = c3337j;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.silver = obj;
        this.white |= RecyclerView.UNDEFINED_DURATION;
        return this.teal.alpha(null, null, null, this);
    }
}
