package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.ai;
import androidx.lifecycle.aa;
import androidx.lifecycle.aj;
import androidx.lifecycle.al;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.internal.Contexts;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes2.dex */
public final class ViewComponentManager implements GeneratedComponentManager<Object> {
    private volatile Object component;
    private final Object componentLock = new Object();
    private final boolean hasFragmentBindings;
    private final View view;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes2.dex */
    public interface ViewComponentBuilderEntryPoint {
        ViewComponentBuilder viewComponentBuilder();
    }

    @EntryPoint
    @InstallIn({FragmentComponent.class})
    /* loaded from: classes2.dex */
    public interface ViewWithFragmentComponentBuilderEntryPoint {
        ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder();
    }

    public ViewComponentManager(View view, boolean z2) {
        this.view = view;
        this.hasFragmentBindings = z2;
    }

    private Object createComponent() {
        GeneratedComponentManager<?> parentComponentManager = getParentComponentManager(false);
        if (this.hasFragmentBindings) {
            return ((ViewWithFragmentComponentBuilderEntryPoint) EntryPoints.get(parentComponentManager, ViewWithFragmentComponentBuilderEntryPoint.class)).viewWithFragmentComponentBuilder().view(this.view).build();
        }
        return ((ViewComponentBuilderEntryPoint) EntryPoints.get(parentComponentManager, ViewComponentBuilderEntryPoint.class)).viewComponentBuilder().view(this.view).build();
    }

    private GeneratedComponentManager<?> getParentComponentManager(boolean z2) {
        if (this.hasFragmentBindings) {
            Context parentContext = getParentContext(FragmentContextWrapper.class, z2);
            if (parentContext instanceof FragmentContextWrapper) {
                return (GeneratedComponentManager) ((FragmentContextWrapper) parentContext).getFragment();
            }
            if (z2) {
                return null;
            }
            Preconditions.checkState(!(r6 instanceof GeneratedComponentManager), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.view.getClass(), getParentContext(GeneratedComponentManager.class, z2).getClass().getName());
        } else {
            Object parentContext2 = getParentContext(GeneratedComponentManager.class, z2);
            if (parentContext2 instanceof GeneratedComponentManager) {
                return (GeneratedComponentManager) parentContext2;
            }
            if (z2) {
                return null;
            }
        }
        throw new IllegalStateException(this.view.getClass() + ", Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.");
    }

    private Context getParentContext(Class<?> cls, boolean z2) {
        Context unwrap = unwrap(this.view.getContext(), cls);
        if (unwrap == Contexts.getApplication(unwrap.getApplicationContext())) {
            Preconditions.checkState(z2, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.view.getClass());
            return null;
        }
        return unwrap;
    }

    private static Context unwrap(Context context, Class<?> cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public Object generatedComponent() {
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

    public GeneratedComponentManager<?> maybeGetParentComponentManager() {
        return getParentComponentManager(true);
    }

    /* loaded from: classes2.dex */
    public static final class FragmentContextWrapper extends ContextWrapper {
        private LayoutInflater baseInflater;
        private ai fragment;
        private final aj fragmentLifecycleObserver;
        private LayoutInflater inflater;

        public FragmentContextWrapper(Context context, ai aiVar) {
            super((Context) Preconditions.checkNotNull(context));
            aj ajVar = new aj() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.1
                @Override // androidx.lifecycle.aj
                public void onStateChanged(al alVar, aa aaVar) {
                    if (aaVar == aa.ON_DESTROY) {
                        FragmentContextWrapper.this.fragment = null;
                        FragmentContextWrapper.this.baseInflater = null;
                        FragmentContextWrapper.this.inflater = null;
                    }
                }
            };
            this.fragmentLifecycleObserver = ajVar;
            this.baseInflater = null;
            ai aiVar2 = (ai) Preconditions.checkNotNull(aiVar);
            this.fragment = aiVar2;
            aiVar2.getLifecycle().alpha(ajVar);
        }

        public ai getFragment() {
            Preconditions.checkNotNull(this.fragment, "The fragment has already been destroyed.");
            return this.fragment;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.inflater == null) {
                if (this.baseInflater == null) {
                    this.baseInflater = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.inflater = this.baseInflater.cloneInContext(this);
            }
            return this.inflater;
        }

        public FragmentContextWrapper(LayoutInflater layoutInflater, ai aiVar) {
            super((Context) Preconditions.checkNotNull(((LayoutInflater) Preconditions.checkNotNull(layoutInflater)).getContext()));
            aj ajVar = new aj() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.1
                @Override // androidx.lifecycle.aj
                public void onStateChanged(al alVar, aa aaVar) {
                    if (aaVar == aa.ON_DESTROY) {
                        FragmentContextWrapper.this.fragment = null;
                        FragmentContextWrapper.this.baseInflater = null;
                        FragmentContextWrapper.this.inflater = null;
                    }
                }
            };
            this.fragmentLifecycleObserver = ajVar;
            this.baseInflater = layoutInflater;
            ai aiVar2 = (ai) Preconditions.checkNotNull(aiVar);
            this.fragment = aiVar2;
            aiVar2.getLifecycle().alpha(ajVar);
        }
    }
}
