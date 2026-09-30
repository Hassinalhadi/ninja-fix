package av;

import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashSet;
import java.util.Objects;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final /* synthetic */ class at implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ aw purple;
    public final /* synthetic */ aw red;

    public /* synthetic */ at(aw awVar, aw awVar2, int i4) {
        this.alpha = i4;
        this.purple = awVar;
        this.red = awVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                aw awVar = this.purple;
                Objects.requireNonNull(awVar.foxtrot);
                awVar.foxtrot.golf(this.red);
                return;
            default:
                aw awVar2 = this.purple;
                aw awVar3 = this.red;
                ao aoVar = awVar2.bravo;
                synchronized (aoVar.purple) {
                    ((LinkedHashSet) aoVar.red).remove(awVar2);
                    ((LinkedHashSet) aoVar.silver).remove(awVar2);
                }
                awVar2.golf(awVar3);
                if (awVar2.golf != null) {
                    Objects.requireNonNull(awVar2.foxtrot);
                    awVar2.foxtrot.charlie(awVar3);
                    return;
                } else {
                    AbstractC3066u3.india("SyncCaptureSessionBase", Constants.AES_PREFIX + awVar2 + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
                    return;
                }
        }
    }
}
