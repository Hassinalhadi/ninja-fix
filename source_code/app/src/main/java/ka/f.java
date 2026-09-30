package ka;

import Xd.l;
import androidx.lifecycle.az;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.about.viewmodel.TrophiesCollectionsViewModel;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import vf.ab;
import vf.ad;
import vf.ah;

/* loaded from: classes2.dex */
public final class f extends Pd.i implements l {
    public Ref.ObjectRef alpha;
    public Ref.ObjectRef purple;
    public ah red;
    public List silver;
    public int teal;
    public /* synthetic */ Object white;
    public final /* synthetic */ TrophiesCollectionsViewModel yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TrophiesCollectionsViewModel trophiesCollectionsViewModel, Nd.c cVar) {
        super(2, cVar);
        this.yellow = trophiesCollectionsViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        f fVar = new f(this.yellow, cVar);
        fVar.white = obj;
        return fVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        ah golf;
        Object tango;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        List items;
        Object await;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        ab abVar = (ab) this.white;
        Od.a aVar = Od.a.alpha;
        int i4 = this.teal;
        TrophiesCollectionsViewModel trophiesCollectionsViewModel = this.yellow;
        az azVar = trophiesCollectionsViewModel.bravo;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    List list = this.silver;
                    objectRef3 = this.purple;
                    objectRef4 = this.alpha;
                    ResultKt.alpha(obj);
                    items = list;
                    await = obj;
                    azVar.postValue(new c(false, items, ((DataResponse) await).getItems(), (String) objectRef4.alpha, (String) objectRef3.alpha));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            golf = this.red;
            objectRef2 = this.purple;
            Ref.ObjectRef objectRef5 = this.alpha;
            ResultKt.alpha(obj);
            objectRef = objectRef5;
            tango = obj;
        } else {
            ResultKt.alpha(obj);
            Object value = azVar.getValue();
            Intrinsics.checkNotNull(value);
            c cVar = (c) value;
            List active = cVar.bravo;
            Intrinsics.echo(active, "active");
            List completed = cVar.charlie;
            Intrinsics.echo(completed, "completed");
            azVar.postValue(new c(true, active, completed, cVar.delta, cVar.echo));
            Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
            Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
            ah golf2 = ad.golf(abVar, null, new d(trophiesCollectionsViewModel, objectRef6, null), 3);
            golf = ad.golf(abVar, null, new e(trophiesCollectionsViewModel, objectRef7, null), 3);
            this.white = null;
            this.alpha = objectRef6;
            this.purple = objectRef7;
            this.red = golf;
            this.teal = 1;
            tango = golf2.tango(this);
            if (tango != aVar) {
                objectRef = objectRef6;
                objectRef2 = objectRef7;
            }
            return aVar;
        }
        items = ((DataResponse) tango).getItems();
        this.white = null;
        this.alpha = objectRef;
        this.purple = objectRef2;
        this.red = null;
        this.silver = items;
        this.teal = 2;
        await = golf.await(this);
        if (await != aVar) {
            objectRef3 = objectRef2;
            objectRef4 = objectRef;
            azVar.postValue(new c(false, items, ((DataResponse) await).getItems(), (String) objectRef4.alpha, (String) objectRef3.alpha));
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
