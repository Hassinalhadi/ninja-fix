package b7;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import com.zendesk.service.HttpConstants;
import java.util.ArrayList;
import java.util.Iterator;
import t6.N2;
import x2.C3283d;
import x2.al;

/* renamed from: b7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0726h extends Property {
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0726h(Class cls, String str, int i4) {
        super(cls, str);
        this.alpha = i4;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.alpha) {
            case 0:
                return Float.valueOf(((C0727i) obj).f3333b);
            case 1:
                return Float.valueOf(((C0727i) obj).f3334c);
            case 2:
                return Float.valueOf(((C0729k) obj).f3341b);
            case 3:
                return Float.valueOf(((C0729k) obj).f3342c);
            case 4:
                return Float.valueOf(((q) obj).bravo());
            case 5:
                return Float.valueOf(((w) obj).f3366b);
            case 6:
                return Float.valueOf(((y) obj).f3371c);
            case 7:
                return null;
            case 8:
                return null;
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                return null;
            case 12:
                return Float.valueOf(al.alpha.alpha((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                C0727i c0727i = (C0727i) obj;
                float floatValue = ((Float) obj2).floatValue();
                c0727i.f3333b = floatValue;
                int i4 = (int) (floatValue * 5400.0f);
                ArrayList arrayList = (ArrayList) c0727i.red;
                r rVar = (r) arrayList.get(0);
                float f5 = c0727i.f3333b * 1520.0f;
                rVar.alpha = (-20.0f) + f5;
                rVar.bravo = f5;
                int i5 = 0;
                while (true) {
                    P1.a aVar = c0727i.white;
                    if (i5 < 4) {
                        rVar.bravo = (aVar.getInterpolation(K3.b.hotel(i4, C0727i.e[i5], 667)) * 250.0f) + rVar.bravo;
                        rVar.alpha = (aVar.getInterpolation(K3.b.hotel(i4, C0727i.f3328f[i5], 667)) * 250.0f) + rVar.alpha;
                        i5++;
                    } else {
                        float f10 = rVar.alpha;
                        float f11 = rVar.bravo;
                        rVar.alpha = (((f11 - f10) * c0727i.f3334c) + f10) / 360.0f;
                        rVar.bravo = f11 / 360.0f;
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                float hotel = K3.b.hotel(i4, C0727i.f3329g[i10], 333);
                                if (hotel > 0.0f && hotel < 1.0f) {
                                    int i11 = i10 + c0727i.f3332a;
                                    int[] iArr = c0727i.yellow.echo;
                                    int length = i11 % iArr.length;
                                    int length2 = (length + 1) % iArr.length;
                                    int i12 = iArr[length];
                                    int i13 = iArr[length2];
                                    ((r) arrayList.get(0)).charlie = M6.b.alpha(Integer.valueOf(i12), Integer.valueOf(i13), aVar.getInterpolation(hotel)).intValue();
                                } else {
                                    i10++;
                                }
                            }
                        }
                        ((u) c0727i.purple).invalidateSelf();
                        return;
                    }
                }
                break;
            case 1:
                ((C0727i) obj).f3334c = ((Float) obj2).floatValue();
                return;
            case 2:
                C0729k c0729k = (C0729k) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                c0729k.f3341b = floatValue2;
                int i14 = (int) (floatValue2 * 6000.0f);
                ArrayList arrayList2 = (ArrayList) c0729k.red;
                r rVar2 = (r) arrayList2.get(0);
                float f12 = c0729k.f3341b * 1080.0f;
                int[] iArr2 = C0729k.f3336f;
                int length3 = iArr2.length;
                int i15 = 0;
                float f13 = 0.0f;
                while (true) {
                    TimeInterpolator timeInterpolator = c0729k.white;
                    if (i15 < length3) {
                        f13 += timeInterpolator.getInterpolation(K3.b.hotel(i14, iArr2[i15], HttpConstants.HTTP_INTERNAL_ERROR)) * 90.0f;
                        i15++;
                    } else {
                        rVar2.golf = f12 + f13;
                        float interpolation = timeInterpolator.getInterpolation(K3.b.hotel(i14, 0, 3000)) - timeInterpolator.getInterpolation(K3.b.hotel(i14, 3000, 3000));
                        rVar2.alpha = 0.0f;
                        float[] fArr = C0729k.f3337g;
                        float bravo = N2.bravo(fArr[0], fArr[1], interpolation);
                        rVar2.bravo = bravo;
                        float f14 = c0729k.f3342c;
                        if (f14 > 0.0f) {
                            rVar2.bravo = (1.0f - f14) * bravo;
                        }
                        int i16 = 0;
                        while (true) {
                            if (i16 < iArr2.length) {
                                float hotel2 = K3.b.hotel(i14, iArr2[i16], 100);
                                if (hotel2 >= 0.0f && hotel2 <= 1.0f) {
                                    int i17 = i16 + c0729k.f3340a;
                                    int[] iArr3 = c0729k.yellow.echo;
                                    int length4 = i17 % iArr3.length;
                                    int length5 = (length4 + 1) % iArr3.length;
                                    int i18 = iArr3[length4];
                                    int i19 = iArr3[length5];
                                    ((r) arrayList2.get(0)).charlie = M6.b.alpha(Integer.valueOf(i18), Integer.valueOf(i19), timeInterpolator.getInterpolation(hotel2)).intValue();
                                } else {
                                    i16++;
                                }
                            }
                        }
                        ((u) c0729k.purple).invalidateSelf();
                        return;
                    }
                }
                break;
            case 3:
                ((C0729k) obj).f3342c = ((Float) obj2).floatValue();
                return;
            case 4:
                q qVar = (q) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                if (qVar.f3358b != floatValue3) {
                    qVar.f3358b = floatValue3;
                    qVar.invalidateSelf();
                    return;
                }
                return;
            case 5:
                w wVar = (w) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                wVar.f3366b = floatValue4;
                ArrayList arrayList3 = (ArrayList) wVar.red;
                ((r) arrayList3.get(0)).alpha = 0.0f;
                float hotel3 = K3.b.hotel((int) (floatValue4 * 333.0f), 0, 667);
                r rVar3 = (r) arrayList3.get(0);
                r rVar4 = (r) arrayList3.get(1);
                P1.a aVar2 = wVar.teal;
                float interpolation2 = aVar2.getInterpolation(hotel3);
                rVar4.alpha = interpolation2;
                rVar3.bravo = interpolation2;
                r rVar5 = (r) arrayList3.get(1);
                r rVar6 = (r) arrayList3.get(2);
                float interpolation3 = aVar2.getInterpolation(hotel3 + 0.49925038f);
                rVar6.alpha = interpolation3;
                rVar5.bravo = interpolation3;
                ((r) arrayList3.get(2)).bravo = 1.0f;
                if (wVar.f3365a && ((r) arrayList3.get(1)).bravo < 1.0f) {
                    ((r) arrayList3.get(2)).charlie = ((r) arrayList3.get(1)).charlie;
                    ((r) arrayList3.get(1)).charlie = ((r) arrayList3.get(0)).charlie;
                    ((r) arrayList3.get(0)).charlie = wVar.white.echo[wVar.yellow];
                    wVar.f3365a = false;
                }
                ((u) wVar.purple).invalidateSelf();
                return;
            case 6:
                y yVar = (y) obj;
                float floatValue5 = ((Float) obj2).floatValue();
                yVar.f3371c = floatValue5;
                int i20 = (int) (floatValue5 * 1800.0f);
                int i21 = 0;
                while (true) {
                    ArrayList arrayList4 = (ArrayList) yVar.red;
                    if (i21 < arrayList4.size()) {
                        r rVar7 = (r) arrayList4.get(i21);
                        int[] iArr4 = y.f3367f;
                        int i22 = i21 * 2;
                        int i23 = iArr4[i22];
                        int[] iArr5 = y.e;
                        float hotel4 = K3.b.hotel(i20, i23, iArr5[i22]);
                        Interpolator[] interpolatorArr = yVar.white;
                        rVar7.alpha = O6.c.alpha(interpolatorArr[i22].getInterpolation(hotel4), 0.0f, 1.0f);
                        int i24 = i22 + 1;
                        rVar7.bravo = O6.c.alpha(interpolatorArr[i24].getInterpolation(K3.b.hotel(i20, iArr4[i24], iArr5[i24])), 0.0f, 1.0f);
                        i21++;
                    } else {
                        if (yVar.f3370b) {
                            Iterator it = arrayList4.iterator();
                            while (it.hasNext()) {
                                ((r) it.next()).charlie = yVar.yellow.echo[yVar.f3369a];
                            }
                            yVar.f3370b = false;
                        }
                        ((u) yVar.purple).invalidateSelf();
                        return;
                    }
                }
            case 7:
                C3283d c3283d = (C3283d) obj;
                PointF pointF = (PointF) obj2;
                c3283d.getClass();
                c3283d.alpha = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c3283d.bravo = round;
                int i25 = c3283d.foxtrot + 1;
                c3283d.foxtrot = i25;
                if (i25 == c3283d.golf) {
                    al.alpha(c3283d.echo, c3283d.alpha, round, c3283d.charlie, c3283d.delta);
                    c3283d.foxtrot = 0;
                    c3283d.golf = 0;
                    return;
                }
                return;
            case 8:
                C3283d c3283d2 = (C3283d) obj;
                PointF pointF2 = (PointF) obj2;
                c3283d2.getClass();
                c3283d2.charlie = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c3283d2.delta = round2;
                int i26 = c3283d2.golf + 1;
                c3283d2.golf = i26;
                if (c3283d2.foxtrot == i26) {
                    al.alpha(c3283d2.echo, c3283d2.alpha, c3283d2.bravo, c3283d2.charlie, round2);
                    c3283d2.foxtrot = 0;
                    c3283d2.golf = 0;
                    return;
                }
                return;
            case 9:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                al.alpha(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case 10:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                al.alpha(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case 11:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                al.alpha(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case 12:
                al.alpha.bravo((View) obj, ((Float) obj2).floatValue());
                return;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
        }
    }
}
