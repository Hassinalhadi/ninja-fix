package i1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.clevertap.android.sdk.leanplum.Constants;
import delivery.samurai.android.R;
import e1.AbstractC1625a;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: i1.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1882c {
    public static final ThreadLocal alpha = new ThreadLocal();

    public static ColorStateList alpha(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return bravo(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0136  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList bravo(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        ?? r92;
        int color;
        float f5;
        float f10;
        int attributeCount;
        int i4;
        char c3;
        int[] iArr;
        int i5;
        int foxtrot;
        float min;
        float f11;
        int i10;
        float cbrt;
        int i11;
        int i12;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (name.equals("selector")) {
            boolean z2 = 1;
            int depth2 = xmlResourceParser.getDepth() + 1;
            int[][] iArr2 = new int[20];
            int[] iArr3 = new int[20];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int next = xmlResourceParser.next();
                if (next == z2 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                    break;
                }
                if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals(Constants.IAP_ITEM_PARAM)) {
                    int[] iArr4 = AbstractC1625a.alpha;
                    if (theme2 == null) {
                        r92 = r02.obtainAttributes(attributeSet2, iArr4);
                    } else {
                        r92 = theme2.obtainStyledAttributes(attributeSet2, iArr4, i13, i13);
                    }
                    int resourceId = r92.getResourceId(i13, -1);
                    if (resourceId != -1) {
                        ThreadLocal threadLocal = alpha;
                        TypedValue typedValue2 = (TypedValue) threadLocal.get();
                        if (typedValue2 == null) {
                            typedValue = new TypedValue();
                            threadLocal.set(typedValue);
                        } else {
                            typedValue = typedValue2;
                        }
                        r02.getValue(resourceId, typedValue, z2);
                        int i15 = typedValue.type;
                        if (i15 < 28 || i15 > 31) {
                            try {
                                color = alpha(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                            } catch (Exception unused) {
                                color = r92.getColor(i13, -65281);
                            }
                            if (!r92.hasValue(z2)) {
                                f5 = r92.getFloat(z2, 1.0f);
                            } else if (r92.hasValue(3)) {
                                f5 = r92.getFloat(3, 1.0f);
                            } else {
                                f5 = 1.0f;
                            }
                            char c4 = z2;
                            if (Build.VERSION.SDK_INT < 31 && r92.hasValue(2)) {
                                f10 = r92.getFloat(2, -1.0f);
                            } else {
                                f10 = r92.getFloat(4, -1.0f);
                            }
                            r92.recycle();
                            attributeCount = attributeSet2.getAttributeCount();
                            int[] iArr5 = new int[attributeCount];
                            i4 = i13;
                            int i16 = i4;
                            while (i4 < attributeCount) {
                                int attributeNameResource = attributeSet2.getAttributeNameResource(i4);
                                if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                    int i17 = i16 + 1;
                                    if (!attributeSet2.getAttributeBooleanValue(i4, false)) {
                                        attributeNameResource = -attributeNameResource;
                                    }
                                    iArr5[i16] = attributeNameResource;
                                    i16 = i17;
                                }
                                i4++;
                            }
                            int[] trimStateSet = StateSet.trimStateSet(iArr5, i16);
                            float f12 = 100.0f;
                            if (f10 < 0.0f && f10 <= 100.0f) {
                                c3 = c4;
                            } else {
                                c3 = 0;
                            }
                            if (f5 != 1.0f && c3 == 0) {
                                iArr = trimStateSet;
                                i5 = depth2;
                            } else {
                                int bravo = O6.c.bravo((int) ((Color.alpha(color) * f5) + 0.5f), 0, 255);
                                if (c3 == 0) {
                                    C1880a alpha2 = C1880a.alpha(color);
                                    l lVar = l.kilo;
                                    float f13 = alpha2.bravo;
                                    if (f13 < 1.0d || Math.round(f10) <= 0.0d || Math.round(f10) >= 100.0d) {
                                        iArr = trimStateSet;
                                        i5 = depth2;
                                        foxtrot = AbstractC1881b.foxtrot(f10);
                                    } else {
                                        float f14 = alpha2.alpha;
                                        if (f14 < 0.0f) {
                                            min = 0.0f;
                                        } else {
                                            min = Math.min(360.0f, f14);
                                        }
                                        float f15 = 0.0f;
                                        float f16 = f13;
                                        char c10 = c4;
                                        C1880a c1880a = null;
                                        while (true) {
                                            if (Math.abs(f15 - f13) >= 0.4f) {
                                                float f17 = 1000.0f;
                                                float f18 = f12;
                                                float f19 = 0.0f;
                                                float f20 = 1000.0f;
                                                C1880a c1880a2 = null;
                                                while (true) {
                                                    if (Math.abs(f19 - f18) > 0.01f) {
                                                        f11 = f12;
                                                        float f21 = ((f18 - f19) / 2.0f) + f19;
                                                        iArr = trimStateSet;
                                                        int charlie = C1880a.bravo(f21, f16, min).charlie(l.kilo);
                                                        float golf = AbstractC1881b.golf(Color.red(charlie));
                                                        float golf2 = AbstractC1881b.golf(Color.green(charlie));
                                                        float golf3 = AbstractC1881b.golf(Color.blue(charlie));
                                                        float[] fArr = AbstractC1881b.delta[c4];
                                                        float f22 = ((golf3 * fArr[2]) + ((golf2 * fArr[c4]) + (golf * fArr[0]))) / f11;
                                                        if (f22 <= 0.008856452f) {
                                                            cbrt = f22 * 903.2963f;
                                                            i10 = charlie;
                                                        } else {
                                                            i10 = charlie;
                                                            cbrt = (((float) Math.cbrt(f22)) * 116.0f) - 16.0f;
                                                        }
                                                        float abs = Math.abs(f10 - cbrt);
                                                        if (abs < 0.2f) {
                                                            C1880a alpha3 = C1880a.alpha(i10);
                                                            C1880a bravo2 = C1880a.bravo(alpha3.charlie, alpha3.bravo, min);
                                                            float f23 = alpha3.delta - bravo2.delta;
                                                            float f24 = alpha3.echo - bravo2.echo;
                                                            float f25 = alpha3.foxtrot - bravo2.foxtrot;
                                                            i5 = depth2;
                                                            float pow = (float) (Math.pow(Math.sqrt((f25 * f25) + (f24 * f24) + (f23 * f23)), 0.63d) * 1.41d);
                                                            if (pow <= 1.0f) {
                                                                f20 = pow;
                                                                f17 = abs;
                                                                c1880a2 = alpha3;
                                                            }
                                                        } else {
                                                            i5 = depth2;
                                                        }
                                                        if (f17 == 0.0f && f20 == 0.0f) {
                                                            break;
                                                        }
                                                        if (cbrt < f10) {
                                                            f19 = f21;
                                                        } else {
                                                            f18 = f21;
                                                        }
                                                        f12 = f11;
                                                        trimStateSet = iArr;
                                                        depth2 = i5;
                                                    } else {
                                                        iArr = trimStateSet;
                                                        i5 = depth2;
                                                        f11 = f12;
                                                        break;
                                                    }
                                                }
                                                C1880a c1880a3 = c1880a2;
                                                if (c10 != 0) {
                                                    if (c1880a3 != null) {
                                                        foxtrot = c1880a3.charlie(lVar);
                                                        break;
                                                    }
                                                    f16 = ((f13 - f15) / 2.0f) + f15;
                                                    f12 = f11;
                                                    trimStateSet = iArr;
                                                    depth2 = i5;
                                                    c10 = 0;
                                                } else {
                                                    if (c1880a3 == null) {
                                                        f13 = f16;
                                                    } else {
                                                        c1880a = c1880a3;
                                                        f15 = f16;
                                                    }
                                                    f16 = ((f13 - f15) / 2.0f) + f15;
                                                    f12 = f11;
                                                    trimStateSet = iArr;
                                                    depth2 = i5;
                                                }
                                            } else {
                                                iArr = trimStateSet;
                                                i5 = depth2;
                                                if (c1880a == null) {
                                                    foxtrot = AbstractC1881b.foxtrot(f10);
                                                } else {
                                                    foxtrot = c1880a.charlie(lVar);
                                                }
                                            }
                                        }
                                    }
                                    color = foxtrot;
                                } else {
                                    iArr = trimStateSet;
                                    i5 = depth2;
                                }
                                color = (16777215 & color) | (bravo << 24);
                            }
                            i11 = i14 + 1;
                            int i18 = 8;
                            if (i11 > iArr3.length) {
                                if (i14 <= 4) {
                                    i12 = 8;
                                } else {
                                    i12 = i14 * 2;
                                }
                                int[] iArr6 = new int[i12];
                                System.arraycopy(iArr3, 0, iArr6, 0, i14);
                                iArr3 = iArr6;
                            }
                            iArr3[i14] = color;
                            if (i11 > iArr2.length) {
                                Class<?> componentType = iArr2.getClass().getComponentType();
                                if (i14 > 4) {
                                    i18 = i14 * 2;
                                }
                                ?? r12 = (Object[]) Array.newInstance(componentType, i18);
                                System.arraycopy(iArr2, 0, r12, 0, i14);
                                iArr2 = r12;
                            }
                            iArr2[i14] = iArr;
                            iArr2 = iArr2;
                            attributeSet2 = attributeSet;
                            theme2 = theme;
                            i14 = i11;
                            z2 = c4;
                            depth2 = i5;
                            i13 = 0;
                            r02 = resources;
                        }
                    }
                    color = r92.getColor(i13, -65281);
                    if (!r92.hasValue(z2)) {
                    }
                    char c42 = z2;
                    if (Build.VERSION.SDK_INT < 31) {
                    }
                    f10 = r92.getFloat(4, -1.0f);
                    r92.recycle();
                    attributeCount = attributeSet2.getAttributeCount();
                    int[] iArr52 = new int[attributeCount];
                    i4 = i13;
                    int i162 = i4;
                    while (i4 < attributeCount) {
                    }
                    int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i162);
                    float f122 = 100.0f;
                    if (f10 < 0.0f) {
                    }
                    c3 = 0;
                    if (f5 != 1.0f) {
                    }
                    int bravo3 = O6.c.bravo((int) ((Color.alpha(color) * f5) + 0.5f), 0, 255);
                    if (c3 == 0) {
                    }
                    color = (16777215 & color) | (bravo3 << 24);
                    i11 = i14 + 1;
                    int i182 = 8;
                    if (i11 > iArr3.length) {
                    }
                    iArr3[i14] = color;
                    if (i11 > iArr2.length) {
                    }
                    iArr2[i14] = iArr;
                    iArr2 = iArr2;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    i14 = i11;
                    z2 = c42;
                    depth2 = i5;
                    i13 = 0;
                    r02 = resources;
                } else {
                    r02 = resources;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    z2 = z2;
                    depth2 = depth2;
                    i13 = 0;
                }
            }
            int[] iArr7 = new int[i14];
            int[][] iArr8 = new int[i14];
            System.arraycopy(iArr3, 0, iArr7, 0, i14);
            System.arraycopy(iArr2, 0, iArr8, 0, i14);
            return new ColorStateList(iArr8, iArr7);
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
    }
}
