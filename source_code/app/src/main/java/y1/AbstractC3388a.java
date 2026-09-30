package y1;

import R6.f;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import bv.ax;
import bv.v;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.android.gms.measurement.internal.C1471u;
import com.google.android.gms.measurement.internal.C1473v;
import com.google.android.material.chip.Chip;
import g.C1718a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import s1.C2569b;
import s1.au;
import t0.C2948z;
import t1.C2952d;
import t6.AbstractC3091z3;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3388a extends C2569b {
    public static final Rect november = new Rect(LottieConstants.IterateForever, LottieConstants.IterateForever, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
    public static final C1471u oscar = new C1471u(16);
    public static final C1473v papa = new C1473v(16);
    public final AccessibilityManager hotel;
    public final Chip india;
    public C2948z juliet;
    public final Rect delta = new Rect();
    public final Rect echo = new Rect();
    public final Rect foxtrot = new Rect();
    public final int[] golf = new int[2];
    public int kilo = RecyclerView.UNDEFINED_DURATION;
    public int lima = RecyclerView.UNDEFINED_DURATION;
    public int mike = RecyclerView.UNDEFINED_DURATION;

    public AbstractC3388a(Chip chip) {
        this.india = chip;
        this.hotel = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = au.alpha;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // s1.C2569b
    public final C1718a bravo(View view) {
        if (this.juliet == null) {
            this.juliet = new C2948z(this, 1);
        }
        return this.juliet;
    }

    @Override // s1.C2569b
    public final void delta(View view, C2952d c2952d) {
        boolean z2;
        View.AccessibilityDelegate accessibilityDelegate = this.alpha;
        AccessibilityNodeInfo accessibilityNodeInfo = c2952d.alpha;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((R6.d) this).quebec;
        f fVar = chip.teal;
        if (fVar != null && fVar.f1983T) {
            z2 = true;
        } else {
            z2 = false;
        }
        accessibilityNodeInfo.setCheckable(z2);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c2952d.juliet(chip.getAccessibilityClassName());
        c2952d.november(chip.getText());
    }

    public final boolean juliet(int i4) {
        if (this.lima != i4) {
            return false;
        }
        this.lima = RecyclerView.UNDEFINED_DURATION;
        papa(i4, false);
        romeo(i4, 8);
        return true;
    }

    public final C2952d kilo(int i4) {
        boolean z2;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        C2952d c2952d = new C2952d(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        c2952d.juliet("android.view.View");
        Rect rect = november;
        obtain.setBoundsInParent(rect);
        c2952d.india(rect);
        c2952d.bravo = -1;
        Chip chip = this.india;
        obtain.setParent(chip);
        oscar(i4, c2952d);
        if (c2952d.golf() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.echo;
        c2952d.foxtrot(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(chip.getContext().getPackageName());
                    c2952d.charlie = i4;
                    obtain.setSource(chip, i4);
                    if (this.kilo == i4) {
                        obtain.setAccessibilityFocused(true);
                        c2952d.alpha(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        c2952d.alpha(64);
                    }
                    if (this.lima == i4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        c2952d.alpha(2);
                    } else if (obtain.isFocusable()) {
                        c2952d.alpha(1);
                    }
                    obtain.setFocused(z2);
                    int[] iArr = this.golf;
                    chip.getLocationOnScreen(iArr);
                    Rect rect3 = this.delta;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        c2952d.foxtrot(rect3);
                        if (c2952d.bravo != -1) {
                            C2952d c2952d2 = new C2952d(AccessibilityNodeInfo.obtain());
                            for (int i5 = c2952d.bravo; i5 != -1; i5 = c2952d2.bravo) {
                                c2952d2.bravo = -1;
                                AccessibilityNodeInfo accessibilityNodeInfo = c2952d2.alpha;
                                accessibilityNodeInfo.setParent(chip, -1);
                                accessibilityNodeInfo.setBoundsInParent(rect);
                                oscar(i5, c2952d2);
                                c2952d2.foxtrot(rect2);
                                rect3.offset(rect2.left, rect2.top);
                            }
                        }
                        rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                    }
                    Rect rect4 = this.foxtrot;
                    if (chip.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                        if (rect3.intersect(rect4)) {
                            c2952d.india(rect3);
                            if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                                Object parent = chip.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view = (View) parent;
                                        if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view.getParent();
                                    } else if (parent != null) {
                                        c2952d.alpha.setVisibleToUser(true);
                                    }
                                }
                            }
                        }
                    }
                    return c2952d;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public abstract void lima(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mike(int i4, Rect rect) {
        C2952d c2952d;
        int i5;
        int i10;
        boolean z2;
        Object obj;
        C2952d c2952d2;
        Object obj2;
        int lastIndexOf;
        int i11;
        int golf;
        int i12;
        ArrayList arrayList = new ArrayList();
        lima(arrayList);
        ax axVar = new ax(0);
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            axVar.foxtrot(((Integer) arrayList.get(i13)).intValue(), kilo(((Integer) arrayList.get(i13)).intValue()));
        }
        int i14 = this.lima;
        int i15 = RecyclerView.UNDEFINED_DURATION;
        if (i14 == Integer.MIN_VALUE) {
            c2952d = null;
        } else {
            c2952d = (C2952d) axVar.delta(i14);
        }
        C1471u c1471u = oscar;
        C1473v c1473v = papa;
        Chip chip = this.india;
        if (i4 != 1 && i4 != 2) {
            if (i4 != 17 && i4 != 33 && i4 != 66 && i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i16 = this.lima;
            if (i16 != Integer.MIN_VALUE) {
                november(i16).foxtrot(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i4 != 17) {
                    if (i4 != 33) {
                        if (i4 != 66) {
                            if (i4 == 130) {
                                rect2.set(0, -1, width, -1);
                                i10 = -1;
                            } else {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                        } else {
                            rect2.set(-1, 0, -1, height);
                            i10 = -1;
                        }
                    } else {
                        i10 = -1;
                        rect2.set(0, height, width, height);
                    }
                } else {
                    i10 = -1;
                    rect2.set(width, 0, width, height);
                }
                Rect rect3 = new Rect(rect2);
                if (i4 == 17) {
                    if (i4 != 33) {
                        if (i4 != 66) {
                            if (i4 == 130) {
                                i5 = 0;
                                rect3.offset(0, -(rect2.height() + 1));
                            } else {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                        } else {
                            i5 = 0;
                            rect3.offset(-(rect2.width() + 1), 0);
                        }
                    } else {
                        i5 = 0;
                        rect3.offset(0, rect2.height() + 1);
                    }
                } else {
                    i5 = 0;
                    rect3.offset(rect2.width() + 1, 0);
                }
                c1473v.getClass();
                golf = axVar.golf();
                Rect rect4 = new Rect();
                c2952d2 = null;
                for (i12 = i5; i12 < golf; i12++) {
                    C2952d c2952d3 = (C2952d) axVar.hotel(i12);
                    if (c2952d3 != c2952d) {
                        c1471u.getClass();
                        c2952d3.foxtrot(rect4);
                        if (AbstractC3091z3.delta(i4, rect2, rect4)) {
                            if (AbstractC3091z3.delta(i4, rect2, rect3) && !AbstractC3091z3.alpha(i4, rect2, rect4, rect3)) {
                                if (!AbstractC3091z3.alpha(i4, rect2, rect3, rect4)) {
                                    int echo = AbstractC3091z3.echo(i4, rect2, rect4);
                                    int foxtrot = AbstractC3091z3.foxtrot(i4, rect2, rect4);
                                    int i17 = (foxtrot * foxtrot) + (echo * 13 * echo);
                                    int echo2 = AbstractC3091z3.echo(i4, rect2, rect3);
                                    int foxtrot2 = AbstractC3091z3.foxtrot(i4, rect2, rect3);
                                    if (i17 >= (foxtrot2 * foxtrot2) + (echo2 * 13 * echo2)) {
                                    }
                                }
                            }
                            rect3.set(rect4);
                            c2952d2 = c2952d3;
                        }
                    }
                }
            }
            i10 = -1;
            Rect rect32 = new Rect(rect2);
            if (i4 == 17) {
            }
            c1473v.getClass();
            golf = axVar.golf();
            Rect rect42 = new Rect();
            c2952d2 = null;
            while (i12 < golf) {
            }
        } else {
            i5 = 0;
            i10 = -1;
            WeakHashMap weakHashMap = au.alpha;
            if (chip.getLayoutDirection() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1473v.getClass();
            int golf2 = axVar.golf();
            ArrayList arrayList2 = new ArrayList(golf2);
            for (int i18 = 0; i18 < golf2; i18++) {
                arrayList2.add((C2952d) axVar.hotel(i18));
            }
            Collections.sort(arrayList2, new C3389b(z2, c1471u));
            if (i4 != 1) {
                if (i4 == 2) {
                    int size = arrayList2.size();
                    if (c2952d == null) {
                        lastIndexOf = -1;
                    } else {
                        lastIndexOf = arrayList2.lastIndexOf(c2952d);
                    }
                    int i19 = lastIndexOf + 1;
                    if (i19 < size) {
                        obj2 = arrayList2.get(i19);
                        obj = obj2;
                    }
                    obj = null;
                } else {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
            } else {
                int size2 = arrayList2.size();
                if (c2952d != null) {
                    size2 = arrayList2.indexOf(c2952d);
                }
                int i20 = size2 - 1;
                if (i20 >= 0) {
                    obj2 = arrayList2.get(i20);
                    obj = obj2;
                }
                obj = null;
            }
            c2952d2 = (C2952d) obj;
        }
        C2952d c2952d4 = c2952d2;
        if (c2952d4 != null) {
            if (axVar.alpha) {
                v.alpha(axVar);
            }
            int i21 = axVar.silver;
            int i22 = i5;
            while (true) {
                if (i22 < i21) {
                    if (axVar.red[i22] == c2952d4) {
                        i11 = i22;
                        break;
                    }
                    i22++;
                } else {
                    i11 = i10;
                    break;
                }
            }
            i15 = axVar.echo(i11);
        }
        return quebec(i15);
    }

    public final C2952d november(int i4) {
        if (i4 == -1) {
            Chip chip = this.india;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
            C2952d c2952d = new C2952d(obtain);
            WeakHashMap weakHashMap = au.alpha;
            chip.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            lima(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                c2952d.alpha.addChild(chip, ((Integer) arrayList.get(i5)).intValue());
            }
            return c2952d;
        }
        return kilo(i4);
    }

    public abstract void oscar(int i4, C2952d c2952d);

    public abstract void papa(int i4, boolean z2);

    public final boolean quebec(int i4) {
        int i5;
        Chip chip = this.india;
        if ((chip.isFocused() || chip.requestFocus()) && (i5 = this.lima) != i4) {
            if (i5 != Integer.MIN_VALUE) {
                juliet(i5);
            }
            if (i4 == Integer.MIN_VALUE) {
                return false;
            }
            this.lima = i4;
            papa(i4, true);
            romeo(i4, 8);
            return true;
        }
        return false;
    }

    public final void romeo(int i4, int i5) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i4 != Integer.MIN_VALUE && this.hotel.isEnabled() && (parent = (view = this.india).getParent()) != null) {
            if (i4 != -1) {
                obtain = AccessibilityEvent.obtain(i5);
                C2952d november2 = november(i4);
                obtain.getText().add(november2.golf());
                AccessibilityNodeInfo accessibilityNodeInfo = november2.alpha;
                obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
                obtain.setScrollable(accessibilityNodeInfo.isScrollable());
                obtain.setPassword(accessibilityNodeInfo.isPassword());
                obtain.setEnabled(accessibilityNodeInfo.isEnabled());
                obtain.setChecked(accessibilityNodeInfo.isChecked());
                if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                }
                obtain.setClassName(accessibilityNodeInfo.getClassName());
                obtain.setSource(view, i4);
                obtain.setPackageName(view.getContext().getPackageName());
            } else {
                obtain = AccessibilityEvent.obtain(i5);
                view.onInitializeAccessibilityEvent(obtain);
            }
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }
}
