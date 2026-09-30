package ca;

import com.clevertap.android.sdk.Constants;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.y;
import vf.ab;
import vf.ad;

/* loaded from: classes2.dex */
public final class i extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ n purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ String silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, String str, String str2, Nd.c cVar) {
        super(2, cVar);
        this.purple = nVar;
        this.red = str;
        this.silver = str2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        i iVar = new i(this.purple, this.red, this.silver, cVar);
        iVar.alpha = obj;
        return iVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        ab abVar = (ab) this.alpha;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        if (ad.xray(abVar) && !this.purple.quebec.get() && !this.purple.romeo.get()) {
            this.purple.uniform = 0;
            n.golf(this.purple, "NET_AVAILABLE", y.romeo(new Pair(Constants.KEY_ACTION, "reconnect_now")), null, null, null, null, null, 124);
            this.purple.bravo(this.red, this.silver);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
