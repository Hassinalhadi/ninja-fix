package zd;

import io.ktor.utils.io.ak;
import io.ktor.utils.io.t;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import vf.ab;
import vf.ad;

/* loaded from: classes2.dex */
public final class f extends Pd.i implements Xd.l {
    public byte[] alpha;
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ t silver;
    public final /* synthetic */ io.ktor.utils.io.m teal;
    public final /* synthetic */ io.ktor.utils.io.m white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t tVar, io.ktor.utils.io.m mVar, io.ktor.utils.io.m mVar2, Nd.c cVar) {
        super(2, cVar);
        this.silver = tVar;
        this.teal = mVar;
        this.white = mVar2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        f fVar = new f(this.silver, this.teal, this.white, cVar);
        fVar.red = obj;
        return fVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (vf.ad.hotel(r14, r13) == r2) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0047 A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:7:0x0018, B:9:0x0041, B:11:0x0047, B:17:0x0058, B:19:0x0060, B:21:0x008e, B:27:0x00a0, B:32:0x002e), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:7:0x0018, B:9:0x0041, B:11:0x0047, B:17:0x0058, B:19:0x0060, B:21:0x008e, B:27:0x00a0, B:32:0x002e), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #1 {all -> 0x001d, blocks: (B:7:0x0018, B:9:0x0041, B:11:0x0047, B:17:0x0058, B:19:0x0060, B:21:0x008e, B:27:0x00a0, B:32:0x002e), top: B:2:0x000c }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v6, types: [byte[], java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005e -> B:8:0x008c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0089 -> B:8:0x008c). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ab abVar;
        ab abVar2;
        byte[] bArr;
        int intValue;
        byte[] bArr2;
        Od.a aVar = Od.a.alpha;
        Object obj2 = this.purple;
        io.ktor.utils.io.m mVar = this.white;
        io.ktor.utils.io.m mVar2 = this.teal;
        t tVar = this.silver;
        try {
        } catch (Throwable th) {
            try {
                tVar.delta(th);
                mVar2.delta(th);
                mVar.delta(th);
                Id.b.alpha.s(obj2);
            } catch (Throwable th2) {
                Id.b.alpha.s(obj2);
                mVar2.alpha();
                mVar.alpha();
                throw th2;
            }
        }
        if (obj2 != 0) {
            if (obj2 != 1) {
                if (obj2 == 2) {
                    byte[] bArr3 = this.alpha;
                    abVar2 = (ab) this.red;
                    ResultKt.alpha(obj);
                    bArr2 = bArr3;
                    abVar = abVar2;
                    obj2 = bArr2;
                    if (tVar.hotel()) {
                        this.red = abVar;
                        this.alpha = obj2;
                        this.purple = 1;
                        Object india = ak.india(tVar, obj2, obj2.length, this);
                        if (india != aVar) {
                            abVar2 = abVar;
                            obj = india;
                            bArr = obj2;
                            intValue = ((Number) obj).intValue();
                            bArr2 = bArr;
                            if (intValue > 0) {
                                List listOf = CollectionsKt.listOf(ad.golf(abVar2, null, new d(mVar2, bArr, intValue, null), 3), ad.golf(abVar2, null, new e(mVar, bArr, intValue, null), 3));
                                this.red = abVar2;
                                this.alpha = bArr;
                                this.purple = 2;
                                bArr2 = bArr;
                            }
                            abVar = abVar2;
                            obj2 = bArr2;
                            if (tVar.hotel()) {
                                Throwable echo = tVar.echo();
                                if (echo == null) {
                                    Id.b.alpha.s(obj2);
                                    mVar2.alpha();
                                    mVar.alpha();
                                    return Unit.INSTANCE;
                                }
                                throw echo;
                            }
                        } else {
                            return aVar;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                byte[] bArr4 = this.alpha;
                abVar2 = (ab) this.red;
                ResultKt.alpha(obj);
                bArr = bArr4;
                intValue = ((Number) obj).intValue();
                bArr2 = bArr;
                if (intValue > 0) {
                }
                abVar = abVar2;
                obj2 = bArr2;
                if (tVar.hotel()) {
                }
            }
        } else {
            ResultKt.alpha(obj);
            abVar = (ab) this.red;
            obj2 = (byte[]) Id.b.alpha.yankee();
            if (tVar.hotel()) {
            }
        }
    }
}
