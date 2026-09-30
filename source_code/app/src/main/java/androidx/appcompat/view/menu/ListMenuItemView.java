package androidx.appcompat.view.menu;

import aj.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import ao.l;
import ao.n;
import ao.y;
import delivery.samurai.android.R;
import id.C1915c;

/* loaded from: classes3.dex */
public class ListMenuItemView extends LinearLayout implements y, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public ImageView f2757a;
    public n alpha;

    /* renamed from: b, reason: collision with root package name */
    public LinearLayout f2758b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f2759c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2760d;
    public final Context e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2761f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f2762g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2763h;

    /* renamed from: i, reason: collision with root package name */
    public LayoutInflater f2764i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2765j;
    public ImageView purple;
    public RadioButton red;
    public TextView silver;
    public CheckBox teal;
    public TextView white;
    public ImageView yellow;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1915c victor = C1915c.victor(getContext(), attributeSet, a.sierra, R.attr.listMenuViewStyle);
        this.f2759c = victor.oscar(5);
        TypedArray typedArray = (TypedArray) victor.red;
        this.f2760d = typedArray.getResourceId(1, -1);
        this.f2761f = typedArray.getBoolean(7, false);
        this.e = context;
        this.f2762g = victor.oscar(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f2763h = obtainStyledAttributes.hasValue(0);
        victor.xray();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f2764i == null) {
            this.f2764i = LayoutInflater.from(getContext());
        }
        return this.f2764i;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        int i4;
        ImageView imageView = this.yellow;
        if (imageView != null) {
            if (z2) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            imageView.setVisibility(i4);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f2757a;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2757a.getLayoutParams();
            rect.top = this.f2757a.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // ao.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void charlie(n nVar) {
        int i4;
        boolean z2;
        char c3;
        int i5;
        String sb2;
        boolean z10;
        char c4;
        char c10;
        this.alpha = nVar;
        int i10 = 0;
        if (nVar.isVisible()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        setVisibility(i4);
        setTitle(nVar.teal);
        setCheckable(nVar.isCheckable());
        if (nVar.f3224g.oscar()) {
            if (nVar.f3224g.november()) {
                c10 = nVar.f3221c;
            } else {
                c10 = nVar.f3219a;
            }
            if (c10 != 0) {
                z2 = true;
                nVar.f3224g.november();
                if (z2) {
                    n nVar2 = this.alpha;
                    if (nVar2.f3224g.oscar()) {
                        if (nVar2.f3224g.november()) {
                            c4 = nVar2.f3221c;
                        } else {
                            c4 = nVar2.f3219a;
                        }
                        if (c4 != 0) {
                            z10 = true;
                        }
                    }
                    z10 = false;
                }
                i10 = 8;
                if (i10 == 0) {
                    TextView textView = this.white;
                    n nVar3 = this.alpha;
                    if (nVar3.f3224g.november()) {
                        c3 = nVar3.f3221c;
                    } else {
                        c3 = nVar3.f3219a;
                    }
                    if (c3 == 0) {
                        sb2 = "";
                    } else {
                        l lVar = nVar3.f3224g;
                        Resources resources = lVar.alpha.getResources();
                        StringBuilder sb3 = new StringBuilder();
                        if (ViewConfiguration.get(lVar.alpha).hasPermanentMenuKey()) {
                            sb3.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        if (lVar.november()) {
                            i5 = nVar3.f3222d;
                        } else {
                            i5 = nVar3.f3220b;
                        }
                        n.charlie(i5, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb3);
                        n.charlie(i5, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb3);
                        n.charlie(i5, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb3);
                        n.charlie(i5, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb3);
                        n.charlie(i5, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb3);
                        n.charlie(i5, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb3);
                        if (c3 != '\b') {
                            if (c3 != '\n') {
                                if (c3 != ' ') {
                                    sb3.append(c3);
                                } else {
                                    sb3.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                                }
                            } else {
                                sb3.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                            }
                        } else {
                            sb3.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        }
                        sb2 = sb3.toString();
                    }
                    textView.setText(sb2);
                }
                if (this.white.getVisibility() != i10) {
                    this.white.setVisibility(i10);
                }
                setIcon(nVar.getIcon());
                setEnabled(nVar.isEnabled());
                setSubMenuArrowVisible(nVar.hasSubMenu());
                setContentDescription(nVar.f3227j);
            }
        }
        z2 = false;
        nVar.f3224g.november();
        if (z2) {
        }
        i10 = 8;
        if (i10 == 0) {
        }
        if (this.white.getVisibility() != i10) {
        }
        setIcon(nVar.getIcon());
        setEnabled(nVar.isEnabled());
        setSubMenuArrowVisible(nVar.hasSubMenu());
        setContentDescription(nVar.f3227j);
    }

    @Override // ao.y
    public n getItemData() {
        return this.alpha;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f2759c);
        TextView textView = (TextView) findViewById(R.id.title);
        this.silver = textView;
        int i4 = this.f2760d;
        if (i4 != -1) {
            textView.setTextAppearance(this.e, i4);
        }
        this.white = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.yellow = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2762g);
        }
        this.f2757a = (ImageView) findViewById(R.id.group_divider);
        this.f2758b = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        if (this.purple != null && this.f2761f) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.purple.getLayoutParams();
            int i10 = layoutParams.height;
            if (i10 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i10;
            }
        }
        super.onMeasure(i4, i5);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (z2 || this.red != null || this.teal != null) {
            if ((this.alpha.f3234q & 4) != 0) {
                if (this.red == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.red = radioButton;
                    LinearLayout linearLayout = this.f2758b;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.red;
                view = this.teal;
            } else {
                if (this.teal == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.teal = checkBox;
                    LinearLayout linearLayout2 = this.f2758b;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.teal;
                view = this.red;
            }
            if (z2) {
                compoundButton.setChecked(this.alpha.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.teal;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.red;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.alpha.f3234q & 4) != 0) {
            if (this.red == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.red = radioButton;
                LinearLayout linearLayout = this.f2758b;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.red;
        } else {
            if (this.teal == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.teal = checkBox;
                LinearLayout linearLayout2 = this.f2758b;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.teal;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f2765j = z2;
        this.f2761f = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        int i4;
        ImageView imageView = this.f2757a;
        if (imageView != null) {
            if (!this.f2763h && z2) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            imageView.setVisibility(i4);
        }
    }

    public void setIcon(Drawable drawable) {
        this.alpha.f3224g.getClass();
        boolean z2 = this.f2765j;
        if (z2 || this.f2761f) {
            ImageView imageView = this.purple;
            if (imageView != null || drawable != null || this.f2761f) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                    this.purple = imageView2;
                    LinearLayout linearLayout = this.f2758b;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable == null && !this.f2761f) {
                    this.purple.setVisibility(8);
                    return;
                }
                ImageView imageView3 = this.purple;
                if (!z2) {
                    drawable = null;
                }
                imageView3.setImageDrawable(drawable);
                if (this.purple.getVisibility() != 0) {
                    this.purple.setVisibility(0);
                }
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.silver.setText(charSequence);
            if (this.silver.getVisibility() != 0) {
                this.silver.setVisibility(0);
                return;
            }
            return;
        }
        if (this.silver.getVisibility() != 8) {
            this.silver.setVisibility(8);
        }
    }
}
