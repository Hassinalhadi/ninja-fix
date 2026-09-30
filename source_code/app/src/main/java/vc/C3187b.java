package vc;

import G6.e;
import androidx.camera.core.D;
import com.google.android.gms.tasks.Task;
import delivery.samurai.android.ui.scanner.ScannerActivity;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3187b implements e {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ D purple;

    public /* synthetic */ C3187b(D d4, int i4) {
        this.alpha = i4;
        this.purple = d4;
    }

    @Override // G6.e
    public final void onComplete(Task it) {
        D d4 = this.purple;
        switch (this.alpha) {
            case 0:
                int i4 = ScannerActivity.Q;
                Intrinsics.echo(it, "it");
                d4.close();
                return;
            default:
                Intrinsics.echo(it, "it");
                d4.close();
                return;
        }
    }
}
