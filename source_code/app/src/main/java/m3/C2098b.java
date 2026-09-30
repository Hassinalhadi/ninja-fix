package m3;

import Cf.e;
import Pd.i;
import Xd.l;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.t;
import kotlin.collections.y;
import kotlin.k;
import vf.ab;
import vf.ad;
import vf.ao;

/* renamed from: m3.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2098b extends i implements l {
    public LinkedHashMap alpha;
    public long purple;
    public int red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ d teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2098b(d dVar, Nd.c cVar) {
        super(2, cVar);
        this.teal = dVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C2098b c2098b = new C2098b(this.teal, cVar);
        c2098b.silver = obj;
        return c2098b;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C2098b) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object m206constructorimpl;
        LinkedHashMap linkedHashMap;
        long j5;
        Od.a aVar = Od.a.alpha;
        int i4 = this.red;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    j5 = this.purple;
                    linkedHashMap = this.alpha;
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                d dVar = this.teal;
                Result.Companion companion = Result.INSTANCE;
                LinkedHashMap amber = y.amber(d.alpha(dVar));
                long currentTimeMillis = System.currentTimeMillis();
                this.silver = null;
                this.alpha = amber;
                this.purple = currentTimeMillis;
                this.red = 1;
                e eVar = ao.alpha;
                Object blue = ad.blue(Cf.d.purple, new i(2, null), this);
                if (blue == aVar) {
                    return aVar;
                }
                linkedHashMap = amber;
                obj = blue;
                j5 = currentTimeMillis;
            }
            Boolean bool = (Boolean) obj;
            bool.getClass();
            long currentTimeMillis2 = System.currentTimeMillis() - j5;
            linkedHashMap.put("backendPing", bool);
            linkedHashMap.put("pingMs", new Long(currentTimeMillis2));
            m206constructorimpl = Result.m206constructorimpl(linkedHashMap);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        t tVar = t.alpha;
        if (m206constructorimpl instanceof k) {
            return tVar;
        }
        return m206constructorimpl;
    }
}
