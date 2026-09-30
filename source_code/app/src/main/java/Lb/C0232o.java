package Lb;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: Lb.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0232o extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0233p purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0232o(C0233p c0233p, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = c0233p;
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
