package kd;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class r extends Pd.i implements Xd.l {
    public long alpha;
    public int purple;
    public final /* synthetic */ io.ktor.utils.io.m red;
    public final /* synthetic */ byte[] silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ io.ktor.utils.io.t white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(io.ktor.utils.io.m mVar, byte[] bArr, int i4, io.ktor.utils.io.t tVar, Nd.c cVar) {
        super(2, cVar);
        this.red = mVar;
        this.silver = bArr;
        this.teal = i4;
        this.white = tVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new r(this.red, this.silver, this.teal, this.white, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r7 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if (io.ktor.utils.io.ak.sierra(r2, r6.silver, r6.teal, r6) == r0) goto L20;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j5;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        io.ktor.utils.io.m mVar = this.red;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        j5 = this.alpha;
                        ResultKt.alpha(obj);
                        return new Long(j5);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                long longValue = ((Number) obj).longValue();
                this.alpha = longValue;
                this.purple = 3;
                if (mVar.india(this) != aVar) {
                    j5 = longValue;
                    return new Long(j5);
                }
                return aVar;
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            this.purple = 1;
        }
        this.purple = 2;
        obj = io.ktor.utils.io.ak.echo(this.white, mVar, this);
    }
}
