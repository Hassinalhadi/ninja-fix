package Wb;

import delivery.samurai.android.ui.orders.note.ui.CustomerCallAssistActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class v extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ CustomerCallAssistActivity purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(CustomerCallAssistActivity customerCallAssistActivity, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = customerCallAssistActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return this.purple.getDefaultViewModelProviderFactory();
            case 1:
                return this.purple.getViewModelStore();
            default:
                return this.purple.getDefaultViewModelCreationExtras();
        }
    }
}
