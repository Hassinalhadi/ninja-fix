package Sc;

import androidx.compose.runtime.ax;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.text.StringsKt;
import kotlin.text.r;
import vf.ab;
import vf.ad;

/* loaded from: classes2.dex */
public final class i extends Pd.i implements Xd.l {
    public Date alpha;
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ String silver;
    public final /* synthetic */ ax teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, ax axVar, Nd.c cVar) {
        super(2, cVar);
        this.silver = str;
        this.teal = axVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        i iVar = new i(this.silver, this.teal, cVar);
        iVar.red = obj;
        return iVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x00cd -> B:5:0x00d0). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ax axVar;
        Object obj2;
        Date parse;
        int i4 = 1;
        ab abVar = (ab) this.red;
        Od.a aVar = Od.a.alpha;
        int i5 = this.purple;
        Object obj3 = null;
        ax axVar2 = this.teal;
        if (i5 != 0) {
            if (i5 == 1) {
                parse = this.alpha;
                ResultKt.alpha(obj);
                int i10 = 1;
                ab abVar2 = abVar;
                ax axVar3 = axVar2;
                axVar2 = axVar3;
                abVar = abVar2;
                i4 = i10;
                obj3 = null;
                if (ad.xray(abVar)) {
                    Date date = new Date();
                    if (date.after(parse)) {
                        axVar2.setValue(obj3);
                    } else {
                        long time = (parse.getTime() - date.getTime()) / 1000;
                        long j5 = 60;
                        long j6 = time / j5;
                        long j7 = j6 / j5;
                        int i11 = i4;
                        ab abVar3 = abVar;
                        long j10 = 24;
                        ax axVar4 = axVar2;
                        Long valueOf = Long.valueOf((j7 / j10) % 365);
                        Long valueOf2 = Long.valueOf(j7 % j10);
                        Long valueOf3 = Long.valueOf(j6 % j5);
                        Long valueOf4 = Long.valueOf(time % j5);
                        Object[] objArr = new Object[4];
                        objArr[0] = valueOf;
                        objArr[i11] = valueOf2;
                        objArr[2] = valueOf3;
                        objArr[3] = valueOf4;
                        axVar3 = axVar4;
                        axVar3.setValue(String.format("%02d:%02d:%02d:%02d", Arrays.copyOf(objArr, 4)));
                        abVar2 = abVar3;
                        this.red = abVar2;
                        this.alpha = parse;
                        i10 = i11;
                        this.purple = i10;
                        if (ad.november(1000L, this) == aVar) {
                            return aVar;
                        }
                        axVar2 = axVar3;
                        abVar = abVar2;
                        i4 = i10;
                        obj3 = null;
                        if (ad.xray(abVar)) {
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        String str = this.silver;
        if (str != null) {
            if (StringsKt.gray(str)) {
                obj2 = null;
                axVar = axVar2;
            } else {
                parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).parse(r.oscar(str, "Z", "+0000"));
                if (parse == null) {
                    axVar2.setValue(null);
                    return Unit.INSTANCE;
                }
                if (ad.xray(abVar)) {
                }
                return Unit.INSTANCE;
            }
        } else {
            axVar = axVar2;
            obj2 = null;
        }
        axVar.setValue(obj2);
        return Unit.INSTANCE;
    }
}
