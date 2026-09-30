package oa;

import delivery.samurai.android.ui.areasV2.AreaListingActivityV2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: oa.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2205d extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AreaListingActivityV2 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2205d(AreaListingActivityV2 areaListingActivityV2, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = areaListingActivityV2;
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
