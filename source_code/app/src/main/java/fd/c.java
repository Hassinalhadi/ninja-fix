package fd;

import Xd.m;
import d.C1534h0;
import dd.C1614e;
import dd.C1617h;
import ge.InterfaceC1772d;
import ge.w;
import hd.ak;
import hd.al;
import hd.am;
import hd.au;
import io.ktor.http.UnsafeHeaderException;
import io.ktor.utils.io.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.n;
import od.C2224a;
import od.C2226c;
import od.C2227d;
import pd.AbstractC2304b;
import qd.AbstractC2463a;
import s6.H4;
import sd.af;
import sd.o;
import sd.q;
import sd.s;
import t6.AbstractC2991f2;
import vf.a0;
import vf.ad;
import zd.C3509a;

/* loaded from: classes2.dex */
public final class c extends Pd.i implements m {
    public final /* synthetic */ int alpha;
    public int purple;
    public /* synthetic */ Object red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ cd.c teal;
    public final /* synthetic */ Object white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(cd.c cVar, f fVar, Nd.c cVar2) {
        super(3, cVar2);
        this.alpha = 0;
        this.teal = cVar;
        this.white = fVar;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.alpha) {
            case 0:
                f fVar = (f) this.white;
                c cVar = new c(this.teal, fVar, (Nd.c) obj3);
                cVar.red = (Dd.f) obj;
                cVar.silver = obj2;
                return cVar.invokeSuspend(Unit.INSTANCE);
            case 1:
                c cVar2 = new c((am) this.white, this.teal, (Nd.c) obj3, 1);
                cVar2.red = (Dd.f) obj;
                cVar2.silver = obj2;
                return cVar2.invokeSuspend(Unit.INSTANCE);
            default:
                c cVar3 = new c((m) this.white, this.teal, (Nd.c) obj3, 2);
                cVar3.red = (au) obj;
                cVar3.silver = (C2226c) obj2;
                return cVar3.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        w wVar;
        vd.e eVar;
        f fVar;
        Object alpha;
        Dd.f fVar2;
        C2227d requestData;
        g gVar;
        w wVar2;
        Dd.f fVar3;
        w wVar3;
        Object alpha2;
        w wVar4;
        switch (this.alpha) {
            case 0:
                Od.a aVar = Od.a.alpha;
                int i4 = this.purple;
                cd.c client = this.teal;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    requestData = (C2227d) this.silver;
                    Dd.f fVar4 = (Dd.f) this.red;
                    ResultKt.alpha(obj);
                    fVar2 = fVar4;
                    alpha = obj;
                } else {
                    ResultKt.alpha(obj);
                    Dd.f fVar5 = (Dd.f) this.red;
                    Object obj2 = this.silver;
                    C2226c c2226c = new C2226c();
                    c2226c.bravo((C2226c) fVar5.alpha);
                    if (obj2 == null) {
                        c2226c.delta = vd.b.alpha;
                        InterfaceC1772d bravo = u.alpha.bravo(Object.class);
                        try {
                            wVar2 = u.alpha(Object.class);
                        } catch (Throwable unused) {
                            wVar2 = null;
                        }
                        c2226c.alpha(new Ed.a(bravo, wVar2));
                    } else if (obj2 instanceof vd.e) {
                        c2226c.delta = obj2;
                        c2226c.alpha(null);
                    } else {
                        c2226c.delta = obj2;
                        InterfaceC1772d bravo2 = u.alpha.bravo(Object.class);
                        try {
                            wVar = u.alpha(Object.class);
                        } catch (Throwable unused2) {
                            wVar = null;
                        }
                        c2226c.alpha(new Ed.a(bravo2, wVar));
                    }
                    client.f3491b.alpha(AbstractC2463a.bravo);
                    af bravo3 = c2226c.alpha.bravo();
                    s sVar = c2226c.bravo;
                    o X10 = c2226c.charlie.X();
                    Object obj3 = c2226c.delta;
                    if (obj3 instanceof vd.e) {
                        eVar = (vd.e) obj3;
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        a0 a0Var = c2226c.echo;
                        zd.i iVar = c2226c.foxtrot;
                        C2227d c2227d = new C2227d(bravo3, sVar, X10, eVar, a0Var, iVar);
                        iVar.foxtrot(i.bravo, client.f3492c);
                        Set keySet = X10.charlie.keySet();
                        Intrinsics.echo(keySet, "<this>");
                        Set unmodifiableSet = Collections.unmodifiableSet(keySet);
                        Intrinsics.delta(unmodifiableSet, "unmodifiableSet(...)");
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : unmodifiableSet) {
                            if (q.alpha.contains((String) obj4)) {
                                arrayList.add(obj4);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            Iterator it = c2227d.golf.iterator();
                            do {
                                boolean hasNext = it.hasNext();
                                fVar = (f) this.white;
                                if (hasNext) {
                                    gVar = (g) it.next();
                                } else {
                                    this.red = fVar5;
                                    this.silver = c2227d;
                                    this.purple = 1;
                                    alpha = H4.alpha(fVar, c2227d, this);
                                    if (alpha != aVar) {
                                        fVar2 = fVar5;
                                        requestData = c2227d;
                                    } else {
                                        return aVar;
                                    }
                                }
                            } while (fVar.bronze().contains(gVar));
                            throw new IllegalArgumentException(("Engine doesn't support " + gVar).toString());
                        }
                        throw new UnsafeHeaderException(arrayList.toString());
                    }
                    throw new IllegalStateException(("No request transformation found: " + c2226c.delta).toString());
                }
                od.g responseData = (od.g) alpha;
                Intrinsics.echo(client, "client");
                Intrinsics.echo(requestData, "requestData");
                Intrinsics.echo(responseData, "responseData");
                C1614e c1614e = new C1614e(client);
                c1614e.purple = new C2224a(c1614e, requestData);
                c1614e.red = new C1617h(c1614e, responseData);
                zd.i beige = c1614e.beige();
                C3509a key = C1614e.teal;
                beige.getClass();
                Intrinsics.echo(key, "key");
                beige.delta().remove(key);
                Object obj5 = responseData.echo;
                if (!(obj5 instanceof t)) {
                    c1614e.beige().foxtrot(key, obj5);
                }
                AbstractC2304b echo = c1614e.echo();
                client.f3491b.alpha(AbstractC2463a.charlie);
                ad.sierra(echo.charlie()).crimson(new C1534h0(client, echo));
                this.red = null;
                this.silver = null;
                this.purple = 2;
                if (fVar2.echo(this, c1614e) == aVar) {
                    return aVar;
                }
                return Unit.INSTANCE;
            case 1:
                Od.a aVar2 = Od.a.alpha;
                int i5 = this.purple;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar3 = (Dd.f) this.red;
                    ResultKt.alpha(obj);
                    alpha2 = obj;
                } else {
                    ResultKt.alpha(obj);
                    fVar3 = (Dd.f) this.red;
                    Object obj6 = this.silver;
                    if (obj6 instanceof vd.e) {
                        C2226c c2226c2 = (C2226c) fVar3.alpha;
                        if (obj6 == null) {
                            vd.b bVar = vd.b.alpha;
                            c2226c2.getClass();
                            c2226c2.delta = bVar;
                            InterfaceC1772d bravo4 = u.alpha.bravo(vd.e.class);
                            try {
                                wVar4 = u.alpha(vd.e.class);
                            } catch (Throwable unused3) {
                                wVar4 = null;
                            }
                            c2226c2.alpha(new Ed.a(bravo4, wVar4));
                        } else if (obj6 != null) {
                            c2226c2.getClass();
                            Intrinsics.echo(obj6, "<set-?>");
                            c2226c2.delta = obj6;
                            c2226c2.alpha(null);
                        } else {
                            c2226c2.getClass();
                            Intrinsics.echo(obj6, "<set-?>");
                            c2226c2.delta = obj6;
                            InterfaceC1772d bravo5 = u.alpha.bravo(vd.e.class);
                            try {
                                wVar3 = u.alpha(vd.e.class);
                            } catch (Throwable unused4) {
                                wVar3 = null;
                            }
                            c2226c2.alpha(new Ed.a(bravo5, wVar3));
                        }
                        am amVar = (am) this.white;
                        amVar.getClass();
                        au akVar = new ak(this.teal);
                        Iterator it2 = CollectionsKt.i(amVar.alpha).iterator();
                        while (it2.hasNext()) {
                            akVar = new al((m) it2.next(), akVar);
                        }
                        C2226c c2226c3 = (C2226c) fVar3.alpha;
                        this.red = fVar3;
                        this.purple = 1;
                        alpha2 = akVar.alpha(c2226c3, this);
                        if (alpha2 == aVar2) {
                            return aVar2;
                        }
                    } else {
                        throw new IllegalStateException(n.delta("\n|Fail to prepare request body for sending. \n|The body type is: " + u.alpha.bravo(obj6.getClass()) + ", with Content-Type: " + AbstractC2991f2.bravo((C2226c) fVar3.alpha) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.").toString());
                    }
                }
                this.red = null;
                this.purple = 2;
                if (fVar3.echo(this, (C1614e) alpha2) == aVar2) {
                    return aVar2;
                }
                return Unit.INSTANCE;
            default:
                Od.a aVar3 = Od.a.alpha;
                int i10 = this.purple;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.alpha(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                au auVar = (au) this.red;
                C2226c c2226c4 = (C2226c) this.silver;
                id.f fVar6 = new id.f(auVar, this.teal.red);
                this.red = null;
                this.purple = 1;
                Object invoke = ((m) this.white).invoke(fVar6, c2226c4, this);
                if (invoke != aVar3) {
                    return invoke;
                }
                return aVar3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, cd.c cVar, Nd.c cVar2, int i4) {
        super(3, cVar2);
        this.alpha = i4;
        this.white = obj;
        this.teal = cVar;
    }
}
