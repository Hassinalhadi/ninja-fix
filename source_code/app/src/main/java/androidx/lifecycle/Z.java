package androidx.lifecycle;

import android.app.Application;
import androidx.appcompat.widget.P0;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3013k;

/* loaded from: classes3.dex */
public final class Z extends S {
    public static Z delta;
    public static final u8.b echo = new u8.b(14);
    public final Application charlie;

    public Z(Application application) {
        super(1);
        this.charlie = application;
    }

    public final Y alpha(Application application, Class cls) {
        if (AndroidViewModel.class.isAssignableFrom(cls)) {
            try {
                Y y10 = (Y) cls.getConstructor(Application.class).newInstance(application);
                Intrinsics.checkNotNull(y10);
                return y10;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(P0.blue(cls, "Cannot create an instance of "), e);
            } catch (InstantiationException e4) {
                throw new RuntimeException(P0.blue(cls, "Cannot create an instance of "), e4);
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException(P0.blue(cls, "Cannot create an instance of "), e5);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(P0.blue(cls, "Cannot create an instance of "), e10);
            }
        }
        return super.create(cls);
    }

    @Override // androidx.lifecycle.S, androidx.lifecycle.a0
    public final Y create(Class modelClass, T1.c extras) {
        Intrinsics.echo(modelClass, "modelClass");
        Intrinsics.echo(extras, "extras");
        if (this.charlie != null) {
            return create(modelClass);
        }
        Application application = (Application) extras.alpha(echo);
        if (application != null) {
            return alpha(application, modelClass);
        }
        if (!AndroidViewModel.class.isAssignableFrom(modelClass)) {
            return AbstractC3013k.echo(modelClass);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }

    @Override // androidx.lifecycle.S, androidx.lifecycle.a0
    public final Y create(Class modelClass) {
        Intrinsics.echo(modelClass, "modelClass");
        Application application = this.charlie;
        if (application != null) {
            return alpha(application, modelClass);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
