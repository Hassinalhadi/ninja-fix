package d3;

import android.content.Intent;
import delivery.samurai.android.ui.missingAttributes.AttributesMissingActivity;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes3.dex */
public final class e extends Pd.i implements Xd.l {
    public final /* synthetic */ k alpha;
    public final /* synthetic */ List purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, List list, Nd.c cVar) {
        super(2, cVar);
        this.alpha = kVar;
        this.purple = list;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new e(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        k kVar = this.alpha;
        if (!kVar.isFinishing() && !kVar.isDestroyed()) {
            int i4 = AttributesMissingActivity.f12319a0;
            Intent intent = new Intent(kVar, (Class<?>) AttributesMissingActivity.class);
            intent.putExtra("EXTRA_PENDING_FORCE_GROUPS", new com.google.gson.l().india(this.purple));
            kVar.startActivity(intent);
        }
        return Unit.INSTANCE;
    }
}
