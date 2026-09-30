package Gc;

import delivery.samurai.android.ui.support.AddSupportTicketActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class b extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AddSupportTicketActivity purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(AddSupportTicketActivity addSupportTicketActivity, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = addSupportTicketActivity;
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
