package Oa;

import delivery.samurai.android.ui.captainsuniforms.viewmodel.CaptainsUniformsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ CaptainsUniformsViewModel purple;

    public /* synthetic */ a(CaptainsUniformsViewModel captainsUniformsViewModel, int i4) {
        this.alpha = i4;
        this.purple = captainsUniformsViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                this.purple.alpha(false);
                return Unit.INSTANCE;
            default:
                this.purple.alpha(true);
                return Unit.INSTANCE;
        }
    }
}
