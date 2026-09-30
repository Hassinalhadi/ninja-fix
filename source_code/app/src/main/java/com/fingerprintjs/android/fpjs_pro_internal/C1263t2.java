package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import android.os.Process;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)V"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.t2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1263t2 extends Lambda implements Function1<SafeWithTimeoutProContext, Unit> {
    public static int silver = 0;
    public static int teal = 0;
    public static int white = 0;
    public static int yellow = 1;
    public final /* synthetic */ pC2922 alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ ArrayList red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1263t2(pC2922 pc2922, int i4, ArrayList arrayList) {
        super(1);
        this.alpha = pc2922;
        this.purple = i4;
        this.red = arrayList;
    }

    public static int component9() {
        int i4 = silver;
        int i5 = i4 % 9178658;
        silver = i4 + 1;
        if (i5 != 0) {
            return teal;
        }
        int myTid = Process.myTid();
        teal = myTid;
        return myTid;
    }

    public final void alpha(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
        Object m206constructorimpl;
        int i4 = white;
        yellow = (((i4 | 19) << 1) - (i4 ^ 19)) % 128;
        pC2922 pc2922 = this.alpha;
        Iterator it = ((getAutofillType) pC2922.charlie(new Object[]{pc2922}, N.alpha(), N.alpha(), -511601479, N.alpha(), 511601479, N.alpha())).charlie().iterator();
        while (it.hasNext()) {
            int i5 = white;
            yellow = ((i5 & 73) + (i5 | 73)) % 128;
            String str = (String) it.next();
            safeWithTimeoutProContext.getClass();
            SafeWithTimeoutProContext.alpha();
            try {
                Result.Companion companion = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl((Location) getAutofillType.delta(new Object[]{(getAutofillType) pC2922.charlie(new Object[]{pc2922}, N.alpha(), N.alpha(), -511601479, N.alpha(), 511601479, N.alpha()), str}, ak.alpha(), 1815590174, ak.alpha(), -1815590172, ak.alpha(), ak.alpha()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            try {
                Object[] objArr = {bk.component5(m206constructorimpl)};
                Object echo = am.echo(-74278770);
                if (echo == null) {
                    echo = am.charlie((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), KeyEvent.keyCodeFromString("") + 52, (ViewConfiguration.getLongPressTimeout() >> 16) + 584, -228503256, "setPivotYN16904", new Class[]{N14263A23323.class});
                }
                C1262t1 alpha = pC2922.alpha(pc2922, (Location) component13.vD14832N6715((N14263A23323) ((Method) echo).invoke(null, objArr), null), str, this.purple);
                SafeWithTimeoutProContext.alpha();
                if (alpha != null) {
                    int i10 = white + 91;
                    yellow = i10 % 128;
                    int i11 = i10 % 2;
                    ArrayList arrayList = this.red;
                    if (i11 == 0) {
                        arrayList.add(alpha);
                        int i12 = 62 / 0;
                    } else {
                        arrayList.add(alpha);
                    }
                    yellow = (white + 61) % 128;
                }
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        int i13 = white;
        int i14 = (i13 & 9) + (i13 | 9);
        yellow = i14 % 128;
        if (i14 % 2 != 0) {
        } else {
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        int i4 = white;
        yellow = ((i4 ^ 75) + ((i4 & 75) << 1)) % 128;
        alpha(safeWithTimeoutProContext);
        Unit unit = Unit.INSTANCE;
        int i5 = yellow + 71;
        white = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
