package uc;

import delivery.samurai.android.ui.resetPassword.ResetPasswordActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: uc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3151a extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ResetPasswordActivity purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3151a(ResetPasswordActivity resetPasswordActivity, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = resetPasswordActivity;
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
