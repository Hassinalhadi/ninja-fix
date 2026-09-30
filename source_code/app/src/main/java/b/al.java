package b;

import a0.C0366t;
import f.InterfaceC1673j;
import s0.InterfaceC2558s;

/* loaded from: classes3.dex */
public final class al extends T.r implements InterfaceC2558s {
    public final InterfaceC1673j alpha;
    public boolean purple;
    public boolean red;
    public boolean silver;

    public al(InterfaceC1673j interfaceC1673j) {
        this.alpha = interfaceC1673j;
    }

    @Override // s0.InterfaceC2558s
    public final /* synthetic */ void blue() {
    }

    @Override // s0.InterfaceC2558s
    public final void jade(s0.an anVar) {
        anVar.charlie();
        boolean z2 = this.purple;
        c0.b bVar = anVar.alpha;
        if (z2) {
            ao.ad.november(anVar, C0366t.bravo(0.3f, C0366t.bravo), 0L, bVar.purple.oscar(), 0.0f, null, 122);
        } else {
            if (!this.red && !this.silver) {
                return;
            }
            ao.ad.november(anVar, C0366t.bravo(0.1f, C0366t.bravo), 0L, bVar.purple.oscar(), 0.0f, null, 122);
        }
    }

    @Override // T.r
    public final void onAttach() {
        vf.ad.zulu(getCoroutineScope(), null, null, new ak(this, null), 3);
    }
}
