package x2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import com.google.android.gms.measurement.internal.C1469t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public abstract class z implements Cloneable {

    /* renamed from: u, reason: collision with root package name */
    public static final Animator[] f14072u = new Animator[0];

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f14073v = {2, 1, 3, 4};

    /* renamed from: w, reason: collision with root package name */
    public static final C1469t f14074w = new C1469t(16);

    /* renamed from: x, reason: collision with root package name */
    public static final ThreadLocal f14075x = new ThreadLocal();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f14079d;
    public ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public x[] f14080f;

    /* renamed from: o, reason: collision with root package name */
    public o f14089o;

    /* renamed from: p, reason: collision with root package name */
    public C3287h f14090p;

    /* renamed from: r, reason: collision with root package name */
    public long f14092r;

    /* renamed from: s, reason: collision with root package name */
    public w f14093s;

    /* renamed from: t, reason: collision with root package name */
    public long f14094t;
    public final String alpha = getClass().getName();
    public long purple = -1;
    public long red = -1;
    public TimeInterpolator silver = null;
    public final ArrayList teal = new ArrayList();
    public final ArrayList white = new ArrayList();
    public J2.i yellow = new J2.i();

    /* renamed from: a, reason: collision with root package name */
    public J2.i f14076a = new J2.i();

    /* renamed from: b, reason: collision with root package name */
    public af f14077b = null;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f14078c = f14073v;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f14081g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public Animator[] f14082h = f14072u;

    /* renamed from: i, reason: collision with root package name */
    public int f14083i = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14084j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14085k = false;

    /* renamed from: l, reason: collision with root package name */
    public z f14086l = null;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f14087m = null;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f14088n = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public C1469t f14091q = f14074w;

    public static void charlie(J2.i iVar, View view, ai aiVar) {
        ((bv.e) iVar.alpha).put(view, aiVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            SparseArray sparseArray = (SparseArray) iVar.purple;
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        WeakHashMap weakHashMap = s1.au.alpha;
        String foxtrot = s1.al.foxtrot(view);
        if (foxtrot != null) {
            bv.e eVar = (bv.e) iVar.silver;
            if (eVar.containsKey(foxtrot)) {
                eVar.put(foxtrot, null);
            } else {
                eVar.put(foxtrot, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                bv.u uVar = (bv.u) iVar.red;
                if (uVar.foxtrot(itemIdAtPosition) >= 0) {
                    View view2 = (View) uVar.delta(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        uVar.hotel(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                uVar.hotel(itemIdAtPosition, view);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [bv.e, java.lang.Object, bv.aw] */
    public static bv.e quebec() {
        ThreadLocal threadLocal = f14075x;
        bv.e eVar = (bv.e) threadLocal.get();
        if (eVar == null) {
            ?? awVar = new bv.aw(0);
            threadLocal.set(awVar);
            return awVar;
        }
        return eVar;
    }

    public static boolean xray(ai aiVar, ai aiVar2, String str) {
        Object obj = aiVar.alpha.get(str);
        Object obj2 = aiVar2.alpha.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public z alpha(x xVar) {
        if (this.f14087m == null) {
            this.f14087m = new ArrayList();
        }
        this.f14087m.add(xVar);
        return this;
    }

    public void amber() {
        bv.e quebec = quebec();
        this.f14092r = 0L;
        for (int i4 = 0; i4 < this.f14088n.size(); i4++) {
            Animator animator = (Animator) this.f14088n.get(i4);
            t tVar = (t) quebec.get(animator);
            if (animator != null && tVar != null) {
                long j5 = this.red;
                Animator animator2 = tVar.foxtrot;
                if (j5 >= 0) {
                    animator2.setDuration(j5);
                }
                long j6 = this.purple;
                if (j6 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j6);
                }
                TimeInterpolator timeInterpolator = this.silver;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f14081g.add(animator);
                this.f14092r = Math.max(this.f14092r, u.alpha(animator));
            }
        }
        this.f14088n.clear();
    }

    public z azure(x xVar) {
        z zVar;
        ArrayList arrayList = this.f14087m;
        if (arrayList != null) {
            if (!arrayList.remove(xVar) && (zVar = this.f14086l) != null) {
                zVar.azure(xVar);
            }
            if (this.f14087m.size() == 0) {
                this.f14087m = null;
            }
        }
        return this;
    }

    public void beige(View view) {
        this.white.remove(view);
    }

    public void black(View view) {
        if (this.f14084j) {
            if (!this.f14085k) {
                ArrayList arrayList = this.f14081g;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f14082h);
                this.f14082h = f14072u;
                for (int i4 = size - 1; i4 >= 0; i4--) {
                    Animator animator = animatorArr[i4];
                    animatorArr[i4] = null;
                    animator.resume();
                }
                this.f14082h = animatorArr;
                yankee(this, y.peach, false);
            }
            this.f14084j = false;
        }
    }

    public void blue() {
        gray();
        bv.e quebec = quebec();
        Iterator it = this.f14088n.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (quebec.containsKey(animator)) {
                gray();
                if (animator != null) {
                    animator.addListener(new com.google.android.material.navigation.a(this, quebec));
                    long j5 = this.red;
                    if (j5 >= 0) {
                        animator.setDuration(j5);
                    }
                    long j6 = this.purple;
                    if (j6 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j6);
                    }
                    TimeInterpolator timeInterpolator = this.silver;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new O6.b(12, this));
                    animator.start();
                }
            }
        }
        this.f14088n.clear();
        mike();
    }

    public void bravo(View view) {
        this.white.add(view);
    }

    public void bronze(long j5, long j6) {
        boolean z2;
        long j7 = this.f14092r;
        if (j5 < j6) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((j6 < 0 && j5 >= 0) || (j6 > j7 && j5 <= j7)) {
            this.f14085k = false;
            yankee(this, y.navy, z2);
        }
        ArrayList arrayList = this.f14081g;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f14082h);
        this.f14082h = f14072u;
        for (int i4 = 0; i4 < size; i4++) {
            Animator animator = animatorArr[i4];
            animatorArr[i4] = null;
            u.bravo(animator, Math.min(Math.max(0L, j5), u.alpha(animator)));
        }
        this.f14082h = animatorArr;
        if ((j5 > j7 && j6 <= j7) || (j5 < 0 && j6 >= 0)) {
            if (j5 > j7) {
                this.f14085k = true;
            }
            yankee(this, y.ochre, z2);
        }
    }

    public void cancel() {
        ArrayList arrayList = this.f14081g;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f14082h);
        this.f14082h = f14072u;
        for (int i4 = size - 1; i4 >= 0; i4--) {
            Animator animator = animatorArr[i4];
            animatorArr[i4] = null;
            animator.cancel();
        }
        this.f14082h = animatorArr;
        yankee(this, y.olive, false);
    }

    public void coral(long j5) {
        this.red = j5;
    }

    public void crimson(C3287h c3287h) {
        this.f14090p = c3287h;
    }

    public void cyan(TimeInterpolator timeInterpolator) {
        this.silver = timeInterpolator;
    }

    public abstract void delta(ai aiVar);

    public final void echo(View view, boolean z2) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                ai aiVar = new ai(view);
                if (z2) {
                    golf(aiVar);
                } else {
                    delta(aiVar);
                }
                aiVar.charlie.add(this);
                foxtrot(aiVar);
                if (z2) {
                    charlie(this.yellow, view, aiVar);
                } else {
                    charlie(this.f14076a, view, aiVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    echo(viewGroup.getChildAt(i4), z2);
                }
            }
        }
    }

    public void emerald(C1469t c1469t) {
        if (c1469t == null) {
            this.f14091q = f14074w;
        } else {
            this.f14091q = c1469t;
        }
    }

    public void foxtrot(ai aiVar) {
        if (this.f14089o != null) {
            HashMap hashMap = aiVar.alpha;
            if (!hashMap.isEmpty()) {
                this.f14089o.getClass();
                String[] strArr = o.bravo;
                for (int i4 = 0; i4 < 2; i4++) {
                    if (!hashMap.containsKey(strArr[i4])) {
                        this.f14089o.getClass();
                        Integer num = (Integer) hashMap.get("android:visibility:visibility");
                        View view = aiVar.bravo;
                        if (num == null) {
                            num = Integer.valueOf(view.getVisibility());
                        }
                        hashMap.put("android:visibilityPropagation:visibility", num);
                        view.getLocationOnScreen(r1);
                        int round = Math.round(view.getTranslationX()) + r1[0];
                        int[] iArr = {round};
                        iArr[0] = (view.getWidth() / 2) + round;
                        int round2 = Math.round(view.getTranslationY()) + iArr[1];
                        iArr[1] = round2;
                        iArr[1] = (view.getHeight() / 2) + round2;
                        hashMap.put("android:visibilityPropagation:center", iArr);
                        return;
                    }
                }
            }
        }
    }

    public void fuchsia(o oVar) {
        this.f14089o = oVar;
    }

    public void gold(long j5) {
        this.purple = j5;
    }

    public abstract void golf(ai aiVar);

    public final void gray() {
        if (this.f14083i == 0) {
            yankee(this, y.navy, false);
            this.f14085k = false;
        }
        this.f14083i++;
    }

    public String green(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.red != -1) {
            sb2.append("dur(");
            sb2.append(this.red);
            sb2.append(") ");
        }
        if (this.purple != -1) {
            sb2.append("dly(");
            sb2.append(this.purple);
            sb2.append(") ");
        }
        if (this.silver != null) {
            sb2.append("interp(");
            sb2.append(this.silver);
            sb2.append(") ");
        }
        ArrayList arrayList = this.teal;
        int size = arrayList.size();
        ArrayList arrayList2 = this.white;
        if (size > 0 || arrayList2.size() > 0) {
            sb2.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (i4 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList.get(i4));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    if (i5 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList2.get(i5));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public final void hotel(ViewGroup viewGroup, boolean z2) {
        india(z2);
        ArrayList arrayList = this.teal;
        int size = arrayList.size();
        ArrayList arrayList2 = this.white;
        if (size <= 0 && arrayList2.size() <= 0) {
            echo(viewGroup, z2);
            return;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i4)).intValue());
            if (findViewById != null) {
                ai aiVar = new ai(findViewById);
                if (z2) {
                    golf(aiVar);
                } else {
                    delta(aiVar);
                }
                aiVar.charlie.add(this);
                foxtrot(aiVar);
                if (z2) {
                    charlie(this.yellow, findViewById, aiVar);
                } else {
                    charlie(this.f14076a, findViewById, aiVar);
                }
            }
        }
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            View view = (View) arrayList2.get(i5);
            ai aiVar2 = new ai(view);
            if (z2) {
                golf(aiVar2);
            } else {
                delta(aiVar2);
            }
            aiVar2.charlie.add(this);
            foxtrot(aiVar2);
            if (z2) {
                charlie(this.yellow, view, aiVar2);
            } else {
                charlie(this.f14076a, view, aiVar2);
            }
        }
    }

    public final void india(boolean z2) {
        if (z2) {
            ((bv.e) this.yellow.alpha).clear();
            ((SparseArray) this.yellow.purple).clear();
            ((bv.u) this.yellow.red).bravo();
        } else {
            ((bv.e) this.f14076a.alpha).clear();
            ((SparseArray) this.f14076a.purple).clear();
            ((bv.u) this.f14076a.red).bravo();
        }
    }

    @Override // 
    /* renamed from: juliet, reason: merged with bridge method [inline-methods] */
    public z clone() {
        try {
            z zVar = (z) super.clone();
            zVar.f14088n = new ArrayList();
            zVar.yellow = new J2.i();
            zVar.f14076a = new J2.i();
            zVar.f14079d = null;
            zVar.e = null;
            zVar.f14093s = null;
            zVar.f14086l = this;
            zVar.f14087m = null;
            return zVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator kilo(ViewGroup viewGroup, ai aiVar, ai aiVar2) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01bd, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ca, code lost:
    
        if (r30.getLayoutDirection() == 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0116, code lost:
    
        if (r10.isEmpty() != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b9, code lost:
    
        if (r30.getLayoutDirection() == r17) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bb, code lost:
    
        r1 = 5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x026e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0209  */
    /* JADX WARN: Type inference failed for: r1v10, types: [x2.t, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lima(ViewGroup viewGroup, J2.i iVar, J2.i iVar2, ArrayList arrayList, ArrayList arrayList2) {
        boolean z2;
        Animator kilo;
        int i4;
        boolean z10;
        int i5;
        int i10;
        View view;
        ai aiVar;
        Rect rect;
        Rect rect2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int abs;
        int i18;
        int i19;
        int width;
        long j5;
        long round;
        int[] iArr;
        int[] iArr2;
        ViewGroup viewGroup2 = viewGroup;
        bv.e quebec = quebec();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        if (papa().f14093s != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j6 = Long.MAX_VALUE;
        int i20 = 0;
        while (i20 < size) {
            ai aiVar2 = (ai) arrayList.get(i20);
            ai aiVar3 = (ai) arrayList2.get(i20);
            if (aiVar2 != null && !aiVar2.charlie.contains(this)) {
                aiVar2 = null;
            }
            if (aiVar3 != null && !aiVar3.charlie.contains(this)) {
                aiVar3 = null;
            }
            if ((aiVar2 == null && aiVar3 == null) || ((aiVar2 != null && aiVar3 != null && !victor(aiVar2, aiVar3)) || (kilo = kilo(viewGroup2, aiVar2, aiVar3)) == null)) {
                i4 = size;
                z10 = z2;
                i5 = i20;
            } else {
                String str = this.alpha;
                if (aiVar3 != null) {
                    i10 = 1;
                    String[] romeo = romeo();
                    i4 = size;
                    view = aiVar3.bravo;
                    z10 = z2;
                    if (romeo != null && romeo.length > 0) {
                        aiVar = new ai(view);
                        i5 = i20;
                        ai aiVar4 = (ai) ((bv.e) iVar2.alpha).get(view);
                        if (aiVar4 != null) {
                            int i21 = 0;
                            while (i21 < romeo.length) {
                                HashMap hashMap = aiVar.alpha;
                                int i22 = i21;
                                String str2 = romeo[i22];
                                hashMap.put(str2, aiVar4.alpha.get(str2));
                                i21 = i22 + 1;
                                romeo = romeo;
                            }
                        }
                        int i23 = quebec.red;
                        int i24 = 0;
                        while (true) {
                            if (i24 < i23) {
                                t tVar = (t) quebec.get((Animator) quebec.foxtrot(i24));
                                if (tVar.charlie != null && tVar.alpha == view && tVar.bravo.equals(str) && tVar.charlie.equals(aiVar)) {
                                    kilo = null;
                                } else {
                                    i24++;
                                }
                            } else {
                                kilo = kilo;
                            }
                        }
                        if (kilo != null) {
                            o oVar = this.f14089o;
                            if (oVar != null) {
                                if (aiVar2 == null && aiVar3 == null) {
                                    round = 0;
                                } else {
                                    C3287h c3287h = this.f14090p;
                                    if (c3287h != null) {
                                        switch (c3287h.alpha) {
                                            case 0:
                                                rect = c3287h.bravo;
                                                break;
                                            default:
                                                rect = c3287h.bravo;
                                                break;
                                        }
                                    }
                                    rect = null;
                                    if (aiVar3 != null) {
                                        int i25 = 8;
                                        if (aiVar2 == null) {
                                            rect2 = rect;
                                        } else {
                                            rect2 = rect;
                                            Integer num = (Integer) aiVar2.alpha.get("android:visibilityPropagation:visibility");
                                            if (num != null) {
                                                i25 = num.intValue();
                                            }
                                        }
                                        if (i25 != 0) {
                                            aiVar2 = aiVar3;
                                            i11 = i10;
                                            if (aiVar2 == null || (iArr2 = (int[]) aiVar2.alpha.get("android:visibilityPropagation:center")) == null) {
                                                i12 = -1;
                                            } else {
                                                i12 = iArr2[0];
                                            }
                                            if (aiVar2 == null || (iArr = (int[]) aiVar2.alpha.get("android:visibilityPropagation:center")) == null) {
                                                i13 = -1;
                                            } else {
                                                i13 = iArr[i10];
                                            }
                                            int i26 = i13;
                                            int[] iArr3 = new int[2];
                                            viewGroup2.getLocationOnScreen(iArr3);
                                            int round2 = Math.round(viewGroup2.getTranslationX()) + iArr3[0];
                                            int round3 = Math.round(viewGroup2.getTranslationY()) + iArr3[i10];
                                            int width2 = viewGroup2.getWidth() + round2;
                                            int height = viewGroup2.getHeight() + round3;
                                            if (rect2 == null) {
                                                i15 = rect2.centerX();
                                                i14 = rect2.centerY();
                                            } else {
                                                i14 = (round3 + height) / 2;
                                                i15 = (round2 + width2) / 2;
                                            }
                                            i16 = oVar.alpha;
                                            if (i16 == 8388611) {
                                                if (i16 == 8388613) {
                                                }
                                            }
                                            if (i16 == 3) {
                                                if (i16 != 5) {
                                                    if (i16 != 48) {
                                                        if (i16 != 80) {
                                                            i18 = 0;
                                                        } else {
                                                            i17 = i26 - round3;
                                                            abs = Math.abs(i15 - i12);
                                                        }
                                                    } else {
                                                        i18 = Math.abs(i15 - i12) + (height - i26);
                                                    }
                                                } else {
                                                    i18 = Math.abs(i14 - i26) + (i12 - round2);
                                                }
                                                float f5 = i18;
                                                i19 = oVar.alpha;
                                                if (i19 == 3 && i19 != 5 && i19 != 8388611 && i19 != 8388613) {
                                                    width = viewGroup.getHeight();
                                                } else {
                                                    width = viewGroup.getWidth();
                                                }
                                                float f10 = f5 / width;
                                                j5 = this.red;
                                                if (j5 < 0) {
                                                    j5 = 300;
                                                }
                                                round = Math.round((((float) (i11 * j5)) / 3.0f) * f10);
                                            } else {
                                                i17 = width2 - i12;
                                                abs = Math.abs(i14 - i26);
                                            }
                                            i18 = abs + i17;
                                            float f52 = i18;
                                            i19 = oVar.alpha;
                                            if (i19 == 3) {
                                            }
                                            width = viewGroup.getWidth();
                                            float f102 = f52 / width;
                                            j5 = this.red;
                                            if (j5 < 0) {
                                            }
                                            round = Math.round((((float) (i11 * j5)) / 3.0f) * f102);
                                        }
                                    } else {
                                        rect2 = rect;
                                    }
                                    i11 = -1;
                                    if (aiVar2 == null) {
                                        i12 = iArr2[0];
                                        if (aiVar2 == null) {
                                            i13 = iArr[i10];
                                            int i262 = i13;
                                            int[] iArr32 = new int[2];
                                            viewGroup2.getLocationOnScreen(iArr32);
                                            int round22 = Math.round(viewGroup2.getTranslationX()) + iArr32[0];
                                            int round32 = Math.round(viewGroup2.getTranslationY()) + iArr32[i10];
                                            int width22 = viewGroup2.getWidth() + round22;
                                            int height2 = viewGroup2.getHeight() + round32;
                                            if (rect2 == null) {
                                            }
                                            i16 = oVar.alpha;
                                            if (i16 == 8388611) {
                                            }
                                            if (i16 == 3) {
                                            }
                                            i18 = abs + i17;
                                            float f522 = i18;
                                            i19 = oVar.alpha;
                                            if (i19 == 3) {
                                            }
                                            width = viewGroup.getWidth();
                                            float f1022 = f522 / width;
                                            j5 = this.red;
                                            if (j5 < 0) {
                                            }
                                            round = Math.round((((float) (i11 * j5)) / 3.0f) * f1022);
                                        }
                                        i13 = -1;
                                        int i2622 = i13;
                                        int[] iArr322 = new int[2];
                                        viewGroup2.getLocationOnScreen(iArr322);
                                        int round222 = Math.round(viewGroup2.getTranslationX()) + iArr322[0];
                                        int round322 = Math.round(viewGroup2.getTranslationY()) + iArr322[i10];
                                        int width222 = viewGroup2.getWidth() + round222;
                                        int height22 = viewGroup2.getHeight() + round322;
                                        if (rect2 == null) {
                                        }
                                        i16 = oVar.alpha;
                                        if (i16 == 8388611) {
                                        }
                                        if (i16 == 3) {
                                        }
                                        i18 = abs + i17;
                                        float f5222 = i18;
                                        i19 = oVar.alpha;
                                        if (i19 == 3) {
                                        }
                                        width = viewGroup.getWidth();
                                        float f10222 = f5222 / width;
                                        j5 = this.red;
                                        if (j5 < 0) {
                                        }
                                        round = Math.round((((float) (i11 * j5)) / 3.0f) * f10222);
                                    }
                                    i12 = -1;
                                    if (aiVar2 == null) {
                                    }
                                    i13 = -1;
                                    int i26222 = i13;
                                    int[] iArr3222 = new int[2];
                                    viewGroup2.getLocationOnScreen(iArr3222);
                                    int round2222 = Math.round(viewGroup2.getTranslationX()) + iArr3222[0];
                                    int round3222 = Math.round(viewGroup2.getTranslationY()) + iArr3222[i10];
                                    int width2222 = viewGroup2.getWidth() + round2222;
                                    int height222 = viewGroup2.getHeight() + round3222;
                                    if (rect2 == null) {
                                    }
                                    i16 = oVar.alpha;
                                    if (i16 == 8388611) {
                                    }
                                    if (i16 == 3) {
                                    }
                                    i18 = abs + i17;
                                    float f52222 = i18;
                                    i19 = oVar.alpha;
                                    if (i19 == 3) {
                                    }
                                    width = viewGroup.getWidth();
                                    float f102222 = f52222 / width;
                                    j5 = this.red;
                                    if (j5 < 0) {
                                    }
                                    round = Math.round((((float) (i11 * j5)) / 3.0f) * f102222);
                                }
                                sparseIntArray.put(this.f14088n.size(), (int) round);
                                j6 = Math.min(round, j6);
                            }
                            WindowId windowId = viewGroup.getWindowId();
                            ?? obj = new Object();
                            obj.alpha = view;
                            obj.bravo = str;
                            obj.charlie = aiVar;
                            obj.delta = windowId;
                            obj.echo = this;
                            obj.foxtrot = kilo;
                            if (z10) {
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.play(kilo);
                                kilo = animatorSet;
                            }
                            quebec.put(kilo, obj);
                            this.f14088n.add(kilo);
                        }
                    } else {
                        i5 = i20;
                        kilo = kilo;
                    }
                } else {
                    i4 = size;
                    z10 = z2;
                    i5 = i20;
                    i10 = 1;
                    view = aiVar2.bravo;
                }
                aiVar = null;
                if (kilo != null) {
                }
            }
            i20 = i5 + 1;
            viewGroup2 = viewGroup;
            size = i4;
            z2 = z10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i27 = 0; i27 < sparseIntArray.size(); i27++) {
                t tVar2 = (t) quebec.get((Animator) this.f14088n.get(sparseIntArray.keyAt(i27)));
                tVar2.foxtrot.setStartDelay(tVar2.foxtrot.getStartDelay() + (sparseIntArray.valueAt(i27) - j6));
            }
        }
    }

    public final void mike() {
        int i4 = this.f14083i - 1;
        this.f14083i = i4;
        if (i4 == 0) {
            yankee(this, y.ochre, false);
            for (int i5 = 0; i5 < ((bv.u) this.yellow.red).juliet(); i5++) {
                View view = (View) ((bv.u) this.yellow.red).kilo(i5);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i10 = 0; i10 < ((bv.u) this.f14076a.red).juliet(); i10++) {
                View view2 = (View) ((bv.u) this.f14076a.red).kilo(i10);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f14085k = true;
        }
    }

    public void november(ViewGroup viewGroup) {
        bv.e quebec = quebec();
        int i4 = quebec.red;
        if (viewGroup != null && i4 != 0) {
            WindowId windowId = viewGroup.getWindowId();
            bv.e eVar = new bv.e(quebec);
            quebec.clear();
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                t tVar = (t) eVar.juliet(i5);
                if (tVar.alpha != null && windowId.equals(tVar.delta)) {
                    ((Animator) eVar.foxtrot(i5)).end();
                }
            }
        }
    }

    public final ai oscar(View view, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        af afVar = this.f14077b;
        if (afVar != null) {
            return afVar.oscar(view, z2);
        }
        if (z2) {
            arrayList = this.f14079d;
        } else {
            arrayList = this.e;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 < size) {
                    ai aiVar = (ai) arrayList.get(i4);
                    if (aiVar != null) {
                        if (aiVar.bravo == view) {
                            break;
                        }
                        i4++;
                    } else {
                        return null;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 >= 0) {
                if (z2) {
                    arrayList2 = this.e;
                } else {
                    arrayList2 = this.f14079d;
                }
                return (ai) arrayList2.get(i4);
            }
            return null;
        }
        return null;
    }

    public final z papa() {
        af afVar = this.f14077b;
        if (afVar != null) {
            return afVar.papa();
        }
        return this;
    }

    public String[] romeo() {
        return null;
    }

    public final ai sierra(View view, boolean z2) {
        J2.i iVar;
        af afVar = this.f14077b;
        if (afVar != null) {
            return afVar.sierra(view, z2);
        }
        if (z2) {
            iVar = this.yellow;
        } else {
            iVar = this.f14076a;
        }
        return (ai) ((bv.e) iVar.alpha).get(view);
    }

    public boolean tango() {
        return !this.f14081g.isEmpty();
    }

    public final String toString() {
        return green("");
    }

    public abstract boolean uniform();

    public boolean victor(ai aiVar, ai aiVar2) {
        if (aiVar != null && aiVar2 != null) {
            String[] romeo = romeo();
            if (romeo != null) {
                for (String str : romeo) {
                    if (xray(aiVar, aiVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = aiVar.alpha.keySet().iterator();
                while (it.hasNext()) {
                    if (xray(aiVar, aiVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean whiskey(View view) {
        int id2 = view.getId();
        ArrayList arrayList = this.teal;
        int size = arrayList.size();
        ArrayList arrayList2 = this.white;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id2)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public final void yankee(z zVar, y yVar, boolean z2) {
        z zVar2 = this.f14086l;
        if (zVar2 != null) {
            zVar2.yankee(zVar, yVar, z2);
        }
        ArrayList arrayList = this.f14087m;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.f14087m.size();
            x[] xVarArr = this.f14080f;
            if (xVarArr == null) {
                xVarArr = new x[size];
            }
            this.f14080f = null;
            x[] xVarArr2 = (x[]) this.f14087m.toArray(xVarArr);
            for (int i4 = 0; i4 < size; i4++) {
                yVar.alpha(xVarArr2[i4], zVar, z2);
                xVarArr2[i4] = null;
            }
            this.f14080f = xVarArr2;
        }
    }

    public void zulu(ViewGroup viewGroup) {
        if (!this.f14085k) {
            ArrayList arrayList = this.f14081g;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f14082h);
            this.f14082h = f14072u;
            for (int i4 = size - 1; i4 >= 0; i4--) {
                Animator animator = animatorArr[i4];
                animatorArr[i4] = null;
                animator.pause();
            }
            this.f14082h = animatorArr;
            yankee(this, y.orange, false);
            this.f14084j = true;
        }
    }
}
