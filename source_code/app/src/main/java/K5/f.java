package K5;

import B2.s;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ i alpha;
    public final /* synthetic */ E5.i purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ Runnable silver;

    public /* synthetic */ f(i iVar, E5.i iVar2, int i4, Runnable runnable) {
        this.alpha = iVar;
        this.purple = iVar2;
        this.red = i4;
        this.silver = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final E5.i iVar = this.purple;
        final int i4 = this.red;
        Runnable runnable = this.silver;
        final i iVar2 = this.alpha;
        M5.b bVar = iVar2.foxtrot;
        try {
            try {
                L5.d dVar = iVar2.charlie;
                Objects.requireNonNull(dVar);
                ((L5.h) bVar).papa(new s(11, dVar));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) iVar2.alpha.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    iVar2.alpha(iVar, i4);
                } else {
                    ((L5.h) bVar).papa(new M5.a() { // from class: K5.g
                        @Override // M5.a
                        public final Object execute() {
                            i.this.delta.alpha(iVar, i4 + 1, false);
                            return null;
                        }
                    });
                }
                runnable.run();
            } catch (SynchronizationException unused) {
                iVar2.delta.alpha(iVar, i4 + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
