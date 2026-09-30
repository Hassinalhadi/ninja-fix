package ya;

import delivery.samurai.android.ui.auth.signup.step1worksetup.StartWorkFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: ya.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3408d implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ StartWorkFragment purple;

    public /* synthetic */ C3408d(StartWorkFragment startWorkFragment, int i4) {
        this.alpha = i4;
        this.purple = startWorkFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                this.purple.f12215o = null;
                return Unit.INSTANCE;
            case 1:
                this.purple.f12214n = null;
                return Unit.INSTANCE;
            default:
                this.purple.f12213m = null;
                return Unit.INSTANCE;
        }
    }
}
