package Yb;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: Yb.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0319n extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0321o purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0319n(C0321o c0321o, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = c0321o;
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
