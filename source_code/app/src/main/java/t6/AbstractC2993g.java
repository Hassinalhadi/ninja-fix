package t6;

import android.util.LongSparseArray;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import kotlin.jvm.functions.Function1;

/* renamed from: t6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2993g {
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = r4.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r4 = r4.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void alpha(V.d dVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        A0.t tVar;
        A0.s sVar;
        Function1 function1;
        int size = longSparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            long keyAt = longSparseArray.keyAt(i4);
            ViewTranslationResponse lima = E0.f.lima(longSparseArray.get(keyAt));
            if (lima != null && value != null && text != null && (tVar = (A0.t) dVar.delta().bravo((int) keyAt)) != null && (sVar = tVar.alpha) != null) {
                A0.a aVar = (A0.a) A0.v.delta(sVar.delta, A0.j.kilo);
                if (aVar != null && (function1 = (Function1) aVar.bravo) != null) {
                }
            }
        }
    }

    public static void bravo(int i4, Object[] objArr) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (objArr[i5] == null) {
                throw new NullPointerException(ao.ad.zulu(i5, "at index "));
            }
        }
    }
}
