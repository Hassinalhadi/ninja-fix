package ah;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class g extends b {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ h bravo;
    public final /* synthetic */ String charlie;
    public final /* synthetic */ ai.b delta;

    public /* synthetic */ g(h hVar, String str, ai.b bVar, int i4) {
        this.alpha = i4;
        this.bravo = hVar;
        this.charlie = str;
        this.delta = bVar;
    }

    @Override // ah.b
    public final void alpha(Object obj) {
        switch (this.alpha) {
            case 0:
                h hVar = this.bravo;
                LinkedHashMap linkedHashMap = hVar.bravo;
                String str = this.charlie;
                Object obj2 = linkedHashMap.get(str);
                ai.b bVar = this.delta;
                if (obj2 != null) {
                    int intValue = ((Number) obj2).intValue();
                    ArrayList arrayList = hVar.delta;
                    arrayList.add(str);
                    try {
                        hVar.bravo(intValue, bVar, obj);
                        return;
                    } catch (Exception e) {
                        arrayList.remove(str);
                        throw e;
                    }
                }
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            default:
                h hVar2 = this.bravo;
                LinkedHashMap linkedHashMap2 = hVar2.bravo;
                String str2 = this.charlie;
                Object obj3 = linkedHashMap2.get(str2);
                ai.b bVar2 = this.delta;
                if (obj3 != null) {
                    int intValue2 = ((Number) obj3).intValue();
                    ArrayList arrayList2 = hVar2.delta;
                    arrayList2.add(str2);
                    try {
                        hVar2.bravo(intValue2, bVar2, obj);
                        return;
                    } catch (Exception e4) {
                        arrayList2.remove(str2);
                        throw e4;
                    }
                }
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
    }

    @Override // ah.b
    public final void bravo() {
        switch (this.alpha) {
            case 0:
                this.bravo.foxtrot(this.charlie);
                return;
            default:
                this.bravo.foxtrot(this.charlie);
                return;
        }
    }
}
