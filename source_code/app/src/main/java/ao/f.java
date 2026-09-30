package ao;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AbstractC0470n0;
import androidx.appcompat.widget.AbstractC0472o0;
import androidx.appcompat.widget.C0466l0;
import androidx.appcompat.widget.C0476q0;
import androidx.appcompat.widget.P0;
import androidx.appcompat.widget.Z;
import androidx.appcompat.widget.af;
import delivery.samurai.android.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: g, reason: collision with root package name */
    public View f3189g;

    /* renamed from: h, reason: collision with root package name */
    public View f3190h;

    /* renamed from: i, reason: collision with root package name */
    public int f3191i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3192j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3193k;

    /* renamed from: l, reason: collision with root package name */
    public int f3194l;

    /* renamed from: m, reason: collision with root package name */
    public int f3195m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3197o;

    /* renamed from: p, reason: collision with root package name */
    public w f3198p;
    public final Context purple;

    /* renamed from: q, reason: collision with root package name */
    public ViewTreeObserver f3199q;

    /* renamed from: r, reason: collision with root package name */
    public u f3200r;
    public final int red;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3201s;
    public final int silver;
    public final boolean teal;
    public final Handler white;
    public final ArrayList yellow = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3184a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final c f3185b = new c(0, this);

    /* renamed from: c, reason: collision with root package name */
    public final B8.b f3186c = new B8.b(4, this);

    /* renamed from: d, reason: collision with root package name */
    public final androidx.core.widget.f f3187d = new androidx.core.widget.f(1, this);
    public int e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f3188f = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3196n = false;

    public f(Context context, View view, int i4, boolean z2) {
        this.purple = context;
        this.f3189g = view;
        this.silver = i4;
        this.teal = z2;
        this.f3191i = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.red = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.white = new Handler();
    }

    @Override // ao.ab
    public final boolean alpha() {
        ArrayList arrayList = this.f3184a;
        if (arrayList.size() <= 0 || !((e) arrayList.get(0)).alpha.f2900s.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // ao.x
    public final void bravo(l lVar, boolean z2) {
        int i4;
        ArrayList arrayList = this.f3184a;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 < size) {
                if (lVar == ((e) arrayList.get(i5)).bravo) {
                    break;
                } else {
                    i5++;
                }
            } else {
                i5 = -1;
                break;
            }
        }
        if (i5 >= 0) {
            int i10 = i5 + 1;
            if (i10 < arrayList.size()) {
                ((e) arrayList.get(i10)).bravo.charlie(false);
            }
            e eVar = (e) arrayList.remove(i5);
            eVar.bravo.romeo(this);
            boolean z10 = this.f3201s;
            C0476q0 c0476q0 = eVar.alpha;
            if (z10) {
                AbstractC0470n0.bravo(c0476q0.f2900s, null);
                c0476q0.f2900s.setAnimationStyle(0);
            }
            c0476q0.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.f3191i = ((e) arrayList.get(size2 - 1)).charlie;
            } else {
                if (this.f3189g.getLayoutDirection() == 1) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                this.f3191i = i4;
            }
            if (size2 == 0) {
                dismiss();
                w wVar = this.f3198p;
                if (wVar != null) {
                    wVar.bravo(lVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f3199q;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f3199q.removeGlobalOnLayoutListener(this.f3185b);
                    }
                    this.f3199q = null;
                }
                this.f3190h.removeOnAttachStateChangeListener(this.f3186c);
                this.f3200r.onDismiss();
                return;
            }
            if (z2) {
                ((e) arrayList.get(0)).bravo.charlie(false);
            }
        }
    }

    @Override // ao.x
    public final boolean delta() {
        return false;
    }

    @Override // ao.ab
    public final void dismiss() {
        ArrayList arrayList = this.f3184a;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i4 = size - 1; i4 >= 0; i4--) {
                e eVar = eVarArr[i4];
                if (eVar.alpha.f2900s.isShowing()) {
                    eVar.alpha.dismiss();
                }
            }
        }
    }

    @Override // ao.x
    public final void echo(w wVar) {
        this.f3198p = wVar;
    }

    @Override // ao.ab
    public final void golf() {
        boolean z2;
        if (!alpha()) {
            ArrayList arrayList = this.yellow;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                xray((l) it.next());
            }
            arrayList.clear();
            View view = this.f3189g;
            this.f3190h = view;
            if (view != null) {
                if (this.f3199q == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f3199q = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f3185b);
                }
                this.f3190h.addOnAttachStateChangeListener(this.f3186c);
            }
        }
    }

    @Override // ao.x
    public final void hotel(Parcelable parcelable) {
    }

    @Override // ao.x
    public final void india() {
        Iterator it = this.f3184a.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((e) it.next()).alpha.red.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((i) adapter).notifyDataSetChanged();
        }
    }

    @Override // ao.ab
    public final Z juliet() {
        ArrayList arrayList = this.f3184a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) P0.amber(1, arrayList)).alpha.red;
    }

    @Override // ao.x
    public final Parcelable lima() {
        return null;
    }

    @Override // ao.x
    public final boolean mike(ae aeVar) {
        Iterator it = this.f3184a.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (aeVar == eVar.bravo) {
                eVar.alpha.red.requestFocus();
                return true;
            }
        }
        if (aeVar.hasVisibleItems()) {
            november(aeVar);
            w wVar = this.f3198p;
            if (wVar != null) {
                wVar.echo(aeVar);
            }
            return true;
        }
        return false;
    }

    @Override // ao.t
    public final void november(l lVar) {
        lVar.bravo(this, this.purple);
        if (alpha()) {
            xray(lVar);
        } else {
            this.yellow.add(lVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.f3184a;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                eVar = (e) arrayList.get(i4);
                if (!eVar.alpha.f2900s.isShowing()) {
                    break;
                } else {
                    i4++;
                }
            } else {
                eVar = null;
                break;
            }
        }
        if (eVar != null) {
            eVar.bravo.charlie(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i4 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // ao.t
    public final void papa(View view) {
        if (this.f3189g != view) {
            this.f3189g = view;
            this.f3188f = Gravity.getAbsoluteGravity(this.e, view.getLayoutDirection());
        }
    }

    @Override // ao.t
    public final void quebec(boolean z2) {
        this.f3196n = z2;
    }

    @Override // ao.t
    public final void romeo(int i4) {
        if (this.e != i4) {
            this.e = i4;
            this.f3188f = Gravity.getAbsoluteGravity(i4, this.f3189g.getLayoutDirection());
        }
    }

    @Override // ao.t
    public final void sierra(int i4) {
        this.f3192j = true;
        this.f3194l = i4;
    }

    @Override // ao.t
    public final void tango(PopupWindow.OnDismissListener onDismissListener) {
        this.f3200r = (u) onDismissListener;
    }

    @Override // ao.t
    public final void uniform(boolean z2) {
        this.f3197o = z2;
    }

    @Override // ao.t
    public final void victor(int i4) {
        this.f3193k = true;
        this.f3195m = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015e  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.appcompat.widget.l0, androidx.appcompat.widget.q0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void xray(l lVar) {
        int i4;
        boolean z2;
        View view;
        e eVar;
        Rect rect;
        int i5;
        boolean z10;
        int i10;
        int i11;
        int i12;
        MenuItem menuItem;
        i iVar;
        int i13;
        int firstVisiblePosition;
        Context context = this.purple;
        ?? from = LayoutInflater.from(context);
        i iVar2 = new i(lVar, from, this.teal, R.layout.abc_cascading_menu_item_layout);
        int i14 = 1;
        if (!alpha() && this.f3196n) {
            iVar2.red = true;
        } else if (alpha()) {
            iVar2.red = t.whiskey(lVar);
        }
        int oscar = t.oscar(iVar2, context, this.red);
        ?? c0466l0 = new C0466l0(context, null, this.silver);
        af afVar = c0466l0.f2900s;
        c0466l0.f2923w = this.f3187d;
        c0466l0.f2890i = this;
        afVar.setOnDismissListener(this);
        c0466l0.f2889h = this.f3189g;
        c0466l0.e = this.f3188f;
        c0466l0.f2899r = true;
        afVar.setFocusable(true);
        afVar.setInputMethodMode(2);
        c0466l0.oscar(iVar2);
        c0466l0.romeo(oscar);
        c0466l0.e = this.f3188f;
        ArrayList arrayList = this.f3184a;
        if (arrayList.size() > 0) {
            eVar = (e) P0.amber(1, arrayList);
            l lVar2 = eVar.bravo;
            int size = lVar2.white.size();
            int i15 = 0;
            while (true) {
                if (i15 < size) {
                    menuItem = lVar2.getItem(i15);
                    if (menuItem.hasSubMenu() && lVar == menuItem.getSubMenu()) {
                        break;
                    } else {
                        i15++;
                    }
                } else {
                    menuItem = null;
                    break;
                }
            }
            if (menuItem == null) {
                i4 = 1;
                view = null;
                z2 = 0;
            } else {
                Z z11 = eVar.alpha.red;
                ListAdapter adapter = z11.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i13 = headerViewListAdapter.getHeadersCount();
                    iVar = (i) headerViewListAdapter.getWrappedAdapter();
                } else {
                    iVar = (i) adapter;
                    i13 = 0;
                }
                int count = iVar.getCount();
                int i16 = 0;
                z2 = 0;
                z2 = 0;
                while (true) {
                    i4 = i14;
                    if (i16 < count) {
                        if (menuItem == iVar.getItem(i16)) {
                            break;
                        }
                        i16++;
                        i14 = i4;
                    } else {
                        i16 = -1;
                        break;
                    }
                }
                if (i16 == -1 || (firstVisiblePosition = (i16 + i13) - z11.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= z11.getChildCount()) {
                    view = null;
                } else {
                    view = z11.getChildAt(firstVisiblePosition);
                }
            }
        } else {
            i4 = 1;
            z2 = 0;
            view = null;
            eVar = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = C0476q0.f2922x;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[i4];
                        objArr[z2] = Boolean.FALSE;
                        method.invoke(afVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                AbstractC0472o0.alpha(afVar, z2);
            }
            AbstractC0470n0.alpha(afVar, null);
            Z z12 = ((e) arrayList.get(arrayList.size() - 1)).alpha.red;
            int[] iArr = new int[2];
            z12.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.f3190h.getWindowVisibleDisplayFrame(rect2);
            if (this.f3191i == 1) {
                if (z12.getWidth() + iArr[0] + oscar > rect2.right) {
                    i5 = 0;
                    if (i5 != 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f3191i = i5;
                    if (Build.VERSION.SDK_INT < 26) {
                        c0466l0.f2889h = view;
                        i10 = 0;
                        i11 = 0;
                    } else {
                        int[] iArr2 = new int[2];
                        this.f3189g.getLocationOnScreen(iArr2);
                        int[] iArr3 = new int[2];
                        view.getLocationOnScreen(iArr3);
                        if ((this.f3188f & 7) == 5) {
                            iArr2[0] = this.f3189g.getWidth() + iArr2[0];
                            iArr3[0] = view.getWidth() + iArr3[0];
                        }
                        int i17 = iArr3[0] - iArr2[0];
                        i10 = iArr3[1] - iArr2[1];
                        i11 = i17;
                    }
                    if ((this.f3188f & 5) != 5) {
                        if (z10) {
                            i12 = i11 + oscar;
                        } else {
                            i12 = i11 - view.getWidth();
                        }
                    } else if (z10) {
                        i12 = i11 + view.getWidth();
                    } else {
                        i12 = i11 - oscar;
                    }
                    c0466l0.white = i12;
                    c0466l0.f2886d = true;
                    c0466l0.f2885c = true;
                    c0466l0.kilo(i10);
                }
                i5 = 1;
                if (i5 != 1) {
                }
                this.f3191i = i5;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.f3188f & 5) != 5) {
                }
                c0466l0.white = i12;
                c0466l0.f2886d = true;
                c0466l0.f2885c = true;
                c0466l0.kilo(i10);
            } else {
                if (iArr[0] - oscar >= 0) {
                    i5 = 0;
                    if (i5 != 1) {
                    }
                    this.f3191i = i5;
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    if ((this.f3188f & 5) != 5) {
                    }
                    c0466l0.white = i12;
                    c0466l0.f2886d = true;
                    c0466l0.f2885c = true;
                    c0466l0.kilo(i10);
                }
                i5 = 1;
                if (i5 != 1) {
                }
                this.f3191i = i5;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.f3188f & 5) != 5) {
                }
                c0466l0.white = i12;
                c0466l0.f2886d = true;
                c0466l0.f2885c = true;
                c0466l0.kilo(i10);
            }
        } else {
            if (this.f3192j) {
                c0466l0.white = this.f3194l;
            }
            if (this.f3193k) {
                c0466l0.kilo(this.f3195m);
            }
            Rect rect3 = this.alpha;
            if (rect3 != null) {
                rect = new Rect(rect3);
            } else {
                rect = null;
            }
            c0466l0.f2898q = rect;
        }
        arrayList.add(new e(c0466l0, lVar, this.f3191i));
        c0466l0.golf();
        Z z13 = c0466l0.red;
        z13.setOnKeyListener(this);
        if (eVar == null && this.f3197o && lVar.f3207f != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, z13, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(lVar.f3207f);
            z13.addHeaderView(frameLayout, null, false);
            c0466l0.golf();
        }
    }
}
