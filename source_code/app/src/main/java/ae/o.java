package ae;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.InterfaceC0651v;
import androidx.lifecycle.T;
import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import g1.InterfaceC1738g;
import g1.InterfaceC1739h;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import o2.C2191a;
import o2.C2194d;
import o2.C2195e;
import o2.InterfaceC2196f;
import q2.C2406a;
import r1.InterfaceC2482a;
import s1.C2581n;
import s1.InterfaceC2578k;
import s1.InterfaceC2582o;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public abstract class o extends f1.i implements d0, InterfaceC0651v, InterfaceC2196f, aj, ah.i, InterfaceC1738g, InterfaceC1739h, f1.ad, f1.ae, InterfaceC2578k {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final C0429h Companion = null;
    private c0 _viewModelStore;
    private final ah.h activityResultRegistry;
    private int contentLayoutId;
    private final Lazy defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final Lazy fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final Lazy onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<InterfaceC2482a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2482a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2482a> onNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC2482a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC2482a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final j reportFullyDrawnExecutor;
    private final C2195e savedStateRegistryController;
    private final ag.a contextAwareHelper = new ag.a();
    private final C2581n menuHostHelper = new C2581n(new RunnableC0425d(this, 0));

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(21, o.class);
        Hidden0.special_clinit_21_00(o.class);
    }

    public o() {
        final int i4 = 0;
        C2195e c2195e = new C2195e(new C2406a(this, new kotlin.collections.n(8, this)));
        this.savedStateRegistryController = c2195e;
        this.reportFullyDrawnExecutor = new k(this);
        int i5 = 2;
        this.fullyDrawnReporter$delegate = LazyKt.lazy(new n(this, i5));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new m(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().alpha(new androidx.lifecycle.aj(this) { // from class: ae.e
            public final /* synthetic */ o purple;

            {
                this.purple = this;
            }

            @Override // androidx.lifecycle.aj
            public final void onStateChanged(androidx.lifecycle.al alVar, androidx.lifecycle.aa aaVar) {
                Window window;
                View peekDecorView;
                switch (i4) {
                    case 0:
                        if (aaVar == androidx.lifecycle.aa.ON_STOP && (window = this.purple.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            return;
                        }
                        return;
                    default:
                        o.bravo(this.purple, alVar, aaVar);
                        return;
                }
            }
        });
        final int i10 = 1;
        getLifecycle().alpha(new androidx.lifecycle.aj(this) { // from class: ae.e
            public final /* synthetic */ o purple;

            {
                this.purple = this;
            }

            @Override // androidx.lifecycle.aj
            public final void onStateChanged(androidx.lifecycle.al alVar, androidx.lifecycle.aa aaVar) {
                Window window;
                View peekDecorView;
                switch (i10) {
                    case 0:
                        if (aaVar == androidx.lifecycle.aa.ON_STOP && (window = this.purple.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            return;
                        }
                        return;
                    default:
                        o.bravo(this.purple, alVar, aaVar);
                        return;
                }
            }
        });
        getLifecycle().alpha(new C2191a(i5, this));
        c2195e.alpha();
        T.charlie(this);
        if (Build.VERSION.SDK_INT <= 23) {
            getLifecycle().alpha(new ab(this));
        }
        getSavedStateRegistry().charlie(ACTIVITY_RESULT_TAG, new S1.a(i10, this));
        addOnContextAvailableListener(new ag.b() { // from class: ae.f
            @Override // ag.b
            public final void alpha(o oVar) {
                o.alpha(o.this, oVar);
            }
        });
        this.defaultViewModelProviderFactory$delegate = LazyKt.lazy(new n(this, i4));
        this.onBackPressedDispatcher$delegate = LazyKt.lazy(new n(this, 3));
    }

    public static final native void access$addObserverForBackInvoker(o oVar, ai aiVar);

    public static final native void access$ensureViewModelStore(o oVar);

    public static final native /* synthetic */ j access$getReportFullyDrawnExecutor$p(o oVar);

    public static final native /* synthetic */ void access$onBackPressed$s1027565324(o oVar);

    public static native void alpha(o oVar, o oVar2);

    public static native void bravo(o oVar, androidx.lifecycle.al alVar, androidx.lifecycle.aa aaVar);

    public static native Bundle charlie(o oVar);

    public static native /* synthetic */ void getOnBackPressedDispatcher$annotations();

    @Override // android.app.Activity
    public native void addContentView(View view, ViewGroup.LayoutParams layoutParams);

    @Override // s1.InterfaceC2578k
    public native void addMenuProvider(InterfaceC2582o interfaceC2582o);

    public native void addMenuProvider(InterfaceC2582o interfaceC2582o, androidx.lifecycle.al alVar);

    public native void addMenuProvider(InterfaceC2582o interfaceC2582o, androidx.lifecycle.al alVar, androidx.lifecycle.ab abVar);

    @Override // g1.InterfaceC1738g
    public final native void addOnConfigurationChangedListener(InterfaceC2482a interfaceC2482a);

    public final native void addOnContextAvailableListener(ag.b bVar);

    @Override // f1.ad
    public final native void addOnMultiWindowModeChangedListener(InterfaceC2482a interfaceC2482a);

    public final native void addOnNewIntentListener(InterfaceC2482a interfaceC2482a);

    @Override // f1.ae
    public final native void addOnPictureInPictureModeChangedListener(InterfaceC2482a interfaceC2482a);

    @Override // g1.InterfaceC1739h
    public final native void addOnTrimMemoryListener(InterfaceC2482a interfaceC2482a);

    public final native void addOnUserLeaveHintListener(Runnable runnable);

    @Override // ah.i
    public final native ah.h getActivityResultRegistry();

    @Override // androidx.lifecycle.InterfaceC0651v
    public native T1.c getDefaultViewModelCreationExtras();

    @Override // androidx.lifecycle.InterfaceC0651v
    public native a0 getDefaultViewModelProviderFactory();

    public native w getFullyDrawnReporter();

    @kotlin.c
    public native Object getLastCustomNonConfigurationInstance();

    @Override // f1.i, androidx.lifecycle.al
    public native androidx.lifecycle.ac getLifecycle();

    @Override // ae.aj
    public final native ai getOnBackPressedDispatcher();

    @Override // o2.InterfaceC2196f
    public final native C2194d getSavedStateRegistry();

    @Override // androidx.lifecycle.d0
    public native c0 getViewModelStore();

    public native void initializeViewTreeOwners();

    public native void invalidateMenu();

    @Override // android.app.Activity
    @kotlin.c
    public native void onActivityResult(int i4, int i5, Intent intent);

    @Override // android.app.Activity
    @kotlin.c
    public native void onBackPressed();

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public native void onConfigurationChanged(Configuration configuration);

    @Override // f1.i, android.app.Activity
    public native void onCreate(Bundle bundle);

    @Override // android.app.Activity, android.view.Window.Callback
    public native boolean onCreatePanelMenu(int i4, Menu menu);

    @Override // android.app.Activity, android.view.Window.Callback
    public native boolean onMenuItemSelected(int i4, MenuItem menuItem);

    @Override // android.app.Activity
    @kotlin.c
    public native void onMultiWindowModeChanged(boolean z2);

    @Override // android.app.Activity
    public native void onMultiWindowModeChanged(boolean z2, Configuration configuration);

    @Override // android.app.Activity
    public native void onNewIntent(Intent intent);

    @Override // android.app.Activity, android.view.Window.Callback
    public native void onPanelClosed(int i4, Menu menu);

    @Override // android.app.Activity
    @kotlin.c
    public native void onPictureInPictureModeChanged(boolean z2);

    @Override // android.app.Activity
    public native void onPictureInPictureModeChanged(boolean z2, Configuration configuration);

    @Override // android.app.Activity, android.view.Window.Callback
    public native boolean onPreparePanel(int i4, View view, Menu menu);

    @Override // android.app.Activity
    @kotlin.c
    public native void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr);

    @kotlin.c
    public native Object onRetainCustomNonConfigurationInstance();

    @Override // android.app.Activity
    public final native Object onRetainNonConfigurationInstance();

    @Override // f1.i, android.app.Activity
    public native void onSaveInstanceState(Bundle bundle);

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public native void onTrimMemory(int i4);

    @Override // android.app.Activity
    public native void onUserLeaveHint();

    public native Context peekAvailableContext();

    public final native ah.b registerForActivityResult(ai.b bVar, ah.a aVar);

    public final native ah.b registerForActivityResult(ai.b bVar, ah.h hVar, ah.a aVar);

    @Override // s1.InterfaceC2578k
    public native void removeMenuProvider(InterfaceC2582o interfaceC2582o);

    @Override // g1.InterfaceC1738g
    public final native void removeOnConfigurationChangedListener(InterfaceC2482a interfaceC2482a);

    public final native void removeOnContextAvailableListener(ag.b bVar);

    @Override // f1.ad
    public final native void removeOnMultiWindowModeChangedListener(InterfaceC2482a interfaceC2482a);

    public final native void removeOnNewIntentListener(InterfaceC2482a interfaceC2482a);

    @Override // f1.ae
    public final native void removeOnPictureInPictureModeChangedListener(InterfaceC2482a interfaceC2482a);

    @Override // g1.InterfaceC1739h
    public final native void removeOnTrimMemoryListener(InterfaceC2482a interfaceC2482a);

    public final native void removeOnUserLeaveHintListener(Runnable runnable);

    @Override // android.app.Activity
    public native void reportFullyDrawn();

    @Override // android.app.Activity
    public native void setContentView(int i4);

    @Override // android.app.Activity
    public native void setContentView(View view);

    @Override // android.app.Activity
    public native void setContentView(View view, ViewGroup.LayoutParams layoutParams);

    @Override // android.app.Activity
    @kotlin.c
    public native void startActivityForResult(Intent intent, int i4);

    @Override // android.app.Activity
    @kotlin.c
    public native void startActivityForResult(Intent intent, int i4, Bundle bundle);

    @Override // android.app.Activity
    @kotlin.c
    public native void startIntentSenderForResult(IntentSender intentSender, int i4, Intent intent, int i5, int i10, int i11);

    @Override // android.app.Activity
    @kotlin.c
    public native void startIntentSenderForResult(IntentSender intentSender, int i4, Intent intent, int i5, int i10, int i11, Bundle bundle);
}
