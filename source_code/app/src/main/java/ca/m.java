package ca;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.y;
import okhttp3.WebSocket;
import vf.ab;
import vf.ad;

/* loaded from: classes2.dex */
public final class m extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ n red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ long teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, long j5, long j6, Nd.c cVar) {
        super(2, cVar);
        this.red = nVar;
        this.silver = j5;
        this.teal = j6;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        m mVar = new m(this.red, this.silver, this.teal, cVar);
        mVar.purple = obj;
        return mVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0036 -> B:5:0x0039). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j5;
        Long l10;
        ab abVar = (ab) this.purple;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                if (this.red.quebec.get()) {
                    long currentTimeMillis = System.currentTimeMillis() - this.red.beige.get();
                    if (currentTimeMillis > this.teal) {
                        Long l11 = this.red.tango;
                        if (l11 != null) {
                            l10 = new Long(System.currentTimeMillis() - l11.longValue());
                        } else {
                            l10 = null;
                        }
                        Long l12 = l10;
                        n.golf(this.red, "HB_FAIL", y.sierra(new Pair("elapsedSinceLastMsg", String.valueOf(currentTimeMillis)), new Pair("threshold", String.valueOf(this.teal))), null, l12, n.hotel(l12), null, null, 100);
                        WebSocket webSocket = this.red.papa;
                        if (webSocket != null) {
                            webSocket.close(1000, "failed_server_heartbeat");
                        }
                    }
                    if (ad.xray(abVar) && this.red.quebec.get()) {
                        j5 = this.silver;
                        this.purple = abVar;
                        this.alpha = 1;
                        if (ad.november(j5, this) == aVar) {
                            return aVar;
                        }
                        if (this.red.quebec.get()) {
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        if (ad.xray(abVar)) {
            j5 = this.silver;
            this.purple = abVar;
            this.alpha = 1;
            if (ad.november(j5, this) == aVar) {
            }
            if (this.red.quebec.get()) {
            }
        }
        return Unit.INSTANCE;
    }
}
