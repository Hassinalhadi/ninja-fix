package bx;

import bz.V;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class av extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ aw purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ av(aw awVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = awVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                V v4 = (V) obj;
                ai aiVar = ai.alpha;
                ai aiVar2 = ai.purple;
                boolean bravo = v4.bravo(aiVar, aiVar2);
                Object obj2 = null;
                aw awVar = this.purple;
                if (bravo) {
                    ac acVar = ((ay) awVar.teal).bravo.bravo;
                    if (acVar != null) {
                        obj2 = acVar.charlie;
                    }
                } else if (v4.bravo(aiVar2, ai.red)) {
                    ac acVar2 = ((A) awVar.white).charlie.bravo;
                    if (acVar2 != null) {
                        obj2 = acVar2.charlie;
                    }
                } else {
                    obj2 = ar.delta;
                }
                if (obj2 == null) {
                    return ar.delta;
                }
                return obj2;
            default:
                V v6 = (V) obj;
                ai aiVar3 = ai.alpha;
                ai aiVar4 = ai.purple;
                boolean bravo2 = v6.bravo(aiVar3, aiVar4);
                aw awVar2 = this.purple;
                if (bravo2) {
                    ((ay) awVar2.teal).bravo.getClass();
                    return ar.charlie;
                }
                if (v6.bravo(aiVar4, ai.red)) {
                    ((A) awVar2.white).charlie.getClass();
                    return ar.charlie;
                }
                return ar.charlie;
        }
    }
}
