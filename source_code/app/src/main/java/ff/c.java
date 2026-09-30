package ff;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class c extends i {
    public final /* synthetic */ List silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, Function0 function0, List list) {
        super(lVar, function0);
        this.silver = list;
        if (lVar != null) {
            if (function0 != null) {
                return;
            } else {
                i.alpha(1);
                throw null;
            }
        }
        i.alpha(0);
        throw null;
    }

    @Override // ff.h
    public final Pf.j foxtrot(boolean z2) {
        return new Pf.j((Object) this.silver, false, 8);
    }
}
