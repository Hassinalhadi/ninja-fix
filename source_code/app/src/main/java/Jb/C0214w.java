package Jb;

import android.content.Context;
import delivery.samurai.android.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m3.C2097a;
import m3.C2098b;
import wf.C3268e;

/* renamed from: Jb.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0214w extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ C0215x red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0214w(C0215x c0215x, Nd.c cVar) {
        super(2, cVar);
        this.red = c0215x;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C0214w c0214w = new C0214w(this.red, cVar);
        c0214w.purple = obj;
        return c0214w;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0214w) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|2|(1:(1:(3:6|7|8)(2:10|11))(1:12))(3:38|39|(2:41|(2:43|32))(2:44|45))|13|14|(1:16)|17|18|19|20|(1:22)|23|(2:26|24)|27|28|(1:30)(2:33|34)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0135, code lost:
    
        if (vf.ad.blue(r0, r2, r13) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        r7 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m206constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m206constructorimpl;
        vf.ab abVar = (vf.ab) this.purple;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        C0215x c0215x = this.red;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            Result.Companion companion2 = Result.INSTANCE;
            m3.d dVar = c0215x.f1666r;
            if (dVar != null) {
                this.purple = abVar;
                this.alpha = 1;
                obj = vf.ad.blue(vf.ao.alpha, new C2098b(dVar, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                Intrinsics.lima("connectionDiagnostics");
                throw null;
            }
        }
        m206constructorimpl = Result.m206constructorimpl((Map) obj);
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
        Object obj2 = kotlin.collections.t.alpha;
        if (m207exceptionOrNullimpl != null) {
            m206constructorimpl = obj2;
        }
        Map map = (Map) m206constructorimpl;
        AtomicReference atomicReference = X9.o.alpha;
        Context requireContext = c0215x.requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        Object m206constructorimpl2 = Result.m206constructorimpl(X9.o.alpha(requireContext));
        if (Result.m207exceptionOrNullimpl(m206constructorimpl2) == null) {
            obj2 = m206constructorimpl2;
        }
        Map map2 = (Map) obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.y.quebec(map2.size()));
        for (Map.Entry entry : map2.entrySet()) {
            linkedHashMap.put(av.q.echo("integrity.", (String) entry.getKey()), entry.getValue());
        }
        String maroon = CollectionsKt.maroon(kotlin.collections.y.uniform(map, linkedHashMap).entrySet(), "\n", null, null, new D0.z(28), 30);
        m3.d dVar2 = c0215x.f1666r;
        if (dVar2 != null) {
            C2097a bravo = dVar2.bravo();
            String string = c0215x.getString(R.string.diag_label_reason);
            String string2 = c0215x.getString(R.string.diag_label_message);
            String string3 = c0215x.getString(R.string.diag_label_payload);
            StringBuilder beige = ao.ad.beige(string, ": ");
            beige.append(bravo.alpha);
            beige.append("\n");
            beige.append(string2);
            beige.append(": ");
            Q0.c.azure(beige, bravo.bravo, "\n\n", string3, ":\n");
            beige.append(maroon);
            String sb2 = beige.toString();
            Cf.e eVar = vf.ao.alpha;
            C3268e c3268e = Af.n.alpha;
            C0213v c0213v = new C0213v(c0215x, sb2, null);
            this.purple = null;
            this.alpha = 2;
        } else {
            Intrinsics.lima("connectionDiagnostics");
            throw null;
        }
    }
}
