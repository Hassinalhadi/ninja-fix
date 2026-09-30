package delivery.samurai.android.ui;

import Eb.b;
import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.os.Bundle;
import androidx.appcompat.app.i;
import androidx.lifecycle.a0;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import kotlin.Metadata;

/* compiled from: Dex2C */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/MainActivity;", "Landroidx/appcompat/app/i;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes.dex */
public final class MainActivity extends i implements GeneratedComponentManagerHolder {
    public SavedStateHandleHolder alpha;
    public volatile ActivityComponentManager purple;
    public final Object red = new Object();
    public boolean silver = false;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(124, MainActivity.class);
        Hidden0.special_clinit_124_00(MainActivity.class);
    }

    public MainActivity() {
        addOnContextAvailableListener(new b(this, 24));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final native /* bridge */ /* synthetic */ GeneratedComponentManager componentManager();

    public final native ActivityComponentManager echo();

    public final native void foxtrot(Bundle bundle);

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final native Object generatedComponent();

    @Override // ae.o, androidx.lifecycle.InterfaceC0651v
    public final native a0 getDefaultViewModelProviderFactory();

    @Override // androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public final native void onDestroy();
}
