package hd;

import com.clevertap.android.sdk.network.api.CtApi;
import d.C1534h0;
import dd.C1614e;
import ge.InterfaceC1772d;
import h5.C1809a;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import od.C2226c;
import pd.AbstractC2304b;
import pd.C2305c;
import s6.AbstractC2799w0;
import t6.AbstractC2976c2;
import t6.AbstractC2991f2;
import td.C3117a;
import vf.H;
import vf.I;
import vf.J;
import vf.Y;
import zd.C3509a;

/* loaded from: classes2.dex */
public final class j extends Pd.i implements Xd.m {
    public final /* synthetic */ int alpha = 0;
    public int purple;
    public vf.ab red;
    public /* synthetic */ Object silver;
    public Object teal;
    public /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(cd.c cVar, Nd.c cVar2) {
        super(3, cVar2);
        this.yellow = cVar;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.alpha) {
            case 0:
                j jVar = new j((cd.c) this.yellow, (Nd.c) obj3);
                jVar.silver = (Dd.f) obj;
                jVar.white = (C2305c) obj2;
                return jVar.invokeSuspend(Unit.INSTANCE);
            default:
                j jVar2 = new j((Long) this.teal, (Long) this.white, (Long) this.yellow, (Nd.c) obj3);
                jVar2.red = (id.f) obj;
                jVar2.silver = (C2226c) obj2;
                return jVar2.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:51:0x00f9. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:58:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Dd.f fVar;
        Ed.a aVar;
        Object mike;
        Dd.f fVar2;
        Dd.f fVar3;
        Ed.a aVar2;
        Object echo;
        Dd.f fVar4;
        Object echo2;
        Object echo3;
        Object quebec;
        Object mike2;
        Dd.f fVar5;
        Object echo4;
        Object echo5;
        Dd.f fVar6;
        Object echo6;
        Object echo7;
        boolean z2;
        Object obj2;
        int i4 = 9;
        Object obj3 = this.yellow;
        C2305c c2305c = null;
        Long l10 = null;
        switch (this.alpha) {
            case 0:
                Od.a aVar3 = Od.a.alpha;
                switch (this.purple) {
                    case 0:
                        ResultKt.alpha(obj);
                        fVar = (Dd.f) this.silver;
                        C2305c c2305c2 = (C2305c) this.white;
                        aVar = c2305c2.alpha;
                        Object obj4 = c2305c2.bravo;
                        if (!(obj4 instanceof io.ktor.utils.io.t)) {
                            return Unit.INSTANCE;
                        }
                        AbstractC2304b echo8 = ((C1614e) fVar.alpha).echo();
                        InterfaceC1772d interfaceC1772d = aVar.alpha;
                        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
                        if (Intrinsics.areEqual(interfaceC1772d, vVar.bravo(Unit.class))) {
                            io.ktor.utils.io.ak.bravo((io.ktor.utils.io.t) obj4);
                            C2305c c2305c3 = new C2305c(aVar, Unit.INSTANCE);
                            this.silver = fVar;
                            this.white = aVar;
                            this.purple = 1;
                            echo4 = fVar.echo(this, c2305c3);
                            if (echo4 != aVar3) {
                                fVar4 = fVar;
                                c2305c = (C2305c) echo4;
                                fVar = fVar4;
                                if (c2305c != null) {
                                    k.alpha.hotel("Transformed with default transformers response body for " + ((C1614e) fVar.alpha).delta().getUrl() + " to " + aVar.alpha);
                                }
                                return Unit.INSTANCE;
                            }
                            return aVar3;
                        }
                        if (Intrinsics.areEqual(interfaceC1772d, vVar.bravo(Integer.TYPE))) {
                            this.silver = fVar;
                            this.white = aVar;
                            this.red = fVar;
                            this.teal = aVar;
                            this.purple = 2;
                            mike2 = io.ktor.utils.io.ak.mike((io.ktor.utils.io.t) obj4, this);
                            if (mike2 != aVar3) {
                                fVar5 = fVar;
                                aVar2 = aVar;
                                Gf.i iVar = (Gf.i) mike2;
                                Intrinsics.echo(iVar, "<this>");
                                C2305c c2305c4 = new C2305c(aVar, new Integer(Integer.parseInt(Gf.j.bravo(iVar))));
                                this.silver = fVar;
                                this.white = aVar2;
                                this.red = null;
                                this.teal = null;
                                this.purple = 3;
                                echo5 = fVar5.echo(this, c2305c4);
                                if (echo5 == aVar3) {
                                    fVar6 = fVar;
                                    c2305c = (C2305c) echo5;
                                    fVar = fVar6;
                                    aVar = aVar2;
                                    if (c2305c != null) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                return aVar3;
                            }
                            return aVar3;
                        }
                        if (!Intrinsics.areEqual(interfaceC1772d, vVar.bravo(Gf.i.class)) && !Intrinsics.areEqual(interfaceC1772d, vVar.bravo(Gf.i.class))) {
                            if (Intrinsics.areEqual(interfaceC1772d, vVar.bravo(byte[].class))) {
                                this.silver = fVar;
                                this.white = aVar;
                                this.purple = 6;
                                quebec = io.ktor.utils.io.ak.quebec((io.ktor.utils.io.t) obj4, this);
                                if (quebec != aVar3) {
                                    fVar4 = fVar;
                                    AbstractC2799w0.bravo(AbstractC2991f2.alpha(((C1614e) fVar4.alpha).echo()), r1.length, ((C1614e) fVar4.alpha).delta().uniform());
                                    C2305c c2305c5 = new C2305c(aVar, (byte[]) quebec);
                                    this.silver = fVar4;
                                    this.white = aVar;
                                    this.purple = 7;
                                    echo7 = fVar4.echo(this, c2305c5);
                                    if (echo7 == aVar3) {
                                        return aVar3;
                                    }
                                    c2305c = (C2305c) echo7;
                                    fVar = fVar4;
                                    if (c2305c != null) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                return aVar3;
                            }
                            if (Intrinsics.areEqual(interfaceC1772d, vVar.bravo(io.ktor.utils.io.t.class))) {
                                J j5 = new J((I) echo8.charlie().get(H.alpha));
                                com.google.android.play.core.integrity.c uniform = io.ktor.utils.io.ak.uniform(fVar, ((cd.c) obj3).red, new i(obj4, echo8, null), 2);
                                ((Y) uniform.red).crimson(new C1534h0(i4, j5));
                                C2305c c2305c6 = new C2305c(aVar, (io.ktor.utils.io.m) uniform.purple);
                                this.silver = fVar;
                                this.white = aVar;
                                this.purple = 8;
                                echo3 = fVar.echo(this, c2305c6);
                                if (echo3 != aVar3) {
                                    fVar4 = fVar;
                                    c2305c = (C2305c) echo3;
                                    fVar = fVar4;
                                    if (c2305c != null) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                return aVar3;
                            }
                            if (Intrinsics.areEqual(interfaceC1772d, vVar.bravo(sd.v.class))) {
                                io.ktor.utils.io.ak.bravo((io.ktor.utils.io.t) obj4);
                                C2305c c2305c7 = new C2305c(aVar, echo8.golf());
                                this.silver = fVar;
                                this.white = aVar;
                                this.purple = 9;
                                echo2 = fVar.echo(this, c2305c7);
                                if (echo2 != aVar3) {
                                    fVar4 = fVar;
                                    c2305c = (C2305c) echo2;
                                    fVar = fVar4;
                                    if (c2305c != null) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                return aVar3;
                            }
                            if (Intrinsics.areEqual(interfaceC1772d, vVar.bravo(C3117a.class))) {
                                C1614e c1614e = (C1614e) fVar.alpha;
                                sd.m alpha = c1614e.echo().alpha();
                                List list = sd.q.alpha;
                                String str = alpha.get(CtApi.HEADER_CONTENT_TYPE);
                                if (str != null) {
                                    sd.e eVar = sd.e.white;
                                    sd.e bravo = AbstractC2976c2.bravo(str);
                                    if (bravo.zulu(sd.c.alpha)) {
                                        String str2 = c1614e.echo().alpha().get("Content-Length");
                                        if (str2 != null) {
                                            l10 = new Long(Long.parseLong(str2));
                                        }
                                        C2305c c2305c8 = new C2305c(aVar, new C3117a(fVar.charlie(), (io.ktor.utils.io.t) obj4, str, l10));
                                        this.silver = fVar;
                                        this.white = aVar;
                                        this.purple = 10;
                                        echo = fVar.echo(this, c2305c8);
                                        if (echo != aVar3) {
                                            fVar4 = fVar;
                                            c2305c = (C2305c) echo;
                                            fVar = fVar4;
                                        } else {
                                            return aVar3;
                                        }
                                    } else {
                                        throw new IllegalStateException(("Expected multipart/form-data, got " + bravo).toString());
                                    }
                                } else {
                                    throw new IllegalStateException("No content type provided for multipart");
                                }
                            }
                            if (c2305c != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        this.silver = fVar;
                        this.white = aVar;
                        this.red = fVar;
                        this.teal = aVar;
                        this.purple = 4;
                        mike = io.ktor.utils.io.ak.mike((io.ktor.utils.io.t) obj4, this);
                        if (mike != aVar3) {
                            fVar2 = fVar;
                            fVar3 = fVar2;
                            aVar2 = aVar;
                            C2305c c2305c9 = new C2305c(aVar, mike);
                            this.silver = fVar3;
                            this.white = aVar2;
                            this.red = null;
                            this.teal = null;
                            this.purple = 5;
                            echo6 = fVar2.echo(this, c2305c9);
                            if (echo6 == aVar3) {
                                fVar6 = fVar3;
                                c2305c = (C2305c) echo6;
                                fVar = fVar6;
                                aVar = aVar2;
                                if (c2305c != null) {
                                }
                                return Unit.INSTANCE;
                            }
                            return aVar3;
                        }
                        return aVar3;
                    case 1:
                        Ed.a aVar4 = (Ed.a) this.white;
                        fVar4 = (Dd.f) this.silver;
                        ResultKt.alpha(obj);
                        aVar = aVar4;
                        echo4 = obj;
                        c2305c = (C2305c) echo4;
                        fVar = fVar4;
                        if (c2305c != null) {
                        }
                        return Unit.INSTANCE;
                    case 2:
                        Ed.a aVar5 = (Ed.a) this.teal;
                        fVar5 = (Dd.f) this.red;
                        aVar2 = (Ed.a) this.white;
                        fVar = (Dd.f) this.silver;
                        ResultKt.alpha(obj);
                        aVar = aVar5;
                        mike2 = obj;
                        Gf.i iVar2 = (Gf.i) mike2;
                        Intrinsics.echo(iVar2, "<this>");
                        C2305c c2305c42 = new C2305c(aVar, new Integer(Integer.parseInt(Gf.j.bravo(iVar2))));
                        this.silver = fVar;
                        this.white = aVar2;
                        this.red = null;
                        this.teal = null;
                        this.purple = 3;
                        echo5 = fVar5.echo(this, c2305c42);
                        if (echo5 == aVar3) {
                        }
                        break;
                    case 3:
                        Ed.a aVar6 = (Ed.a) this.white;
                        fVar6 = (Dd.f) this.silver;
                        ResultKt.alpha(obj);
                        aVar2 = aVar6;
                        echo5 = obj;
                        c2305c = (C2305c) echo5;
                        fVar = fVar6;
                        aVar = aVar2;
                        if (c2305c != null) {
                        }
                        return Unit.INSTANCE;
                    case 4:
                        Ed.a aVar7 = (Ed.a) this.teal;
                        fVar2 = (Dd.f) this.red;
                        aVar2 = (Ed.a) this.white;
                        fVar3 = (Dd.f) this.silver;
                        ResultKt.alpha(obj);
                        aVar = aVar7;
                        mike = obj;
                        C2305c c2305c92 = new C2305c(aVar, mike);
                        this.silver = fVar3;
                        this.white = aVar2;
                        this.red = null;
                        this.teal = null;
                        this.purple = 5;
                        echo6 = fVar2.echo(this, c2305c92);
                        if (echo6 == aVar3) {
                        }
                        break;
                    case 5:
                        Ed.a aVar8 = (Ed.a) this.white;
                        fVar6 = (Dd.f) this.silver;
                        ResultKt.alpha(obj);
                        aVar2 = aVar8;
                        echo6 = obj;
                        c2305c = (C2305c) echo6;
                        fVar = fVar6;
                        aVar = aVar2;
                        if (c2305c != null) {
                        }
                        return Unit.INSTANCE;
                    case 6:
                        Ed.a aVar9 = (Ed.a) this.white;
                        fVar4 = (Dd.f) this.silver;
                        ResultKt.alpha(obj);
                        aVar = aVar9;
                        quebec = obj;
                        AbstractC2799w0.bravo(AbstractC2991f2.alpha(((C1614e) fVar4.alpha).echo()), r1.length, ((C1614e) fVar4.alpha).delta().uniform());
                        C2305c c2305c52 = new C2305c(aVar, (byte[]) quebec);
                        this.silver = fVar4;
                        this.white = aVar;
                        this.purple = 7;
                        echo7 = fVar4.echo(this, c2305c52);
                        if (echo7 == aVar3) {
                        }
                        c2305c = (C2305c) echo7;
                        fVar = fVar4;
                        if (c2305c != null) {
                        }
                        return Unit.INSTANCE;
                    case 7:
                        Ed.a aVar10 = (Ed.a) this.white;
                        fVar4 = (Dd.f) this.silver;
                        ResultKt.alpha(obj);
                        aVar = aVar10;
                        echo7 = obj;
                        c2305c = (C2305c) echo7;
                        fVar = fVar4;
                        if (c2305c != null) {
                        }
                        return Unit.INSTANCE;
                    case 8:
                        Ed.a aVar11 = (Ed.a) this.white;
                        fVar4 = (Dd.f) this.silver;
                        ResultKt.alpha(obj);
                        aVar = aVar11;
                        echo3 = obj;
                        c2305c = (C2305c) echo3;
                        fVar = fVar4;
                        if (c2305c != null) {
                        }
                        return Unit.INSTANCE;
                    case 9:
                        Ed.a aVar12 = (Ed.a) this.white;
                        fVar4 = (Dd.f) this.silver;
                        ResultKt.alpha(obj);
                        aVar = aVar12;
                        echo2 = obj;
                        c2305c = (C2305c) echo2;
                        fVar = fVar4;
                        if (c2305c != null) {
                        }
                        return Unit.INSTANCE;
                    case 10:
                        Ed.a aVar13 = (Ed.a) this.white;
                        fVar4 = (Dd.f) this.silver;
                        ResultKt.alpha(obj);
                        aVar = aVar13;
                        echo = obj;
                        c2305c = (C2305c) echo;
                        fVar = fVar4;
                        if (c2305c != null) {
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            default:
                Od.a aVar14 = Od.a.alpha;
                int i5 = this.purple;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ResultKt.alpha(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                id.f fVar7 = (id.f) this.red;
                C2226c c2226c = (C2226c) this.silver;
                rg.b bVar = ar.alpha;
                sd.ac charlie = c2226c.alpha.charlie();
                Intrinsics.echo(charlie, "<this>");
                String str3 = charlie.alpha;
                if (!Intrinsics.areEqual(str3, "ws") && !Intrinsics.areEqual(str3, "wss")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                an anVar = an.alpha;
                C3509a c3509a = fd.h.alpha;
                zd.i iVar3 = c2226c.foxtrot;
                Map map = (Map) iVar3.echo(c3509a);
                if (map != null) {
                    obj2 = map.get(anVar);
                } else {
                    obj2 = null;
                }
                ao aoVar = (ao) obj2;
                Long l11 = (Long) obj3;
                Long l12 = (Long) this.white;
                Long l13 = (Long) this.teal;
                if (aoVar == null && ((z2 && l13 != null) || l12 != null || l11 != null)) {
                    aoVar = new ao();
                    ((Map) iVar3.alpha(c3509a, new C1809a(23))).put(anVar, aoVar);
                }
                if (aoVar != null) {
                    Long l14 = aoVar.bravo;
                    if (l14 != null) {
                        l12 = l14;
                    }
                    ao.alpha(l12);
                    aoVar.bravo = l12;
                    Long l15 = aoVar.charlie;
                    if (l15 != null) {
                        l11 = l15;
                    }
                    ao.alpha(l11);
                    aoVar.charlie = l11;
                    if (z2) {
                        Long l16 = aoVar.alpha;
                        if (l16 != null) {
                            l13 = l16;
                        }
                        ao.alpha(l13);
                        aoVar.alpha = l13;
                        if (l13 != null && l13.longValue() != Long.MAX_VALUE) {
                            c2226c.echo.crimson(new C1534h0(12, vf.ad.zulu(fVar7, new vf.aa("request-timeout"), null, new aq(l13, c2226c, c2226c.echo, null), 2)));
                        }
                    }
                }
                this.red = null;
                this.purple = 1;
                Object alpha2 = fVar7.alpha.alpha(c2226c, this);
                if (alpha2 != aVar14) {
                    return alpha2;
                }
                return aVar14;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Long l10, Long l11, Long l12, Nd.c cVar) {
        super(3, cVar);
        this.teal = l10;
        this.white = l11;
        this.yellow = l12;
    }
}
