package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0450d0;
import androidx.core.widget.NestedScrollView;
import delivery.samurai.android.R;
import java.util.WeakHashMap;
import s1.au;

/* loaded from: classes3.dex */
public final class g extends ad implements DialogInterface {
    public final f alpha;

    public g(ContextThemeWrapper contextThemeWrapper, int i4) {
        super(contextThemeWrapper, bravo(i4, contextThemeWrapper));
        this.alpha = new f(getContext(), this, getWindow());
    }

    public static int bravo(int i4, Context context) {
        if (((i4 >>> 24) & 255) >= 1) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02cb  */
    @Override // androidx.appcompat.app.ad, ae.p, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        boolean z2;
        int i4;
        int i5;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        AlertController$RecycleListView alertController$RecycleListView;
        AlertController$RecycleListView alertController$RecycleListView2;
        ListAdapter listAdapter;
        int i12;
        int i13;
        View findViewById;
        View findViewById2;
        super.onCreate(bundle);
        f fVar = this.alpha;
        fVar.bravo.setContentView(fVar.zulu);
        Window window = fVar.charlie;
        View findViewById3 = window.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        View view = fVar.golf;
        if (view == null) {
            view = null;
        }
        int i14 = 0;
        if (view != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !f.alpha(view)) {
            window.setFlags(131072, 131072);
        }
        if (z2) {
            i4 = 2;
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (fVar.hotel) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (fVar.foxtrot != null) {
                ((LinearLayout.LayoutParams) ((C0450d0) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            i4 = 2;
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup bravo = f.bravo(findViewById7, findViewById4);
        ViewGroup bravo2 = f.bravo(findViewById8, findViewById5);
        ViewGroup bravo3 = f.bravo(findViewById9, findViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        fVar.romeo = nestedScrollView;
        nestedScrollView.setFocusable(false);
        fVar.romeo.setNestedScrollingEnabled(false);
        TextView textView = (TextView) bravo2.findViewById(android.R.id.message);
        fVar.victor = textView;
        if (textView != null) {
            CharSequence charSequence = fVar.echo;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                fVar.romeo.removeView(fVar.victor);
                if (fVar.foxtrot != null) {
                    ViewGroup viewGroup2 = (ViewGroup) fVar.romeo.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(fVar.romeo);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(fVar.foxtrot, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    bravo2.setVisibility(8);
                }
            }
        }
        Button button = (Button) bravo3.findViewById(android.R.id.button1);
        fVar.india = button;
        Z8.c cVar = fVar.bronze;
        button.setOnClickListener(cVar);
        if (TextUtils.isEmpty(fVar.juliet)) {
            fVar.india.setVisibility(8);
            i5 = 0;
        } else {
            fVar.india.setText(fVar.juliet);
            fVar.india.setVisibility(0);
            i5 = 1;
        }
        Button button2 = (Button) bravo3.findViewById(android.R.id.button2);
        fVar.lima = button2;
        button2.setOnClickListener(cVar);
        if (TextUtils.isEmpty(fVar.mike)) {
            fVar.lima.setVisibility(8);
        } else {
            fVar.lima.setText(fVar.mike);
            fVar.lima.setVisibility(0);
            i5 |= 2;
        }
        Button button3 = (Button) bravo3.findViewById(android.R.id.button3);
        fVar.oscar = button3;
        button3.setOnClickListener(cVar);
        if (TextUtils.isEmpty(fVar.papa)) {
            fVar.oscar.setVisibility(8);
        } else {
            fVar.oscar.setText(fVar.papa);
            fVar.oscar.setVisibility(0);
            i5 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        fVar.alpha.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i5 == 1) {
                Button button4 = fVar.india;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else {
                i10 = i4;
                if (i5 == i10) {
                    Button button5 = fVar.lima;
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                    layoutParams2.gravity = 1;
                    layoutParams2.weight = 0.5f;
                    button5.setLayoutParams(layoutParams2);
                } else if (i5 == 4) {
                    Button button6 = fVar.oscar;
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                    layoutParams3.gravity = 1;
                    layoutParams3.weight = 0.5f;
                    button6.setLayoutParams(layoutParams3);
                }
                if (i5 == 0) {
                    bravo3.setVisibility(8);
                }
                if (fVar.whiskey == null) {
                    bravo.addView(fVar.whiskey, 0, new ViewGroup.LayoutParams(-1, -2));
                    window.findViewById(R.id.title_template).setVisibility(8);
                } else {
                    fVar.tango = (ImageView) window.findViewById(android.R.id.icon);
                    if (!TextUtils.isEmpty(fVar.delta) && fVar.black) {
                        TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                        fVar.uniform = textView2;
                        textView2.setText(fVar.delta);
                        Drawable drawable = fVar.sierra;
                        if (drawable != null) {
                            fVar.tango.setImageDrawable(drawable);
                        } else {
                            fVar.uniform.setPadding(fVar.tango.getPaddingLeft(), fVar.tango.getPaddingTop(), fVar.tango.getPaddingRight(), fVar.tango.getPaddingBottom());
                            fVar.tango.setVisibility(8);
                        }
                    } else {
                        window.findViewById(R.id.title_template).setVisibility(8);
                        fVar.tango.setVisibility(8);
                        bravo.setVisibility(8);
                    }
                }
                if (viewGroup.getVisibility() == 8) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (bravo == null && bravo.getVisibility() != 8) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (bravo3.getVisibility() == 8) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 && (findViewById2 = bravo2.findViewById(R.id.textSpacerNoButtons)) != null) {
                    findViewById2.setVisibility(0);
                }
                if (i11 == 0) {
                    NestedScrollView nestedScrollView2 = fVar.romeo;
                    if (nestedScrollView2 != null) {
                        nestedScrollView2.setClipToPadding(true);
                    }
                    if (fVar.echo == null && fVar.foxtrot == null) {
                        findViewById = null;
                    } else {
                        findViewById = bravo.findViewById(R.id.titleDividerNoCustom);
                    }
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                    }
                } else {
                    View findViewById10 = bravo2.findViewById(R.id.textSpacerNoTitle);
                    if (findViewById10 != null) {
                        findViewById10.setVisibility(0);
                    }
                }
                alertController$RecycleListView = fVar.foxtrot;
                if (alertController$RecycleListView != null) {
                    alertController$RecycleListView.getClass();
                    if (!z11 || i11 == 0) {
                        int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                        if (i11 != 0) {
                            i12 = alertController$RecycleListView.getPaddingTop();
                        } else {
                            i12 = alertController$RecycleListView.alpha;
                        }
                        int paddingRight = alertController$RecycleListView.getPaddingRight();
                        if (z11) {
                            i13 = alertController$RecycleListView.getPaddingBottom();
                        } else {
                            i13 = alertController$RecycleListView.purple;
                        }
                        alertController$RecycleListView.setPadding(paddingLeft, i12, paddingRight, i13);
                    }
                }
                if (!z10) {
                    View view2 = fVar.foxtrot;
                    if (view2 == null) {
                        view2 = fVar.romeo;
                    }
                    if (view2 != null) {
                        if (z11) {
                            i14 = i10;
                        }
                        int i15 = i11 | i14;
                        View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                        View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                        WeakHashMap weakHashMap = au.alpha;
                        s1.am.bravo(view2, i15, 3);
                        if (findViewById11 != null) {
                            bravo2.removeView(findViewById11);
                        }
                        if (findViewById12 != null) {
                            bravo2.removeView(findViewById12);
                        }
                    }
                }
                alertController$RecycleListView2 = fVar.foxtrot;
                if (alertController$RecycleListView2 == null && (listAdapter = fVar.xray) != null) {
                    alertController$RecycleListView2.setAdapter(listAdapter);
                    int i16 = fVar.yankee;
                    if (i16 > -1) {
                        alertController$RecycleListView2.setItemChecked(i16, true);
                        alertController$RecycleListView2.setSelection(i16);
                        return;
                    }
                    return;
                }
            }
        }
        i10 = i4;
        if (i5 == 0) {
        }
        if (fVar.whiskey == null) {
        }
        if (viewGroup.getVisibility() == 8) {
        }
        if (bravo == null) {
        }
        i11 = 0;
        if (bravo3.getVisibility() == 8) {
        }
        if (!z11) {
            findViewById2.setVisibility(0);
        }
        if (i11 == 0) {
        }
        alertController$RecycleListView = fVar.foxtrot;
        if (alertController$RecycleListView != null) {
        }
        if (!z10) {
        }
        alertController$RecycleListView2 = fVar.foxtrot;
        if (alertController$RecycleListView2 == null) {
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.alpha.romeo;
        if (nestedScrollView != null && nestedScrollView.delta(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.alpha.romeo;
        if (nestedScrollView != null && nestedScrollView.delta(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i4, keyEvent);
    }

    @Override // androidx.appcompat.app.ad, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f fVar = this.alpha;
        fVar.delta = charSequence;
        TextView textView = fVar.uniform;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
