package T;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import vf.I;
import vf.ab;
import vf.ad;

/* loaded from: classes3.dex */
public final class v extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ Lambda red;
    public final /* synthetic */ AtomicReference silver;
    public final /* synthetic */ Pd.i teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(Function1 function1, AtomicReference atomicReference, Xd.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.red = (Lambda) function1;
        this.silver = atomicReference;
        this.teal = (Pd.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Xd.l, Pd.i] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        v vVar = new v(this.red, this.silver, this.teal, cVar);
        vVar.purple = obj;
        return vVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0055, code lost:
    
        if (vf.ad.lima(r9, r8) == r0) goto L21;
     */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r9v9, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u uVar;
        u uVar2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        AtomicReference atomicReference = this.silver;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        uVar2 = (u) this.purple;
                        try {
                            ResultKt.alpha(obj);
                            while (!atomicReference.compareAndSet(uVar2, null) && atomicReference.get() == uVar2) {
                            }
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            while (!atomicReference.compareAndSet(uVar2, null)) {
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uVar = (u) this.purple;
                ResultKt.alpha(obj);
            } else {
                ResultKt.alpha(obj);
                ab abVar = (ab) this.purple;
                uVar = new u(ad.sierra(abVar.charlie()), this.red.invoke(abVar));
                u uVar3 = (u) atomicReference.getAndSet(uVar);
                if (uVar3 != null) {
                    I i5 = uVar3.alpha;
                    this.purple = uVar;
                    this.alpha = 1;
                }
            }
            ?? r92 = this.teal;
            Object obj2 = uVar.bravo;
            this.purple = uVar;
            this.alpha = 2;
            obj = r92.invoke(obj2, this);
            if (obj != aVar) {
                uVar2 = uVar;
                while (!atomicReference.compareAndSet(uVar2, null)) {
                }
                return obj;
            }
            return aVar;
        } catch (Throwable th2) {
            th = th2;
            uVar2 = uVar;
            while (!atomicReference.compareAndSet(uVar2, null) && atomicReference.get() == uVar2) {
            }
            throw th;
        }
    }
}
