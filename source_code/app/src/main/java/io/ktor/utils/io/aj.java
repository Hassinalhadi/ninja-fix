package io.ktor.utils.io;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.J;
import vf.P;

/* loaded from: classes2.dex */
public final class aj extends Pd.i implements Xd.l {
    public Object alpha;
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ Pd.i silver;
    public final /* synthetic */ m teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public aj(Xd.l lVar, m mVar, Nd.c cVar) {
        super(2, cVar);
        this.silver = (Pd.i) lVar;
        this.teal = mVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        aj ajVar = new aj(this.silver, this.teal, cVar);
        ajVar.red = obj;
        return ajVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((aj) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:60|61|(2:63|20)|41|42|43|(1:45)|47) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c1, code lost:
    
        if (r9.gray(r8) != r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b1, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b2, code lost:
    
        r1 = r9;
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e3, code lost:
    
        r1.foxtrot(vf.ad.alpha("Exception thrown while writing to channel", r9));
        r2.delta(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f2, code lost:
    
        r8.red = r4;
        r8.alpha = null;
        r8.purple = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ff, code lost:
    
        if (r1.gray(r8) != r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0118, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0119, code lost:
    
        r8.red = r4;
        r8.alpha = r9;
        r8.purple = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0126, code lost:
    
        if (r1.gray(r8) != r0) goto L69;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1 A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #1 {all -> 0x00b1, blocks: (B:43:0x0093, B:45:0x00a1), top: B:42:0x0093 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r9v22, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Throwable th2;
        vf.ab abVar;
        Od.a aVar = Od.a.alpha;
        P p4 = this.purple;
        m mVar = this.teal;
        try {
            try {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            Result.Companion companion = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th4));
        }
        switch (p4) {
            case 0:
                ResultKt.alpha(obj);
                abVar = (vf.ab) this.red;
                J j5 = new J(vf.ad.sierra(abVar.charlie()));
                ?? r92 = this.silver;
                ar arVar = new ar(mVar, abVar.charlie().plus(j5));
                this.red = abVar;
                this.alpha = j5;
                this.purple = 1;
                p4 = j5;
                if (r92.invoke(arVar, this) == aVar) {
                    return aVar;
                }
                J j6 = p4;
                j6.yellow();
                if (vf.ad.sierra(abVar.charlie()).isCancelled()) {
                    mVar.delta(vf.ad.sierra(abVar.charlie()).quebec());
                }
                this.red = abVar;
                this.alpha = null;
                this.purple = 2;
                break;
            case 1:
                vf.r rVar = (vf.r) this.alpha;
                abVar = (vf.ab) this.red;
                ResultKt.alpha(obj);
                p4 = rVar;
                J j62 = p4;
                j62.yellow();
                if (vf.ad.sierra(abVar.charlie()).isCancelled()) {
                }
                this.red = abVar;
                this.alpha = null;
                this.purple = 2;
                break;
            case 2:
                ResultKt.alpha(obj);
                Result.Companion companion2 = Result.INSTANCE;
                this.red = null;
                this.purple = 3;
                if (mVar.india(this) == aVar) {
                    return aVar;
                }
                Result.m206constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 3:
                ResultKt.alpha(obj);
                Result.m206constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 4:
                ResultKt.alpha(obj);
                Result.Companion companion3 = Result.INSTANCE;
                this.red = null;
                this.purple = 5;
                if (mVar.india(this) == aVar) {
                    return aVar;
                }
                Result.m206constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 5:
                ResultKt.alpha(obj);
                Result.m206constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 6:
                Throwable th5 = (Throwable) this.alpha;
                ResultKt.alpha(obj);
                th = th5;
                try {
                    Result.Companion companion4 = Result.INSTANCE;
                    this.red = th;
                    this.alpha = null;
                    this.purple = 7;
                    if (mVar.india(this) != aVar) {
                        th = th;
                        Result.m206constructorimpl(Unit.INSTANCE);
                        throw th;
                    }
                    return aVar;
                } catch (Throwable th6) {
                    th = th;
                    th2 = th6;
                    Result.Companion companion5 = Result.INSTANCE;
                    Result.m206constructorimpl(ResultKt.createFailure(th2));
                    throw th;
                }
            case 7:
                th = (Throwable) this.red;
                try {
                    ResultKt.alpha(obj);
                    Result.m206constructorimpl(Unit.INSTANCE);
                    throw th;
                } catch (Throwable th7) {
                    th2 = th7;
                    Result.Companion companion52 = Result.INSTANCE;
                    Result.m206constructorimpl(ResultKt.createFailure(th2));
                    throw th;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
