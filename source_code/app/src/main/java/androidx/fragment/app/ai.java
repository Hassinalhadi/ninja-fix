package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.IntentSenderRequest;
import androidx.appcompat.widget.P0;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.lifecycle.InterfaceC0651v;
import f1.AbstractC1683c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import o2.C2194d;
import o2.C2195e;
import o2.InterfaceC2196f;
import q2.C2406a;
import s6.AbstractC2609a7;

/* loaded from: classes3.dex */
public abstract class ai implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.al, androidx.lifecycle.d0, InterfaceC0651v, InterfaceC2196f {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    af mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.a0 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    L mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    as mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.an mLifecycleRegistry;
    ai mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    C2195e mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    ai mTarget;
    int mTargetRequestCode;
    boolean mTransitioning;
    View mView;
    e0 mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    L mChildFragmentManager = new L();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new RunnableC0630z(this, 0);
    androidx.lifecycle.ab mMaxState = androidx.lifecycle.ab.teal;
    androidx.lifecycle.az mViewLifecycleOwnerLiveData = new androidx.lifecycle.au();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<ag> mOnPreAttachedListeners = new ArrayList<>();
    private final ag mSavedStateAttachListener = new aa(this);

    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public ai() {
        hotel();
    }

    @Deprecated
    public static ai instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public Activity bravo() {
        return getActivity();
    }

    public void callStartTransitionListener(boolean z2) {
        ViewGroup viewGroup;
        L l10;
        af afVar = this.mAnimationInfo;
        if (afVar != null) {
            afVar.sierra = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (l10 = this.mFragmentManager) != null) {
            C0622q juliet = C0622q.juliet(viewGroup, l10);
            juliet.lima();
            if (z2) {
                this.mHost.red.post(new r(1, juliet));
            } else {
                juliet.echo();
            }
            Handler handler = this.mPostponedHandler;
            if (handler != null) {
                handler.removeCallbacks(this.mPostponedDurationRunnable);
                this.mPostponedHandler = null;
            }
        }
    }

    public aq createFragmentContainer() {
        return new ab(this);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        ai golf = golf(false);
        if (golf != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(golf);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.a.alpha(this).bravo(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.victor(P0.crimson(str, "  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.af, java.lang.Object] */
    public final af echo() {
        if (this.mAnimationInfo == null) {
            ?? obj = new Object();
            obj.india = null;
            Object obj2 = USE_DEFAULT_TRANSITION;
            obj.juliet = obj2;
            obj.kilo = null;
            obj.lima = obj2;
            obj.mike = null;
            obj.november = obj2;
            obj.quebec = 1.0f;
            obj.romeo = null;
            this.mAnimationInfo = obj;
        }
        return this.mAnimationInfo;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public ai findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.charlie.charlie(str);
    }

    public final int foxtrot() {
        androidx.lifecycle.ab abVar = this.mMaxState;
        if (abVar != androidx.lifecycle.ab.purple && this.mParentFragment != null) {
            return Math.min(abVar.ordinal(), this.mParentFragment.foxtrot());
        }
        return abVar.ordinal();
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final an getActivity() {
        as asVar = this.mHost;
        if (asVar == null) {
            return null;
        }
        return asVar.alpha;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        af afVar = this.mAnimationInfo;
        if (afVar != null && (bool = afVar.papa) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        af afVar = this.mAnimationInfo;
        if (afVar != null && (bool = afVar.oscar) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public View getAnimatingAway() {
        af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return null;
        }
        afVar.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final L getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(P0.coral("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        as asVar = this.mHost;
        if (asVar == null) {
            return null;
        }
        return asVar.purple;
    }

    @Override // androidx.lifecycle.InterfaceC0651v
    public T1.c getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && L.gray(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        T1.e eVar = new T1.e(0);
        LinkedHashMap linkedHashMap = eVar.alpha;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.Z.echo, application);
        }
        linkedHashMap.put(androidx.lifecycle.T.alpha, this);
        linkedHashMap.put(androidx.lifecycle.T.bravo, this);
        if (getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.T.charlie, getArguments());
        }
        return eVar;
    }

    public androidx.lifecycle.a0 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && L.gray(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new androidx.lifecycle.V(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return 0;
        }
        return afVar.bravo;
    }

    public Object getEnterTransition() {
        af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return null;
        }
        return afVar.india;
    }

    public f1.ag getEnterTransitionCallback() {
        af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return null;
        }
        afVar.getClass();
        return null;
    }

    public int getExitAnim() {
        af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return 0;
        }
        return afVar.charlie;
    }

    public Object getExitTransition() {
        af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return null;
        }
        return afVar.kilo;
    }

    public f1.ag getExitTransitionCallback() {
        af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return null;
        }
        afVar.getClass();
        return null;
    }

    public View getFocusedView() {
        af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return null;
        }
        return afVar.romeo;
    }

    @Deprecated
    public final L getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        as asVar = this.mHost;
        if (asVar == null) {
            return null;
        }
        return ((am) asVar).teal;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.al
    public androidx.lifecycle.ac getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.alpha(this);
    }

