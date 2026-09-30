package Yb;

import com.app.network.network.models.TaskStatus;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: Yb.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0316l0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f2427a;
    public final /* synthetic */ int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2428b;
    public final /* synthetic */ ProcessOrderActivityV2 purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ TaskStatus silver;
    public final /* synthetic */ String teal;
    public final /* synthetic */ String white;
    public final /* synthetic */ String yellow;

    public /* synthetic */ C0316l0(ProcessOrderActivityV2 processOrderActivityV2, int i4, TaskStatus taskStatus, String str, String str2, String str3, File file, String str4, int i5) {
        this.alpha = i5;
        this.purple = processOrderActivityV2;
        this.red = i4;
        this.silver = taskStatus;
        this.teal = str;
        this.white = str2;
        this.yellow = str3;
        this.f2427a = file;
        this.f2428b = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                int i4 = ProcessOrderActivityV2.f12378N0;
                ProcessOrderActivityV2 processOrderActivityV2 = this.purple;
                if (!processOrderActivityV2.isDestroyed() && !processOrderActivityV2.isFinishing()) {
                    processOrderActivityV2.navy(this.red, this.silver, this.teal, this.white, this.yellow, this.f2427a, this.f2428b);
                }
                return Unit.INSTANCE;
            case 1:
                int i5 = ProcessOrderActivityV2.f12378N0;
                this.purple.orange(this.red, this.silver, this.teal, this.white, this.yellow, this.f2427a, this.f2428b);
                return Unit.INSTANCE;
            case 2:
                int i10 = ProcessOrderActivityV2.f12378N0;
                this.purple.orange(this.red, this.silver, this.teal, this.white, this.yellow, this.f2427a, this.f2428b);
                return Unit.INSTANCE;
            default:
                int i11 = ProcessOrderActivityV2.f12378N0;
                this.purple.orange(this.red, this.silver, this.teal, this.white, this.yellow, this.f2427a, this.f2428b);
                return Unit.INSTANCE;
        }
    }
}
