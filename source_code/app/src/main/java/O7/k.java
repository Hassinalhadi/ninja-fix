package O7;

import android.util.Log;
import androidx.appcompat.widget.i1;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import s6.V4;

/* loaded from: classes2.dex */
public final class k implements Callable {
    public final /* synthetic */ long alpha;
    public final /* synthetic */ Throwable purple;
    public final /* synthetic */ Thread red;
    public final /* synthetic */ D5.s silver;
    public final /* synthetic */ n teal;

    public k(n nVar, long j5, Throwable th, Thread thread, D5.s sVar) {
        this.teal = nVar;
        this.alpha = j5;
        this.purple = th;
        this.red = thread;
        this.silver = sVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        U7.c cVar;
        String str;
        long j5 = this.alpha;
        long j6 = j5 / 1000;
        n nVar = this.teal;
        String echo = nVar.echo();
        if (echo == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return V4.echo(null);
        }
        nVar.charlie.z();
        i1 i1Var = nVar.mike;
        i1Var.getClass();
        String concat = "Persisting fatal event for session ".concat(echo);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        i1Var.foxtrot(this.purple, this.red, "crash", new Q7.c(echo, j6, kotlin.collections.t.alpha), true);
        try {
            cVar = nVar.golf;
            str = ".ae" + j5;
            cVar.getClass();
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
        if (!new File((File) cVar.red, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        D5.s sVar = this.silver;
        nVar.bravo(false, sVar, false);
        nVar.charlie(new d().alpha, Boolean.FALSE);
        if (!nVar.bravo.bravo()) {
            return V4.echo(null);
        }
        return ((G6.h) ((AtomicReference) sVar.india).get()).alpha.november(nVar.echo.alpha, new j(0, this, echo));
    }
}
