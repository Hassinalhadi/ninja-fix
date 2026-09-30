package t0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: t0.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2940t extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C2946x purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2940t(C2946x c2946x, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = c2946x;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Activity activity;
        int round;
        long j5;
        InterfaceC2888F interfaceC2888F;
        int actionMasked;
        C2926m c2926m;
        switch (this.alpha) {
            case 0:
                Context context = this.purple.getContext();
                Context context2 = context;
                while (true) {
                    if (context2 instanceof Activity) {
                        activity = (Activity) context2;
                    } else if (context2 instanceof ContextWrapper) {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    } else {
                        activity = null;
                    }
                }
                if (activity != null) {
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 30) {
                        interfaceC2888F = C2892J.alpha;
                    } else if (i4 >= 29) {
                        interfaceC2888F = C2889G.red;
                    } else if (i4 >= 28) {
                        interfaceC2888F = C2891I.alpha;
                    } else if (i4 >= 24) {
                        interfaceC2888F = C2890H.alpha;
                    } else {
                        interfaceC2888F = C2889G.purple;
                    }
                    Rect alpha = interfaceC2888F.alpha(activity);
                    int width = alpha.width();
                    round = alpha.height();
                    j5 = width;
                } else {
                    Configuration configuration = context.getResources().getConfiguration();
                    float f5 = context.getResources().getDisplayMetrics().density;
                    int round2 = Math.round(configuration.screenWidthDp * f5);
                    round = Math.round(configuration.screenHeightDp * f5);
                    j5 = round2;
                }
                return new Q0.m((round & 4294967295L) | (j5 << 32));
            case 1:
                C2946x c2946x = this.purple;
                MotionEvent motionEvent = c2946x.f13897l0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    c2946x.f13899m0 = SystemClock.uptimeMillis();
                    c2946x.post(c2946x.f13909r0);
                }
                return Unit.INSTANCE;
            default:
                c2926m = this.purple.get_viewTreeOwners();
                return c2926m;
        }
    }
}
