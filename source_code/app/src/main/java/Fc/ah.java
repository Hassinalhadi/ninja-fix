package Fc;

import android.animation.Animator;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import delivery.samurai.android.ui.splash.SplashActivity;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ah implements Animator.AnimatorListener {
    public final /* synthetic */ SplashActivity alpha;

    public ah(SplashActivity splashActivity) {
        this.alpha = splashActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.echo(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Object m206constructorimpl;
        Intrinsics.echo(animation, "animation");
        SplashActivity splashActivity = this.alpha;
        try {
            Result.Companion companion = Result.INSTANCE;
            C6.a.alpha(splashActivity);
            m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m206constructorimpl instanceof kotlin.k)) {
            int i4 = SplashActivity.f12488L;
            splashActivity.gray();
        }
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
        if (m207exceptionOrNullimpl != null && (m207exceptionOrNullimpl instanceof GooglePlayServicesRepairableException)) {
            GoogleApiAvailability.getInstance().getErrorDialog(splashActivity, ((GooglePlayServicesRepairableException) m207exceptionOrNullimpl).getConnectionStatusCode(), 123);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        Intrinsics.echo(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.echo(animation, "animation");
    }
}
