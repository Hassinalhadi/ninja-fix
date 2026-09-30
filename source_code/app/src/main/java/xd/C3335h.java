package xd;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;

/* renamed from: xd.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3335h extends Pd.c {
    public sd.e alpha;
    public Charset purple;
    public Ed.a red;
    public Object silver;
    public /* synthetic */ Object teal;
    public final /* synthetic */ C3337j white;
    public int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3335h(C3337j c3337j, Pd.c cVar) {
        super(cVar);
        this.white = c3337j;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.teal = obj;
        this.yellow |= RecyclerView.UNDEFINED_DURATION;
        return this.white.bravo(null, null, null, null, this);
    }
}
