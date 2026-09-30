package ld;

import Xd.m;
import hd.n;
import id.C1914b;
import io.ktor.utils.io.t;
import kd.k;
import kd.l;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import pd.AbstractC2304b;
import s6.AbstractC2781u0;
import t6.a4;
import vf.ad;

/* renamed from: ld.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2072h extends Pd.i implements m {
    public AbstractC2304b alpha;
    public cd.c purple;
    public int red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Pd.i f12961s;
    public /* synthetic */ C2065a silver;
    public /* synthetic */ AbstractC2304b teal;
    public final /* synthetic */ l white;
    public final /* synthetic */ C1914b yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2072h(l lVar, C1914b c1914b, Xd.l lVar2, Nd.c cVar) {
        super(3, cVar);
        this.white = lVar;
        this.yellow = c1914b;
        this.f12961s = (Pd.i) lVar2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Xd.l, Pd.i] */
    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? r12 = this.f12961s;
        C2072h c2072h = new C2072h(this.white, this.yellow, r12, (Nd.c) obj3);
        c2072h.silver = (C2065a) obj;
        c2072h.teal = (AbstractC2304b) obj2;
        return c2072h.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x012d, code lost:
    
        if (r10.alpha.echo(r17, r8) != r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b4, code lost:
    
        if (r3.alpha.echo(r17, r2) != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Type inference failed for: r3v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC2304b echo;
        AbstractC2304b echo2;
        Object obj2;
        C2065a c2065a;
        cd.c cVar;
        Object obj3;
        C2065a c2065a2;
        AbstractC2304b abstractC2304b;
        C2070f c2070f;
        C2065a c2065a3;
        Od.a aVar = Od.a.alpha;
        int i4 = this.red;
        ?? r32 = this.f12961s;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 == 5) {
                                ResultKt.alpha(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar = this.purple;
                        AbstractC2304b abstractC2304b2 = this.alpha;
                        echo = this.teal;
                        C2065a c2065a4 = this.silver;
                        ResultKt.alpha(obj);
                        c2065a = c2065a4;
                        echo2 = abstractC2304b2;
                        obj2 = obj;
                        ad.zulu(cVar, (Nd.h) obj2, null, new C2071g(r32, echo2, null), 2);
                        this.silver = null;
                        this.teal = null;
                        this.alpha = null;
                        this.purple = null;
                        this.red = 5;
                    } else {
                        ResultKt.alpha(obj);
                        return Unit.INSTANCE;
                    }
                } else {
                    abstractC2304b = this.teal;
                    c2065a3 = this.silver;
                    ResultKt.alpha(obj);
                    this.silver = null;
                    this.teal = null;
                    this.red = 3;
                }
            } else {
                abstractC2304b = this.teal;
                C2065a c2065a5 = this.silver;
                ResultKt.alpha(obj);
                c2065a2 = c2065a5;
                obj3 = obj;
                c2070f = new C2070f(r32, abstractC2304b, null);
                this.silver = c2065a2;
                this.teal = abstractC2304b;
                this.red = 2;
                if (ad.blue((Nd.h) obj3, c2070f, this) != aVar) {
                    c2065a3 = c2065a2;
                    this.silver = null;
                    this.teal = null;
                    this.red = 3;
                }
                return aVar;
            }
        } else {
            ResultKt.alpha(obj);
            C2065a c2065a6 = this.silver;
            AbstractC2304b abstractC2304b3 = this.teal;
            l lVar = this.white;
            if (lVar != null && !((Boolean) lVar.invoke(abstractC2304b3.bravo())).booleanValue()) {
                return Unit.INSTANCE;
            }
            boolean bravo = n.bravo(abstractC2304b3);
            Nd.i iVar = Nd.i.alpha;
            W8.a aVar2 = Df.a.purple;
            if (bravo) {
                this.silver = c2065a6;
                this.teal = abstractC2304b3;
                this.red = 1;
                obj3 = (Df.a) getContext().get(aVar2);
                if (obj3 == null) {
                    obj3 = iVar;
                }
                if (obj3 != aVar) {
                    c2065a2 = c2065a6;
                    abstractC2304b = abstractC2304b3;
                    c2070f = new C2070f(r32, abstractC2304b, null);
                    this.silver = c2065a2;
                    this.teal = abstractC2304b;
                    this.red = 2;
                    if (ad.blue((Nd.h) obj3, c2070f, this) != aVar) {
                    }
                }
            } else {
                Pair charlie = a4.charlie(abstractC2304b3.delta(), abstractC2304b3);
                t tVar = (t) charlie.first;
                echo = AbstractC2781u0.bravo(abstractC2304b3.bravo(), new k((t) charlie.second, 1)).echo();
                echo2 = AbstractC2781u0.bravo(abstractC2304b3.bravo(), new k(tVar, 1)).echo();
                cd.c cVar2 = this.yellow.alpha;
                this.silver = c2065a6;
                this.teal = echo;
                this.alpha = echo2;
                this.purple = cVar2;
                this.red = 4;
                obj2 = (Df.a) getContext().get(aVar2);
                if (obj2 == null) {
                    obj2 = iVar;
                }
                if (obj2 != aVar) {
                    c2065a = c2065a6;
                    cVar = cVar2;
                    ad.zulu(cVar, (Nd.h) obj2, null, new C2071g(r32, echo2, null), 2);
                    this.silver = null;
                    this.teal = null;
                    this.alpha = null;
                    this.purple = null;
                    this.red = 5;
                }
            }
            return aVar;
        }
    }
}
