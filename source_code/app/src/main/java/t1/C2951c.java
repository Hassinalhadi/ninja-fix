package t1;

import ae.AbstractC0422a;
import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.mlkit.vision.barcode.common.Barcode;
import okhttp3.internal.http2.Http2;

/* renamed from: t1.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2951c {
    public static final C2951c echo = new C2951c(1, (String) null);
    public static final C2951c foxtrot = new C2951c(2, (String) null);
    public static final C2951c golf;
    public static final C2951c hotel;
    public static final C2951c india;
    public static final C2951c juliet;
    public static final C2951c kilo;
    public static final C2951c lima;
    public static final C2951c mike;
    public static final C2951c november;
    public static final C2951c oscar;
    public static final C2951c papa;
    public static final C2951c quebec;
    public static final C2951c romeo;
    public final Object alpha;
    public final int bravo;
    public final Class charlie;
    public final n delta;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction25 = null;
        new C2951c(4, (String) null);
        new C2951c(8, (String) null);
        golf = new C2951c(16, (String) null);
        new C2951c(32, (String) null);
        hotel = new C2951c(64, (String) null);
        india = new C2951c(128, (String) null);
        new C2951c(Barcode.FORMAT_QR_CODE, g.class);
        new C2951c(512, g.class);
        new C2951c(Barcode.FORMAT_UPC_E, h.class);
        new C2951c(2048, h.class);
        juliet = new C2951c(4096, (String) null);
        kilo = new C2951c(8192, (String) null);
        new C2951c(Http2.INITIAL_MAX_FRAME_SIZE, (String) null);
        new C2951c(32768, (String) null);
        new C2951c(65536, (String) null);
        new C2951c(131072, l.class);
        lima = new C2951c(262144, (String) null);
        mike = new C2951c(524288, (String) null);
        november = new C2951c(1048576, (String) null);
        new C2951c(2097152, m.class);
        int i4 = Build.VERSION.SDK_INT;
        new C2951c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C2951c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, j.class);
        oscar = new C2951c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        papa = new C2951c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        quebec = new C2951c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        romeo = new C2951c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        if (i4 >= 29) {
            accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            accessibilityAction = accessibilityAction24;
        } else {
            accessibilityAction = null;
        }
        new C2951c(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
        if (i4 >= 29) {
            accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction23;
        } else {
            accessibilityAction2 = null;
        }
        new C2951c(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
        if (i4 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new C2951c(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
        if (i4 >= 29) {
            accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction4 = accessibilityAction22;
        } else {
            accessibilityAction4 = null;
        }
        new C2951c(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
        new C2951c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        if (i4 >= 24) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            accessibilityAction5 = accessibilityAction21;
        } else {
            accessibilityAction5 = null;
        }
        new C2951c(accessibilityAction5, R.id.accessibilityActionSetProgress, null, null, k.class);
        if (i4 >= 26) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction6 = null;
        }
        new C2951c(accessibilityAction6, R.id.accessibilityActionMoveWindow, null, null, i.class);
        if (i4 >= 28) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction7 = accessibilityAction20;
        } else {
            accessibilityAction7 = null;
        }
        new C2951c(accessibilityAction7, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i4 >= 28) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction8 = accessibilityAction19;
        } else {
            accessibilityAction8 = null;
        }
        new C2951c(accessibilityAction8, R.id.accessibilityActionHideTooltip, null, null, null);
        if (i4 >= 30) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction9 = null;
        }
        new C2951c(accessibilityAction9, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i4 >= 30) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction10 = accessibilityAction18;
        } else {
            accessibilityAction10 = null;
        }
        new C2951c(accessibilityAction10, R.id.accessibilityActionImeEnter, null, null, null);
        if (i4 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction11 = null;
        }
        new C2951c(accessibilityAction11, R.id.ALT, null, null, null);
        if (i4 >= 32) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction12 = accessibilityAction17;
        } else {
            accessibilityAction12 = null;
        }
        new C2951c(accessibilityAction12, R.id.CTRL, null, null, null);
        if (i4 >= 32) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction13 = accessibilityAction16;
        } else {
            accessibilityAction13 = null;
        }
        new C2951c(accessibilityAction13, R.id.FUNCTION, null, null, null);
        if (i4 >= 33) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction14 = accessibilityAction15;
        } else {
            accessibilityAction14 = null;
        }
        new C2951c(accessibilityAction14, R.id.KEYCODE_0, null, null, null);
        if (i4 >= 34) {
            accessibilityAction25 = AbstractC0422a.bravo();
        }
        new C2951c(accessibilityAction25, R.id.KEYCODE_3D_MODE, null, null, null);
    }

    public C2951c(int i4, String str) {
        this(null, i4, str, null, null);
    }

    public final int alpha() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.alpha).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2951c)) {
            return false;
        }
        Object obj2 = ((C2951c) obj).alpha;
        Object obj3 = this.alpha;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        if (!obj3.equals(obj2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.alpha;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String delta = C2952d.delta(this.bravo);
        if (delta.equals("ACTION_UNKNOWN")) {
            Object obj = this.alpha;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                delta = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(delta);
        return sb2.toString();
    }

    public C2951c(int i4, Class cls) {
        this(null, i4, null, null, cls);
    }

    public C2951c(Object obj, int i4, String str, n nVar, Class cls) {
        this.bravo = i4;
        this.delta = nVar;
        if (obj == null) {
            this.alpha = new AccessibilityNodeInfo.AccessibilityAction(i4, str);
        } else {
            this.alpha = obj;
        }
        this.charlie = cls;
    }
}
