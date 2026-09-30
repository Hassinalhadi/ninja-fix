package S5;

import I0.t;
import J2.n;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.InterfaceC0566c;
import androidx.constraintlayout.widget.ConstraintLayout;
import bz.InterfaceC0799y;
import bz.ad;
import bz.k0;
import bz.r;
import c1.AbstractC0820s;
import c1.C0815n;
import e6.AbstractC1630b;
import g6.C1754b;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class l implements InterfaceC0566c, k0, t {
    public final /* synthetic */ int alpha;
    public int purple;
    public int red;
    public final Object silver;

    public l(Context context) {
        this.alpha = 0;
        this.red = 0;
        this.silver = context;
    }

    @Override // bz.i0
    public /* synthetic */ boolean alpha() {
        return false;
    }

    @Override // bz.i0
    public long amber(r rVar, r rVar2, r rVar3) {
        return (lavender() + jade()) * 1000000;
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public void bravo(int i4, Object obj) {
        int i5;
        if (this.red == 0) {
            i5 = this.purple;
        } else {
            i5 = 0;
        }
        ((InterfaceC0566c) this.silver).bravo(i4 + i5, obj);
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public void charlie(Object obj) {
        this.red++;
        ((InterfaceC0566c) this.silver).charlie(obj);
    }

    @Override // bz.i0
    public r delta(r rVar, r rVar2, r rVar3) {
        return ((n) this.silver).gray(amber(rVar, rVar2, rVar3), rVar, rVar2, rVar3);
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public void echo() {
        ((InterfaceC0566c) this.silver).echo();
    }

    @Override // bz.i0
    public r foxtrot(long j5, r rVar, r rVar2, r rVar3) {
        return ((n) this.silver).foxtrot(j5, rVar, rVar2, rVar3);
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public void golf(int i4, int i5, int i10) {
        int i11;
        if (this.red == 0) {
            i11 = this.purple;
        } else {
            i11 = 0;
        }
        ((InterfaceC0566c) this.silver).golf(i4 + i11, i5 + i11, i10);
    }

    @Override // bz.i0
    public r gray(long j5, r rVar, r rVar2, r rVar3) {
        return ((n) this.silver).gray(j5, rVar, rVar2, rVar3);
    }

    public byte hotel(int i4, int i5) {
        return ((byte[][]) this.silver)[i5][i4];
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public void india(int i4, int i5) {
        int i10;
        if (this.red == 0) {
            i10 = this.purple;
        } else {
            i10 = 0;
        }
        ((InterfaceC0566c) this.silver).india(i4 + i10, i5);
    }

    @Override // bz.k0
    public int jade() {
        return this.red;
    }

    public void juliet(int i4, int i5, int i10) {
        ((byte[][]) this.silver)[i5][i4] = (byte) i10;
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public void kilo() {
        boolean z2;
        if (this.red > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            androidx.compose.runtime.r.charlie("OffsetApplier up called with no corresponding down");
        }
        this.red--;
        ((InterfaceC0566c) this.silver).kilo();
    }

    @Override // bz.k0
    public int lavender() {
        return this.purple;
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public void lima(int i4, Object obj) {
        int i5;
        if (this.red == 0) {
            i5 = this.purple;
        } else {
            i5 = 0;
        }
        ((InterfaceC0566c) this.silver).lima(i4 + i5, obj);
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public /* synthetic */ void mike() {
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public void november(Object obj, Xd.l lVar) {
        ((InterfaceC0566c) this.silver).november(obj, lVar);
    }

    @Override // I0.t
    public int originalToTransformed(int i4) {
        int originalToTransformed = ((t) this.silver).originalToTransformed(i4);
        if (i4 >= 0 && i4 <= this.purple) {
            n.k0.bravo(originalToTransformed, this.red, i4);
        }
        return originalToTransformed;
    }

    public synchronized int oscar() {
        PackageInfo packageInfo;
        if (this.purple == 0) {
            try {
                packageInfo = C1754b.alpha((Context) this.silver).charlie(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.purple = packageInfo.versionCode;
            }
        }
        return this.purple;
    }

    public synchronized int papa() {
        int i4 = this.red;
        if (i4 != 0) {
            return i4;
        }
        Context context = (Context) this.silver;
        PackageManager packageManager = context.getPackageManager();
        if (C1754b.alpha(context).purple.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i5 = 1;
        if (!AbstractC1630b.delta()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.red = i5;
                return i5;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i5 = 2;
            this.red = i5;
            return i5;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == AbstractC1630b.delta()) {
            i5 = 2;
        }
        this.red = i5;
        return i5;
    }

    public String toString() {
        switch (this.alpha) {
            case 5:
                int i4 = this.purple;
                int i5 = this.red;
                StringBuilder sb2 = new StringBuilder((i4 * 2 * i5) + 2);
                for (int i10 = 0; i10 < i5; i10++) {
                    byte[] bArr = ((byte[][]) this.silver)[i10];
                    for (int i11 = 0; i11 < i4; i11++) {
                        byte b2 = bArr[i11];
                        if (b2 != 0) {
                            if (b2 != 1) {
                                sb2.append("  ");
                            } else {
                                sb2.append(" 1");
                            }
                        } else {
                            sb2.append(" 0");
                        }
                    }
                    sb2.append('\n');
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // I0.t
    public int transformedToOriginal(int i4) {
        int transformedToOriginal = ((t) this.silver).transformedToOriginal(i4);
        if (i4 >= 0 && i4 <= this.red) {
            n.k0.charlie(transformedToOriginal, this.purple, i4);
        }
        return transformedToOriginal;
    }

    public /* synthetic */ l(Object obj, int i4, int i5, int i10) {
        this.alpha = i10;
        this.silver = obj;
        this.purple = i4;
        this.red = i5;
    }

    public l(int i4, int i5) {
        this.alpha = 5;
        this.silver = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i5, i4);
        this.purple = i4;
        this.red = i5;
    }

    public l(Context context, XmlResourceParser xmlResourceParser) {
        this.alpha = 4;
        this.silver = new ArrayList();
        this.red = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0820s.india);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == 0) {
                this.purple = obtainStyledAttributes.getResourceId(index, this.purple);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.red);
                this.red = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0815n().bravo((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public l(InterfaceC0566c interfaceC0566c, int i4) {
        this.alpha = 2;
        this.silver = interfaceC0566c;
        this.purple = i4;
    }

    public l(int i4, int i5, Function0 function0) {
        this.alpha = 6;
        this.purple = i4;
        this.red = i5;
        this.silver = function0;
    }

    public l(int i4, int i5, InterfaceC0799y interfaceC0799y) {
        this.alpha = 3;
        this.purple = i4;
        this.red = i5;
        this.silver = new n(new ad(i4, i5, interfaceC0799y));
    }
}
