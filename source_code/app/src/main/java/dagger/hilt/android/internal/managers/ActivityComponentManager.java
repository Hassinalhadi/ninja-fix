package dagger.hilt.android.internal.managers;

import ae.o;
import android.app.Activity;
import android.app.Application;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.internal.GeneratedComponentManager;

/* loaded from: classes2.dex */
public class ActivityComponentManager implements GeneratedComponentManager<Object> {
    protected final Activity activity;
    private final GeneratedComponentManager<ActivityRetainedComponent> activityRetainedComponentManager;
    private volatile Object component;
    private final Object componentLock = new Object();

    @EntryPoint
    @InstallIn({ActivityRetainedComponent.class})
    /* loaded from: classes2.dex */
    public interface ActivityComponentBuilderEntryPoint {
        ActivityComponentBuilder activityComponentBuilder();
    }

    public ActivityComponentManager(Activity activity) {
        this.activity = activity;
        this.activityRetainedComponentManager = new ActivityRetainedComponentManager((o) activity);
    }

    public Object createComponent() {
        String str;
        if (!(this.activity.getApplication() instanceof GeneratedComponentManager)) {
            StringBuilder sb2 = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
            if (Application.class.equals(this.activity.getApplication().getClass())) {
                str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
            } else {
                str = "Found: " + this.activity.getApplication().getClass();
            }
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
        return ((ActivityComponentBuilderEntryPoint) EntryPoints.get(this.activityRetainedComponentManager, ActivityComponentBuilderEntryPoint.class)).activityComponentBuilder().activity(this.activity).build();
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

    public final SavedStateHandleHolder getSavedStateHandleHolder() {
        return ((ActivityRetainedComponentManager) this.activityRetainedComponentManager).getSavedStateHandleHolder();
    }
}
