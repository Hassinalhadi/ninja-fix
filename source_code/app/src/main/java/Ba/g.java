package Ba;

import delivery.samurai.android.ui.auth.signup.step2personalinfo.AboutYouFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class g extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AboutYouFragment purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(AboutYouFragment aboutYouFragment, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = aboutYouFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return this.purple.requireActivity().getViewModelStore();
            case 1:
                return this.purple.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return this.purple.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
