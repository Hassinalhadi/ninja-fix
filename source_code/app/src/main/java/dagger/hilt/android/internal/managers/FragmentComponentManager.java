package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.ai;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes2.dex */
public class FragmentComponentManager implements GeneratedComponentManager<Object> {
    private volatile Object component;
    private final Object componentLock = new Object();
    private final ai fragment;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes2.dex */
    public interface FragmentComponentBuilderEntryPoint {
        FragmentComponentBuilder fragmentComponentBuilder();
    }

    public FragmentComponentManager(ai aiVar) {
        this.fragment = aiVar;
    }

    private Object createComponent() {
        Preconditions.checkNotNull(this.fragment.getHost(), "Hilt Fragments must be attached before creating the component.");
        Preconditions.checkState(this.fragment.getHost() instanceof GeneratedComponentManager, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.fragment.getHost().getClass());
        validate(this.fragment);
        return ((FragmentComponentBuilderEntryPoint) EntryPoints.get(this.fragment.getHost(), FragmentComponentBuilderEntryPoint.class)).fragmentComponentBuilder().fragment(this.fragment).build();
    }

    public static ContextWrapper createContextWrapper(Context context, ai aiVar) {
        return new ViewComponentManager.FragmentContextWrapper(context, aiVar);
    }

    public static final Context findActivity(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static final void initializeArguments(ai aiVar) {
        Preconditions.checkNotNull(aiVar);
        if (aiVar.getArguments() == null) {
            aiVar.setArguments(new Bundle());
        }
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

    public void validate(ai aiVar) {
    }

    public static ContextWrapper createContextWrapper(LayoutInflater layoutInflater, ai aiVar) {
        return new ViewComponentManager.FragmentContextWrapper(layoutInflater, aiVar);
    }
}
