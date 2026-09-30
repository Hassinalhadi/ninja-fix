package kd;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes2.dex */
public final class u extends Pd.c {
    public Object alpha;
    public Object purple;
    public Object red;
    public Object silver;
    public List teal;
    public /* synthetic */ Object white;
    public int yellow;

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.white = obj;
        this.yellow |= RecyclerView.UNDEFINED_DURATION;
        return aa.echo(null, null, null, null, null, null, null, this);
    }
}
