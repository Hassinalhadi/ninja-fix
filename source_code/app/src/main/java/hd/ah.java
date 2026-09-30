package hd;

import androidx.recyclerview.widget.RecyclerView;
import dd.C1614e;
import id.C1915c;
import io.ktor.http.URLParserException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import od.C2226c;
import rd.C2516a;
import s6.AbstractC2742p5;
import s6.E0;
import t6.AbstractC3001h2;

/* loaded from: classes2.dex */
public abstract class ah {
    public static final Set alpha;
    public static final rg.b bravo;
    public static final com.google.android.gms.measurement.internal.r charlie;
    public static final C1915c delta;

    static {
        sd.s sVar = sd.s.bravo;
        alpha = ArraysKt.g(new sd.s[]{sd.s.bravo, sd.s.delta});
        bravo = E0.bravo("io.ktor.client.plugins.HttpRedirect");
        charlie = new com.google.android.gms.measurement.internal.r(15);
        delta = AbstractC2742p5.alpha("HttpRedirect", af.alpha, new l(4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x01f0 -> B:10:0x01f6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(id.f fVar, C2226c c2226c, C1614e c1614e, cd.c cVar, Pd.c cVar2) {
        ag agVar;
        int i4;
        C2226c c2226c2;
        Ref.ObjectRef objectRef;
        sd.ac acVar;
        String str;
        ag agVar2;
        id.f fVar2;
        Ref.ObjectRef objectRef2;
        cd.c cVar3;
        int i5;
        String str2;
        rg.b bVar;
        sd.aa aaVar;
        boolean areEqual;
        sd.aa aaVar2;
        String str3;
        Object alpha2;
        if (cVar2 instanceof ag) {
            ag agVar3 = (ag) cVar2;
            int i10 = agVar3.f12720u;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                agVar3.f12720u = i10 - RecyclerView.UNDEFINED_DURATION;
                agVar = agVar3;
                Object obj = agVar.f12719t;
                Od.a aVar = Od.a.alpha;
                i4 = agVar.f12720u;
                if (i4 == 0) {
                    if (i4 == 1) {
                        Ref.ObjectRef objectRef3 = agVar.f12718s;
                        String str4 = agVar.yellow;
                        sd.ac acVar2 = agVar.white;
                        Ref.ObjectRef objectRef4 = agVar.teal;
                        Ref.ObjectRef objectRef5 = agVar.silver;
                        cd.c cVar4 = agVar.red;
                        C2226c c2226c3 = agVar.purple;
                        id.f fVar3 = agVar.alpha;
                        ResultKt.alpha(obj);
                        agVar2 = agVar;
                        objectRef2 = objectRef5;
                        acVar = acVar2;
                        c2226c2 = c2226c3;
                        Ref.ObjectRef objectRef6 = objectRef4;
                        str = str4;
                        objectRef3.alpha = obj;
                        if (bravo(((C1614e) objectRef2.alpha).echo().golf())) {
                            return objectRef2.alpha;
                        }
                        cVar3 = cVar4;
                        objectRef = objectRef6;
                        fVar2 = fVar3;
                        C2516a c2516a = cVar3.f3491b;
                        ((C1614e) objectRef2.alpha).echo();
                        c2516a.alpha(charlie);
                        sd.m alpha3 = ((C1614e) objectRef2.alpha).echo().alpha();
                        List list = sd.q.alpha;
                        str2 = alpha3.get("Location");
                        StringBuilder victor = Q0.c.victor("Received redirect response to ", str2, " for request ");
                        victor.append(c2226c2.alpha);
                        String sb2 = victor.toString();
                        bVar = bravo;
                        bVar.hotel(sb2);
                        C2226c c2226c4 = new C2226c();
                        c2226c4.bravo((C2226c) objectRef.alpha);
                        aaVar = c2226c4.alpha;
                        ((Map) ((sd.y) aaVar.juliet.purple).alpha).clear();
                        if (str2 != null) {
                            List list2 = sd.ab.alpha;
                            if (!StringsKt.gray(str2)) {
                                try {
                                    sd.ab.bravo(aaVar, str2);
                                } catch (Throwable th) {
                                    throw new URLParserException(str2, th);
                                }
                            }
                        }
                        Intrinsics.echo(acVar, "<this>");
                        String str5 = acVar.alpha;
                        areEqual = Intrinsics.areEqual(str5, "https");
                        aaVar2 = c2226c2.alpha;
                        if (!areEqual || Intrinsics.areEqual(str5, "wss")) {
                            sd.ac charlie2 = aaVar.charlie();
                            Intrinsics.echo(charlie2, "<this>");
                            str3 = charlie2.alpha;
                            if (!Intrinsics.areEqual(str3, "https") && !Intrinsics.areEqual(str3, "wss")) {
                                bVar.hotel("Can not redirect " + aaVar2 + " because of security downgrade");
                                return objectRef2.alpha;
                            }
                        }
                        if (!Intrinsics.areEqual(str, AbstractC3001h2.bravo(aaVar))) {
                            ((Map) c2226c4.charlie.alpha).remove("Authorization");
                            bVar.hotel("Removing Authorization header from redirect for " + aaVar2);
                        }
                        objectRef.alpha = c2226c4;
                        agVar2.alpha = fVar2;
                        agVar2.purple = c2226c2;
                        agVar2.red = cVar3;
                        agVar2.silver = objectRef2;
                        agVar2.teal = objectRef;
                        agVar2.white = acVar;
                        agVar2.yellow = str;
                        agVar2.f12718s = objectRef2;
                        agVar2.f12720u = 1;
                        alpha2 = fVar2.alpha.alpha(c2226c4, agVar2);
                        if (alpha2 != aVar) {
                            return aVar;
                        }
                        Ref.ObjectRef objectRef7 = objectRef;
                        cVar4 = cVar3;
                        obj = alpha2;
                        objectRef6 = objectRef7;
                        fVar3 = fVar2;
                        objectRef3 = objectRef2;
                        objectRef3.alpha = obj;
                        if (bravo(((C1614e) objectRef2.alpha).echo().golf())) {
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    if (!bravo(c1614e.echo().golf())) {
                        return c1614e;
                    }
                    Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
                    objectRef8.alpha = c1614e;
                    Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
                    c2226c2 = c2226c;
                    objectRef9.alpha = c2226c2;
                    sd.ac acVar3 = c1614e.delta().getUrl().f13702a;
                    sd.af url = c1614e.delta().getUrl();
                    Intrinsics.echo(url, "<this>");
                    StringBuilder sb3 = new StringBuilder();
                    StringBuilder sb4 = new StringBuilder();
                    String str6 = (String) url.e.getValue();
                    String str7 = (String) url.f13706f.getValue();
                    if (str6 != null) {
                        sb4.append(str6);
                        if (str7 != null) {
                            sb4.append(':');
                            sb4.append(str7);
                        }
                        sb4.append("@");
                    }
                    sb3.append(sb4.toString());
                    String str8 = url.alpha;
                    int i11 = url.purple;
                    if (i11 != 0) {
                        sd.ac acVar4 = url.f13702a;
                        if (i11 != acVar4.purple) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(str8);
                            sb5.append(':');
                            Integer valueOf = Integer.valueOf(i11);
                            if (i11 == 0) {
                                valueOf = null;
                            }
                            if (valueOf != null) {
                                i5 = valueOf.intValue();
                            } else {
                                i5 = acVar4.purple;
                            }
                            sb5.append(i5);
                            str8 = sb5.toString();
                        }
                    }
                    sb3.append(str8);
                    String sb6 = sb3.toString();
                    objectRef = objectRef9;
                    acVar = acVar3;
                    str = sb6;
                    agVar2 = agVar;
                    fVar2 = fVar;
                    objectRef2 = objectRef8;
                    cVar3 = cVar;
                    C2516a c2516a2 = cVar3.f3491b;
                    ((C1614e) objectRef2.alpha).echo();
                    c2516a2.alpha(charlie);
                    sd.m alpha32 = ((C1614e) objectRef2.alpha).echo().alpha();
                    List list3 = sd.q.alpha;
                    str2 = alpha32.get("Location");
                    StringBuilder victor2 = Q0.c.victor("Received redirect response to ", str2, " for request ");
                    victor2.append(c2226c2.alpha);
                    String sb22 = victor2.toString();
                    bVar = bravo;
                    bVar.hotel(sb22);
                    C2226c c2226c42 = new C2226c();
                    c2226c42.bravo((C2226c) objectRef.alpha);
                    aaVar = c2226c42.alpha;
                    ((Map) ((sd.y) aaVar.juliet.purple).alpha).clear();
                    if (str2 != null) {
                    }
                    Intrinsics.echo(acVar, "<this>");
                    String str52 = acVar.alpha;
                    areEqual = Intrinsics.areEqual(str52, "https");
                    aaVar2 = c2226c2.alpha;
                    if (!areEqual) {
                    }
                    sd.ac charlie22 = aaVar.charlie();
                    Intrinsics.echo(charlie22, "<this>");
                    str3 = charlie22.alpha;
                    if (!Intrinsics.areEqual(str3, "https")) {
                        bVar.hotel("Can not redirect " + aaVar2 + " because of security downgrade");
                        return objectRef2.alpha;
                    }
                    if (!Intrinsics.areEqual(str, AbstractC3001h2.bravo(aaVar))) {
                    }
                    objectRef.alpha = c2226c42;
                    agVar2.alpha = fVar2;
                    agVar2.purple = c2226c2;
                    agVar2.red = cVar3;
                    agVar2.silver = objectRef2;
                    agVar2.teal = objectRef;
                    agVar2.white = acVar;
                    agVar2.yellow = str;
                    agVar2.f12718s = objectRef2;
                    agVar2.f12720u = 1;
                    alpha2 = fVar2.alpha.alpha(c2226c42, agVar2);
                    if (alpha2 != aVar) {
                    }
                }
            }
        }
        agVar = new Pd.c(cVar2);
        Object obj2 = agVar.f12719t;
        Od.a aVar2 = Od.a.alpha;
        i4 = agVar.f12720u;
        if (i4 == 0) {
        }
    }

    public static final boolean bravo(sd.v vVar) {
        int i4 = vVar.alpha;
        sd.v vVar2 = sd.v.red;
        if (i4 != sd.v.red.alpha && i4 != sd.v.silver.alpha && i4 != sd.v.white.alpha && i4 != sd.v.yellow.alpha && i4 != sd.v.teal.alpha) {
            return false;
        }
        return true;
    }
}
