package Af;

import android.os.Looper;
import java.util.Iterator;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import pf.AbstractC2360j;
import wf.AbstractC3269f;
import wf.C3268e;

/* loaded from: classes2.dex */
public abstract class n {
    public static final C3268e alpha;

    static {
        String str;
        int i4 = u.alpha;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        Iterator it = AbstractC2360j.quebec(AbstractC2360j.charlie(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator())).iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                ((MainDispatcherFactory) obj).getClass();
                do {
                    ((MainDispatcherFactory) it.next()).getClass();
                } while (it.hasNext());
            }
        }
        if (((MainDispatcherFactory) obj) != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                alpha = new C3268e(AbstractC3269f.alpha(mainLooper));
                return;
            }
            throw new IllegalStateException("The main looper is not available");
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
