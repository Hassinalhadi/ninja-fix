package androidx.navigation.compose;

import B9.ab;
import R.c;
import S1.b;
import androidx.core.widget.f;
import androidx.lifecycle.P;
import androidx.lifecycle.Y;
import androidx.lifecycle.az;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yf.N;
import yf.at;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/compose/BackStackEntryIdViewModel;", "Landroidx/lifecycle/Y;", "Landroidx/lifecycle/P;", "handle", "<init>", "(Landroidx/lifecycle/P;)V", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BackStackEntryIdViewModel extends Y {
    public final String alpha = "SaveableStateHolder_BackStackEntryKey";
    public final String bravo;
    public f charlie;

    public BackStackEntryIdViewModel(@NotNull P p4) {
        Object obj;
        p4.getClass();
        ab abVar = p4.bravo;
        LinkedHashMap linkedHashMap = (LinkedHashMap) abVar.purple;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) abVar.silver;
        try {
            at atVar = (at) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (atVar == null || (obj = ((N) atVar).getValue()) == null) {
                obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) abVar.red).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = UUID.randomUUID().toString();
            String key = this.alpha;
            Intrinsics.echo(key, "key");
            if (str != null) {
                List list = b.alpha;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((Class) it.next()).isInstance(str)) {
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder("Can't put value with type ");
                Intrinsics.checkNotNull(str);
                sb2.append(str.getClass());
                sb2.append(" into saved state");
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            List list2 = b.alpha;
            Object obj2 = p4.alpha.get(key);
            az azVar = obj2 instanceof az ? (az) obj2 : null;
            if (azVar != null) {
                azVar.setValue(str);
            }
            abVar.lavender(str, key);
        }
        this.bravo = str;
    }

    @Override // androidx.lifecycle.Y
    public final void onCleared() {
        super.onCleared();
        f fVar = this.charlie;
        if (fVar != null) {
            c cVar = (c) ((WeakReference) fVar.purple).get();
            if (cVar != null) {
                cVar.foxtrot(this.bravo);
            }
            f fVar2 = this.charlie;
            if (fVar2 != null) {
                ((WeakReference) fVar2.purple).clear();
                return;
            } else {
                Intrinsics.lima("saveableStateHolderRef");
                throw null;
            }
        }
        Intrinsics.lima("saveableStateHolderRef");
        throw null;
    }
}
