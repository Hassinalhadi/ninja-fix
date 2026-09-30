package d3;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.os.Bundle;
import androidx.lifecycle.a0;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public abstract class q extends androidx.appcompat.app.i implements GeneratedComponentManagerHolder {
    public SavedStateHandleHolder alpha;
    public volatile ActivityComponentManager purple;
    public final Object red = new Object();
    public boolean silver = false;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(122, q.class);
        Hidden0.special_clinit_122_00(q.class);
    }

    public q() {
        addOnContextAvailableListener(new Eb.b((k) this, 23));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final native /* bridge */ /* synthetic */ GeneratedComponentManager componentManager();

    public final native ActivityComponentManager echo();

    public native void foxtrot();

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final native Object generatedComponent();

    @Override // ae.o, androidx.lifecycle.InterfaceC0651v
    public final native a0 getDefaultViewModelProviderFactory();

    @Override // androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public native void onCreate(Bundle bundle);

    @Override // androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public native void onDestroy();
}
