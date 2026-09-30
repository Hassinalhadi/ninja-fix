package p7;

import J8.B;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.C1467s;
import com.google.android.play.integrity.internal.af;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: p7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2285b {
    public static final HashMap oscar = new HashMap();
    public final Context alpha;
    public final t bravo;
    public boolean golf;
    public final Intent hotel;
    public final C1467s india;
    public B mike;
    public r november;
    public final ArrayList delta = new ArrayList();
    public final HashSet echo = new HashSet();
    public final Object foxtrot = new Object();
    public final v kilo = new IBinder.DeathRecipient() { // from class: p7.v
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C2285b c2285b = C2285b.this;
            c2285b.bravo.bravo("reportBinderDeath", new Object[0]);
            if (c2285b.juliet.get() == null) {
                c2285b.bravo.bravo("%s : Binder has died.", c2285b.charlie);
                Iterator it = c2285b.delta.iterator();
                while (it.hasNext()) {
                    ((u) it.next()).alpha(new RemoteException(String.valueOf(c2285b.charlie).concat(" : Binder has died.")));
                }
                c2285b.delta.clear();
                synchronized (c2285b.foxtrot) {
                    c2285b.delta();
                }
                return;
            }
            throw new ClassCastException();
        }
    };
    public final AtomicInteger lima = new AtomicInteger(0);
    public final String charlie = "ExpressIntegrityService";
    public final WeakReference juliet = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [p7.v] */
    public C2285b(Context context, t tVar, Intent intent, C1467s c1467s) {
        this.alpha = context;
        this.bravo = tVar;
        this.hotel = intent;
        this.india = c1467s;
    }

    public static /* bridge */ /* synthetic */ void bravo(C2285b c2285b, com.google.android.play.core.integrity.h hVar) {
        r rVar = c2285b.november;
        ArrayList arrayList = c2285b.delta;
        t tVar = c2285b.bravo;
        if (rVar == null && !c2285b.golf) {
            tVar.bravo("Initiate binding to the service.", new Object[0]);
            arrayList.add(hVar);
            B b2 = new B(2, c2285b);
            c2285b.mike = b2;
            c2285b.golf = true;
            if (!c2285b.alpha.bindService(c2285b.hotel, b2, 1)) {
                tVar.bravo("Failed to bind to the service.", new Object[0]);
                c2285b.golf = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((u) it.next()).alpha(new af());
                }
                arrayList.clear();
                return;
            }
            return;
        }
        if (c2285b.golf) {
            tVar.bravo("Waiting to bind to the service.", new Object[0]);
            arrayList.add(hVar);
        } else {
            hVar.run();
        }
    }

    public final Handler alpha() {
        Handler handler;
        HashMap hashMap = oscar;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.charlie)) {
                    HandlerThread handlerThread = new HandlerThread(this.charlie, 10);
                    handlerThread.start();
                    hashMap.put(this.charlie, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.charlie);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void charlie(G6.h hVar) {
        synchronized (this.foxtrot) {
            this.echo.remove(hVar);
        }
        alpha().post(new C2284a(1, this));
    }

    public final void delta() {
        HashSet hashSet = this.echo;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((G6.h) it.next()).charlie(new RemoteException(String.valueOf(this.charlie).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
