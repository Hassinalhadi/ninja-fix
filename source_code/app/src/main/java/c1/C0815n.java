package c1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import b1.AbstractC0714a;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: c1.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0815n {
    public static final int[] delta = {0, 4, 8};
    public static final SparseIntArray echo;
    public static final SparseIntArray foxtrot;
    public final HashMap alpha = new HashMap();
    public final boolean bravo = true;
    public final HashMap charlie = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        echo = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        foxtrot = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] charlie(C0802a c0802a, String str) {
        int i4;
        String[] split = str.split(Constants.SEPARATOR_COMMA);
        Context context = c0802a.getContext();
        int[] iArr = new int[split.length];
        int i5 = 0;
        int i10 = 0;
        while (i5 < split.length) {
            String trim = split[i5].trim();
            Object obj = null;
            try {
                i4 = AbstractC0819r.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i4 = 0;
            }
            if (i4 == 0) {
                i4 = context.getResources().getIdentifier(trim, Constants.KEY_ID, context.getPackageName());
            }
            if (i4 == 0 && c0802a.isInEditMode() && (c0802a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0802a.getParent();
                if (av.q.kilo(trim)) {
                    HashMap hashMap = constraintLayout.f3034f;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f3034f.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i4 = ((Integer) obj).intValue();
                }
            }
            iArr[i10] = i4;
            i5++;
            i10++;
        }
        if (i10 != split.length) {
            return Arrays.copyOf(iArr, i10);
        }
        return iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0088. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:129:0x05fc. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r3v133, types: [c1.h, java.lang.Object] */
    public static C0810i delta(Context context, AttributeSet attributeSet, boolean z2) {
        int[] iArr;
        int i4;
        String str;
        String str2;
        int i5;
        int i10;
        C0810i c0810i = new C0810i();
        if (z2) {
            iArr = AbstractC0820s.charlie;
        } else {
            iArr = AbstractC0820s.alpha;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        int[] iArr2 = delta;
        String[] strArr = X0.a.alpha;
        SparseIntArray sparseIntArray = echo;
        C0813l c0813l = c0810i.bravo;
        C0814m c0814m = c0810i.echo;
        C0812k c0812k = c0810i.charlie;
        C0811j c0811j = c0810i.delta;
        String str3 = "ConstraintSet";
        if (!z2) {
            String str4 = "CURRENTLY UNSUPPORTED";
            int i11 = 1;
            int i12 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i12 < indexCount; indexCount = i4) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index != i11 && 23 != index) {
                    if (24 != index) {
                        c0812k.getClass();
                        c0811j.getClass();
                        c0814m.getClass();
                    }
                }
                switch (sparseIntArray.get(index)) {
                    case 1:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.papa = foxtrot(obtainStyledAttributes, index, c0811j.papa);
                        i5 = 1;
                        break;
                    case 2:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.cyan = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.cyan);
                        i5 = 1;
                        break;
                    case 3:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.oscar = foxtrot(obtainStyledAttributes, index, c0811j.oscar);
                        i5 = 1;
                        break;
                    case 4:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.november = foxtrot(obtainStyledAttributes, index, c0811j.november);
                        i5 = 1;
                        break;
                    case 5:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.yankee = obtainStyledAttributes.getString(index);
                        i5 = 1;
                        break;
                    case 6:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.beige = obtainStyledAttributes.getDimensionPixelOffset(index, c0811j.beige);
                        i5 = 1;
                        break;
                    case 7:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.black = obtainStyledAttributes.getDimensionPixelOffset(index, c0811j.black);
                        i5 = 1;
                        break;
                    case 8:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.emerald = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.emerald);
                        i5 = 1;
                        break;
                    case 9:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.victor = foxtrot(obtainStyledAttributes, index, c0811j.victor);
                        i5 = 1;
                        break;
                    case 10:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.uniform = foxtrot(obtainStyledAttributes, index, c0811j.uniform);
                        i5 = 1;
                        break;
                    case 11:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.ivory = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.ivory);
                        i5 = 1;
                        break;
                    case 12:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.jade = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.jade);
                        i5 = 1;
                        break;
                    case 13:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.gray = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.gray);
                        i5 = 1;
                        break;
                    case 14:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.indigo = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.indigo);
                        i5 = 1;
                        break;
                    case 15:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.lavender = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.lavender);
                        i5 = 1;
                        break;
                    case 16:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.green = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.green);
                        i5 = 1;
                        break;
                    case 17:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.delta = obtainStyledAttributes.getDimensionPixelOffset(index, c0811j.delta);
                        i5 = 1;
                        break;
                    case 18:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.echo = obtainStyledAttributes.getDimensionPixelOffset(index, c0811j.echo);
                        i5 = 1;
                        break;
                    case 19:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.foxtrot = obtainStyledAttributes.getFloat(index, c0811j.foxtrot);
                        i5 = 1;
                        break;
                    case 20:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.whiskey = obtainStyledAttributes.getFloat(index, c0811j.whiskey);
                        i5 = 1;
                        break;
                    case 21:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.charlie = obtainStyledAttributes.getLayoutDimension(index, c0811j.charlie);
                        i5 = 1;
                        break;
                    case 22:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        int i13 = obtainStyledAttributes.getInt(index, c0813l.alpha);
                        c0813l.alpha = i13;
                        c0813l.alpha = iArr2[i13];
                        i5 = 1;
                        break;
                    case 23:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.bravo = obtainStyledAttributes.getLayoutDimension(index, c0811j.bravo);
                        i5 = 1;
                        break;
                    case 24:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.bronze = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.bronze);
                        i5 = 1;
                        break;
                    case 25:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.hotel = foxtrot(obtainStyledAttributes, index, c0811j.hotel);
                        i5 = 1;
                        break;
                    case 26:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.india = foxtrot(obtainStyledAttributes, index, c0811j.india);
                        i5 = 1;
                        break;
                    case 27:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.blue = obtainStyledAttributes.getInt(index, c0811j.blue);
                        i5 = 1;
                        break;
                    case 28:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.coral = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.coral);
                        i5 = 1;
                        break;
                    case 29:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.juliet = foxtrot(obtainStyledAttributes, index, c0811j.juliet);
                        i5 = 1;
                        break;
                    case 30:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.kilo = foxtrot(obtainStyledAttributes, index, c0811j.kilo);
                        i5 = 1;
                        break;
                    case 31:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.fuchsia = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.fuchsia);
                        i5 = 1;
                        break;
                    case 32:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.sierra = foxtrot(obtainStyledAttributes, index, c0811j.sierra);
                        i5 = 1;
                        break;
                    case 33:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.tango = foxtrot(obtainStyledAttributes, index, c0811j.tango);
                        i5 = 1;
                        break;
                    case 34:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.crimson = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.crimson);
                        i5 = 1;
                        break;
                    case 35:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.mike = foxtrot(obtainStyledAttributes, index, c0811j.mike);
                        i5 = 1;
                        break;
                    case 36:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.lima = foxtrot(obtainStyledAttributes, index, c0811j.lima);
                        i5 = 1;
                        break;
                    case 37:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.xray = obtainStyledAttributes.getFloat(index, c0811j.xray);
                        i5 = 1;
                        break;
                    case 38:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0810i.alpha = obtainStyledAttributes.getResourceId(index, c0810i.alpha);
                        i5 = 1;
                        break;
                    case 39:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.maroon = obtainStyledAttributes.getFloat(index, c0811j.maroon);
                        i5 = 1;
                        break;
                    case 40:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.magenta = obtainStyledAttributes.getFloat(index, c0811j.magenta);
                        i5 = 1;
                        break;
                    case 41:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.navy = obtainStyledAttributes.getInt(index, c0811j.navy);
                        i5 = 1;
                        break;
                    case 42:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.ochre = obtainStyledAttributes.getInt(index, c0811j.ochre);
                        i5 = 1;
                        break;
                    case 43:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0813l.charlie = obtainStyledAttributes.getFloat(index, c0813l.charlie);
                        i5 = 1;
                        break;
                    case 44:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0814m.lima = true;
                        c0814m.mike = obtainStyledAttributes.getDimension(index, c0814m.mike);
                        i5 = 1;
                        break;
                    case 45:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0814m.bravo = obtainStyledAttributes.getFloat(index, c0814m.bravo);
                        i5 = 1;
                        break;
                    case 46:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0814m.charlie = obtainStyledAttributes.getFloat(index, c0814m.charlie);
                        i5 = 1;
                        break;
                    case 47:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0814m.delta = obtainStyledAttributes.getFloat(index, c0814m.delta);
                        i5 = 1;
                        break;
                    case 48:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0814m.echo = obtainStyledAttributes.getFloat(index, c0814m.echo);
                        i5 = 1;
                        break;
                    case 49:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0814m.foxtrot = obtainStyledAttributes.getDimension(index, c0814m.foxtrot);
                        i5 = 1;
                        break;
                    case 50:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0814m.golf = obtainStyledAttributes.getDimension(index, c0814m.golf);
                        i5 = 1;
                        break;
                    case 51:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0814m.india = obtainStyledAttributes.getDimension(index, c0814m.india);
                        i5 = 1;
                        break;
                    case 52:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0814m.juliet = obtainStyledAttributes.getDimension(index, c0814m.juliet);
                        i5 = 1;
                        break;
                    case 53:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0814m.kilo = obtainStyledAttributes.getDimension(index, c0814m.kilo);
                        i5 = 1;
                        break;
                    case 54:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.olive = obtainStyledAttributes.getInt(index, c0811j.olive);
                        i5 = 1;
                        break;
                    case 55:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.orange = obtainStyledAttributes.getInt(index, c0811j.orange);
                        i5 = 1;
                        break;
                    case 56:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.peach = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.peach);
                        i5 = 1;
                        break;
                    case 57:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.pink = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.pink);
                        i5 = 1;
                        break;
                    case 58:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.plum = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.plum);
                        i5 = 1;
                        break;
                    case 59:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.purple = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.purple);
                        i5 = 1;
                        break;
                    case 60:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0814m.alpha = obtainStyledAttributes.getFloat(index, c0814m.alpha);
                        i5 = 1;
                        break;
                    case 61:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.zulu = foxtrot(obtainStyledAttributes, index, c0811j.zulu);
                        i5 = 1;
                        break;
                    case 62:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.amber = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.amber);
                        i5 = 1;
                        break;
                    case 63:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0811j.azure = obtainStyledAttributes.getFloat(index, c0811j.azure);
                        i5 = 1;
                        break;
                    case 64:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        c0812k.alpha = foxtrot(obtainStyledAttributes, index, c0812k.alpha);
                        i5 = 1;
                        break;
                    case 65:
                        i4 = indexCount;
                        str = str4;
                        str2 = str3;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            c0812k.getClass();
                            i5 = 1;
                            break;
                        } else {
                            String str5 = strArr[obtainStyledAttributes.getInteger(index, 0)];
                            c0812k.getClass();
                            i5 = 1;
                        }
                    case 66:
                        i4 = indexCount;
                        str = str4;
                        obtainStyledAttributes.getInt(index, 0);
                        c0812k.getClass();
                        str2 = str3;
                        i5 = 1;
                        break;
                    case 67:
                        i4 = indexCount;
                        str = str4;
                        c0812k.echo = obtainStyledAttributes.getFloat(index, c0812k.echo);
                        str2 = str3;
                        i5 = 1;
                        break;
                    case 68:
                        i4 = indexCount;
                        str = str4;
                        c0813l.delta = obtainStyledAttributes.getFloat(index, c0813l.delta);
                        str2 = str3;
                        i5 = 1;
                        break;
                    case 69:
                        i4 = indexCount;
                        str = str4;
                        c0811j.red = obtainStyledAttributes.getFloat(index, 1.0f);
                        str2 = str3;
                        i5 = 1;
                        break;
                    case 70:
                        i4 = indexCount;
                        str = str4;
                        c0811j.silver = obtainStyledAttributes.getFloat(index, 1.0f);
                        str2 = str3;
                        i5 = 1;
                        break;
                    case 71:
                        i4 = indexCount;
                        str = str4;
                        Log.e(str3, str);
                        str2 = str3;
                        i5 = 1;
                        break;
                    case 72:
                        i4 = indexCount;
                        c0811j.teal = obtainStyledAttributes.getInt(index, c0811j.teal);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 73:
                        i4 = indexCount;
                        c0811j.white = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.white);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 74:
                        i4 = indexCount;
                        c0811j.f3469b = obtainStyledAttributes.getString(index);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 75:
                        i4 = indexCount;
                        c0811j.f3472f = obtainStyledAttributes.getBoolean(index, c0811j.f3472f);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 76:
                        i4 = indexCount;
                        c0812k.charlie = obtainStyledAttributes.getInt(index, c0812k.charlie);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 77:
                        i4 = indexCount;
                        c0811j.f3470c = obtainStyledAttributes.getString(index);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 78:
                        i4 = indexCount;
                        c0813l.bravo = obtainStyledAttributes.getInt(index, c0813l.bravo);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 79:
                        i4 = indexCount;
                        c0812k.delta = obtainStyledAttributes.getFloat(index, c0812k.delta);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 80:
                        i4 = indexCount;
                        c0811j.f3471d = obtainStyledAttributes.getBoolean(index, c0811j.f3471d);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 81:
                        i4 = indexCount;
                        c0811j.e = obtainStyledAttributes.getBoolean(index, c0811j.e);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 82:
                        i4 = indexCount;
                        c0812k.bravo = obtainStyledAttributes.getInteger(index, c0812k.bravo);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 83:
                        i4 = indexCount;
                        c0814m.hotel = foxtrot(obtainStyledAttributes, index, c0814m.hotel);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 84:
                        i4 = indexCount;
                        c0812k.golf = obtainStyledAttributes.getInteger(index, c0812k.golf);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 85:
                        i4 = indexCount;
                        c0812k.foxtrot = obtainStyledAttributes.getFloat(index, c0812k.foxtrot);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 86:
                        i4 = indexCount;
                        int i14 = obtainStyledAttributes.peekValue(index).type;
                        if (i14 == 1) {
                            c0812k.india = obtainStyledAttributes.getResourceId(index, -1);
                        } else if (i14 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            c0812k.hotel = string;
                            if (string.indexOf("/") > 0) {
                                c0812k.india = obtainStyledAttributes.getResourceId(index, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index, c0812k.india);
                        }
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 87:
                        i4 = indexCount;
                        Log.w(str3, "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i4 = indexCount;
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index));
                        Log.w(str3, sb2.toString());
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 91:
                        i4 = indexCount;
                        c0811j.quebec = foxtrot(obtainStyledAttributes, index, c0811j.quebec);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 92:
                        i4 = indexCount;
                        c0811j.romeo = foxtrot(obtainStyledAttributes, index, c0811j.romeo);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 93:
                        i4 = indexCount;
                        c0811j.gold = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.gold);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 94:
                        i4 = indexCount;
                        c0811j.lime = obtainStyledAttributes.getDimensionPixelSize(index, c0811j.lime);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 95:
                        i4 = indexCount;
                        golf(c0811j, obtainStyledAttributes, index, 0);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                    case 96:
                        i4 = indexCount;
                        golf(c0811j, obtainStyledAttributes, index, 1);
                        i5 = 1;
                        str = str4;
                        str2 = str3;
                        break;
                    case 97:
                        i4 = indexCount;
                        c0811j.f3473g = obtainStyledAttributes.getInt(index, c0811j.f3473g);
                        str = str4;
                        i5 = 1;
                        str2 = str3;
                        break;
                }
                i12++;
                i11 = i5;
                str3 = str2;
                str4 = str;
            }
            if (c0811j.f3469b != null) {
                c0811j.f3468a = null;
            }
        } else {
            ?? obj = new Object();
            obj.alpha = new int[10];
            obj.bravo = new int[10];
            obj.charlie = 0;
            obj.delta = new int[10];
            obj.echo = new float[10];
            obj.foxtrot = 0;
            obj.golf = new int[5];
            obj.hotel = new String[5];
            obj.india = 0;
            obj.juliet = new int[4];
            obj.kilo = new boolean[4];
            obj.lima = 0;
            c0812k.getClass();
            c0811j.getClass();
            c0814m.getClass();
            int i15 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i15 < indexCount2; indexCount2 = i10) {
                int index2 = obtainStyledAttributes.getIndex(i15);
                int i16 = i15;
                switch (foxtrot.get(index2)) {
                    case 2:
                        i10 = indexCount2;
                        obj.bravo(2, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.cyan));
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb3 = new StringBuilder("Unknown attribute 0x");
                        i10 = indexCount2;
                        sb3.append(Integer.toHexString(index2));
                        sb3.append("   ");
                        sb3.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb3.toString());
                        break;
                    case 5:
                        i10 = indexCount2;
                        obj.charlie(5, obtainStyledAttributes.getString(index2));
                        break;
                    case 6:
                        i10 = indexCount2;
                        obj.bravo(6, obtainStyledAttributes.getDimensionPixelOffset(index2, c0811j.beige));
                        break;
                    case 7:
                        i10 = indexCount2;
                        obj.bravo(7, obtainStyledAttributes.getDimensionPixelOffset(index2, c0811j.black));
                        break;
                    case 8:
                        i10 = indexCount2;
                        obj.bravo(8, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.emerald));
                        break;
                    case 11:
                        i10 = indexCount2;
                        obj.bravo(11, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.ivory));
                        break;
                    case 12:
                        i10 = indexCount2;
                        obj.bravo(12, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.jade));
                        break;
                    case 13:
                        i10 = indexCount2;
                        obj.bravo(13, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.gray));
                        break;
                    case 14:
                        i10 = indexCount2;
                        obj.bravo(14, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.indigo));
                        break;
                    case 15:
                        i10 = indexCount2;
                        obj.bravo(15, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.lavender));
                        break;
                    case 16:
                        i10 = indexCount2;
                        obj.bravo(16, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.green));
                        break;
                    case 17:
                        i10 = indexCount2;
                        obj.bravo(17, obtainStyledAttributes.getDimensionPixelOffset(index2, c0811j.delta));
                        break;
                    case 18:
                        i10 = indexCount2;
                        obj.bravo(18, obtainStyledAttributes.getDimensionPixelOffset(index2, c0811j.echo));
                        break;
                    case 19:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getFloat(index2, c0811j.foxtrot), 19);
                        break;
                    case 20:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getFloat(index2, c0811j.whiskey), 20);
                        break;
                    case 21:
                        i10 = indexCount2;
                        obj.bravo(21, obtainStyledAttributes.getLayoutDimension(index2, c0811j.charlie));
                        break;
                    case 22:
                        i10 = indexCount2;
                        obj.bravo(22, iArr2[obtainStyledAttributes.getInt(index2, c0813l.alpha)]);
                        break;
                    case 23:
                        i10 = indexCount2;
                        obj.bravo(23, obtainStyledAttributes.getLayoutDimension(index2, c0811j.bravo));
                        break;
                    case 24:
                        i10 = indexCount2;
                        obj.bravo(24, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.bronze));
                        break;
                    case 27:
                        i10 = indexCount2;
                        obj.bravo(27, obtainStyledAttributes.getInt(index2, c0811j.blue));
                        break;
                    case 28:
                        i10 = indexCount2;
                        obj.bravo(28, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.coral));
                        break;
                    case 31:
                        i10 = indexCount2;
                        obj.bravo(31, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.fuchsia));
                        break;
                    case 34:
                        i10 = indexCount2;
                        obj.bravo(34, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.crimson));
                        break;
                    case 37:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getFloat(index2, c0811j.xray), 37);
                        break;
                    case 38:
                        i10 = indexCount2;
                        int resourceId = obtainStyledAttributes.getResourceId(index2, c0810i.alpha);
                        c0810i.alpha = resourceId;
                        obj.bravo(38, resourceId);
                        break;
                    case 39:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getFloat(index2, c0811j.maroon), 39);
                        break;
                    case 40:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getFloat(index2, c0811j.magenta), 40);
                        break;
                    case 41:
                        i10 = indexCount2;
                        obj.bravo(41, obtainStyledAttributes.getInt(index2, c0811j.navy));
                        break;
                    case 42:
                        i10 = indexCount2;
                        obj.bravo(42, obtainStyledAttributes.getInt(index2, c0811j.ochre));
                        break;
                    case 43:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getFloat(index2, c0813l.charlie), 43);
                        break;
                    case 44:
                        i10 = indexCount2;
                        obj.delta(44, true);
                        obj.alpha(obtainStyledAttributes.getDimension(index2, c0814m.mike), 44);
                        break;
                    case 45:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getFloat(index2, c0814m.bravo), 45);
                        break;
                    case 46:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getFloat(index2, c0814m.charlie), 46);
                        break;
                    case 47:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getFloat(index2, c0814m.delta), 47);
                        break;
                    case 48:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getFloat(index2, c0814m.echo), 48);
                        break;
                    case 49:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getDimension(index2, c0814m.foxtrot), 49);
                        break;
                    case 50:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getDimension(index2, c0814m.golf), 50);
                        break;
                    case 51:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getDimension(index2, c0814m.india), 51);
                        break;
                    case 52:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getDimension(index2, c0814m.juliet), 52);
                        break;
                    case 53:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getDimension(index2, c0814m.kilo), 53);
                        break;
                    case 54:
                        i10 = indexCount2;
                        obj.bravo(54, obtainStyledAttributes.getInt(index2, c0811j.olive));
                        break;
                    case 55:
                        i10 = indexCount2;
                        obj.bravo(55, obtainStyledAttributes.getInt(index2, c0811j.orange));
                        break;
                    case 56:
                        i10 = indexCount2;
                        obj.bravo(56, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.peach));
                        break;
                    case 57:
                        i10 = indexCount2;
                        obj.bravo(57, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.pink));
                        break;
                    case 58:
                        i10 = indexCount2;
                        obj.bravo(58, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.plum));
                        break;
                    case 59:
                        i10 = indexCount2;
                        obj.bravo(59, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.purple));
                        break;
                    case 60:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getFloat(index2, c0814m.alpha), 60);
                        break;
                    case 62:
                        i10 = indexCount2;
                        obj.bravo(62, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.amber));
                        break;
                    case 63:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getFloat(index2, c0811j.azure), 63);
                        break;
                    case 64:
                        i10 = indexCount2;
                        obj.bravo(64, foxtrot(obtainStyledAttributes, index2, c0812k.alpha));
                        break;
                    case 65:
                        i10 = indexCount2;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obj.charlie(65, obtainStyledAttributes.getString(index2));
                        } else {
                            obj.charlie(65, strArr[obtainStyledAttributes.getInteger(index2, 0)]);
                        }
                        break;
                    case 66:
                        i10 = indexCount2;
                        obj.bravo(66, obtainStyledAttributes.getInt(index2, 0));
                        break;
                    case 67:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getFloat(index2, c0812k.echo), 67);
                        break;
                    case 68:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getFloat(index2, c0813l.delta), 68);
                        break;
                    case 69:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getFloat(index2, 1.0f), 69);
                        break;
                    case 70:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getFloat(index2, 1.0f), 70);
                        break;
                    case 71:
                        i10 = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i10 = indexCount2;
                        obj.bravo(72, obtainStyledAttributes.getInt(index2, c0811j.teal));
                        break;
                    case 73:
                        i10 = indexCount2;
                        obj.bravo(73, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.white));
                        break;
                    case 74:
                        i10 = indexCount2;
                        obj.charlie(74, obtainStyledAttributes.getString(index2));
                        break;
                    case 75:
                        i10 = indexCount2;
                        obj.delta(75, obtainStyledAttributes.getBoolean(index2, c0811j.f3472f));
                        break;
                    case 76:
                        i10 = indexCount2;
                        obj.bravo(76, obtainStyledAttributes.getInt(index2, c0812k.charlie));
                        break;
                    case 77:
                        i10 = indexCount2;
                        obj.charlie(77, obtainStyledAttributes.getString(index2));
                        break;
                    case 78:
                        i10 = indexCount2;
                        obj.bravo(78, obtainStyledAttributes.getInt(index2, c0813l.bravo));
                        break;
                    case 79:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getFloat(index2, c0812k.delta), 79);
                        break;
                    case 80:
                        i10 = indexCount2;
                        obj.delta(80, obtainStyledAttributes.getBoolean(index2, c0811j.f3471d));
                        break;
                    case 81:
                        i10 = indexCount2;
                        obj.delta(81, obtainStyledAttributes.getBoolean(index2, c0811j.e));
                        break;
                    case 82:
                        i10 = indexCount2;
                        obj.bravo(82, obtainStyledAttributes.getInteger(index2, c0812k.bravo));
                        break;
                    case 83:
                        i10 = indexCount2;
                        obj.bravo(83, foxtrot(obtainStyledAttributes, index2, c0814m.hotel));
                        break;
                    case 84:
                        i10 = indexCount2;
                        obj.bravo(84, obtainStyledAttributes.getInteger(index2, c0812k.golf));
                        break;
                    case 85:
                        i10 = indexCount2;
                        obj.alpha(obtainStyledAttributes.getFloat(index2, c0812k.foxtrot), 85);
                        break;
                    case 86:
                        i10 = indexCount2;
                        int i17 = obtainStyledAttributes.peekValue(index2).type;
                        if (i17 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index2, -1);
                            c0812k.india = resourceId2;
                            obj.bravo(89, resourceId2);
                            if (c0812k.india != -1) {
                                obj.bravo(88, -2);
                            }
                        } else if (i17 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            c0812k.hotel = string2;
                            obj.charlie(90, string2);
                            if (c0812k.hotel.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index2, -1);
                                c0812k.india = resourceId3;
                                obj.bravo(89, resourceId3);
                                obj.bravo(88, -2);
                            } else {
                                obj.bravo(88, -1);
                            }
                        } else {
                            obj.bravo(88, obtainStyledAttributes.getInteger(index2, c0812k.india));
                        }
                        break;
                    case 87:
                        i10 = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 93:
                        i10 = indexCount2;
                        obj.bravo(93, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.gold));
                        break;
                    case 94:
                        i10 = indexCount2;
                        obj.bravo(94, obtainStyledAttributes.getDimensionPixelSize(index2, c0811j.lime));
                        break;
                    case 95:
                        i10 = indexCount2;
                        golf(obj, obtainStyledAttributes, index2, 0);
                        break;
                    case 96:
                        i10 = indexCount2;
                        golf(obj, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i10 = indexCount2;
                        obj.bravo(97, obtainStyledAttributes.getInt(index2, c0811j.f3473g));
                        break;
                    case 98:
                        i10 = indexCount2;
                        int i18 = AbstractC0714a.f3323j;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                        } else {
                            c0810i.alpha = obtainStyledAttributes.getResourceId(index2, c0810i.alpha);
                        }
                        break;
                    case 99:
                        i10 = indexCount2;
                        obj.delta(99, obtainStyledAttributes.getBoolean(index2, c0811j.golf));
                        break;
                }
                i15 = i16 + 1;
            }
        }
        obtainStyledAttributes.recycle();
        return c0810i;
    }

    public static int foxtrot(TypedArray typedArray, int i4, int i5) {
        int resourceId = typedArray.getResourceId(i4, i5);
        if (resourceId == -1) {
            return typedArray.getInt(i4, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void golf(Object obj, TypedArray typedArray, int i4, int i5) {
        int dimensionPixelSize;
        if (obj != null) {
            int i10 = typedArray.peekValue(i4).type;
            boolean z2 = true;
            int i11 = 0;
            if (i10 != 3) {
                if (i10 != 5) {
                    dimensionPixelSize = typedArray.getInt(i4, 0);
                    if (dimensionPixelSize != -4) {
                        if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                            z2 = false;
                        }
                    } else {
                        i11 = -2;
                    }
                    if (!(obj instanceof C0806e)) {
                        C0806e c0806e = (C0806e) obj;
                        if (i5 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0806e).width = i11;
                            c0806e.ochre = z2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0806e).height = i11;
                            c0806e.olive = z2;
                            return;
                        }
                    }
                    if (obj instanceof C0811j) {
                        C0811j c0811j = (C0811j) obj;
                        if (i5 == 0) {
                            c0811j.bravo = i11;
                            c0811j.f3471d = z2;
                            return;
                        } else {
                            c0811j.charlie = i11;
                            c0811j.e = z2;
                            return;
                        }
                    }
                    if (obj instanceof C0809h) {
                        C0809h c0809h = (C0809h) obj;
                        if (i5 == 0) {
                            c0809h.bravo(23, i11);
                            c0809h.delta(80, z2);
                            return;
                        } else {
                            c0809h.bravo(21, i11);
                            c0809h.delta(81, z2);
                            return;
                        }
                    }
                    return;
                }
                dimensionPixelSize = typedArray.getDimensionPixelSize(i4, 0);
                z2 = false;
                i11 = dimensionPixelSize;
                if (!(obj instanceof C0806e)) {
                }
            } else {
                String string = typedArray.getString(i4);
                if (string != null) {
                    int indexOf = string.indexOf(61);
                    int length = string.length();
                    if (indexOf > 0 && indexOf < length - 1) {
                        String substring = string.substring(0, indexOf);
                        String substring2 = string.substring(indexOf + 1);
                        if (substring2.length() > 0) {
                            String trim = substring.trim();
                            String trim2 = substring2.trim();
                            if ("ratio".equalsIgnoreCase(trim)) {
                                if (obj instanceof C0806e) {
                                    C0806e c0806e2 = (C0806e) obj;
                                    if (i5 == 0) {
                                        ((ViewGroup.MarginLayoutParams) c0806e2).width = 0;
                                    } else {
                                        ((ViewGroup.MarginLayoutParams) c0806e2).height = 0;
                                    }
                                    hotel(c0806e2, trim2);
                                    return;
                                }
                                if (obj instanceof C0811j) {
                                    ((C0811j) obj).yankee = trim2;
                                    return;
                                } else {
                                    if (obj instanceof C0809h) {
                                        ((C0809h) obj).charlie(5, trim2);
                                        return;
                                    }
                                    return;
                                }
                            }
                            try {
                                if ("weight".equalsIgnoreCase(trim)) {
                                    float parseFloat = Float.parseFloat(trim2);
                                    if (obj instanceof C0806e) {
                                        C0806e c0806e3 = (C0806e) obj;
                                        if (i5 == 0) {
                                            ((ViewGroup.MarginLayoutParams) c0806e3).width = 0;
                                            c0806e3.crimson = parseFloat;
                                            return;
                                        } else {
                                            ((ViewGroup.MarginLayoutParams) c0806e3).height = 0;
                                            c0806e3.cyan = parseFloat;
                                            return;
                                        }
                                    }
                                    if (obj instanceof C0811j) {
                                        C0811j c0811j2 = (C0811j) obj;
                                        if (i5 == 0) {
                                            c0811j2.bravo = 0;
                                            c0811j2.maroon = parseFloat;
                                            return;
                                        } else {
                                            c0811j2.charlie = 0;
                                            c0811j2.magenta = parseFloat;
                                            return;
                                        }
                                    }
                                    if (obj instanceof C0809h) {
                                        C0809h c0809h2 = (C0809h) obj;
                                        if (i5 == 0) {
                                            c0809h2.bravo(23, 0);
                                            c0809h2.alpha(parseFloat, 39);
                                            return;
                                        } else {
                                            c0809h2.bravo(21, 0);
                                            c0809h2.alpha(parseFloat, 40);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                if ("parent".equalsIgnoreCase(trim)) {
                                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                                    if (obj instanceof C0806e) {
                                        C0806e c0806e4 = (C0806e) obj;
                                        if (i5 == 0) {
                                            ((ViewGroup.MarginLayoutParams) c0806e4).width = 0;
                                            c0806e4.lavender = max;
                                            c0806e4.gold = 2;
                                            return;
                                        } else {
                                            ((ViewGroup.MarginLayoutParams) c0806e4).height = 0;
                                            c0806e4.lime = max;
                                            c0806e4.gray = 2;
                                            return;
                                        }
                                    }
                                    if (obj instanceof C0811j) {
                                        C0811j c0811j3 = (C0811j) obj;
                                        if (i5 == 0) {
                                            c0811j3.bravo = 0;
                                            c0811j3.red = max;
                                            c0811j3.olive = 2;
                                            return;
                                        } else {
                                            c0811j3.charlie = 0;
                                            c0811j3.silver = max;
                                            c0811j3.orange = 2;
                                            return;
                                        }
                                    }
                                    if (obj instanceof C0809h) {
                                        C0809h c0809h3 = (C0809h) obj;
                                        if (i5 == 0) {
                                            c0809h3.bravo(23, 0);
                                            c0809h3.bravo(54, 2);
                                        } else {
                                            c0809h3.bravo(21, 0);
                                            c0809h3.bravo(55, 2);
                                        }
                                    }
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            }
        }
    }

    public static void hotel(C0806e c0806e, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            char c3 = 65535;
            int i4 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    c3 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    c3 = 1;
                }
                i4 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i4, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (c3 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i4);
                    if (substring4.length() > 0) {
                        Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c0806e.coral = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x010b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.view.View, c1.a, c1.c] */
    /* JADX WARN: Type inference failed for: r8v4, types: [Z0.a, Z0.i] */
    public final void alpha(ConstraintLayout constraintLayout) {
        int i4;
        HashSet hashSet;
        int i5;
        String str;
        int i10;
        String str2;
        C0815n c0815n = this;
        int i11 = 1;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = c0815n.charlie;
        HashSet hashSet2 = new HashSet(hashMap.keySet());
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = constraintLayout.getChildAt(i12);
            int id2 = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    str2 = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str2 = "UNKNOWN";
                }
                sb2.append(str2);
                Log.w("ConstraintSet", sb2.toString());
            } else {
                if (c0815n.bravo && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id2))) {
                        hashSet2.remove(Integer.valueOf(id2));
                        C0810i c0810i = (C0810i) hashMap.get(Integer.valueOf(id2));
                        if (c0810i != null) {
                            if (childAt instanceof C0802a) {
                                C0811j c0811j = c0810i.delta;
                                c0811j.yellow = i11;
                                C0802a c0802a = (C0802a) childAt;
                                c0802a.setId(id2);
                                c0802a.setType(c0811j.teal);
                                c0802a.setMargin(c0811j.white);
                                c0802a.setAllowsGoneWidget(c0811j.f3472f);
                                int[] iArr = c0811j.f3468a;
                                if (iArr != null) {
                                    c0802a.setReferencedIds(iArr);
                                } else {
                                    String str3 = c0811j.f3469b;
                                    if (str3 != null) {
                                        int[] charlie = charlie(c0802a, str3);
                                        c0811j.f3468a = charlie;
                                        c0802a.setReferencedIds(charlie);
                                    }
                                }
                            }
                            C0806e c0806e = (C0806e) childAt.getLayoutParams();
                            c0806e.alpha();
                            c0810i.alpha(c0806e);
                            HashMap hashMap2 = c0810i.foxtrot;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap2.keySet()) {
                                C0803b c0803b = (C0803b) hashMap2.get(str4);
                                if (!c0803b.alpha) {
                                    str = av.q.echo("set", str4);
                                } else {
                                    str = str4;
                                }
                                HashSet hashSet3 = hashSet2;
                                try {
                                    int mike = av.q.mike(c0803b.bravo);
                                    Class<?> cls2 = Float.TYPE;
                                    Class<?> cls3 = Integer.TYPE;
                                    switch (mike) {
                                        case 0:
                                            i10 = i12;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(c0803b.charlie));
                                            break;
                                        case 1:
                                            i10 = i12;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(c0803b.delta));
                                            break;
                                        case 2:
                                            i10 = i12;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(c0803b.golf));
                                            break;
                                        case 3:
                                            i10 = i12;
                                            Method method = cls.getMethod(str, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(c0803b.golf);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            i10 = i12;
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c0803b.echo);
                                            break;
                                        case 5:
                                            i10 = i12;
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0803b.foxtrot));
                                            break;
                                        case 6:
                                            i10 = i12;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(c0803b.delta));
                                            break;
                                        case 7:
                                            i10 = i12;
                                            try {
                                                cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(c0803b.charlie));
                                            } catch (IllegalAccessException e) {
                                                e = e;
                                                StringBuilder victor = Q0.c.victor(" Custom Attribute \"", str4, "\" not found on ");
                                                victor.append(cls.getName());
                                                Log.e("TransitionLayout", victor.toString(), e);
                                                hashSet2 = hashSet3;
                                                i12 = i10;
                                            } catch (NoSuchMethodException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                                hashSet2 = hashSet3;
                                                i12 = i10;
                                            } catch (InvocationTargetException e5) {
                                                e = e5;
                                                StringBuilder victor2 = Q0.c.victor(" Custom Attribute \"", str4, "\" not found on ");
                                                victor2.append(cls.getName());
                                                Log.e("TransitionLayout", victor2.toString(), e);
                                                hashSet2 = hashSet3;
                                                i12 = i10;
                                            }
                                        default:
                                            i10 = i12;
                                            break;
                                    }
                                } catch (IllegalAccessException e10) {
                                    e = e10;
                                    i10 = i12;
                                } catch (NoSuchMethodException e11) {
                                    e = e11;
                                    i10 = i12;
                                } catch (InvocationTargetException e12) {
                                    e = e12;
                                    i10 = i12;
                                }
                                hashSet2 = hashSet3;
                                i12 = i10;
                            }
                            hashSet = hashSet2;
                            i5 = i12;
                            childAt.setLayoutParams(c0806e);
                            C0813l c0813l = c0810i.bravo;
                            if (c0813l.bravo == 0) {
                                childAt.setVisibility(c0813l.alpha);
                            }
                            childAt.setAlpha(c0813l.charlie);
                            C0814m c0814m = c0810i.echo;
                            childAt.setRotation(c0814m.alpha);
                            childAt.setRotationX(c0814m.bravo);
                            childAt.setRotationY(c0814m.charlie);
                            childAt.setScaleX(c0814m.delta);
                            childAt.setScaleY(c0814m.echo);
                            if (c0814m.hotel != -1) {
                                if (((View) childAt.getParent()).findViewById(c0814m.hotel) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c0814m.foxtrot)) {
                                    childAt.setPivotX(c0814m.foxtrot);
                                }
                                if (!Float.isNaN(c0814m.golf)) {
                                    childAt.setPivotY(c0814m.golf);
                                }
                            }
                            childAt.setTranslationX(c0814m.india);
                            childAt.setTranslationY(c0814m.juliet);
                            childAt.setTranslationZ(c0814m.kilo);
                            if (c0814m.lima) {
                                childAt.setElevation(c0814m.mike);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i5 = i12;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                    i12 = i5 + 1;
                    c0815n = this;
                    hashSet2 = hashSet;
                    i11 = 1;
                }
            }
            hashSet = hashSet2;
            i5 = i12;
            i12 = i5 + 1;
            c0815n = this;
            hashSet2 = hashSet;
            i11 = 1;
        }
        int i13 = 0;
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0810i c0810i2 = (C0810i) hashMap.get(num);
            if (c0810i2 != null) {
                C0811j c0811j2 = c0810i2.delta;
                if (c0811j2.yellow == 1) {
                    Context context = constraintLayout.getContext();
                    ?? view = new View(context);
                    view.alpha = new int[32];
                    view.yellow = new HashMap();
                    view.red = context;
                    ?? iVar = new Z0.i();
                    boolean z2 = i13;
                    iVar.f2444k = z2 ? 1 : 0;
                    iVar.f2445l = true;
                    iVar.f2446m = z2 ? 1 : 0;
                    iVar.f2447n = z2;
                    view.f3459c = iVar;
                    view.silver = iVar;
                    view.india();
                    view.setVisibility(8);
                    view.setId(num.intValue());
                    int[] iArr2 = c0811j2.f3468a;
                    if (iArr2 != null) {
                        view.setReferencedIds(iArr2);
                    } else {
                        String str5 = c0811j2.f3469b;
                        if (str5 != null) {
                            int[] charlie2 = charlie(view, str5);
                            c0811j2.f3468a = charlie2;
                            view.setReferencedIds(charlie2);
                        }
                    }
                    view.setType(c0811j2.teal);
                    view.setMargin(c0811j2.white);
                    C0821t c0821t = ConstraintLayout.f3029i;
                    C0806e c0806e2 = new C0806e();
                    view.india();
                    c0810i2.alpha(c0806e2);
                    constraintLayout.addView((View) view, c0806e2);
                    i4 = z2;
                } else {
                    i4 = i13;
                }
                if (c0811j2.alpha) {
                    C0818q c0818q = new C0818q(constraintLayout.getContext());
                    c0818q.setId(num.intValue());
                    C0821t c0821t2 = ConstraintLayout.f3029i;
                    C0806e c0806e3 = new C0806e();
                    c0810i2.alpha(c0806e3);
                    constraintLayout.addView(c0818q, c0806e3);
                }
                i13 = i4;
            }
        }
        for (int i14 = i13; i14 < childCount; i14++) {
            View childAt2 = constraintLayout.getChildAt(i14);
            if (childAt2 instanceof AbstractC0804c) {
                ((AbstractC0804c) childAt2).echo(constraintLayout);
            }
        }
    }

    public final void bravo(ConstraintLayout constraintLayout) {
        int i4;
        HashMap hashMap;
        HashMap hashMap2;
        C0815n c0815n = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap3 = c0815n.charlie;
        hashMap3.clear();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            C0806e c0806e = (C0806e) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (c0815n.bravo && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap3.containsKey(Integer.valueOf(id2))) {
                hashMap3.put(Integer.valueOf(id2), new C0810i());
            }
            C0810i c0810i = (C0810i) hashMap3.get(Integer.valueOf(id2));
            if (c0810i == null) {
                i4 = childCount;
                hashMap = hashMap3;
            } else {
                HashMap hashMap4 = c0815n.alpha;
                HashMap hashMap5 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap4.keySet()) {
                    C0803b c0803b = (C0803b) hashMap4.get(str);
                    int i10 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap2 = hashMap3;
                            try {
                                hashMap5.put(str, new C0803b(c0803b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e) {
                                e = e;
                                StringBuilder victor = Q0.c.victor(" Custom Attribute \"", str, "\" not found on ");
                                victor.append(cls.getName());
                                Log.e("TransitionLayout", victor.toString(), e);
                                childCount = i10;
                                hashMap3 = hashMap2;
                            } catch (NoSuchMethodException e4) {
                                e = e4;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                childCount = i10;
                                hashMap3 = hashMap2;
                            } catch (InvocationTargetException e5) {
                                e = e5;
                                StringBuilder victor2 = Q0.c.victor(" Custom Attribute \"", str, "\" not found on ");
                                victor2.append(cls.getName());
                                Log.e("TransitionLayout", victor2.toString(), e);
                                childCount = i10;
                                hashMap3 = hashMap2;
                            }
                        } else {
                            hashMap2 = hashMap3;
                            hashMap5.put(str, new C0803b(c0803b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e10) {
                        e = e10;
                        hashMap2 = hashMap3;
                    } catch (NoSuchMethodException e11) {
                        e = e11;
                        hashMap2 = hashMap3;
                    } catch (InvocationTargetException e12) {
                        e = e12;
                        hashMap2 = hashMap3;
                    }
                    childCount = i10;
                    hashMap3 = hashMap2;
                }
                i4 = childCount;
                hashMap = hashMap3;
                c0810i.foxtrot = hashMap5;
                c0810i.bravo(id2, c0806e);
                int visibility = childAt.getVisibility();
                C0813l c0813l = c0810i.bravo;
                c0813l.alpha = visibility;
                c0813l.charlie = childAt.getAlpha();
                float rotation = childAt.getRotation();
                C0814m c0814m = c0810i.echo;
                c0814m.alpha = rotation;
                c0814m.bravo = childAt.getRotationX();
                c0814m.charlie = childAt.getRotationY();
                c0814m.delta = childAt.getScaleX();
                c0814m.echo = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c0814m.foxtrot = pivotX;
                    c0814m.golf = pivotY;
                }
                c0814m.india = childAt.getTranslationX();
                c0814m.juliet = childAt.getTranslationY();
                c0814m.kilo = childAt.getTranslationZ();
                if (c0814m.lima) {
                    c0814m.mike = childAt.getElevation();
                }
                if (childAt instanceof C0802a) {
                    C0802a c0802a = (C0802a) childAt;
                    boolean allowsGoneWidget = c0802a.getAllowsGoneWidget();
                    C0811j c0811j = c0810i.delta;
                    c0811j.f3472f = allowsGoneWidget;
                    c0811j.f3468a = c0802a.getReferencedIds();
                    c0811j.teal = c0802a.getType();
                    c0811j.white = c0802a.getMargin();
                }
            }
            i5++;
            c0815n = this;
            childCount = i4;
            hashMap3 = hashMap;
        }
    }

    public final void echo(int i4, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    C0810i delta2 = delta(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        delta2.delta.alpha = true;
                    }
                    this.charlie.put(Integer.valueOf(delta2.alpha), delta2);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i4, e);
        } catch (XmlPullParserException e4) {
            Log.e("ConstraintSet", "Error parsing resource: " + i4, e4);
        }
    }
}
