package td;

import io.ktor.utils.io.ak;
import io.ktor.utils.io.ao;
import io.ktor.utils.io.t;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s6.Y4;
import vf.C3213q;
import vf.InterfaceC3212p;
import vf.ad;
import xf.q;
import xf.r;

/* loaded from: classes2.dex */
public final class j extends Pd.i implements Xd.l {
    public ao alpha;
    public Hf.a purple;
    public io.ktor.utils.io.m red;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f13966s;
    public InterfaceC3212p silver;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f13967t;
    public d teal;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Hf.a f13968u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Long f13969v;
    public long white;
    public int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t tVar, Hf.a aVar, Long l10, Nd.c cVar) {
        super(2, cVar);
        this.f13967t = tVar;
        this.f13968u = aVar;
        this.f13969v = l10;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        j jVar = new j(this.f13967t, this.f13968u, this.f13969v, cVar);
        jVar.f13966s = obj;
        return jVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((r) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0336, code lost:
    
        if (((xf.q) r0).silver.bravo(r19, r1) == r7) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x016d, code lost:
    
        if (((xf.q) r5).silver.bravo(r19, r12) == r7) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0301, code lost:
    
        if (((xf.q) r0).silver.bravo(r19, r2) == r7) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x02e4, code lost:
    
        if (r1 == r7) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0318, code lost:
    
        if (r1 == r7) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x02b9, code lost:
    
        if (io.ktor.utils.io.ak.papa(r2, r4, r19) != r7) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018d, code lost:
    
        if (r12 == r7) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01aa, code lost:
    
        if (io.ktor.utils.io.ak.papa(r4, r12, r19) == r7) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01bd, code lost:
    
        if (r12 == r7) goto L127;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0225 A[Catch: all -> 0x0261, TRY_LEAVE, TryCatch #1 {all -> 0x0261, blocks: (B:65:0x021c, B:67:0x0225), top: B:64:0x021c }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01c7 -> B:42:0x0171). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0249 -> B:39:0x0253). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Hf.a aVar;
        Object mike;
        r rVar;
        ao aoVar;
        Hf.a aVar2;
        long j5;
        Object obj2;
        Object obj3;
        Hf.a aVar3;
        r rVar2;
        InterfaceC3212p interfaceC3212p;
        ao aoVar2;
        io.ktor.utils.io.m mVar;
        io.ktor.utils.io.m mVar2;
        Hf.a aVar4;
        Object obj4;
        long j6;
        io.ktor.utils.io.m mVar3;
        ao aoVar3;
        r rVar3;
        Hf.a aVar5;
        long j7;
        ao aoVar4;
        InterfaceC3212p interfaceC3212p2;
        r rVar4;
        long j10;
        d dVar;
        d dVar2;
        Hf.a aVar6;
        d dVar3;
        r rVar5;
        ao aoVar5;
        r rVar6;
        Object mike2;
        Object kilo;
        Od.a aVar7 = Od.a.alpha;
        int i4 = this.yellow;
        Hf.a aVar8 = this.f13968u;
        d dVar4 = null;
        switch (i4) {
            case 0:
                ResultKt.alpha(obj);
                r rVar7 = (r) this.f13966s;
                t tVar = this.f13967t;
                Intrinsics.echo(tVar, "<this>");
                ao aoVar6 = new ao(tVar);
                aoVar6.bravo();
                long j11 = aoVar6.echo;
                int length = n.bravo.alpha.length;
                byte[] bArr = aVar8.alpha;
                int length2 = bArr.length;
                if (length == length2) {
                    aVar = Hf.a.red;
                } else {
                    aVar = new Hf.a(bArr, length, length2);
                }
                com.google.android.play.core.integrity.c uniform = ak.uniform(rVar7, null, new i(aVar, aoVar6, null), 3);
                this.f13966s = rVar7;
                this.alpha = aoVar6;
                this.purple = aVar;
                this.white = j11;
                this.yellow = 1;
                mike = ak.mike((io.ktor.utils.io.m) uniform.purple, this);
                if (mike != aVar7) {
                    rVar = rVar7;
                    aoVar = aoVar6;
                    aVar2 = aVar;
                    j5 = j11;
                    if (Y4.charlie((Gf.i) mike) > 0) {
                        Object obj5 = new Object();
                        this.f13966s = rVar;
                        this.alpha = aoVar;
                        this.purple = aVar2;
                        this.white = j5;
                        this.yellow = 2;
                        break;
                    }
                    if (!aoVar.hotel()) {
                        Hf.a aVar9 = n.bravo;
                        this.f13966s = rVar;
                        this.alpha = aoVar;
                        this.purple = aVar2;
                        this.red = null;
                        this.silver = null;
                        this.teal = null;
                        this.white = j5;
                        this.yellow = 3;
                        obj2 = ak.papa(aoVar, aVar9, this);
                        break;
                    }
                    rVar3 = rVar;
                    aVar5 = n.alpha;
                    this.f13966s = rVar3;
                    this.alpha = aoVar;
                    this.purple = null;
                    this.red = null;
                    this.silver = null;
                    this.teal = null;
                    this.white = j5;
                    this.yellow = 9;
                    if (ak.papa(aoVar, aVar5, this) != aVar7) {
                        j7 = j5;
                        aoVar4 = aoVar;
                        Hf.a aVar10 = n.alpha;
                        this.f13966s = rVar3;
                        this.alpha = aoVar4;
                        this.white = j7;
                        this.yellow = 10;
                        break;
                    }
                }
                return aVar7;
            case 1:
                j5 = this.white;
                aVar2 = this.purple;
                aoVar = this.alpha;
                rVar = (r) this.f13966s;
                ResultKt.alpha(obj);
                mike = obj;
                if (Y4.charlie((Gf.i) mike) > 0) {
                }
                if (!aoVar.hotel()) {
                }
                rVar3 = rVar;
                aVar5 = n.alpha;
                this.f13966s = rVar3;
                this.alpha = aoVar;
                this.purple = null;
                this.red = null;
                this.silver = null;
                this.teal = null;
                this.white = j5;
                this.yellow = 9;
                if (ak.papa(aoVar, aVar5, this) != aVar7) {
                }
                return aVar7;
            case 2:
                j5 = this.white;
                aVar2 = this.purple;
                aoVar = this.alpha;
                rVar = (r) this.f13966s;
                ResultKt.alpha(obj);
                if (!aoVar.hotel()) {
                }
                rVar3 = rVar;
                aVar5 = n.alpha;
                this.f13966s = rVar3;
                this.alpha = aoVar;
                this.purple = null;
                this.red = null;
                this.silver = null;
                this.teal = null;
                this.white = j5;
                this.yellow = 9;
                if (ak.papa(aoVar, aVar5, this) != aVar7) {
                }
                return aVar7;
            case 3:
                j5 = this.white;
                aVar2 = this.purple;
                aoVar = this.alpha;
                rVar = (r) this.f13966s;
                ResultKt.alpha(obj);
                obj2 = obj;
                if (!((Boolean) obj2).booleanValue()) {
                    Hf.a aVar11 = n.alpha;
                    this.f13966s = rVar;
                    this.alpha = aoVar;
                    this.purple = aVar2;
                    this.white = j5;
                    this.yellow = 4;
                    break;
                }
                rVar3 = rVar;
                aVar5 = n.alpha;
                this.f13966s = rVar3;
                this.alpha = aoVar;
                this.purple = null;
                this.red = null;
                this.silver = null;
                this.teal = null;
                this.white = j5;
                this.yellow = 9;
                if (ak.papa(aoVar, aVar5, this) != aVar7) {
                }
                return aVar7;
            case 4:
                j5 = this.white;
                aVar2 = this.purple;
                aoVar = this.alpha;
                rVar = (r) this.f13966s;
                ResultKt.alpha(obj);
                this.f13966s = rVar;
                this.alpha = aoVar;
                this.purple = aVar2;
                this.white = j5;
                this.yellow = 5;
                obj3 = ak.papa(aoVar, aVar2, this);
                break;
            case 5:
                j5 = this.white;
                aVar2 = this.purple;
                aoVar = this.alpha;
                rVar = (r) this.f13966s;
                ResultKt.alpha(obj);
                obj3 = obj;
                if (!((Boolean) obj3).booleanValue()) {
                    mVar = new io.ktor.utils.io.m(false);
                    C3213q bravo = ad.bravo();
                    Object obj6 = new Object();
                    this.f13966s = rVar;
                    this.alpha = aoVar;
                    this.purple = aVar2;
                    this.red = mVar;
                    this.silver = bravo;
                    this.white = j5;
                    this.yellow = 6;
                    if (((q) rVar).silver.bravo(this, obj6) != aVar7) {
                        r rVar8 = rVar;
                        aVar3 = aVar2;
                        aoVar2 = aoVar;
                        interfaceC3212p = bravo;
                        rVar2 = rVar8;
                        try {
                            this.f13966s = rVar2;
                            this.alpha = aoVar2;
                            this.purple = aVar3;
                            this.red = mVar;
                            this.silver = interfaceC3212p;
                            this.white = j5;
                            this.yellow = 7;
                            obj4 = n.bravo(aoVar2, this);
                        } catch (Throwable th) {
                            th = th;
                            mVar2 = mVar;
                        }
                        if (obj4 != aVar7) {
                            try {
                                try {
                                    j6 = j5;
                                    aoVar3 = aoVar2;
                                    aVar4 = aVar3;
                                    mVar3 = mVar;
                                    if (!((C3213q) interfaceC3212p2).magenta(dVar)) {
                                        try {
                                            this.f13966s = rVar4;
                                            this.alpha = aoVar3;
                                            this.purple = aVar4;
                                            this.red = mVar3;
                                            this.silver = interfaceC3212p2;
                                            this.teal = dVar;
                                            this.white = j10;
                                            this.yellow = 8;
                                            if (n.alpha(aVar8, aoVar3, mVar3, dVar2, 65536L, this) != aVar7) {
                                                mVar2 = mVar3;
                                                dVar3 = dVar2;
                                                aVar2 = aVar6;
                                                rVar5 = rVar4;
                                                aoVar5 = aoVar3;
                                                j5 = j10;
                                                try {
                                                    mVar2.alpha();
                                                    aoVar = aoVar5;
                                                    rVar = rVar5;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    dVar4 = dVar3;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                        aVar6 = aVar4;
                                        dVar2 = dVar;
                                    } else {
                                        dVar2 = dVar;
                                        dVar2.delta();
                                        throw new CancellationException("Multipart processing has been cancelled");
                                    }
                                    th = th3;
                                } catch (Throwable th4) {
                                    th = th4;
                                    dVar2 = dVar;
                                }
                                dVar = (d) obj4;
                                mVar2 = mVar3;
                                dVar4 = dVar2;
                            } catch (Throwable th5) {
                                th = th5;
                                mVar2 = mVar3;
                            }
                            interfaceC3212p2 = interfaceC3212p;
                            rVar4 = rVar2;
                            j10 = j6;
                            interfaceC3212p = interfaceC3212p2;
                            if (((C3213q) interfaceC3212p).yellow(th) && dVar4 != null) {
                                dVar4.delta();
                            }
                            ak.charlie(mVar2, th);
                            throw th;
                        }
                    }
                    return aVar7;
                }
                if (!aoVar.hotel()) {
                }
                rVar3 = rVar;
                aVar5 = n.alpha;
                this.f13966s = rVar3;
                this.alpha = aoVar;
                this.purple = null;
                this.red = null;
                this.silver = null;
                this.teal = null;
                this.white = j5;
                this.yellow = 9;
                if (ak.papa(aoVar, aVar5, this) != aVar7) {
                }
                return aVar7;
            case 6:
                j5 = this.white;
                InterfaceC3212p interfaceC3212p3 = this.silver;
                io.ktor.utils.io.m mVar4 = this.red;
                aVar3 = this.purple;
                ao aoVar7 = this.alpha;
                rVar2 = (r) this.f13966s;
                ResultKt.alpha(obj);
                interfaceC3212p = interfaceC3212p3;
                aoVar2 = aoVar7;
                mVar = mVar4;
                this.f13966s = rVar2;
                this.alpha = aoVar2;
                this.purple = aVar3;
                this.red = mVar;
                this.silver = interfaceC3212p;
                this.white = j5;
                this.yellow = 7;
                obj4 = n.bravo(aoVar2, this);
                if (obj4 != aVar7) {
                }
                return aVar7;
            case 7:
                long j12 = this.white;
                interfaceC3212p = this.silver;
                mVar2 = this.red;
                aVar4 = this.purple;
                ao aoVar8 = this.alpha;
                rVar2 = (r) this.f13966s;
                try {
                    ResultKt.alpha(obj);
                    obj4 = obj;
                    j6 = j12;
                    mVar3 = mVar2;
                    aoVar3 = aoVar8;
                    interfaceC3212p2 = interfaceC3212p;
                    rVar4 = rVar2;
                    j10 = j6;
                    dVar = (d) obj4;
                    if (!((C3213q) interfaceC3212p2).magenta(dVar)) {
                    }
                    th = th3;
                    mVar2 = mVar3;
                    dVar4 = dVar2;
                } catch (Throwable th6) {
                    th = th6;
                }
                interfaceC3212p = interfaceC3212p2;
                if (((C3213q) interfaceC3212p).yellow(th)) {
                    dVar4.delta();
                }
                ak.charlie(mVar2, th);
                throw th;
            case 8:
                j5 = this.white;
                d dVar5 = this.teal;
                interfaceC3212p = this.silver;
                mVar2 = this.red;
                Hf.a aVar12 = this.purple;
                aoVar5 = this.alpha;
                rVar5 = (r) this.f13966s;
                try {
                    ResultKt.alpha(obj);
                    interfaceC3212p2 = interfaceC3212p;
                    dVar3 = dVar5;
                    aVar2 = aVar12;
                    mVar2.alpha();
                    aoVar = aoVar5;
                    rVar = rVar5;
                    if (!aoVar.hotel()) {
                    }
                    rVar3 = rVar;
                    aVar5 = n.alpha;
                    this.f13966s = rVar3;
                    this.alpha = aoVar;
                    this.purple = null;
                    this.red = null;
                    this.silver = null;
                    this.teal = null;
                    this.white = j5;
                    this.yellow = 9;
                    if (ak.papa(aoVar, aVar5, this) != aVar7) {
                    }
                    return aVar7;
                } catch (Throwable th7) {
                    th = th7;
                    dVar4 = dVar5;
                    break;
                }
                break;
            case 9:
                j7 = this.white;
                aoVar4 = this.alpha;
                rVar3 = (r) this.f13966s;
                ResultKt.alpha(obj);
                Hf.a aVar102 = n.alpha;
                this.f13966s = rVar3;
                this.alpha = aoVar4;
                this.white = j7;
                this.yellow = 10;
                break;
            case 10:
                j7 = this.white;
                aoVar4 = this.alpha;
                rVar3 = (r) this.f13966s;
                ResultKt.alpha(obj);
                r rVar9 = rVar3;
                ao aoVar9 = aoVar4;
                long j13 = j7;
                rVar6 = rVar9;
                Long l10 = this.f13969v;
                if (l10 != null) {
                    aoVar9.bravo();
                    long longValue = l10.longValue() - (aoVar9.echo - j13);
                    if (longValue <= 2147483647L) {
                        if (longValue > 0) {
                            this.f13966s = rVar6;
                            this.alpha = null;
                            this.yellow = 11;
                            kilo = ak.kilo(aoVar9, (int) longValue, this);
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IOException("Failed to parse multipart: prologue is too long");
                }
                this.f13966s = rVar6;
                this.alpha = null;
                this.yellow = 13;
                mike2 = ak.mike(aoVar9, this);
                break;
                return aVar7;
            case 11:
                rVar6 = (r) this.f13966s;
                ResultKt.alpha(obj);
                kilo = obj;
                Gf.i body = (Gf.i) kilo;
                Intrinsics.echo(body, "body");
                Object obj7 = new Object();
                this.f13966s = null;
                this.yellow = 12;
                break;
            case 12:
            case 14:
                ResultKt.alpha(obj);
                return Unit.INSTANCE;
            case 13:
                rVar6 = (r) this.f13966s;
                ResultKt.alpha(obj);
                mike2 = obj;
                if (!((Gf.i) mike2).hotel()) {
                    Object obj8 = new Object();
                    this.f13966s = null;
                    this.yellow = 14;
                    break;
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
