package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.C0455g;
import androidx.appcompat.widget.C0469n;
import androidx.appcompat.widget.C0488x;
import androidx.appcompat.widget.C0492z;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.N;
import androidx.appcompat.widget.P;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.av;
import androidx.appcompat.widget.e1;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.m1;
import bv.aw;
import f1.AbstractC1686f;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import s1.InterfaceC2577j;
import s1.au;
import s1.az;
import t6.AbstractC3047q3;
import t6.AbstractC3077x;

/* loaded from: classes3.dex */
public final class ab extends o implements ao.j, LayoutInflater.Factory2 {

    /* renamed from: a0, reason: collision with root package name */
    public static final aw f2702a0 = new aw(0);

    /* renamed from: b0, reason: collision with root package name */
    public static final int[] f2703b0 = {R.attr.windowBackground};

    /* renamed from: c0, reason: collision with root package name */
    public static final boolean f2704c0 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A;
    public boolean B;
    public boolean C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2705D;

    /* renamed from: E, reason: collision with root package name */
    public aa[] f2706E;

    /* renamed from: F, reason: collision with root package name */
    public aa f2707F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2708G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2709H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2710I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2711J;

    /* renamed from: K, reason: collision with root package name */
    public Configuration f2712K;

    /* renamed from: L, reason: collision with root package name */
    public final int f2713L;

    /* renamed from: M, reason: collision with root package name */
    public int f2714M;

    /* renamed from: N, reason: collision with root package name */
    public int f2715N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2716O;

    /* renamed from: P, reason: collision with root package name */
    public x f2717P;
    public x Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2718R;

    /* renamed from: S, reason: collision with root package name */
    public int f2719S;

    /* renamed from: U, reason: collision with root package name */
    public boolean f2721U;

    /* renamed from: V, reason: collision with root package name */
    public Rect f2722V;

    /* renamed from: W, reason: collision with root package name */
    public Rect f2723W;

    /* renamed from: X, reason: collision with root package name */
    public ag f2724X;

    /* renamed from: Y, reason: collision with root package name */
    public OnBackInvokedDispatcher f2725Y;

    /* renamed from: Z, reason: collision with root package name */
    public OnBackInvokedCallback f2726Z;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2727c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f2728d;
    public Window e;

    /* renamed from: f, reason: collision with root package name */
    public w f2729f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2730g;

    /* renamed from: h, reason: collision with root package name */
    public a f2731h;

    /* renamed from: i, reason: collision with root package name */
    public an.i f2732i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2733j;

    /* renamed from: k, reason: collision with root package name */
    public P f2734k;

    /* renamed from: l, reason: collision with root package name */
    public r f2735l;

    /* renamed from: m, reason: collision with root package name */
    public q f2736m;

    /* renamed from: n, reason: collision with root package name */
    public an.b f2737n;

    /* renamed from: o, reason: collision with root package name */
    public ActionBarContextView f2738o;

    /* renamed from: p, reason: collision with root package name */
    public PopupWindow f2739p;

    /* renamed from: q, reason: collision with root package name */
    public p f2740q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2742s;

    /* renamed from: t, reason: collision with root package name */
    public ViewGroup f2743t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f2744u;

    /* renamed from: v, reason: collision with root package name */
    public View f2745v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2746w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2747x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2748y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2749z;

    /* renamed from: r, reason: collision with root package name */
    public az f2741r = null;

    /* renamed from: T, reason: collision with root package name */
    public final p f2720T = new p(this, 0);

