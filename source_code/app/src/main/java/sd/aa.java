package sd;

import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.google.mlkit.vision.barcode.common.Barcode;
import g.C1718a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import n.Y;
import t6.AbstractC3001h2;
import t6.AbstractC3006i2;
import t6.AbstractC3011j2;

/* loaded from: classes2.dex */
public final class aa {
    public static final af kilo = AbstractC3006i2.alpha("http://localhost");
    public String alpha;
    public boolean bravo;
    public int charlie;
    public ac delta;
    public String echo;
    public String foxtrot;
    public String golf;
    public List hotel;
    public y india;
    public C1718a juliet;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [sd.y, java.lang.Object, G3.a] */
    /* JADX WARN: Type inference failed for: r2v4, types: [Gf.a, java.lang.Object] */
    public aa() {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        List<String> pathSegments = CollectionsKt.emptyList();
        w.bravo.getClass();
        Intrinsics.echo(pathSegments, "pathSegments");
        this.alpha = "";
        this.bravo = false;
        this.charlie = 0;
        this.delta = null;
        this.echo = null;
        this.foxtrot = null;
        Set set = AbstractC2850a.alpha;
        Charset charset = kotlin.text.a.alpha;
        Intrinsics.echo(charset, "charset");
        StringBuilder sb2 = new StringBuilder();
        Intrinsics.delta(charset.newEncoder(), "newEncoder(...)");
        AbstractC2850a.golf(new Object(), new Y(14, sb2));
        this.golf = sb2.toString();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(pathSegments, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (String str : pathSegments) {
            Intrinsics.echo(str, "<this>");
            arrayList.add(AbstractC2850a.foxtrot(2, str));
        }
        this.hotel = arrayList;
        ?? aVar = new G3.a(10);
        kotlin.collections.r rVar = kotlin.collections.r.alpha;
        while (rVar.hasNext()) {
            String name = (String) rVar.next();
            Intrinsics.echo(name, "name");
            List<String> emptyList = CollectionsKt.emptyList();
            String echo = AbstractC2850a.echo(name, false);
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(emptyList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (String str2 : emptyList) {
                Intrinsics.echo(str2, "<this>");
                arrayList2.add(AbstractC2850a.echo(str2, true));
            }
            aVar.indigo(echo, arrayList2);
        }
        this.india = aVar;
        this.juliet = new C1718a(27, (Object) aVar);
    }

    public final void alpha() {
        if (this.alpha.length() <= 0 && !Intrinsics.areEqual(charlie().alpha, CTVariableUtils.FILE)) {
            af afVar = kilo;
            this.alpha = afVar.alpha;
            if (this.delta == null) {
                this.delta = afVar.yellow;
            }
            if (this.charlie == 0) {
                delta(afVar.purple);
            }
        }
    }

    public final af bravo() {
        int collectionSizeOrDefault;
        String str;
        alpha();
        ac acVar = this.delta;
        String str2 = this.alpha;
        int i4 = this.charlie;
        List list = this.hotel;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC2850a.charlie((String) it.next()));
        }
        w bravo = AbstractC3011j2.bravo((y) this.juliet.purple);
        String delta = AbstractC2850a.delta(0, 0, 15, this.golf);
        String str3 = this.echo;
        String str4 = null;
        if (str3 != null) {
            str = AbstractC2850a.charlie(str3);
        } else {
            str = null;
        }
        String str5 = this.foxtrot;
        if (str5 != null) {
            str4 = AbstractC2850a.charlie(str5);
        }
        alpha();
        StringBuilder sb2 = new StringBuilder(Barcode.FORMAT_QR_CODE);
        AbstractC3001h2.alpha(this, sb2);
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return new af(acVar, str2, i4, arrayList, bravo, delta, str, str4, sb3);
    }

    public final ac charlie() {
        ac acVar = this.delta;
        if (acVar == null) {
            ac acVar2 = ac.red;
            return ac.red;
        }
        return acVar;
    }

    public final void delta(int i4) {
        if (i4 >= 0 && i4 < 65536) {
            this.charlie = i4;
            return;
        }
        throw new IllegalArgumentException(ao.ad.zulu(i4, "Port must be between 0 and 65535, or 0 if not set. Provided: ").toString());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Barcode.FORMAT_QR_CODE);
        AbstractC3001h2.alpha(this, sb2);
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }
}
