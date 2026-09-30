package Aa;

import androidx.compose.foundation.lazy.layout.af;
import com.app.network.network.response.DataResponse;
import com.clevertap.android.sdk.inapp.customtemplates.TemplateArgument;
import com.clevertap.android.sdk.network.api.DefineTemplatesRequestBodyKt;
import delivery.samurai.android.ui.withdraw.WithdrawDetailActivity;
import i.C1852a;
import i.C1874w;
import j.t;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import r3.C2492a;
import r6.u;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ d(int i4, Object obj, int i5) {
        this.alpha = i5;
        this.purple = i4;
        this.red = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List emptyList;
        List emptyList2;
        Unit jSON$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1;
        Function1 function1 = null;
        int i4 = 0;
        int i5 = 2;
        boolean z2 = true;
        int i10 = this.purple;
        Object obj2 = this.red;
        switch (this.alpha) {
            case 0:
                C2492a c2492a = (C2492a) obj;
                int i11 = c2492a.alpha;
                j jVar = (j) obj2;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            jVar.victor().bronze();
                        }
                    } else {
                        jVar.victor().tango();
                        DataResponse dataResponse = (DataResponse) c2492a.charlie;
                        if (dataResponse == null || (emptyList = dataResponse.getItems()) == null) {
                            emptyList = CollectionsKt.emptyList();
                        }
                        if (dataResponse != null) {
                            jVar.C = dataResponse.getPageCount();
                        }
                        jVar.f38E.alpha(emptyList);
                        if (i10 <= jVar.C) {
                            z2 = false;
                        }
                        jVar.B = z2;
                        jVar.A = false;
                    }
                } else {
                    jVar.victor().tango();
                    String str = c2492a.bravo;
                    if (str == null) {
                        return Unit.INSTANCE;
                    }
                    jVar.black(str);
                    jVar.A = false;
                }
                return Unit.INSTANCE;
            case 1:
                return Boolean.valueOf(((List) obj).addAll(i10, (Collection) obj2));
            case 2:
                String input = (String) obj;
                Intrinsics.echo(input, "input");
                StringBuilder sb2 = new StringBuilder();
                int length = input.length();
                while (i4 < length) {
                    char charAt = input.charAt(i4);
                    if (Character.isDigit(charAt)) {
                        sb2.append(charAt);
                    }
                    i4++;
                }
                ((Function1) obj2).invoke(StringsKt.yellow(i10, sb2.toString()));
                return Unit.INSTANCE;
            case 3:
                C2492a c2492a2 = (C2492a) obj;
                int i12 = c2492a2.alpha;
                Wa.b bVar = (Wa.b) obj2;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            bVar.victor().bronze();
                        }
                    } else {
                        bVar.victor().tango();
                        DataResponse dataResponse2 = (DataResponse) c2492a2.charlie;
                        if (dataResponse2 == null || (emptyList2 = dataResponse2.getItems()) == null) {
                            emptyList2 = CollectionsKt.emptyList();
                        }
                        if (dataResponse2 != null) {
                            bVar.C = dataResponse2.getPageCount();
                        }
                        Va.d dVar = bVar.f2201E;
                        if (dVar != null) {
                            dVar.alpha(emptyList2);
                            if (i10 <= bVar.C) {
                                z2 = false;
                            }
                            bVar.B = z2;
                            bVar.A = false;
                        } else {
                            Intrinsics.lima("adapter");
                            throw null;
                        }
                    }
                } else {
                    bVar.victor().tango();
                    String str2 = c2492a2.bravo;
                    if (str2 == null) {
                        return Unit.INSTANCE;
                    }
                    bVar.black(str2);
                    bVar.A = false;
                }
                return Unit.INSTANCE;
            case 4:
                C2492a c2492a3 = (C2492a) obj;
                int i13 = WithdrawDetailActivity.f12546N;
                int i14 = c2492a3.alpha;
                WithdrawDetailActivity withdrawDetailActivity = (WithdrawDetailActivity) obj2;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            withdrawDetailActivity.bronze();
                        }
                    } else {
                        withdrawDetailActivity.tango();
                        withdrawDetailActivity.gold(i10);
                    }
                } else {
                    withdrawDetailActivity.tango();
                    String str3 = c2492a3.bravo;
                    if (str3 != null) {
                        L9.d.pink(withdrawDetailActivity, str3);
                    }
                }
                return Unit.INSTANCE;
            case 5:
                af afVar = (af) obj;
                C1852a c1852a = ((C1874w) obj2).alpha;
                S.g echo = u.echo();
                if (echo != null) {
                    function1 = echo.echo();
                }
                u.juliet(echo, u.foxtrot(echo), function1);
                int i15 = afVar.alpha;
                if (i15 != -1) {
                    i5 = i15;
                }
                while (i4 < i5) {
                    afVar.alpha(i10 + i4);
                    i4++;
                }
                return Unit.INSTANCE;
            case 6:
                af afVar2 = (af) obj;
                C1852a c1852a2 = ((t) obj2).alpha;
                S.g echo2 = u.echo();
                if (echo2 != null) {
                    function1 = echo2.echo();
                }
                u.juliet(echo2, u.foxtrot(echo2), function1);
                c1852a2.getClass();
                int i16 = afVar2.alpha;
                if (i16 != -1) {
                    i5 = i16;
                }
                while (i4 < i5) {
                    afVar2.alpha(i10 + i4);
                    i4++;
                }
                return Unit.INSTANCE;
            default:
                jSON$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1 = DefineTemplatesRequestBodyKt.toJSON$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1((TemplateArgument) obj2, i10, (JSONObject) obj);
                return jSON$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1;
        }
    }

    public /* synthetic */ d(Object obj, int i4, int i5) {
        this.alpha = i5;
        this.red = obj;
        this.purple = i4;
    }
}
