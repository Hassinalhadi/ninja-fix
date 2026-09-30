package Jb;

import delivery.samurai.android.ui.homev2.HomeActivityV2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class A extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ HomeActivityV2 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(HomeActivityV2 homeActivityV2, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = homeActivityV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return this.purple.getDefaultViewModelProviderFactory();
            case 1:
                return this.purple.getViewModelStore();
            case 2:
                return this.purple.getDefaultViewModelCreationExtras();
            case 3:
                return this.purple.getDefaultViewModelProviderFactory();
            case 4:
                return this.purple.getViewModelStore();
            case 5:
                return this.purple.getDefaultViewModelCreationExtras();
            case 6:
                return this.purple.getDefaultViewModelProviderFactory();
            case 7:
                return this.purple.getViewModelStore();
            default:
                return this.purple.getDefaultViewModelCreationExtras();
        }
    }
}
