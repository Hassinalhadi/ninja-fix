package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ao implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ aq purple;

    public /* synthetic */ ao(aq aqVar, int i4) {
        this.alpha = i4;
        this.purple = aqVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return Float.valueOf(this.purple.purple.bravo());
            case 1:
                return Float.valueOf(this.purple.purple.delta());
            default:
                aq aqVar = this.purple;
                return Float.valueOf(aqVar.purple.alpha() - aqVar.purple.charlie());
        }
    }
}
