package Yb;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import z3.C3462a;

/* renamed from: Yb.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0318m0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ProcessOrderActivityV2 purple;

    public /* synthetic */ DialogInterfaceOnClickListenerC0318m0(ProcessOrderActivityV2 processOrderActivityV2, int i4) {
        this.alpha = i4;
        this.purple = processOrderActivityV2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        ProcessOrderActivityV2 processOrderActivityV2 = this.purple;
        switch (this.alpha) {
            case 0:
                int i5 = ProcessOrderActivityV2.f12378N0;
                C3462a.alpha("LocationFlow", 12, "LOCATION_STUCK_DIALOG_RESTART_SERVICE tapped", null);
                C3462a.alpha("LocationFlow", 12, "LOCATION_SERVICE_MANUAL_RESTART_REQUESTED", null);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    processOrderActivityV2.november().golf();
                    Result.m206constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m206constructorimpl(ResultKt.createFailure(th));
                }
                new Handler(Looper.getMainLooper()).postDelayed(new A2.q(22, processOrderActivityV2), 500L);
                dialogInterface.dismiss();
                return;
            case 1:
                int i10 = ProcessOrderActivityV2.f12378N0;
                C3462a.alpha("LocationFlow", 12, "LOCATION_STUCK_DIALOG_OPEN_SETTINGS tapped", null);
                try {
                    try {
                        processOrderActivityV2.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        processOrderActivityV2.startActivity(new Intent("android.settings.SETTINGS"));
                    }
                } catch (Exception unused2) {
                }
                dialogInterface.dismiss();
                return;
            default:
                processOrderActivityV2.f12412c0 = null;
                processOrderActivityV2.indigo().alpha();
                return;
        }
    }
}
