package Gc;

import Fc.af;
import Jb.T;
import Yb.C0307h;
import Yb.C0331t0;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.canhub.cropper.CropImageActivity;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import delivery.samurai.android.ui.scanner.ScannerActivity;
import delivery.samurai.android.ui.splash.SplashActivity;
import delivery.samurai.android.ui.transfer.TransferCardListActivity;
import z3.C3462a;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements DialogInterface.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ e(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        a4.q qVar;
        Object obj = this.purple;
        switch (this.alpha) {
            case 0:
                g gVar = (g) obj;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", gVar.requireContext().getPackageName(), null));
                intent.addFlags(268435456);
                gVar.startActivity(intent);
                return;
            case 1:
                ((T) obj).invoke();
                return;
            case 2:
                int i5 = TransferCardListActivity.f12528O;
                ((TransferCardListActivity) obj).finish();
                return;
            case 3:
                C0307h c0307h = (C0307h) obj;
                c0307h.f2412D = true;
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", c0307h.requireContext().getPackageName(), null));
                intent2.addFlags(268435456);
                c0307h.startActivity(intent2);
                return;
            case 4:
                int i10 = ProcessOrderActivityV2.f12378N0;
                C3462a.alpha("LocationFlow", 12, "PICKUP_COMPLETE_UI_STALE_CANCEL ageMs=" + ((Long) obj), null);
                dialogInterface.dismiss();
                return;
            case 5:
                int i11 = CropImageActivity.f3611b;
                C0331t0 c0331t0 = (C0331t0) obj;
                if (i4 == 0) {
                    qVar = a4.q.alpha;
                } else {
                    qVar = a4.q.purple;
                }
                c0331t0.invoke(qVar);
                return;
            case 6:
                ((af) obj).invoke();
                return;
            case 7:
                ((SplashActivity) obj).golf();
                return;
            default:
                ScannerActivity scannerActivity = (ScannerActivity) obj;
                scannerActivity.f12453J = true;
                scannerActivity.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", scannerActivity.getPackageName(), null)).addFlags(268435456));
                return;
        }
    }
}
