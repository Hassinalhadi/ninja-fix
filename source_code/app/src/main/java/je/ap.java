package je;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ue.C3158b;

/* loaded from: classes2.dex */
public final class ap extends Lambda implements Function0 {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ ar purple;
    public final /* synthetic */ at red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(ar arVar, at atVar) {
        super(0);
        this.purple = arVar;
        this.red = atVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        switch (this.alpha) {
            case 0:
                ar arVar = this.purple;
                arVar.getClass();
                ge.v vVar = ar.golf[1];
                Object invoke = arVar.delta.invoke();
                Intrinsics.delta(invoke, "<get-scope>(...)");
                return this.red.tango((Xe.n) invoke, 1);
            default:
                ar arVar2 = this.purple;
                arVar2.getClass();
                ge.v vVar2 = ar.golf[0];
                C3158b c3158b = (C3158b) arVar2.charlie.invoke();
                if (c3158b != null) {
                    He.b bVar = c3158b.bravo;
                    if (((He.a) bVar.delta) == He.a.MULTIFILE_CLASS_PART) {
                        str = bVar.bravo;
                        if (str == null && str.length() > 0) {
                            return this.red.purple.getClassLoader().loadClass(kotlin.text.r.november(str, '/', '.'));
                        }
                    }
                }
                str = null;
                return str == null ? null : null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(at atVar, ar arVar) {
        super(0);
        this.red = atVar;
        this.purple = arVar;
    }
}
