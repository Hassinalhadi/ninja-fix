package s7;

import A2.aj;
import com.google.android.gms.measurement.internal.C1469t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.ao;
import g.C1718a;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import z7.an;
import z7.aq;

/* loaded from: classes2.dex */
public abstract class j {
    public static final Logger alpha = Logger.getLogger(j.class.getName());
    public static final ConcurrentHashMap bravo = new ConcurrentHashMap();
    public static final ConcurrentHashMap charlie = new ConcurrentHashMap();
    public static final ConcurrentHashMap delta = new ConcurrentHashMap();
    public static final ConcurrentHashMap echo;

    static {
        new ConcurrentHashMap();
        echo = new ConcurrentHashMap();
    }

    public static synchronized void alpha(String str, Class cls, boolean z2) {
        synchronized (j.class) {
            ConcurrentHashMap concurrentHashMap = bravo;
            if (!concurrentHashMap.containsKey(str)) {
                return;
            }
            i iVar = (i) concurrentHashMap.get(str);
            if (iVar.alpha.getClass().equals(cls)) {
                if (z2 && !((Boolean) delta.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
                return;
            }
            alpha.warning("Attempted overwrite of a registered key manager for key type " + str);
            throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + iVar.alpha.getClass().getName() + ", cannot be re-registered with " + cls.getName());
        }
    }

    public static synchronized i bravo(String str) {
        i iVar;
        synchronized (j.class) {
            ConcurrentHashMap concurrentHashMap = bravo;
            if (concurrentHashMap.containsKey(str)) {
                iVar = (i) concurrentHashMap.get(str);
            } else {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
        }
        return iVar;
    }

    public static Object charlie(String str, AbstractC1490h abstractC1490h, Class cls) {
        i bravo2 = bravo(str);
        boolean contains = ((Map) bravo2.alpha.charlie).keySet().contains(cls);
        aj ajVar = bravo2.alpha;
        if (contains) {
            try {
                if (!((Map) ajVar.charlie).keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + ajVar.toString() + " does not support primitive class " + cls.getName());
                }
                try {
                    ao kilo = ajVar.kilo(abstractC1490h);
                    if (!Void.class.equals(cls)) {
                        ajVar.mike(kilo);
                        return ajVar.hotel(kilo, cls);
                    }
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) ajVar.bravo).getName()), e);
                }
            } catch (IllegalArgumentException e4) {
                throw new GeneralSecurityException("Primitive type not supported", e4);
            }
        }
        StringBuilder sb2 = new StringBuilder("Primitive type ");
        sb2.append(cls.getName());
        sb2.append(" not supported by key manager of type ");
        sb2.append(ajVar.getClass());
        sb2.append(", supported primitives: ");
        Set<Class> keySet = ((Map) ajVar.charlie).keySet();
        StringBuilder sb3 = new StringBuilder();
        boolean z2 = true;
        for (Class cls2 : keySet) {
            if (!z2) {
                sb3.append(", ");
            }
            sb3.append(cls2.getCanonicalName());
            z2 = false;
        }
        sb2.append(sb3.toString());
        throw new GeneralSecurityException(sb2.toString());
    }

    public static synchronized an delta(aq aqVar) {
        an yankee;
        synchronized (j.class) {
            aj ajVar = bravo(aqVar.romeo()).alpha;
            C1718a c1718a = new C1718a(ajVar, (Class) ajVar.delta);
            if (((Boolean) delta.get(aqVar.romeo())).booleanValue()) {
                yankee = c1718a.yankee(aqVar.sierra());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + aqVar.romeo());
            }
        }
        return yankee;
    }

    public static synchronized void echo(aj ajVar, boolean z2) {
        synchronized (j.class) {
            try {
                String golf = ajVar.golf();
                alpha(golf, ajVar.getClass(), z2);
                ConcurrentHashMap concurrentHashMap = bravo;
                if (!concurrentHashMap.containsKey(golf)) {
                    concurrentHashMap.put(golf, new i(ajVar));
                    charlie.put(golf, new C1469t(15));
                }
                delta.put(golf, Boolean.valueOf(z2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void foxtrot(h hVar) {
        synchronized (j.class) {
            try {
                Class charlie2 = hVar.charlie();
                ConcurrentHashMap concurrentHashMap = echo;
                if (concurrentHashMap.containsKey(charlie2)) {
                    h hVar2 = (h) concurrentHashMap.get(charlie2);
                    if (!hVar.getClass().equals(hVar2.getClass())) {
                        alpha.warning("Attempted overwrite of a registered SetWrapper for type " + charlie2);
                        throw new GeneralSecurityException("SetWrapper for primitive (" + charlie2.getName() + ") is already registered to be " + hVar2.getClass().getName() + ", cannot be re-registered with " + hVar.getClass().getName());
                    }
                }
                concurrentHashMap.put(charlie2, hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
