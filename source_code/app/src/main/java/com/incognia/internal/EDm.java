package com.incognia.internal;

import android.content.Context;
import h9.C1825c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public abstract class EDm {

    /* renamed from: b, reason: collision with root package name */
    public static final String f8595b = (String) wGk.zT.getValue();

    /* renamed from: W, reason: collision with root package name */
    public static final List f8594W = CollectionsKt.listOf(new Cj(), new AL(), new CmI(), new dtP(), new wib(), new H9w(), new qSV(), new sH8(), new VVw(), new Zy(), new iS());

    public static final void W(Context context) {
        List list = f8594W;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((M1) obj).W()) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            M1 m1 = (M1) obj2;
            if (m1.b() > b()) {
                try {
                    m1.b(context);
                } catch (Throwable unused) {
                }
            }
        }
        QHn.sVU.b(f8595b, 8);
    }

    public static void b(Context context) {
        if (8 > b()) {
            List list = f8594W;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((M1) obj).W()) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                M1 m1 = (M1) obj2;
                if (m1.b() > b()) {
                    try {
                        m1.b(context);
                    } catch (Throwable unused) {
                    }
                }
            }
            new pl2(G6.f8761b, true).b(new C1825c(context, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b() {
        Object m206constructorimpl;
        Integer num;
        String string;
        Nk6 nk6 = QHn.sVU;
        String str = f8595b;
        nk6.getClass();
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            string = nk6.f9244b.getString(nk6.f9(str), null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (string != null) {
            String b2 = ICR.b(string);
            if (b2 != null) {
                string = b2;
            }
            Integer tango = kotlin.text.r.tango(string);
            if (tango == null) {
                nk6.b(str);
            }
            m206constructorimpl = Result.m206constructorimpl(tango);
            if (Result.m207exceptionOrNullimpl(m206constructorimpl) == null) {
                obj = m206constructorimpl;
            } else {
                nk6.b(str);
            }
            num = (Integer) obj;
            if (num == null) {
                return num.intValue();
            }
            return 0;
        }
        num = (Integer) obj;
        if (num == null) {
        }
    }
}
