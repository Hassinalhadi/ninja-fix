package je;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: je.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1960A extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C1961B purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1960A(C1961B c1961b, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = c1961b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return new az(this.purple);
            default:
                return this.purple.whiskey();
        }
    }
}
