package bn;

import A0.af;
import S.j;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.camera.core.impl.InterfaceC0525x;
import androidx.camera.core.impl.Z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final class a {
    public static final double hotel = Math.sqrt(2.3703703703703702d);
    public final Size alpha;
    public final Rational bravo;
    public final Rational charlie;
    public final HashSet delta;
    public final j echo;
    public final InterfaceC0523v foxtrot;
    public final HashMap golf;

    public a(InterfaceC0525x interfaceC0525x, HashSet hashSet) {
        Rational rational;
        Size delta = bc.f.delta(interfaceC0525x.golf().gold());
        InterfaceC0523v oscar = interfaceC0525x.oscar();
        j jVar = new j(oscar, delta);
        this.golf = new HashMap();
        this.alpha = delta;
        if (delta.getWidth() / delta.getHeight() > hotel) {
            rational = bc.b.charlie;
        } else {
            rational = bc.b.alpha;
        }
        AbstractC3066u3.bravo("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + delta + ") is " + rational + ".");
        this.bravo = rational;
        Rational rational2 = bc.b.alpha;
        if (rational.equals(rational2)) {
            rational2 = bc.b.charlie;
        } else if (!rational.equals(bc.b.charlie)) {
            throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
        }
        this.charlie = rational2;
        this.foxtrot = oscar;
        this.delta = hashSet;
        this.echo = jVar;
    }

    public static Rect alpha(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational golf = golf(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational golf2 = golf(size);
        if (golf.floatValue() == golf2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (golf.floatValue() > golf2.floatValue()) {
                float f5 = width;
                float floatValue = f5 / golf.floatValue();
                float f10 = (height - floatValue) / 2.0f;
                rectF = new RectF(0.0f, f10, f5, floatValue + f10);
            } else {
                float f11 = height;
                float floatValue2 = golf.floatValue() * f11;
                float f12 = (width - floatValue2) / 2.0f;
                rectF = new RectF(f12, 0.0f, floatValue2 + f12, f11);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean charlie(Size size, Size size2) {
        if (size.getHeight() <= size2.getHeight() && size.getWidth() <= size2.getWidth()) {
            return false;
        }
        return true;
    }

    public static Rational golf(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final List bravo(Z z2) {
        Rational rational;
        if (this.delta.contains(z2)) {
            HashMap hashMap = this.golf;
            if (hashMap.containsKey(z2)) {
                List list = (List) hashMap.get(z2);
                Objects.requireNonNull(list);
                return list;
            }
            List golf = this.echo.golf(z2);
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) golf).iterator();
            while (it.hasNext()) {
                Size size = (Size) it.next();
                Iterator it2 = hashMap2.keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        rational = (Rational) it2.next();
                        if (bc.b.alpha(rational, size)) {
                            break;
                        }
                    } else {
                        rational = null;
                        break;
                    }
                }
                if (rational != null) {
                    Size size2 = (Size) hashMap2.get(rational);
                    Objects.requireNonNull(size2);
                    if (size.getHeight() <= size2.getHeight()) {
                        if (size.getWidth() <= size2.getWidth()) {
                            if (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight()) {
                            }
                        }
                    }
                } else {
                    rational = golf(size);
                }
                arrayList.add(size);
                hashMap2.put(rational, size);
            }
            hashMap.put(z2, arrayList);
            return arrayList;
        }
        throw new IllegalArgumentException("Invalid child config: " + z2);
    }

    public final boolean delta(Rational rational, Size size) {
        Rational rational2 = this.bravo;
        if (!rational2.equals(rational) && !bc.b.alpha(rational, size)) {
            float floatValue = rational2.floatValue();
            float floatValue2 = rational.floatValue();
            Rational rational3 = bc.b.alpha;
            if (!bc.b.alpha(rational3, size)) {
                rational3 = bc.b.charlie;
                if (!bc.b.alpha(rational3, size)) {
                    rational3 = golf(size);
                }
            }
            float floatValue3 = rational3.floatValue();
            if (floatValue != floatValue2 && floatValue2 != floatValue3) {
                if (floatValue > floatValue2) {
                    if (floatValue2 < floatValue3) {
                        return true;
                    }
                    return false;
                }
                if (floatValue2 > floatValue3) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final ArrayList echo(List list, boolean z2) {
        List list2;
        HashMap hashMap = new HashMap();
        Rational rational = bc.b.alpha;
        hashMap.put(rational, new ArrayList());
        Rational rational2 = bc.b.charlie;
        hashMap.put(rational2, new ArrayList());
        ArrayList arrayList = new ArrayList();
        arrayList.add(rational);
        arrayList.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Rational rational3 = (Rational) it2.next();
                        if (bc.b.alpha(rational3, size)) {
                            list2 = (List) hashMap.get(rational3);
                            break;
                        }
                    } else {
                        list2 = null;
                        break;
                    }
                }
                if (list2 == null) {
                    list2 = new ArrayList();
                    Rational golf = golf(size);
                    arrayList.add(golf);
                    hashMap.put(golf, list2);
                }
                list2.add(size);
            }
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2, new af(2, golf(this.alpha)));
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Rational rational4 = (Rational) it3.next();
            if (!rational4.equals(bc.b.charlie) && !rational4.equals(bc.b.alpha)) {
                List list3 = (List) hashMap.get(rational4);
                Objects.requireNonNull(list3);
                arrayList3.addAll(foxtrot(rational4, list3, z2));
            }
        }
        return arrayList3;
    }

    public final ArrayList foxtrot(Rational rational, List list, boolean z2) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2;
        ArrayList<Size> arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (bc.b.alpha(rational, size)) {
                arrayList3.add(size);
            }
        }
        Collections.sort(arrayList3, new bc.c(true));
        HashSet hashSet = new HashSet(arrayList3);
        Iterator it2 = this.delta.iterator();
        while (it2.hasNext()) {
            List<Size> bravo = bravo((Z) it2.next());
            if (!z2) {
                ArrayList arrayList4 = new ArrayList();
                for (Size size2 : bravo) {
                    if (!delta(rational, size2)) {
                        arrayList4.add(size2);
                    }
                }
                bravo = arrayList4;
            }
            if (bravo.isEmpty()) {
                return new ArrayList();
            }
            if (!bravo.isEmpty() && !arrayList3.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                for (Size size3 : arrayList3) {
                    Iterator it3 = bravo.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (!charlie((Size) it3.next(), size3)) {
                            arrayList5.add(size3);
                            break;
                        }
                    }
                }
                arrayList3 = arrayList5;
            } else {
                arrayList3 = new ArrayList();
            }
            if (!bravo.isEmpty() && !arrayList3.isEmpty()) {
                if (arrayList3.isEmpty()) {
                    arrayList2 = arrayList3;
                } else {
                    arrayList2 = new ArrayList(new LinkedHashSet(arrayList3));
                }
                arrayList = new ArrayList();
                for (Size size4 : arrayList2) {
                    Iterator it4 = bravo.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (charlie((Size) it4.next(), size4)) {
                                break;
                            }
                        } else {
                            arrayList.add(size4);
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            } else {
                arrayList = new ArrayList();
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList3) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }
}
