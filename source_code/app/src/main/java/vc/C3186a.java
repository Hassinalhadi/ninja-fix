package vc;

import G6.i;
import G6.q;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.Image;
import android.widget.Toast;
import androidx.camera.core.D;
import androidx.camera.core.y;
import androidx.lifecycle.RunnableC0643m;
import be.RunnableC0756b;
import bo.e;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.scanner.ScannerActivity;
import f1.AbstractC1683c;
import g1.AbstractC1735d;
import h9.aq;
import n.Y;

/* renamed from: vc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3186a implements y, ah.a {
    public final /* synthetic */ ScannerActivity alpha;

    public /* synthetic */ C3186a(ScannerActivity scannerActivity) {
        this.alpha = scannerActivity;
    }

    @Override // androidx.camera.core.y
    public void alpha(D d4) {
        int i4 = ScannerActivity.Q;
        ScannerActivity scannerActivity = this.alpha;
        if (scannerActivity.f12454K.get()) {
            d4.close();
            return;
        }
        Image k6 = d4.purple.k();
        if (k6 == null) {
            d4.close();
            return;
        }
        Task process = ((BarcodeScanner) scannerActivity.f12458O.getValue()).process(X8.a.charlie(k6, d4.teal.bravo(), null));
        aq aqVar = new aq(14, new Y(20, scannerActivity));
        q qVar = (q) process;
        qVar.getClass();
        qVar.echo(i.alpha, aqVar);
        qVar.bravo(new C3187b(d4, 0));
    }

    @Override // ah.a
    public void charlie(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i4 = ScannerActivity.Q;
        ScannerActivity scannerActivity = this.alpha;
        if (booleanValue) {
            e eVar = e.golf;
            RunnableC0756b charlie = y6.e.charlie(scannerActivity);
            charlie.foxtrot(new RunnableC0643m(29, charlie, scannerActivity), AbstractC1735d.delta(scannerActivity));
        } else if (!AbstractC1683c.foxtrot(scannerActivity, "android.permission.CAMERA")) {
            new AlertDialog.Builder(scannerActivity).setTitle(R.string.permission_required_title).setMessage(R.string.permission_required_msg_camera).setPositiveButton(R.string.open_settings, new Gc.e(8, scannerActivity)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show();
        } else {
            Toast.makeText(scannerActivity, scannerActivity.getString(R.string.camera_permission_denied_try_again), 1).show();
        }
    }
}