    public int getNextTransition() {
        af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return 0;
        }
        return afVar.foxtrot;
    }

    public final ai getParentFragment() {
        return this.mParentFragment;
    }

    public final L getParentFragmentManager() {
        L l10 = this.mFragmentManager;
        if (l10 != null) {
            return l10;
        }
        throw new IllegalStateException(P0.coral("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return false;
        }
        return afVar.alpha;
    }

    public int getPopEnterAnim() {
        af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return 0;
        }
        return afVar.delta;
    }

    public int getPopExitAnim() {
        af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return 0;
        }
        return afVar.echo;
    }

    public float getPostOnViewCreatedAlpha() {
        af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return 1.0f;
        }
        return afVar.quebec;
    }

    public Object getReenterTransition() {
        af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return null;
        }
        Object obj = afVar.lima;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        O1.b bVar = O1.c.alpha;
        O1.c.bravo(new GetRetainInstanceUsageViolation(this));
        O1.c.alpha(this).getClass();
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return null;
        }
        Object obj = afVar.juliet;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    @Override // o2.InterfaceC2196f
    public final C2194d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.bravo;
    }

    public Object getSharedElementEnterTransition() {
        af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return null;
        }
        return afVar.mike;
    }

    public Object getSharedElementReturnTransition() {
        af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return null;
        }
        Object obj = afVar.november;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        af afVar = this.mAnimationInfo;
        if (afVar != null && (arrayList = afVar.golf) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        af afVar = this.mAnimationInfo;
        if (afVar != null && (arrayList = afVar.hotel) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public final String getString(int i4) {
        return getResources().getString(i4);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final ai getTargetFragment() {
        return golf(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        O1.b bVar = O1.c.alpha;
        O1.c.bravo(new GetTargetFragmentRequestCodeUsageViolation(this));
        O1.c.alpha(this).getClass();
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i4) {
        return getResources().getText(i4);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public androidx.lifecycle.al getViewLifecycleOwner() {
        e0 e0Var = this.mViewLifecycleOwner;
        if (e0Var != null) {
            return e0Var;
        }
        throw new IllegalStateException(P0.coral("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public androidx.lifecycle.au getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.d0
    public androidx.lifecycle.c0 getViewModelStore() {
        if (this.mFragmentManager != null) {
            int foxtrot = foxtrot();
            androidx.lifecycle.ab abVar = androidx.lifecycle.ab.alpha;
            if (foxtrot != 1) {
                HashMap hashMap = this.mFragmentManager.ivory.charlie;
                androidx.lifecycle.c0 c0Var = (androidx.lifecycle.c0) hashMap.get(this.mWho);
                if (c0Var == null) {
                    androidx.lifecycle.c0 c0Var2 = new androidx.lifecycle.c0();
                    hashMap.put(this.mWho, c0Var2);
                    return c0Var2;
                }
                return c0Var;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final ai golf(boolean z2) {
        String str;
        if (z2) {
            O1.b bVar = O1.c.alpha;
            O1.c.bravo(new GetTargetFragmentUsageViolation(this));
            O1.c.alpha(this).getClass();
        }
        ai aiVar = this.mTarget;
        if (aiVar != null) {
            return aiVar;
        }
        L l10 = this.mFragmentManager;
        if (l10 != null && (str = this.mTargetWho) != null) {
            return l10.charlie.bravo(str);
        }
        return null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final void hotel() {
        this.mLifecycleRegistry = new androidx.lifecycle.an(this);
        this.mSavedStateRegistryController = new C2195e(new C2406a(this, new kotlin.collections.n(8, this)));
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            ag agVar = this.mSavedStateAttachListener;
            if (this.mState >= 0) {
                agVar.alpha();
            } else {
                this.mOnPreAttachedListeners.add(agVar);
            }
        }
    }

    public final C0629y india(ai.b bVar, ar.a aVar, ah.a aVar2) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            ae aeVar = new ae(this, aVar, atomicReference, bVar, aVar2);
            if (this.mState >= 0) {
                aeVar.alpha();
            } else {
                this.mOnPreAttachedListeners.add(aeVar);
            }
            return new C0629y(atomicReference);
        }
        throw new IllegalStateException(P0.coral("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    public void initState() {
        hotel();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new L();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        if (this.mHost != null && this.mAdded) {
            return true;
        }
        return false;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        boolean isHidden;
        if (!this.mHidden) {
            L l10 = this.mFragmentManager;
            if (l10 != null) {
                ai aiVar = this.mParentFragment;
                l10.getClass();
                if (aiVar == null) {
                    isHidden = false;
                } else {
                    isHidden = aiVar.isHidden();
                }
                if (isHidden) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean isInBackStack() {
        if (this.mBackStackNesting > 0) {
            return true;
        }
        return false;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        boolean isMenuVisible;
        if (this.mMenuVisible) {
            if (this.mFragmentManager != null) {
                ai aiVar = this.mParentFragment;
                if (aiVar == null) {
                    isMenuVisible = true;
                } else {
                    isMenuVisible = aiVar.isMenuVisible();
                }
                if (!isMenuVisible) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean isPostponed() {
        af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return false;
        }
        return afVar.sierra;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        if (this.mState >= 7) {
            return true;
        }
        return false;
    }

    public final boolean isStateSaved() {
        L l10 = this.mFragmentManager;
        if (l10 == null) {
            return false;
        }
        return l10.jade();
    }

    public final boolean isVisible() {
        View view;
        if (isAdded() && !isHidden() && (view = this.mView) != null && view.getWindowToken() != null && this.mView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.lime();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i4, int i5, Intent intent) {
        if (L.gray(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i4 + " resultCode: " + i5 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        as asVar = this.mHost;
        an anVar = asVar == null ? null : asVar.alpha;
        if (anVar != null) {
            this.mCalled = false;
            onAttach((Activity) anVar);
        }
    }

    @Deprecated
    public void onAttachFragment(ai aiVar) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        L l10 = this.mChildFragmentManager;
        if (l10.whiskey >= 1) {
            return;
        }
        l10.cyan = false;
        l10.emerald = false;
        l10.ivory.foxtrot = false;
        l10.uniform(1);
    }

    public Animation onCreateAnimation(int i4, boolean z2, int i5) {
        return null;
    }

    public Animator onCreateAnimator(int i4, boolean z2, int i5) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i4 = this.mContentLayoutId;
        if (i4 != 0) {
            return layoutInflater.inflate(i4, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z2) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        as asVar = this.mHost;
        an anVar = asVar == null ? null : asVar.alpha;
        if (anVar != null) {
            this.mCalled = false;
            onInflate((Activity) anVar, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z2) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z2) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z2) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        Bundle bundle2;
        this.mChildFragmentManager.lime();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            if (L.gray(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
            }
            if (this.mView != null) {
                Bundle bundle3 = this.mSavedFragmentState;
                if (bundle3 != null) {
                    bundle2 = bundle3.getBundle("savedInstanceState");
                } else {
                    bundle2 = null;
                }
                restoreViewState(bundle2);
            }
            this.mSavedFragmentState = null;
            L l10 = this.mChildFragmentManager;
            l10.cyan = false;
            l10.emerald = false;
            l10.ivory.foxtrot = false;
            l10.uniform(4);
            return;
        }
        throw new SuperNotCalledException(P0.coral("Fragment ", this, " did not call through to super.onActivityCreated()"));
    }

    public void performAttach() {
        Iterator<ag> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().alpha();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.bravo(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.purple);
        if (this.mCalled) {
            L l10 = this.mFragmentManager;
            Iterator it2 = l10.quebec.iterator();
            while (it2.hasNext()) {
                ((O) it2.next()).alpha(l10, this);
            }
            L l11 = this.mChildFragmentManager;
            l11.cyan = false;
            l11.emerald = false;
            l11.ivory.foxtrot = false;
            l11.uniform(0);
            return;
        }
        throw new SuperNotCalledException(P0.coral("Fragment ", this, " did not call through to super.onAttach()"));
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.juliet(menuItem);
        }
        return false;
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.lime();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.alpha(new ac(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.foxtrot(androidx.lifecycle.aa.ON_CREATE);
            return;
        }
        throw new SuperNotCalledException(P0.coral("Fragment ", this, " did not call through to super.onCreate()"));
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z2 = true;
        }
        return this.mChildFragmentManager.kilo(menu, menuInflater) | z2;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.lime();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new e0(this, getViewModelStore(), new RunnableC0628x(0, this));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.bravo();
            if (L.gray(3)) {
                Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
            }
            androidx.lifecycle.T.juliet(this.mView, this.mViewLifecycleOwner);
            androidx.lifecycle.T.kilo(this.mView, this.mViewLifecycleOwner);
            AbstractC2609a7.delta(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
            return;
        }
        if (this.mViewLifecycleOwner.teal == null) {
            this.mViewLifecycleOwner = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public void performDestroy() {
        this.mChildFragmentManager.lima();
        this.mLifecycleRegistry.foxtrot(androidx.lifecycle.aa.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
        } else {
            throw new SuperNotCalledException(P0.coral("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.uniform(1);
        if (this.mView != null) {
            e0 e0Var = this.mViewLifecycleOwner;
            e0Var.bravo();
            if (e0Var.teal.delta.compareTo(androidx.lifecycle.ab.red) >= 0) {
                this.mViewLifecycleOwner.alpha(androidx.lifecycle.aa.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            androidx.loader.app.a.alpha(this).charlie();
            this.mPerformedCreateView = false;
            return;
        }
        throw new SuperNotCalledException(P0.coral("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            L l10 = this.mChildFragmentManager;
            if (!l10.fuchsia) {
                l10.lima();
                this.mChildFragmentManager = new L();
                return;
            }
            return;
        }
        throw new SuperNotCalledException(P0.coral("Fragment ", this, " did not call through to super.onDetach()"));
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z2) {
        onMultiWindowModeChanged(z2);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.papa(menuItem);
        }
        return false;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.quebec(menu);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.uniform(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.alpha(androidx.lifecycle.aa.ON_PAUSE);
        }
        this.mLifecycleRegistry.foxtrot(androidx.lifecycle.aa.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
        } else {
            throw new SuperNotCalledException(P0.coral("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z2) {
        onPictureInPictureModeChanged(z2);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z2 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z2 = true;
        }
        return this.mChildFragmentManager.tango(menu) | z2;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean ivory = L.ivory(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool != null && bool.booleanValue() == ivory) {
            return;
        }
        this.mIsPrimaryNavigationFragment = Boolean.valueOf(ivory);
        onPrimaryNavigationFragmentChanged(ivory);
        L l10 = this.mChildFragmentManager;
        l10.yellow();
        l10.romeo(l10.amber);
    }

    public void performResume() {
        this.mChildFragmentManager.lime();
        this.mChildFragmentManager.zulu(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            androidx.lifecycle.an anVar = this.mLifecycleRegistry;
            androidx.lifecycle.aa aaVar = androidx.lifecycle.aa.ON_RESUME;
            anVar.foxtrot(aaVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.teal.foxtrot(aaVar);
            }
            L l10 = this.mChildFragmentManager;
            l10.cyan = false;
            l10.emerald = false;
            l10.ivory.foxtrot = false;
            l10.uniform(7);
            return;
        }
        throw new SuperNotCalledException(P0.coral("Fragment ", this, " did not call through to super.onResume()"));
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.lime();
        this.mChildFragmentManager.zulu(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            androidx.lifecycle.an anVar = this.mLifecycleRegistry;
            androidx.lifecycle.aa aaVar = androidx.lifecycle.aa.ON_START;
            anVar.foxtrot(aaVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.teal.foxtrot(aaVar);
            }
            L l10 = this.mChildFragmentManager;
            l10.cyan = false;
            l10.emerald = false;
            l10.ivory.foxtrot = false;
            l10.uniform(5);
            return;
        }
        throw new SuperNotCalledException(P0.coral("Fragment ", this, " did not call through to super.onStart()"));
    }

    public void performStop() {
        L l10 = this.mChildFragmentManager;
        l10.emerald = true;
        l10.ivory.foxtrot = true;
        l10.uniform(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.alpha(androidx.lifecycle.aa.ON_STOP);
        }
        this.mLifecycleRegistry.foxtrot(androidx.lifecycle.aa.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
        } else {
            throw new SuperNotCalledException(P0.coral("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        onViewCreated(this.mView, bundle);
        this.mChildFragmentManager.uniform(2);
    }

    public void postponeEnterTransition() {
        echo().sierra = true;
    }

    public final <I, O> ah.b registerForActivityResult(ai.b bVar, ah.a aVar) {
        return india(bVar, new ad(0, this), aVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] permissions, int i4) {
        if (this.mHost != null) {
            L parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.bronze != null) {
                parentFragmentManager.coral.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i4));
                parentFragmentManager.bronze.alpha(permissions);
                return;
            } else {
                parentFragmentManager.xray.getClass();
                Intrinsics.echo(permissions, "permissions");
                return;
            }
        }
        throw new IllegalStateException(P0.coral("Fragment ", this, " not attached to Activity"));
    }

    public final an requireActivity() {
        an activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(P0.coral("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(P0.coral("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(P0.coral("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final L requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(P0.coral("Fragment ", this, " not attached to a host."));
    }

    public final ai requireParentFragment() {
        ai parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException(P0.coral("Fragment ", this, " is not attached to any Fragment or host"));
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
        }
        return parentFragment;
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(P0.coral("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.mChildFragmentManager.orange(bundle);
            L l10 = this.mChildFragmentManager;
            l10.cyan = false;
            l10.emerald = false;
            l10.ivory.foxtrot = false;
            l10.uniform(1);
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.alpha(androidx.lifecycle.aa.ON_CREATE);
                return;
            }
            return;
        }
        throw new SuperNotCalledException(P0.coral("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    public void setAllowEnterTransitionOverlap(boolean z2) {
        echo().papa = Boolean.valueOf(z2);
    }

    public void setAllowReturnTransitionOverlap(boolean z2) {
        echo().oscar = Boolean.valueOf(z2);
    }

    public void setAnimations(int i4, int i5, int i10, int i11) {
        if (this.mAnimationInfo == null && i4 == 0 && i5 == 0 && i10 == 0 && i11 == 0) {
            return;
        }
        echo().bravo = i4;
        echo().charlie = i5;
        echo().delta = i10;
        echo().echo = i11;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(f1.ag agVar) {
        echo().getClass();
    }

    public void setEnterTransition(Object obj) {
        echo().india = obj;
    }

    public void setExitSharedElementCallback(f1.ag agVar) {
        echo().getClass();
    }

    public void setExitTransition(Object obj) {
        echo().kilo = obj;
    }

    public void setFocusedView(View view) {
        echo().romeo = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z2) {
        if (this.mHasMenu != z2) {
            this.mHasMenu = z2;
            if (isAdded() && !isHidden()) {
                ((am) this.mHost).teal.invalidateMenu();
            }
        }
    }

    public void setInitialSavedState(Fragment$SavedState fragment$SavedState) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (fragment$SavedState == null || (bundle = fragment$SavedState.alpha) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z2) {
        if (this.mMenuVisible != z2) {
            this.mMenuVisible = z2;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((am) this.mHost).teal.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i4) {
        if (this.mAnimationInfo == null && i4 == 0) {
            return;
        }
        echo();
        this.mAnimationInfo.foxtrot = i4;
    }

    public void setPopDirection(boolean z2) {
        if (this.mAnimationInfo == null) {
            return;
        }
        echo().alpha = z2;
    }

    public void setPostOnViewCreatedAlpha(float f5) {
        echo().quebec = f5;
    }

    public void setReenterTransition(Object obj) {
        echo().lima = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z2) {
        O1.b bVar = O1.c.alpha;
        O1.c.bravo(new SetRetainInstanceUsageViolation(this));
        O1.c.alpha(this).getClass();
        this.mRetainInstance = z2;
        L l10 = this.mFragmentManager;
        if (l10 != null) {
            if (z2) {
                l10.ivory.alpha(this);
                return;
            } else {
                l10.ivory.echo(this);
                return;
            }
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    public void setReturnTransition(Object obj) {
        echo().juliet = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        echo().mike = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        echo();
        af afVar = this.mAnimationInfo;
        afVar.golf = arrayList;
        afVar.hotel = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        echo().november = obj;
    }

    @Deprecated
    public void setTargetFragment(ai aiVar, int i4) {
        L l10;
        if (aiVar != null) {
            O1.b bVar = O1.c.alpha;
            O1.c.bravo(new SetTargetFragmentUsageViolation(this, aiVar, i4));
            O1.c.alpha(this).getClass();
        }
        L l11 = this.mFragmentManager;
        if (aiVar != null) {
            l10 = aiVar.mFragmentManager;
        } else {
            l10 = null;
        }
        if (l11 != null && l10 != null && l11 != l10) {
            throw new IllegalArgumentException(P0.coral("Fragment ", aiVar, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (ai aiVar2 = aiVar; aiVar2 != null; aiVar2 = aiVar2.golf(false)) {
            if (aiVar2.equals(this)) {
                throw new IllegalArgumentException("Setting " + aiVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (aiVar == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager != null && aiVar.mFragmentManager != null) {
            this.mTargetWho = aiVar.mWho;
            this.mTarget = null;
        } else {
            this.mTargetWho = null;
            this.mTarget = aiVar;
        }
        this.mTargetRequestCode = i4;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z2) {
        O1.b bVar = O1.c.alpha;
        O1.c.bravo(new SetUserVisibleHintViolation(this, z2));
        O1.c.alpha(this).getClass();
        boolean z10 = false;
        if (!this.mUserVisibleHint && z2 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            L l10 = this.mFragmentManager;
            S golf = l10.golf(this);
            ai aiVar = golf.charlie;
            if (aiVar.mDeferStart) {
                if (l10.bravo) {
                    l10.gold = true;
                } else {
                    aiVar.mDeferStart = false;
                    golf.kilo();
                }
            }
        }
        this.mUserVisibleHint = z2;
        if (this.mState < 5 && !z2) {
            z10 = true;
        }
        this.mDeferStart = z10;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z2);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        as asVar = this.mHost;
        if (asVar != null) {
            return AbstractC1683c.foxtrot(((am) asVar).teal, str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i4) {
        startActivityForResult(intent, i4, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intent, int i4, Intent intent2, int i5, int i10, int i11, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost != null) {
            if (L.gray(2)) {
                Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i4 + " IntentSender: " + intent + " fillInIntent: " + intent2 + " options: " + bundle);
            }
            L parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.blue != null) {
                if (bundle != null) {
                    if (intent2 == null) {
                        intent2 = new Intent();
                        intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    }
                    if (L.gray(2)) {
                        Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
                    }
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                Intrinsics.echo(intent, "intentSender");
                IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intent, intent2, i5, i10);
                parentFragmentManager.coral.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i4));
                if (L.gray(2)) {
                    Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
                }
                parentFragmentManager.blue.alpha(intentSenderRequest);
                return;
            }
            as asVar = parentFragmentManager.xray;
            asVar.getClass();
            Intrinsics.echo(intent, "intent");
            if (i4 == -1) {
                an anVar = asVar.alpha;
                if (anVar != null) {
                    anVar.startIntentSenderForResult(intent, i4, intent2, i5, i10, i11, bundle);
                    return;
                }
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(P0.coral("Fragment ", this, " not attached to Activity"));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && echo().sierra) {
            if (this.mHost == null) {
                echo().sierra = false;
            } else if (Looper.myLooper() != this.mHost.red.getLooper()) {
                this.mHost.red.postAtFrontOfQueue(new RunnableC0630z(this, 1));
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static ai instantiate(Context context, String str, Bundle bundle) {
        try {
            ai aiVar = (ai) A.charlie(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return aiVar;
            }
            bundle.setClassLoader(aiVar.getClass().getClassLoader());
            aiVar.setArguments(bundle);
            return aiVar;
        } catch (IllegalAccessException e) {
            throw new Fragment$InstantiationException(ao.ad.gray("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e4) {
            throw new Fragment$InstantiationException(ao.ad.gray("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (NoSuchMethodException e5) {
            throw new Fragment$InstantiationException(ao.ad.gray("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e5);
        } catch (InvocationTargetException e10) {
            throw new Fragment$InstantiationException(ao.ad.gray("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e10);
        }
    }

    public final String getString(int i4, Object... objArr) {
        return getResources().getString(i4, objArr);
    }

    public final void postponeEnterTransition(long j5, TimeUnit timeUnit) {
        echo().sierra = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        L l10 = this.mFragmentManager;
        if (l10 != null) {
            this.mPostponedHandler = l10.xray.red;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j5));
    }

    public final <I, O> ah.b registerForActivityResult(ai.b bVar, ah.h hVar, ah.a aVar) {
        return india(bVar, new ad(1, hVar), aVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        as asVar = this.mHost;
        if (asVar != null) {
            Intrinsics.echo(intent, "intent");
            asVar.purple.startActivity(intent, bundle);
            return;
        }
        throw new IllegalStateException(P0.coral("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i4, Bundle bundle) {
        if (this.mHost != null) {
            L parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.black != null) {
                parentFragmentManager.coral.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i4));
                if (bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                parentFragmentManager.black.alpha(intent);
                return;
            }
            as asVar = parentFragmentManager.xray;
            asVar.getClass();
            Intrinsics.echo(intent, "intent");
            if (i4 == -1) {
                asVar.purple.startActivity(intent, bundle);
                return;
            }
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(P0.coral("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        as asVar = this.mHost;
        if (asVar != null) {
            an anVar = ((am) asVar).teal;
            LayoutInflater cloneInContext = anVar.getLayoutInflater().cloneInContext(anVar);
            cloneInContext.setFactory2(this.mChildFragmentManager.foxtrot);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }
}
