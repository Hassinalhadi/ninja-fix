package u2;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import delivery.samurai.android.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import t6.P2;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3137a {
    public static volatile C3137a delta;
    public static final Object echo = new Object();
    public final Context charlie;
    public final HashSet bravo = new HashSet();
    public final HashMap alpha = new HashMap();

    public C3137a(Context context) {
        this.charlie = context.getApplicationContext();
    }

    public static C3137a charlie(Context context) {
        if (delta == null) {
            synchronized (echo) {
                try {
                    if (delta == null) {
                        delta = new C3137a(context);
                    }
                } finally {
                }
            }
        }
        return delta;
    }

    public final void alpha(Bundle bundle) {
        HashSet hashSet;
        String string = this.charlie.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.bravo;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    bravo((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }

    public final Object bravo(Class cls, HashSet hashSet) {
        Object obj;
        if (P2.delta()) {
            try {
                Trace.beginSection(P2.foxtrot(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.alpha;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                try {
                    b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                    List<Class> dependencies = bVar.dependencies();
                    if (!dependencies.isEmpty()) {
                        for (Class cls2 : dependencies) {
                            if (!hashMap.containsKey(cls2)) {
                                bravo(cls2, hashSet);
                            }
                        }
                    }
                    obj = bVar.create(this.charlie);
                    hashSet.remove(cls);
                    hashMap.put(cls, obj);
                } catch (Throwable th2) {
                    throw new StartupException(th2);
                }
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
    }
}
