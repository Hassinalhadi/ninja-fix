package c1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: c1.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0806e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public int f3460a;
    public int alpha;
    public int amber;
    public int azure;

    /* renamed from: b, reason: collision with root package name */
    public int f3461b;
    public final int beige;
    public final int black;
    public float blue;
    public int bravo;
    public float bronze;

    /* renamed from: c, reason: collision with root package name */
    public int f3462c;
    public float charlie;
    public String coral;
    public float crimson;
    public float cyan;

    /* renamed from: d, reason: collision with root package name */
    public float f3463d;
    public final boolean delta;
    public int e;
    public int echo;
    public int emerald;

    /* renamed from: f, reason: collision with root package name */
    public int f3464f;
    public int foxtrot;
    public int fuchsia;

    /* renamed from: g, reason: collision with root package name */
    public float f3465g;
    public int gold;
    public int golf;
    public int gray;
    public int green;

    /* renamed from: h, reason: collision with root package name */
    public Z0.d f3466h;
    public int hotel;
    public int india;
    public int indigo;
    public int ivory;
    public int jade;
    public int juliet;
    public int kilo;
    public float lavender;
    public int lima;
    public float lime;
    public int magenta;
    public int maroon;
    public int mike;
    public int navy;
    public int november;
    public boolean ochre;
    public boolean olive;
    public String orange;
    public int oscar;
    public int papa;
    public int peach;
    public boolean pink;
    public boolean plum;
    public boolean purple;
    public int quebec;
    public boolean red;
    public float romeo;
    public int sierra;
    public boolean silver;
    public int tango;
    public int teal;
    public int uniform;
    public int victor;
    public final int whiskey;
    public int white;
    public int xray;
    public final int yankee;
    public int yellow;
    public int zulu;

    public C0806e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.alpha = -1;
        this.bravo = -1;
        this.charlie = -1.0f;
        this.delta = true;
        this.echo = -1;
        this.foxtrot = -1;
        this.golf = -1;
        this.hotel = -1;
        this.india = -1;
        this.juliet = -1;
        this.kilo = -1;
        this.lima = -1;
        this.mike = -1;
        this.november = -1;
        this.oscar = -1;
        this.papa = -1;
        this.quebec = 0;
        this.romeo = 0.0f;
        this.sierra = -1;
        this.tango = -1;
        this.uniform = -1;
        this.victor = -1;
        this.whiskey = RecyclerView.UNDEFINED_DURATION;
        this.xray = RecyclerView.UNDEFINED_DURATION;
        this.yankee = RecyclerView.UNDEFINED_DURATION;
        this.zulu = RecyclerView.UNDEFINED_DURATION;
        this.amber = RecyclerView.UNDEFINED_DURATION;
        this.azure = RecyclerView.UNDEFINED_DURATION;
        this.beige = RecyclerView.UNDEFINED_DURATION;
        this.black = 0;
        this.blue = 0.5f;
        this.bronze = 0.5f;
        this.coral = null;
        this.crimson = -1.0f;
        this.cyan = -1.0f;
        this.emerald = 0;
        this.fuchsia = 0;
        this.gold = 0;
        this.gray = 0;
        this.green = 0;
        this.indigo = 0;
        this.ivory = 0;
        this.jade = 0;
        this.lavender = 1.0f;
        this.lime = 1.0f;
        this.magenta = -1;
        this.maroon = -1;
        this.navy = -1;
        this.ochre = false;
        this.olive = false;
        this.orange = null;
        this.peach = 0;
        this.pink = true;
        this.plum = true;
        this.purple = false;
        this.red = false;
        this.silver = false;
        this.teal = -1;
        this.white = -1;
        this.yellow = -1;
        this.f3460a = -1;
        this.f3461b = RecyclerView.UNDEFINED_DURATION;
        this.f3462c = RecyclerView.UNDEFINED_DURATION;
        this.f3463d = 0.5f;
        this.f3466h = new Z0.d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
            setMarginStart(marginLayoutParams.getMarginStart());
            setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (layoutParams instanceof C0806e) {
            C0806e c0806e = (C0806e) layoutParams;
            this.alpha = c0806e.alpha;
            this.bravo = c0806e.bravo;
            this.charlie = c0806e.charlie;
            this.delta = c0806e.delta;
            this.echo = c0806e.echo;
            this.foxtrot = c0806e.foxtrot;
            this.golf = c0806e.golf;
            this.hotel = c0806e.hotel;
            this.india = c0806e.india;
            this.juliet = c0806e.juliet;
            this.kilo = c0806e.kilo;
            this.lima = c0806e.lima;
            this.mike = c0806e.mike;
            this.november = c0806e.november;
            this.oscar = c0806e.oscar;
            this.papa = c0806e.papa;
            this.quebec = c0806e.quebec;
            this.romeo = c0806e.romeo;
            this.sierra = c0806e.sierra;
            this.tango = c0806e.tango;
            this.uniform = c0806e.uniform;
            this.victor = c0806e.victor;
            this.whiskey = c0806e.whiskey;
            this.xray = c0806e.xray;
            this.yankee = c0806e.yankee;
            this.zulu = c0806e.zulu;
            this.amber = c0806e.amber;
            this.azure = c0806e.azure;
            this.beige = c0806e.beige;
            this.black = c0806e.black;
            this.blue = c0806e.blue;
            this.bronze = c0806e.bronze;
            this.coral = c0806e.coral;
            this.crimson = c0806e.crimson;
            this.cyan = c0806e.cyan;
            this.emerald = c0806e.emerald;
            this.fuchsia = c0806e.fuchsia;
            this.ochre = c0806e.ochre;
            this.olive = c0806e.olive;
            this.gold = c0806e.gold;
            this.gray = c0806e.gray;
            this.green = c0806e.green;
            this.ivory = c0806e.ivory;
            this.indigo = c0806e.indigo;
            this.jade = c0806e.jade;
            this.lavender = c0806e.lavender;
            this.lime = c0806e.lime;
            this.magenta = c0806e.magenta;
            this.maroon = c0806e.maroon;
            this.navy = c0806e.navy;
            this.pink = c0806e.pink;
            this.plum = c0806e.plum;
            this.purple = c0806e.purple;
            this.red = c0806e.red;
            this.teal = c0806e.teal;
            this.white = c0806e.white;
            this.yellow = c0806e.yellow;
            this.f3460a = c0806e.f3460a;
            this.f3461b = c0806e.f3461b;
            this.f3462c = c0806e.f3462c;
            this.f3463d = c0806e.f3463d;
            this.orange = c0806e.orange;
            this.peach = c0806e.peach;
            this.f3466h = c0806e.f3466h;
        }
    }

    public final void alpha() {
        this.red = false;
        this.pink = true;
        this.plum = true;
        int i4 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i4 == -2 && this.ochre) {
            this.pink = false;
            if (this.gold == 0) {
                this.gold = 1;
            }
        }
        int i5 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i5 == -2 && this.olive) {
            this.plum = false;
            if (this.gray == 0) {
                this.gray = 1;
            }
        }
        if (i4 == 0 || i4 == -1) {
            this.pink = false;
            if (i4 == 0 && this.gold == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.ochre = true;
            }
        }
        if (i5 == 0 || i5 == -1) {
            this.plum = false;
            if (i5 == 0 && this.gray == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.olive = true;
            }
        }
        if (this.charlie == -1.0f && this.alpha == -1 && this.bravo == -1) {
            return;
        }
        this.red = true;
        this.pink = true;
        this.plum = true;
        if (!(this.f3466h instanceof Z0.h)) {
            this.f3466h = new Z0.h();
        }
        ((Z0.h) this.f3466h).lime(this.navy);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void resolveLayoutDirection(int i4) {
        boolean z2;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i14 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i4);
        boolean z10 = false;
        if (1 == getLayoutDirection()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.yellow = -1;
        this.f3460a = -1;
        this.teal = -1;
        this.white = -1;
        this.f3461b = this.whiskey;
        this.f3462c = this.yankee;
        float f5 = this.blue;
        this.f3463d = f5;
        int i15 = this.alpha;
        this.e = i15;
        int i16 = this.bravo;
        this.f3464f = i16;
        float f10 = this.charlie;
        this.f3465g = f10;
        if (z2) {
            int i17 = this.sierra;
            if (i17 != -1) {
                this.yellow = i17;
            } else {
                int i18 = this.tango;
                if (i18 != -1) {
                    this.f3460a = i18;
                }
                i5 = this.uniform;
                if (i5 != -1) {
                    this.white = i5;
                    z10 = true;
                }
                i10 = this.victor;
                if (i10 != -1) {
                    this.teal = i10;
                    z10 = true;
                }
                i11 = this.amber;
                if (i11 != Integer.MIN_VALUE) {
                    this.f3462c = i11;
                }
                i12 = this.azure;
                if (i12 != Integer.MIN_VALUE) {
                    this.f3461b = i12;
                }
                if (z10) {
                    this.f3463d = 1.0f - f5;
                }
                if (this.red && this.navy == 1 && this.delta) {
                    if (f10 == -1.0f) {
                        this.f3465g = 1.0f - f10;
                        this.e = -1;
                        this.f3464f = -1;
                    } else if (i15 != -1) {
                        this.f3464f = i15;
                        this.e = -1;
                        this.f3465g = -1.0f;
                    } else if (i16 != -1) {
                        this.e = i16;
                        this.f3464f = -1;
                        this.f3465g = -1.0f;
                    }
                }
            }
            z10 = true;
            i5 = this.uniform;
            if (i5 != -1) {
            }
            i10 = this.victor;
            if (i10 != -1) {
            }
            i11 = this.amber;
            if (i11 != Integer.MIN_VALUE) {
            }
            i12 = this.azure;
            if (i12 != Integer.MIN_VALUE) {
            }
            if (z10) {
            }
            if (this.red) {
                if (f10 == -1.0f) {
                }
            }
        } else {
            int i19 = this.sierra;
            if (i19 != -1) {
                this.white = i19;
            }
            int i20 = this.tango;
            if (i20 != -1) {
                this.teal = i20;
            }
            int i21 = this.uniform;
            if (i21 != -1) {
                this.yellow = i21;
            }
            int i22 = this.victor;
            if (i22 != -1) {
                this.f3460a = i22;
            }
            int i23 = this.amber;
            if (i23 != Integer.MIN_VALUE) {
                this.f3461b = i23;
            }
            int i24 = this.azure;
            if (i24 != Integer.MIN_VALUE) {
                this.f3462c = i24;
            }
        }
        if (this.uniform == -1 && this.victor == -1 && this.tango == -1 && this.sierra == -1) {
            int i25 = this.golf;
            if (i25 != -1) {
                this.yellow = i25;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i14 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i14;
                }
            } else {
                int i26 = this.hotel;
                if (i26 != -1) {
                    this.f3460a = i26;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i14 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i14;
                    }
                }
            }
            int i27 = this.echo;
            if (i27 != -1) {
                this.teal = i27;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && i13 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i13;
                    return;
                }
                return;
            }
            int i28 = this.foxtrot;
            if (i28 != -1) {
                this.white = i28;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && i13 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i13;
                }
            }
        }
    }

    public C0806e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.alpha = -1;
        this.bravo = -1;
        this.charlie = -1.0f;
        this.delta = true;
        this.echo = -1;
        this.foxtrot = -1;
        this.golf = -1;
        this.hotel = -1;
        this.india = -1;
        this.juliet = -1;
        this.kilo = -1;
        this.lima = -1;
        this.mike = -1;
        this.november = -1;
        this.oscar = -1;
        this.papa = -1;
        this.quebec = 0;
        this.romeo = 0.0f;
        this.sierra = -1;
        this.tango = -1;
        this.uniform = -1;
        this.victor = -1;
        this.whiskey = RecyclerView.UNDEFINED_DURATION;
        this.xray = RecyclerView.UNDEFINED_DURATION;
        this.yankee = RecyclerView.UNDEFINED_DURATION;
        this.zulu = RecyclerView.UNDEFINED_DURATION;
        this.amber = RecyclerView.UNDEFINED_DURATION;
        this.azure = RecyclerView.UNDEFINED_DURATION;
        this.beige = RecyclerView.UNDEFINED_DURATION;
        this.black = 0;
        this.blue = 0.5f;
        this.bronze = 0.5f;
        this.coral = null;
        this.crimson = -1.0f;
        this.cyan = -1.0f;
        this.emerald = 0;
        this.fuchsia = 0;
        this.gold = 0;
        this.gray = 0;
        this.green = 0;
        this.indigo = 0;
        this.ivory = 0;
        this.jade = 0;
        this.lavender = 1.0f;
        this.lime = 1.0f;
        this.magenta = -1;
        this.maroon = -1;
        this.navy = -1;
        this.ochre = false;
        this.olive = false;
        this.orange = null;
        this.peach = 0;
        this.pink = true;
        this.plum = true;
        this.purple = false;
        this.red = false;
        this.silver = false;
        this.teal = -1;
        this.white = -1;
        this.yellow = -1;
        this.f3460a = -1;
        this.f3461b = RecyclerView.UNDEFINED_DURATION;
        this.f3462c = RecyclerView.UNDEFINED_DURATION;
        this.f3463d = 0.5f;
        this.f3466h = new Z0.d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0820s.bravo);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            int i5 = AbstractC0805d.alpha.get(index);
            switch (i5) {
                case 1:
                    this.navy = obtainStyledAttributes.getInt(index, this.navy);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.papa);
                    this.papa = resourceId;
                    if (resourceId == -1) {
                        this.papa = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    this.quebec = obtainStyledAttributes.getDimensionPixelSize(index, this.quebec);
                    break;
                case 4:
                    float f5 = obtainStyledAttributes.getFloat(index, this.romeo) % 360.0f;
                    this.romeo = f5;
                    if (f5 < 0.0f) {
                        this.romeo = (360.0f - f5) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    this.alpha = obtainStyledAttributes.getDimensionPixelOffset(index, this.alpha);
                    break;
                case 6:
                    this.bravo = obtainStyledAttributes.getDimensionPixelOffset(index, this.bravo);
                    break;
                case 7:
                    this.charlie = obtainStyledAttributes.getFloat(index, this.charlie);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, this.echo);
                    this.echo = resourceId2;
                    if (resourceId2 == -1) {
                        this.echo = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, this.foxtrot);
                    this.foxtrot = resourceId3;
                    if (resourceId3 == -1) {
                        this.foxtrot = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, this.golf);
                    this.golf = resourceId4;
                    if (resourceId4 == -1) {
                        this.golf = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, this.hotel);
                    this.hotel = resourceId5;
                    if (resourceId5 == -1) {
                        this.hotel = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, this.india);
                    this.india = resourceId6;
                    if (resourceId6 == -1) {
                        this.india = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, this.juliet);
                    this.juliet = resourceId7;
                    if (resourceId7 == -1) {
                        this.juliet = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, this.kilo);
                    this.kilo = resourceId8;
                    if (resourceId8 == -1) {
                        this.kilo = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, this.lima);
                    this.lima = resourceId9;
                    if (resourceId9 == -1) {
                        this.lima = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, this.mike);
                    this.mike = resourceId10;
                    if (resourceId10 == -1) {
                        this.mike = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, this.sierra);
                    this.sierra = resourceId11;
                    if (resourceId11 == -1) {
                        this.sierra = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, this.tango);
                    this.tango = resourceId12;
                    if (resourceId12 == -1) {
                        this.tango = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, this.uniform);
                    this.uniform = resourceId13;
                    if (resourceId13 == -1) {
                        this.uniform = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, this.victor);
                    this.victor = resourceId14;
                    if (resourceId14 == -1) {
                        this.victor = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    this.whiskey = obtainStyledAttributes.getDimensionPixelSize(index, this.whiskey);
                    break;
                case 22:
                    this.xray = obtainStyledAttributes.getDimensionPixelSize(index, this.xray);
                    break;
                case 23:
                    this.yankee = obtainStyledAttributes.getDimensionPixelSize(index, this.yankee);
                    break;
                case 24:
                    this.zulu = obtainStyledAttributes.getDimensionPixelSize(index, this.zulu);
                    break;
                case 25:
                    this.amber = obtainStyledAttributes.getDimensionPixelSize(index, this.amber);
                    break;
                case 26:
                    this.azure = obtainStyledAttributes.getDimensionPixelSize(index, this.azure);
                    break;
                case 27:
                    this.ochre = obtainStyledAttributes.getBoolean(index, this.ochre);
                    break;
                case 28:
                    this.olive = obtainStyledAttributes.getBoolean(index, this.olive);
                    break;
                case 29:
                    this.blue = obtainStyledAttributes.getFloat(index, this.blue);
                    break;
                case 30:
                    this.bronze = obtainStyledAttributes.getFloat(index, this.bronze);
                    break;
                case 31:
                    int i10 = obtainStyledAttributes.getInt(index, 0);
                    this.gold = i10;
                    if (i10 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i11 = obtainStyledAttributes.getInt(index, 0);
                    this.gray = i11;
                    if (i11 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        this.green = obtainStyledAttributes.getDimensionPixelSize(index, this.green);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, this.green) == -2) {
                            this.green = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        this.ivory = obtainStyledAttributes.getDimensionPixelSize(index, this.ivory);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, this.ivory) == -2) {
                            this.ivory = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    this.lavender = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.lavender));
                    this.gold = 2;
                    break;
                case 36:
                    try {
                        this.indigo = obtainStyledAttributes.getDimensionPixelSize(index, this.indigo);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, this.indigo) == -2) {
                            this.indigo = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        this.jade = obtainStyledAttributes.getDimensionPixelSize(index, this.jade);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, this.jade) == -2) {
                            this.jade = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    this.lime = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.lime));
                    this.gray = 2;
                    break;
                default:
                    switch (i5) {
                        case 44:
                            C0815n.hotel(this, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            this.crimson = obtainStyledAttributes.getFloat(index, this.crimson);
                            break;
                        case 46:
                            this.cyan = obtainStyledAttributes.getFloat(index, this.cyan);
                            break;
                        case 47:
                            this.emerald = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            this.fuchsia = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            this.magenta = obtainStyledAttributes.getDimensionPixelOffset(index, this.magenta);
                            break;
                        case 50:
                            this.maroon = obtainStyledAttributes.getDimensionPixelOffset(index, this.maroon);
                            break;
                        case 51:
                            this.orange = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, this.november);
                            this.november = resourceId15;
                            if (resourceId15 == -1) {
                                this.november = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, this.oscar);
                            this.oscar = resourceId16;
                            if (resourceId16 == -1) {
                                this.oscar = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            this.black = obtainStyledAttributes.getDimensionPixelSize(index, this.black);
                            break;
                        case 55:
                            this.beige = obtainStyledAttributes.getDimensionPixelSize(index, this.beige);
                            break;
                        default:
                            switch (i5) {
                                case 64:
                                    C0815n.golf(this, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C0815n.golf(this, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    this.peach = obtainStyledAttributes.getInt(index, this.peach);
                                    break;
                                case 67:
                                    this.delta = obtainStyledAttributes.getBoolean(index, this.delta);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        alpha();
    }

    public C0806e() {
        super(-2, -2);
        this.alpha = -1;
        this.bravo = -1;
        this.charlie = -1.0f;
        this.delta = true;
        this.echo = -1;
        this.foxtrot = -1;
        this.golf = -1;
        this.hotel = -1;
        this.india = -1;
        this.juliet = -1;
        this.kilo = -1;
        this.lima = -1;
        this.mike = -1;
        this.november = -1;
        this.oscar = -1;
        this.papa = -1;
        this.quebec = 0;
        this.romeo = 0.0f;
        this.sierra = -1;
        this.tango = -1;
        this.uniform = -1;
        this.victor = -1;
        this.whiskey = RecyclerView.UNDEFINED_DURATION;
        this.xray = RecyclerView.UNDEFINED_DURATION;
        this.yankee = RecyclerView.UNDEFINED_DURATION;
        this.zulu = RecyclerView.UNDEFINED_DURATION;
        this.amber = RecyclerView.UNDEFINED_DURATION;
        this.azure = RecyclerView.UNDEFINED_DURATION;
        this.beige = RecyclerView.UNDEFINED_DURATION;
        this.black = 0;
        this.blue = 0.5f;
        this.bronze = 0.5f;
        this.coral = null;
        this.crimson = -1.0f;
        this.cyan = -1.0f;
        this.emerald = 0;
        this.fuchsia = 0;
        this.gold = 0;
        this.gray = 0;
        this.green = 0;
        this.indigo = 0;
        this.ivory = 0;
        this.jade = 0;
        this.lavender = 1.0f;
        this.lime = 1.0f;
        this.magenta = -1;
        this.maroon = -1;
        this.navy = -1;
        this.ochre = false;
        this.olive = false;
        this.orange = null;
        this.peach = 0;
        this.pink = true;
        this.plum = true;
        this.purple = false;
        this.red = false;
        this.silver = false;
        this.teal = -1;
        this.white = -1;
        this.yellow = -1;
        this.f3460a = -1;
        this.f3461b = RecyclerView.UNDEFINED_DURATION;
        this.f3462c = RecyclerView.UNDEFINED_DURATION;
        this.f3463d = 0.5f;
        this.f3466h = new Z0.d();
    }
}
