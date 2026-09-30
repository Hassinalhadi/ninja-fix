package Jb;

import Nf.C0265x;
import android.os.Bundle;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okhttp3.internal.http2.Http2Connection;
import s6.AbstractC2707l6;
import t6.AbstractC2986e2;

/* loaded from: classes2.dex */
public final /* synthetic */ class av implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ av(int i4, int i5, Object obj, Object obj2) {
        this.alpha = i5;
        this.red = obj;
        this.purple = i4;
        this.silver = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit pushRequestLater$lambda$32;
        switch (this.alpha) {
            case 0:
                Y1.r rVar = ((HomeActivityV2) this.red).f12282U;
                if (rVar != null) {
                    rVar.charlie(this.purple, (Bundle) this.silver, AbstractC2986e2.alpha(new aw(0)));
                    return Unit.INSTANCE;
                }
                Intrinsics.lima("navController");
                throw null;
            case 1:
                int i4 = this.purple;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    serialDescriptorArr[i5] = AbstractC2707l6.delta(((String) this.red) + '.' + ((C0265x) this.silver).echo[i5], Lf.l.echo, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
            default:
                pushRequestLater$lambda$32 = Http2Connection.pushRequestLater$lambda$32((Http2Connection) this.red, this.purple, (List) this.silver);
                return pushRequestLater$lambda$32;
        }
    }

    public /* synthetic */ av(int i4, String str, C0265x c0265x) {
        this.alpha = 1;
        this.purple = i4;
        this.red = str;
        this.silver = c0265x;
    }
}
