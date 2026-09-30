package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.P0;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import com.checkout.components.redirecthandler.RedirectEventValues;
import delivery.samurai.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class S {
    public final ao alpha;
    public final T bravo;
    public final ai charlie;
    public boolean delta = false;
    public int echo = -1;

    public S(ao aoVar, T t5, ai aiVar) {
        this.alpha = aoVar;
        this.bravo = t5;
        this.charlie = aiVar;
    }

    public final void alpha() {
        Bundle bundle;
        boolean gray = L.gray(3);
        ai aiVar = this.charlie;
        if (gray) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + aiVar);
        }
        Bundle bundle2 = aiVar.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        aiVar.performActivityCreated(bundle);
        this.alpha.alpha(aiVar, false);
    }

    public final void bravo() {
        View view;
        View view2;
        int i4 = -1;
        ai aiVar = this.charlie;
        ai bronze = L.bronze(aiVar.mContainer);
        ai parentFragment = aiVar.getParentFragment();
        if (bronze != null && !bronze.equals(parentFragment)) {
            int i5 = aiVar.mContainerId;
            O1.b bVar = O1.c.alpha;
            O1.c.bravo(new WrongNestedHierarchyViolation(aiVar, bronze, i5));
            O1.c.alpha(aiVar).getClass();
        }
        T t5 = this.bravo;
        t5.getClass();
        ViewGroup viewGroup = aiVar.mContainer;
        if (viewGroup != null) {
            ArrayList arrayList = t5.alpha;
            int indexOf = arrayList.indexOf(aiVar);
            int i10 = indexOf - 1;
            while (true) {
                if (i10 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        ai aiVar2 = (ai) arrayList.get(indexOf);
                        if (aiVar2.mContainer == viewGroup && (view = aiVar2.mView) != null) {
                            i4 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    ai aiVar3 = (ai) arrayList.get(i10);
                    if (aiVar3.mContainer == viewGroup && (view2 = aiVar3.mView) != null) {
                        i4 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i10--;
                }
            }
        }
        aiVar.mContainer.addView(aiVar.mView, i4);
    }

    public final void charlie() {
        boolean gray = L.gray(3);
        ai aiVar = this.charlie;
        if (gray) {
            Log.d("FragmentManager", "moveto ATTACHED: " + aiVar);
        }
        ai aiVar2 = aiVar.mTarget;
        S s3 = null;
        T t5 = this.bravo;
        if (aiVar2 != null) {
            S s9 = (S) t5.bravo.get(aiVar2.mWho);
            if (s9 != null) {
                aiVar.mTargetWho = aiVar.mTarget.mWho;
                aiVar.mTarget = null;
                s3 = s9;
            } else {
                throw new IllegalStateException("Fragment " + aiVar + " declared target fragment " + aiVar.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = aiVar.mTargetWho;
            if (str != null && (s3 = (S) t5.bravo.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(aiVar);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(P0.gold(sb2, aiVar.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (s3 != null) {
            s3.kilo();
        }
        L l10 = aiVar.mFragmentManager;
        aiVar.mHost = l10.xray;
        aiVar.mParentFragment = l10.zulu;
        ao aoVar = this.alpha;
        aoVar.golf(aiVar, false);
        aiVar.performAttach();
        aoVar.bravo(aiVar, false);
    }

    public final int delta() {
        int i4;
        int i5;
        ai aiVar = this.charlie;
        if (aiVar.mFragmentManager == null) {
            return aiVar.mState;
        }
        int i10 = this.echo;
        int ordinal = aiVar.mMaxState.ordinal();
        int i11 = 0;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i10 = Math.min(i10, -1);
                    }
                } else {
                    i10 = Math.min(i10, 5);
                }
            } else {
                i10 = Math.min(i10, 1);
            }
        } else {
            i10 = Math.min(i10, 0);
        }
        if (aiVar.mFromLayout) {
            if (aiVar.mInLayout) {
                i10 = Math.max(this.echo, 2);
                View view = aiVar.mView;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.echo < 4 ? Math.min(i10, aiVar.mState) : Math.min(i10, 1);
            }
        }
        if (aiVar.mInDynamicContainer && aiVar.mContainer == null) {
            i10 = Math.min(i10, 4);
        }
        if (!aiVar.mAdded) {
            i10 = Math.min(i10, 1);
        }
        ViewGroup viewGroup = aiVar.mContainer;
        if (viewGroup != null) {
            C0622q juliet = C0622q.juliet(viewGroup, aiVar.getParentFragmentManager());
            juliet.getClass();
            i0 golf = juliet.golf(aiVar);
            if (golf != null) {
                i4 = golf.bravo;
            } else {
                i4 = 0;
            }
            i0 hotel = juliet.hotel(aiVar);
            if (hotel != null) {
                i11 = hotel.bravo;
            }
            if (i4 == 0) {
                i5 = -1;
            } else {
                i5 = j0.$EnumSwitchMapping$0[av.q.mike(i4)];
            }
            if (i5 != -1 && i5 != 1) {
                i11 = i4;
            }
        }
        if (i11 == 2) {
            i10 = Math.min(i10, 6);
        } else if (i11 == 3) {
            i10 = Math.max(i10, 3);
        } else if (aiVar.mRemoving) {
            if (aiVar.isInBackStack()) {
                i10 = Math.min(i10, 1);
            } else {
                i10 = Math.min(i10, -1);
            }
        }
        if (aiVar.mDeferStart && aiVar.mState < 5) {
            i10 = Math.min(i10, 4);
        }
        if (aiVar.mTransitioning) {
            i10 = Math.max(i10, 3);
        }
        if (L.gray(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + aiVar);
        }
        return i10;
    }

    public final void echo() {
        Bundle bundle;
        boolean gray = L.gray(3);
        ai aiVar = this.charlie;
        if (gray) {
            Log.d("FragmentManager", "moveto CREATED: " + aiVar);
        }
        Bundle bundle2 = aiVar.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        if (!aiVar.mIsCreated) {
            ao aoVar = this.alpha;
            aoVar.hotel(aiVar, false);
            aiVar.performCreate(bundle);
            aoVar.charlie(aiVar, false);
            return;
        }
        aiVar.mState = 1;
        aiVar.restoreChildFragmentState();
    }

    public final void foxtrot() {
        Bundle bundle;
        String str;
        ai aiVar = this.charlie;
        if (aiVar.mFromLayout) {
            return;
        }
        if (L.gray(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + aiVar);
        }
        Bundle bundle2 = aiVar.mSavedFragmentState;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater performGetLayoutInflater = aiVar.performGetLayoutInflater(bundle);
        ViewGroup viewGroup2 = aiVar.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i4 = aiVar.mContainerId;
            if (i4 != 0) {
                if (i4 != -1) {
                    viewGroup = (ViewGroup) aiVar.mFragmentManager.yankee.bravo(i4);
                    if (viewGroup == null) {
                        if (!aiVar.mRestored && !aiVar.mInDynamicContainer) {
                            try {
                                str = aiVar.getResources().getResourceName(aiVar.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(aiVar.mContainerId) + " (" + str + ") for fragment " + aiVar);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        O1.b bVar = O1.c.alpha;
                        O1.c.bravo(new WrongFragmentContainerViolation(aiVar, viewGroup));
                        O1.c.alpha(aiVar).getClass();
                    }
                } else {
                    throw new IllegalArgumentException(P0.coral("Cannot create fragment ", aiVar, " for a container view with no id"));
                }
            }
        }
        aiVar.mContainer = viewGroup;
        aiVar.performCreateView(performGetLayoutInflater, viewGroup, bundle);
        if (aiVar.mView != null) {
            if (L.gray(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + aiVar);
            }
            aiVar.mView.setSaveFromParentEnabled(false);
            aiVar.mView.setTag(R.id.fragment_container_view_tag, aiVar);
            if (viewGroup != null) {
                bravo();
            }
            if (aiVar.mHidden) {
                aiVar.mView.setVisibility(8);
            }
            if (aiVar.mView.isAttachedToWindow()) {
                View view = aiVar.mView;
                WeakHashMap weakHashMap = s1.au.alpha;
                s1.aj.charlie(view);
            } else {
                View view2 = aiVar.mView;
                view2.addOnAttachStateChangeListener(new Q(view2));
            }
            aiVar.performViewCreated();
            this.alpha.mike(aiVar, aiVar.mView, false);
            int visibility = aiVar.mView.getVisibility();
            aiVar.setPostOnViewCreatedAlpha(aiVar.mView.getAlpha());
            if (aiVar.mContainer != null && visibility == 0) {
                View findFocus = aiVar.mView.findFocus();
                if (findFocus != null) {
                    aiVar.setFocusedView(findFocus);
                    if (L.gray(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + aiVar);
                    }
                }
                aiVar.mView.setAlpha(0.0f);
            }
        }
        aiVar.mState = 2;
    }

    public final void golf() {
        boolean z2;
        boolean z10;
        ai bravo;
        boolean gray = L.gray(3);
        ai aiVar = this.charlie;
        if (gray) {
            Log.d("FragmentManager", "movefrom CREATED: " + aiVar);
        }
        boolean z11 = true;
        if (aiVar.mRemoving && !aiVar.isInBackStack()) {
            z2 = true;
        } else {
            z2 = false;
        }
        T t5 = this.bravo;
        if (z2 && !aiVar.mBeingSaved) {
            t5.india(null, aiVar.mWho);
        }
        if (!z2) {
            FragmentManagerViewModel fragmentManagerViewModel = t5.delta;
            if (fragmentManagerViewModel.alpha.containsKey(aiVar.mWho) && fragmentManagerViewModel.delta) {
                z10 = fragmentManagerViewModel.echo;
            } else {
                z10 = true;
            }
            if (!z10) {
                String str = aiVar.mTargetWho;
                if (str != null && (bravo = t5.bravo(str)) != null && bravo.mRetainInstance) {
                    aiVar.mTarget = bravo;
                }
                aiVar.mState = 0;
                return;
            }
        }
        as asVar = aiVar.mHost;
        if (asVar instanceof androidx.lifecycle.d0) {
            z11 = t5.delta.echo;
        } else {
            an anVar = asVar.purple;
            if (av.q.kilo(anVar)) {
                z11 = true ^ anVar.isChangingConfigurations();
            }
        }
        if ((z2 && !aiVar.mBeingSaved) || z11) {
            t5.delta.bravo(aiVar, false);
        }
        aiVar.performDestroy();
        this.alpha.delta(aiVar, false);
        Iterator it = t5.delta().iterator();
        while (it.hasNext()) {
            S s3 = (S) it.next();
            if (s3 != null) {
                String str2 = aiVar.mWho;
                ai aiVar2 = s3.charlie;
                if (str2.equals(aiVar2.mTargetWho)) {
                    aiVar2.mTarget = aiVar;
                    aiVar2.mTargetWho = null;
                }
            }
        }
        String str3 = aiVar.mTargetWho;
        if (str3 != null) {
            aiVar.mTarget = t5.bravo(str3);
        }
        t5.hotel(this);
    }

    public final void hotel() {
        View view;
        boolean gray = L.gray(3);
        ai aiVar = this.charlie;
        if (gray) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + aiVar);
        }
        ViewGroup viewGroup = aiVar.mContainer;
        if (viewGroup != null && (view = aiVar.mView) != null) {
            viewGroup.removeView(view);
        }
        aiVar.performDestroyView();
        this.alpha.november(aiVar, false);
        aiVar.mContainer = null;
        aiVar.mView = null;
        aiVar.mViewLifecycleOwner = null;
        aiVar.mViewLifecycleOwnerLiveData.setValue(null);
        aiVar.mInLayout = false;
    }

    public final void india() {
        boolean z2;
        boolean gray = L.gray(3);
        ai aiVar = this.charlie;
        if (gray) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + aiVar);
        }
        aiVar.performDetach();
        this.alpha.echo(aiVar, false);
        aiVar.mState = -1;
        aiVar.mHost = null;
        aiVar.mParentFragment = null;
        aiVar.mFragmentManager = null;
        if (!aiVar.mRemoving || aiVar.isInBackStack()) {
            FragmentManagerViewModel fragmentManagerViewModel = this.bravo.delta;
            if (fragmentManagerViewModel.alpha.containsKey(aiVar.mWho) && fragmentManagerViewModel.delta) {
                z2 = fragmentManagerViewModel.echo;
            } else {
                z2 = true;
            }
            if (!z2) {
                return;
            }
        }
        if (L.gray(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + aiVar);
        }
        aiVar.initState();
    }

    public final void juliet() {
        Bundle bundle;
        ai aiVar = this.charlie;
        if (aiVar.mFromLayout && aiVar.mInLayout && !aiVar.mPerformedCreateView) {
            if (L.gray(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + aiVar);
            }
            Bundle bundle2 = aiVar.mSavedFragmentState;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            aiVar.performCreateView(aiVar.performGetLayoutInflater(bundle), null, bundle);
            View view = aiVar.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                aiVar.mView.setTag(R.id.fragment_container_view_tag, aiVar);
                if (aiVar.mHidden) {
                    aiVar.mView.setVisibility(8);
                }
                aiVar.performViewCreated();
                this.alpha.mike(aiVar, aiVar.mView, false);
                aiVar.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b4, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void kilo() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z2 = this.delta;
        ai aiVar = this.charlie;
        if (z2) {
            if (L.gray(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + aiVar);
                return;
            }
            return;
        }
        try {
            this.delta = true;
            boolean z10 = false;
            while (true) {
                int delta = delta();
                int i4 = aiVar.mState;
                int i5 = 3;
                T t5 = this.bravo;
                if (delta != i4) {
                    ao aoVar = this.alpha;
                    if (delta > i4) {
                        switch (i4 + 1) {
                            case 0:
                                charlie();
                                break;
                            case 1:
                                echo();
                                break;
                            case 2:
                                juliet();
                                foxtrot();
                                break;
                            case 3:
                                alpha();
                                break;
                            case 4:
                                if (aiVar.mView != null && (viewGroup3 = aiVar.mContainer) != null) {
                                    C0622q juliet = C0622q.juliet(viewGroup3, aiVar.getParentFragmentManager());
                                    int visibility = aiVar.mView.getVisibility();
                                    if (visibility != 0) {
                                        if (visibility != 4) {
                                            if (visibility != 8) {
                                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                                            }
                                        } else {
                                            i5 = 4;
                                        }
                                    } else {
                                        i5 = 2;
                                    }
                                    juliet.getClass();
                                    com.google.android.material.datepicker.j.papa(i5, "finalState");
                                    if (L.gray(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + aiVar);
                                    }
                                    juliet.delta(i5, 2, this);
                                }
                                aiVar.mState = 4;
                                break;
                            case 5:
                                if (L.gray(3)) {
                                    Log.d("FragmentManager", "moveto STARTED: " + aiVar);
                                }
                                aiVar.performStart();
                                aoVar.kilo(aiVar, false);
                                break;
                            case 6:
                                aiVar.mState = 6;
                                break;
                            case 7:
                                mike();
                                break;
                        }
                    } else {
                        switch (i4 - 1) {
                            case -1:
                                india();
                                break;
                            case 0:
                                if (aiVar.mBeingSaved) {
                                    if (((Bundle) t5.charlie.get(aiVar.mWho)) == null) {
                                        t5.india(november(), aiVar.mWho);
                                    }
                                }
                                golf();
                                break;
                            case 1:
                                hotel();
                                aiVar.mState = 1;
                                break;
                            case 2:
                                aiVar.mInLayout = false;
                                aiVar.mState = 2;
                                break;
                            case 3:
                                if (L.gray(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + aiVar);
                                }
                                if (aiVar.mBeingSaved) {
                                    t5.india(november(), aiVar.mWho);
                                } else if (aiVar.mView != null && aiVar.mSavedViewState == null) {
                                    oscar();
                                }
                                if (aiVar.mView != null && (viewGroup2 = aiVar.mContainer) != null) {
                                    C0622q juliet2 = C0622q.juliet(viewGroup2, aiVar.getParentFragmentManager());
                                    juliet2.getClass();
                                    if (L.gray(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + aiVar);
                                    }
                                    juliet2.delta(1, 3, this);
                                }
                                aiVar.mState = 3;
                                break;
                            case 4:
                                if (L.gray(3)) {
                                    Log.d("FragmentManager", "movefrom STARTED: " + aiVar);
                                }
                                aiVar.performStop();
                                aoVar.lima(aiVar, false);
                                break;
                            case 5:
                                aiVar.mState = 5;
                                break;
                            case 6:
                                if (L.gray(3)) {
                                    Log.d("FragmentManager", "movefrom RESUMED: " + aiVar);
                                }
                                aiVar.performPause();
                                aoVar.foxtrot(aiVar, false);
                                break;
                        }
                    }
                    z10 = true;
                } else {
                    if (!z10 && i4 == -1 && aiVar.mRemoving && !aiVar.isInBackStack() && !aiVar.mBeingSaved) {
                        if (L.gray(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + aiVar);
                        }
                        t5.delta.bravo(aiVar, true);
                        t5.hotel(this);
                        if (L.gray(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + aiVar);
                        }
                        aiVar.initState();
                    }
                    if (aiVar.mHiddenChanged) {
                        if (aiVar.mView != null && (viewGroup = aiVar.mContainer) != null) {
                            C0622q juliet3 = C0622q.juliet(viewGroup, aiVar.getParentFragmentManager());
                            if (aiVar.mHidden) {
                                juliet3.getClass();
                                if (L.gray(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + aiVar);
                                }
                                juliet3.delta(3, 1, this);
                            } else {
                                juliet3.getClass();
                                if (L.gray(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + aiVar);
                                }
                                juliet3.delta(2, 1, this);
                            }
                        }
                        L l10 = aiVar.mFragmentManager;
                        if (l10 != null && aiVar.mAdded && L.green(aiVar)) {
                            l10.crimson = true;
                        }
                        aiVar.mHiddenChanged = false;
                        aiVar.onHiddenChanged(aiVar.mHidden);
                        aiVar.mChildFragmentManager.oscar();
                    }
                    this.delta = false;
                    return;
                }
            }
        } catch (Throwable th) {
            this.delta = false;
            throw th;
        }
    }

    public final void lima(ClassLoader classLoader) {
        ai aiVar = this.charlie;
        Bundle bundle = aiVar.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (aiVar.mSavedFragmentState.getBundle("savedInstanceState") == null) {
                aiVar.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
            }
            try {
                aiVar.mSavedViewState = aiVar.mSavedFragmentState.getSparseParcelableArray("viewState");
                aiVar.mSavedViewRegistryState = aiVar.mSavedFragmentState.getBundle("viewRegistryState");
                FragmentState fragmentState = (FragmentState) aiVar.mSavedFragmentState.getParcelable("state");
                if (fragmentState != null) {
                    aiVar.mTargetWho = fragmentState.f3117f;
                    aiVar.mTargetRequestCode = fragmentState.f3118g;
                    Boolean bool = aiVar.mSavedUserVisibleHint;
                    if (bool != null) {
                        aiVar.mUserVisibleHint = bool.booleanValue();
                        aiVar.mSavedUserVisibleHint = null;
                    } else {
                        aiVar.mUserVisibleHint = fragmentState.f3119h;
                    }
                }
                if (!aiVar.mUserVisibleHint) {
                    aiVar.mDeferStart = true;
                }
            } catch (BadParcelableException e) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + aiVar, e);
            }
        }
    }

    public final void mike() {
        String str;
        boolean gray = L.gray(3);
        ai aiVar = this.charlie;
        if (gray) {
            Log.d("FragmentManager", "moveto RESUMED: " + aiVar);
        }
        View focusedView = aiVar.getFocusedView();
        if (focusedView != null) {
            if (focusedView != aiVar.mView) {
                for (ViewParent parent = focusedView.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != aiVar.mView) {
                    }
                }
            }
            boolean requestFocus = focusedView.requestFocus();
            if (L.gray(2)) {
                StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                if (requestFocus) {
                    str = RedirectEventValues.RESULT_SUCCEEDED;
                } else {
                    str = RedirectEventValues.RESULT_FAILED;
                }
                sb2.append(str);
                sb2.append(" on Fragment ");
                sb2.append(aiVar);
                sb2.append(" resulting in focused view ");
                sb2.append(aiVar.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        aiVar.setFocusedView(null);
        aiVar.performResume();
        this.alpha.india(aiVar, false);
        this.bravo.india(null, aiVar.mWho);
        aiVar.mSavedFragmentState = null;
        aiVar.mSavedViewState = null;
        aiVar.mSavedViewRegistryState = null;
    }

    public final Bundle november() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        ai aiVar = this.charlie;
        if (aiVar.mState == -1 && (bundle = aiVar.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(aiVar));
        if (aiVar.mState > 0) {
            Bundle bundle3 = new Bundle();
            aiVar.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.alpha.juliet(aiVar, bundle3, false);
            Bundle bundle4 = new Bundle();
            aiVar.mSavedStateRegistryController.charlie(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle peach = aiVar.mChildFragmentManager.peach();
            if (!peach.isEmpty()) {
                bundle2.putBundle("childFragmentManager", peach);
            }
            if (aiVar.mView != null) {
                oscar();
            }
            SparseArray<Parcelable> sparseArray = aiVar.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = aiVar.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = aiVar.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void oscar() {
        ai aiVar = this.charlie;
        if (aiVar.mView != null) {
            if (L.gray(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + aiVar + " with view " + aiVar.mView);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            aiVar.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                aiVar.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            aiVar.mViewLifecycleOwner.white.charlie(bundle);
            if (!bundle.isEmpty()) {
                aiVar.mSavedViewRegistryState = bundle;
            }
        }
    }

    public S(ao aoVar, T t5, ClassLoader classLoader, A a6, Bundle bundle) {
        this.alpha = aoVar;
        this.bravo = t5;
        ai charlie = ((FragmentState) bundle.getParcelable("state")).charlie(a6);
        this.charlie = charlie;
        charlie.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        charlie.setArguments(bundle2);
        if (L.gray(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + charlie);
        }
    }

    public S(ao aoVar, T t5, ai aiVar, Bundle bundle) {
        this.alpha = aoVar;
        this.bravo = t5;
        this.charlie = aiVar;
        aiVar.mSavedViewState = null;
        aiVar.mSavedViewRegistryState = null;
        aiVar.mBackStackNesting = 0;
        aiVar.mInLayout = false;
        aiVar.mAdded = false;
        ai aiVar2 = aiVar.mTarget;
        aiVar.mTargetWho = aiVar2 != null ? aiVar2.mWho : null;
        aiVar.mTarget = null;
        aiVar.mSavedFragmentState = bundle;
        aiVar.mArguments = bundle.getBundle("arguments");
    }
}
