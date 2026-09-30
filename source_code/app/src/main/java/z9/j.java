package z9;

import android.content.Context;
import android.location.Location;
import com.app.feature.location.store.LastSentLocationStore;
import com.app.network.network.models.ActiveShiftSummary;
import com.app.network.network.models.AttributeGroup;
import com.app.network.network.models.Captain;
import com.app.network.network.models.MissingAttributes;
import com.app.network.network.models.UserInfo;
import com.incognia.EventProperties;
import e3.InterfaceC1627a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j implements InterfaceC1627a {
    public final Context alpha;
    public final LastSentLocationStore bravo;

    public j(Context context, LastSentLocationStore lastSentLocationStore) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(lastSentLocationStore, "lastSentLocationStore");
        this.alpha = context;
        this.bravo = lastSentLocationStore;
    }

    public final void alpha(String str) {
        ArrayList arrayList;
        Context context = this.alpha;
        MissingAttributes oscar = L9.d.oscar(context);
        if (oscar == null) {
            return;
        }
        MissingAttributes missingAttributes = new MissingAttributes();
        List<AttributeGroup> groups = oscar.getGroups();
        if (groups != null) {
            arrayList = new ArrayList();
            for (Object obj : groups) {
                if (!Intrinsics.areEqual(((AttributeGroup) obj).getGroup(), str)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        missingAttributes.setGroups(arrayList);
        List<AttributeGroup> groups2 = missingAttributes.getGroups();
        if (groups2 != null && !groups2.isEmpty()) {
            L9.d.green(context, missingAttributes);
        } else {
            L9.d.foxtrot(context);
        }
    }

    public final void bravo(UserInfo userInfo) {
        Captain captain;
        Integer id2;
        String num;
        Long valueOf;
        Double d4;
        Long shiftId;
        String shiftFinishAt;
        Captain captain2;
        Integer id3;
        String num2;
        Double d9;
        Double d10;
        Intrinsics.echo(userInfo, "userInfo");
        ActiveShiftSummary activeShiftSummary = userInfo.getActiveShiftSummary();
        Double d11 = null;
        LastSentLocationStore lastSentLocationStore = this.bravo;
        Context context = this.alpha;
        if (activeShiftSummary != null && (shiftId = activeShiftSummary.getShiftId()) != null) {
            long longValue = shiftId.longValue();
            String shiftStartAt = activeShiftSummary.getShiftStartAt();
            if (shiftStartAt != null && (shiftFinishAt = activeShiftSummary.getShiftFinishAt()) != null && (captain2 = userInfo.getCaptain()) != null && (id3 = captain2.getId()) != null && (num2 = id3.toString()) != null && L9.d.lima(context) && Intrinsics.areEqual(activeShiftSummary.getShiftStatus(), "CURRENTLY_ACTIVE")) {
                L9.d.gray(context, shiftFinishAt, longValue);
                if (!L9.d.yankee(context, shiftStartAt, longValue)) {
                    L9.d.azure(context, shiftStartAt, longValue);
                    Location location = lastSentLocationStore.get();
                    O9.a aVar = O9.a.alpha;
                    if (location != null) {
                        d9 = Double.valueOf(location.getLatitude());
                    } else {
                        d9 = null;
                    }
                    if (location != null) {
                        d10 = Double.valueOf(location.getLongitude());
                    } else {
                        d10 = null;
                    }
                    String kilo = L9.d.kilo(context);
                    O9.a aVar2 = O9.a.alpha;
                    EventProperties alpha = O9.e.alpha(d9, d10, kilo);
                    alpha.set("shift_id", String.valueOf(longValue));
                    O9.e.delta("shift-start", num2, aVar2, alpha);
                }
            }
        }
        if (userInfo.getActiveShiftSummary() == null && (captain = userInfo.getCaptain()) != null && (id2 = captain.getId()) != null && (num = id2.toString()) != null && L9.d.lima(context)) {
            long j5 = context.getSharedPreferences("incognia_tracker", 0).getLong("incognia_last_shift_id", -1L);
            if (j5 == -1) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(j5);
            }
            if (valueOf != null) {
                long longValue2 = valueOf.longValue();
                String string = context.getSharedPreferences("incognia_tracker", 0).getString("incognia_last_shift_finish_at", null);
                if (string != null && !L9.d.zulu(context, string, longValue2)) {
                    L9.d.amber(context, string, longValue2);
                    L9.d.echo(context);
                    context.getSharedPreferences("incognia_tracker", 0).edit().remove("incognia_last_shift_id").remove("incognia_last_shift_finish_at").apply();
                    Location location2 = lastSentLocationStore.get();
                    O9.a aVar3 = O9.a.alpha;
                    if (location2 != null) {
                        d4 = Double.valueOf(location2.getLatitude());
                    } else {
                        d4 = null;
                    }
                    if (location2 != null) {
                        d11 = Double.valueOf(location2.getLongitude());
                    }
                    String kilo2 = L9.d.kilo(context);
                    O9.a aVar4 = O9.a.alpha;
                    EventProperties alpha2 = O9.e.alpha(d4, d11, kilo2);
                    alpha2.set("shift_id", String.valueOf(longValue2));
                    O9.e.delta("shift-end", num, aVar4, alpha2);
                }
            }
        }
    }
}
