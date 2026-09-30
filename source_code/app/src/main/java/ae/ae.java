package ae;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ae extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ai purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae(ai aiVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = aiVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                this.purple.delta();
                return Unit.INSTANCE;
            case 1:
                this.purple.charlie();
                return Unit.INSTANCE;
            default:
                this.purple.delta();
                return Unit.INSTANCE;
        }
    }
}
