package M2;

import K1.l;
import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class h extends Pd.c {
    public k alpha;
    public l purple;
    public X2.h red;

    /* renamed from: s, reason: collision with root package name */
    public int f1851s;
    public c silver;
    public Bitmap teal;
    public /* synthetic */ Object white;
    public final /* synthetic */ k yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, Pd.c cVar) {
        super(cVar);
        this.yellow = kVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.white = obj;
        this.f1851s |= RecyclerView.UNDEFINED_DURATION;
        return k.alpha(this.yellow, null, 0, this);
    }
}
