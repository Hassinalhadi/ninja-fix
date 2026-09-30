package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public abstract class P extends androidx.viewpager.widget.a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private boolean mExecutingFinishUpdate;
    private final L mFragmentManager;
    private V mCurTransaction = null;
    private ai mCurrentPrimaryItem = null;
    private final int mBehavior = 1;

    public P(L l10) {
        this.mFragmentManager = l10;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
        ai aiVar = (ai) obj;
        if (this.mCurTransaction == null) {
            L l10 = this.mFragmentManager;
            l10.getClass();
            this.mCurTransaction = new C0606a(l10);
        }
        C0606a c0606a = (C0606a) this.mCurTransaction;
        c0606a.getClass();
        L l11 = aiVar.mFragmentManager;
        if (l11 != null && l11 != c0606a.romeo) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + aiVar.toString() + " is already attached to a FragmentManager.");
        }
        c0606a.bravo(new U(aiVar, 6));
        if (aiVar.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void finishUpdate(ViewGroup viewGroup) {
        V v4 = this.mCurTransaction;
        if (v4 != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    C0606a c0606a = (C0606a) v4;
                    if (!c0606a.golf) {
                        c0606a.hotel = false;
                        c0606a.romeo.amber(c0606a, true);
                    } else {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                } finally {
                    this.mExecutingFinishUpdate = false;
                }
            }
            this.mCurTransaction = null;
        }
    }

    public abstract ai getItem(int i4);

    public long getItemId(int i4) {
        return i4;
    }

    @Override // androidx.viewpager.widget.a
    public Object instantiateItem(ViewGroup viewGroup, int i4) {
        if (this.mCurTransaction == null) {
            L l10 = this.mFragmentManager;
            l10.getClass();
            this.mCurTransaction = new C0606a(l10);
        }
        long itemId = getItemId(i4);
        ai blue = this.mFragmentManager.blue("android:switcher:" + viewGroup.getId() + ":" + itemId);
        if (blue != null) {
            V v4 = this.mCurTransaction;
            v4.getClass();
            v4.bravo(new U(blue, 7));
        } else {
            blue = getItem(i4);
            this.mCurTransaction.delta(viewGroup.getId(), blue, "android:switcher:" + viewGroup.getId() + ":" + itemId, 1);
        }
        if (blue != this.mCurrentPrimaryItem) {
            blue.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.foxtrot(blue, androidx.lifecycle.ab.silver);
                return blue;
            }
            blue.setUserVisibleHint(false);
        }
        return blue;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(View view, Object obj) {
        if (((ai) obj).getView() == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable saveState() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public void setPrimaryItem(ViewGroup viewGroup, int i4, Object obj) {
        ai aiVar = (ai) obj;
        ai aiVar2 = this.mCurrentPrimaryItem;
        if (aiVar != aiVar2) {
            if (aiVar2 != null) {
                aiVar2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        L l10 = this.mFragmentManager;
                        l10.getClass();
                        this.mCurTransaction = new C0606a(l10);
                    }
                    this.mCurTransaction.foxtrot(this.mCurrentPrimaryItem, androidx.lifecycle.ab.silver);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            aiVar.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    L l11 = this.mFragmentManager;
                    l11.getClass();
                    this.mCurTransaction = new C0606a(l11);
                }
                this.mCurTransaction.foxtrot(aiVar, androidx.lifecycle.ab.teal);
            } else {
                aiVar.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = aiVar;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
