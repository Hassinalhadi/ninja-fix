package s1;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.C0492z;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import t1.C2951c;

/* loaded from: classes3.dex */
public abstract class au {
    public static WeakHashMap alpha;
    public static Field bravo;
    public static boolean charlie;
    public static final int[] delta = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final ag echo = new Object();
    public static final ai foxtrot = new ai();

    public static az alpha(View view) {
        if (alpha == null) {
            alpha = new WeakHashMap();
        }
        az azVar = (az) alpha.get(view);
        if (azVar == null) {
            az azVar2 = new az(view);
            alpha.put(view, azVar2);
            return azVar2;
        }
        return azVar;
    }

    public static a0 bravo(View view, a0 a0Var) {
        WindowInsets alpha2;
        int i4 = Build.VERSION.SDK_INT;
        WindowInsets golf = a0Var.golf();
        if (golf != null) {
            if (i4 >= 30) {
                alpha2 = ar.alpha(view, golf);
            } else {
                alpha2 = aj.alpha(view, golf);
            }
            if (!alpha2.equals(golf)) {
                return a0.hotel(view, alpha2);
            }
        }
        return a0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [s1.at, java.lang.Object] */
    public static boolean charlie(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = at.delta;
            at atVar = (at) view.getTag(R.id.tag_unhandled_key_event_manager);
            at atVar2 = atVar;
            if (atVar == null) {
                ?? obj = new Object();
                obj.alpha = null;
                obj.bravo = null;
                obj.charlie = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, obj);
                atVar2 = obj;
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = atVar2.alpha;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = at.delta;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (atVar2.alpha == null) {
                                atVar2.alpha = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = at.delta;
                                View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view2 == null) {
                                    arrayList3.remove(size);
                                } else {
                                    atVar2.alpha.put(view2, Boolean.TRUE);
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        atVar2.alpha.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View alpha2 = atVar2.alpha(view);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (alpha2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (atVar2.bravo == null) {
                        atVar2.bravo = new SparseArray();
                    }
                    atVar2.bravo.put(keyCode, new WeakReference(alpha2));
                }
            }
            if (alpha2 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static View.AccessibilityDelegate delta(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return aq.alpha(view);
        }
        if (!charlie) {
            if (bravo == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    bravo = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    charlie = true;
                    return null;
                }
            }
            try {
                Object obj = bravo.get(view);
                if (obj instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate) obj;
                }
                return null;
            } catch (Throwable unused2) {
                charlie = true;
                return null;
            }
        }
        return null;
    }

    public static CharSequence echo(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = ap.alpha(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList foxtrot(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] golf(C0492z c0492z) {
        if (Build.VERSION.SDK_INT >= 31) {
            return as.alpha(c0492z);
        }
        return (String[]) c0492z.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void hotel(int i4, View view) {
        boolean z2;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (echo(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i5 = 32;
            if (view.getAccessibilityLiveRegion() == 0 && !z2) {
                if (i4 == 32) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(obtain);
                    obtain.setEventType(32);
                    obtain.setContentChangeTypes(i4);
                    obtain.setSource(view);
                    view.onPopulateAccessibilityEvent(obtain);
                    obtain.getText().add(echo(view));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                    return;
                }
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i4);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            if (!z2) {
                i5 = 2048;
            }
            obtain2.setEventType(i5);
            obtain2.setContentChangeTypes(i4);
            if (z2) {
                obtain2.getText().add(echo(view));
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
            }
            view.sendAccessibilityEventUnchecked(obtain2);
        }
    }

    public static a0 india(View view, a0 a0Var) {
        WindowInsets golf = a0Var.golf();
        if (golf != null) {
            WindowInsets bravo2 = aj.bravo(view, golf);
            if (!bravo2.equals(golf)) {
                return a0.hotel(view, bravo2);
            }
        }
        return a0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C2573f juliet(View view, C2573f c2573f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c2573f + ", view=" + view.getClass().getSimpleName() + Constants.AES_PREFIX + view.getId() + Constants.AES_SUFFIX);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return as.bravo(view, c2573f);
        }
        androidx.core.widget.j jVar = (androidx.core.widget.j) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC2588v interfaceC2588v = echo;
        if (jVar != null) {
            C2573f alpha2 = androidx.core.widget.j.alpha(view, c2573f);
            if (alpha2 == null) {
                return null;
            }
            if (view instanceof InterfaceC2588v) {
                interfaceC2588v = (InterfaceC2588v) view;
            }
            return interfaceC2588v.onReceiveContent(alpha2);
        }
        if (view instanceof InterfaceC2588v) {
            interfaceC2588v = (InterfaceC2588v) view;
        }
        return interfaceC2588v.onReceiveContent(c2573f);
    }

    public static void kilo(int i4, View view) {
        ArrayList foxtrot2 = foxtrot(view);
        for (int i5 = 0; i5 < foxtrot2.size(); i5++) {
            if (((C2951c) foxtrot2.get(i5)).alpha() == i4) {
                foxtrot2.remove(i5);
                return;
            }
        }
    }

    public static void lima(View view, C2951c c2951c, t1.n nVar) {
        C2569b c2569b;
        if (nVar == null) {
            kilo(c2951c.alpha(), view);
            hotel(0, view);
            return;
        }
        C2951c c2951c2 = new C2951c(null, c2951c.bravo, null, nVar, c2951c.charlie);
        View.AccessibilityDelegate delta2 = delta(view);
        if (delta2 == null) {
            c2569b = null;
        } else if (delta2 instanceof C2568a) {
            c2569b = ((C2568a) delta2).alpha;
        } else {
            c2569b = new C2569b(delta2);
        }
        if (c2569b == null) {
            c2569b = new C2569b();
        }
        november(view, c2569b);
        kilo(c2951c2.alpha(), view);
        foxtrot(view).add(c2951c2);
        hotel(0, view);
    }

    public static void mike(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            aq.bravo(view, context, iArr, attributeSet, typedArray, i4, 0);
        }
    }

    public static void november(View view, C2569b c2569b) {
        C2568a c2568a;
        if (c2569b == null && (delta(view) instanceof C2568a)) {
            c2569b = new C2569b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (c2569b == null) {
            c2568a = null;
        } else {
            c2568a = c2569b.bravo;
        }
        view.setAccessibilityDelegate(c2568a);
    }

    public static void oscar(View view, CharSequence charSequence) {
        boolean z2;
        new ah(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).foxtrot(view, charSequence);
        ai aiVar = foxtrot;
        if (charSequence != null) {
            WeakHashMap weakHashMap = aiVar.alpha;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z2));
            view.addOnAttachStateChangeListener(aiVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aiVar);
                return;
            }
            return;
        }
        aiVar.alpha.remove(view);
        view.removeOnAttachStateChangeListener(aiVar);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(aiVar);
    }

    public static void papa(View view, Pf.g gVar) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = null;
        F f5 = null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (gVar != null) {
                f5 = new F(gVar);
            }
            view.setWindowInsetsAnimationCallback(f5);
            return;
        }
        PathInterpolator pathInterpolator = D.echo;
        if (gVar != null) {
            onApplyWindowInsetsListener = new C(view, gVar);
        }
        view.setTag(R.id.tag_window_insets_animation_callback, onApplyWindowInsetsListener);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        }
    }
}
