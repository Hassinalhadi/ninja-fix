package hg;

import av.ao;
import com.google.android.gms.measurement.internal.C1467s;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.koin.core.error.InstanceCreationException;

/* loaded from: classes2.dex */
public abstract class b {
    public final fg.a alpha;

    public b(fg.a aVar) {
        this.alpha = aVar;
    }

    public Object alpha(ao aoVar) {
        StringBuilder sb2 = new StringBuilder("| (+) '");
        fg.a aVar = this.alpha;
        sb2.append(aVar);
        sb2.append('\'');
        String sb3 = sb2.toString();
        C1467s c1467s = (C1467s) aoVar.alpha;
        c1467s.charlie(sb3);
        try {
            kg.a aVar2 = (kg.a) aoVar.teal;
            if (aVar2 == null) {
                aVar2 = new kg.a();
            }
            return aVar.delta.invoke((og.a) aoVar.purple, aVar2);
        } catch (Exception e) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(e);
            sb4.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            Intrinsics.delta(stackTrace, "getStackTrace(...)");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                Intrinsics.delta(className, "getClassName(...)");
                if (StringsKt.beige(className, "sun.reflect", false)) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb4.append(CollectionsKt.maroon(arrayList, "\n\t", null, null, null, 62));
            String msg = "* Instance creation error : could not create instance for '" + aVar + "': " + sb4.toString();
            Intrinsics.echo(msg, "msg");
            c1467s.delta(ig.a.silver, msg);
            throw new InstanceCreationException("Could not create instance for '" + aVar + '\'', e);
        }
    }

    public abstract void bravo();

    public abstract Object charlie(ao aoVar);
}
