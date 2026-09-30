package X9;

import delivery.samurai.android.AndroidApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import s6.AbstractC2743p6;
import t6.V2;

/* loaded from: classes2.dex */
public abstract class h {
    public static final Regex alpha = new Regex("^[0-9a-fA-F]+$");

    public static byte[] alpha() {
        int collectionSizeOrDefault;
        byte[] byteArray;
        AndroidApp androidApp = AndroidApp.yellow;
        AndroidApp delta = V2.delta();
        AtomicInteger atomicInteger = L9.d.alpha;
        String string = L9.k.golf(delta).getString("hmac_secret", null);
        if (string == null || StringsKt.gray(string)) {
            string = null;
        }
        if (string == null || string.length() != 64 || !alpha.echo(string)) {
            return null;
        }
        ArrayList azure = StringsKt.azure(string);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(azure, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = azure.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC2743p6.alpha(16);
            arrayList.add(Byte.valueOf((byte) Integer.parseInt(str, 16)));
        }
        byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList);
        return byteArray;
    }
}
