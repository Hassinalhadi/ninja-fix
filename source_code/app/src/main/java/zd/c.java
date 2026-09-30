package zd;

import io.ktor.utils.io.ag;
import io.ktor.utils.io.ak;
import io.ktor.utils.io.t;
import kotlin.ResultKt;
import kotlin.Unit;
import t6.AbstractC3018l;
import vf.ab;

/* loaded from: classes2.dex */
public final class c extends Pd.i implements Xd.l {
    public Object alpha;
    public ag purple;
    public ag red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.io.m f14223s;
    public t silver;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.io.m f14224t;
    public Gf.i teal;
    public int white;
    public final /* synthetic */ t yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t tVar, io.ktor.utils.io.m mVar, io.ktor.utils.io.m mVar2, Nd.c cVar) {
        super(2, cVar);
        this.yellow = tVar;
        this.f14223s = mVar;
        this.f14224t = mVar2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new c(this.yellow, this.f14223s, this.f14224t, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:34|(1:36)|37|38|47|48|(3:50|51|(6:53|27|28|(2:30|32)|62|(0)(0)))) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0132, code lost:
    
        if (r2.india(r10) == r0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x010d, code lost:
    
        if (r2.india(r10) == r0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d6, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d2, code lost:
    
        r6 = r2;
        r1 = r3;
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0103, code lost:
    
        if (r4.india(r10) == r0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0128, code lost:
    
        if (r4.india(r10) != r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014b, code lost:
    
        if (r4.india(r10) != r0) goto L78;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:27:0x00e1, B:28:0x006b, B:30:0x0071, B:32:0x0077, B:34:0x007d, B:37:0x0094, B:45:0x00e8, B:46:0x00eb, B:62:0x00ec, B:66:0x0110, B:72:0x0061, B:38:0x0097, B:58:0x00d8, B:42:0x00e6), top: B:2:0x000b, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0110 A[Catch: all -> 0x0065, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:27:0x00e1, B:28:0x006b, B:30:0x0071, B:32:0x0077, B:34:0x007d, B:37:0x0094, B:45:0x00e8, B:46:0x00eb, B:62:0x00ec, B:66:0x0110, B:72:0x0061, B:38:0x0097, B:58:0x00d8, B:42:0x00e6), top: B:2:0x000b, inners: #0, #3 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00d0 -> B:26:0x00e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00d8 -> B:26:0x00e1). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Gf.i iVar;
        t tVar;
        ag agVar;
        ag agVar2;
        AutoCloseable autoCloseable;
        Throwable th;
        AutoCloseable autoCloseable2;
        ag agVar3;
        ag agVar4;
        t tVar2;
        Gf.e peek;
        Gf.e peek2;
        Throwable echo;
        Od.a aVar = Od.a.alpha;
        int i4 = this.white;
        io.ktor.utils.io.m mVar = this.f14224t;
        t tVar3 = this.yellow;
        io.ktor.utils.io.m mVar2 = this.f14223s;
        try {
        } catch (Throwable th2) {
            try {
                ak.charlie(mVar2, th2);
                ak.charlie(mVar, th2);
                this.alpha = null;
                this.purple = null;
                this.red = null;
                this.silver = null;
                this.teal = null;
                this.white = 6;
            } catch (Throwable th3) {
                th = th3;
                this.alpha = th;
                this.purple = null;
                this.red = null;
                this.silver = null;
                this.teal = null;
                this.white = 8;
            }
        }
        switch (i4) {
            case 0:
                ResultKt.alpha(obj);
                if (tVar3.hotel() && (!mVar2.lima() || !mVar.lima())) {
                    this.alpha = null;
                    this.purple = null;
                    this.red = null;
                    this.silver = null;
                    this.teal = null;
                    this.white = 1;
                    obj = ak.lima(tVar3, 4096L, this);
                    if (obj == aVar) {
                    }
                    autoCloseable2 = (AutoCloseable) obj;
                    iVar = (Gf.i) autoCloseable2;
                    peek2 = iVar.peek();
                    this.alpha = autoCloseable2;
                    this.purple = mVar2;
                    this.red = mVar;
                    this.silver = tVar3;
                    this.teal = iVar;
                    this.white = 2;
                    if (ak.tango(mVar2, peek2, this) != aVar) {
                        agVar = mVar;
                        tVar = tVar3;
                        autoCloseable = autoCloseable2;
                        agVar2 = mVar2;
                        peek = iVar.peek();
                        this.alpha = autoCloseable;
                        this.purple = agVar2;
                        this.red = agVar;
                        this.silver = tVar;
                        this.teal = null;
                        this.white = 3;
                        if (ak.tango(agVar, peek, this) != aVar) {
                            autoCloseable2 = autoCloseable;
                            AbstractC3018l.alpha(autoCloseable2, null);
                            if (tVar3.hotel()) {
                            }
                            echo = tVar3.echo();
                            if (echo != null) {
                            }
                        }
                    }
                } else {
                    echo = tVar3.echo();
                    if (echo != null) {
                        this.alpha = null;
                        this.purple = null;
                        this.red = null;
                        this.silver = null;
                        this.teal = null;
                        this.white = 4;
                        break;
                    } else {
                        throw echo;
                    }
                }
                return aVar;
            case 1:
                ResultKt.alpha(obj);
                autoCloseable2 = (AutoCloseable) obj;
                iVar = (Gf.i) autoCloseable2;
                peek2 = iVar.peek();
                this.alpha = autoCloseable2;
                this.purple = mVar2;
                this.red = mVar;
                this.silver = tVar3;
                this.teal = iVar;
                this.white = 2;
                if (ak.tango(mVar2, peek2, this) != aVar) {
                }
                return aVar;
            case 2:
                iVar = this.teal;
                tVar = this.silver;
                agVar = this.red;
                agVar2 = this.purple;
                autoCloseable = (AutoCloseable) this.alpha;
                try {
                    ResultKt.alpha(obj);
                } catch (Throwable th4) {
                    th = th4;
                    tVar2 = tVar;
                    agVar4 = agVar;
                    agVar3 = agVar2;
                    autoCloseable2 = autoCloseable;
                    try {
                        tVar2.delta(th);
                        ak.charlie(agVar3, th);
                        ak.charlie(agVar4, th);
                        AbstractC3018l.alpha(autoCloseable2, null);
                        if (tVar3.hotel()) {
                        }
                        echo = tVar3.echo();
                        if (echo != null) {
                        }
                    } finally {
                    }
                }
                peek = iVar.peek();
                this.alpha = autoCloseable;
                this.purple = agVar2;
                this.red = agVar;
                this.silver = tVar;
                this.teal = null;
                this.white = 3;
                if (ak.tango(agVar, peek, this) != aVar) {
                }
                return aVar;
            case 3:
                tVar2 = this.silver;
                agVar4 = this.red;
                agVar3 = this.purple;
                autoCloseable2 = (AutoCloseable) this.alpha;
                try {
                    ResultKt.alpha(obj);
                } catch (Throwable th5) {
                    th = th5;
                    tVar2.delta(th);
                    ak.charlie(agVar3, th);
                    ak.charlie(agVar4, th);
                    AbstractC3018l.alpha(autoCloseable2, null);
                    if (tVar3.hotel()) {
                    }
                    echo = tVar3.echo();
                    if (echo != null) {
                    }
                }
                AbstractC3018l.alpha(autoCloseable2, null);
                if (tVar3.hotel()) {
                }
                echo = tVar3.echo();
                if (echo != null) {
                }
                break;
            case 4:
                ResultKt.alpha(obj);
                this.white = 5;
                break;
            case 5:
            case 7:
                ResultKt.alpha(obj);
                return Unit.INSTANCE;
            case 6:
                ResultKt.alpha(obj);
                this.white = 7;
                break;
            case 8:
                Throwable th6 = (Throwable) this.alpha;
                ResultKt.alpha(obj);
                th = th6;
                this.alpha = th;
                this.white = 9;
                if (mVar.india(this) != aVar) {
                    throw th;
                }
                return aVar;
            case 9:
                Throwable th7 = (Throwable) this.alpha;
                ResultKt.alpha(obj);
                throw th7;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
