package Xb;

import H9.j;
import H9.k;
import H9.m;
import J2.n;
import Xd.l;
import delivery.samurai.android.ui.orders.note.vm.AllAddressNoteViewModel;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s6.W4;
import vf.ab;

/* loaded from: classes2.dex */
public final class b extends Pd.i implements l {
    public File alpha;
    public int purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ AllAddressNoteViewModel silver;
    public final /* synthetic */ int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, AllAddressNoteViewModel allAddressNoteViewModel, int i4, Nd.c cVar) {
        super(2, cVar);
        this.red = str;
        this.silver = allAddressNoteViewModel;
        this.teal = i4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new b(this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        File sourceFile;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        AllAddressNoteViewModel allAddressNoteViewModel = this.silver;
        if (i4 != 0) {
            if (i4 == 1) {
                sourceFile = this.alpha;
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            File file = new File(this.red);
            System.currentTimeMillis();
            this.alpha = file;
            this.purple = 1;
            Object oscar = ((n) allAddressNoteViewModel.charlie).oscar(file, this);
            if (oscar == aVar) {
                return aVar;
            }
            sourceFile = file;
            obj = oscar;
        }
        m mVar = (m) obj;
        if (mVar instanceof H9.l) {
            long currentTimeMillis = System.currentTimeMillis();
            ThreadLocal threadLocal = I9.c.alpha;
            StringBuilder sb2 = new StringBuilder("address_note_");
            int i5 = this.teal;
            sb2.append(i5);
            String fileLabel = sb2.toString();
            Intrinsics.echo(fileLabel, "fileLabel");
            ThreadLocal threadLocal2 = I9.c.bravo;
            Map map = (Map) threadLocal2.get();
            if (map == null) {
                map = new LinkedHashMap();
                threadLocal2.set(map);
            }
            map.put(fileLabel, Long.valueOf(currentTimeMillis));
            return new Pair(new Integer(i5), ((H9.l) mVar).alpha);
        }
        if (mVar instanceof k) {
            k kVar = (k) mVar;
            j jVar = kVar.alpha;
            if (jVar instanceof H9.a) {
            }
            Intrinsics.echo(sourceFile, "sourceFile");
            throw new Exception(W4.alpha(allAddressNoteViewModel.getApplication(), kVar.alpha));
        }
        throw new NoWhenBranchMatchedException();
    }
}
