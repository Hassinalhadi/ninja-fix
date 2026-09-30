package i1;

import Jb.at;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.zendesk.service.HttpConstants;
import e1.AbstractC1625a;
import h9.z;
import j1.AbstractC1928b;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1881b {
    public static final float[][] alpha = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] bravo = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] charlie = {95.047f, 100.0f, 108.883f};
    public static final float[][] delta = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final Object echo = new Object();
    public static Method foxtrot;
    public static boolean golf;

    public static ColorStateList bravo(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        boolean z2;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(1, typedValue);
            int i4 = typedValue.type;
            if (i4 != 2) {
                if (i4 >= 28 && i4 <= 31) {
                    return ColorStateList.valueOf(typedValue.data);
                }
                Resources resources = typedArray.getResources();
                int resourceId = typedArray.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC1882c.alpha;
                try {
                    return AbstractC1882c.alpha(resources, resources.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                    return null;
                }
            }
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        return null;
    }

    public static B0.a charlie(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i4) {
        B0.a aVar;
        if (echo(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i4, typedValue);
            int i5 = typedValue.type;
            if (i5 >= 28 && i5 <= 31) {
                return new B0.a(null, null, typedValue.data);
            }
            try {
                aVar = B0.a.charlie(typedArray.getResourceId(i4, 0), theme, typedArray.getResources());
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                aVar = null;
            }
            if (aVar != null) {
                return aVar;
            }
        }
        return new B0.a(null, null, 0);
    }

    public static String delta(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i4) {
        if (!echo(xmlResourceParser, str)) {
            return null;
        }
        return typedArray.getString(i4);
    }

    public static boolean echo(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static int foxtrot(float f5) {
        float f10;
        boolean z2;
        float f11;
        if (f5 < 1.0f) {
            return ShapeBuilder.DEFAULT_SHAPE_COLOR;
        }
        if (f5 > 99.0f) {
            return -1;
        }
        float f12 = (f5 + 16.0f) / 116.0f;
        if (f5 > 8.0f) {
            f10 = f12 * f12 * f12;
        } else {
            f10 = f5 / 903.2963f;
        }
        float f13 = f12 * f12 * f12;
        if (f13 > 0.008856452f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f11 = f13;
        } else {
            f11 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z2) {
            f13 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = charlie;
        return AbstractC1928b.alpha(f11 * fArr[0], f10 * fArr[1], f13 * fArr[2]);
    }

    public static float golf(int i4) {
        float pow;
        float f5 = i4 / 255.0f;
        if (f5 <= 0.04045f) {
            pow = f5 / 12.92f;
        } else {
            pow = (float) Math.pow((f5 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static TypedArray hotel(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC1883d kilo(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i4;
        int i5;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13;
        do {
            next = xmlResourceParser.next();
            i4 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1625a.bravo);
                int i14 = 0;
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(5);
                String string3 = obtainAttributes.getString(6);
                String string4 = obtainAttributes.getString(2);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int i15 = 3;
                int integer = obtainAttributes.getInteger(3, 1);
                int integer2 = obtainAttributes.getInteger(4, HttpConstants.HTTP_INTERNAL_ERROR);
                String string5 = obtainAttributes.getString(7);
                obtainAttributes.recycle();
                if (string != null && string2 != null) {
                    List lima = lima(resources, resourceId);
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != i15) {
                        if (xmlResourceParser.getEventType() == i4) {
                            if (xmlResourceParser.getName().equals("fallback")) {
                                TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1625a.delta);
                                try {
                                    String string6 = obtainAttributes2.getString(i14);
                                    String string7 = obtainAttributes2.getString(1);
                                    i13 = integer;
                                    String string8 = obtainAttributes2.getString(i4);
                                    if (string6 != null) {
                                        while (xmlResourceParser.next() != i15) {
                                            november(xmlResourceParser);
                                        }
                                        i12 = integer2;
                                        p1.d dVar = new p1.d(string, string2, string6, lima, string7, string8);
                                        if (obtainAttributes2 instanceof AutoCloseable) {
                                            obtainAttributes2.close();
                                        } else if (obtainAttributes2 instanceof ExecutorService) {
                                            z.tango((ExecutorService) obtainAttributes2);
                                        } else {
                                            obtainAttributes2.recycle();
                                        }
                                        arrayList.add(dVar);
                                    } else {
                                        throw new XmlPullParserException("query attribute must be set in fallback element");
                                    }
                                } catch (Throwable th) {
                                    if (obtainAttributes2 != 0) {
                                        try {
                                            if (!(obtainAttributes2 instanceof AutoCloseable)) {
                                                if (obtainAttributes2 instanceof ExecutorService) {
                                                    z.tango((ExecutorService) obtainAttributes2);
                                                } else {
                                                    obtainAttributes2.recycle();
                                                }
                                            } else {
                                                obtainAttributes2.close();
                                            }
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                    throw th;
                                }
                            } else {
                                i12 = integer2;
                                i13 = integer;
                                november(xmlResourceParser);
                            }
                            integer2 = i12;
                            integer = i13;
                            i4 = 2;
                            i14 = 0;
                            i15 = 3;
                        }
                    }
                    int i16 = integer2;
                    int i17 = integer;
                    if (!arrayList.isEmpty()) {
                        return new g(arrayList, i17, i16, string5);
                    }
                    if (string3 != null) {
                        arrayList.add(new p1.d(string, string2, string3, lima, null, null));
                        if (string4 != null) {
                            arrayList.add(new p1.d(string, string2, string4, lima, null, null));
                        }
                        return new g(arrayList, i17, i16, string5);
                    }
                    throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
                }
                ArrayList arrayList2 = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1625a.charlie);
                            int i18 = 8;
                            if (!obtainAttributes3.hasValue(8)) {
                                i18 = 1;
                            }
                            int i19 = obtainAttributes3.getInt(i18, HttpConstants.HTTP_BAD_REQUEST);
                            if (obtainAttributes3.hasValue(6)) {
                                i5 = 6;
                            } else {
                                i5 = 2;
                            }
                            if (1 == obtainAttributes3.getInt(i5, 0)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            int i20 = 9;
                            if (!obtainAttributes3.hasValue(9)) {
                                i20 = 3;
                            }
                            if (obtainAttributes3.hasValue(7)) {
                                i10 = 7;
                            } else {
                                i10 = 4;
                            }
                            String string9 = obtainAttributes3.getString(i10);
                            int i21 = obtainAttributes3.getInt(i20, 0);
                            if (obtainAttributes3.hasValue(5)) {
                                i11 = 5;
                            } else {
                                i11 = 0;
                            }
                            int resourceId2 = obtainAttributes3.getResourceId(i11, 0);
                            String string10 = obtainAttributes3.getString(i11);
                            obtainAttributes3.recycle();
                            while (xmlResourceParser.next() != 3) {
                                november(xmlResourceParser);
                            }
                            arrayList2.add(new C1885f(i19, i21, resourceId2, string10, string9, z2));
                        } else {
                            november(xmlResourceParser);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    return null;
                }
                return new C1884e((C1885f[]) arrayList2.toArray(new C1885f[0]));
            }
            november(xmlResourceParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List lima(Resources resources, int i4) {
        if (i4 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i4);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i5 = 0; i5 < obtainTypedArray.length(); i5++) {
                    int resourceId = obtainTypedArray.getResourceId(i5, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i4);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void mike(Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 29) {
            j.alpha(theme);
            return;
        }
        synchronized (echo) {
            if (!golf) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                    foxtrot = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                }
                golf = true;
            }
            Method method = foxtrot;
            if (method != null) {
                try {
                    method.invoke(theme, null);
                } catch (IllegalAccessException | InvocationTargetException e4) {
                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e4);
                    foxtrot = null;
                }
            }
        }
    }

    public static void november(XmlResourceParser xmlResourceParser) {
        int i4 = 1;
        while (i4 > 0) {
            int next = xmlResourceParser.next();
            if (next != 2) {
                if (next == 3) {
                    i4--;
                }
            } else {
                i4++;
            }
        }
    }

    public static float oscar() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void alpha(int i4) {
        new Handler(Looper.getMainLooper()).post(new at(this, i4, 5));
    }

    public abstract void india(int i4);

    public abstract void juliet(Typeface typeface);
}
