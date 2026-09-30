package w0;

import I2.b;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import j1.AbstractC1932f;
import java.util.Objects;
import t6.O2;
import vg.al;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3232a {
    public final Object alpha;
    public final View bravo;

    public C3232a(ContentCaptureSession contentCaptureSession, View view) {
        this.alpha = contentCaptureSession;
        this.bravo = view;
    }

    public final AutofillId alpha(long j5) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession mike = AbstractC1932f.mike(this.alpha);
            ai.a bravo = O2.bravo(this.bravo);
            Objects.requireNonNull(bravo);
            return b.charlie(mike, al.hotel(bravo.alpha), j5);
        }
        return null;
    }
}
