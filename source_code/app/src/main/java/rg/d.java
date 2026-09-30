package rg;

import av.q;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;
import t6.AbstractC3062u;
import tg.e;
import tg.f;
import tg.g;
import tg.h;
import tg.i;

/* loaded from: classes2.dex */
public abstract class d {
    public static volatile int alpha;
    public static final i bravo = new i();
    public static final e charlie = new e();
    public static final boolean delta;
    public static volatile ug.b echo;
    public static final String[] foxtrot;

    static {
        String str;
        boolean equalsIgnoreCase;
        try {
            str = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            equalsIgnoreCase = false;
        } else {
            equalsIgnoreCase = str.equalsIgnoreCase("true");
        }
        delta = equalsIgnoreCase;
        foxtrot = new String[]{"2.0"};
    }

    public static ArrayList alpha() {
        ServiceLoader serviceLoader;
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = d.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        ug.b bVar = null;
        if (property != null && !property.isEmpty()) {
            try {
                f.delta("Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property");
                bVar = (ug.b) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e) {
                f.bravo("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e);
            } catch (ClassNotFoundException e4) {
                e = e4;
                f.bravo("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e5) {
                e = e5;
                f.bravo("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e10) {
                e = e10;
                f.bravo("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e11) {
                e = e11;
                f.bravo("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e12) {
                e = e12;
                f.bravo("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (bVar != null) {
            arrayList.add(bVar);
            return arrayList;
        }
        if (System.getSecurityManager() == null) {
            serviceLoader = ServiceLoader.load(ug.b.class, classLoader);
        } else {
            serviceLoader = (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: rg.c
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    return ServiceLoader.load(ug.b.class, classLoader);
                }
            });
        }
        Iterator it = serviceLoader.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((ug.b) it.next());
            } catch (ServiceConfigurationError e13) {
                f.alpha("A service provider failed to instantiate:\n" + e13.getMessage());
            }
        }
        return arrayList;
    }

    public static ug.b bravo() {
        if (alpha == 0) {
            synchronized (d.class) {
                try {
                    if (alpha == 0) {
                        alpha = 1;
                        charlie();
                    }
                } finally {
                }
            }
        }
        int i4 = alpha;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        return charlie;
                    }
                    throw new IllegalStateException("Unreachable code");
                }
                return echo;
            }
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        return bravo;
    }

    public static final void charlie() {
        Enumeration<URL> resources;
        try {
            ArrayList alpha2 = alpha();
            golf(alpha2);
            if (!alpha2.isEmpty()) {
                echo = (ug.b) alpha2.get(0);
                ug.a alpha3 = echo.alpha();
                if (alpha3 != null) {
                    AbstractC3062u.alpha = alpha3;
                }
                echo.getClass();
                alpha = 3;
                echo(alpha2);
            } else {
                alpha = 4;
                f.echo("No SLF4J providers were found.");
                f.echo("Defaulting to no-operation (NOP) logger implementation");
                f.echo("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = d.class.getClassLoader();
                    if (classLoader == null) {
                        resources = ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class");
                    } else {
                        resources = classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    }
                    while (resources.hasMoreElements()) {
                        linkedHashSet.add(resources.nextElement());
                    }
                } catch (IOException e) {
                    f.bravo("Error getting resources from path", e);
                }
                foxtrot(linkedHashSet);
            }
            delta();
            if (alpha == 3) {
                try {
                    String charlie2 = echo.charlie();
                    boolean z2 = false;
                    for (String str : foxtrot) {
                        if (charlie2.startsWith(str)) {
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        f.echo("The requested version " + charlie2 + " by your slf4j provider is not compatible with " + Arrays.asList(foxtrot).toString());
                        f.echo("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                    }
                } catch (Throwable th) {
                    f.bravo("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e4) {
            alpha = 2;
            f.bravo("Failed to instantiate SLF4J LoggerFactory", e4);
            throw new IllegalStateException("Unexpected initialization failure", e4);
        }
    }

    public static void delta() {
        i iVar = bravo;
        synchronized (iVar) {
            try {
                iVar.alpha.alpha = true;
                h hVar = iVar.alpha;
                hVar.getClass();
                Iterator it = new ArrayList(hVar.bravo.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    gVar.purple = bravo().bravo().alpha(gVar.alpha);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = bravo.alpha.charlie;
        int size = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int i4 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                sg.b bVar = (sg.b) it2.next();
                if (bVar != null) {
                    g gVar2 = bVar.bravo;
                    String str = gVar2.alpha;
                    if (gVar2.purple != null) {
                        if (!(gVar2.purple instanceof tg.c)) {
                            if (gVar2.kilo()) {
                                if (gVar2.india(bVar.alpha) && gVar2.kilo()) {
                                    try {
                                        gVar2.silver.invoke(gVar2.purple, bVar);
                                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                                    }
                                }
                            } else {
                                f.echo(str);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                }
                int i5 = i4 + 1;
                if (i4 == 0) {
                    if (bVar.bravo.kilo()) {
                        f.echo("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        f.echo("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        f.echo("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(bVar.bravo.purple instanceof tg.c)) {
                        f.echo("The following set of substitute loggers may have been accessed");
                        f.echo("during the initialization phase. Logging calls during this");
                        f.echo("phase were not honored. However, subsequent logging calls to these");
                        f.echo("loggers will work as normally expected.");
                        f.echo("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i4 = i5;
            }
            arrayList.clear();
        }
        h hVar2 = bravo.alpha;
        hVar2.bravo.clear();
        hVar2.charlie.clear();
    }

    public static void echo(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() > 1) {
                f.delta("Actual provider is of type [" + arrayList.get(0) + Constants.AES_SUFFIX);
                return;
            }
            String str = "Connected with provider of type [" + ((ug.b) arrayList.get(0)).getClass().getName() + Constants.AES_SUFFIX;
            int i4 = f.alpha;
            if (q.mike(1) >= q.mike(f.bravo)) {
                f.charlie().println("SLF4J(D): " + str);
                return;
            }
            return;
        }
        throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
    }

    public static void foxtrot(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        f.echo("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            f.echo("Ignoring binding found at [" + ((URL) it.next()) + Constants.AES_SUFFIX);
        }
        f.echo("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void golf(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            f.echo("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f.echo("Found provider [" + ((ug.b) it.next()) + Constants.AES_SUFFIX);
            }
            f.echo("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
