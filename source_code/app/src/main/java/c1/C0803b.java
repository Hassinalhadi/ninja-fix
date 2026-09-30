package c1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0803b {
    public boolean alpha = false;
    public int bravo;
    public int charlie;
    public float delta;
    public String echo;
    public boolean foxtrot;
    public int golf;

    public C0803b(C0803b c0803b, Object obj) {
        c0803b.getClass();
        this.bravo = c0803b.bravo;
        bravo(obj);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, c1.b] */
    public static void alpha(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0820s.echo);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i4 = 0;
        boolean z2 = false;
        Object obj = null;
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = obtainStyledAttributes.getIndex(i5);
            int i10 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z2 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i4 = 6;
            } else {
                int i11 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i11 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i11 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i4 = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i10 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i4 = i10;
                            }
                        }
                        i4 = 7;
                    }
                }
                i4 = i11;
            }
        }
        if (str != null && obj != null) {
            ?? obj2 = new Object();
            obj2.bravo = i4;
            obj2.alpha = z2;
            obj2.bravo(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void bravo(Object obj) {
        switch (av.q.mike(this.bravo)) {
            case 0:
            case 7:
                this.charlie = ((Integer) obj).intValue();
                return;
            case 1:
                this.delta = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.golf = ((Integer) obj).intValue();
                return;
            case 4:
                this.echo = (String) obj;
                return;
            case 5:
                this.foxtrot = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.delta = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
