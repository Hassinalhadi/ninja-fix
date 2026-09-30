package jd;

import Xd.o;
import id.C1914b;
import io.ktor.utils.io.t;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pd.AbstractC2304b;
import s6.AbstractC2761r7;
import sd.af;
import sd.m;
import sd.q;
import t6.AbstractC2986e2;
import t6.AbstractC2991f2;

/* loaded from: classes2.dex */
public final class e extends Pd.i implements o {
    public int alpha;
    public /* synthetic */ AbstractC2304b purple;
    public /* synthetic */ t red;
    public /* synthetic */ Ed.a silver;
    public final /* synthetic */ LinkedHashSet teal;
    public final /* synthetic */ ArrayList white;
    public final /* synthetic */ C1914b yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Nd.c cVar, C1914b c1914b, ArrayList arrayList, LinkedHashSet linkedHashSet) {
        super(5, cVar);
        this.teal = linkedHashSet;
        this.white = arrayList;
        this.yellow = c1914b;
    }

    @Override // Xd.o
    public final Object golf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        LinkedHashSet linkedHashSet = this.teal;
        e eVar = new e((Nd.c) obj5, this.yellow, this.white, linkedHashSet);
        eVar.purple = (AbstractC2304b) obj2;
        eVar.red = (t) obj3;
        eVar.silver = (Ed.a) obj4;
        return eVar.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Comparator] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Charset charset;
        Charset charset2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        AbstractC2304b abstractC2304b = this.purple;
        t tVar = this.red;
        Ed.a aVar2 = this.silver;
        sd.e charlie = AbstractC2991f2.charlie(abstractC2304b);
        if (charlie == null) {
            return null;
        }
        m alpha = AbstractC2761r7.bravo(abstractC2304b).alpha();
        Charset defaultCharset = kotlin.text.a.alpha;
        Intrinsics.echo(alpha, "<this>");
        Intrinsics.echo(defaultCharset, "defaultCharset");
        List list = q.alpha;
        Iterator it = CollectionsKt.p(AbstractC2986e2.bravo(alpha.get("Accept-Charset")), new Object()).iterator();
        while (true) {
            if (it.hasNext()) {
                String name = ((sd.i) it.next()).alpha;
                if (Intrinsics.areEqual(name, "*")) {
                    charset = defaultCharset;
                    break;
                }
                Charset charset3 = kotlin.text.a.alpha;
                Intrinsics.echo(name, "name");
                if (Charset.isSupported(name)) {
                    charset = Charset.forName(name);
                    Intrinsics.delta(charset, "forName(...)");
                    break;
                }
            } else {
                charset = null;
                break;
            }
        }
        if (charset == null) {
            charset2 = defaultCharset;
        } else {
            charset2 = charset;
        }
        af url = AbstractC2761r7.bravo(abstractC2304b).getUrl();
        this.purple = null;
        this.red = null;
        this.alpha = 1;
        Object bravo = h.bravo(this.teal, this.white, url, aVar2, tVar, charlie, charset2, this);
        if (bravo == aVar) {
            return aVar;
        }
        return bravo;
    }
}