    public ab(Context context, Window window, j jVar, Object obj) {
        i iVar = null;
        this.f2713L = -100;
        this.f2728d = context;
        this.f2730g = jVar;
        this.f2727c = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof i) {
                        iVar = (i) context;
                        break;
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
            if (iVar != null) {
                this.f2713L = ((ab) iVar.getDelegate()).f2713L;
            }
        }
        if (this.f2713L == -100) {
            aw awVar = f2702a0;
            Integer num = (Integer) awVar.get(this.f2727c.getClass().getName());
            if (num != null) {
                this.f2713L = num.intValue();
                awVar.remove(this.f2727c.getClass().getName());
            }
        }
        if (window != null) {
            november(window);
        }
        C0488x.delta();
    }

    public static o1.e amber(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return u.bravo(configuration);
        }
        return o1.e.bravo(t.bravo(configuration.locale));
    }

    public static o1.e oscar(Context context) {
        o1.e eVar;
        o1.e bravo;
        Locale locale;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33 || (eVar = o.red) == null) {
            return null;
        }
        o1.e amber = amber(context.getApplicationContext().getResources().getConfiguration());
        o1.g gVar = eVar.alpha;
        if (i4 >= 24) {
            if (gVar.isEmpty()) {
                bravo = o1.e.bravo;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i5 = 0; i5 < amber.alpha.size() + gVar.size(); i5++) {
                    if (i5 < gVar.size()) {
                        locale = gVar.get(i5);
                    } else {
                        locale = amber.alpha.get(i5 - gVar.size());
                    }
                    if (locale != null) {
                        linkedHashSet.add(locale);
                    }
                }
                bravo = o1.e.alpha((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (gVar.isEmpty()) {
            bravo = o1.e.bravo;
        } else {
            bravo = o1.e.bravo(t.bravo(gVar.get(0)));
        }
        if (bravo.alpha.isEmpty()) {
            return amber;
        }
        return bravo;
    }

    public static Configuration tango(Context context, int i4, o1.e eVar, Configuration configuration, boolean z2) {
        int i5;
        if (i4 != 1) {
            if (i4 != 2) {
                if (z2) {
                    i5 = 0;
                } else {
                    i5 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i5 = 32;
            }
        } else {
            i5 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i5 | (configuration2.uiMode & (-49));
        if (eVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                u.delta(configuration2, eVar);
                return configuration2;
            }
            o1.g gVar = eVar.alpha;
            configuration2.setLocale(gVar.get(0));
            configuration2.setLayoutDirection(gVar.get(0));
        }
        return configuration2;
    }

    @Override // androidx.appcompat.app.o
    public final void alpha() {
        LayoutInflater from = LayoutInflater.from(this.f2728d);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof ab)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r2 <= r5) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, androidx.appcompat.app.aa] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final aa azure(int i4) {
        Object[] objArr;
        aa[] aaVarArr = this.f2706E;
        if (aaVarArr != null) {
            int length = aaVarArr.length;
            objArr = aaVarArr;
        }
        aa[] aaVarArr2 = new aa[i4 + 1];
        if (aaVarArr != null) {
            System.arraycopy(aaVarArr, 0, aaVarArr2, 0, aaVarArr.length);
        }
        this.f2706E = aaVarArr2;
        objArr = aaVarArr2;
        aa aaVar = objArr[i4];
        if (aaVar == 0) {
            ?? obj = new Object();
            obj.alpha = i4;
            obj.november = false;
            objArr[i4] = obj;
            return obj;
        }
        return aaVar;
    }

    public final void beige() {
        whiskey();
        if (this.f2748y && this.f2731h == null) {
            Object obj = this.f2727c;
            if (obj instanceof Activity) {
                this.f2731h = new ap((Activity) obj, this.f2749z);
            } else if (obj instanceof Dialog) {
                this.f2731h = new ap((Dialog) obj);
            }
            a aVar = this.f2731h;
            if (aVar != null) {
                aVar.november(this.f2721U);
            }
        }
    }

    public final void black(int i4) {
        this.f2719S = (1 << i4) | this.f2719S;
        if (!this.f2718R) {
            View decorView = this.e.getDecorView();
            p pVar = this.f2720T;
            WeakHashMap weakHashMap = au.alpha;
            decorView.postOnAnimation(pVar);
            this.f2718R = true;
        }
    }

    public final int blue(int i4, Context context) {
        if (i4 != -100) {
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != 1 && i4 != 2) {
                        if (i4 == 3) {
                            if (this.Q == null) {
                                this.Q = new x(this, context);
                            }
                            return this.Q.golf();
                        }
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    return i4;
                }
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return zulu(context).golf();
                }
            } else {
                return i4;
            }
        }
        return -1;
    }

    @Override // androidx.appcompat.app.o
    public final void bravo() {
        if (this.f2731h != null) {
            beige();
            if (!this.f2731h.golf()) {
                black(0);
            }
        }
    }

    public final boolean bronze() {
        boolean z2 = this.f2708G;
        this.f2708G = false;
        aa azure = azure(0);
        if (azure.mike) {
            if (!z2) {
                romeo(azure, true);
                return true;
            }
        } else {
            an.b bVar = this.f2737n;
            if (bVar != null) {
                bVar.alpha();
                return true;
            }
            beige();
            a aVar = this.f2731h;
            if (aVar == null || !aVar.bravo()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.juliet() != false) goto L20;
     */
    @Override // ao.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void coral(ao.l lVar) {
        ActionMenuView actionMenuView;
        C0469n c0469n;
        P p4 = this.f2734k;
        if (p4 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) p4;
            actionBarOverlayLayout.echo();
            Toolbar toolbar = ((e1) actionBarOverlayLayout.teal).alpha;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.alpha) != null && actionMenuView.silver) {
                if (ViewConfiguration.get(this.f2728d).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2734k;
                    actionBarOverlayLayout2.echo();
                    ActionMenuView actionMenuView2 = ((e1) actionBarOverlayLayout2.teal).alpha.alpha;
                    if (actionMenuView2 != null) {
                        C0469n c0469n2 = actionMenuView2.teal;
                        if (c0469n2 != null) {
                            if (c0469n2.f2914o == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.e.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2734k;
                actionBarOverlayLayout3.echo();
                if (((e1) actionBarOverlayLayout3.teal).alpha.oscar()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2734k;
                    actionBarOverlayLayout4.echo();
                    ActionMenuView actionMenuView3 = ((e1) actionBarOverlayLayout4.teal).alpha.alpha;
                    if (actionMenuView3 != null && (c0469n = actionMenuView3.teal) != null) {
                        c0469n.golf();
                    }
                    if (!this.f2711J) {
                        callback.onPanelClosed(108, azure(0).hotel);
                        return;
                    }
                    return;
                }
                if (callback != null && !this.f2711J) {
                    if (this.f2718R && (1 & this.f2719S) != 0) {
                        View decorView = this.e.getDecorView();
                        p pVar = this.f2720T;
                        decorView.removeCallbacks(pVar);
                        pVar.run();
                    }
                    aa azure = azure(0);
                    ao.l lVar2 = azure.hotel;
                    if (lVar2 != null && !azure.oscar && callback.onPreparePanel(0, azure.golf, lVar2)) {
                        callback.onMenuOpened(108, azure.hotel);
                        ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f2734k;
                        actionBarOverlayLayout5.echo();
                        ((e1) actionBarOverlayLayout5.teal).alpha.uniform();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        aa azure2 = azure(0);
        azure2.november = true;
        romeo(azure2, false);
        crimson(azure2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0165, code lost:
    
        if (r15.white.getCount() > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0145, code lost:
    
        if (r15 != null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void crimson(aa aaVar, KeyEvent keyEvent) {
        int i4;
        ViewGroup.LayoutParams layoutParams;
        if (!aaVar.mike && !this.f2711J) {
            int i5 = aaVar.alpha;
            Context context = this.f2728d;
            if (i5 != 0 || (context.getResources().getConfiguration().screenLayout & 15) != 4) {
                Window.Callback callback = this.e.getCallback();
                if (callback != null && !callback.onMenuOpened(i5, aaVar.hotel)) {
                    romeo(aaVar, true);
                    return;
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (windowManager != null && emerald(aaVar, keyEvent)) {
                    y yVar = aaVar.echo;
                    if (yVar != null && !aaVar.november) {
                        View view = aaVar.golf;
                        if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                            i4 = -1;
                            aaVar.lima = false;
                            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i4, -2, 0, 0, 1002, 8519680, -3);
                            layoutParams2.gravity = aaVar.charlie;
                            layoutParams2.windowAnimations = aaVar.delta;
                            windowManager.addView(aaVar.echo, layoutParams2);
                            aaVar.mike = true;
                            if (i5 != 0) {
                                gold();
                                return;
                            }
                            return;
                        }
                    } else {
                        if (yVar == null) {
                            Context yankee = yankee();
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme newTheme = yankee.getResources().newTheme();
                            newTheme.setTo(yankee.getTheme());
                            newTheme.resolveAttribute(delivery.samurai.android.R.attr.actionBarPopupTheme, typedValue, true);
                            int i10 = typedValue.resourceId;
                            if (i10 != 0) {
                                newTheme.applyStyle(i10, true);
                            }
                            newTheme.resolveAttribute(delivery.samurai.android.R.attr.panelMenuListTheme, typedValue, true);
                            int i11 = typedValue.resourceId;
                            if (i11 != 0) {
                                newTheme.applyStyle(i11, true);
                            } else {
                                newTheme.applyStyle(2132083346, true);
                            }
                            an.d dVar = new an.d(yankee, 0);
                            dVar.getTheme().setTo(newTheme);
                            aaVar.juliet = dVar;
                            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(aj.a.juliet);
                            aaVar.bravo = obtainStyledAttributes.getResourceId(86, 0);
                            aaVar.delta = obtainStyledAttributes.getResourceId(1, 0);
                            obtainStyledAttributes.recycle();
                            aaVar.echo = new y(this, aaVar.juliet);
                            aaVar.charlie = 81;
                        } else if (aaVar.november && yVar.getChildCount() > 0) {
                            aaVar.echo.removeAllViews();
                        }
                        View view2 = aaVar.golf;
                        if (view2 != null) {
                            aaVar.foxtrot = view2;
                        } else {
                            if (aaVar.hotel != null) {
                                if (this.f2736m == null) {
                                    this.f2736m = new q(this);
                                }
                                q qVar = this.f2736m;
                                if (aaVar.india == null) {
                                    ao.h hVar = new ao.h(aaVar.juliet);
                                    aaVar.india = hVar;
                                    hVar.teal = qVar;
                                    ao.l lVar = aaVar.hotel;
                                    lVar.bravo(hVar, lVar.alpha);
                                }
                                ao.h hVar2 = aaVar.india;
                                y yVar2 = aaVar.echo;
                                if (hVar2.silver == null) {
                                    hVar2.silver = (ExpandedMenuView) hVar2.purple.inflate(delivery.samurai.android.R.layout.abc_expanded_menu_layout, (ViewGroup) yVar2, false);
                                    if (hVar2.white == null) {
                                        hVar2.white = new ao.g(hVar2);
                                    }
                                    hVar2.silver.setAdapter((ListAdapter) hVar2.white);
                                    hVar2.silver.setOnItemClickListener(hVar2);
                                }
                                ExpandedMenuView expandedMenuView = hVar2.silver;
                                aaVar.foxtrot = expandedMenuView;
                            }
                            aaVar.november = true;
                            return;
                        }
                        if (aaVar.foxtrot != null) {
                            if (aaVar.golf == null) {
                                ao.h hVar3 = aaVar.india;
                                if (hVar3.white == null) {
                                    hVar3.white = new ao.g(hVar3);
                                }
                            }
                            ViewGroup.LayoutParams layoutParams3 = aaVar.foxtrot.getLayoutParams();
                            if (layoutParams3 == null) {
                                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            aaVar.echo.setBackgroundResource(aaVar.bravo);
                            ViewParent parent = aaVar.foxtrot.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(aaVar.foxtrot);
                            }
                            aaVar.echo.addView(aaVar.foxtrot, layoutParams3);
                            if (!aaVar.foxtrot.hasFocus()) {
                                aaVar.foxtrot.requestFocus();
                            }
                        }
                        aaVar.november = true;
                        return;
                    }
                    i4 = -2;
                    aaVar.lima = false;
                    WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i4, -2, 0, 0, 1002, 8519680, -3);
                    layoutParams22.gravity = aaVar.charlie;
                    layoutParams22.windowAnimations = aaVar.delta;
                    windowManager.addView(aaVar.echo, layoutParams22);
                    aaVar.mike = true;
                    if (i5 != 0) {
                    }
                }
            }
        }
    }

    public final boolean cyan(aa aaVar, int i4, KeyEvent keyEvent) {
        ao.l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!aaVar.kilo && !emerald(aaVar, keyEvent)) || (lVar = aaVar.hotel) == null) {
            return false;
        }
        return lVar.performShortcut(i4, keyEvent, 1);
    }

    @Override // androidx.appcompat.app.o
    public final void delta() {
        String str;
        this.f2709H = true;
        mike(false, true);
        xray();
        Object obj = this.f2727c;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC1686f.charlie(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                a aVar = this.f2731h;
                if (aVar == null) {
                    this.f2721U = true;
                } else {
                    aVar.november(true);
                }
            }
            synchronized (o.f2750a) {
                o.foxtrot(this);
                o.yellow.add(new WeakReference(this));
            }
        }
        this.f2712K = new Configuration(this.f2728d.getResources().getConfiguration());
        this.f2710I = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.app.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void echo() {
        a aVar;
        x xVar;
        x xVar2;
        if (this.f2727c instanceof Activity) {
            synchronized (o.f2750a) {
                o.foxtrot(this);
            }
        }
        if (this.f2718R) {
            this.e.getDecorView().removeCallbacks(this.f2720T);
        }
        this.f2711J = true;
        if (this.f2713L != -100) {
            Object obj = this.f2727c;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2702a0.put(this.f2727c.getClass().getName(), Integer.valueOf(this.f2713L));
                aVar = this.f2731h;
                if (aVar != null) {
                    aVar.india();
                }
                xVar = this.f2717P;
                if (xVar != null) {
                    xVar.delta();
                }
                xVar2 = this.Q;
                if (xVar2 == null) {
                    xVar2.delta();
                    return;
                }
                return;
            }
        }
        f2702a0.remove(this.f2727c.getClass().getName());
        aVar = this.f2731h;
        if (aVar != null) {
        }
        xVar = this.f2717P;
        if (xVar != null) {
        }
        xVar2 = this.Q;
        if (xVar2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d5, code lost:
    
        if (r13.hotel == null) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean emerald(aa aaVar, KeyEvent keyEvent) {
        boolean z2;
        P p4;
        P p5;
        Resources.Theme theme;
        int i4;
        boolean z10;
        P p10;
        P p11;
        if (!this.f2711J) {
            if (aaVar.kilo) {
                return true;
            }
            aa aaVar2 = this.f2707F;
            if (aaVar2 != null && aaVar2 != aaVar) {
                romeo(aaVar2, false);
            }
            Window.Callback callback = this.e.getCallback();
            int i5 = aaVar.alpha;
            if (callback != null) {
                aaVar.golf = callback.onCreatePanelView(i5);
            }
            if (i5 != 0 && i5 != 108) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 && (p11 = this.f2734k) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) p11;
                actionBarOverlayLayout.echo();
                ((e1) actionBarOverlayLayout.teal).lima = true;
            }
            if (aaVar.golf == null && (!z2 || !(this.f2731h instanceof ak))) {
                ao.l lVar = aaVar.hotel;
                if (lVar == null || aaVar.oscar) {
                    if (lVar == null) {
                        Context context = this.f2728d;
                        if ((i5 == 0 || i5 == 108) && this.f2734k != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(delivery.samurai.android.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(delivery.samurai.android.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(delivery.samurai.android.R.attr.actionBarWidgetTheme, typedValue, true);
                                theme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (theme == null) {
                                    theme = context.getResources().newTheme();
                                    theme.setTo(theme2);
                                }
                                theme.applyStyle(typedValue.resourceId, true);
                            }
                            if (theme != null) {
                                an.d dVar = new an.d(context, 0);
                                dVar.getTheme().setTo(theme);
                                context = dVar;
                            }
                        }
                        ao.l lVar2 = new ao.l(context);
                        lVar2.teal = this;
                        ao.l lVar3 = aaVar.hotel;
                        if (lVar2 != lVar3) {
                            if (lVar3 != null) {
                                lVar3.romeo(aaVar.india);
                            }
                            aaVar.hotel = lVar2;
                            ao.h hVar = aaVar.india;
                            if (hVar != null) {
                                lVar2.bravo(hVar, lVar2.alpha);
                            }
                        }
                    }
                    if (z2 && (p5 = this.f2734k) != null) {
                        if (this.f2735l == null) {
                            this.f2735l = new r(this);
                        }
                        ((ActionBarOverlayLayout) p5).foxtrot(aaVar.hotel, this.f2735l);
                    }
                    aaVar.hotel.whiskey();
                    if (!callback.onCreatePanelMenu(i5, aaVar.hotel)) {
                        ao.l lVar4 = aaVar.hotel;
                        if (lVar4 != null) {
                            if (lVar4 != null) {
                                lVar4.romeo(aaVar.india);
                            }
                            aaVar.hotel = null;
                        }
                        if (z2 && (p4 = this.f2734k) != null) {
                            ((ActionBarOverlayLayout) p4).foxtrot(null, this.f2735l);
                        }
                    } else {
                        aaVar.oscar = false;
                    }
                }
                aaVar.hotel.whiskey();
                Bundle bundle = aaVar.papa;
                if (bundle != null) {
                    aaVar.hotel.sierra(bundle);
                    aaVar.papa = null;
                }
                if (!callback.onPreparePanel(0, aaVar.golf, aaVar.hotel)) {
                    if (z2 && (p10 = this.f2734k) != null) {
                        ((ActionBarOverlayLayout) p10).foxtrot(null, this.f2735l);
                    }
                    aaVar.hotel.victor();
                    return false;
                }
                if (keyEvent != null) {
                    i4 = keyEvent.getDeviceId();
                } else {
                    i4 = -1;
                }
                if (KeyCharacterMap.load(i4).getKeyboardType() != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aaVar.hotel.setQwertyMode(z10);
                aaVar.hotel.victor();
            }
            aaVar.kilo = true;
            aaVar.lima = false;
            this.f2707F = aaVar;
            return true;
        }
        return false;
    }

    public final void fuchsia() {
        if (!this.f2742s) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void gold() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f2725Y != null && (azure(0).mike || this.f2737n != null)) {
                z2 = true;
            }
            if (z2 && this.f2726Z == null) {
                this.f2726Z = v.bravo(this.f2725Y, this);
            } else if (!z2 && (onBackInvokedCallback = this.f2726Z) != null) {
                v.charlie(this.f2725Y, onBackInvokedCallback);
                this.f2726Z = null;
            }
        }
    }

    @Override // androidx.appcompat.app.o
    public final boolean golf(int i4) {
        if (i4 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i4 = 108;
        } else if (i4 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i4 = 109;
        }
        if (this.C && i4 == 108) {
            return false;
        }
        if (this.f2748y && i4 == 1) {
            this.f2748y = false;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 5) {
                    if (i4 != 10) {
                        if (i4 != 108) {
                            if (i4 != 109) {
                                return this.e.requestFeature(i4);
                            }
                            fuchsia();
                            this.f2749z = true;
                            return true;
                        }
                        fuchsia();
                        this.f2748y = true;
                        return true;
                    }
                    fuchsia();
                    this.A = true;
                    return true;
                }
                fuchsia();
                this.f2747x = true;
                return true;
            }
            fuchsia();
            this.f2746w = true;
            return true;
        }
        fuchsia();
        this.C = true;
        return true;
    }

    @Override // androidx.appcompat.app.o
    public final void hotel(int i4) {
        whiskey();
        ViewGroup viewGroup = (ViewGroup) this.f2743t.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2728d).inflate(i4, viewGroup);
        this.f2729f.alpha(this.e.getCallback());
    }

    @Override // androidx.appcompat.app.o
    public final void india(View view) {
        whiskey();
        ViewGroup viewGroup = (ViewGroup) this.f2743t.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2729f.alpha(this.e.getCallback());
    }

    @Override // androidx.appcompat.app.o
    public final void juliet(View view, ViewGroup.LayoutParams layoutParams) {
        whiskey();
        ViewGroup viewGroup = (ViewGroup) this.f2743t.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2729f.alpha(this.e.getCallback());
    }

    @Override // androidx.appcompat.app.o
    public final void kilo(CharSequence charSequence) {
        this.f2733j = charSequence;
        P p4 = this.f2734k;
        if (p4 != null) {
            p4.setWindowTitle(charSequence);
            return;
        }
        a aVar = this.f2731h;
        if (aVar != null) {
            aVar.uniform(charSequence);
            return;
        }
        TextView textView = this.f2744u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, androidx.appcompat.app.j] */
    /* JADX WARN: Type inference failed for: r9v14, types: [ao.j, an.e, java.lang.Object, an.b] */
    @Override // androidx.appcompat.app.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final an.b lima(an.a aVar) {
        an.b onWindowStartingSupportActionMode;
        boolean z2;
        ViewGroup viewGroup;
        an.b bVar;
        boolean z10 = false;
        int i4 = 1;
        if (aVar != null) {
            an.b bVar2 = this.f2737n;
            if (bVar2 != null) {
                bVar2.alpha();
            }
            J2.e eVar = new J2.e(20, this, aVar, z10);
            beige();
            a aVar2 = this.f2731h;
            ?? r32 = this.f2730g;
            if (aVar2 != null) {
                an.b whiskey = aVar2.whiskey(eVar);
                this.f2737n = whiskey;
                if (whiskey != null) {
                    r32.onSupportActionModeStarted(whiskey);
                }
            }
            if (this.f2737n == null) {
                az azVar = this.f2741r;
                if (azVar != null) {
                    azVar.bravo();
                }
                an.b bVar3 = this.f2737n;
                if (bVar3 != null) {
                    bVar3.alpha();
                }
                if (!this.f2711J) {
                    try {
                        onWindowStartingSupportActionMode = r32.onWindowStartingSupportActionMode(eVar);
                    } catch (AbstractMethodError unused) {
                    }
                    if (onWindowStartingSupportActionMode == null) {
                        this.f2737n = onWindowStartingSupportActionMode;
                    } else {
                        if (this.f2738o == null) {
                            if (this.B) {
                                TypedValue typedValue = new TypedValue();
                                Context context = this.f2728d;
                                Resources.Theme theme = context.getTheme();
                                theme.resolveAttribute(delivery.samurai.android.R.attr.actionBarTheme, typedValue, true);
                                if (typedValue.resourceId != 0) {
                                    Resources.Theme newTheme = context.getResources().newTheme();
                                    newTheme.setTo(theme);
                                    newTheme.applyStyle(typedValue.resourceId, true);
                                    an.d dVar = new an.d(context, 0);
                                    dVar.getTheme().setTo(newTheme);
                                    context = dVar;
                                }
                                this.f2738o = new ActionBarContextView(context, null);
                                PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, delivery.samurai.android.R.attr.actionModePopupWindowStyle);
                                this.f2739p = popupWindow;
                                popupWindow.setWindowLayoutType(2);
                                this.f2739p.setContentView(this.f2738o);
                                this.f2739p.setWidth(-1);
                                context.getTheme().resolveAttribute(delivery.samurai.android.R.attr.actionBarSize, typedValue, true);
                                this.f2738o.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                                this.f2739p.setHeight(-2);
                                this.f2740q = new p(this, i4);
                            } else {
                                ViewStubCompat viewStubCompat = (ViewStubCompat) this.f2743t.findViewById(delivery.samurai.android.R.id.action_mode_bar_stub);
                                if (viewStubCompat != null) {
                                    viewStubCompat.setLayoutInflater(LayoutInflater.from(yankee()));
                                    this.f2738o = (ActionBarContextView) viewStubCompat.alpha();
                                }
                            }
                        }
                        if (this.f2738o != null) {
                            az azVar2 = this.f2741r;
                            if (azVar2 != null) {
                                azVar2.bravo();
                            }
                            this.f2738o.echo();
                            Context context2 = this.f2738o.getContext();
                            ActionBarContextView actionBarContextView = this.f2738o;
                            ?? obj = new Object();
                            obj.red = context2;
                            obj.silver = actionBarContextView;
                            obj.teal = eVar;
                            ao.l lVar = new ao.l(actionBarContextView.getContext());
                            lVar.e = 1;
                            obj.f2695a = lVar;
                            lVar.teal = obj;
                            if (((an.a) eVar.purple).pink(obj, lVar)) {
                                obj.golf();
                                this.f2738o.charlie(obj);
                                this.f2737n = obj;
                                if (this.f2742s && (viewGroup = this.f2743t) != null && viewGroup.isLaidOut()) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    this.f2738o.setAlpha(0.0f);
                                    az alpha = au.alpha(this.f2738o);
                                    alpha.alpha(1.0f);
                                    this.f2741r = alpha;
                                    alpha.delta(new s(i4, this));
                                } else {
                                    this.f2738o.setAlpha(1.0f);
                                    this.f2738o.setVisibility(0);
                                    if (this.f2738o.getParent() instanceof View) {
                                        View view = (View) this.f2738o.getParent();
                                        WeakHashMap weakHashMap = au.alpha;
                                        s1.aj.charlie(view);
                                    }
                                }
                                if (this.f2739p != null) {
                                    this.e.getDecorView().post(this.f2740q);
                                }
                            } else {
                                this.f2737n = null;
                            }
                        }
                    }
                    bVar = this.f2737n;
                    if (bVar != null) {
                        r32.onSupportActionModeStarted(bVar);
                    }
                    gold();
                    this.f2737n = this.f2737n;
                }
                onWindowStartingSupportActionMode = null;
                if (onWindowStartingSupportActionMode == null) {
                }
                bVar = this.f2737n;
                if (bVar != null) {
                }
                gold();
                this.f2737n = this.f2737n;
            }
            gold();
            return this.f2737n;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mike(boolean z2, boolean z10) {
        o1.e eVar;
        int i4;
        Configuration configuration;
        int i5;
        int i10;
        o1.e amber;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Object obj;
        Object obj2;
        Object obj3;
        Activity activity;
        int i12;
        if (this.f2711J) {
            return false;
        }
        int i13 = this.f2713L;
        if (i13 == -100) {
            i13 = o.purple;
        }
        int i14 = i13;
        Context context = this.f2728d;
        int blue = blue(i14, context);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 < 33) {
            eVar = oscar(context);
        } else {
            eVar = null;
        }
        if (!z10 && eVar != null) {
            eVar = amber(context.getResources().getConfiguration());
        }
        Configuration tango = tango(context, blue, eVar, null, false);
        boolean z15 = this.f2716O;
        Object obj4 = this.f2727c;
        if (!z15 && (obj4 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i4 = 0;
                configuration = this.f2712K;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                i5 = configuration.uiMode & 48;
                i10 = tango.uiMode & 48;
                o1.e amber2 = amber(configuration);
                if (eVar != null) {
                    amber = null;
                } else {
                    amber = amber(tango);
                }
                if (i5 == i10) {
                    i11 = 512;
                } else {
                    i11 = 0;
                }
                if (amber != null && !amber2.equals(amber)) {
                    i11 |= 8196;
                }
                if (((~i4) & i11) != 0 && z2 && this.f2709H && ((f2704c0 || this.f2710I) && (obj4 instanceof Activity))) {
                    activity = (Activity) obj4;
                    if (!activity.isChild()) {
                        int i16 = Build.VERSION.SDK_INT;
                        if (i16 >= 31 && (i11 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(tango.getLayoutDirection());
                        }
                        if (i16 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new androidx.camera.core.impl.ai(29, activity));
                        }
                        z11 = true;
                        if (z11 && i11 != 0) {
                            if ((i4 & i11) == i11) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i10;
                            if (amber != null) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    u.delta(configuration2, amber);
                                } else {
                                    o1.g gVar = amber.alpha;
                                    configuration2.setLocale(gVar.get(0));
                                    configuration2.setLayoutDirection(gVar.get(0));
                                }
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i17 = Build.VERSION.SDK_INT;
                            if (i17 < 26 && i17 < 28) {
                                if (i17 >= 24) {
                                    if (!AbstractC3047q3.hotel) {
                                        try {
                                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                            AbstractC3047q3.golf = declaredField;
                                            declaredField.setAccessible(true);
                                        } catch (NoSuchFieldException e) {
                                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
                                        }
                                        AbstractC3047q3.hotel = true;
                                    }
                                    Field field = AbstractC3047q3.golf;
                                    if (field != null) {
                                        try {
                                            obj2 = field.get(resources);
                                        } catch (IllegalAccessException e4) {
                                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e4);
                                            obj2 = null;
                                        }
                                        if (obj2 != null) {
                                            if (!AbstractC3047q3.bravo) {
                                                try {
                                                    Field declaredField2 = obj2.getClass().getDeclaredField("mDrawableCache");
                                                    AbstractC3047q3.alpha = declaredField2;
                                                    declaredField2.setAccessible(true);
                                                } catch (NoSuchFieldException e5) {
                                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e5);
                                                }
                                                AbstractC3047q3.bravo = true;
                                            }
                                            Field field2 = AbstractC3047q3.alpha;
                                            if (field2 != null) {
                                                try {
                                                    obj3 = field2.get(obj2);
                                                } catch (IllegalAccessException e10) {
                                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e10);
                                                }
                                                if (obj3 != null) {
                                                    AbstractC3047q3.delta(obj3);
                                                }
                                            }
                                            obj3 = null;
                                            if (obj3 != null) {
                                            }
                                        }
                                    }
                                } else {
                                    if (!AbstractC3047q3.bravo) {
                                        try {
                                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                                            AbstractC3047q3.alpha = declaredField3;
                                            declaredField3.setAccessible(true);
                                        } catch (NoSuchFieldException e11) {
                                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e11);
                                        }
                                        AbstractC3047q3.bravo = true;
                                    }
                                    Field field3 = AbstractC3047q3.alpha;
                                    if (field3 != null) {
                                        try {
                                            obj = field3.get(resources);
                                        } catch (IllegalAccessException e12) {
                                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e12);
                                        }
                                        if (obj != null) {
                                            AbstractC3047q3.delta(obj);
                                        }
                                    }
                                    obj = null;
                                    if (obj != null) {
                                    }
                                }
                            }
                            int i18 = this.f2714M;
                            if (i18 != 0) {
                                context.setTheme(i18);
                                z14 = true;
                                context.getTheme().applyStyle(this.f2714M, true);
                            } else {
                                z14 = true;
                            }
                            if (z13 && (obj4 instanceof Activity)) {
                                Activity activity2 = (Activity) obj4;
                                if (activity2 instanceof androidx.lifecycle.al) {
                                    if (((androidx.lifecycle.al) activity2).getLifecycle().bravo().compareTo(androidx.lifecycle.ab.red) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f2710I && !this.f2711J) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                            z12 = z14;
                        } else {
                            z12 = z11;
                        }
                        if (z12 && (obj4 instanceof i)) {
                            if ((i11 & 512) != 0) {
                                ((i) obj4).onNightModeChanged(blue);
                            }
                            if ((i11 & 4) != 0) {
                                ((i) obj4).onLocalesChanged(eVar);
                            }
                        }
                        if (amber != null) {
                            o1.e amber3 = amber(context.getResources().getConfiguration());
                            if (Build.VERSION.SDK_INT >= 24) {
                                u.charlie(amber3);
                            } else {
                                Locale.setDefault(amber3.alpha.get(0));
                            }
                        }
                        if (i14 == 0) {
                            zulu(context).whiskey();
                        } else {
                            x xVar = this.f2717P;
                            if (xVar != null) {
                                xVar.delta();
                            }
                        }
                        if (i14 == 3) {
                            if (this.Q == null) {
                                this.Q = new x(this, context);
                            }
                            this.Q.whiskey();
                        } else {
                            x xVar2 = this.Q;
                            if (xVar2 != null) {
                                xVar2.delta();
                            }
                        }
                        return z12;
                    }
                }
                z11 = false;
                if (z11) {
                }
                z12 = z11;
                if (z12) {
                    if ((i11 & 512) != 0) {
                    }
                    if ((i11 & 4) != 0) {
                    }
                }
                if (amber != null) {
                }
                if (i14 == 0) {
                }
                if (i14 == 3) {
                }
                return z12;
            }
            if (i15 >= 29) {
                i12 = 269221888;
            } else if (i15 >= 24) {
                i12 = 786432;
            } else {
                i12 = 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj4.getClass()), i12);
                if (activityInfo != null) {
                    this.f2715N = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e13) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e13);
                this.f2715N = 0;
            }
        }
        this.f2716O = true;
        i4 = this.f2715N;
        configuration = this.f2712K;
        if (configuration == null) {
        }
        i5 = configuration.uiMode & 48;
        i10 = tango.uiMode & 48;
        o1.e amber22 = amber(configuration);
        if (eVar != null) {
        }
        if (i5 == i10) {
        }
        if (amber != null) {
            i11 |= 8196;
        }
        if (((~i4) & i11) != 0) {
            activity = (Activity) obj4;
            if (!activity.isChild()) {
            }
        }
        z11 = false;
        if (z11) {
        }
        z12 = z11;
        if (z12) {
        }
        if (amber != null) {
        }
        if (i14 == 0) {
        }
        if (i14 == 3) {
        }
        return z12;
    }

    public final void november(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.e == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof w)) {
                w wVar = new w(this, callback);
                this.f2729f = wVar;
                window.setCallback(wVar);
                int[] iArr = f2703b0;
                Context context = this.f2728d;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    C0488x alpha = C0488x.alpha();
                    synchronized (alpha) {
                        drawable = alpha.alpha.golf(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.e = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f2725Y) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2726Z) != null) {
                        v.charlie(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f2726Z = null;
                    }
                    Object obj = this.f2727c;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.f2725Y = v.alpha(activity);
                            gold();
                            return;
                        }
                    }
                    this.f2725Y = null;
                    gold();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0115, code lost:
    
        if (r2.equals("ImageButton") == false) goto L24;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View aiVar;
        String str2 = str;
        char c3 = 4;
        View view2 = null;
        if (this.f2724X == null) {
            int[] iArr = aj.a.juliet;
            Context context2 = this.f2728d;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f2724X = new ag();
            } else {
                try {
                    this.f2724X = (ag) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2724X = new ag();
                }
            }
        }
        ag agVar = this.f2724X;
        int i4 = j1.alpha;
        agVar.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, aj.a.zulu, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context dVar = (resourceId == 0 || ((context instanceof an.d) && ((an.d) context).alpha == resourceId)) ? context : new an.d(context, resourceId);
        str2.getClass();
        switch (str2.hashCode()) {
            case -1946472170:
                if (str2.equals("RatingBar")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -1455429095:
                if (str2.equals("CheckedTextView")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case -1346021293:
                if (str2.equals("MultiAutoCompleteTextView")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -938935918:
                if (str2.equals("TextView")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str2.equals("SeekBar")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case -339785223:
                if (str2.equals("Spinner")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 776382189:
                if (str2.equals("RadioButton")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 799298502:
                if (str2.equals("ToggleButton")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 1125864064:
                if (str2.equals("ImageView")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case 1413872058:
                if (str2.equals("AutoCompleteTextView")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case 1601505219:
                if (str2.equals("CheckBox")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case 1666676343:
                if (str2.equals("EditText")) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            case 2001146706:
                if (str2.equals("Button")) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
                aiVar = new androidx.appcompat.widget.ai(dVar, attributeSet);
                break;
            case 1:
                aiVar = new AppCompatCheckedTextView(dVar, attributeSet);
                break;
            case 2:
                aiVar = new androidx.appcompat.widget.ae(dVar, attributeSet);
                break;
            case 3:
                aiVar = agVar.echo(dVar, attributeSet);
                break;
            case 4:
                aiVar = new androidx.appcompat.widget.ac(dVar, attributeSet, delivery.samurai.android.R.attr.imageButtonStyle);
                break;
            case 5:
                aiVar = new androidx.appcompat.widget.ak(dVar, attributeSet);
                break;
            case 6:
                aiVar = new av(dVar, attributeSet);
                break;
            case 7:
                aiVar = agVar.delta(dVar, attributeSet);
                break;
            case '\b':
                aiVar = new N(dVar, attributeSet);
                break;
            case '\t':
                aiVar = new AppCompatImageView(dVar, attributeSet);
                break;
            case '\n':
                aiVar = agVar.alpha(dVar, attributeSet);
                break;
            case 11:
                aiVar = agVar.charlie(dVar, attributeSet);
                break;
            case '\f':
                aiVar = new C0492z(dVar, attributeSet, delivery.samurai.android.R.attr.editTextStyle);
                break;
            case '\r':
                aiVar = agVar.bravo(dVar, attributeSet);
                break;
            default:
                aiVar = null;
                break;
        }
        if (aiVar == null && context != dVar) {
            Object[] objArr = agVar.alpha;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = dVar;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i5 = 0;
                    while (true) {
                        String[] strArr = ag.golf;
                        if (i5 < 3) {
                            View foxtrot = agVar.foxtrot(dVar, str2, strArr[i5]);
                            if (foxtrot != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = foxtrot;
                            } else {
                                i5++;
                            }
                        }
                    }
                } else {
                    View foxtrot2 = agVar.foxtrot(dVar, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = foxtrot2;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            aiVar = view2;
        }
        if (aiVar != null) {
            Context context3 = aiVar.getContext();
            if ((context3 instanceof ContextWrapper) && aiVar.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, ag.charlie);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    aiVar.setOnClickListener(new af(aiVar, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = dVar.obtainStyledAttributes(attributeSet, ag.delta);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = au.alpha;
                    new s1.ah(delivery.samurai.android.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).foxtrot(aiVar, Boolean.valueOf(z2));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = dVar.obtainStyledAttributes(attributeSet, ag.echo);
                if (obtainStyledAttributes5.hasValue(0)) {
                    au.oscar(aiVar, obtainStyledAttributes5.getString(0));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = dVar.obtainStyledAttributes(attributeSet, ag.foxtrot);
                if (obtainStyledAttributes6.hasValue(0)) {
                    boolean z10 = obtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = au.alpha;
                    new s1.ah(delivery.samurai.android.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).foxtrot(aiVar, Boolean.valueOf(z10));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return aiVar;
    }

    public final void papa(int i4, aa aaVar, ao.l lVar) {
        if (lVar == null) {
            if (aaVar == null && i4 >= 0) {
                aa[] aaVarArr = this.f2706E;
                if (i4 < aaVarArr.length) {
                    aaVar = aaVarArr[i4];
                }
            }
            if (aaVar != null) {
                lVar = aaVar.hotel;
            }
        }
        if ((aaVar == null || aaVar.mike) && !this.f2711J) {
            w wVar = this.f2729f;
            Window.Callback callback = this.e.getCallback();
            wVar.getClass();
            try {
                wVar.teal = true;
                callback.onPanelClosed(i4, lVar);
            } finally {
                wVar.teal = false;
            }
        }
    }

    public final void quebec(ao.l lVar) {
        C0469n c0469n;
        if (this.f2705D) {
            return;
        }
        this.f2705D = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2734k;
        actionBarOverlayLayout.echo();
        ActionMenuView actionMenuView = ((e1) actionBarOverlayLayout.teal).alpha.alpha;
        if (actionMenuView != null && (c0469n = actionMenuView.teal) != null) {
            c0469n.golf();
            C0455g c0455g = c0469n.f2913n;
            if (c0455g != null && c0455g.bravo()) {
                c0455g.india.dismiss();
            }
        }
        Window.Callback callback = this.e.getCallback();
        if (callback != null && !this.f2711J) {
            callback.onPanelClosed(108, lVar);
        }
        this.f2705D = false;
    }

    public final void romeo(aa aaVar, boolean z2) {
        y yVar;
        P p4;
        if (z2 && aaVar.alpha == 0 && (p4 = this.f2734k) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) p4;
            actionBarOverlayLayout.echo();
            if (((e1) actionBarOverlayLayout.teal).alpha.oscar()) {
                quebec(aaVar.hotel);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2728d.getSystemService("window");
        if (windowManager != null && aaVar.mike && (yVar = aaVar.echo) != null) {
            windowManager.removeView(yVar);
            if (z2) {
                papa(aaVar.alpha, aaVar, null);
            }
        }
        aaVar.kilo = false;
        aaVar.lima = false;
        aaVar.mike = false;
        aaVar.foxtrot = null;
        aaVar.november = true;
        if (this.f2707F == aaVar) {
            this.f2707F = null;
        }
        if (aaVar.alpha == 0) {
            gold();
        }
    }

    @Override // ao.j
    public final boolean sierra(ao.l lVar, MenuItem menuItem) {
        int i4;
        aa aaVar;
        Window.Callback callback = this.e.getCallback();
        if (callback != null && !this.f2711J) {
            ao.l kilo = lVar.kilo();
            aa[] aaVarArr = this.f2706E;
            if (aaVarArr != null) {
                i4 = aaVarArr.length;
            } else {
                i4 = 0;
            }
            int i5 = 0;
            while (true) {
                if (i5 < i4) {
                    aaVar = aaVarArr[i5];
                    if (aaVar != null && aaVar.hotel == kilo) {
                        break;
                    }
                    i5++;
                } else {
                    aaVar = null;
                    break;
                }
            }
            if (aaVar != null) {
                return callback.onMenuItemSelected(aaVar.alpha, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f0, code lost:
    
        if (r7.golf() != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean uniform(KeyEvent keyEvent) {
        View decorView;
        boolean z2;
        boolean z10;
        ActionMenuView actionMenuView;
        Object obj = this.f2727c;
        boolean z11 = true;
        if ((!(obj instanceof InterfaceC2577j) && !(obj instanceof ad)) || (decorView = this.e.getDecorView()) == null || !AbstractC3077x.bravo(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                w wVar = this.f2729f;
                Window.Callback callback = this.e.getCallback();
                wVar.getClass();
                try {
                    wVar.silver = true;
                } finally {
                    wVar.silver = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            aa azure = azure(0);
                            if (!azure.mike) {
                                emerald(azure, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if ((keyEvent.getFlags() & 128) == 0) {
                    z11 = false;
                }
                this.f2708G = z11;
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f2737n == null) {
                        aa azure2 = azure(0);
                        P p4 = this.f2734k;
                        Context context = this.f2728d;
                        if (p4 != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) p4;
                            actionBarOverlayLayout.echo();
                            Toolbar toolbar = ((e1) actionBarOverlayLayout.teal).alpha;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.alpha) != null && actionMenuView.silver && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2734k;
                                actionBarOverlayLayout2.echo();
                                if (!((e1) actionBarOverlayLayout2.teal).alpha.oscar()) {
                                    if (!this.f2711J && emerald(azure2, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2734k;
                                        actionBarOverlayLayout3.echo();
                                        z2 = ((e1) actionBarOverlayLayout3.teal).alpha.uniform();
                                        if (z2) {
                                            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                            if (audioManager != null) {
                                                audioManager.playSoundEffect(0);
                                                return true;
                                            }
                                            Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                            return true;
                                        }
                                    }
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2734k;
                                    actionBarOverlayLayout4.echo();
                                    ActionMenuView actionMenuView2 = ((e1) actionBarOverlayLayout4.teal).alpha.alpha;
                                    if (actionMenuView2 != null) {
                                        C0469n c0469n = actionMenuView2.teal;
                                        if (c0469n != null) {
                                        }
                                    }
                                }
                                z2 = false;
                                if (z2) {
                                }
                            }
                        }
                        boolean z12 = azure2.mike;
                        if (!z12 && !azure2.lima) {
                            if (azure2.kilo) {
                                if (azure2.oscar) {
                                    azure2.kilo = false;
                                    z10 = emerald(azure2, keyEvent);
                                } else {
                                    z10 = true;
                                }
                                if (z10) {
                                    crimson(azure2, keyEvent);
                                    z2 = true;
                                    if (z2) {
                                    }
                                }
                            }
                            z2 = false;
                            if (z2) {
                            }
                        } else {
                            romeo(azure2, true);
                            z2 = z12;
                            if (z2) {
                            }
                        }
                    }
                }
                return false;
            }
            if (!bronze()) {
                return false;
            }
        }
        return true;
    }

    public final void victor(int i4) {
        aa azure = azure(i4);
        if (azure.hotel != null) {
            Bundle bundle = new Bundle();
            azure.hotel.tango(bundle);
            if (bundle.size() > 0) {
                azure.papa = bundle;
            }
            azure.hotel.whiskey();
            azure.hotel.clear();
        }
        azure.oscar = true;
        azure.november = true;
        if ((i4 == 108 || i4 == 0) && this.f2734k != null) {
            aa azure2 = azure(0);
            azure2.kilo = false;
            emerald(azure2, null);
        }
    }

    public final void whiskey() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.f2742s) {
            int[] iArr = aj.a.juliet;
            Context context2 = this.f2728d;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    golf(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    golf(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    golf(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    golf(10);
                }
                this.B = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                xray();
                this.e.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.C) {
                    if (this.B) {
                        viewGroup = (ViewGroup) from.inflate(delivery.samurai.android.R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.f2749z = false;
                        this.f2748y = false;
                    } else if (this.f2748y) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(delivery.samurai.android.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new an.d(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(delivery.samurai.android.R.layout.abc_screen_toolbar, (ViewGroup) null);
                        P p4 = (P) viewGroup.findViewById(delivery.samurai.android.R.id.decor_content_parent);
                        this.f2734k = p4;
                        p4.setWindowCallback(this.e.getCallback());
                        if (this.f2749z) {
                            ((ActionBarOverlayLayout) this.f2734k).delta(109);
                        }
                        if (this.f2746w) {
                            ((ActionBarOverlayLayout) this.f2734k).delta(2);
                        }
                        if (this.f2747x) {
                            ((ActionBarOverlayLayout) this.f2734k).delta(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.A ? (ViewGroup) from.inflate(delivery.samurai.android.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(delivery.samurai.android.R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    q qVar = new q(this);
                    WeakHashMap weakHashMap = au.alpha;
                    s1.al.lima(viewGroup, qVar);
                    if (this.f2734k == null) {
                        this.f2744u = (TextView) viewGroup.findViewById(delivery.samurai.android.R.id.title);
                    }
                    boolean z2 = m1.alpha;
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, null);
                    } catch (IllegalAccessException e) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e4) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e4);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(delivery.samurai.android.R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.e.findViewById(R.id.content);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(R.id.content);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.e.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new r(this));
                    this.f2743t = viewGroup;
                    Object obj = this.f2727c;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f2733j;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        P p5 = this.f2734k;
                        if (p5 != null) {
                            p5.setWindowTitle(charSequence);
                        } else {
                            a aVar = this.f2731h;
                            if (aVar != null) {
                                aVar.uniform(charSequence);
                            } else {
                                TextView textView = this.f2744u;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2743t.findViewById(R.id.content);
                    View decorView = this.e.getDecorView();
                    contentFrameLayout2.yellow.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f2742s = true;
                    aa azure = azure(0);
                    if (!this.f2711J && azure.hotel == null) {
                        black(108);
                        return;
                    }
                    return;
                }
                StringBuilder sb2 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
                sb2.append(this.f2748y);
                sb2.append(", windowActionBarOverlay: ");
                sb2.append(this.f2749z);
                sb2.append(", android:windowIsFloating: ");
                sb2.append(this.B);
                sb2.append(", windowActionModeOverlay: ");
                sb2.append(this.A);
                sb2.append(", windowNoTitle: ");
                throw new IllegalArgumentException(Q0.c.romeo(sb2, this.C, " }"));
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void xray() {
        if (this.e == null) {
            Object obj = this.f2727c;
            if (obj instanceof Activity) {
                november(((Activity) obj).getWindow());
            }
        }
        if (this.e != null) {
        } else {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Context yankee() {
        Context context;
        beige();
        a aVar = this.f2731h;
        if (aVar != null) {
            context = aVar.echo();
        } else {
            context = null;
        }
        if (context == null) {
            return this.f2728d;
        }
        return context;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, J2.t] */
    public final K3.b zulu(Context context) {
        if (this.f2717P == null) {
            if (J2.t.silver == null) {
                Context applicationContext = context.getApplicationContext();
                LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
                ?? obj = new Object();
                obj.red = new Object();
                obj.alpha = applicationContext;
                obj.purple = locationManager;
                J2.t.silver = obj;
            }
            this.f2717P = new x(this, J2.t.silver);
        }
        return this.f2717P;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
