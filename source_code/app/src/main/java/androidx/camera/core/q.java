package androidx.camera.core;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import androidx.camera.camera2.Camera2Config$DefaultProvider;
import androidx.camera.core.impl.C0505c;
import androidx.camera.core.impl.C0527z;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.W;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import s6.T7;
import s6.U6;
import t6.AbstractC3003i;
import t6.AbstractC3066u3;
import t6.AbstractC3076w3;
import t6.a4;

/* loaded from: classes3.dex */
public final class q {
    public static final Object lima = new Object();
    public static final SparseArray mike = new SparseArray();
    public final s charlie;
    public final Executor delta;
    public final Handler echo;
    public av.i foxtrot;
    public J2.e golf;
    public av.z hotel;
    public final C india;
    public final V0.k juliet;
    public final J2.l alpha = new J2.l(21);
    public final Object bravo = new Object();
    public int kilo = 1;

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e5, code lost:
    
        r0 = r1;
        r1 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(Context context) {
        Camera2Config$DefaultProvider camera2Config$DefaultProvider;
        Object obj;
        Bundle bundle;
        Object obj2;
        Object obj3;
        C w4;
        String str;
        Context bravo = a4.bravo(context);
        while (true) {
            if (!(bravo instanceof ContextWrapper)) {
                break;
            }
            if (bravo instanceof Application) {
                break;
            }
            bravo = ((ContextWrapper) bravo).getBaseContext();
        }
        try {
            Context bravo2 = a4.bravo(context);
            Bundle bundle2 = bravo2.getPackageManager().getServiceInfo(new ComponentName(bravo2, (Class<?>) MetadataHolderService.class), 640).metaData;
            if (bundle2 != null) {
                str = bundle2.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER");
            } else {
                str = null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            AbstractC3066u3.delta("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            camera2Config$DefaultProvider = null;
            if (camera2Config$DefaultProvider != null) {
            }
        } catch (ClassNotFoundException e4) {
            e = e4;
            AbstractC3066u3.delta("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            camera2Config$DefaultProvider = null;
            if (camera2Config$DefaultProvider != null) {
            }
        } catch (IllegalAccessException e5) {
            e = e5;
            AbstractC3066u3.delta("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            camera2Config$DefaultProvider = null;
            if (camera2Config$DefaultProvider != null) {
            }
        } catch (InstantiationException e10) {
            e = e10;
            AbstractC3066u3.delta("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            camera2Config$DefaultProvider = null;
            if (camera2Config$DefaultProvider != null) {
            }
        } catch (NoSuchMethodException e11) {
            e = e11;
            AbstractC3066u3.delta("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            camera2Config$DefaultProvider = null;
            if (camera2Config$DefaultProvider != null) {
            }
        } catch (NullPointerException e12) {
            e = e12;
            AbstractC3066u3.delta("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            camera2Config$DefaultProvider = null;
            if (camera2Config$DefaultProvider != null) {
            }
        } catch (InvocationTargetException e13) {
            e = e13;
            AbstractC3066u3.delta("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            camera2Config$DefaultProvider = null;
            if (camera2Config$DefaultProvider != null) {
            }
        }
        if (str == null) {
            AbstractC3066u3.charlie("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            camera2Config$DefaultProvider = null;
            if (camera2Config$DefaultProvider != null) {
                s cameraXConfig = camera2Config$DefaultProvider.getCameraXConfig();
                this.charlie = cameraXConfig;
                try {
                    obj = cameraXConfig.alpha.quebec(s.f2958d);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                androidx.camera.core.impl.E e14 = (androidx.camera.core.impl.E) obj;
                if (e14 != null) {
                    AbstractC3066u3.bravo("CameraX", "QuirkSettings from CameraXConfig: " + e14);
                } else {
                    try {
                        bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) androidx.camera.core.impl.G.class), 640).metaData;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        AbstractC3066u3.bravo("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
                    }
                    if (bundle == null) {
                        AbstractC3066u3.india("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
                        e14 = null;
                        AbstractC3066u3.bravo("CameraX", "QuirkSettings from app metadata: " + e14);
                    } else {
                        e14 = AbstractC3076w3.alpha(context, bundle);
                        AbstractC3066u3.bravo("CameraX", "QuirkSettings from app metadata: " + e14);
                    }
                }
                if (e14 == null) {
                    e14 = androidx.camera.core.impl.F.bravo;
                    AbstractC3066u3.bravo("CameraX", "QuirkSettings by default: " + e14);
                }
                androidx.camera.core.impl.ax axVar = androidx.camera.core.impl.F.charlie.alpha;
                synchronized (axVar.red) {
                    try {
                        if (!Objects.equals(((AtomicReference) axVar.silver).getAndSet(e14), e14)) {
                            int i4 = axVar.alpha + 1;
                            axVar.alpha = i4;
                            if (!axVar.purple) {
                                axVar.purple = true;
                                Iterator it = ((CopyOnWriteArraySet) axVar.white).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        ((S) it.next()).alpha(i4);
                                    } else {
                                        synchronized (axVar.red) {
                                            if (axVar.alpha == i4) {
                                                break;
                                            }
                                            Iterator it2 = ((CopyOnWriteArraySet) axVar.white).iterator();
                                            int i5 = axVar.alpha;
                                        }
                                    }
                                }
                                axVar.purple = false;
                            }
                        }
                    } finally {
                    }
                }
                try {
                    obj2 = this.charlie.alpha.quebec(s.teal);
                } catch (IllegalArgumentException unused3) {
                    obj2 = null;
                }
                Executor executor = (Executor) obj2;
                try {
                    obj3 = this.charlie.alpha.quebec(s.white);
                } catch (IllegalArgumentException unused4) {
                    obj3 = null;
                }
                Handler handler = (Handler) obj3;
                this.delta = executor == null ? new ExecutorC0531m() : executor;
                if (handler == null) {
                    HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
                    handlerThread.start();
                    this.echo = U6.alpha(handlerThread.getLooper());
                } else {
                    this.echo = handler;
                }
                s sVar = this.charlie;
                C0505c c0505c = s.yellow;
                sVar.getClass();
                alpha((Integer) ((androidx.camera.core.impl.B) sVar.getConfig()).plum(c0505c, null));
                s sVar2 = this.charlie;
                sVar2.getClass();
                C0505c c0505c2 = s.f2957c;
                Object obj4 = C.alpha;
                try {
                    obj4 = sVar2.alpha.quebec(c0505c2);
                } catch (IllegalArgumentException unused5) {
                }
                C c3 = (C) obj4;
                Objects.requireNonNull(c3);
                long alpha = c3.alpha();
                if (c3 instanceof C0527z) {
                    switch (((C0527z) c3).bravo) {
                        case 0:
                            w4 = new C0527z(alpha, 0);
                            break;
                        default:
                            w4 = new C0527z(alpha, 1);
                            break;
                    }
                } else {
                    w4 = new W(alpha, c3);
                }
                this.india = w4;
                this.juliet = bravo(context);
                return;
            }
            throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
        }
        camera2Config$DefaultProvider = (Camera2Config$DefaultProvider) Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        if (camera2Config$DefaultProvider != null) {
        }
    }

    public static void alpha(Integer num) {
        synchronized (lima) {
            try {
                if (num == null) {
                    return;
                }
                T7.delta(num.intValue(), 3, 6, "minLogLevel");
                SparseArray sparseArray = mike;
                int i4 = 1;
                if (sparseArray.get(num.intValue()) != null) {
                    i4 = 1 + ((Integer) sparseArray.get(num.intValue())).intValue();
                }
                sparseArray.put(num.intValue(), Integer.valueOf(i4));
                if (sparseArray.size() == 0) {
                    AbstractC3066u3.alpha = 3;
                } else if (sparseArray.get(3) != null) {
                    AbstractC3066u3.alpha = 3;
                } else if (sparseArray.get(4) != null) {
                    AbstractC3066u3.alpha = 4;
                } else if (sparseArray.get(5) != null) {
                    AbstractC3066u3.alpha = 5;
                } else if (sparseArray.get(6) != null) {
                    AbstractC3066u3.alpha = 6;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final V0.k bravo(Context context) {
        V0.k alpha;
        synchronized (this.bravo) {
            boolean z2 = true;
            if (this.kilo != 1) {
                z2 = false;
            }
            T7.golf("CameraX.initInternal() should only be called once per instance", z2);
            this.kilo = 2;
            alpha = AbstractC3003i.alpha(new A2.ao(12, this, context));
        }
        return alpha;
    }

    public final void charlie() {
        synchronized (this.bravo) {
            this.kilo = 4;
        }
    }
}
