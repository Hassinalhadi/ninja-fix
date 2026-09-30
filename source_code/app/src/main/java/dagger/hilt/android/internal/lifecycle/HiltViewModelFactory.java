package dagger.hilt.android.internal.lifecycle;

import T1.b;
import T1.c;
import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.widget.P0;
import androidx.lifecycle.T;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import ge.InterfaceC1772d;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import o2.InterfaceC2196f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class HiltViewModelFactory implements a0 {
    public static final b CREATION_CALLBACK_KEY = new b() { // from class: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.1
    };
    private final a0 delegateFactory;
    private final a0 hiltViewModelFactory;
    private final Map<Class<?>, Boolean> hiltViewModelKeys;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes2.dex */
    public interface ActivityCreatorEntryPoint {
        ViewModelComponentBuilder getViewModelComponentBuilder();

        @HiltViewModelMap.KeySet
        Map<Class<?>, Boolean> getViewModelKeys();
    }

    @EntryPoint
    @InstallIn({ViewModelComponent.class})
    /* loaded from: classes2.dex */
    public interface ViewModelFactoriesEntryPoint {
        @HiltViewModelAssistedMap
        Map<Class<?>, Object> getHiltViewModelAssistedMap();

        @HiltViewModelMap
        Map<Class<?>, Kd.a> getHiltViewModelMap();
    }

    @InstallIn({ViewModelComponent.class})
    /* loaded from: classes2.dex */
    public interface ViewModelModule {
        @HiltViewModelAssistedMap
        Map<Class<?>, Object> hiltViewModelAssistedMap();

        @HiltViewModelMap
        Map<Class<?>, Y> hiltViewModelMap();
    }

    public HiltViewModelFactory(Map<Class<?>, Boolean> map, a0 a0Var, final ViewModelComponentBuilder viewModelComponentBuilder) {
        this.hiltViewModelKeys = map;
        this.delegateFactory = a0Var;
        this.hiltViewModelFactory = new a0() { // from class: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.2
            private <T extends Y> T createViewModel(ViewModelComponent viewModelComponent, Class<T> cls, c cVar) {
                Kd.a aVar = ((ViewModelFactoriesEntryPoint) EntryPoints.get(viewModelComponent, ViewModelFactoriesEntryPoint.class)).getHiltViewModelMap().get(cls);
                Function1 function1 = (Function1) cVar.alpha(HiltViewModelFactory.CREATION_CALLBACK_KEY);
                Object obj = ((ViewModelFactoriesEntryPoint) EntryPoints.get(viewModelComponent, ViewModelFactoriesEntryPoint.class)).getHiltViewModelAssistedMap().get(cls);
                if (obj == null) {
                    if (function1 == null) {
                        if (aVar != null) {
                            return (T) aVar.get();
                        }
                        throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    }
                    throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                }
                if (aVar == null) {
                    if (function1 != null) {
                        return (T) function1.invoke(obj);
                    }
                    throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                }
                throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            }

            @Override // androidx.lifecycle.a0
            @NotNull
            public /* bridge */ /* synthetic */ Y create(@NotNull InterfaceC1772d interfaceC1772d, @NotNull c cVar) {
                return P0.bravo(this, interfaceC1772d, cVar);
            }

            @Override // androidx.lifecycle.a0
            @NotNull
            public /* bridge */ /* synthetic */ Y create(@NotNull Class cls) {
                P0.delta(cls);
                throw null;
            }

            @Override // androidx.lifecycle.a0
            public <T extends Y> T create(Class<T> cls, c cVar) {
                RetainedLifecycleImpl retainedLifecycleImpl = new RetainedLifecycleImpl();
                T t5 = (T) createViewModel(viewModelComponentBuilder.savedStateHandle(T.bravo(cVar)).viewModelLifecycle(retainedLifecycleImpl).build(), cls, cVar);
                t5.addCloseable(new a(retainedLifecycleImpl));
                return t5;
            }
        };
    }

    public static a0 createInternal(Activity activity, InterfaceC2196f interfaceC2196f, Bundle bundle, a0 a0Var) {
        return createInternal(activity, a0Var);
    }

    @Override // androidx.lifecycle.a0
    @NotNull
    public /* bridge */ /* synthetic */ Y create(@NotNull InterfaceC1772d interfaceC1772d, @NotNull c cVar) {
        return P0.bravo(this, interfaceC1772d, cVar);
    }

    public static a0 createInternal(Activity activity, a0 a0Var) {
        ActivityCreatorEntryPoint activityCreatorEntryPoint = (ActivityCreatorEntryPoint) EntryPoints.get(activity, ActivityCreatorEntryPoint.class);
        return new HiltViewModelFactory(activityCreatorEntryPoint.getViewModelKeys(), a0Var, activityCreatorEntryPoint.getViewModelComponentBuilder());
    }

    @Override // androidx.lifecycle.a0
    public <T extends Y> T create(Class<T> cls, c cVar) {
        if (this.hiltViewModelKeys.containsKey(cls)) {
            return (T) this.hiltViewModelFactory.create(cls, cVar);
        }
        return (T) this.delegateFactory.create(cls, cVar);
    }

    @Override // androidx.lifecycle.a0
    public <T extends Y> T create(Class<T> cls) {
        if (this.hiltViewModelKeys.containsKey(cls)) {
            return (T) this.hiltViewModelFactory.create(cls);
        }
        return (T) this.delegateFactory.create(cls);
    }
}
