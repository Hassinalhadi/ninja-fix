package B7;

import V5.x;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import bv.aw;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import e6.AbstractC1630b;
import i8.InterfaceC1904b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import n8.C2163a;
import s6.V6;

/* loaded from: classes2.dex */
public final class g {
    public static final Object kilo = new Object();
    public static final bv.e lima = new aw(0);
    public final Context alpha;
    public final String bravo;
    public final i charlie;
    public final I7.g delta;
    public final AtomicBoolean echo;
    public final AtomicBoolean foxtrot;
    public final I7.l golf;
    public final InterfaceC1904b hotel;
    public final CopyOnWriteArrayList india;
    public final CopyOnWriteArrayList juliet;

    public g(Context context, String str, i iVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.echo = atomicBoolean;
        this.foxtrot = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.india = copyOnWriteArrayList;
        this.juliet = new CopyOnWriteArrayList();
        this.alpha = context;
        x.echo(str);
        this.bravo = str;
        this.charlie = iVar;
        a aVar = FirebaseInitProvider.alpha;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList hotel = new J2.l(context, new D8.c(17, ComponentDiscoveryService.class)).hotel();
        Trace.endSection();
        Trace.beginSection("Runtime");
        J7.k kVar = J7.k.alpha;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(hotel);
        arrayList.add(new I7.d(1, new FirebaseCommonRegistrar()));
        arrayList.add(new I7.d(1, new ExecutorsRegistrar()));
        arrayList2.add(I7.b.charlie(context, Context.class, new Class[0]));
        arrayList2.add(I7.b.charlie(this, g.class, new Class[0]));
        arrayList2.add(I7.b.charlie(iVar, i.class, new Class[0]));
        W8.a aVar2 = new W8.a(7);
        if (V6.alpha(context) && FirebaseInitProvider.purple.get()) {
            arrayList2.add(I7.b.charlie(aVar, a.class, new Class[0]));
        }
        I7.g gVar = new I7.g(kVar, arrayList, arrayList2, aVar2);
        this.delta = gVar;
        Trace.endSection();
        this.golf = new I7.l(new c(0, this, context));
        this.hotel = gVar.india(g8.c.class);
        d dVar = new d(this);
        alpha();
        if (atomicBoolean.get()) {
            T5.d.teal.alpha.get();
        }
        copyOnWriteArrayList.add(dVar);
        Trace.endSection();
    }

    public static g charlie() {
        g gVar;
        synchronized (kilo) {
            try {
                gVar = (g) lima.get("[DEFAULT]");
                if (gVar != null) {
                    ((g8.c) gVar.hotel.get()).charlie();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC1630b.bravo() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g foxtrot(Context context) {
        synchronized (kilo) {
            try {
                if (lima.containsKey("[DEFAULT]")) {
                    return charlie();
                }
                i alpha = i.alpha(context);
                if (alpha == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return golf(context, alpha);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [T5.c, java.lang.Object] */
    public static g golf(Context context, i iVar) {
        g gVar;
        AtomicReference atomicReference = e.alpha;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.alpha;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        T5.d.bravo(application);
                        T5.d.teal.alpha(obj);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (kilo) {
            bv.e eVar = lima;
            x.juliet("FirebaseApp name [DEFAULT] already exists!", !eVar.containsKey("[DEFAULT]"));
            x.india(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", iVar);
            eVar.put("[DEFAULT]", gVar);
        }
        gVar.echo();
        return gVar;
    }

    public final void alpha() {
        x.juliet("FirebaseApp was deleted", !this.foxtrot.get());
    }

    public final Object bravo(Class cls) {
        alpha();
        return this.delta.charlie(cls);
    }

    public final String delta() {
        String encodeToString;
        StringBuilder sb2 = new StringBuilder();
        alpha();
        byte[] bytes = this.bravo.getBytes(Charset.defaultCharset());
        String str = null;
        if (bytes == null) {
            encodeToString = null;
        } else {
            encodeToString = Base64.encodeToString(bytes, 11);
        }
        sb2.append(encodeToString);
        sb2.append("+");
        alpha();
        byte[] bytes2 = this.charlie.bravo.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str = Base64.encodeToString(bytes2, 11);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final void echo() {
        Context context = this.alpha;
        boolean alpha = V6.alpha(context);
        String str = this.bravo;
        if (!alpha) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            alpha();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            AtomicReference atomicReference = f.bravo;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        alpha();
        sb3.append(str);
        Log.i("FirebaseApp", sb3.toString());
        alpha();
        this.delta.bravo("[DEFAULT]".equals(str));
        ((g8.c) this.hotel.get()).charlie();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.alpha();
        return this.bravo.equals(gVar.bravo);
    }

    public final int hashCode() {
        return this.bravo.hashCode();
    }

    public final boolean hotel() {
        boolean z2;
        alpha();
        C2163a c2163a = (C2163a) this.golf.get();
        synchronized (c2163a) {
            z2 = c2163a.alpha;
        }
        return z2;
    }

    public final String toString() {
        J2.e eVar = new J2.e(this);
        eVar.y(this.bravo, "name");
        eVar.y(this.charlie, "options");
        return eVar.toString();
    }
}
