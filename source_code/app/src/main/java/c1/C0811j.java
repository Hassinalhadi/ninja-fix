package c1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;

/* renamed from: c1.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0811j {

    /* renamed from: h, reason: collision with root package name */
    public static final SparseIntArray f3467h;

    /* renamed from: a, reason: collision with root package name */
    public int[] f3468a;
    public boolean alpha;
    public int amber;
    public float azure;

    /* renamed from: b, reason: collision with root package name */
    public String f3469b;
    public int beige;
    public int black;
    public int blue;
    public int bravo;
    public int bronze;

    /* renamed from: c, reason: collision with root package name */
    public String f3470c;
    public int charlie;
    public int coral;
    public int crimson;
    public int cyan;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3471d;
    public int delta;
    public boolean e;
    public int echo;
    public int emerald;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3472f;
    public float foxtrot;
    public int fuchsia;

    /* renamed from: g, reason: collision with root package name */
    public int f3473g;
    public int gold;
    public boolean golf;
    public int gray;
    public int green;
    public int hotel;
    public int india;
    public int indigo;
    public int ivory;
    public int jade;
    public int juliet;
    public int kilo;
    public int lavender;
    public int lima;
    public int lime;
    public float magenta;
    public float maroon;
    public int mike;
    public int navy;
    public int november;
    public int ochre;
    public int olive;
    public int orange;
    public int oscar;
    public int papa;
    public int peach;
    public int pink;
    public int plum;
    public int purple;
    public int quebec;
    public float red;
    public int romeo;
    public int sierra;
    public float silver;
    public int tango;
    public int teal;
    public int uniform;
    public int victor;
    public float whiskey;
    public int white;
    public float xray;
    public String yankee;
    public int yellow;
    public int zulu;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3467h = sparseIntArray;
        sparseIntArray.append(43, 24);
        sparseIntArray.append(44, 25);
        sparseIntArray.append(46, 28);
        sparseIntArray.append(47, 29);
        sparseIntArray.append(52, 35);
        sparseIntArray.append(51, 34);
        sparseIntArray.append(24, 4);
        sparseIntArray.append(23, 3);
        sparseIntArray.append(19, 1);
        sparseIntArray.append(61, 6);
        sparseIntArray.append(62, 7);
        sparseIntArray.append(31, 17);
        sparseIntArray.append(32, 18);
        sparseIntArray.append(33, 19);
        sparseIntArray.append(15, 90);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(48, 31);
        sparseIntArray.append(49, 32);
        sparseIntArray.append(30, 10);
        sparseIntArray.append(29, 9);
        sparseIntArray.append(66, 13);
        sparseIntArray.append(69, 16);
        sparseIntArray.append(67, 14);
        sparseIntArray.append(64, 11);
        sparseIntArray.append(68, 15);
        sparseIntArray.append(65, 12);
        sparseIntArray.append(55, 38);
        sparseIntArray.append(41, 37);
        sparseIntArray.append(40, 39);
        sparseIntArray.append(54, 40);
        sparseIntArray.append(39, 20);
        sparseIntArray.append(53, 36);
        sparseIntArray.append(28, 5);
        sparseIntArray.append(42, 91);
        sparseIntArray.append(50, 91);
        sparseIntArray.append(45, 91);
        sparseIntArray.append(22, 91);
        sparseIntArray.append(18, 91);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(56, 41);
        sparseIntArray.append(34, 42);
        sparseIntArray.append(17, 87);
        sparseIntArray.append(16, 88);
        sparseIntArray.append(71, 76);
        sparseIntArray.append(25, 61);
        sparseIntArray.append(27, 62);
        sparseIntArray.append(26, 63);
        sparseIntArray.append(60, 69);
        sparseIntArray.append(38, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
        sparseIntArray.append(58, 84);
        sparseIntArray.append(59, 86);
        sparseIntArray.append(58, 83);
        sparseIntArray.append(37, 85);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(34, 88);
        sparseIntArray.append(91, 89);
        sparseIntArray.append(15, 90);
    }

    public final void alpha(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0820s.foxtrot);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            SparseIntArray sparseIntArray = f3467h;
            int i5 = sparseIntArray.get(index);
            switch (i5) {
                case 1:
                    this.papa = C0815n.foxtrot(obtainStyledAttributes, index, this.papa);
                    break;
                case 2:
                    this.cyan = obtainStyledAttributes.getDimensionPixelSize(index, this.cyan);
                    break;
                case 3:
                    this.oscar = C0815n.foxtrot(obtainStyledAttributes, index, this.oscar);
                    break;
                case 4:
                    this.november = C0815n.foxtrot(obtainStyledAttributes, index, this.november);
                    break;
                case 5:
                    this.yankee = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    this.beige = obtainStyledAttributes.getDimensionPixelOffset(index, this.beige);
                    break;
                case 7:
                    this.black = obtainStyledAttributes.getDimensionPixelOffset(index, this.black);
                    break;
                case 8:
                    this.emerald = obtainStyledAttributes.getDimensionPixelSize(index, this.emerald);
                    break;
                case 9:
                    this.victor = C0815n.foxtrot(obtainStyledAttributes, index, this.victor);
                    break;
                case 10:
                    this.uniform = C0815n.foxtrot(obtainStyledAttributes, index, this.uniform);
                    break;
                case 11:
                    this.ivory = obtainStyledAttributes.getDimensionPixelSize(index, this.ivory);
                    break;
                case 12:
                    this.jade = obtainStyledAttributes.getDimensionPixelSize(index, this.jade);
                    break;
                case 13:
                    this.gray = obtainStyledAttributes.getDimensionPixelSize(index, this.gray);
                    break;
                case 14:
                    this.indigo = obtainStyledAttributes.getDimensionPixelSize(index, this.indigo);
                    break;
                case 15:
                    this.lavender = obtainStyledAttributes.getDimensionPixelSize(index, this.lavender);
                    break;
                case 16:
                    this.green = obtainStyledAttributes.getDimensionPixelSize(index, this.green);
                    break;
                case 17:
                    this.delta = obtainStyledAttributes.getDimensionPixelOffset(index, this.delta);
                    break;
                case 18:
                    this.echo = obtainStyledAttributes.getDimensionPixelOffset(index, this.echo);
                    break;
                case 19:
                    this.foxtrot = obtainStyledAttributes.getFloat(index, this.foxtrot);
                    break;
                case 20:
                    this.whiskey = obtainStyledAttributes.getFloat(index, this.whiskey);
                    break;
                case 21:
                    this.charlie = obtainStyledAttributes.getLayoutDimension(index, this.charlie);
                    break;
                case 22:
                    this.bravo = obtainStyledAttributes.getLayoutDimension(index, this.bravo);
                    break;
                case 23:
                    this.bronze = obtainStyledAttributes.getDimensionPixelSize(index, this.bronze);
                    break;
                case 24:
                    this.hotel = C0815n.foxtrot(obtainStyledAttributes, index, this.hotel);
                    break;
                case 25:
                    this.india = C0815n.foxtrot(obtainStyledAttributes, index, this.india);
                    break;
                case 26:
                    this.blue = obtainStyledAttributes.getInt(index, this.blue);
                    break;
                case 27:
                    this.coral = obtainStyledAttributes.getDimensionPixelSize(index, this.coral);
                    break;
                case 28:
                    this.juliet = C0815n.foxtrot(obtainStyledAttributes, index, this.juliet);
                    break;
                case 29:
                    this.kilo = C0815n.foxtrot(obtainStyledAttributes, index, this.kilo);
                    break;
                case 30:
                    this.fuchsia = obtainStyledAttributes.getDimensionPixelSize(index, this.fuchsia);
                    break;
                case 31:
                    this.sierra = C0815n.foxtrot(obtainStyledAttributes, index, this.sierra);
                    break;
                case 32:
                    this.tango = C0815n.foxtrot(obtainStyledAttributes, index, this.tango);
                    break;
                case 33:
                    this.crimson = obtainStyledAttributes.getDimensionPixelSize(index, this.crimson);
                    break;
                case 34:
                    this.mike = C0815n.foxtrot(obtainStyledAttributes, index, this.mike);
                    break;
                case 35:
                    this.lima = C0815n.foxtrot(obtainStyledAttributes, index, this.lima);
                    break;
                case 36:
                    this.xray = obtainStyledAttributes.getFloat(index, this.xray);
                    break;
                case 37:
                    this.maroon = obtainStyledAttributes.getFloat(index, this.maroon);
                    break;
                case 38:
                    this.magenta = obtainStyledAttributes.getFloat(index, this.magenta);
                    break;
                case 39:
                    this.navy = obtainStyledAttributes.getInt(index, this.navy);
                    break;
                case 40:
                    this.ochre = obtainStyledAttributes.getInt(index, this.ochre);
                    break;
                case 41:
                    C0815n.golf(this, obtainStyledAttributes, index, 0);
                    break;
                case 42:
                    C0815n.golf(this, obtainStyledAttributes, index, 1);
                    break;
                default:
                    switch (i5) {
                        case 61:
                            this.zulu = C0815n.foxtrot(obtainStyledAttributes, index, this.zulu);
                            break;
                        case 62:
                            this.amber = obtainStyledAttributes.getDimensionPixelSize(index, this.amber);
                            break;
                        case 63:
                            this.azure = obtainStyledAttributes.getFloat(index, this.azure);
                            break;
                        default:
                            switch (i5) {
                                case 69:
                                    this.red = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    this.silver = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    this.teal = obtainStyledAttributes.getInt(index, this.teal);
                                    break;
                                case 73:
                                    this.white = obtainStyledAttributes.getDimensionPixelSize(index, this.white);
                                    break;
                                case 74:
                                    this.f3469b = obtainStyledAttributes.getString(index);
                                    break;
                                case 75:
                                    this.f3472f = obtainStyledAttributes.getBoolean(index, this.f3472f);
                                    break;
                                case 76:
                                    this.f3473g = obtainStyledAttributes.getInt(index, this.f3473g);
                                    break;
                                case 77:
                                    this.quebec = C0815n.foxtrot(obtainStyledAttributes, index, this.quebec);
                                    break;
                                case 78:
                                    this.romeo = C0815n.foxtrot(obtainStyledAttributes, index, this.romeo);
                                    break;
                                case 79:
                                    this.lime = obtainStyledAttributes.getDimensionPixelSize(index, this.lime);
                                    break;
                                case 80:
                                    this.gold = obtainStyledAttributes.getDimensionPixelSize(index, this.gold);
                                    break;
                                case 81:
                                    this.olive = obtainStyledAttributes.getInt(index, this.olive);
                                    break;
                                case 82:
                                    this.orange = obtainStyledAttributes.getInt(index, this.orange);
                                    break;
                                case 83:
                                    this.pink = obtainStyledAttributes.getDimensionPixelSize(index, this.pink);
                                    break;
                                case 84:
                                    this.peach = obtainStyledAttributes.getDimensionPixelSize(index, this.peach);
                                    break;
                                case 85:
                                    this.purple = obtainStyledAttributes.getDimensionPixelSize(index, this.purple);
                                    break;
                                case 86:
                                    this.plum = obtainStyledAttributes.getDimensionPixelSize(index, this.plum);
                                    break;
                                case 87:
                                    this.f3471d = obtainStyledAttributes.getBoolean(index, this.f3471d);
                                    break;
                                case 88:
                                    this.e = obtainStyledAttributes.getBoolean(index, this.e);
                                    break;
                                case 89:
                                    this.f3470c = obtainStyledAttributes.getString(index);
                                    break;
                                case 90:
                                    this.golf = obtainStyledAttributes.getBoolean(index, this.golf);
                                    break;
                                case 91:
                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
