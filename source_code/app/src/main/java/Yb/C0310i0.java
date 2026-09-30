package Yb;

import com.app.network.network.models.OrderTask;
import com.app.network.network.models.TaskStatus;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: Yb.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0310i0 implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ProcessOrderActivityV2 purple;
    public final /* synthetic */ OrderTask red;
    public final /* synthetic */ TaskStatus silver;
    public final /* synthetic */ File teal;

    public /* synthetic */ C0310i0(ProcessOrderActivityV2 processOrderActivityV2, OrderTask orderTask, TaskStatus taskStatus, File file, int i4) {
        this.alpha = i4;
        this.purple = processOrderActivityV2;
        this.red = orderTask;
        this.silver = taskStatus;
        this.teal = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        OrderTask orderTask = this.red;
        switch (this.alpha) {
            case 0:
                File file = this.teal;
                int i4 = ProcessOrderActivityV2.f12378N0;
                ProcessOrderActivityV2 processOrderActivityV2 = this.purple;
                processOrderActivityV2.getClass();
                Integer id2 = orderTask.getId();
                if (id2 != null) {
                    ProcessOrderActivityV2.peach(processOrderActivityV2, id2.intValue(), this.silver, null, null, file, 84);
                }
                return Unit.INSTANCE;
            default:
                File file2 = this.teal;
                int i5 = ProcessOrderActivityV2.f12378N0;
                ProcessOrderActivityV2 processOrderActivityV22 = this.purple;
                processOrderActivityV22.getClass();
                Integer id3 = orderTask.getId();
                if (id3 != null) {
                    ProcessOrderActivityV2.peach(processOrderActivityV22, id3.intValue(), this.silver, null, null, file2, 84);
                }
                return Unit.INSTANCE;
        }
    }
}
