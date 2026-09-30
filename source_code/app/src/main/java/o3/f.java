package o3;

import Pd.i;
import Xd.m;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f extends i implements m {
    public /* synthetic */ b alpha;
    public /* synthetic */ a purple;

    /* JADX WARN: Type inference failed for: r0v0, types: [Pd.i, o3.f] */
    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? iVar = new i(3, (Nd.c) obj3);
        iVar.alpha = (b) obj;
        iVar.purple = (a) obj2;
        return iVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        b bVar = this.alpha;
        a gnssState = this.purple;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        boolean z2 = bVar.alpha;
        Intrinsics.echo(gnssState, "gnssState");
        String deviceManufacturer = bVar.sierra;
        Intrinsics.echo(deviceManufacturer, "deviceManufacturer");
        return new b(z2, bVar.bravo, bVar.charlie, bVar.delta, bVar.echo, bVar.foxtrot, bVar.golf, bVar.hotel, bVar.india, bVar.juliet, gnssState, bVar.lima, bVar.mike, bVar.november, bVar.oscar, bVar.papa, bVar.quebec, bVar.romeo, deviceManufacturer);
    }
}
