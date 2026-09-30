package I7;

import android.util.Log;
import ao.ad;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import i8.InterfaceC1904b;
import java.lang.reflect.InvocationTargetException;
import k8.C2020b;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements InterfaceC1904b {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ d(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // i8.InterfaceC1904b
    public final Object get() {
        switch (this.alpha) {
            case 0:
                String str = (String) this.bravo;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new InvalidRegistrarException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new InvalidRegistrarException(ad.gray("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e4) {
                    throw new InvalidRegistrarException(ad.gray("Could not instantiate ", str, "."), e4);
                } catch (NoSuchMethodException e5) {
                    throw new InvalidRegistrarException(av.q.echo("Could not instantiate ", str), e5);
                } catch (InvocationTargetException e10) {
                    throw new InvalidRegistrarException(av.q.echo("Could not instantiate ", str), e10);
                }
            case 1:
                return (ComponentRegistrar) this.bravo;
            default:
                return new C2020b((B7.g) this.bravo);
        }
    }
}
