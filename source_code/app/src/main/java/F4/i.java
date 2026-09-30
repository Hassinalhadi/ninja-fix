package F4;

import com.checkout.components.core.ui.FlowComponentViewRenderer;
import com.checkout.components.interfaces.model.CardMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ FlowComponentViewRenderer purple;

    public /* synthetic */ i(FlowComponentViewRenderer flowComponentViewRenderer, int i4) {
        this.alpha = i4;
        this.purple = flowComponentViewRenderer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CardMetadata c3;
        boolean a6;
        CardMetadata b2;
        switch (this.alpha) {
            case 0:
                c3 = FlowComponentViewRenderer.c(this.purple);
                return c3;
            case 1:
                a6 = FlowComponentViewRenderer.a(this.purple);
                return Boolean.valueOf(a6);
            default:
                b2 = FlowComponentViewRenderer.b(this.purple);
                return b2;
        }
    }
}
