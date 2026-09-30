package va;

import delivery.samurai.android.ui.auth.signin.presentation.NafathVerificationActivity;
import delivery.samurai.android.ui.auth.signin.presentation.SignInActivity;
import delivery.samurai.android.ui.auth.signup.RegisterActivity;
import delivery.samurai.android.ui.auth.signup.SignUpActivity;
import delivery.samurai.android.ui.scanner.ScannerActivity;
import delivery.samurai.android.ui.scanner.invoice.InvoiceScannerActivity;
import delivery.samurai.android.ui.shiftBookingV2.ShiftBookingListingActivityV2;

/* renamed from: va.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3180a implements ag.b {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ d3.k bravo;

    public /* synthetic */ C3180a(d3.k kVar, int i4) {
        this.alpha = i4;
        this.bravo = kVar;
    }

    @Override // ag.b
    public final void alpha(ae.o oVar) {
        switch (this.alpha) {
            case 0:
                ((NafathVerificationActivity) this.bravo).foxtrot();
                return;
            case 1:
                ((SignInActivity) this.bravo).foxtrot();
                return;
            case 2:
                ((ScannerActivity) this.bravo).foxtrot();
                return;
            case 3:
                ((RegisterActivity) this.bravo).foxtrot();
                return;
            case 4:
                ((SignUpActivity) this.bravo).foxtrot();
                return;
            case 5:
                ((InvoiceScannerActivity) this.bravo).foxtrot();
                return;
            default:
                ((ShiftBookingListingActivityV2) this.bravo).foxtrot();
                return;
        }
    }
}
