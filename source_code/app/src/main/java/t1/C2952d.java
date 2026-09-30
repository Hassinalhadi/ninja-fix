package t1;

import U0.o;
import ae.AbstractC0422a;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import g.C1718a;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2;
import s1.C2576i;

/* renamed from: t1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2952d {
    public static int delta;
    public final AccessibilityNodeInfo alpha;
    public int bravo = -1;
    public int charlie = -1;

    public C2952d(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.alpha = accessibilityNodeInfo;
    }

    public static String delta(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                switch (i4) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case Barcode.FORMAT_QR_CODE /* 256 */:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case Barcode.FORMAT_UPC_E /* 1024 */:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case R.id.accessibilityActionMoveWindow:
                        return "ACTION_MOVE_WINDOW";
                    case R.id.KEYCODE_3D_MODE:
                        return "ACTION_SCROLL_IN_DIRECTION";
                    default:
                        switch (i4) {
                            case R.id.accessibilityActionShowOnScreen:
                                return "ACTION_SHOW_ON_SCREEN";
                            case R.id.accessibilityActionScrollToPosition:
                                return "ACTION_SCROLL_TO_POSITION";
                            case R.id.accessibilityActionScrollUp:
                                return "ACTION_SCROLL_UP";
                            case R.id.accessibilityActionScrollLeft:
                                return "ACTION_SCROLL_LEFT";
                            case R.id.accessibilityActionScrollDown:
                                return "ACTION_SCROLL_DOWN";
                            case R.id.accessibilityActionScrollRight:
                                return "ACTION_SCROLL_RIGHT";
                            case R.id.accessibilityActionContextClick:
                                return "ACTION_CONTEXT_CLICK";
                            case R.id.accessibilityActionSetProgress:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i4) {
                                    case R.id.accessibilityActionShowTooltip:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case R.id.accessibilityActionHideTooltip:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case R.id.accessibilityActionPageUp:
                                        return "ACTION_PAGE_UP";
                                    case R.id.accessibilityActionPageDown:
                                        return "ACTION_PAGE_DOWN";
                                    case R.id.accessibilityActionPageLeft:
                                        return "ACTION_PAGE_LEFT";
                                    case R.id.accessibilityActionPageRight:
                                        return "ACTION_PAGE_RIGHT";
                                    case R.id.accessibilityActionPressAndHold:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (i4) {
                                            case R.id.accessibilityActionImeEnter:
                                                return "ACTION_IME_ENTER";
                                            case R.id.ALT:
                                                return "ACTION_DRAG_START";
                                            case R.id.CTRL:
                                                return "ACTION_DRAG_DROP";
                                            case R.id.FUNCTION:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public final void alpha(int i4) {
        this.alpha.addAction(i4);
    }

    public final void bravo(C2951c c2951c) {
        this.alpha.addAction((AccessibilityNodeInfo.AccessibilityAction) c2951c.alpha);
    }

    public final ArrayList charlie(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.alpha;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public final boolean echo(int i4) {
        Bundle extras = this.alpha.getExtras();
        if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i4) != i4) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2952d)) {
            return false;
        }
        C2952d c2952d = (C2952d) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = c2952d.alpha;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.alpha;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        if (this.charlie == c2952d.charlie && this.bravo == c2952d.bravo) {
            return true;
        }
        return false;
    }

    public final void foxtrot(Rect rect) {
        this.alpha.getBoundsInParent(rect);
    }

    public final CharSequence golf() {
        boolean isEmpty = charlie("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.alpha;
        if (!isEmpty) {
            ArrayList charlie = charlie("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList charlie2 = charlie("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList charlie3 = charlie("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList charlie4 = charlie("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i4 = 0; i4 < charlie.size(); i4++) {
                spannableString.setSpan(new C2949a(((Integer) charlie4.get(i4)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) charlie.get(i4)).intValue(), ((Integer) charlie2.get(i4)).intValue(), ((Integer) charlie3.get(i4)).intValue());
            }
            return spannableString;
        }
        return accessibilityNodeInfo.getText();
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.alpha;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void hotel(int i4, boolean z2) {
        Bundle extras = this.alpha.getExtras();
        if (extras != null) {
            int i5 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i4);
            if (!z2) {
                i4 = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i4 | i5);
        }
    }

    public final void india(Rect rect) {
        this.alpha.setBoundsInScreen(rect);
    }

    public final void juliet(CharSequence charSequence) {
        this.alpha.setClassName(charSequence);
    }

    public final void kilo(C1718a c1718a) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        if (c1718a == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) c1718a.purple;
        }
        this.alpha.setCollectionInfo(collectionInfo);
    }

    public final void lima(C2576i c2576i) {
        this.alpha.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c2576i.alpha);
    }

    public final void mike(boolean z2) {
        this.alpha.setScrollable(z2);
    }

    public final void november(CharSequence charSequence) {
        this.alpha.setText(charSequence);
    }

    public final String toString() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String string;
        int i4;
        String str;
        boolean z2;
        int i5;
        CharSequence charSequence4;
        boolean z10;
        boolean echo;
        boolean echo2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        foxtrot(rect);
        sb2.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.alpha;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            AbstractC0422a.delta(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(accessibilityNodeInfo.getPackageName());
        sb2.append("; className: ");
        sb2.append(accessibilityNodeInfo.getClassName());
        sb2.append("; text: ");
        sb2.append(golf());
        sb2.append("; error: ");
        sb2.append(accessibilityNodeInfo.getError());
        sb2.append("; maxTextLength: ");
        sb2.append(accessibilityNodeInfo.getMaxTextLength());
        sb2.append("; stateDescription: ");
        if (i10 >= 30) {
            charSequence = bc.d.delta(accessibilityNodeInfo);
        } else {
            charSequence = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        sb2.append(charSequence);
        sb2.append("; contentDescription: ");
        sb2.append(accessibilityNodeInfo.getContentDescription());
        sb2.append("; supplementalDescription: ");
        if (i10 >= 36) {
            charSequence2 = as.c.charlie(accessibilityNodeInfo);
        } else {
            charSequence2 = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
        }
        sb2.append(charSequence2);
        sb2.append("; tooltipText: ");
        if (i10 >= 28) {
            charSequence3 = accessibilityNodeInfo.getTooltipText();
        } else {
            charSequence3 = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        sb2.append(charSequence3);
        sb2.append("; viewIdResName: ");
        sb2.append(accessibilityNodeInfo.getViewIdResourceName());
        sb2.append("; uniqueId: ");
        if (i10 >= 33) {
            string = o.echo(accessibilityNodeInfo);
        } else {
            string = accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb2.append(string);
        sb2.append("; checkable: ");
        sb2.append(accessibilityNodeInfo.isCheckable());
        sb2.append("; checked: ");
        if (i10 >= 36) {
            i4 = as.c.alpha(accessibilityNodeInfo);
        } else {
            i4 = accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
        }
        String str2 = "PARTIAL";
        if (i4 == 1) {
            str = "TRUE";
        } else if (i4 == 2) {
            str = "PARTIAL";
        } else {
            str = "FALSE";
        }
        sb2.append(str);
        sb2.append("; fieldRequired: ");
        if (i10 >= 36) {
            z2 = as.c.delta(accessibilityNodeInfo);
        } else {
            z2 = accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
        }
        sb2.append(z2);
        sb2.append("; focusable: ");
        sb2.append(accessibilityNodeInfo.isFocusable());
        sb2.append("; focused: ");
        sb2.append(accessibilityNodeInfo.isFocused());
        sb2.append("; selected: ");
        sb2.append(accessibilityNodeInfo.isSelected());
        sb2.append("; clickable: ");
        sb2.append(accessibilityNodeInfo.isClickable());
        sb2.append("; longClickable: ");
        sb2.append(accessibilityNodeInfo.isLongClickable());
        sb2.append("; contextClickable: ");
        sb2.append(accessibilityNodeInfo.isContextClickable());
        sb2.append("; expandedState: ");
        if (i10 >= 36) {
            i5 = as.c.bravo(accessibilityNodeInfo);
        } else {
            i5 = accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        }
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        str2 = "UNKNOWN";
                    } else {
                        str2 = "FULL";
                    }
                }
            } else {
                str2 = "COLLAPSED";
            }
        } else {
            str2 = "UNDEFINED";
        }
        sb2.append(str2);
        sb2.append("; enabled: ");
        sb2.append(accessibilityNodeInfo.isEnabled());
        sb2.append("; password: ");
        sb2.append(accessibilityNodeInfo.isPassword());
        sb2.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb2.append("; containerTitle: ");
        if (i10 >= 34) {
            charSequence4 = AbstractC0422a.echo(accessibilityNodeInfo);
        } else {
            charSequence4 = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        sb2.append(charSequence4);
        sb2.append("; granularScrollingSupported: ");
        sb2.append(echo(67108864));
        sb2.append("; importantForAccessibility: ");
        if (i10 >= 24) {
            z10 = accessibilityNodeInfo.isImportantForAccessibility();
        } else {
            z10 = true;
        }
        sb2.append(z10);
        sb2.append("; visible: ");
        sb2.append(accessibilityNodeInfo.isVisibleToUser());
        sb2.append("; isTextSelectable: ");
        if (i10 >= 33) {
            echo = o.foxtrot(accessibilityNodeInfo);
        } else {
            echo = echo(8388608);
        }
        sb2.append(echo);
        sb2.append("; accessibilityDataSensitive: ");
        if (i10 >= 34) {
            echo2 = AbstractC0422a.juliet(accessibilityNodeInfo);
        } else {
            echo2 = echo(64);
        }
        sb2.append(echo2);
        sb2.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C2951c(actionList.get(i11), 0, null, null, null));
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            C2951c c2951c = (C2951c) arrayList.get(i12);
            String delta2 = delta(c2951c.alpha());
            if (delta2.equals("ACTION_UNKNOWN")) {
                Object obj = c2951c.alpha;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    delta2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb2.append(delta2);
            if (i12 != arrayList.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(Constants.AES_SUFFIX);
        return sb2.toString();
    }
}
