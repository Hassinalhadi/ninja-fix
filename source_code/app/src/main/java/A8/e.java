package A8;

import B8.j;
import C8.w;
import android.content.Context;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.protobuf.InterfaceC1516t;
import java.util.Random;
import s8.C2837a;
import s8.i;

/* loaded from: classes2.dex */
public final class e {
    public final C2837a alpha;
    public final double bravo;
    public final double charlie;
    public final d delta;
    public final d echo;

    public e(Context context, B8.h hVar) {
        boolean z2;
        g8.d dVar = new g8.d(1);
        double nextDouble = new Random().nextDouble();
        double nextDouble2 = new Random().nextDouble();
        C2837a echo = C2837a.echo();
        this.delta = null;
        this.echo = null;
        boolean z10 = false;
        if (0.0d <= nextDouble && nextDouble < 1.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (0.0d <= nextDouble2 && nextDouble2 < 1.0d) {
                z10 = true;
            }
            if (z10) {
                this.bravo = nextDouble;
                this.charlie = nextDouble2;
                this.alpha = echo;
                this.delta = new d(hVar, dVar, echo, "Trace");
                this.echo = new d(hVar, dVar, echo, "Network");
                j.alpha(context);
                return;
            }
            throw new IllegalArgumentException("Fragment sampling bucket ID should be in range [0.0, 1.0).");
        }
        throw new IllegalArgumentException("Sampling bucket ID should be in range [0.0, 1.0).");
    }

    public static boolean alpha(InterfaceC1516t interfaceC1516t) {
        if (interfaceC1516t.size() <= 0 || ((w) interfaceC1516t.get(0)).victor() <= 0 || ((w) interfaceC1516t.get(0)).uniform() != 2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (s8.C2837a.uniform(r3) != false) goto L27;
     */
    /* JADX WARN: Type inference failed for: r2v3, types: [s8.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean bravo() {
        s8.e eVar;
        double d4;
        C2837a c2837a = this.alpha;
        c2837a.getClass();
        synchronized (s8.e.class) {
            try {
                if (s8.e.alpha == null) {
                    s8.e.alpha = new Object();
                }
                eVar = s8.e.alpha;
            } catch (Throwable th) {
                throw th;
            }
        }
        B8.e juliet = c2837a.juliet(eVar);
        if (juliet.bravo()) {
            d4 = ((Double) juliet.alpha()).doubleValue() / 100.0d;
        }
        B8.e eVar2 = c2837a.alpha.getDouble("fpr_vc_fragment_sampling_rate");
        if (eVar2.bravo() && C2837a.uniform(((Double) eVar2.alpha()).doubleValue())) {
            c2837a.charlie.echo("com.google.firebase.perf.FragmentSamplingRate", ((Double) eVar2.alpha()).doubleValue());
            d4 = ((Double) eVar2.alpha()).doubleValue();
        } else {
            B8.e bravo = c2837a.bravo(eVar);
            if (bravo.bravo() && C2837a.uniform(((Double) bravo.alpha()).doubleValue())) {
                d4 = ((Double) bravo.alpha()).doubleValue();
            } else {
                d4 = 0.0d;
            }
        }
        if (this.charlie < d4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [s8.i, java.lang.Object] */
    public final boolean charlie() {
        i iVar;
        double d4;
        C2837a c2837a = this.alpha;
        c2837a.getClass();
        synchronized (i.class) {
            try {
                if (i.alpha == null) {
                    i.alpha = new Object();
                }
                iVar = i.alpha;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = c2837a.alpha;
        iVar.getClass();
        B8.e eVar = remoteConfigManager.getDouble("fpr_vc_network_request_sampling_rate");
        if (eVar.bravo() && C2837a.uniform(((Double) eVar.alpha()).doubleValue())) {
            c2837a.charlie.echo("com.google.firebase.perf.NetworkRequestSamplingRate", ((Double) eVar.alpha()).doubleValue());
            d4 = ((Double) eVar.alpha()).doubleValue();
        } else {
            B8.e bravo = c2837a.bravo(iVar);
            if (bravo.bravo() && C2837a.uniform(((Double) bravo.alpha()).doubleValue())) {
                d4 = ((Double) bravo.alpha()).doubleValue();
            } else if (c2837a.alpha.isLastFetchFailed()) {
                d4 = 0.001d;
            } else {
                d4 = 1.0d;
            }
        }
        if (this.bravo < d4) {
            return true;
        }
        return false;
    }
}
