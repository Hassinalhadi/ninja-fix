package N9;

import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import q3.AbstractC2410d;
import s6.AbstractC2832z6;
import t6.AbstractC3075w2;
import td.C3117a;
import vf.ad;
import vf.ao;
import z3.C3462a;

/* loaded from: classes2.dex */
public final class c {
    public final q3.g alpha;
    public final q3.e bravo;
    public final C3117a charlie;

    public c(q3.g provider, q3.e backend) {
        Intrinsics.echo(provider, "provider");
        Intrinsics.echo(backend, "backend");
        this.alpha = provider;
        this.bravo = backend;
        this.charlie = ad.charlie(AbstractC2832z6.charlie(ad.foxtrot(), ao.alpha));
    }

    public final void alpha() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        Iterator it = a.lima.iterator();
        while (true) {
            Object obj2 = null;
            if (it.hasNext()) {
                AbstractC2410d abstractC2410d = (AbstractC2410d) it.next();
                try {
                    Result.Companion companion = Result.INSTANCE;
                    obj = Result.m206constructorimpl(((i) this.alpha).alpha(abstractC2410d).toString());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    obj = Result.m206constructorimpl(ResultKt.createFailure(th));
                }
                if (!(obj instanceof kotlin.k)) {
                    obj2 = obj;
                }
                String str = (String) obj2;
                if (str == null) {
                    str = "?";
                }
                AbstractC3075w2.charlie("flag.".concat(abstractC2410d.alpha), str);
                sb2.append(abstractC2410d.alpha);
                sb2.append('=');
                sb2.append(str);
                sb2.append(' ');
            } else {
                String sb3 = sb2.toString();
                Intrinsics.delta(sb3, "toString(...)");
                C3462a.alpha("FeatureFlags", 12, StringsKt.b(sb3).toString(), null);
                return;
            }
        }
    }
}
