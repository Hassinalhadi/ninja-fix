package y2;

import android.os.Parcel;
import android.os.Parcelable;
import bv.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import pe.AbstractC2327c;

/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3392a {
    public final e alpha;
    public final e bravo;
    public final e charlie;

    public AbstractC3392a(e eVar, e eVar2, e eVar3) {
        this.alpha = eVar;
        this.bravo = eVar2;
        this.charlie = eVar3;
    }

    public abstract C3393b alpha();

    public final Class bravo(Class cls) {
        String name = cls.getName();
        e eVar = this.charlie;
        Class cls2 = (Class) eVar.get(name);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(AbstractC2327c.xray(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
            eVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method charlie(String str) {
        e eVar = this.alpha;
        Method method = (Method) eVar.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, AbstractC3392a.class.getClassLoader()).getDeclaredMethod("read", AbstractC3392a.class);
            eVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method delta(Class cls) {
        String name = cls.getName();
        e eVar = this.bravo;
        Method method = (Method) eVar.get(name);
        if (method == null) {
            Class bravo = bravo(cls);
            System.currentTimeMillis();
            Method declaredMethod = bravo.getDeclaredMethod("write", cls, AbstractC3392a.class);
            eVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean echo(int i4);

    public final int foxtrot(int i4, int i5) {
        if (!echo(i5)) {
            return i4;
        }
        return ((C3393b) this).echo.readInt();
    }

    public final Parcelable golf(Parcelable parcelable, int i4) {
        if (!echo(i4)) {
            return parcelable;
        }
        return ((C3393b) this).echo.readParcelable(C3393b.class.getClassLoader());
    }

    public final InterfaceC3394c hotel() {
        String readString = ((C3393b) this).echo.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (InterfaceC3394c) charlie(readString).invoke(null, alpha());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
        } catch (InvocationTargetException e10) {
            if (e10.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e10.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
        }
    }

    public abstract void india(int i4);

    public final void juliet(int i4, int i5) {
        india(i5);
        ((C3393b) this).echo.writeInt(i4);
    }

    public final void kilo(InterfaceC3394c interfaceC3394c) {
        if (interfaceC3394c == null) {
            ((C3393b) this).echo.writeString(null);
            return;
        }
        try {
            ((C3393b) this).echo.writeString(bravo(interfaceC3394c.getClass()).getName());
            C3393b alpha = alpha();
            try {
                delta(interfaceC3394c.getClass()).invoke(null, interfaceC3394c, alpha);
                int i4 = alpha.india;
                if (i4 >= 0) {
                    int i5 = alpha.delta.get(i4);
                    Parcel parcel = alpha.echo;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i5);
                    parcel.writeInt(dataPosition - i5);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
            } catch (InvocationTargetException e10) {
                if (e10.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e10.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
            }
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(interfaceC3394c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e11);
        }
    }
}
