package O7;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class r {
    public final Context alpha;
    public final u bravo;
    public final J2.l charlie;
    public final long delta;
    public J2.e echo;
    public J2.e foxtrot;
    public n golf;
    public final x hotel;
    public final U7.c india;
    public final K7.a juliet;
    public final K7.a kilo;
    public final i lima;
    public final L7.a mike;
    public final Aa.m november;
    public final P7.f oscar;

    public r(B7.g gVar, x xVar, L7.a aVar, u uVar, K7.a aVar2, K7.a aVar3, U7.c cVar, i iVar, Aa.m mVar, P7.f fVar) {
        this.bravo = uVar;
        gVar.alpha();
        this.alpha = gVar.alpha;
        this.hotel = xVar;
        this.mike = aVar;
        this.juliet = aVar2;
        this.kilo = aVar3;
        this.india = cVar;
        this.lima = iVar;
        this.november = mVar;
        this.oscar = fVar;
        this.delta = System.currentTimeMillis();
        this.charlie = new J2.l(13);
    }

    public final void alpha(D5.s sVar) {
        P7.f.alpha();
        P7.f.alpha();
        this.echo.z();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.juliet.india(new q(this));
                this.golf.golf();
                if (sVar.delta().bravo.alpha) {
                    if (!this.golf.delta(sVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    this.golf.hotel(((G6.h) ((AtomicReference) sVar.india).get()).alpha);
                    charlie();
                    return;
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                }
                throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                charlie();
            }
        } catch (Throwable th) {
            charlie();
            throw th;
        }
    }

    public final void bravo(D5.s sVar) {
        Future<?> submit = this.oscar.alpha.alpha.submit(new o(this, sVar, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e4) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e4);
        } catch (TimeoutException e5) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e5);
        }
    }

    public final void charlie() {
        P7.f.alpha();
        try {
            J2.e eVar = this.echo;
            String str = (String) eVar.purple;
            U7.c cVar = (U7.c) eVar.red;
            cVar.getClass();
            if (!new File((File) cVar.red, str).delete()) {
                Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
            }
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }
}
