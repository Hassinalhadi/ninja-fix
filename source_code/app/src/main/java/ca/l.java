package ca;

import kotlin.ResultKt;
import kotlin.Unit;
import okhttp3.WebSocket;
import vf.ab;
import vf.ad;

/* loaded from: classes2.dex */
public final class l extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ n red;
    public final /* synthetic */ long silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j5, Nd.c cVar, n nVar) {
        super(2, cVar);
        this.red = nVar;
        this.silver = j5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        l lVar = new l(this.silver, cVar, this.red);
        lVar.purple = obj;
        return lVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0036 -> B:5:0x0039). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        WebSocket webSocket;
        ab abVar = (ab) this.purple;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                if (this.red.quebec.get() && (webSocket = this.red.papa) != null) {
                    webSocket.send("\n");
                }
                if (!ad.xray(abVar) && this.red.quebec.get()) {
                    long j5 = this.silver;
                    this.purple = abVar;
                    this.alpha = 1;
                    if (ad.november(j5, this) == aVar) {
                        return aVar;
                    }
                    if (this.red.quebec.get()) {
                        webSocket.send("\n");
                    }
                    if (!ad.xray(abVar)) {
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        if (!ad.xray(abVar)) {
        }
        return Unit.INSTANCE;
    }
}
