package gd;

import Tf.m;
import io.ktor.utils.io.ag;
import io.ktor.utils.io.ak;
import io.ktor.utils.io.ar;
import java.io.Closeable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.s;
import od.C2227d;
import s6.AbstractC2689j6;
import vf.ad;

/* loaded from: classes2.dex */
public final class i extends Pd.i implements Xd.l {
    public Closeable alpha;
    public Nd.h purple;
    public C2227d red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f12697s;
    public m silver;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Nd.h f12698t;
    public s teal;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2227d f12699u;
    public int white;
    public /* synthetic */ Object yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, Nd.h hVar, C2227d c2227d, Nd.c cVar) {
        super(2, cVar);
        this.f12697s = mVar;
        this.f12698t = hVar;
        this.f12699u = c2227d;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        i iVar = new i(this.f12697s, this.f12698t, this.f12699u, cVar);
        iVar.yellow = obj;
        return iVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((ar) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (((io.ktor.utils.io.m) r12).charlie(r11) != r0) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a5 -> B:8:0x001d). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Closeable closeable;
        ar arVar;
        Nd.h hVar;
        m mVar;
        C2227d c2227d;
        s sVar;
        Closeable closeable2;
        ar arVar2;
        Nd.h hVar2;
        C2227d c2227d2;
        m mVar2;
        s sVar2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.white;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    sVar2 = this.teal;
                    mVar2 = this.silver;
                    c2227d2 = this.red;
                    hVar2 = this.purple;
                    closeable = this.alpha;
                    arVar2 = (ar) this.yellow;
                    ResultKt.alpha(obj);
                    C2227d c2227d3 = c2227d2;
                    sVar = sVar2;
                    closeable2 = closeable;
                    c2227d = c2227d3;
                    arVar = arVar2;
                    hVar = hVar2;
                    mVar = mVar2;
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                        closeable = closeable2;
                        if (closeable != null) {
                            try {
                                closeable.close();
                            } catch (Throwable th4) {
                                AbstractC2689j6.charlie(th, th4);
                            }
                        }
                        if (th == null) {
                        }
                    }
                    if (!mVar.isOpen() && ad.whiskey(hVar) && sVar.alpha >= 0) {
                        ag agVar = arVar.alpha;
                        X9.e eVar = new X9.e(sVar, mVar, c2227d, hVar, 9);
                        this.yellow = arVar;
                        this.alpha = closeable2;
                        this.purple = hVar;
                        this.red = c2227d;
                        this.silver = mVar;
                        this.teal = sVar;
                        this.white = 1;
                        if (ak.romeo(agVar, eVar, this) != aVar) {
                            C2227d c2227d4 = c2227d;
                            closeable = closeable2;
                            sVar2 = sVar;
                            c2227d2 = c2227d4;
                            mVar2 = mVar;
                            hVar2 = hVar;
                            arVar2 = arVar;
                            ag agVar2 = arVar2.alpha;
                            this.yellow = arVar2;
                            this.alpha = closeable;
                            this.purple = hVar2;
                            this.red = c2227d2;
                            this.silver = mVar2;
                            this.teal = sVar2;
                            this.white = 2;
                        }
                        return aVar;
                    }
                    if (closeable2 != null) {
                        try {
                            closeable2.close();
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                    th = null;
                    if (th == null) {
                        return Unit.INSTANCE;
                    }
                    throw th;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar2 = this.teal;
            mVar2 = this.silver;
            c2227d2 = this.red;
            hVar2 = this.purple;
            closeable = this.alpha;
            arVar2 = (ar) this.yellow;
            ResultKt.alpha(obj);
            ag agVar22 = arVar2.alpha;
            this.yellow = arVar2;
            this.alpha = closeable;
            this.purple = hVar2;
            this.red = c2227d2;
            this.silver = mVar2;
            this.teal = sVar2;
            this.white = 2;
        } else {
            ResultKt.alpha(obj);
            arVar = (ar) this.yellow;
            m mVar3 = this.f12697s;
            Object obj2 = new Object();
            hVar = this.f12698t;
            mVar = mVar3;
            c2227d = this.f12699u;
            sVar = obj2;
            closeable2 = mVar;
            if (!mVar.isOpen()) {
            }
            if (closeable2 != null) {
            }
            th = null;
            if (th == null) {
            }
        }
    }
}
