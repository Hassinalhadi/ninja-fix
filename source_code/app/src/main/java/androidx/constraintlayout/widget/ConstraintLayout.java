package androidx.constraintlayout.widget;

import J2.l;
import W0.c;
import Z0.a;
import Z0.d;
import Z0.e;
import Z0.g;
import Z0.h;
import Z0.j;
import a1.i;
import a1.k;
import a1.m;
import a1.o;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import c1.AbstractC0804c;
import c1.AbstractC0817p;
import c1.AbstractC0820s;
import c1.C0806e;
import c1.C0807f;
import c1.C0808g;
import c1.C0815n;
import c1.C0818q;
import c1.C0821t;
import com.airbnb.lottie.compose.LottieConstants;
import com.clevertap.android.sdk.Constants;
import id.C1915c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.internal.http2.Http2Connection;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: i, reason: collision with root package name */
    public static C0821t f3029i;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3030a;
    public final SparseArray alpha;

    /* renamed from: b, reason: collision with root package name */
    public int f3031b;

    /* renamed from: c, reason: collision with root package name */
    public C0815n f3032c;

    /* renamed from: d, reason: collision with root package name */
    public l f3033d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3034f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f3035g;

    /* renamed from: h, reason: collision with root package name */
    public final C0807f f3036h;
    public final ArrayList purple;
    public final e red;
    public int silver;
    public int teal;
    public int white;
    public int yellow;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.alpha = new SparseArray();
        this.purple = new ArrayList(4);
        this.red = new e();
        this.silver = 0;
        this.teal = 0;
        this.white = LottieConstants.IterateForever;
        this.yellow = LottieConstants.IterateForever;
        this.f3030a = true;
        this.f3031b = 257;
        this.f3032c = null;
        this.f3033d = null;
        this.e = -1;
        this.f3034f = new HashMap();
        this.f3035g = new SparseArray();
        this.f3036h = new C0807f(this, this);
        bravo(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [c1.t, java.lang.Object] */
    public static C0821t getSharedValues() {
        if (f3029i == null) {
            ?? obj = new Object();
            new SparseIntArray();
            new HashMap();
            f3029i = obj;
        }
        return f3029i;
    }

    public final d alpha(View view) {
        if (view == this) {
            return this.red;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof C0806e) {
                return ((C0806e) view.getLayoutParams()).f3466h;
            }
            view.setLayoutParams(new C0806e(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof C0806e) {
                return ((C0806e) view.getLayoutParams()).f3466h;
            }
            return null;
        }
        return null;
    }

    public final void bravo(AttributeSet attributeSet, int i4) {
        e eVar = this.red;
        eVar.teal = this;
        C0807f c0807f = this.f3036h;
        eVar.f2460m = c0807f;
        eVar.f2458k.foxtrot = c0807f;
        this.alpha.put(getId(), this);
        this.f3032c = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0820s.bravo, i4, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == 16) {
                    this.silver = obtainStyledAttributes.getDimensionPixelOffset(index, this.silver);
                } else if (index == 17) {
                    this.teal = obtainStyledAttributes.getDimensionPixelOffset(index, this.teal);
                } else if (index == 14) {
                    this.white = obtainStyledAttributes.getDimensionPixelOffset(index, this.white);
                } else if (index == 15) {
                    this.yellow = obtainStyledAttributes.getDimensionPixelOffset(index, this.yellow);
                } else if (index == 113) {
                    this.f3031b = obtainStyledAttributes.getInt(index, this.f3031b);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            charlie(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f3033d = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0815n c0815n = new C0815n();
                        this.f3032c = c0815n;
                        c0815n.echo(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.f3032c = null;
                    }
                    this.e = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        eVar.f2469v = this.f3031b;
        c.quebec = eVar.ochre(512);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x003a. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v0, types: [J2.l, java.lang.Object] */
    public final void charlie(int i4) {
        int eventType;
        S5.l lVar;
        Context context = getContext();
        ?? obj = new Object();
        obj.alpha = new SparseArray();
        obj.purple = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            eventType = xml.getEventType();
            lVar = null;
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i4, e);
        } catch (XmlPullParserException e4) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i4, e4);
        }
        while (true) {
            char c3 = 1;
            if (eventType != 1) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals(Constants.CLTAP_PROP_VARIANT)) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    if (c3 != 2) {
                        if (c3 != 3) {
                            if (c3 == 4) {
                                obj.november(context, xml);
                            }
                        } else {
                            C0808g c0808g = new C0808g(context, xml);
                            if (lVar != null) {
                                ((ArrayList) lVar.silver).add(c0808g);
                            }
                        }
                    } else {
                        S5.l lVar2 = new S5.l(context, xml);
                        ((SparseArray) obj.alpha).put(lVar2.purple, lVar2);
                        lVar = lVar2;
                    }
                }
                eventType = xml.next();
            } else {
                this.f3033d = obj;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0806e;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0338  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void delta(e eVar, int i4, int i5, int i10) {
        int i11;
        int max;
        int i12;
        int max2;
        int i13;
        boolean z2;
        boolean z10;
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        int i16;
        boolean z13;
        boolean z14;
        boolean z15;
        ArrayList arrayList;
        int i17;
        boolean z16;
        boolean z17;
        boolean z18;
        k kVar;
        m mVar;
        int i18;
        int i19;
        boolean z19;
        boolean z20;
        int i20;
        ArrayList arrayList2;
        int i21;
        int i22;
        int i23;
        boolean z21;
        Iterator it;
        Iterator it2;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i24 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        C0807f c0807f = this.f3036h;
        c0807f.bravo = max3;
        c0807f.charlie = max4;
        c0807f.delta = paddingWidth;
        c0807f.echo = i24;
        c0807f.foxtrot = i5;
        c0807f.golf = i10;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        int i25 = 1;
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i26 = size - paddingWidth;
        int i27 = size2 - i24;
        int i28 = c0807f.echo;
        int i29 = c0807f.delta;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i11 = 0;
                } else {
                    i11 = Math.min(this.white - i29, i26);
                    i25 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.silver);
                i11 = max;
                i25 = 2;
            } else {
                i11 = 0;
                i25 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.silver);
            i11 = max;
            i25 = 2;
        } else {
            i11 = i26;
            i25 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    i12 = 0;
                } else {
                    i12 = Math.min(this.yellow - i28, i27);
                }
                i13 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.teal);
                i12 = max2;
                i13 = 2;
            } else {
                i12 = 0;
                i13 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.teal);
            i12 = max2;
            i13 = 2;
        } else {
            i12 = i27;
            i13 = 2;
        }
        int quebec = eVar.quebec();
        a1.e eVar2 = eVar.f2458k;
        int i30 = i11;
        if (i30 != quebec || i12 != eVar.kilo()) {
            eVar2.charlie = true;
        }
        eVar.orange = 0;
        eVar.peach = 0;
        int i31 = this.white - i29;
        int[] iArr = eVar.beige;
        iArr[0] = i31;
        iArr[1] = this.yellow - i28;
        eVar.plum = 0;
        eVar.purple = 0;
        eVar.gray(i25);
        eVar.indigo(i30);
        eVar.green(i13);
        eVar.gold(i12);
        int i32 = this.silver - i29;
        if (i32 < 0) {
            eVar.plum = 0;
        } else {
            eVar.plum = i32;
        }
        int i33 = this.teal - i28;
        if (i33 < 0) {
            eVar.purple = 0;
        } else {
            eVar.purple = i33;
        }
        eVar.f2463p = max5;
        eVar.f2464q = max3;
        C1915c c1915c = eVar.f2457j;
        c1915c.getClass();
        C0807f c0807f2 = eVar.f2460m;
        int size3 = eVar.f2456i.size();
        int quebec2 = eVar.quebec();
        int kilo = eVar.kilo();
        boolean charlie = j.charlie(i4, 128);
        if (!charlie && !j.charlie(i4, 64)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            int i34 = 0;
            while (i34 < size3) {
                d dVar = (d) eVar.f2456i.get(i34);
                boolean z26 = z2;
                int[] iArr2 = dVar.f2454h;
                i14 = size3;
                if (iArr2[0] == 3) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                if (iArr2[1] == 3) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if (z23 && z24 && dVar.ochre > 0.0f) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if ((dVar.xray() && z25) || ((dVar.yankee() && z25) || (dVar instanceof g) || dVar.xray() || dVar.yankee())) {
                    i15 = 1073741824;
                    z10 = false;
                    break;
                } else {
                    i34++;
                    z2 = z26;
                    size3 = i14;
                }
            }
        }
        z10 = z2;
        i14 = size3;
        i15 = 1073741824;
        if ((mode == i15 && mode2 == i15) || charlie) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z27 = z10 & z11;
        if (z27) {
            int min = Math.min(iArr[0], i26);
            int min2 = Math.min(iArr[1], i27);
            if (mode == 1073741824 && eVar.quebec() != min) {
                eVar.indigo(min);
                eVar.f2458k.bravo = true;
            }
            if (mode2 == 1073741824 && eVar.kilo() != min2) {
                eVar.gold(min2);
                eVar.f2458k.bravo = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z28 = eVar2.bravo;
                e eVar3 = eVar2.alpha;
                if (!z28 && !eVar2.charlie) {
                    i20 = 0;
                } else {
                    Iterator it3 = eVar3.f2456i.iterator();
                    while (it3.hasNext()) {
                        d dVar2 = (d) it3.next();
                        dVar2.hotel();
                        dVar2.alpha = false;
                        dVar2.delta.november();
                        dVar2.echo.mike();
                    }
                    i20 = 0;
                    eVar3.hotel();
                    eVar3.alpha = false;
                    eVar3.delta.november();
                    eVar3.echo.mike();
                    eVar2.charlie = false;
                }
                eVar2.bravo(eVar2.delta);
                eVar3.orange = i20;
                eVar3.peach = i20;
                int juliet = eVar3.juliet(i20);
                int juliet2 = eVar3.juliet(1);
                if (eVar2.bravo) {
                    eVar2.charlie();
                }
                int romeo = eVar3.romeo();
                int sierra = eVar3.sierra();
                eVar3.delta.hotel.delta(romeo);
                eVar3.echo.hotel.delta(sierra);
                eVar2.golf();
                ArrayList arrayList3 = eVar2.echo;
                z12 = z27;
                if (juliet != 2 && juliet2 != 2) {
                    arrayList2 = arrayList3;
                } else {
                    if (charlie) {
                        Iterator it4 = arrayList3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((o) it4.next()).kilo()) {
                                    charlie = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (charlie && juliet == 2) {
                        eVar3.gray(1);
                        arrayList2 = arrayList3;
                        eVar3.indigo(eVar2.delta(eVar3, 0));
                        eVar3.delta.echo.delta(eVar3.quebec());
                    } else {
                        arrayList2 = arrayList3;
                    }
                    if (charlie && juliet2 == 2) {
                        i21 = 1;
                        eVar3.green(1);
                        eVar3.gold(eVar2.delta(eVar3, 1));
                        eVar3.echo.echo.delta(eVar3.kilo());
                        int[] iArr3 = eVar3.f2454h;
                        i22 = iArr3[0];
                        if (i22 == i21 && i22 != 4) {
                            z21 = false;
                        } else {
                            int quebec3 = eVar3.quebec() + romeo;
                            eVar3.delta.india.delta(quebec3);
                            eVar3.delta.echo.delta(quebec3 - romeo);
                            eVar2.golf();
                            i23 = iArr3[1];
                            if (i23 != 1 || i23 == 4) {
                                int kilo2 = eVar3.kilo() + sierra;
                                eVar3.echo.india.delta(kilo2);
                                eVar3.echo.echo.delta(kilo2 - sierra);
                            }
                            eVar2.golf();
                            z21 = true;
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            o oVar = (o) it.next();
                            if (oVar.bravo != eVar3 || oVar.golf) {
                                oVar.echo();
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            o oVar2 = (o) it2.next();
                            if (z21 || oVar2.bravo != eVar3) {
                                if (!oVar2.hotel.juliet || ((!oVar2.india.juliet && !(oVar2 instanceof i)) || (!oVar2.echo.juliet && !(oVar2 instanceof a1.c) && !(oVar2 instanceof i)))) {
                                    z22 = false;
                                    break;
                                }
                            }
                        }
                        z22 = true;
                        eVar3.gray(juliet);
                        eVar3.green(juliet2);
                        z13 = z22;
                        i19 = 1073741824;
                        i16 = 2;
                    }
                }
                i21 = 1;
                int[] iArr32 = eVar3.f2454h;
                i22 = iArr32[0];
                if (i22 == i21) {
                }
                int quebec32 = eVar3.quebec() + romeo;
                eVar3.delta.india.delta(quebec32);
                eVar3.delta.echo.delta(quebec32 - romeo);
                eVar2.golf();
                i23 = iArr32[1];
                if (i23 != 1) {
                }
                int kilo22 = eVar3.kilo() + sierra;
                eVar3.echo.india.delta(kilo22);
                eVar3.echo.echo.delta(kilo22 - sierra);
                eVar2.golf();
                z21 = true;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z22 = true;
                eVar3.gray(juliet);
                eVar3.green(juliet2);
                z13 = z22;
                i19 = 1073741824;
                i16 = 2;
            } else {
                z12 = z27;
                boolean z29 = eVar2.bravo;
                e eVar4 = eVar2.alpha;
                if (z29) {
                    Iterator it5 = eVar4.f2456i.iterator();
                    while (it5.hasNext()) {
                        d dVar3 = (d) it5.next();
                        dVar3.hotel();
                        dVar3.alpha = false;
                        k kVar2 = dVar3.delta;
                        kVar2.echo.juliet = false;
                        kVar2.golf = false;
                        kVar2.november();
                        m mVar2 = dVar3.echo;
                        mVar2.echo.juliet = false;
                        mVar2.golf = false;
                        mVar2.mike();
                    }
                    i18 = 0;
                    eVar4.hotel();
                    eVar4.alpha = false;
                    k kVar3 = eVar4.delta;
                    kVar3.echo.juliet = false;
                    kVar3.golf = false;
                    kVar3.november();
                    m mVar3 = eVar4.echo;
                    mVar3.echo.juliet = false;
                    mVar3.golf = false;
                    mVar3.mike();
                    eVar2.charlie();
                } else {
                    i18 = 0;
                }
                eVar2.bravo(eVar2.delta);
                eVar4.orange = i18;
                eVar4.peach = i18;
                eVar4.delta.hotel.delta(i18);
                eVar4.echo.hotel.delta(i18);
                i19 = 1073741824;
                if (mode == 1073741824) {
                    z13 = eVar.magenta(i18, charlie);
                    i16 = 1;
                } else {
                    i16 = 0;
                    z13 = true;
                }
                if (mode2 == 1073741824) {
                    z13 &= eVar.magenta(1, charlie);
                    i16++;
                }
            }
            if (z13) {
                if (mode == i19) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (mode2 == i19) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                eVar.ivory(z19, z20);
            }
        } else {
            z12 = z27;
            i16 = 0;
            z13 = false;
        }
        if (z13 && i16 == 2) {
            return;
        }
        int i35 = eVar.f2469v;
        if (i14 > 0) {
            int size4 = eVar.f2456i.size();
            boolean ochre = eVar.ochre(64);
            C0807f c0807f3 = eVar.f2460m;
            for (int i36 = 0; i36 < size4; i36++) {
                d dVar4 = (d) eVar.f2456i.get(i36);
                if (!(dVar4 instanceof h) && !(dVar4 instanceof a) && !dVar4.bronze && (!ochre || (kVar = dVar4.delta) == null || (mVar = dVar4.echo) == null || !kVar.echo.juliet || !mVar.echo.juliet)) {
                    int juliet3 = dVar4.juliet(0);
                    int juliet4 = dVar4.juliet(1);
                    if (juliet3 == 3 && dVar4.romeo != 1 && juliet4 == 3 && dVar4.sierra != 1) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (!z18 && eVar.ochre(1) && !(dVar4 instanceof g)) {
                        if (juliet3 == 3 && dVar4.romeo == 0 && juliet4 != 3 && !dVar4.xray()) {
                            z18 = true;
                        }
                        if (juliet4 == 3 && dVar4.sierra == 0 && juliet3 != 3 && !dVar4.xray()) {
                            z18 = true;
                        }
                        if ((juliet3 == 3 || juliet4 == 3) && dVar4.ochre > 0.0f) {
                            z18 = true;
                        }
                    }
                    if (!z18) {
                        c1915c.uniform(0, dVar4, c0807f3);
                    }
                }
            }
            ConstraintLayout constraintLayout = c0807f3.alpha;
            int childCount2 = constraintLayout.getChildCount();
            for (int i37 = 0; i37 < childCount2; i37++) {
                constraintLayout.getChildAt(i37);
            }
            ArrayList arrayList4 = constraintLayout.purple;
            int size5 = arrayList4.size();
            if (size5 > 0) {
                for (int i38 = 0; i38 < size5; i38++) {
                    ((AbstractC0804c) arrayList4.get(i38)).getClass();
                }
            }
        }
        c1915c.azure(eVar);
        ArrayList arrayList5 = (ArrayList) c1915c.purple;
        int size6 = arrayList5.size();
        if (i14 > 0) {
            c1915c.amber(eVar, 0, quebec2, kilo);
        }
        if (size6 > 0) {
            int[] iArr4 = eVar.f2454h;
            if (iArr4[0] == 2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (iArr4[1] == 2) {
                z15 = true;
            } else {
                z15 = false;
            }
            int quebec4 = eVar.quebec();
            e eVar5 = (e) c1915c.silver;
            int max7 = Math.max(quebec4, eVar5.plum);
            int max8 = Math.max(eVar.kilo(), eVar5.purple);
            int i39 = 0;
            boolean z30 = false;
            while (i39 < size6) {
                d dVar5 = (d) arrayList5.get(i39);
                if (!(dVar5 instanceof g)) {
                    z16 = z15;
                    z17 = z14;
                } else {
                    int quebec5 = dVar5.quebec();
                    z16 = z15;
                    int kilo3 = dVar5.kilo();
                    z17 = z14;
                    boolean uniform = z30 | c1915c.uniform(1, dVar5, c0807f2);
                    int quebec6 = dVar5.quebec();
                    boolean z31 = uniform;
                    int kilo4 = dVar5.kilo();
                    if (quebec6 != quebec5) {
                        dVar5.indigo(quebec6);
                        if (z17 && dVar5.romeo() + dVar5.maroon > max7) {
                            max7 = Math.max(max7, dVar5.india(4).echo() + dVar5.romeo() + dVar5.maroon);
                        }
                        z31 = true;
                    }
                    if (kilo4 != kilo3) {
                        dVar5.gold(kilo4);
                        if (z16 && dVar5.sierra() + dVar5.navy > max8) {
                            max8 = Math.max(max8, dVar5.india(5).echo() + dVar5.sierra() + dVar5.navy);
                        }
                        z31 = true;
                    }
                    z30 = z31 | ((g) dVar5).f2496q;
                }
                i39++;
                z15 = z16;
                z14 = z17;
            }
            boolean z32 = z15;
            boolean z33 = z14;
            int i40 = 0;
            while (i40 < 2) {
                int i41 = 0;
                while (i41 < size6) {
                    d dVar6 = (d) arrayList5.get(i41);
                    if (((dVar6 instanceof Z0.i) && !(dVar6 instanceof g)) || (dVar6 instanceof h) || dVar6.white == 8 || ((z12 && dVar6.delta.echo.juliet && dVar6.echo.echo.juliet) || (dVar6 instanceof g))) {
                        arrayList = arrayList5;
                        i17 = size6;
                    } else {
                        int quebec7 = dVar6.quebec();
                        int kilo5 = dVar6.kilo();
                        arrayList = arrayList5;
                        int i42 = dVar6.pink;
                        i17 = size6;
                        int i43 = 1;
                        if (i40 == 1) {
                            i43 = 2;
                        }
                        boolean uniform2 = c1915c.uniform(i43, dVar6, c0807f2) | z30;
                        int quebec8 = dVar6.quebec();
                        boolean z34 = uniform2;
                        int kilo6 = dVar6.kilo();
                        if (quebec8 != quebec7) {
                            dVar6.indigo(quebec8);
                            if (z33 && dVar6.romeo() + dVar6.maroon > max7) {
                                max7 = Math.max(max7, dVar6.india(4).echo() + dVar6.romeo() + dVar6.maroon);
                            }
                            z34 = true;
                        }
                        if (kilo6 != kilo5) {
                            dVar6.gold(kilo6);
                            if (z32 && dVar6.sierra() + dVar6.navy > max8) {
                                max8 = Math.max(max8, dVar6.india(5).echo() + dVar6.sierra() + dVar6.navy);
                            }
                            z34 = true;
                        }
                        if (dVar6.blue && i42 != dVar6.pink) {
                            z30 = true;
                        } else {
                            z30 = z34;
                        }
                    }
                    i41++;
                    arrayList5 = arrayList;
                    size6 = i17;
                }
                ArrayList arrayList6 = arrayList5;
                int i44 = size6;
                if (!z30) {
                    break;
                }
                i40++;
                c1915c.amber(eVar, i40, quebec2, kilo);
                arrayList5 = arrayList6;
                size6 = i44;
                z30 = false;
            }
        }
        eVar.f2469v = i35;
        c.quebec = eVar.ochre(512);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.purple;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ((AbstractC0804c) arrayList.get(i4)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(Constants.SEPARATOR_COMMA);
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i10 = (int) ((parseInt / 1080.0f) * width);
                        int i11 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f5 = i10;
                        float f10 = i11;
                        float f11 = i10 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f5, f10, f11, f10, paint);
                        float parseInt4 = i11 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f11, f10, f11, parseInt4, paint);
                        canvas.drawLine(f11, parseInt4, f5, parseInt4, paint);
                        canvas.drawLine(f5, parseInt4, f5, f10, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f5, f10, f11, parseInt4, paint);
                        canvas.drawLine(f5, parseInt4, f11, f10, paint);
                    }
                }
            }
        }
    }

    public final void echo(d dVar, C0806e c0806e, SparseArray sparseArray, int i4, int i5) {
        View view = (View) this.alpha.get(i4);
        d dVar2 = (d) sparseArray.get(i4);
        if (dVar2 != null && view != null && (view.getLayoutParams() instanceof C0806e)) {
            c0806e.purple = true;
            if (i5 == 6) {
                C0806e c0806e2 = (C0806e) view.getLayoutParams();
                c0806e2.purple = true;
                c0806e2.f3466h.blue = true;
            }
            dVar.india(6).bravo(dVar2.india(i5), c0806e.black, c0806e.beige, true);
            dVar.blue = true;
            dVar.india(3).juliet();
            dVar.india(5).juliet();
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f3030a = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0806e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0806e(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.yellow;
    }

    public int getMaxWidth() {
        return this.white;
    }

    public int getMinHeight() {
        return this.teal;
    }

    public int getMinWidth() {
        return this.silver;
    }

    public int getOptimizationLevel() {
        return this.red.f2469v;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        e eVar = this.red;
        if (eVar.juliet == null) {
            int id3 = getId();
            if (id3 != -1) {
                eVar.juliet = getContext().getResources().getResourceEntryName(id3);
            } else {
                eVar.juliet = "parent";
            }
        }
        if (eVar.yellow == null) {
            eVar.yellow = eVar.juliet;
            Log.v("ConstraintLayout", " setDebugName " + eVar.yellow);
        }
        Iterator it = eVar.f2456i.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            View view = dVar.teal;
            if (view != null) {
                if (dVar.juliet == null && (id2 = view.getId()) != -1) {
                    dVar.juliet = getContext().getResources().getResourceEntryName(id2);
                }
                if (dVar.yellow == null) {
                    dVar.yellow = dVar.juliet;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.yellow);
                }
            }
        }
        eVar.november(sb2);
        return sb2.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            C0806e c0806e = (C0806e) childAt.getLayoutParams();
            d dVar = c0806e.f3466h;
            if (childAt.getVisibility() != 8 || c0806e.red || c0806e.silver || isInEditMode) {
                int romeo = dVar.romeo();
                int sierra = dVar.sierra();
                childAt.layout(romeo, sierra, dVar.quebec() + romeo, dVar.kilo() + sierra);
            }
        }
        ArrayList arrayList = this.purple;
        int size = arrayList.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                ((AbstractC0804c) arrayList.get(i13)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:289:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0357  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i4, int i5) {
        boolean z2;
        boolean z10;
        int i10;
        boolean z11;
        d dVar;
        int i11;
        d dVar2;
        int i12;
        int i13;
        int i14;
        d dVar3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        d dVar4;
        int i20;
        int i21;
        d dVar5;
        C0806e c0806e;
        int i22;
        d dVar6;
        float f5;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        float parseFloat;
        int i28;
        char c3;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i29;
        String resourceName;
        int i30;
        int id2;
        d dVar7;
        String str;
        ConstraintLayout constraintLayout = this;
        boolean z12 = constraintLayout.f3030a;
        constraintLayout.f3030a = z12;
        int i31 = 0;
        int i32 = 1;
        if (!z12) {
            int childCount = constraintLayout.getChildCount();
            int i33 = 0;
            while (true) {
                if (i33 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i33).isLayoutRequested()) {
                    constraintLayout.f3030a = true;
                    break;
                }
                i33++;
            }
        }
        if ((constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection()) {
            z2 = true;
        } else {
            z2 = false;
        }
        e eVar = constraintLayout.red;
        eVar.f2461n = z2;
        if (constraintLayout.f3030a) {
            constraintLayout.f3030a = false;
            int childCount2 = constraintLayout.getChildCount();
            int i34 = 0;
            while (true) {
                if (i34 < childCount2) {
                    if (constraintLayout.getChildAt(i34).isLayoutRequested()) {
                        z10 = true;
                        break;
                    }
                    i34++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                boolean isInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i35 = 0; i35 < childCount3; i35++) {
                    d alpha = constraintLayout.alpha(constraintLayout.getChildAt(i35));
                    if (alpha != null) {
                        alpha.beige();
                    }
                }
                Object obj = null;
                if (isInEditMode) {
                    int i36 = 0;
                    while (i36 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i36);
                        try {
                            resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                i30 = i32;
                            } else {
                                i30 = 0;
                            }
                            if (i30 != 0) {
                                if (constraintLayout.f3034f == null) {
                                    constraintLayout.f3034f = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                if (indexOf != -1) {
                                    str = resourceName.substring(indexOf + 1);
                                } else {
                                    str = resourceName;
                                }
                                i29 = i32;
                                try {
                                    constraintLayout.f3034f.put(str, valueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i29 = i32;
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id2 = childAt.getId();
                        } catch (Resources.NotFoundException unused2) {
                            i29 = i32;
                        }
                        if (id2 != 0) {
                            View view = (View) constraintLayout.alpha.get(id2);
                            if (view == null && (view = constraintLayout.findViewById(id2)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                if (view == null) {
                                    dVar7 = null;
                                } else {
                                    dVar7 = ((C0806e) view.getLayoutParams()).f3466h;
                                }
                                dVar7.yellow = resourceName;
                                i36++;
                                i32 = i29;
                            }
                        }
                        dVar7 = eVar;
                        dVar7.yellow = resourceName;
                        i36++;
                        i32 = i29;
                    }
                }
                int i37 = i32;
                if (constraintLayout.e != -1) {
                    for (int i38 = 0; i38 < childCount3; i38++) {
                        View childAt2 = constraintLayout.getChildAt(i38);
                        if (childAt2.getId() == constraintLayout.e && (childAt2 instanceof Constraints)) {
                            constraintLayout.f3032c = ((Constraints) childAt2).getConstraintSet();
                        }
                    }
                }
                C0815n c0815n = constraintLayout.f3032c;
                if (c0815n != null) {
                    c0815n.alpha(constraintLayout);
                }
                eVar.f2456i.clear();
                ArrayList arrayList3 = constraintLayout.purple;
                int size = arrayList3.size();
                if (size > 0) {
                    int i39 = 0;
                    while (i39 < size) {
                        AbstractC0804c abstractC0804c = (AbstractC0804c) arrayList3.get(i39);
                        if (abstractC0804c.isInEditMode()) {
                            abstractC0804c.setIds(abstractC0804c.teal);
                        }
                        Z0.i iVar = abstractC0804c.silver;
                        if (iVar == null) {
                            arrayList = arrayList3;
                        } else {
                            iVar.f2513j = i31;
                            Arrays.fill(iVar.f2512i, obj);
                            int i40 = i31;
                            while (i40 < abstractC0804c.purple) {
                                int i41 = abstractC0804c.alpha[i40];
                                View view2 = (View) constraintLayout.alpha.get(i41);
                                if (view2 == null) {
                                    Integer valueOf2 = Integer.valueOf(i41);
                                    HashMap hashMap = abstractC0804c.yellow;
                                    String str2 = (String) hashMap.get(valueOf2);
                                    int foxtrot = abstractC0804c.foxtrot(constraintLayout, str2);
                                    if (foxtrot != 0) {
                                        abstractC0804c.alpha[i40] = foxtrot;
                                        hashMap.put(Integer.valueOf(foxtrot), str2);
                                        view2 = (View) constraintLayout.alpha.get(foxtrot);
                                    }
                                }
                                if (view2 != null) {
                                    Z0.i iVar2 = abstractC0804c.silver;
                                    d alpha2 = constraintLayout.alpha(view2);
                                    iVar2.getClass();
                                    if (alpha2 != iVar2 && alpha2 != null) {
                                        int i42 = iVar2.f2513j + 1;
                                        d[] dVarArr = iVar2.f2512i;
                                        arrayList2 = arrayList3;
                                        if (i42 > dVarArr.length) {
                                            iVar2.f2512i = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                        }
                                        d[] dVarArr2 = iVar2.f2512i;
                                        int i43 = iVar2.f2513j;
                                        dVarArr2[i43] = alpha2;
                                        iVar2.f2513j = i43 + 1;
                                        i40++;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                arrayList2 = arrayList3;
                                i40++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            abstractC0804c.silver.lime();
                        }
                        i39++;
                        arrayList3 = arrayList;
                        obj = null;
                        i31 = 0;
                    }
                }
                int i44 = 2;
                for (int i45 = 0; i45 < childCount3; i45++) {
                    constraintLayout.getChildAt(i45);
                }
                SparseArray sparseArray = constraintLayout.f3035g;
                sparseArray.clear();
                sparseArray.put(0, eVar);
                sparseArray.put(constraintLayout.getId(), eVar);
                for (int i46 = 0; i46 < childCount3; i46++) {
                    View childAt3 = constraintLayout.getChildAt(i46);
                    sparseArray.put(childAt3.getId(), constraintLayout.alpha(childAt3));
                }
                int i47 = 0;
                while (i47 < childCount3) {
                    View childAt4 = constraintLayout.getChildAt(i47);
                    d alpha3 = constraintLayout.alpha(childAt4);
                    if (alpha3 != null) {
                        C0806e c0806e2 = (C0806e) childAt4.getLayoutParams();
                        eVar.f2456i.add(alpha3);
                        d dVar8 = alpha3.magenta;
                        if (dVar8 != null) {
                            ((e) dVar8).f2456i.remove(alpha3);
                            alpha3.beige();
                        }
                        alpha3.magenta = eVar;
                        c0806e2.alpha();
                        alpha3.white = childAt4.getVisibility();
                        alpha3.teal = childAt4;
                        if (childAt4 instanceof AbstractC0804c) {
                            ((AbstractC0804c) childAt4).hotel(alpha3, eVar.f2461n);
                        }
                        if (c0806e2.red) {
                            h hVar = (h) alpha3;
                            int i48 = c0806e2.e;
                            int i49 = c0806e2.f3464f;
                            float f10 = c0806e2.f3465g;
                            if (f10 != -1.0f) {
                                if (f10 > -1.0f) {
                                    hVar.f2506i = f10;
                                    c3 = 65535;
                                    hVar.f2507j = -1;
                                    hVar.f2508k = -1;
                                    i10 = i47;
                                    z11 = z10;
                                    i25 = i44;
                                }
                            } else {
                                c3 = 65535;
                                if (i48 != -1) {
                                    if (i48 > -1) {
                                        hVar.f2506i = -1.0f;
                                        hVar.f2507j = i48;
                                        hVar.f2508k = -1;
                                    }
                                } else if (i49 != -1 && i49 > -1) {
                                    hVar.f2506i = -1.0f;
                                    hVar.f2507j = -1;
                                    hVar.f2508k = i49;
                                }
                                i10 = i47;
                                z11 = z10;
                                i25 = i44;
                            }
                        } else {
                            int i50 = c0806e2.teal;
                            int i51 = c0806e2.white;
                            int i52 = c0806e2.yellow;
                            int i53 = c0806e2.f3460a;
                            int i54 = c0806e2.f3461b;
                            int i55 = c0806e2.f3462c;
                            i10 = i47;
                            float f11 = c0806e2.f3463d;
                            int i56 = c0806e2.papa;
                            z11 = z10;
                            if (i56 != -1) {
                                d dVar9 = (d) sparseArray.get(i56);
                                if (dVar9 != null) {
                                    float f12 = c0806e2.romeo;
                                    alpha3.victor(7, 7, c0806e2.quebec, 0, dVar9);
                                    alpha3.black = f12;
                                }
                                constraintLayout = this;
                                dVar6 = alpha3;
                                c0806e = c0806e2;
                                i15 = 4;
                                i14 = 2;
                            } else {
                                if (i50 != -1) {
                                    d dVar10 = (d) sparseArray.get(i50);
                                    if (dVar10 != null) {
                                        dVar = alpha3;
                                        i11 = 2;
                                        dVar.victor(2, 2, ((ViewGroup.MarginLayoutParams) c0806e2).leftMargin, i54, dVar10);
                                    } else {
                                        dVar = alpha3;
                                        i11 = 2;
                                    }
                                } else {
                                    dVar = alpha3;
                                    i11 = 2;
                                    if (i51 != -1 && (dVar2 = (d) sparseArray.get(i51)) != null) {
                                        dVar.victor(2, 4, ((ViewGroup.MarginLayoutParams) c0806e2).leftMargin, i54, dVar2);
                                        i12 = 2;
                                        i13 = 4;
                                        if (i52 == -1) {
                                            d dVar11 = (d) sparseArray.get(i52);
                                            if (dVar11 != null) {
                                                dVar.victor(i13, i12, ((ViewGroup.MarginLayoutParams) c0806e2).rightMargin, i55, dVar11);
                                            }
                                            i14 = i12;
                                        } else {
                                            i14 = i12;
                                            if (i53 != -1 && (dVar3 = (d) sparseArray.get(i53)) != null) {
                                                dVar.victor(i13, i13, ((ViewGroup.MarginLayoutParams) c0806e2).rightMargin, i55, dVar3);
                                            }
                                        }
                                        i15 = i13;
                                        i16 = c0806e2.india;
                                        if (i16 == -1) {
                                            d dVar12 = (d) sparseArray.get(i16);
                                            if (dVar12 != null) {
                                                i23 = 3;
                                                dVar.victor(3, 3, ((ViewGroup.MarginLayoutParams) c0806e2).topMargin, c0806e2.xray, dVar12);
                                            } else {
                                                i23 = 3;
                                            }
                                            i18 = i23;
                                            i19 = 5;
                                            i17 = -1;
                                        } else {
                                            int i57 = c0806e2.juliet;
                                            i17 = -1;
                                            if (i57 != -1 && (dVar4 = (d) sparseArray.get(i57)) != null) {
                                                dVar.victor(3, 5, ((ViewGroup.MarginLayoutParams) c0806e2).topMargin, c0806e2.xray, dVar4);
                                                i18 = 3;
                                                i19 = 5;
                                            } else {
                                                i18 = 3;
                                                i19 = 5;
                                            }
                                        }
                                        i20 = c0806e2.kilo;
                                        if (i20 == i17) {
                                            d dVar13 = (d) sparseArray.get(i20);
                                            if (dVar13 != null) {
                                                int i58 = i18;
                                                dVar.victor(i19, i58, ((ViewGroup.MarginLayoutParams) c0806e2).bottomMargin, c0806e2.zulu, dVar13);
                                                i21 = i58;
                                            } else {
                                                i21 = i18;
                                            }
                                        } else {
                                            i21 = i18;
                                            int i59 = c0806e2.lima;
                                            if (i59 != i17 && (dVar5 = (d) sparseArray.get(i59)) != null) {
                                                dVar.victor(i19, i19, ((ViewGroup.MarginLayoutParams) c0806e2).bottomMargin, c0806e2.zulu, dVar5);
                                            }
                                        }
                                        c0806e = c0806e2;
                                        i22 = c0806e.mike;
                                        if (i22 == -1) {
                                            constraintLayout = this;
                                            dVar6 = dVar;
                                            constraintLayout.echo(dVar6, c0806e, sparseArray, i22, 6);
                                        } else {
                                            int i60 = c0806e.november;
                                            if (i60 != -1) {
                                                constraintLayout = this;
                                                dVar6 = dVar;
                                                constraintLayout.echo(dVar6, c0806e, sparseArray, i60, i21);
                                            } else {
                                                int i61 = c0806e.oscar;
                                                constraintLayout = this;
                                                dVar6 = dVar;
                                                int i62 = i19;
                                                if (i61 != -1) {
                                                    constraintLayout.echo(dVar6, c0806e, sparseArray, i61, i62);
                                                }
                                                if (f11 >= 0.0f) {
                                                    dVar6.red = f11;
                                                }
                                                f5 = c0806e.bronze;
                                                if (f5 >= 0.0f) {
                                                    dVar6.silver = f5;
                                                }
                                            }
                                        }
                                        if (f11 >= 0.0f) {
                                        }
                                        f5 = c0806e.bronze;
                                        if (f5 >= 0.0f) {
                                        }
                                    }
                                }
                                i12 = i11;
                                i13 = 4;
                                if (i52 == -1) {
                                }
                                i15 = i13;
                                i16 = c0806e2.india;
                                if (i16 == -1) {
                                }
                                i20 = c0806e2.kilo;
                                if (i20 == i17) {
                                }
                                c0806e = c0806e2;
                                i22 = c0806e.mike;
                                if (i22 == -1) {
                                }
                                if (f11 >= 0.0f) {
                                }
                                f5 = c0806e.bronze;
                                if (f5 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i28 = c0806e.magenta) != -1 || c0806e.maroon != -1)) {
                                int i63 = c0806e.maroon;
                                dVar6.orange = i28;
                                dVar6.peach = i63;
                            }
                            if (!c0806e.pink) {
                                if (((ViewGroup.MarginLayoutParams) c0806e).width == -1) {
                                    if (c0806e.ochre) {
                                        dVar6.gray(3);
                                    } else {
                                        dVar6.gray(4);
                                    }
                                    dVar6.india(i14).golf = ((ViewGroup.MarginLayoutParams) c0806e).leftMargin;
                                    dVar6.india(i15).golf = ((ViewGroup.MarginLayoutParams) c0806e).rightMargin;
                                } else {
                                    dVar6.gray(3);
                                    dVar6.indigo(0);
                                }
                            } else {
                                dVar6.gray(i37);
                                dVar6.indigo(((ViewGroup.MarginLayoutParams) c0806e).width);
                                if (((ViewGroup.MarginLayoutParams) c0806e).width == -2) {
                                    dVar6.gray(i44);
                                }
                            }
                            if (!c0806e.plum) {
                                i24 = -1;
                                if (((ViewGroup.MarginLayoutParams) c0806e).height == -1) {
                                    if (c0806e.olive) {
                                        dVar6.green(3);
                                    } else {
                                        dVar6.green(4);
                                    }
                                    dVar6.india(3).golf = ((ViewGroup.MarginLayoutParams) c0806e).topMargin;
                                    dVar6.india(5).golf = ((ViewGroup.MarginLayoutParams) c0806e).bottomMargin;
                                } else {
                                    dVar6.green(3);
                                    dVar6.gold(0);
                                }
                            } else {
                                i24 = -1;
                                dVar6.green(1);
                                dVar6.gold(((ViewGroup.MarginLayoutParams) c0806e).height);
                                if (((ViewGroup.MarginLayoutParams) c0806e).height == -2) {
                                    dVar6.green(2);
                                }
                            }
                            String str3 = c0806e.coral;
                            if (str3 != null && str3.length() != 0) {
                                int length = str3.length();
                                int indexOf3 = str3.indexOf(44);
                                if (indexOf3 > 0 && indexOf3 < length - 1) {
                                    String substring = str3.substring(0, indexOf3);
                                    if (substring.equalsIgnoreCase("W")) {
                                        i26 = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        i26 = 1;
                                    } else {
                                        i26 = i24;
                                    }
                                    i27 = indexOf3 + 1;
                                } else {
                                    i26 = i24;
                                    i27 = 0;
                                }
                                int indexOf4 = str3.indexOf(58);
                                if (indexOf4 >= 0 && indexOf4 < length - 1) {
                                    String substring2 = str3.substring(i27, indexOf4);
                                    String substring3 = str3.substring(indexOf4 + 1);
                                    if (substring2.length() > 0 && substring3.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring2);
                                            float parseFloat3 = Float.parseFloat(substring3);
                                            if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                                if (i26 == 1) {
                                                    parseFloat = Math.abs(parseFloat3 / parseFloat2);
                                                } else {
                                                    parseFloat = Math.abs(parseFloat2 / parseFloat3);
                                                }
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                    parseFloat = 0.0f;
                                } else {
                                    String substring4 = str3.substring(i27);
                                    if (substring4.length() > 0) {
                                        parseFloat = Float.parseFloat(substring4);
                                    }
                                    parseFloat = 0.0f;
                                }
                                if (parseFloat > 0.0f) {
                                    dVar6.ochre = parseFloat;
                                    dVar6.olive = i26;
                                }
                            } else {
                                dVar6.ochre = 0.0f;
                            }
                            float f13 = c0806e.crimson;
                            float[] fArr = dVar6.f2450c;
                            fArr[0] = f13;
                            i37 = 1;
                            fArr[1] = c0806e.cyan;
                            dVar6.f2448a = c0806e.emerald;
                            dVar6.f2449b = c0806e.fuchsia;
                            int i64 = c0806e.peach;
                            if (i64 >= 0 && i64 <= 3) {
                                dVar6.quebec = i64;
                            }
                            int i65 = c0806e.gold;
                            int i66 = c0806e.green;
                            int i67 = c0806e.ivory;
                            float f14 = c0806e.lavender;
                            dVar6.romeo = i65;
                            dVar6.uniform = i66;
                            if (i67 == Integer.MAX_VALUE) {
                                i67 = 0;
                            }
                            dVar6.victor = i67;
                            dVar6.whiskey = f14;
                            if (f14 > 0.0f && f14 < 1.0f && i65 == 0) {
                                dVar6.romeo = 2;
                            }
                            int i68 = c0806e.gray;
                            int i69 = c0806e.indigo;
                            int i70 = c0806e.jade;
                            float f15 = c0806e.lime;
                            dVar6.sierra = i68;
                            dVar6.xray = i69;
                            if (i70 == Integer.MAX_VALUE) {
                                i70 = 0;
                            }
                            dVar6.yankee = i70;
                            dVar6.zulu = f15;
                            if (f15 > 0.0f && f15 < 1.0f && i68 == 0) {
                                i25 = 2;
                                dVar6.sierra = 2;
                            } else {
                                i25 = 2;
                            }
                        }
                        i47 = i10 + 1;
                        i44 = i25;
                        z10 = z11;
                    }
                    i10 = i47;
                    z11 = z10;
                    i25 = i44;
                    i47 = i10 + 1;
                    i44 = i25;
                    z10 = z11;
                }
            }
            if (z10) {
                eVar.f2457j.azure(eVar);
            }
        }
        eVar.f2462o.getClass();
        constraintLayout.delta(eVar, constraintLayout.f3031b, i4, i5);
        int quebec = eVar.quebec();
        int kilo = eVar.kilo();
        boolean z13 = eVar.f2470w;
        boolean z14 = eVar.f2471x;
        C0807f c0807f = constraintLayout.f3036h;
        int i71 = c0807f.echo;
        int resolveSizeAndState = View.resolveSizeAndState(quebec + c0807f.delta, i4, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(kilo + i71, i5, 0) & 16777215;
        int min = Math.min(constraintLayout.white, resolveSizeAndState & 16777215);
        int min2 = Math.min(constraintLayout.yellow, resolveSizeAndState2);
        if (z13) {
            min |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z14) {
            min2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        constraintLayout.setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d alpha = alpha(view);
        if ((view instanceof C0818q) && !(alpha instanceof h)) {
            C0806e c0806e = (C0806e) view.getLayoutParams();
            h hVar = new h();
            c0806e.f3466h = hVar;
            c0806e.red = true;
            hVar.lime(c0806e.navy);
        }
        if (view instanceof AbstractC0804c) {
            AbstractC0804c abstractC0804c = (AbstractC0804c) view;
            abstractC0804c.india();
            ((C0806e) view.getLayoutParams()).silver = true;
            ArrayList arrayList = this.purple;
            if (!arrayList.contains(abstractC0804c)) {
                arrayList.add(abstractC0804c);
            }
        }
        this.alpha.put(view.getId(), view);
        this.f3030a = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.alpha.remove(view.getId());
        d alpha = alpha(view);
        this.red.f2456i.remove(alpha);
        alpha.beige();
        this.purple.remove(view);
        this.f3030a = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f3030a = true;
        super.requestLayout();
    }

    public void setConstraintSet(C0815n c0815n) {
        this.f3032c = c0815n;
    }

    @Override // android.view.View
    public void setId(int i4) {
        int id2 = getId();
        SparseArray sparseArray = this.alpha;
        sparseArray.remove(id2);
        super.setId(i4);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i4) {
        if (i4 == this.yellow) {
            return;
        }
        this.yellow = i4;
        requestLayout();
    }

    public void setMaxWidth(int i4) {
        if (i4 == this.white) {
            return;
        }
        this.white = i4;
        requestLayout();
    }

    public void setMinHeight(int i4) {
        if (i4 == this.teal) {
            return;
        }
        this.teal = i4;
        requestLayout();
    }

    public void setMinWidth(int i4) {
        if (i4 == this.silver) {
            return;
        }
        this.silver = i4;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0817p abstractC0817p) {
        l lVar = this.f3033d;
        if (lVar != null) {
            lVar.getClass();
        }
    }

    public void setOptimizationLevel(int i4) {
        this.f3031b = i4;
        e eVar = this.red;
        eVar.f2469v = i4;
        c.quebec = eVar.ochre(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0806e(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.alpha = new SparseArray();
        this.purple = new ArrayList(4);
        this.red = new e();
        this.silver = 0;
        this.teal = 0;
        this.white = LottieConstants.IterateForever;
        this.yellow = LottieConstants.IterateForever;
        this.f3030a = true;
        this.f3031b = 257;
        this.f3032c = null;
        this.f3033d = null;
        this.e = -1;
        this.f3034f = new HashMap();
        this.f3035g = new SparseArray();
        this.f3036h = new C0807f(this, this);
        bravo(attributeSet, i4);
    }
}
