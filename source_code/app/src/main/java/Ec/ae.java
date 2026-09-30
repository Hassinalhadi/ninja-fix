package Ec;

import androidx.compose.runtime.C0564b;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class ae implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;

    public /* synthetic */ ae(int i4, boolean z2) {
        this.alpha = i4;
        this.purple = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return C0564b.zulu(Boolean.valueOf(this.purple));
            case 1:
                return C0564b.zulu(Boolean.valueOf(!this.purple));
            default:
                return Boolean.valueOf(this.purple);
        }
    }
}
