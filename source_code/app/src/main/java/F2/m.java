package F2;

import android.util.Log;
import androidx.compose.material3.internal.r;
import androidx.compose.material3.internal.s;
import ao.ad;
import com.clevertap.android.sdk.network.api.CtApi;
import d.am;
import dd.C1614e;
import io.ktor.utils.io.t;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import od.C2226c;
import pd.C2305c;
import qd.AbstractC2463a;
import rd.C2516a;
import sd.q;
import t6.AbstractC2991f2;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class m extends Pd.i implements Xd.m {
    public final /* synthetic */ int alpha;
    public int purple;
    public /* synthetic */ Object red;
    public /* synthetic */ Object silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i4, int i5, Nd.c cVar) {
        super(i4, cVar);
        this.alpha = i5;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.alpha) {
            case 0:
                m mVar = new m(3, 0, (Nd.c) obj3);
                mVar.red = (InterfaceC3440j) obj;
                mVar.silver = (Object[]) obj2;
                return mVar.invokeSuspend(Unit.INSTANCE);
            case 1:
                m mVar2 = new m(3, 1, (Nd.c) obj3);
                mVar2.red = (InterfaceC3440j) obj;
                mVar2.silver = (Throwable) obj2;
                return mVar2.invokeSuspend(Unit.INSTANCE);
            case 2:
                am amVar = (am) this.silver;
                return new m((s) this.red, amVar, (Nd.c) obj3).invokeSuspend(Unit.INSTANCE);
            case 3:
                m mVar3 = new m((cd.c) this.silver, (Nd.c) obj3, 3);
                mVar3.red = (Dd.f) obj;
                return mVar3.invokeSuspend(Unit.INSTANCE);
            case 4:
                m mVar4 = new m(3, 4, (Nd.c) obj3);
                mVar4.red = (Dd.f) obj;
                mVar4.silver = obj2;
                return mVar4.invokeSuspend(Unit.INSTANCE);
            case 5:
                m mVar5 = new m(3, 5, (Nd.c) obj3);
                mVar5.red = (Dd.f) obj;
                mVar5.silver = (C2305c) obj2;
                return mVar5.invokeSuspend(Unit.INSTANCE);
            case 6:
                m mVar6 = new m((Xd.l) this.silver, (Nd.c) obj3, 6);
                mVar6.red = (Dd.f) obj;
                return mVar6.invokeSuspend(Unit.INSTANCE);
            default:
                m mVar7 = new m((Xd.o) this.silver, (Nd.c) obj3, 7);
                mVar7.red = (Dd.f) obj;
                return mVar7.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [Dd.f] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        c cVar;
        vd.e eVar;
        sd.e eVar2;
        Dd.f fVar;
        m mVar;
        int i4 = 0;
        c cVar2 = null;
        switch (this.alpha) {
            case 0:
                Od.a aVar = Od.a.alpha;
                int i5 = this.purple;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    InterfaceC3440j interfaceC3440j = (InterfaceC3440j) this.red;
                    c[] cVarArr = (c[]) ((Object[]) this.silver);
                    int length = cVarArr.length;
                    while (true) {
                        cVar = a.alpha;
                        if (i4 < length) {
                            c cVar3 = cVarArr[i4];
                            if (!Intrinsics.areEqual(cVar3, cVar)) {
                                cVar2 = cVar3;
                            } else {
                                i4++;
                            }
                        }
                    }
                    if (cVar2 != null) {
                        cVar = cVar2;
                    }
                    this.purple = 1;
                    if (interfaceC3440j.emit(cVar, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                Od.a aVar2 = Od.a.alpha;
                int i10 = this.purple;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    InterfaceC3440j interfaceC3440j2 = (InterfaceC3440j) this.red;
                    Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.silver);
                    G1.b bVar = new G1.b(true);
                    this.red = null;
                    this.purple = 1;
                    if (interfaceC3440j2.emit(bVar, this) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.INSTANCE;
            case 2:
                Od.a aVar3 = Od.a.alpha;
                int i11 = this.purple;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    r rVar = ((s) this.red).alpha;
                    this.purple = 1;
                    if (((am) this.silver).invoke(rVar, this) == aVar3) {
                        return aVar3;
                    }
                }
                return Unit.INSTANCE;
            case 3:
                Od.a aVar4 = Od.a.alpha;
                ?? r12 = this.purple;
                try {
                    if (r12 != 0) {
                        if (r12 == 1) {
                            Dd.f fVar2 = (Dd.f) this.red;
                            ResultKt.alpha(obj);
                            r12 = fVar2;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        Dd.f fVar3 = (Dd.f) this.red;
                        this.red = fVar3;
                        this.purple = 1;
                        obj = fVar3.delta(this);
                        r12 = fVar3;
                        if (obj == aVar4) {
                            return aVar4;
                        }
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    C2516a c2516a = ((cd.c) this.silver).f3491b;
                    com.google.android.gms.measurement.internal.r rVar2 = AbstractC2463a.delta;
                    ((C1614e) r12.alpha).echo();
                    c2516a.getClass();
                    ad.cyan(c2516a.alpha.alpha(rVar2));
                    throw th;
                }
            case 4:
                Od.a aVar5 = Od.a.alpha;
                int i12 = this.purple;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Dd.f fVar4 = (Dd.f) this.red;
                    Object body = this.silver;
                    sd.n nVar = ((C2226c) fVar4.alpha).charlie;
                    List list = q.alpha;
                    String K6 = nVar.K("Accept");
                    Object obj2 = fVar4.alpha;
                    if (K6 == null) {
                        ((C2226c) obj2).charlie.F("Accept", "*/*");
                    }
                    sd.e bravo = AbstractC2991f2.bravo((C2226c) obj2);
                    if (body instanceof String) {
                        String str = (String) body;
                        if (bravo == null) {
                            bravo = sd.d.alpha;
                        }
                        eVar = new vd.f(str, bravo);
                    } else if (body instanceof byte[]) {
                        eVar = new hd.g(bravo, body);
                    } else if (body instanceof t) {
                        eVar = new hd.h(fVar4, bravo, body);
                    } else if (body instanceof vd.e) {
                        eVar = (vd.e) body;
                    } else {
                        C2226c context = (C2226c) obj2;
                        Intrinsics.echo(context, "context");
                        Intrinsics.echo(body, "body");
                        if (body instanceof InputStream) {
                            eVar = new hd.h(context, bravo, body);
                        } else {
                            eVar = null;
                        }
                    }
                    if (eVar != null) {
                        eVar2 = eVar.bravo();
                    } else {
                        eVar2 = null;
                    }
                    if (eVar2 != null) {
                        C2226c c2226c = (C2226c) obj2;
                        ((Map) c2226c.charlie.alpha).remove(CtApi.HEADER_CONTENT_TYPE);
                        hd.k.alpha.hotel("Transformed with default transformers request body for " + c2226c.alpha + " from " + u.alpha.bravo(body.getClass()));
                        this.red = null;
                        this.purple = 1;
                        if (fVar4.echo(this, eVar) == aVar5) {
                            return aVar5;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 5:
                Od.a aVar6 = Od.a.alpha;
                int i13 = this.purple;
                if (i13 != 0) {
                    if (i13 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Dd.f fVar5 = (Dd.f) this.red;
                    C2305c c2305c = (C2305c) this.silver;
                    Ed.a aVar7 = c2305c.alpha;
                    Object obj3 = c2305c.bravo;
                    if (!(obj3 instanceof t)) {
                        return Unit.INSTANCE;
                    }
                    if (Intrinsics.areEqual(aVar7.alpha, u.alpha.bravo(InputStream.class))) {
                        t tVar = (t) obj3;
                        Intrinsics.echo(tVar, "<this>");
                        C2305c c2305c2 = new C2305c(aVar7, new Hd.b(3, new Hd.b(i4, tVar)));
                        this.red = null;
                        this.purple = 1;
                        if (fVar5.echo(this, c2305c2) == aVar6) {
                            return aVar6;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 6:
                Od.a aVar8 = Od.a.alpha;
                int i14 = this.purple;
                if (i14 != 0) {
                    if (i14 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Object obj4 = ((Dd.f) this.red).alpha;
                    this.purple = 1;
                    if (((Xd.l) this.silver).invoke(obj4, this) == aVar8) {
                        return aVar8;
                    }
                }
                return Unit.INSTANCE;
            default:
                Od.a aVar9 = Od.a.alpha;
                int i15 = this.purple;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = (Dd.f) this.red;
                    ResultKt.alpha(obj);
                    mVar = this;
                } else {
                    ResultKt.alpha(obj);
                    fVar = (Dd.f) this.red;
                    Object obj5 = new Object();
                    Object obj6 = fVar.alpha;
                    Object bravo2 = fVar.bravo();
                    C2226c c2226c2 = (C2226c) fVar.alpha;
                    c2226c2.getClass();
                    Ed.a aVar10 = (Ed.a) c2226c2.foxtrot.echo(od.h.alpha);
                    this.red = fVar;
                    this.purple = 1;
                    mVar = this;
                    obj = ((Xd.o) this.silver).golf(obj5, obj6, bravo2, aVar10, mVar);
                    if (obj == aVar9) {
                        return aVar9;
                    }
                }
                vd.e eVar3 = (vd.e) obj;
                if (eVar3 != null) {
                    mVar.red = null;
                    mVar.purple = 2;
                    if (fVar.echo(this, eVar3) == aVar9) {
                        return aVar9;
                    }
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, am amVar, Nd.c cVar) {
        super(3, cVar);
        this.alpha = 2;
        this.red = sVar;
        this.silver = amVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, Nd.c cVar, int i4) {
        super(3, cVar);
        this.alpha = i4;
        this.silver = obj;
    }
}
