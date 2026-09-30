package Wf;

import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import vf.P;

/* loaded from: classes2.dex */
public final class c extends Pd.i implements Xd.l {
    public Ef.c alpha;
    public w.o purple;
    public String red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f2234s;
    public Pd.i silver;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Pd.i f2235t;
    public int teal;
    public /* synthetic */ Object white;
    public final /* synthetic */ w.o yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(w.o oVar, String str, Function1 function1, Nd.c cVar) {
        super(2, cVar);
        this.yellow = oVar;
        this.f2234s = str;
        this.f2235t = (Pd.i) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Pd.i, kotlin.jvm.functions.Function1] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        c cVar2 = new c(this.yellow, this.f2234s, this.f2235t, cVar);
        cVar2.white = obj;
        return cVar2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (r9 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r6.delta(r10) == r0) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r8v3, types: [vf.ag] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vf.ab abVar;
        w.o oVar;
        Ef.c cVar;
        String str;
        ?? r12;
        vf.ah ahVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.teal;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Function1 function1 = (Function1) this.silver;
            str = this.red;
            oVar = this.purple;
            cVar = this.alpha;
            abVar = (vf.ab) this.white;
            ResultKt.alpha(obj);
            r12 = function1;
        } else {
            ResultKt.alpha(obj);
            abVar = (vf.ab) this.white;
            oVar = this.yellow;
            cVar = (Ef.c) oVar.purple;
            this.white = abVar;
            this.alpha = cVar;
            this.purple = oVar;
            str = this.f2234s;
            this.red = str;
            Pd.i iVar = this.f2235t;
            this.silver = iVar;
            this.teal = 1;
            r12 = iVar;
        }
        try {
            ?? r82 = (vf.ag) ((LinkedHashMap) oVar.red).get(str);
            if (r82 != 0) {
                boolean isCancelled = ((P) r82).isCancelled();
                ahVar = r82;
            }
            vf.ac acVar = vf.ac.alpha;
            vf.ah golf = vf.ad.golf(abVar, null, new b(r12, null), 1);
            ((LinkedHashMap) oVar.red).put(str, golf);
            ahVar = golf;
            cVar.foxtrot(null);
            this.white = null;
            this.alpha = null;
            this.purple = null;
            this.red = null;
            this.silver = null;
            this.teal = 2;
            Object await = ahVar.await(this);
            if (await == aVar) {
                return aVar;
            }
            return await;
        } catch (Throwable th) {
            cVar.foxtrot(null);
            throw th;
        }
    }
}
