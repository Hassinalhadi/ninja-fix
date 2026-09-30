package z1;

import B9.C0073x;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.ac;
import delivery.samurai.android.R;
import java.lang.ref.ReferenceQueue;
import t0.RunnableC2944v;
import t6.R3;

/* loaded from: classes3.dex */
public abstract class g extends R3 {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f14184c = true;

    /* renamed from: a, reason: collision with root package name */
    public C0073x f14186a;
    public final RunnableC2944v alpha;
    public boolean purple;
    public final View red;
    public boolean silver;
    public final Choreographer teal;
    public final f white;
    public final Handler yellow;

    /* renamed from: b, reason: collision with root package name */
    public static final int f14183b = Build.VERSION.SDK_INT;

    /* renamed from: d, reason: collision with root package name */
    public static final ReferenceQueue f14185d = new ReferenceQueue();
    public static final ac e = new ac(1);

    public g(View view, int i4, Object obj) {
        if (obj == null) {
            this.alpha = new RunnableC2944v(3, this);
            this.purple = false;
            i[] iVarArr = new i[i4];
            this.red = view;
            if (Looper.myLooper() != null) {
                if (f14184c) {
                    this.teal = Choreographer.getInstance();
                    this.white = new f(this);
                    return;
                } else {
                    this.white = null;
                    this.yellow = new Handler(Looper.myLooper());
                    return;
                }
            }
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static int india(int i4, View view) {
        return view.getContext().getColor(i4);
    }

    public static g kilo(LayoutInflater layoutInflater, int i4, ViewGroup viewGroup, boolean z2, Object obj) {
        if (obj == null) {
            return d.charlie(layoutInflater, i4, viewGroup, z2);
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0098, code lost:
    
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0096, code lost:
    
        if (r24 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (r24 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void mike(View view, Object[] objArr, com.bumptech.glide.load.engine.h hVar, SparseIntArray sparseIntArray, boolean z2) {
        g gVar;
        String str;
        int i4;
        boolean z10;
        int i5;
        int i10;
        int i11;
        int i12;
        String str2;
        int i13;
        String str3;
        int id2;
        int i14;
        int i15;
        int length;
        if (view != null) {
            gVar = (g) view.getTag(R.id.dataBinding);
        } else {
            gVar = null;
        }
        if (gVar == null) {
            Object tag = view.getTag();
            if (tag instanceof String) {
                str = (String) tag;
            } else {
                str = null;
            }
            int i16 = 0;
            int i17 = 1;
            if (z2 && str != null && str.startsWith("layout")) {
                int lastIndexOf = str.lastIndexOf(95);
                if (lastIndexOf > 0 && (length = str.length()) != (i15 = lastIndexOf + 1)) {
                    for (int i18 = i15; i18 < length; i18++) {
                        if (Character.isDigit(str.charAt(i18))) {
                        }
                    }
                    int length2 = str.length();
                    i4 = 0;
                    while (i15 < length2) {
                        i4 = (i4 * 10) + (str.charAt(i15) - '0');
                        i15++;
                    }
                    if (objArr[i4] == null) {
                        objArr[i4] = view;
                    }
                }
                z10 = false;
                i4 = -1;
                if (!z10) {
                    objArr[i14] = view;
                }
                if (!(view instanceof ViewGroup)) {
                }
            } else {
                if (str != null && str.startsWith("binding_")) {
                    int length3 = str.length();
                    i4 = 0;
                    for (int i19 = 8; i19 < length3; i19++) {
                        i4 = (i4 * 10) + (str.charAt(i19) - '0');
                    }
                    if (objArr[i4] == null) {
                        objArr[i4] = view;
                    }
                }
                z10 = false;
                i4 = -1;
                if (!z10 && (id2 = view.getId()) > 0 && sparseIntArray != null && (i14 = sparseIntArray.get(id2, -1)) >= 0 && objArr[i14] == null) {
                    objArr[i14] = view;
                }
                if (!(view instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < childCount) {
                        View childAt = viewGroup.getChildAt(i20);
                        if (i4 >= 0 && (childAt.getTag() instanceof String)) {
                            String str4 = (String) childAt.getTag();
                            if (str4.endsWith("_0") && str4.startsWith("layout") && str4.indexOf(47) > 0) {
                                i10 = i17;
                                CharSequence subSequence = str4.subSequence(str4.indexOf(47) + i17, str4.length() - 2);
                                String[] strArr = ((String[][]) hVar.purple)[i4];
                                int length4 = strArr.length;
                                int i22 = i21;
                                while (true) {
                                    if (i22 < length4) {
                                        if (TextUtils.equals(subSequence, strArr[i22])) {
                                            break;
                                        } else {
                                            i22++;
                                        }
                                    } else {
                                        i22 = -1;
                                        break;
                                    }
                                }
                                if (i22 >= 0) {
                                    i21 = i22 + 1;
                                    int i23 = ((int[][]) hVar.red)[i4][i22];
                                    int i24 = ((int[][]) hVar.silver)[i4][i22];
                                    String str5 = (String) viewGroup.getChildAt(i20).getTag();
                                    String substring = str5.substring(i16, str5.length() - 1);
                                    int length5 = substring.length();
                                    int childCount2 = viewGroup.getChildCount();
                                    i5 = childCount;
                                    int i25 = i20;
                                    int i26 = i20 + 1;
                                    while (i26 < childCount2) {
                                        View childAt2 = viewGroup.getChildAt(i26);
                                        int i27 = i26;
                                        if (childAt2.getTag() instanceof String) {
                                            str2 = (String) childAt2.getTag();
                                        } else {
                                            str2 = null;
                                        }
                                        if (str2 != null && str2.startsWith(substring)) {
                                            i13 = childCount2;
                                            str3 = str5;
                                            if (str2.length() == str3.length() && str2.charAt(str2.length() - 1) == '0') {
                                                break;
                                            }
                                            int length6 = str2.length();
                                            if (length6 != length5) {
                                                int i28 = length5;
                                                while (true) {
                                                    if (i28 < length6) {
                                                        if (!Character.isDigit(str2.charAt(i28))) {
                                                            break;
                                                        } else {
                                                            i28++;
                                                        }
                                                    } else {
                                                        i25 = i27;
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            i13 = childCount2;
                                            str3 = str5;
                                        }
                                        i26 = i27 + 1;
                                        childCount2 = i13;
                                        str5 = str3;
                                    }
                                    if (i25 == i20) {
                                        objArr[i23] = d.alpha.bravo(i24, childAt);
                                    } else {
                                        int i29 = i25 - i20;
                                        int i30 = i29 + 1;
                                        View[] viewArr = new View[i30];
                                        for (int i31 = 0; i31 < i30; i31++) {
                                            viewArr[i31] = viewGroup.getChildAt(i20 + i31);
                                        }
                                        objArr[i23] = d.alpha.charlie(viewArr, i24);
                                        i20 += i29;
                                    }
                                    i11 = i10;
                                    if (i11 == 0) {
                                        i12 = 0;
                                        mike(childAt, objArr, hVar, sparseIntArray, false);
                                    } else {
                                        i12 = 0;
                                    }
                                    i20++;
                                    childCount = i5;
                                    i16 = i12;
                                    i17 = i10;
                                } else {
                                    i5 = childCount;
                                    i11 = 0;
                                    if (i11 == 0) {
                                    }
                                    i20++;
                                    childCount = i5;
                                    i16 = i12;
                                    i17 = i10;
                                }
                            }
                        }
                        i5 = childCount;
                        i10 = i17;
                        i11 = 0;
                        if (i11 == 0) {
                        }
                        i20++;
                        childCount = i5;
                        i16 = i12;
                        i17 = i10;
                    }
                }
            }
        }
    }

    public static Object[] november(View view, int i4, com.bumptech.glide.load.engine.h hVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i4];
        mike(view, objArr, hVar, sparseIntArray, true);
        return objArr;
    }

    public abstract void foxtrot();

    public final void golf() {
        if (this.silver) {
            oscar();
        } else {
            if (!juliet()) {
                return;
            }
            this.silver = true;
            foxtrot();
            this.silver = false;
        }
    }

    public final void hotel() {
        C0073x c0073x = this.f14186a;
        if (c0073x == null) {
            golf();
        } else {
            c0073x.hotel();
        }
    }

    public abstract boolean juliet();

    public abstract void lima();

    public final void oscar() {
        C0073x c0073x = this.f14186a;
        if (c0073x != null) {
            c0073x.oscar();
            return;
        }
        synchronized (this) {
            try {
                if (this.purple) {
                    return;
                }
                this.purple = true;
                if (f14184c) {
                    this.teal.postFrameCallback(this.white);
                } else {
                    this.yellow.post(this.alpha);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void papa(View view) {
        view.setTag(R.id.dataBinding, this);
    }
}
