package Ub;

import B9.N;
import Sc.p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;

/* loaded from: classes2.dex */
public final class d extends f0 {
    public final N alpha;
    public final f bravo;
    public final /* synthetic */ p charlie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p pVar, N n5) {
        super(n5.red);
        this.charlie = pVar;
        this.alpha = n5;
        f fVar = new f();
        this.bravo = fVar;
        RecyclerView recyclerView = n5.f196j;
        recyclerView.setAdapter(fVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
    }
}
