package dagger.hilt.android.internal.managers;

import T1.a;
import T1.c;
import ae.o;
import android.content.Context;
import androidx.appcompat.widget.P0;
import androidx.lifecycle.InterfaceC0651v;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponentManager;
import ge.InterfaceC1772d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t6.AbstractC3062u;

/* loaded from: classes2.dex */
final class ActivityRetainedComponentManager implements GeneratedComponentManager<ActivityRetainedComponent> {
    private volatile ActivityRetainedComponent component;
    private final Object componentLock = new Object();
    private final Context context;
    private final d0 viewModelStoreOwner;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes2.dex */
    public interface ActivityRetainedComponentBuilderEntryPoint {
        ActivityRetainedComponentBuilder retainedComponentBuilder();
    }

    /* loaded from: classes2.dex */
    public static final class ActivityRetainedComponentViewModel extends Y {
        private final ActivityRetainedComponent component;
        private final SavedStateHandleHolder savedStateHandleHolder;

        public ActivityRetainedComponentViewModel(ActivityRetainedComponent activityRetainedComponent, SavedStateHandleHolder savedStateHandleHolder) {
            this.component = activityRetainedComponent;
            this.savedStateHandleHolder = savedStateHandleHolder;
        }

        public ActivityRetainedComponent getComponent() {
            return this.component;
        }

        public SavedStateHandleHolder getSavedStateHandleHolder() {
            return this.savedStateHandleHolder;
        }

        @Override // androidx.lifecycle.Y
        public void onCleared() {
            super.onCleared();
            ((RetainedLifecycleImpl) ((ActivityRetainedLifecycleEntryPoint) EntryPoints.get(this.component, ActivityRetainedLifecycleEntryPoint.class)).getActivityRetainedLifecycle()).dispatchOnCleared();
        }
    }

    @EntryPoint
    @InstallIn({ActivityRetainedComponent.class})
    /* loaded from: classes2.dex */
    public interface ActivityRetainedLifecycleEntryPoint {
        ActivityRetainedLifecycle getActivityRetainedLifecycle();
    }

    @InstallIn({ActivityRetainedComponent.class})
    /* loaded from: classes2.dex */
    public static abstract class LifecycleModule {
        @ActivityRetainedScoped
        public static ActivityRetainedLifecycle provideActivityRetainedLifecycle() {
            return new RetainedLifecycleImpl();
        }
    }

    public ActivityRetainedComponentManager(o oVar) {
        this.viewModelStoreOwner = oVar;
        this.context = oVar;
    }

    private ActivityRetainedComponent createComponent() {
        b0 viewModelProvider = getViewModelProvider(this.viewModelStoreOwner, this.context);
        viewModelProvider.getClass();
        return ((ActivityRetainedComponentViewModel) viewModelProvider.alpha(AbstractC3062u.echo(ActivityRetainedComponentViewModel.class))).getComponent();
    }

    private b0 getViewModelProvider(d0 owner, final Context context) {
        c cVar;
        a0 a0Var = new a0() { // from class: dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.1
            @Override // androidx.lifecycle.a0
            @NotNull
            public /* bridge */ /* synthetic */ Y create(@NotNull InterfaceC1772d interfaceC1772d, @NotNull c cVar2) {
                return P0.bravo(this, interfaceC1772d, cVar2);
            }

            @Override // androidx.lifecycle.a0
            @NotNull
            public /* bridge */ /* synthetic */ Y create(@NotNull Class cls) {
                P0.delta(cls);
                throw null;
            }

            @Override // androidx.lifecycle.a0
            public <T extends Y> T create(Class<T> cls, c cVar2) {
                SavedStateHandleHolder savedStateHandleHolder = new SavedStateHandleHolder(cVar2);
                return new ActivityRetainedComponentViewModel(((ActivityRetainedComponentBuilderEntryPoint) EntryPointAccessors.fromApplication(context, ActivityRetainedComponentBuilderEntryPoint.class)).retainedComponentBuilder().savedStateHandleHolder(savedStateHandleHolder).build(), savedStateHandleHolder);
            }
        };
        Intrinsics.echo(owner, "owner");
        c0 viewModelStore = owner.getViewModelStore();
        if (owner instanceof InterfaceC0651v) {
            cVar = ((InterfaceC0651v) owner).getDefaultViewModelCreationExtras();
        } else {
            cVar = a.bravo;
        }
        return new b0(viewModelStore, a0Var, cVar);
    }

    public SavedStateHandleHolder getSavedStateHandleHolder() {
        b0 viewModelProvider = getViewModelProvider(this.viewModelStoreOwner, this.context);
        viewModelProvider.getClass();
        return ((ActivityRetainedComponentViewModel) viewModelProvider.alpha(AbstractC3062u.echo(ActivityRetainedComponentViewModel.class))).getSavedStateHandleHolder();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // dagger.hilt.internal.GeneratedComponentManager
    public ActivityRetainedComponent generatedComponent() {
        if (this.component == null) {
            synchronized (this.componentLock) {
                try {
                    if (this.component == null) {
                        this.component = createComponent();
                    }
                } finally {
                }
            }
        }
        return this.component;
    }
}
