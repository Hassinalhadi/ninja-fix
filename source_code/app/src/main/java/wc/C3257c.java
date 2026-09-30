package wc;

import Xd.l;
import android.content.Context;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.al;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wc.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3257c {
    public final Context alpha;
    public final al bravo;
    public final l charlie;
    public final Function1 delta;
    public final AtomicBoolean echo;
    public final ExecutorService foxtrot;
    public final BarcodeScanner golf;
    public bo.b hotel;
    public boolean india;
    public PreviewView juliet;
    public bo.e kilo;

    public C3257c(Context context, al lifecycleOwner, l onScan, Function1 function1) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(lifecycleOwner, "lifecycleOwner");
        Intrinsics.echo(onScan, "onScan");
        this.alpha = context;
        this.bravo = lifecycleOwner;
        this.charlie = onScan;
        this.delta = function1;
        this.echo = new AtomicBoolean(false);
        this.foxtrot = Executors.newSingleThreadExecutor();
        BarcodeScanner client = BarcodeScanning.getClient(new BarcodeScannerOptions.Builder().setBarcodeFormats(Barcode.FORMAT_QR_CODE, new int[0]).build());
        Intrinsics.delta(client, "getClient(...)");
        this.golf = client;
    }
}
